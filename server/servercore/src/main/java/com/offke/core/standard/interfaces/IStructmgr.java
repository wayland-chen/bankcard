package com.offke.core.standard.interfaces;

import java.io.File;


/**
 * 数据结构管理
 *
 * @version 1.0
 * @since 2012/5/12
 */
public interface IStructmgr {
    /**
     * 初时化
     *
     * @param 目录
     * @return 是否成功
     */
    boolean init(File file);

    /**
     * 手动设置路径
     *
     * @param file
     */
    void setPath(File file);

    /**
     * 更新
     *
     * @return 是否成功
     */
    boolean update();

    /**
     * 清除
     *
     * @return 是否成功
     */
    boolean stop();
}
