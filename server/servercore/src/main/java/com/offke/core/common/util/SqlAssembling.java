package com.offke.core.common.util;

import com.offke.core.bu.struct.pojo.Condition;
import com.offke.core.bu.struct.pojo.ConditionValue;
import com.offke.core.bu.struct.pojo.FieldJion;
import com.offke.core.bu.struct.pojo.OrderBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;
import java.util.Date;

public class SqlAssembling {
    private static final Logger _logger = LoggerFactory.getLogger(SqlAssembling.class);

    public static StringBuffer buildSQL(StringBuffer sql, Object... option) {
        StringBuffer whereStr = new StringBuffer("WHERE");
        StringBuffer orderStr = new StringBuffer("ORDER BY");
        Condition wConfig = null;
        OrderBy orderBy = null;

        if (option != null && option.length > 0) {
            for (Object obj : option) {
                if (obj == null) {
                    continue;
                } else if (obj instanceof String) {
                    whereStr.append(obj);
                    continue;
                } else if (obj instanceof Condition) {
                    wConfig = (Condition) obj;
                    if (wConfig.getValue() instanceof ConditionValue &&
                            !Validate.isEmpty(((ConditionValue) wConfig.getValue()).toString())) {
                        whereStr.append(" (");
                        whereStr.append(wConfig.getValue());
                        whereStr.append(") ");
                        whereStr.append(wConfig.getJoin());
                        continue;
                    } else if (wConfig.getName() == null
                            || wConfig.getValue() == null
                            || "".equals(wConfig.getValue())) {
                        if (wConfig.isOption()) {
                            throw new RuntimeException("zl_90012");
                        }
                        continue;
                    }
                    String conditon = getWhere(wConfig.getName(), wConfig.getValue(), wConfig.getOperation());
                    if (conditon != null) {
                        whereStr.append(" ");
                        whereStr.append(conditon);
                        whereStr.append(" ");
                        whereStr.append(wConfig.getJoin());
                    } else {
                        _logger.warn(MessageFormat.format(
                                "组装字段条件错，name={0},value={1},operation={2},join={3},option={4},valuetype={5}",
                                wConfig.getName(),
                                wConfig.getValue(),
                                wConfig.getOperation(),
                                wConfig.getJoin(),
                                wConfig.isOption(),
                                wConfig.getValue() != null ? wConfig.getValue().getClass().getName() : null));
                    }
                } else if (obj instanceof OrderBy) {
                    orderBy = (OrderBy) obj;
                    orderStr.append(" ");
                    orderStr.append(orderBy.getFieldName());
                    orderStr.append(" ");
                    orderStr.append(orderBy.getFieldOrder());
                    orderStr.append(",");
                } else {
                    _logger.warn("不存在匹配的类型处理,请检查!");
                }
            }
            if (whereStr.length() > 5) {
                sql.append(" ");
                sql.append(whereStr.toString().replaceAll("AND$|OR$", ""));
            }

            if (orderStr.length() > 8) {
                sql.append(" ");
                sql.append(orderStr.toString().replaceAll(",$", ""));
            }
        }
        return sql;
    }

