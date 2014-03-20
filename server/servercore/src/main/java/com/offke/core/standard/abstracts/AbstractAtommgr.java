package com.offke.core.standard.abstracts;

import com.offke.core.bu.struct.pojo.AtomInfo;
import com.offke.core.common.util.FileUtils;
import com.offke.core.common.util.PUrlClassLoader;
import com.offke.core.standard.interfaces.IPluginmgr;

import java.io.File;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 插件管理基础框架
 *
 * @version 1.0
 * @since 2012/5/13
 */
public abstract class AbstractAtommgr implements IPluginmgr {
    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = null;
    private boolean firstload = false;

    protected File[] files;
    protected PUrlClassLoader urlClassLoader;

    protected Map<String, AtomInfo> atomConfigs = new ConcurrentHashMap<String, AtomInfo>();
    protected Map<String, AtomInfo> clz_atomConfigs = new ConcurrentHashMap<String, AtomInfo>();

    public AtomInfo get(String key) {
        if (!firstload) {
            lock.lock();
            try {
                if (!firstload && newCondition == null) {
                    newCondition = lock.newCondition();
                    try {
                        newCondition.await();
                    } catch (InterruptedException e) {
                    }
                }
            } finally {
                lock.unlock();
            }
        }
        return atomConfigs.get(key);
    }

    /**
     * 获取插件，激活的对象
     *
     * @param key 交易码
     * @return 对象
     * @throws Exception
     */
    public <T> T getPlugin(String key) throws Exception {
        AtomInfo info = get(key);
        if (info == null) {
            throw new RuntimeException(key);
        }
        Object object = info.getObject();

        return (T) object;
    }


    /**
     * 消除
     *
     * @param key 交易码
     */
    public void stop(String key) {
        this.atomConfigs.remove(key);
        this.clz_atomConfigs.remove(key);
    }

    public void stop() {
        this.atomConfigs.clear();
    }

    protected boolean hasChanged(File f, Class<?> c) {
        boolean isChanged = false;
        AtomInfo plugin = this.clz_atomConfigs.get(c.getName());
        if (f.exists() && plugin != null) {
            Date newDate = FileUtils.filelastModifiedToDate(f);
            isChanged = plugin.getMdate().compareTo(newDate) < 0;
            if (isChanged) {
                plugin.setMdate(newDate);
            }
        }
        return isChanged;
    }

    public void setFirstload() {
        lock.lock();
        try {
            this.firstload = true;
            if (newCondition != null) {
                newCondition.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    public Map<String, AtomInfo> getAtomConfigs() {
        return atomConfigs;
    }
}
