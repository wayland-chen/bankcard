package com.offke.core.standard.abstracts;

import com.offke.core.bu.struct.pojo.KeyType;
import com.offke.core.bu.struct.pojo.QueryResult;
import com.offke.core.bu.struct.pojo.ScqOpt;
import com.offke.core.bu.struct.pojo.SimplePage;
import com.offke.core.common.mgr.KeyFactory;
import com.offke.core.dao.CommonQuery;
import com.offke.core.dao.OperateDB;
import com.offke.core.standard.interfaces.IAtom;
import org.hibernate.LockMode;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * <p>原子交易,需实现该抽象方法</p>
 *
 * @version 1.0
 * @since 2012/4/2
 */
public abstract class Atom extends AbstractBasicAtom implements IAtom {
    /**
     * <p>依据id查询到实体bean</p>
     *
     * @param clazz 实体Bean class
     * @param id    编号
     * @return 实体Bean
     */
    public <T> T get(Class<?> clazz, Serializable id) {
        return (T) OperateDB.get(getSession(), clazz, id);
    }

    /**
     * <p>依据id查询到实体bean, 加锁</p>
     *
     * @param clazz    实体Bean class
     * @param id       编号
     * @param lockMode 锁
     * @return 实体Bean
     */
    public <T> T get(Class<?> clazz, Serializable id, LockMode lockMode) {
        return (T) OperateDB.get(getSession(), clazz, id, lockMode);
    }

    /**
     * <p>依据id查询到实体bean</p>
     *
     * @param clazz    实体Bean class
     * @param id       编号
     * @param lockMode 锁
     * @return 实体Bean
     */
    public <T> T load(Class<?> clazz, Serializable id, LockMode lockMode) {
        return (T) OperateDB.load(getSession(), clazz, id, lockMode);
    }

    /**
     * <p>依据id查询到实体bean</p>
     *
     * @param clazz 实体Bean class
     * @param id    编号
     * @return 实体Bean
     */
    public <T> T load(Class<?> clazz, Serializable id) {
        return (T) OperateDB.load(getSession(), clazz, id);
    }

    /**
     * <p>获取整个表数据</p>
     *
     * @param clazz 实体Bean class
     * @return 结果集
     */
    public List<?> getAll(Class<?> clazz) {
        return OperateDB.getAll(getSession(), clazz);
    }

    /**
     * <p>保存数据<p>
     * <p>demo: <br/>
     * TBooktype type = new TBooktype( Byte.valueOf( "1" ), "傅江利测试" );<br/>
     * save( type );
     * </p>
     *
     * @param entityObj
     * @return 返回保存成功的实体Bean
     */
    public Serializable save(Object entityObj) {
        return OperateDB.save(getSession(), entityObj);
    }

    /**
     * <p>sql方式保存</p>
     * <p>demo:<br/>
     * this.save( "insert into T_BOOKTYPE(booktype,bookname) values(?,?)", 2, "傅江利插入测试" );<br/>
     * </p>
     *
     * @param sql        update的sql语句
     * @param parameters 参数
     * @return 更新计数
     */
    public int save(String sql, Object... parameters) {
        return OperateDB.save(getSession(), sql, parameters);
    }

    /**
     * <p>sql方式保存</p>
     * <p>demo:<br/>
     * this.save( "insert into T_BOOKTYPE(booktype,bookname) values(?,?)", 2, "傅江利插入测试" );<br/>
     * </p>
     *
     * @param sql update的sql语句
     * @return 更新计数
     */
    public int save(String sql) {
        return OperateDB.save(getSession(), sql, null);
    }


    /**
     * <p>hsql方式保存</p>
     *
     * @param sql        update的hsql语句
     * @param parameters 参数
     * @return 更新计数
     */
    public int hsave(String sql, Object... parameters) {
        return OperateDB.hsave(getSession(), sql, parameters);
    }

    /**
     * <p>依据实体Bean，保存入库</p>
     * <p>demo: <br>
     * TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利测试" );<br>
     * this.persist( type );
     * </p>
     *
     * @param entityObj
     */
    public void persist(Object entityObj) {
        OperateDB.persist(getSession(), entityObj);
    }

    /**
     * <p>依据实体Bean更新或新增<p>
     * <p>demo: <br>
     * TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利更新测试" );
     * merge( type );
     * </p>
     *
     * @param entityObj 实体Bean
     */
    public void merge(Object entityObj) {
        OperateDB.merge(getSession(), entityObj);
    }

    /**
     * <p>依据实体Bean更新<p>
     *
     * @param entityObj 实体Bean
     */
    public void update(Object entityObj) {
        OperateDB.update(getSession(), entityObj);
    }

    /**
     * <p>sql方式更新数据</p>
     * <p>demo: <br>
     * update( "update T_BOOKTYPE set bookname=? where booktype=?",  "傅江利测试2", 3 );<br>
     * </p>
     *
     * @param sql        sql语句
     * @param parameters 参数
     * @return 更新计数
     */
    public int update(String sql, Object... parameters) {
        return OperateDB.update(getSession(), sql, parameters);
    }

