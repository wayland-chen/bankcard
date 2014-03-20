package com.offke.core.common.util;

import com.offke.core.common.mgr.BeanProxy;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * <p>数据库Session管理</p>
 *
 * @version 1.0
 * @since 2012/4/2
 */
public class SessionUtil {
    private static final Logger _logger = LoggerFactory.getLogger(SessionUtil.class);
    private static SessionFactory sessionFactory;
    private static DataSource dataSource;

    public static void begin(Session session) {
        if (!session.getTransaction().isActive()) {
            session.getTransaction().begin();
        }
    }

    public static void commit(Session session) {
        session.getTransaction().commit();
    }

    public static void rollback(Session session) {
        try {
            session.getTransaction().rollback();
        } catch (HibernateException e) {
            _logger.error("HibernateException,{} ", e);
        }
    }

    public static void closeSession(Session session) {
        try {
            if (session != null) {
                session.close();
            }
        } catch (HibernateException e) {
            _logger.error("HibernateException,{} ", e);
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                _logger.error("SQLException,{} ", e);
            }
        }
    }

    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                _logger.error("SQLException,{} ", e);
            }
        }
    }

    /**
     * 获取SessionFactory
     *
     * @return SessionFactory
     */
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = BeanProxy.lookupBean(SessionFactory.class);
        }
        return sessionFactory;
    }

    /**
     * 获取数据源
     *
     * @return DataSource
     */
    public static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = BeanProxy.lookupBean(DataSource.class);
        }

        return dataSource;
    }

    public static void close(Connection connection) {

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                _logger.error("SQLException,{} ", e);
            }
        }

    }

    public static void rollback(Connection connection) {
        if (connection != null) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                _logger.error("SQLException,{} ", e);
            }
        }
    }

}
