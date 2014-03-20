package com.wisdragon.splus.main;

import com.offke.core.AppConst;
import com.offke.core.common.mgr.BeanProxy;
import com.offke.core.common.mgr.SplusConfigPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain {
    private static final Logger _logger = LoggerFactory.getLogger(AppMain.class);

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.err.println("配置文件的路径为空！");
            return;
        }

        SplusConfigPath.instance().setConfigPath(args[0]);
        _logger.info("ConfigPath【{}】", SplusConfigPath.instance().getConfigPath());

        _logger.info("Begin wisdragon schoolplus");

        ApplicationContext lro_ac = new FileSystemXmlApplicationContext(SplusConfigPath.instance().getConfigPath() + "/applicationContext.xml");
        BeanProxy.instance(lro_ac);


        try {
            Commands.start();
        } catch (Exception e) {
            _logger.error("Exception，", e);
            Commands.stop();
            System.exit(AppConst.SysExitException);
        }
        _logger.info("Success wisdragon schoolplus");

    }

}
