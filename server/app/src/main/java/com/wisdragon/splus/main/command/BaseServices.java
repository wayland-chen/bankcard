package com.wisdragon.splus.main.command;

import com.offke.core.common.mgr.Atommgr;
import com.offke.core.common.mgr.BeanProxy;
import com.offke.core.common.util.DBFields;
import com.offke.core.common.util.SessionUtil;
import com.offke.core.common.util.SplusProperties;
import com.offke.core.common.util.TradeUtils;
import com.offke.core.standard.interfaces.ICommand;
import com.offke.core.status.procedure.TradeInfo;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>初时化交易配置信息</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class BaseServices implements ICommand {
    private static final Logger _logger = LoggerFactory.getLogger(BaseServices.class);

    @Override
    public boolean execute(TradeInfo tradeInfo) throws Exception {
        _logger.info("Begin BaseServices........");
        
        /*
         * 属性管理
         */
        SplusProperties.instance().init();
        
        /*
         * 原子交易插件体系初时化
         */
        Atommgr.instance().init(SplusProperties.getConfig("app.pluginClasspath"));
        
        /*
         * 字段属性
         */
        DBFields.instance().init();
        
        /*
         * 主键生成工厂
         */

        
        /*
         * 安全工厂
         */
//        SecurityFactory.instance( ).init( ); 
        
        /*
         * 主键单例模式
         */
        //SysKey.instance();

        /*
         * 系统参数
         */
        //initSyspara();

        /*
         * 调度服务
         */
        /*
        Backservices.instance().pluginmgrs.add(Atommgr.instance());
        Thread thread = new Thread(Backservices.instance());
        thread.setName(RFrame.Thread_scheduling);
        thread.setDaemon(true);
        thread.start();
        */

        //End系统参数

        _logger.info("Success BaseServices...");
        return true;
    }

    /**
     * 初时化系统参数
     */
    private void initSyspara() {
        _logger.info("Begin 初时化系统参数......");
        Session session = null;
        try {
            SessionFactory sessionFactory = BeanProxy.lookupBean(SessionFactory.class);
            session = sessionFactory.openSession();
            session.beginTransaction();
            //TradeUtils.getCardVerNo(session);
            //TradeUtils.loadCfgSplit(session);
            //TradeUtils.loadDynCfg(session);
            //TradeUtils.loadSysPara(session);
        } finally {
            session.getTransaction().commit();
            SessionUtil.closeSession(session);
        }
        _logger.info("Success  初时化系统参数.");
    }

    @Override
    public void stop() {
    }
}
