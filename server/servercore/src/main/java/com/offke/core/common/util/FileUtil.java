package com.offke.core.common.util;

import com.offke.core.status.procedure.TradeInfo;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * <p>文件处理</p>
 *
 * @version 1.0
 * @since 2012/04/12
 */
public class FileUtil {
    private final static String dir = SplusProperties.instance().getConfig("CommunicationFilePath");

    /**
     * <p>获取空文件路径<p>
     *
     * @param tradeInfo 交易信息
     * @param filename  文件名称
     * @return File
     * @throws IOException
     */
    public static File getPath(TradeInfo tradeInfo, String filename) throws IOException {
        File file = new File(dir + "/" + tradeInfo.getTradeid() + "/" + filename);
        FileUtils.touch(file);
        return file;
    }

}
