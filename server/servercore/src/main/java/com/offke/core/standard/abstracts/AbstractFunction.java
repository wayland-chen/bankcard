/*
 * AbstractFunction.java  v1.00  2012-4-19
 * Peoject	com.wisdragon.splus-atom
 * Copyright (c) 2012 Wisdragon
 *
 * Filename	:	AbstractFunction.java  v1.00 2012-4-19
 * Project	: 	com.wisdragon.splus-atom
 * Copyight	:	Copyright (c) 2012 Wisdragon
 */
package com.offke.core.standard.abstracts;

import com.offke.core.AppConst;
import com.offke.core.bu.struct.pojo.*;
import com.offke.core.common.util.SessionUtil;
import com.offke.core.common.util.SqlAssembling;
import com.offke.core.common.util.Validate;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * 进一步简化实现.
 *
 * @author <a href="mailto:genliang.jiang@wisdragon.com">蒋根亮</a>
 * @version v1.00
 * @since 1.00 2012-4-19
 */
public abstract class AbstractFunction<T> extends AbstractAtom {
    private static final Logger _logger = LoggerFactory.getLogger(AbstractFunction.class);
    // 实体对象
    private T entity;
    private Class<T> class1;

    // 分页信息.
    private SimplePage pager;

    // 参数列表
    private List<Object> paramList;

    // 处理方式路径选择,true:entity方式或者false:sql方式
    private boolean flagEntityChoose = true;
    // 删除控制标记，true：物理删除,false:逻辑删除
    private boolean flagDel = true;
    private boolean gFlagDel = true;

    private boolean all = false;


    public AbstractFunction(Class<T> class1) {
        super();
        this.class1 = class1;
    }

