package com.offke.core.common.util;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class TypeConver {
    public static Double getDouble(Object o) {
        if (o == null) {
            return null;
        }
        return o instanceof Number ? ((Number) o).doubleValue() : Double
                .valueOf((String) o)
                .doubleValue();
    }

    public static BigDecimal getBigDecimal(Object o) {
        if (o == null) {
            return null;
        }
        return new BigDecimal(String.valueOf(o));
    }

    public static Float getFloat(Object o) {
        if (o == null) {
            return null;
        }
        return o instanceof Number ? ((Number) o).floatValue() : Float.valueOf((String) o).floatValue();
    }

    public static Short getShort(Object o) {
        if (o == null) {
            return null;
        }
        return o instanceof Number ? ((Number) o).shortValue() : Short.valueOf(o.toString());
    }

    public static Integer getInt(Object o) {
        if (o == null) {
            return null;
        }
        return o instanceof Number ? ((Number) o).intValue() : Integer.valueOf(o.toString());
    }

    public static Map getMap(Object o) {
        if (o == null) {
            return null;
        }
        return o instanceof Map ? (Map) o : null;
    }

    public static List<?> getList(Object o) {
        if (o == null) {
            return null;
        }
        return o instanceof List ? (List) o : null;
    }

    public static File getFile(Object o) {
        if (o != null && o instanceof File) {
            return (File) o;
        } else {
            return null;
        }
    }

    public static Long getLong(Object o) {
        if (o == null) {
            return null;
        }
        return o instanceof Number ? ((Number) o).intValue() : Long.valueOf(o.toString());
    }
}

