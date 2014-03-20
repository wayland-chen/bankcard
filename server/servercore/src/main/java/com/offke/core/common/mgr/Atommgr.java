package com.offke.core.common.mgr;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.struct.pojo.AtomInfo;
import com.offke.core.common.util.FileScan;
import com.offke.core.common.util.PUrlClassLoader;
import com.offke.core.common.util.Validate;
import com.offke.core.standard.abstracts.AbstractAtommgr;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 交易插件管理
 *
 * @version 1.0
 * @since 2012/5/14
 */
public final class Atommgr extends AbstractAtommgr {
    private static final Logger _logger = LoggerFactory.getLogger(Atommgr.class);
    private static Atommgr _Atommgr;
    private List<URL> urls = new ArrayList<URL>();

    /**
     * 实例化对象
     *
     * @return self
     */
    public static AbstractAtommgr instance() {
        if (_Atommgr == null) {
            _Atommgr = new Atommgr();
        }

        return _Atommgr;
    }

    private Atommgr() {
    }

    public AtomInfo get(String tradeCode) {
        try {
            return _Atommgr.atomConfigs.get(tradeCode);
        } catch (Exception e) {
            throw new RuntimeException(tradeCode);
        }
    }

    public boolean init(String... paths) {
        try {
            for (String file : paths) {
                _logger.info("交易插件路径[{}]", file);
                try {
                    urls.add(new URL(file));
                } catch (MalformedURLException e) {
                    throw new RuntimeException("zl_99999", e);
                }
            }

            urlClassLoader = new PUrlClassLoader(urls.toArray(new URL[]{}));
            update();
        } finally {
            setFirstload();
        }
        return true;
    }

    public boolean update() {
        for (URL url : urls) {
            File root = new File(url.getPath());
            if (!root.exists()) {
                _logger.error("插件路径【" + root.getPath() + "】不存在");
            } else {
                List<File> files = FileScan.scan(root);
                if (!(files == null || files.isEmpty())) {
                    String className;

                    for (File file : files) {
                        String path = file.getPath();
                        String fileType = path.substring(path.lastIndexOf(".") + 1, path.length());
                        if (!fileType.equalsIgnoreCase("class") /*|| file.getName( ).lastIndexOf( "$" ) != -1 */) {
                            continue;
                        }
                        path = file.getPath().replace(root.getPath(), "");
                        path = path.substring(1, path.length() - 6).replace('\\', '.');
                        className = path.replace("/", ".");
                        boolean isExist;
                        if (!(isExist = clz_atomConfigs.containsKey(className))
                                || hasChanged(file, clz_atomConfigs.get(className).getBeanClass())) {
                            try {
                                Class<?> clz;
                                if (isExist) {
                                    clz = urlClassLoader.load(className, true);
                                } else {
                                    clz = urlClassLoader.load(className);
                                }
                                regClazz(file, clz);
                            } catch (ClassNotFoundException e) {
                                _logger.error("原子交易插件【" + className + "】不存在");
                            } catch (Throwable t) {
                                _logger.error("原子交易插件【" + className + "】异常，", t);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean update(String key) {
        return true;
    }

    /**
     * 注册类
     *
     * @param file 原始文件
     * @param clz  类文件
     */
    private void regClazz(File file, Class<?> clz) {
        Component annotation = clz.getAnnotation(Component.class);

        if (annotation == null) {
            _logger.debug("插件【" + clz.getName() + "】没有配置交易注解");
        } else if (Validate.isEmpty(annotation.tradeCode())) {
            _logger.warn("插件【" + clz.getName() + "】的交易码为空");
        }
       /* else if (  annotation.status( ) == Status.Stop )
        {
            if ( atomConfigs.containsKey(  annotation.tradeCode( )  ) )
            {
                atomConfigs.remove( annotation.tradeCode( ) );
                clz_atomConfigs.remove(clz.getName( ));
                Logs.log( ).info( "插件【" +  annotation.tradeCode( ) +":"+ clz.getName( ) + "】已停止运营" );
            }
            return;
        }*/
        else {
            AtomInfo atom;
            if (atomConfigs.containsKey(annotation.tradeCode())) {
                atom = atomConfigs.get(annotation.tradeCode());
                if (atom == null) {
                    atom = new AtomInfo();
                }
                getAtom(file, clz, annotation, atom);
                atomConfigs.put(atom.getTradeCode(), atom);
                clz_atomConfigs.put(clz.getName(), atom);
                if (setObject(atom)) {
                    _logger.info("更新原子交易【" + atom.getTradeCode() + "：" + atom.getTradeName() + "】成功");
                }
            } else {
                atom = new AtomInfo();
                getAtom(file, clz, annotation, atom);
                atomConfigs.put(atom.getTradeCode(), atom);
                clz_atomConfigs.put(clz.getName(), atom);
                if (setObject(atom)) {
                    _logger.info("注册原子交易【" + atom.getTradeCode() + "：" + atom.getTradeName() + "】成功");
                }
            }


            if (annotation.params() != null) {
                for (Parameter p : annotation.params()) {
                    atom.putInputParameters((p.classify() == null || p.classify().isEmpty()) ? "缺省" : p.classify(), p);
                }
            }
        }
    }

    /**
     * 生成原子交易信息
     *
     * @param file       原始文件
     * @param clz        类文件
     * @param annotation 注解
     * @param atom       原子交易信息
     */
    private void getAtom(File file, Class<?> clz, Component annotation, AtomInfo atom) {
        atom.setTradeCode(annotation.tradeCode().trim());
        atom.setTradeName(annotation.tradeName());
        atom.setBeanClass(clz);
        atom.setStatus(annotation.status());
        atom.setPack(annotation.pack());
        atom.setUnpack(annotation.unpack());
        atom.setCreateDate(annotation.createDate());
        atom.setVersion(annotation.version());
        atom.setViewconfig(annotation.viewconfig());
        atom.setComment(annotation.comment());
        atom.setDate(new Date());
        atom.setAuthor(annotation.author());
        atom.setFeeflag(annotation.feeflag());
        atom.setTransflag(annotation.transflag());
        atom.setLimitflag(annotation.limitflag());
        atom.setSingleton(annotation.singleton());
        atom.setInternal(annotation.internal());
        atom.setMdate(com.offke.core.common.util.FileUtils.filelastModifiedToDate(file));//修改时间
    }

    private boolean setObject(AtomInfo plugin) {
        if (plugin.isSingleton()) {
            try {
                Object newInstance = plugin.getBeanClass().newInstance();
                plugin.setObject(newInstance);
            } catch (NoClassDefFoundError e) {
                try {
                    urlClassLoader.reload(plugin.getBeanClass().getName(), true);
                    Object newInstance = plugin.getBeanClass().newInstance();
                    plugin.setObject(newInstance);
                } catch (Throwable t) {
                    _logger.error("激活插件【" + plugin.getTradeCode() + "：" + plugin.getTradeName() + "】失败", t);
                    return false;
                }
            } catch (Throwable t) {
                _logger.error("激活插件【" + plugin.getTradeCode() + "：" + plugin.getTradeName() + "】失败", t);
                return false;
            }
        }

        return true;
    }

    /**
     * 调用反射来调用原子交易
     *
     * @param object    原子交易对象
     * @param tradeInfo 过程数据
     * @return 是否成功
     */
    public static boolean atomicTransaction(Object object, TradeInfo tradeInfo) {
        try {
            Method method = object.getClass().getMethod("atomicTransaction", TradeInfo.class);
            return (Boolean) method.invoke(object, tradeInfo);
        } catch (Exception e) {
            throw new RuntimeException("调用原子交易错", e);
        }
    }
}
