package com.offke.core.dao;

import com.offke.core.common.mgr.BeanProxy;
import com.offke.core.common.util.SessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.ReentrantLock;

public class SysKey {
    private static final Logger _logger = LoggerFactory.getLogger(SysKey.class);
    private ReentrantLock lock = new ReentrantLock();
    private Connection connection = null;
    private static SysKey sysKey;

    public static SysKey instance() {
        if (sysKey == null) {
            sysKey = new SysKey();
        }
        return sysKey;
    }

    public Long get(String classly) {
        Statement statement = null;
        ResultSet rs = null;
        lock.lock();
        Long key = null;
        try {
            getConnection().setAutoCommit(false);
            statement = getConnection().createStatement();
            rs = statement.executeQuery("select keyval from t_syskey where keycode='" + classly + "' for update");
            if (rs.next()) {
                key = rs.getLong(1) + 1;
                statement.executeUpdate("update t_syskey set keyval=" + key + " where keycode='" + classly + "'");
            } else {
                throw new RuntimeException(classly);
            }

            connection.commit();
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
            }
            _logger.error("生成主键错，", e);
        } finally {
            SessionUtil.closeResultSet(rs);
            SessionUtil.closeStatement(statement);
            lock.unlock();
        }
        return key;
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            lock.lock();
            try {
                if (connection == null || connection.isClosed()) {
                    DataSource ds = BeanProxy.lookupBean(DataSource.class);
                    connection = ds.getConnection();
                }

            } finally {
                lock.unlock();
            }
        }
        return connection;
    }

}
