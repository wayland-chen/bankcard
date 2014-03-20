package com.offke.core.common.mgr;

/**
 * <p>配置文件路径</p>
 *
 * @version 1.0
 * @since 2012/3/29
 */
public class SplusConfigPath {

    private static SplusConfigPath self;

    private String configPath;

    private SplusConfigPath() {
    }

    public static SplusConfigPath instance() {
        if (self == null) {
            self = new SplusConfigPath();
        }
        return self;
    }

    /**
     * <p>返回文件配置路径</p>
     *
     * @return 路径
     */
    public String getConfigPath() {
        return configPath;
    }

    /**
     * <p>设置校园通文件配置路径</p>
     *
     * @param configPath 路径
     */
    public void setConfigPath(String configPath) {
        if (self.configPath == null) {
            self.configPath = configPath;
        }
    }
}
