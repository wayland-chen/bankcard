package com.offke.core.common.mgr;

import com.offke.core.common.util.SplusProperties;
import com.offke.core.standard.interfaces.IPluginmgr;
import com.offke.core.standard.interfaces.IStructmgr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 校园通后台服务
 *
 * @version 1.0
 * @since 2012/5/14
 */
public final class Backservices implements Runnable {
    private static final Logger _logger = LoggerFactory.getLogger(Backservices.class);
    private static Backservices self;

    public final Queue<IPluginmgr> pluginmgrs = new ConcurrentLinkedQueue<IPluginmgr>();
    public final Queue<IStructmgr> structmgrs = new ConcurrentLinkedQueue<IStructmgr>();

    public boolean firstLoad = false;

    private Backservices() {
    }

    /**
     * 实例化对象
     *
     * @return self
     */
    public static Backservices instance() {
        if (self == null) {
            self = new Backservices();
        }
        return self;
    }

    public void run() {
        scheduling();
    }

    /**
     * 调度服务
     */
    public void scheduling() {
        while (true) {
            sehedulingStruct();
            sehedulingPlugin();
            try {
                firstLoad = true;
                Thread.sleep(Integer.valueOf(SplusProperties.getConfig("app.sleeptime")));
            } catch (InterruptedException e) {
            }
        }
    }

    private void sehedulingPlugin() {
        try {
            for (IPluginmgr pluginmgr : pluginmgrs) {
                pluginmgr.update();
            }
        } catch (Throwable t) {
            _logger.error("插件调度服务执行错，", t);
        }

    }

    private void sehedulingStruct() {
        try {
            for (IStructmgr struct : structmgrs) {
                struct.update();
            }
        } catch (Throwable t) {
            _logger.error("数据结构更新服务执行错，", t);
        }
    }
}
