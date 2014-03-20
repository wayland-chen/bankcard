package com.offke.core.common.util;

import java.math.BigDecimal;

/**
 * 计算相关
 *
 * @version 1.0
 * @since 2012/5/4
 */
public final class Calculate {

    /**
     * 设置精度，以及舍入规则
     *
     * @param bigDecimal   数据
     * @param newScale     - 要返回的 BigDecimal 值的标度。
     * @param roundingMode - 要应用的舍入模式
     * @return
     */
    public static BigDecimal setScale(BigDecimal bigDecimal, int newScale) {
        return bigDecimal.setScale(newScale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 设置精度，以及舍入规则(两位小数点)
     *
     * @param bigDecimal   数据
     * @param newScale     - 要返回的 BigDecimal 值的标度。
     * @param roundingMode - 要应用的舍入模式
     * @return
     */
    public static BigDecimal setScale(BigDecimal bigDecimal) {
        return bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 加法
     *
     * @param v1 数据1
     * @param v2 数据2
     * @return 结果
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 加法
     *
     * @param v1 数据1
     * @param va 数据2
     * @return 结果
     */
    public static BigDecimal add(BigDecimal v1, BigDecimal v2) {
        return v1.add(v2);
    }

    /**
     * 减法
     *
     * @param v1 数据1
     * @param v2 数据2
     * @return 结果
     */
    public static double subtract(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 减法
     *
     * @param v1 数据1
     * @param v2 数据2
     * @return 结果
     */
    public static BigDecimal subtract(BigDecimal v1, BigDecimal v2) {
        return v1.subtract(v2);
    }

    /**
     * 提供精确的乘法运算。
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double multiply(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算。
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static BigDecimal multiply(BigDecimal v1, BigDecimal v2) {
        return v1.multiply(v2);
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到
     * 小数点以后10位，以后的数字四舍五入。
     *
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     */
    public static BigDecimal div(BigDecimal v1, BigDecimal v2) {
        return divide(v1, v2, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static BigDecimal divide(BigDecimal v1, BigDecimal v2, int scale) {
        return v1.divide(v2, scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 提供取反运算。
     *
     * @param bigDecimal 数据
     * @return bigDecimal 数据取反
     */
    public static BigDecimal inverse(BigDecimal v1) {
        BigDecimal v2 = new BigDecimal(-1);
        return v1.multiply(v2);
    }

    /**
     * <p>金额比较函数,只比较小数点前2位</p>
     *
     * @param amt1 金额1
     * @param amt2 金额2
     * @return 0=相等，1=amt1>amt2，2=amt1<amt2
     */
    public static int amtcmp(double amt1, double amt2) {
        long lAmt1 = Double.valueOf(amt1).longValue();
        long lAmt2 = Double.valueOf(amt2).longValue();
        long lAmt = lAmt1 - lAmt2;
        if (0 == lAmt) {
            return 0;
        } else if (lAmt < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * <p>金额比较函数</p>
     *
     * @param amt1 金额1
     * @param amt2 金额2
     * @return 0=相等，1=amt1>amt2，2=amt1<amt2
     */
    public static int amtcmp(BigDecimal amt1, BigDecimal amt2) {
        amt1 = Calculate.setScale(amt1);
        amt2 = Calculate.setScale(amt2);
        if (amt1.equals(amt2)) {
            return 0;
        } else if (amt1.compareTo(amt2) < 0) {
            return -1;
        } else {
            return 1;
        }
    }

}
