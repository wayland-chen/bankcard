package com.offke.core.common.util;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>获取文件列表</p>
 *
 * @version 1.0
 * @since 2012/4/2
 */
public class FileScan {

    public static List<File> scan(File root) {
        List<File> fileInfo = new ArrayList<File>();

        File[] files = root.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory() && pathname.isHidden()) { // 去掉隐藏文件夹
                    return false;
                }

                if (pathname.isFile() && pathname.isHidden()) {// 去掉隐藏文件
                    return false;
                }
                return true;
            }
        });

        if (files == null) {
            return fileInfo;
        }

        for (File file : files) {// 逐个遍历文件
            if (file.isDirectory()) { // 如果是文件夹，则进一步遍历，属于递归算法
                List<File> ff = scan(file);
                fileInfo.addAll(ff);
            } else {
                fileInfo.add(file); // 如果不是文件夹，则添加入文件列表
            }
        }

        return fileInfo;
    }
}