package com.offke.core.communication.ice;

import Ice.ConnectionInfo;
import Ice.Current;
import Ice.FileException;
import Ice.IPConnectionInfo;
import com.offke.core.AppConst;
import com.offke.core.bu.struct.pojo.Conninfo;
import com.offke.core.bus.mix.IServicemix;
import com.offke.core.common.mgr.BeanProxy;
import com.offke.core.common.mgr.ICEFileMgr;
import com.offke.core.common.util.Iceutils;
import com.offke.core.common.util.Ids;
import com.offke.core.common.util.JsonUtil;
import com.offke.core.common.util.SplusProperties;
import com.offke.core.status.procedure.TradeInfo;
import icecomponent.FileInfo;
import icecomponent.SPlusException;
import icecomponent.TradeBuffer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiceAdapter {
    private static final Logger _logger = LoggerFactory.getLogger(ServiceAdapter.class);

    private static IServicemix serviceMix = BeanProxy.lookupBean("serviceMixBean");

    public static TradeBuffer atom(TradeInfo tradeInfo, TradeBuffer tb, Current __current)
            throws SPlusException {
        long lrl_beginTime = System.currentTimeMillis(), lrl_endTime;
        TradeBuffer retTb = new TradeBuffer();
        boolean isException = false;

        try {
            if (tb == null) {
                throw new RuntimeException("zl_90000");
            }
            Conninfo address;
            ConnectionInfo info = __current.con.getInfo();
            if (info != null && info instanceof IPConnectionInfo) {
                address = Iceutils.getAddress((IPConnectionInfo) info);
            } else {
                address = Iceutils.getAddress(__current.con._toString());
            }
            tradeInfo.setConninfo(address);
            _logger.info("tradecode[{}] Begin  remoteIP[{}]:[{}]", tb.tradecode, address.getRemoteIp(), address.getRemotePort());
            _logger.info("receive={}", tb.msg);
            if (tb.tradecode == null || tb.tradecode.isEmpty()) {
                throw new RuntimeException("trade code is null");
            }

            if (tb.msg == null || tb.msg.isEmpty()) {
                throw new RuntimeException(tb.tradecode);
            }

            tradeInfo.tradeCode(tb.tradecode);
            tradeInfo.get(AppConst.tradecode, tb.tradecode);
            tradeInfo.rMsg(tb.msg);

            /*
            * 检查文件
            */
            if (tb.fis != null && tb.fis.length > 0) {
                for (FileInfo fi : tb.fis) {
                    String filepath = ICEFileMgr.path(fi);
                    File file = new File(filepath);
                    if (file.exists()) {
                        ICEFileMgr.clear(fi);
                        tradeInfo.get(fi.name, file);
                    } else {
                        throw new RuntimeException("file not exists!");
                    }
                }
            }

            serviceMix.mix(tradeInfo);
            retTb.tradecode = tradeInfo.tradeCode();
            retTb.msg = tradeInfo.sMsg();
            if (tradeInfo.getIputs() != null && !tradeInfo.getIputs().isEmpty()) {
                List<FileInfo> infos = new ArrayList<FileInfo>();
                FileInfo fileInfo;
                for (Map.Entry<String, Object> entry : tradeInfo.getIputs().entrySet()) {
                    if (entry.getValue() instanceof File) {
                        fileInfo = new FileInfo();
                        fileInfo.id = Ids.getUUID();
                        fileInfo.name = ((File) entry.getValue()).getName();
                        fileInfo.size = ((File) entry.getValue()).length();
                        fileInfo.position = 0;
                        fileInfo.limit =
                                Integer.valueOf(SplusProperties.getConfig("CommunicationFileLimit").trim());
                        infos.add(fileInfo);

                        String path = ICEFileMgr.path(fileInfo);
                        File file = new File(path);
                        if (!file.exists()) {
                            FileUtils.copyFile((File) entry.getValue(), file);
                        }
                        _logger.info("交易码[{}],交易编号[{}],文件名[{}],文件大小[{}]", tradeInfo.tradeCode(),
                                fileInfo.id, fileInfo.name, fileInfo.size);
                    }
                }

                if (!infos.isEmpty()) {
                    retTb.fis = infos.toArray(new FileInfo[0]);
                }
            }
        } catch (RuntimeException e) {
            isException = true;
            _logger.error("App Warn，", e);
            throw new SPlusException(e.getMessage(), e.getLocalizedMessage());
        } catch (Throwable e) {
            isException = true;
            _logger.error("Exception，{}", e);
            throw new SPlusException("99998", e.getMessage());
        } finally {
            lrl_endTime = System.currentTimeMillis();
            if (isException) {
                retTb.msg = JsonUtil.map2sjson(tradeInfo.puts());
            }

            _logger.debug("tradecode=[{}],处理时间[{}],回执报文[{}] ", tb.tradecode, lrl_endTime - lrl_beginTime, retTb.msg);

            tradeInfo = null;
        }

        return retTb;
    }

    public static byte[] read(FileInfo fi, Current __current)
            throws SPlusException {
        byte[] read = null;
        try {
            read = ICEFileMgr.read(fi);
        } finally {
            ICEFileMgr.tryClear(fi);
        }

        return read;
    }

    public static void write(byte[] bin, FileInfo fi, Current __current)
            throws SPlusException {
        try {
            String path = ICEFileMgr.path(fi);
            File file = new File(path);
            if (!file.exists()) {
                try {
                    FileUtils.touch(file);
                } catch (IOException e) {
                    _logger.error("IOException，", e);
                    throw new FileException();
                }
            }

            ICEFileMgr.write(bin, fi);
        } finally {
            ICEFileMgr.tryClear(fi);
        }
    }

    public static String getId(Current __current) {
        return Ids.getUUID();
    }
}
