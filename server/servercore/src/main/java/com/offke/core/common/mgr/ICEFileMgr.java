package com.offke.core.common.mgr;

import com.offke.core.bu.struct.pojo.ICEFileRecord;
import com.offke.core.common.util.SplusProperties;
import icecomponent.FileInfo;
import icecomponent.SPlusException;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>ice 文件传输服务</p>
 *
 * @version 1.0
 * @since 2012/4/1
 */
public class ICEFileMgr {
    private static final Logger _logger = LoggerFactory.getLogger(ICEFileMgr.class);
    private final static Map<String, ICEFileRecord> rafs = new ConcurrentHashMap<String, ICEFileRecord>();
    private final static String dir = SplusProperties.instance().getConfig("CommunicationFilePath");

    /**
     * <p>获取以及缓存随机文件</p>
     *
     * @param fileInfo 文件信息
     * @return 随机文件
     * @throws SPlusException 如果文件不存在
     */
    public final static RandomAccessFile get(FileInfo fileInfo) throws SPlusException {
        String id = id(fileInfo);
        if (rafs.containsKey(id)) {
            ICEFileRecord fileRecord = rafs.get(id);
            return fileRecord.getRaf();
        }

        String fullpath = path(fileInfo);

        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile(fullpath, "rw");
            ICEFileRecord fr = new ICEFileRecord(raf, fileInfo.position, fileInfo.limit, new Date().getTime());
            rafs.put(id, fr);
        } catch (FileNotFoundException e) {
            _logger.error("FileNotFoundException，", e);
            throw new SPlusException("zl_60002", "文件未找到");
        }

        return raf;
    }

    /**
     * <p>依据文件报文信息，读取信息</p>
     *
     * @param fileInfo
     * @return 返回该段buf
     * @throws SPlusException 发生io异常，抛出该异常
     */
    public static byte[] read(FileInfo fileInfo) throws SPlusException {
        if (fileInfo.position >= fileInfo.size) {
            throw new SPlusException("zl_60001", "文件IO处理异常");
        }

        byte[] buffer;
        if (fileInfo.size - fileInfo.limit > fileInfo.position) {
            buffer = new byte[fileInfo.limit];
        } else {
            buffer = new byte[(int) (fileInfo.size - fileInfo.position)];
        }

        RandomAccessFile file = get(fileInfo);
        try {
            file.seek(fileInfo.position);
            file.read(buffer);
        } catch (IOException e) {
            _logger.error("IOException，", e);
            throw new SPlusException("zl_60003","I/O 错误");
        }

        return buffer;
    }

    /**
     * <p>依据文件报文信息，写文件</p>
     *
     * @param bin 待写入的buf
     * @param fi  文件信息
     * @throws SPlusException 发生io异常，抛出该异常
     */
    public final static void write(byte[] bin, FileInfo fi) throws SPlusException {
        RandomAccessFile file = get(fi);
        try {
            file.seek(file.length());
            file.write(bin);
        } catch (IOException e) {
            _logger.error("IOException，", e);
            throw new SPlusException("zl_60003", "I/O 错误");
        } finally {
            tryClear(fi);
        }

    }

    private static  String id(FileInfo fileInfo) {
        return fileInfo.id;
    }

    public static final String path(FileInfo fileInfo) {
        return dir + "/" + fileInfo.id + "/" + fileInfo.name;
    }

    /* public static final String path( TradeInfo tradeInfo, File file )
    {
        return dir + "/" + tradeInfo.put( TradeConst.traderef  ) + "/" + file.getName( );
    }
    public static final String path( TradeInfo tradeInfo )
    {
        return dir + "/" + tradeInfo.put( TradeConst.traderef  ) + "/" ;
    }*/

    public static void tryClear(FileInfo fileInfo) {
        String id = id(fileInfo);

        if (fileInfo.position + fileInfo.limit >= fileInfo.size) {
            ICEFileRecord remove = rafs.remove(id);
            if (remove != null) {
                IOUtils.closeQuietly(remove.getRaf());
            }
        }
    }

    public static void clear(FileInfo fileInfo) {
        String id = id(fileInfo);
        ICEFileRecord remove = rafs.remove(id);
        if (remove != null) {
            IOUtils.closeQuietly(remove.getRaf());
        }
    }

}
