package com.offke.core.common.util;

import com.offke.core.common.mgr.SplusConfigPath;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * <p>splus的属性单例模式</p>
 *
 * @since 2012/4/20
 */
public class SplusProperties {
    private static SplusProperties properties;
    private Properties fieldsCN;
    private Properties config;

    private boolean cluster;

    public static SplusProperties instance() {
        if (properties == null) {
            properties = new SplusProperties();
        }

        return properties;
    }

    public void init() throws IOException {
        initFieldcn();
        initConfig();
    }

    private void initFieldcn() throws FileNotFoundException, IOException {
        String path = SplusConfigPath.instance().getConfigPath() + "/fields_zh_CN.properties";
        FileInputStream is = null;
        is = new FileInputStream(new File(path));
        fieldsCN = new Properties();
        fieldsCN.load(is);
        IOUtils.closeQuietly(is);
    }

    private void initConfig() throws FileNotFoundException, IOException {
        String path = SplusConfigPath.instance().getConfigPath() + "/config.properties";
        FileInputStream is = null;
        is = new FileInputStream(new File(path));
        config = new Properties();
        config.load(is);

        IOUtils.closeQuietly(is);

        String scluster = config.getProperty("app.cluster");
        cluster = scluster != null && (Integer.valueOf(scluster) == 1);
    }

    public Properties getFieldsCN() {
        return fieldsCN;
    }

    public String getFieldCn(String key) {
        return this.fieldsCN.getProperty(key);
    }

    public static String getConfig(String key) {
        return properties.config.getProperty(key);
    }

    public static Properties getConfig() {
        return properties.config;
    }

    public static boolean isCluster() {
        return properties.cluster;
    }

    /**
     * 获取实时配置
     *
     * @param key 键
     * @return 结果
     * @throws IOException
     */
    public static String getReal(String key) throws IOException {
        String path = SplusConfigPath.instance().getConfigPath() + "/config.properties";
        FileInputStream is = new FileInputStream(new File(path));
        Properties tmp = new Properties();
        tmp.load(is);
        IOUtils.closeQuietly(is);
        return tmp.getProperty(key);
    }
}
