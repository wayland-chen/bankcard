package com.offke.core.standard.interfaces;

import com.offke.core.bu.struct.pojo.AtomInfo;

/**
 * 插件初时化、获取、独立消除、全部消除
 *
 * @version 1.0
 * @since 2012/5/13
 */
public interface IPluginmgr {
    /**
     * 初时化
     *
     * @param processus
     * @return 是否成功
     */
    boolean init(String... paths);

    /**
     * 运行插件
     *
     * @param id
     * @return class
     */
    AtomInfo get(String key);

    /**
     * 消除插件
     *
     * @param id 编号
     */
    void stop(String key);

    /**
     * 消除插件
     */
    void stop();

    /**
     * 更新
     *
     * @return 是否成功
     */
    boolean update();

    /**
     * 指定更新
     *
     * @param key 键值
     * @return 是否成功
     */
    boolean update(String key);
}
