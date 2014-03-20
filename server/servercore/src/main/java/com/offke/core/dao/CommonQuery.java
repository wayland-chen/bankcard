package com.offke.core.dao;

import com.offke.core.bu.struct.pojo.*;
import com.offke.core.common.util.*;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.text.MessageFormat;
import java.util.*;

public class CommonQuery {
    private static final Logger _logger = LoggerFactory.getLogger(CommonQuery.class);
    public final static String oracle = "oracle";
    public final static String sqlserver = "sqlserver";
    public final static String oraclepagesql =
            "select * from (select row_.*, rownum rn from ({0}) row_ where rownum <= {1}) where rn > {2}";
    public final static String sqlserverpagesql = " SELECT * FROM (" +
            " SELECT *,ROW_NUMBER() OVER({0})  AS rownum FROM (SELECT TOP {1} {2}) srow_) row_ WHERE rownum BETWEEN {3} AND {4}";
    public final static String dbtype;

    private static String StrDefine = ".";
    private static String StrSplit = ",";

    static {
        SplusProperties.instance();
        dbtype = SplusProperties.getConfig("dbtype");
    }

    /**
     * <p>Session方式的sql查询<p>
     *
     * @param session    hibernate session对象
     * @param sql        sql语句
     * @param parameters 参数
     * @return 查询结果
     */
    public static List<Map> sqlQuery(Session session, String sql, Object... parameters) {
        SQLQuery query = session.createSQLQuery(sql);
        DBParameter.setParameter(query, parameters);
        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return query.list();
    }

    /**
     * <p></p>
     *
     * @param session
     * @param sql
     * @return  ResultSet
     */
    public static List<Map> sqlQuery(Session session, String sql) {
        return sqlQuery(session, sql, null);
    }


    public static <T> List<T> sqlQuery(String sql, int position, int limit, Session session, Object... parameters) {
        SQLQuery query = session.createSQLQuery(sql);
        DBParameter.setParameter(query, parameters);
        query.setFirstResult(position);
        query.setMaxResults(limit);
        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return query.list();
    }

    public static <T> List<T> sqlQuery(String sql, int position, int limit, Session session) {
        return sqlQuery(sql, position, limit, session, null);
    }

    public static <T> List<T> hsqlQuery(Session session, String hsql) {
        return hsqlQuery(session, hsql, null);
    }

    public static <T> List<T> hsqlQuery(Session session, String hsql, Object... parameters) {
        Query query = session.createQuery(hsql);
        DBParameter.setParameter(query, parameters);
        return query.list();
    }

    public static ResultSet sqlQueryrs(Connection connection, String sql) throws SQLException {
        return sqlQueryrs(connection, sql, null);
    }

    public static ResultSet sqlQueryrs(Connection connection, String sql, Object... parameters)
            throws SQLException {
        PreparedStatement statement = connection.prepareStatement(sql);
        if (parameters != null && parameters.length > 0) {
            int i = 1;
            for (Object p : parameters) {
                statement.setObject(i, p);
            }
        }
        return statement.executeQuery(sql);
    }

    public static List<Map<String, Object>> sqlQuery(Connection connection, String sql) throws SQLException {
        return sqlQuery(connection, sql, null);
    }