    private static String getWhere(String name, Object value, String operation) {
        if (value instanceof FieldJion) {
            return name + "=" + value;
        }

        if (operation == null || operation.trim().length() <= 0) {
            operation = "=";
        }

        operation = operation.toUpperCase().trim();
        String result = null;

        if (value instanceof String) {
            if (operation != null) {
                if (operation.equals("=")
                        || operation.equals("!=")
                        || operation.equals(">")
                        || operation.equals("<")
                        || operation.equals(">=")
                        || operation.equals("<=")) {
                    result = name + operation + "'" + value + "'";
                } else if (operation.equals("IS NULL") || operation.equals("IS NOT NULL")) {
                    result = name + " " + operation;
                } else if (operation.equals("LIKE") || operation.equals("NOT LIKE")) {
                    result = name + " " + operation + " '%" + value + "%'";
                }
            } else {
                result = name + "='" + value + "'";
            }
        } else if (value instanceof Number) {
            if (operation != null) {
                if (operation.equals("=")
                        || operation.equals("!=")
                        || operation.equals(">")
                        || operation.equals("<")
                        || operation.equals(">=")
                        || operation.equals("<=")) {
                    result = name + operation + "" + value + "";
                } else if (operation.equals("IS NULL") || operation.equals("IS NOT NULL")) {
                    result = name + " " + operation;
                } else if (operation.equals("LIKE") || operation.equals("NOT LIKE")) {
                    result = name + " " + operation + " '%" + value + "%'";
                }
            } else {
                result = name + "=" + value;
            }
        } else if (value instanceof Date) {
            if (operation != null && operation != "") {
                if (operation.equals("=")
                        || operation.equals("!=")
                        || operation.equals(">")
                        || operation.equals("<")
                        || operation.equals(">=")
                        || operation.equals("<=")) {
                    result = name + operation + " '" + value + "'";
                } else if (operation.equals("IS NULL") || operation.equals("IS NOT NULL")) {
                    result = name + " " + operation;
                } else if (operation.equals("LIKE") || operation.equals("NOT LIKE")) {
                    result = name + " " + operation + " '%" + value + "%'";
                }
            } else {
                result = name + "=" + "'" + value + "'";
            }
        } else if (value instanceof String[]) {
            if (operation.equals("IN") || operation.equals("NOT IN")) {
                String[] inValue = (String[]) value;
                result = name + " " + operation + "( ";
                for (int i = 0, j = inValue.length; i < j; i++) {
                    if (i == j - 1) {
                        result += "'" + inValue[i] + "'";
                        break;
                    } else {
                        result += "'" + inValue[i] + "',";
                    }
                }
                result += ")";
            } else if (operation.equals("BETWEEN") || operation.equals("NOT BETWEEN")) {
                String[] between = (String[]) value;
                result = name + " " + operation + " ";
                for (int i = 0, j = between.length; i < j; i++) {
                    if (i == j - 1) {
                        result += " '" + between[i] + "'";
                        break;
                    } else {
                        result += " '" + between[i] + "' AND ";
                    }
                }
            }
        } else if (value instanceof Number[]) {
            if (operation.equals("IN") || operation.equals("NOT IN")) {
                Number[] inValue = (Number[]) value;
                result = name + " " + operation + "(";
                for (int i = 0, j = inValue.length; i < j; i++) {
                    if (i == j - 1) {
                        result += inValue[i];
                        break;
                    } else {
                        result += inValue[i] + ",";
                    }
                }
                result += ")";
            } else if (operation.equals("BETWEEN") || operation.equals("NOT BETWEEN")) {
                Number[] between = (Number[]) value;
                result = name + " " + operation;
                for (int i = 0, j = between.length; i < j; i++) {
                    if (i == j - 1) {
                        result += " " + between[i] + "";
                        break;
                    } else {
                        result += " " + between[i] + " AND ";
                    }
                }
            }
        } else if (value instanceof Date[]) {
            if (operation.equals("IN") || operation.equals("NOT IN")) {
                Date[] inValue = (Date[]) value;
                result = name + " " + operation + "(";
                for (int i = 0, j = inValue.length; i < j; i++) {
                    if (i == j - 1) {
                        result += " '" + inValue[i] + "'";
                        break;
                    } else {
                        result += "'" + inValue[i] + "'" + ",";
                    }
                }
                result += ")";
            } else if (operation.equals("BETWEEN") || operation.equals("NOT BETWEEN")) {
                Date[] between = (Date[]) value;
                result = name + " " + operation + " ";
                for (int i = 0, j = between.length; i < j; i++) {
                    if (i == j - 1) {
                        result += "'" + between[i] + "'";
                        break;
                    } else {
                        result += "'" + between[i] + "'" + " AND ";
                    }
                }
            }
        }

        return result;
    }

    public static String sqlToCount(String sql) {
        String sqlcount = "SELECT COUNT(*)  ";

        int i = sql.toUpperCase().indexOf("FROM");
        if ((i > -1) && (i < (sql.length()))) {
            sqlcount += sql.substring(i);
        }

        return sqlcount;
    }

}
