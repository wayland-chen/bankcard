package com.offke.core.common.util;

import java.io.File;
import java.util.Date;

/**
 * 文件工具类
 *
 * @version 1.0
 * @since 2012/5/15
 */
public class FileUtils {
    /**
     * 获取文件名(不带路径、扩展名)
     *
     * @param file 文件
     * @return 文件名
     */
    public static String getFileName(File file) {
        String name = file.getName();
        int index = name.lastIndexOf(".");
        if (index != -1) {
            name = name.substring(0, index);
        }
        return name;
    }

    /**
     * 检查目标文件的是否更新
     *
     * @param srcFile 源文件
     * @param oldDate 缓存日期
     * @return 是否更新
     */
    public static boolean hasChanged(File srcFile, Date oldDate) {
        if (srcFile != null && oldDate != null && srcFile.exists()) {
            Date newDate = new Date(srcFile.lastModified());
            if (oldDate.compareTo(newDate) < 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取文件最后修改时间
     *
     * @param file 文件
     * @return Date
     */
    public static Date filelastModifiedToDate(File file) {
        return new Date(file.lastModified());
    }
}
