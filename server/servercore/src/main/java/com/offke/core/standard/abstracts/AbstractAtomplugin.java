package com.offke.core.standard.abstracts;

import com.offke.core.standard.interfaces.IAtomplugin;

/**
 * 核心交易系统插件引擎接口
 *
 * @version 1.0
 * @since 2012/5/13
 */
public abstract class AbstractAtomplugin implements IAtomplugin {

    public boolean init() {
        return true;
    }

    public boolean stop() {
        return true;
    }

}