    /**
     * <p>hsql方式更新数据</p>
     *
     * @param hsql       hsql语句
     * @param parameters 参数
     * @return 更新计数
     */
    public int hupdate(String hsql, Object... parameters) {
        return OperateDB.hupdate(getSession(), hsql, parameters);
    }

    /**
     * <p>实体bean方式删除</p>
     * <p>demo: <br>
     * TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利更新测试" );<br>
     * delete( type );
     * </p>
     *
     * @param entityObj 实体Bean
     */
    public void delete(Object entityObj) {
        OperateDB.delete(getSession(), entityObj);
    }

    /**
     * <p>依据实体Bean与实体id删除</p>
     * <p> demo : <br>
     * delete( TBooktype.class, Byte.valueOf( "1" ) );
     * <p/>
     *
     * @param clazz 实体Bean类
     * @param id    编号
     * @return 是否删除成功
     */
    public boolean delete(Class<?> clazz, Serializable id) {
        return OperateDB.delete(getSession(), clazz, id);
    }

    /**
     * <p>sql方式删除数据</p>
     * <p>demo: delete( "delete from t_booktype where booktype=?", 2 )</p>
     *
     * @param sql        sql语句
     * @param parameters
     * @return 删除计数
     */
    public int delete(String sql, Object... parameters) {
        return OperateDB.delete(getSession(), sql, parameters);
    }

    /**
     * <p>hsql方式删除数据</p>
     *
     * @param sql        hsql语句
     * @param parameters
     * @return 删除计数
     */
    public int hdelete(String sql, Object... parameters) {
        return OperateDB.hdelete(getSession(), sql, parameters);
    }

    /**
     * <p>sql方式查询</p>
     *
     * @param sql sql语句
     * @return 查询结果
     */
    public List<Map> sqlQuery(String sql) {
        return CommonQuery.sqlQuery(getSession(), sql);
    }

    /**
     * <p>sql方式查询</p>
     * 注意：使用该方式查询时，sql语句中不能使用*来代替所有列，必须要写出明确的列明，否则报exception
     *
     * @param sql        sql语句
     * @param parameters 参数
     * @return 查询结果
     */
    public List<Map> sqlQuery(String sql, Object... parameters) {
        return CommonQuery.sqlQuery(getSession(), sql, parameters);
    }

    /**
     * <p>sql方式分页查询</p>
     *
     * @param sql      sql语句
     * @param position 位置
     * @param limit    界线
     *
     * @return 查询结果
     */
    /*public List<?> sqlQuery( String sql, int position, int limit )
    {
        return CommonQuery.sqlQuery( getSession( ), sql, position, limit );
    }*/

    /**
     * <p>sql方式分页查询</p>
     *
     * @param sql        sql语句
     * @param position   位置
     * @param limit      界线
     * @param parameters 参数
     *
     * @return 查询结果
     */
    /*public List<?> sqlQuery( String sql, int position, int limit, Object... parameters )
    {
        return CommonQuery.sqlQuery( getSession( ), sql, position, limit, parameters );
    }*/

    /**
     * <p>hsql语句查询</p>
     *
     * @param <T>
     * @param hsql hsql查询语句
     * @return 查询结果
     */
    public <T> List<T> hsqlQuery(String hsql) {
        return (List<T>) CommonQuery.hsqlQuery(getSession(), hsql);
    }

    /**
     * 清理缓存、执行SQL
     */
    public void flush() {
        getSession().flush();
    }

    /**
     * <p>hsql语句查询</p>
     *
     * @param hsql       hsql查询语句
     * @param parameters 参数
     * @return 查询结果
     */
    public <T> List<T> hsqlQuery(String hsql, Object... parameters) {
        return (List<T>) CommonQuery.hsqlQuery(getSession(), hsql, parameters);
    }

    /**
     * <p>hsql方式查询</P>
     *
     * @param hsql     hsql
     * @param position 位置
     * @param limit    界线
     *
     * @return 查询结果
     */
    /*public List<?> hsqlQuery( String hsql, int position, int limit )
    {
        return CommonQuery.hsqlQuery( getSession( ), hsql, position, limit );
    }*/

    /**
     * <p>hsql方式查询</P>
     *
     * @param hsql       hsql
     * @param position   位置
     * @param limit      界线
     * @param parameters 参数
     *
     * @return 查询结果
     */
    /*public List<?> hsqlQuery( String hsql, int position, int limit, Object... parameters )
    {
        return CommonQuery.hsqlQuery( getSession( ), hsql, position, limit, parameters );
    }*/

    /**
     * <p>jdbc方式查询</p>
     *
     * @param sql sql语句
     * @return 游标
     * @throws SQLException
     */
    public ResultSet jdbcQueryrs(String sql) throws SQLException {
        return CommonQuery.sqlQueryrs(getConnection(), sql);
    }

