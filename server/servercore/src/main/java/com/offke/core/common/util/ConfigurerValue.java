package com.offke.core.common.util;

import com.offke.core.common.mgr.SplusConfigPath;

/**
 * <p>spring 取配置文件路径</p>
 *
 * @version 1.0
 * @since 2012/4/3
 */
public class ConfigurerValue extends java.util.LinkedList<String> {
    public ConfigurerValue() {
        String location = SplusConfigPath.instance().getConfigPath() + "/config.properties";
        ;
        this.add(location);
    }
}