    @Override
    protected void add(TradeInfo tradeInfo) throws RuntimeException {

        setEntity(tradeInfo);

        if (entity != null) {
            beginTransaction();
            try {

                addBuild(tradeInfo);

                if (isFlagEntityChoose()) {
                    save(entity);
                } else {
                    save(getInsertSql(), getParamList().toArray());
                }
                addBuildAfter(tradeInfo);

                commitTransaction();
            } catch (RuntimeException e) {
                rollbackTransaction();
                _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
                throw e;
            } catch (Exception e) {
                rollbackTransaction();
                _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
                throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName(), e);
            }

            if (!tradeInfo.puts().containsKey(AppConst.reasoncode)) {
                tradeInfo.putReason("zl_00000", "成功");
            }
        }

    }

    @Override
    protected void modify(TradeInfo tradeInfo) throws RuntimeException {

        setEntity(tradeInfo);

        if (entity != null) {
            beginTransaction();
            try {

                updateBuild(tradeInfo);

                if (isFlagEntityChoose()) {
                    merge(entity);
                } else {
                    update(getUpdateSql(), getParamList().toArray());
                }

                updateBuildAfter(tradeInfo);

                commitTransaction();
            } catch (RuntimeException e) {
                rollbackTransaction();
                _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
                throw e;
            } catch (Exception e) {
                _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
                throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName(), e);
            }

            if (!tradeInfo.puts().containsKey(AppConst.reasoncode)) {
                tradeInfo.putReason("zl_00000", "成功");
            }
        }

    }

    @Override
    protected void query(TradeInfo tradeInfo) throws RuntimeException {
        try {
            setEntity(tradeInfo);

            queryBuild(tradeInfo);

            if (isAll()) {
                QueryResult qResult = null;
                try {
                    qResult = sqlConditionQueryrs(getQuerySql(),
                            getTables(), getParamList().toArray());
                    tradeInfo.put("columnHeader", qResult.getColumns());
                    List<Column> cols = (List<Column>) qResult.getColumns();
                    List<Map> result = new LinkedList<Map>();
                    while (qResult.getResultSet().next()) {
                        Map<String, Object> row = new LinkedHashMap<String, Object>();
                        for (int i = 1; i <= cols.size(); i++) {
                            row.put(cols.get(i - 1).getId(), qResult.getResultSet().getObject(i));
                        }
                        result.add(row);
                        if (result.size() > 100) {
                            tradeInfo.put(AppConst.result, result);
                            tradeInfo.asynCommitBatch();
                            result.clear();
                        }
                    }

                    if (!result.isEmpty()) {
                        tradeInfo.put(AppConst.result, result);
                    }

                } catch (Exception e) {
                    _logger.error("Excetion,", e);
                } finally {
                    SessionUtil.closeResultSet(qResult.getResultSet());
                    tradeInfo.asynComplete();
                }
            } else {
                QueryResult qResult = sqlConditionQuery(
                        ScqOpt.map2opt(tradeInfo.getMap(AppConst.pager)),
                        getPager(tradeInfo).getPosition(), getPager(tradeInfo).getPageSize(), getQuerySql(),
                        getTables(), getParamList().toArray());

                getPager(tradeInfo).setTotalItems(qResult.getTotalItems());

                tradeInfo.put("pager", pager);
                tradeInfo.put("columnHeader", qResult.getColumns());
                tradeInfo.put("result", qResult.getResult());
            }

        } catch (RuntimeException e) {
            _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
            throw e;
        } catch (Exception e) {
            _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
            throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName(), e);
        }

        if (!tradeInfo.puts().containsKey(AppConst.reasoncode)) {
            tradeInfo.putReason("zl_00000", "成功");
        }

    }

    @Override
    protected void delete(TradeInfo tradeInfo) throws RuntimeException {

        setEntity(tradeInfo);

        if (entity != null) {
            beginTransaction();
            try {

                // 根据主键读取表记录,删除前处理
                deleteBuild(tradeInfo);

                if (isGFlagDel()) {
                    if (isFlagDel()) {// 物理删除
                        if (isFlagEntityChoose()) {
                            delete(entity);
                        } else {
                            delete(getDeleteSqlPhysics(), getParamList().toArray());
                        }
                    } else {// 逻辑删除
                        if (isFlagEntityChoose()) {
//                        update(entity);
                            merge(entity);
                        } else {
                            update(getDeleteSqlLogic(), getParamList().toArray());
                        }
                    }
                }

                deleteBuildAfter(tradeInfo);

                commitTransaction();
            } catch (RuntimeException e) {
                rollbackTransaction();
                _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
                throw e;
            } catch (Exception e) {
                _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
                throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName(), e);
            }

            if (!tradeInfo.puts().containsKey(AppConst.reasoncode)) {
                tradeInfo.putReason("zl_00000", "成功");
            }
        }
    }

    protected void detail(TradeInfo tradeInfo) {

        setEntity(tradeInfo);

        if (entity != null) {
            try {

                // 根据主键读取表记录,删除前处理
                detailBuild(tradeInfo);
                if (isFlagEntityChoose()) {
                    // 未實現
                } else {

                    QueryResult qResult = sqlConditionQuery(getPager(tradeInfo).getPosition(), getPager(tradeInfo).getPageSize(),
                            getDetailSql(), getTables(), getParamList().toArray());

                    tradeInfo.put("columnHeader", qResult.getColumns());
                    tradeInfo.put("result", qResult.getResult());
                }

            } catch (RuntimeException e) {
                _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
                throw e;
            } catch (Exception e) {
                _logger.error("Failure TradeCode[{}],error[{}]", tradeInfo.tradeCode(), e);
                throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName(), e);
            }

            if (!tradeInfo.puts().containsKey(AppConst.reasoncode)) {
                tradeInfo.putReason("zl_00000", "成功");
            }
        }

    }

    /**
     * 查询总记录数. eg: countSql("select count(*) from t_branch ", new
     * Condition("branchno", getEntity().getBranchno()));
     * <p/>
     *
     * @param sql        eg:"select count(*) from t_branch "
     * @param parameters eg:new Condition("branchno", getEntity().getBranchno())
     * @return long
     * @throws SQLException
     * @since v1.00
     */
    public long countSql(String sql, Object... parameters) throws SQLException {

        Statement stmt = null;
        ResultSet rs = null;
        Long count = null;
        try {
            StringBuffer sb = new StringBuffer(sql);
            sb = SqlAssembling.buildSQL(sb, parameters);

            stmt = getConnection().createStatement();
            rs = stmt.executeQuery(sb.toString());

            // rs = CommonQuery.sqlQueryrs(getConnection(), sql, parameters);
            count = rs.next() == true ? rs.getLong(1) : null;
            if (count == null || !Validate.isExpression(count.toString(), DataType.Int)) {
                count = new Long(0);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
        return count != null ? count.longValue() : 0;
        // return count.longValue();
    }

    /**
     * 查询总记录数.<br/>
     *
     * @param sql              native sql count语句
     * @param RuntimeException 错误码 eg:RuntimeException.E_DB_SITE_R
     * @param parameters       eg:new Condition("branchno", getEntity().getBranchno())
     * @return
     * @throws RuntimeException
     * @since v1.00
     */
    public long countSql(String sql, String RuntimeException, Object... parameters) throws RuntimeException {

        Statement stmt = null;
        ResultSet rs = null;
        Long count = null;
        try {
            StringBuffer sb = new StringBuffer(sql);
            sb = SqlAssembling.buildSQL(sb, parameters);

            stmt = getConnection().createStatement();
            rs = stmt.executeQuery(sb.toString());

            // rs = CommonQuery.sqlQueryrs(getConnection(), sql, parameters);
            count = rs.next() == true ? rs.getLong(1) : null;
            if (count == null || !Validate.isExpression(count.toString(), DataType.Int)) {
                count = new Long(0);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(RuntimeException);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return count != null ? count.longValue() : 0;
    }

    /**
     * 获取实体对象.
     *
     * @return
     * @since v1.00
     */
    public T getEntity() {
        return entity;
    }

    private void setEntity(TradeInfo tradeInfo) {
        if (entity == null) {
            entity = getEntity(tradeInfo, class1);
        }
    }

    /**
     * 获取当前操作的处理方式.
     * <p/>
     * true:entity方式 false:sql方式 <br>
     * 默认true
     *
     * @return boolean
     * @since v1.00
     */
    public boolean isFlagEntityChoose() {
        return flagEntityChoose;
    }

    /**
     * 设置当前操作的处理方式.
     * <p/>
     * eg:<br>
     * true:entity方式 false:sql方式<br>
     * flase时需<br>
     * 1,实现getDeleteSqlLogic()或getDeleteSqlPhysics()<br>
     * 2,需设置setParamList(coList);<br>
     * <br>
     * 默认true<br>
     *
     * @param flagEntityChoose boolean
     * @see T
     * @since v1.00
     */
    public void setFlagEntityChoose(boolean flagEntityChoose) {
        this.flagEntityChoose = flagEntityChoose;
    }

    /**
     * 删除控制标记.<br/>
     * true:物理删除,flase:逻辑删除<br>
     * 默认：true
     *
     * @return boolean
     * @since v1.00
     */
    public boolean isFlagDel() {
        return flagDel;
    }

    /**
     * 删除控制标记.<br/>
     * 默认true:物理删除, flase:逻辑删除
     *
     * @param flagDel
     * @see T
     * @since v1.00
     */
    public void setFlagDel(boolean flagDel) {
        this.flagDel = flagDel;
    }

    public boolean isGFlagDel() {
        return gFlagDel;
    }

    public void setGFlagDel(boolean gflagDel) {
        this.gFlagDel = gflagDel;
    }

    /**
     * 分页控件，则从json中自动获取..
     *
     * @return
     * @since v1.00
     */
    private SimplePage getPager(TradeInfo tradeInfo) {
        if (pager == null) {
            pager = getEntity(tradeInfo, SimplePage.class, "pager");
        }
        return pager;
    }

    /**
     * 获取参数列表.
     *
     * @return
     * @since v1.00
     */
    public List<Object> getParamList() {
        if (paramList == null) {
            paramList = new ArrayList<Object>(0);
        }
        return paramList;
    }

    /**
     * 设置参数列表.
     *
     * @param paramList
     * @since v1.00
     */
    public void setParamList(List<Object> paramList) {
        this.paramList = paramList;
    }


    /**
     * 获取查询列名数组.
     *
     * @return
     * @since v1.00
     */
    protected String[] getTables() {
        throw new RuntimeException("未实现getTables方法");
    }

    /**
     * 获取查询语句.
     *
     * @return
     * @since v1.00
     */
    protected String getQuerySql() {
        throw new RuntimeException("未实现getQuerySql方法");
    }

    protected String getInsertSql() {
        throw new RuntimeException("未实现getInsertSql方法");
    }

    protected String getUpdateSql() {
        throw new RuntimeException("未实现getUpdateSql方法");
    }

    protected String getDetailSql() {
        throw new RuntimeException("未实现getDetailSql方法");
    }

    /**
     * 逻辑删除语句.<br/>
     *
     * @return String
     * @since v1.00
     */
    protected String getDeleteSqlLogic() {
        throw new RuntimeException("未实现getDeleteSqlLogic方法");
    }

    /**
     * 物理删除sql语句.<br/>
     *
     * @return String
     * @since v1.00
     */
    protected String getDeleteSqlPhysics() {
        throw new RuntimeException("未实现getDeleteSqlPhysics方法");
    }

    /**
     * 组织查询条件.
     * <p/>
     * 1，需在实现getTables()<br>
     * 2，需实现setParamList(paramList)<br>
     * 3，需实现getQuerySql()<br>
     *
     * @param tradeInfo
     * @see T
     * @since v1.00
     */
    public void queryBuild(TradeInfo tradeInfo) throws RuntimeException {
        throw new RuntimeException("未实现queryBuild方法");
    }

    /**
     * 组织新增信息.
     * <p/>
     * entity已经准备好，需要加入主键等其它信息，本方法在save之前执行. <br>
     * 子类可做行为：<br>
     * 1，可加入主键<br>
     * 2，中设置创建日期等参数<br>
     * 3，可判断是否已存在记录<br>
     *
     * @param tradeInfo
     * @since v1.00
     */
    public void addBuild(TradeInfo tradeInfo) throws RuntimeException {
        throw new RuntimeException("未实现updateBuild方法");
    }

    /**
     * 新增操作后续处理.<br/>
     * 本方法在addBuild方法实际操作之后执行.
     *
     * @param tradeInfo
     * @since v1.00
     */
    public void addBuildAfter(TradeInfo tradeInfo) {
    }

    /**
     * 组织更新信息.
     * <p/>
     * 1，可设置处理方式选择setFlagEntityChoose(flase);<br>
     * true:entity方式或者false:sql方式,默认true;<br>
     * 2，可设置entity属性: eg:<br>
     * getEntity().setLastsaved(DateUtil.ORA_DATE_FORMAT.format (new Date()));
     * <br>
     *
     * @param tradeInfo
     * @throws RuntimeException
     * @since v1.00
     */
    public void updateBuild(TradeInfo tradeInfo) throws RuntimeException {
        throw new RuntimeException("未实现updateBuild方法");
    }

    /**
     * 更新后處理<br/>
     *
     * @param tradeInfo
     * @since v1.00
     */
    public void updateBuildAfter(TradeInfo tradeInfo) {
    }

    /**
     * 组织删除信息.
     * <p/>
     * 1，判断记录是否存在<br>
     * 2，设置删除模式setFlagDel<br>
     * 3，设置参数列表setParamList<br>
     * 4，设置抛出错误信息
     *
     * @param tradeInfo
     * @throws RuntimeException
     * @since v1.00
     */
    public void deleteBuild(TradeInfo tradeInfo) throws RuntimeException {
        throw new RuntimeException("未实现detailBuild方法");
    }

    /**
     * 刪除后續處理.<br/>
     *
     * @param tradeInfo
     * @since v1.00
     */
    public void deleteBuildAfter(TradeInfo tradeInfo) {
    }

    /**
     * 如存在查看詳情功能，需復蓋此方法.<br/>
     * <p/>
     * 1，需實現getDetailSql();<br>
     * 2，需設置查詢方式為sql查询:setFlagEntityChoose(false)<br>
     * 3，设置参数列表setParamList<br>
     * 4，设置抛出错误信息
     *
     * @param tradeInfo
     * @since v1.00
     */
    public void detailBuild(TradeInfo tradeInfo) {
        throw new RuntimeException("未实现detailBuild方法");
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    public boolean isAll() {
        return all;
    }
}