    /**
     * <p>jdbc方式查询</p>
     *
     * @param sql        sql语句
     * @param parameters 参数
     * @return 查询结果
     * @throws SQLException
     */
    public List<?> jdbcQuery(String sql, Object... parameters) throws SQLException {
        return CommonQuery.sqlQuery(getConnection(), sql, parameters);
    }

    /**
     * <P>jdbc方式查询</p>
     *
     * @param sql sql语句
     * @return 查询结果
     * @throws SQLException
     */
    public List<?> jdbcQuery(String sql) throws SQLException {
        return CommonQuery.sqlQuery(getConnection(), sql);
    }

    /**
     * <p>jdbc方式查询，返回表头信息以及数据结果</p>
     *
     * @param position    位置
     * @param limit       界线
     * @param selectAform select以及from段的sql语句
     * @param tables      涉及到显示中文字段的表名
     * @param parameters  where条件以及orderby条件
     * @return 结果
     * @throws SQLException
     */
    public QueryResult sqlConditionQuery(
            int position,
            int limit,
            String selectAform,
            String[] tables,
            Object... parameters) throws SQLException {
        return CommonQuery.sqlConditionQuery(getConnection(), position, limit, selectAform, tables, parameters);
    }

    /**
     * <p>jdbc方式查询，返回表头信息以及数据结果</p>
     *
     * @param page        SimplePage
     * @param selectAform select以及from段的sql语句
     * @param tables      涉及到显示中文字段的表名
     * @param parameters  where条件以及orderby条件
     * @return 结果
     * @throws SQLException
     */
    public QueryResult sqlConditionQuery(
            SimplePage page,
            String selectAform,
            String[] tables,
            Object... parameters) throws SQLException {
        return CommonQuery.sqlConditionQuery(getConnection(), page.getPosition(), page.getPageSize(), selectAform, tables, parameters);
    }

    /**
     * <p>jdbc方式查询，返回表头信息以及数据结果, 加选项</p>
     *
     * @param scqopt      选项
     * @param position    位置
     * @param limit       界线
     * @param selectAform select以及from段的sql语句
     * @param tables      涉及到显示中文字段的表名
     * @param parameters  where条件以及orderby条件
     * @return 结果
     * @throws SQLException
     */
    public QueryResult sqlConditionQuery(
            ScqOpt scqopt,
            int position,
            int limit,
            String selectAform,
            String[] tables,
            Object... parameters) throws SQLException {
        return CommonQuery.sqlConditionQuery(getConnection(), scqopt, position, limit, selectAform, tables, parameters);
    }

    /**
     * <p>jdbc方式查询，返回表头信息以及数据结果</p>
     *
     * @param selectAform select以及from段的sql语句
     * @param tables      涉及到显示中文字段的表名
     * @param parameters  where条件以及orderby条件
     * @return 结果
     * @throws SQLException
     */
    public QueryResult sqlConditionQuery(String selectAform, String[] tables, Object... parameters)
            throws SQLException {
        return CommonQuery.sqlConditionQuery(getConnection(), selectAform, tables, parameters);
    }

    /**
     * <p>jdbc方式查询，返回表头信息以及数据结果</p>
     *
     * @param selectAform select以及from段的sql语句
     * @param tables      涉及到显示中文字段的表名
     * @param parameters  where条件以及orderby条件
     * @return 结果(包括游标，注意使用)
     * @throws SQLException
     */
    public QueryResult sqlConditionQueryrs(String selectAform, String[] tables, Object... parameters)
            throws SQLException {
        return CommonQuery.sqlConditionQueryrs(getConnection(), selectAform, tables, parameters);
    }

    /**
     * <p>jdbc方式查询，返回表头信息以及数据结果，数据项为List</p>
     *
     * @param position    位置
     * @param limit       界线
     * @param selectAform select以及from段的sql语句
     * @param tables      涉及到显示中文字段的表名
     * @param parameters  where条件以及orderby条件
     * @return 结果
     * @throws SQLException
     */
    public QueryResult sqlConditionQueryList(
            int position,
            int limit,
            String selectAform,
            String[] tables,
            Object... parameters) throws SQLException {
        return CommonQuery.sqlConditionQueryList(getConnection(), position, limit, selectAform, tables, parameters);
    }

    /**
     * <p>jdbc方式查询，返回表头信息以及数据结果,数据项为List</p>
     *
     * @param selectAform select以及from段的sql语句
     * @param tables      涉及到显示中文字段的表名
     * @param parameters  where条件以及orderby条件
     * @return 结果
     * @throws SQLException
     */
    public QueryResult sqlConditionQueryList(String selectAform, String[] tables, Object... parameters)
            throws SQLException {
        return CommonQuery.sqlConditionQueryList(getConnection(), selectAform, tables, parameters);
    }


    /**
     * <p>依据类型生成系统主键</p>
     *
     * @param type 主键类型
     * @return 泛型
     */
    public <T> T generateKey(KeyType type) {
        return (T) KeyFactory.get(type);
    }

}
