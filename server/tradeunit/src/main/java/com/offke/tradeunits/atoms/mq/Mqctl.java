package com.offke.tradeunits.atoms.mq;

import com.offke.core.AppConst;
import com.offke.core.annotation.stereotype.Component;
import com.offke.core.bu.exception.RBaseCode;
import com.offke.core.common.mgr.Atommgr;
import com.offke.core.common.mgr.Backservices;
import com.offke.core.common.util.SessionUtil;
import com.offke.core.common.util.SplusProperties;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.standard.interfaces.IAtomplugin;
import com.offke.core.standard.interfaces.IStructmgr;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component(
        tradeCode = "10010001",
        tradeName = "消息队列调度",
        author = "jiangli",
        createDate = "2012/05/21",
        singleton = true,
        internal = true
)
public class Mqctl implements IAtomplugin, IStructmgr {
    private static final Logger _logger = LoggerFactory.getLogger(Mqctl.class);
    private ExecutorService executorService = null;
    private static Connection connection;
    private int down2aipscount = Integer.valueOf(SplusProperties.getConfig(AppConst.Down2aipscount));

    @Override
    public synchronized boolean atomicTransaction(TradeInfo tradeInfo) {

        Statement statement = null;
        ResultSet rs = null;
        try {
            getConnection().setAutoCommit(false);
            statement = getConnection().createStatement();

            rs = statement.executeQuery("SELECT * FROM T_BMSG  order by  msgid asc,  status asc, msglevel desc, sendcnt asc");
            int i = 0;
            while (rs.next() && (!SplusProperties.isCluster() || i++ < down2aipscount * 5)) {
                TradeInfo otradeInfo = new TradeInfo();
                otradeInfo.get("msgid", rs.getInt("msgid"));
                IAtom down = Atommgr.instance().getPlugin("10010002");
                down.atomicTransaction(otradeInfo);
                executorService.execute((Runnable) down);
            }
            connection.commit();
        } catch (SQLException e) {
            SessionUtil.rollback(connection);
            SessionUtil.close(connection);
            _logger.error("SQLException", e);
        } catch (Throwable e) {
            SessionUtil.rollback(connection);
            _logger.error("Exception", e);
        } finally {
            SessionUtil.closeResultSet(rs);
            SessionUtil.closeStatement(statement);
            SessionUtil.closeStatement(statement);
        }

        return true;
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = SessionUtil.getDataSource().getConnection();
        }
        return connection;
    }

    @Override
    public boolean init() {
        Backservices.instance().structmgrs.add(this);

        Integer count;

        try {
            count = down2aipscount;
        } catch (NumberFormatException e) {
            count = 5;
        }

        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * count);

        return true;
    }

    @Override
    public boolean stop() {
        SessionUtil.close(connection);
        Backservices.instance().structmgrs.remove(this);
        executorService.shutdown();
        return true;
    }

    @Override
    public boolean init(File file) {
        return true;
    }

    @Override
    public void setPath(File file) {
    }

    @Override
    public boolean update() {
        this.atomicTransaction(null);
        return true;
    }
}