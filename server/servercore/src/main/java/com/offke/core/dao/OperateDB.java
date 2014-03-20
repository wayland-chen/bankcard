package com.offke.core.dao;

import com.offke.core.common.util.DBParameter;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * <p>使用数据库操作类</p>
 *
 * @version 1.0
 * @since 2012/04/12
 */
public class OperateDB {
    /**
     * <p>依据id查询到实体bean</p>
     *
     * @param session 数据库session对象
     * @param clazz   实体Bean class
     * @param id      编号
     * @return 实体Bean
     */
    public static <T> T get(Session session, Class<?> clazz, Serializable id) {
        Object object = session.get(clazz, id);
        if (object == null) {
            return null;
        } else {
            return (T) object;
        }
    }

    /**
     * <p>依据id查询到实体bean，加锁</p>
     *
     * @param session  数据库session对象
     * @param clazz    实体Bean class
     * @param id       编号
     * @param lockMode 锁
     * @return 实体Bean
     */
    public static <T> T get(Session session, Class<?> clazz, Serializable id, LockMode lockMode) {
        return (T) session.get(clazz, id, lockMode);
    }

    /**
     * <p>依据id查询到实体bean</p>
     *
     * @param session 数据库session对象
     * @param clazz   实体Bean class
     * @param id      编号
     * @return 实体Bean
     */
    public static <T> T load(Session session, Class<?> clazz, Serializable id) {
        Object object = session.load(clazz, id);
        if (object == null) {
            return null;
        } else {
            return (T) object;
        }
    }

    /**
     * <p>依据id查询到实体bean</p>
     *
     * @param session 数据库session对象
     * @param clazz   实体Bean class
     * @param id      编号
     * @return 实体Bean
     */
    public static <T> T load(Session session, Class<?> clazz, Serializable id, LockMode lockMode) {
        Object object = session.load(clazz, id, lockMode);
        if (object == null) {
            return null;
        } else {
            return (T) object;
        }
    }


    /**
     * <p>获取整个表数据</p>
     *
     * @param session 数据库session对象
     * @param clazz   实体Bean class
     * @return 结果集
     */
    public static List<?> getAll(Session session, Class<?> clazz) {
        return session.createQuery("from " + clazz.getName()).list();
    }

    /**
     * <p>依据实体bean，保存对象入库</p>
     *
     * @param session   数据库session对象
     * @param entityObj 实体bean
     * @return 返回入库成功的实体bean
     */
    public static Serializable save(Session session, Object entityObj) {
        java.io.Serializable serializable = session.save(entityObj);
        return serializable;
    }

    /**
     * <p>依据sql，保存数据入库</p>
     *
     * @param session    数据库session对象
     * @param sql        insert的sql语句
     * @param parameters 参数
     * @return 插入计数
     */
    public static int save(Session session, String sql, Object... parameters) {
        SQLQuery query = session.createSQLQuery(sql);

        DBParameter.setParameter(query, parameters);

        return query.executeUpdate();
    }

    /**
     * <p>依据sql，保存数据入库</p>
     *
     * @param session    数据库session对象
     * @param sql        insert的hsql语句
     * @param parameters 参数
     * @return 插入计数
     */
    public static int hsave(Session session, String sql, Object... parameters) {
        Query query = session.createQuery(sql);

        DBParameter.setParameter(query, parameters);

        return query.executeUpdate();
    }

    public static int hupdate(Session session, String sql, Object... parameters) {
        return hsave(session, sql, parameters);
    }

    /**
     * <p>保存数据入库</p>
     *
     * @param session   数据库session对象
     * @param entityObj 实体bean
     */
    public static void persist(Session session, Object entityObj) {
        session.persist(entityObj);
    }

    public static void merge(Session session, Object entityObj) {
        session.merge(entityObj);
    }

    public static void update(Session session, Object entityObj) {
        session.update(entityObj);
    }

    public static int update(Session session, String sql, Object... parameters) {
        return save(session, sql, parameters);
    }

    public static boolean delete(Session session, Class<?> clazz, Serializable id) {
        Object object = session.get(clazz, id);
        if (object == null) {
            return false;
        } else {
            session.delete(object);
            return true;
        }
    }

    public static void delete(Session session, Object entityObj) {
        session.delete(entityObj);
    }

    public static int delete(Session session, String sql, Object... parameters) {
        return save(session, sql, parameters);
    }

    public static int hdelete(Session session, String hsql, Object... parameters) {
        return hsave(session, hsql, parameters);
    }
}