    public static List<Map<String, Object>> sqlQuery(Connection connection, String sql, Object... parameters) throws SQLException {
        ResultSet rs = null;
        try {
            rs = sqlQueryrs(connection, sql, parameters);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            List<Column> cols = new ArrayList<Column>(columnCount);
            Column column;
            for (int i = 1; i <= columnCount; i++) {
                column = new Column();
                column.setId(metaData.getColumnName(i).toUpperCase()); // 列名
                cols.add(column);
            }

            List<Map<String, Object>> rets = new LinkedList<Map<String, Object>>();
            Map<String, Object> row;

            while (rs.next()) {
                row = new LinkedHashMap<String, Object>();
                int i = 1;
                for (Column col : cols) {
                    row.put(col.getId(), rs.getObject(i++));
                }
                rets.add(row);
            }

            return rets;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    public static QueryResult sqlConditionQuery(
            Connection connection,
            String selectAform,
            String[] tables,
            Object... parameters) throws SQLException {
        return sqlConditionQuery(connection, -1, -1, selectAform, tables, parameters);
    }

    public static QueryResult sqlConditionQueryrs(
            Connection connection,
            String selectAform,
            String[] tables,
            Object... parameters) throws SQLException {
        return sqlConditionQueryCommon(connection, null, -1, -1, selectAform, tables, SqlConditionQueryRT.Cursor, parameters);
    }

    public static QueryResult sqlConditionQuery(
            Connection connection,
            int position,
            int limit,
            String selectAform,
            String[] tables,
            Object... parameters) throws SQLException {
        return sqlConditionQueryCommon(connection, null, position, limit, selectAform, tables, SqlConditionQueryRT.Map, parameters);
    }

    public static QueryResult sqlConditionQuery(
            Connection connection,
            ScqOpt scqopt,
            int position,
            int limit,
            String selectAform,
            String[] tables,
            Object... parameters) throws SQLException {
        return sqlConditionQueryCommon(connection, scqopt, position, limit, selectAform, tables, SqlConditionQueryRT.Map, parameters);
    }


    protected static QueryResult sqlConditionQueryCommon(
            Connection connection,
            ScqOpt scqopt,
            int position,
            int limit,
            String selectAform,
            String[] tables,
            SqlConditionQueryRT rt,
            Object... parameters) throws SQLException {
//    	StringBuffer allSQL = SqlAssembling.buildSQL( new StringBuffer( selectAform ), parameters );
        StringBuffer allSQL;
        StringBuffer orderStr = new StringBuffer("ORDER BY");
        String pageSQL = null;
        if (dbtype.equalsIgnoreCase(sqlserver)) {
            for (Object obj : parameters) {
                OrderBy orderBy;
                if (obj instanceof OrderBy) {
                    orderBy = (OrderBy) obj;
                    orderStr.append(" ");
                    orderStr.append(Validate.getStrAfterDStr(orderBy.getFieldName(), StrSplit, StrDefine));
                    orderStr.append(" ");
                    orderStr.append(orderBy.getFieldOrder());
                }
            }//end for
            _logger.info("orderstr[{}]", orderStr);

            StringBuffer allSQLTmp = SqlAssembling.buildSQL(new StringBuffer(selectAform), parameters);
            String strAllSQL = allSQLTmp.substring(0);
            int orderByPos = strAllSQL.indexOf("ORDER BY");
            if (orderByPos != -1) {
                allSQL = new StringBuffer();
                allSQL.append(strAllSQL.substring(0, orderByPos));
            } else {
                allSQL = allSQLTmp;
            }


            pageSQL = allSQLTmp.substring(8);
        } else {
            allSQL = SqlAssembling.buildSQL(new StringBuffer(selectAform), parameters);
        }


        _logger.debug(allSQL.toString());

        QueryResult qr = null;
        String sql;

        ResultSet rs = null;
        Statement statement = null;
        Long count = 0L;

        if (scqopt == null || scqopt.getGcount() == null || scqopt.getGcount() == 1) {
            statement = connection.createStatement();
            _logger.info("allsql[{}]", allSQL);
            rs = statement.executeQuery("select count(*) from (" + allSQL + ") pageTable");

            count = rs.next() ? rs.getLong(1) : null;

            if (count == null || !Validate.isExpression(count.toString(), DataType.Int)) {
                return null;
            }


            if ((position + limit) > count) {
                //limit大于count的情况
                if (limit > count) {
                    position = 0;
                } else if (position >= count) {
                    //position大于count的情况
                    int xxx = (int) (count % limit);
                    if (xxx == 0) {
                        position = (int) (count - limit);
                    } else {
                        position = (int) (count - xxx);
                    }
                }
            }
        }

        if (dbtype.equalsIgnoreCase(oracle)) {
            if (position == -1 && limit == -1) {
                sql = allSQL.toString();
            } else {
                sql = MessageFormat.format(oraclepagesql, allSQL, position + limit + "", position + "");
            }
        } else if (dbtype.equalsIgnoreCase(sqlserver)) {
//            sql = allSQL.toString( );
            if (position == -1 && limit == -1) {
                sql = allSQL.toString();
            } else {
                sql = MessageFormat.format(sqlserverpagesql, orderStr, position + limit + "", pageSQL, position + 1 + "", position + limit + "");
            }
        } else {
            sql = allSQL.toString();
        }

        try {
            if (rs != null) {
                rs.close();
            }
            if (statement != null) {
                statement.close();
            }


            statement = connection.createStatement();
            rs = statement.executeQuery(sql);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount;
            //有無分頁時判斷
            if (position == -1 && limit == -1) {
                columnCount = metaData.getColumnCount();
            } else {
                columnCount = metaData.getColumnCount() - 1;
            }


            List<Column> cols = new ArrayList<Column>(columnCount);
            Column column;
            Map<String, String> fieldsCN = DBFields.instance().getFields(tables);
            for (int i = 1; i <= columnCount; i++) {
                column = new Column();
                column.setId(metaData.getColumnName(i).toUpperCase()); // 列名
                //column.setType( metaData.getColumnTypeName( i ) ); // 列类型
                //column.setLen( String.valueOf( metaData.getColumnDisplaySize( i ) ) ); // 长度
                if (fieldsCN != null && !column.getId().equals("RN")) {
                    String fieldCn = fieldsCN.get(column.getId());
                    if (fieldCn == null) {
                        _logger.warn("字段【】不存在中文名称", column.getId());
                    } else {
                        column.setCn(fieldCn);
                    }
                }

                cols.add(column);
            }

            //oracle
            if (dbtype.equalsIgnoreCase(oracle)) {
                qr = new QueryResult();

                if (rt == SqlConditionQueryRT.Map) {
                    List<Map<String, Object>> rets = new LinkedList<Map<String, Object>>();

                    while (rs.next()) {
                        Map<String, Object> row = new LinkedHashMap<String, Object>();
                        for (int i = 1; i <= columnCount; i++) {
                            row.put(cols.get(i - 1).getId(), rs.getObject(i));
                        }
                        rets.add(row);
                    }
                    qr.setResult(rets);
                } else if (rt == SqlConditionQueryRT.Array) {
                    List<List<Object>> rets = new LinkedList<List<Object>>();
                    List<Object> row;
                    while (rs.next()) {
                        row = new LinkedList<Object>();
                        for (int i = 1; i <= columnCount; i++) {
                            row.add(rs.getObject(i));
                        }
                        rets.add(row);
                    }
                    qr.setResult(rets);
                } else if (rt == SqlConditionQueryRT.Cursor) {
                    qr.setResultSet(rs);
                }
                if (scqopt == null ||
                        scqopt.getGhead() == null ||
                        (scqopt.getGhead() != null && scqopt.getGhead() == 0)) {
                    qr.setColumns(cols);
                }
                qr.setPosition(position);
                qr.setPageSize(limit);
                qr.setTotalItems(count);
            } else if (dbtype.equalsIgnoreCase(sqlserver)) {
                qr = new QueryResult();

                if (rt == SqlConditionQueryRT.Map) {
                    List<Map<String, Object>> rets = new LinkedList<Map<String, Object>>();

                    while (rs.next()) {
                        Map<String, Object> row = new LinkedHashMap<String, Object>();
                        for (int i = 1; i <= columnCount; i++) {
                            row.put(cols.get(i - 1).getId(), rs.getObject(i));
                        }
                        rets.add(row);
                    }
                    qr.setResult(rets);
                } else if (rt == SqlConditionQueryRT.Array) {
                    List<List<Object>> rets = new LinkedList<List<Object>>();
                    List<Object> row;
                    while (rs.next()) {
                        row = new LinkedList<Object>();
                        for (int i = 1; i <= columnCount; i++) {
                            row.add(rs.getObject(i));
                        }
                        rets.add(row);
                    }
                    qr.setResult(rets);
                } else if (rt == SqlConditionQueryRT.Cursor) {
                    qr.setResultSet(rs);
                }
                if (scqopt == null ||
                        scqopt.getGhead() == null ||
                        (scqopt.getGhead() != null && scqopt.getGhead() == 0)) {
                    qr.setColumns(cols);
                }
                qr.setPosition(position);
                qr.setPageSize(limit);
                qr.setTotalItems(count);
            }
        } finally {
            try {
                if (rs != null && rt != SqlConditionQueryRT.Cursor) {
                    rs.close();
                }
            } finally {
                SessionUtil.closeStatement(statement);
            }
        }

        return qr;
    }

    public static QueryResult sqlConditionQueryList(
            Connection connection,
            int position,
            int limit,
            String selectAform,
            String[] tables,
            Object[] parameters) throws SQLException {
        return sqlConditionQueryCommon(connection, null, position, limit, selectAform, tables, SqlConditionQueryRT.Array, parameters);
    }

    public static QueryResult sqlConditionQueryList(
            Connection connection,
            String selectAform,
            String[] tables,
            Object[] parameters) throws SQLException {
        return sqlConditionQueryCommon(connection, null, -1, -1, selectAform, tables, SqlConditionQueryRT.Array, parameters);
    }


}
