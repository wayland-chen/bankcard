package com.offke.core.bus.auth.session;

import com.offke.core.AppConst;
import com.offke.core.bus.mix.IServicemix;
import com.offke.core.common.util.SessionUtil;
import com.offke.core.status.procedure.TradeInfo;
import org.hibernate.SessionFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.TimerTask;

/**
 * 会话池管理
 * <p/>
 *
 * @version 1.0
 * @since 2012/06/17
 */
public class Sessionpool extends TimerTask implements IServicemix {
    private SessionFactory sessionFactory;
    private DataSource dataSource;

    @Override
    public boolean mix(TradeInfo tradeInfo) {
        tradeInfo.setOperCode("001");//先固定，后期实现
        if (tradeInfo.getSrc() != null && tradeInfo.getSrc().equals(AppConst.AppCenter)) {
            //TODO
        }
        return true;
    }

    @Override
    public void run() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
        } finally {
            SessionUtil.close(connection);
        }
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
