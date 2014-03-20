package com.offke.core.common.util;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * <p>数据类型转换</p>
 *
 * @version 1.0
 * @since 2012/4/21
 */
public class DataTransition {
    /**
     * <p>string到BigDecimal转换</p>
     *
     * @param value 字符串
     * @return BigDecimal
     */
    public static BigDecimal strToBigDecimal(String value) {
        if (value == null) {
            return null;
        } else {
            return new BigDecimal(value);
        }
    }

    /**
     * <p>int到BigDecimal转换</p>
     *
     * @param value 整型
     * @return BigDecimal
     */
    public static BigDecimal intToBigDecimal(Integer value) {
        if (value == null) {
            return null;
        } else {
            return new BigDecimal(value.toString());
        }
    }

    /**
     * <p>long到BigDecimal转换</p>
     *
     * @param value 长整型
     * @return BigDecimal
     */
    public static BigDecimal longToBigDecimal(Long value) {
        if (value == null) {
            return null;
        } else {
            return new BigDecimal(value.toString());
        }
    }

    /**
     * <p>float到BigDecimal转换</p>
     *
     * @param value 浮点
     * @return BigDecimal
     */
    public static BigDecimal floatToBigDecimal(Float value) {
        if (value == null) {
            return null;
        } else {
            return new BigDecimal(value.toString());
        }
    }

    /**
     * <p>double到BigDecimal转换</p>
     *
     * @param value 浮点
     * @return BigDecimal
     */
    public static BigDecimal doubleToBigDecimal(Double value) {
        if (value == null) {
            return null;
        } else {
            return new BigDecimal(value.toString());
        }
    }

    /**
     * <p>BigDecimal到String转换</p>
     *
     * @param value BigDecimal
     * @return 字符串
     */
    public static String bigDecimalToStr(BigDecimal value) {
        if (value == null) {
            return null;
        } else {
            return value.toString();
        }
    }

    /**
     * <p>BigDecimal到Int转换</p>
     *
     * @param value BigDecimal
     * @return 整型
     */
    public static Integer bigDecimalToInt(BigDecimal value) {
        if (value == null) {
            return null;
        } else {
            return value.intValue();
        }
    }

    /**
     * <p>BigDecimal到Long转换</p>
     *
     * @param value BigDecimal
     * @return 长整型
     */
    public static Long bigDecimalToLong(BigDecimal value) {
        if (value == null) {
            return null;
        } else {
            return value.longValue();
        }
    }

    /**
     * <p>BigDecimal到Float转换</p>
     *
     * @param value BigDecimal
     * @return 浮点
     */
    public static Long bigDecimalToFloat(BigDecimal value) {
        if (value == null) {
            return null;
        } else {
            return value.longValue();
        }
    }

    /**
     * <p>BigDecimal到double转换</p>
     *
     * @param value BigDecimal
     * @return 浮点
     */
    public static Double bigDecimalToDouble(BigDecimal value) {
        if (value == null) {
            return null;
        } else {
            return value.doubleValue();
        }
    }

    /**
     * <p>字符串到日期转换</p>
     *
     * @param value   字符
     * @param pattern 格式
     * @return 日期
     * @throws ParseException
     */
    public static Date strToDate(String value, String pattern) {
        if (value == null) {
            return null;
        } else {
            try {
                return new SimpleDateFormat(pattern).parse(value);
            } catch (ParseException e) {
                throw new RuntimeException("格式化日期错");
            }
        }
    }

    /**
     * <p>日期转换到字符串</p>
     *
     * @param value   日期
     * @param pattern 格式
     * @return 字符串
     */
    public static String dateToStr(Date value, String pattern) {
        if (value == null) {
            return null;
        } else {
            return new SimpleDateFormat(pattern).format(value);
        }
    }

    /**
     * <p>日期转换到Int</p>
     *
     * @param value   日期
     * @param pattern 格式
     * @return int
     */
    public static Integer dateToInt(Date value, String pattern) {
        if (value == null) {
            return null;
        } else {
            return Integer.valueOf(new SimpleDateFormat(pattern).format(value));
        }
    }

    /**
     * 字符串转换为ByteBuffer
     *
     * @param value 字符串
     * @return 缓存
     */
    public static ByteBuffer strToByteBuffer(String value) {
        return ByteBuffer.wrap(value.getBytes());
    }

    /**
     * 任意类型转换
     *
     * @param value          目标值
     * @param conversionType 返回的类型
     * @return 希望值
     */
    @SuppressWarnings("unchecked")
    public static <T> T changeType(Object value, Class<?> conversionType) {
        if (Validate.isEmpty(value)) {
            return null;
        }

        //判断对象是否是类的实例  
        if (conversionType.isInstance(value)) {
            return (T) value;
        }
        if (conversionType.equals(Integer.class)) {
            return (T) TypeConver.getInt(value);
        }
        if (conversionType.equals(Float.class)) {
            return (T) TypeConver.getFloat(value);
        }
        if (conversionType.equals(Double.class)) {
            return (T) TypeConver.getDouble(value);
        }
        if (conversionType.equals(BigDecimal.class)) {
            return (T) TypeConver.getBigDecimal(value);
        }
        if (conversionType.equals(String.class)) {
            return (T) value.toString();
        }
        if (conversionType.equals(Short.class)) {
            return (T) TypeConver.getShort(value);
        }
        if (conversionType.equals(Map.class)) {
            if (value instanceof Map) {
                return (T) value;
            }
        }

        return null;
    }

    /**
     * 金额转字符串
     *
     * @param money 金额
     * @retura 结果
     */
    public static String money2Str(BigDecimal money) {
        if (money == null) {
            return "0.00";
        } else {
            return String.format("%.2f", money);
        }
    }

}
