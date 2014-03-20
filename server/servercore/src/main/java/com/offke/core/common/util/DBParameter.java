package com.offke.core.common.util;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

/**
 * <p>dao公共类</p>
 */
public class DBParameter {
    /**
     * <p>SQLQuery设置参数</p>
     *
     * @param query      sqlQuery对象
     * @param parameters 参数列表
     */
    public static void setParameter(SQLQuery query, Object... parameters) {
        if (parameters != null && parameters.length > 0) {
            int i = 0;
            for (Object p : parameters) {
                query.setParameter(i, p);
                i++;
            }
        }
    }

    /**
     * <p>Query设置参数</p>
     *
     * @param query      sqlQuery对象
     * @param parameters 参数列表
     */
    public static void setParameter(Query query, Object... parameters) {
        if (parameters != null && parameters.length > 0) {
            int i = 0;
            for (Object p : parameters) {
                query.setParameter(i, p);
                i++;
            }
        }
    }

}
