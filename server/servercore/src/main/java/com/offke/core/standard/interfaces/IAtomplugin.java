package com.offke.core.standard.interfaces;

/**
 * 核心交易系统插件引擎接口
 *
 * @version 1.0
 * @since 2012/5/11
 */
public interface IAtomplugin extends IAtom {
    /**
     * 初时化
     *
     * @return 是否成功
     */
    boolean init();

    /**
     * 消除
     *
     * @return 是否成功
     */
    boolean stop();
}
