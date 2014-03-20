package com.offke.core.status.procedure;

import com.offke.core.AppConst;
import com.offke.core.bu.struct.pojo.CalendarType;
import com.offke.core.common.util.DataTransition;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>服务端日期源</p>
 *
 * @version 1.0
 * @since 2012/04/23
 */
public class DateSource {
    public static Date getTradedate() {
        return new Date();
    }

    public static String getTradedate(String pattern) {
        return new SimpleDateFormat(pattern).format(getTradedate());
    }

    public static String getTradedateToStr() {
        return new SimpleDateFormat(AppConst.DatePattern1).format(getTradedate());
    }

    public static String getSysdatetime() {
        return new SimpleDateFormat(AppConst.DatePattern5).format(new Date());
    }

    public static Date getSysdate() {
        return new Date();
    }


    /**
     * <p>日期计算</p>
     *
     * @param field  the calendar field.
     *               <p>Calendar.DAY_OF_MONTH 计算天</p>
     *               <p>Calendar.DATE 计算天</p>
     *               <p>Calendar.MONTH 计算月</p>
     *               <p>Calendar.YEAR 计算月</p>
     * @param amount the amount of date or time to be added to the field.
     * @return 日期
     */
    public static Date calculatedDate(int field, int amount) {
        return calculatedDate(field, amount, getTradedate());
    }

    /**
     * <p>日期计算</p>
     *
     * @param field  the calendar field.
     *               <p>Calendar.DAY_OF_MONTH 计算天</p>
     *               <p>Calendar.DATE 计算天</p>
     *               <p>Calendar.MONTH 计算月</p>
     *               <p>Calendar.YEAR 计算月</p>
     * @param amount the amount of date or time to be added to the field.
     * @param date   日期
     * @return 日期
     */
    public static Date calculatedDate(int field, int amount, Date date) {
        Calendar newDate = Calendar.getInstance();
        newDate.setTime(date);
        newDate.add(field, amount);

        return newDate.getTime();
    }

    /**
     * <p>日期计算</p>
     *
     * @param field   the calendar field.
     *                <p>Calendar.DAY_OF_MONTH 计算天</p>
     *                <p>Calendar.DATE 计算天</p>
     *                <p>Calendar.MONTH 计算月</p>
     *                <p>Calendar.YEAR 计算月</p>
     * @param amount  the amount of date or time to be added to the field.
     * @param date    日期
     * @param pattern 格式化
     * @return 日期
     */
    public static String calculatedDate(int field, int amount, Date date, String pattern) {
        Date time = calculatedDate(field, amount, date);
        return DataTransition.dateToStr(time, pattern);
    }

    /**
     * <p>日期计算</p>
     *
     * @param field   the calendar field.
     *                <p>Calendar.DAY_OF_MONTH 计算天</p>
     *                <p>Calendar.DATE 计算天</p>
     *                <p>Calendar.MONTH 计算月</p>
     *                <p>Calendar.YEAR 计算月</p>
     * @param amount  the amount of date or time to be added to the field.
     * @param pattern 格式化
     * @return 日期
     */
    public static String calculatedDate(int field, int amount, String pattern) {
        return calculatedDate(field, amount, getTradedate(), pattern);
    }


    /**
     * <p>天、月、季节、年的日期相减</p>
     *
     * @param operationdate   减数
     * @param byoperationdate 被减数
     * @param field           类型
     * @return 成功=天数,失败=-1
     */
    public static long calculatedDate(Date operationdate, Date byoperationdate, CalendarType field) {
        long result = 0;
        long currDeal = 0;
        long yearFirst, yearSecond;
        long monthFirst, monthSecond;
        long dayFirst, daySecond;
        Calendar byoperationCal = Calendar.getInstance();
        Calendar operationCal = Calendar.getInstance();
        byoperationCal.setTime(operationdate);
        operationCal.setTime(byoperationdate);
        switch (field) {
        /*
         * 计算天
         */
            case DAY_OF_MONTH:
                currDeal = operationCal.getTime().getTime() - byoperationCal.getTime().getTime();
                result = currDeal / (24 * 60 * 60 * 1000);
                if (result < 0) {
                    return -1;
                }
                break;
        /*
         * 计算月
         */
            case MONTH:
                yearFirst = operationCal.get(Calendar.YEAR);
                yearSecond = byoperationCal.get(Calendar.YEAR);
                monthFirst = operationCal.get(Calendar.MONTH);
                monthSecond = byoperationCal.get(Calendar.MONTH);
                result = (yearFirst - yearSecond) * 12 + (monthFirst - monthSecond);
                if (result < 0) {
                    return -1;
                } else if (result > 0) {
                    dayFirst = operationCal.get(Calendar.DAY_OF_MONTH);
                    daySecond = byoperationCal.get(Calendar.DAY_OF_MONTH);
                    if (dayFirst - daySecond < 0) {
                        result -= 1;
                    }
                }
                break;
        /*
         * 计算季节
         */
            case Season:
                yearFirst = operationCal.get(Calendar.YEAR);
                yearSecond = byoperationCal.get(Calendar.YEAR);
                monthFirst = operationCal.get(Calendar.MONTH);
                monthSecond = byoperationCal.get(Calendar.MONTH);
                result = (yearFirst - yearSecond) * 12 + (monthFirst - monthSecond);
                if (result < 0) {
                    return -1;
                } else if (result > 0) {
                    dayFirst = operationCal.get(Calendar.DAY_OF_MONTH);
                    daySecond = byoperationCal.get(Calendar.DAY_OF_MONTH);
                    if (dayFirst - daySecond < 0) {
                        result -= 1;
                    }
                }
                result = result / 3;
                break;
        /*
         * 计算年
         */
            case YEAR:
                yearFirst = operationCal.get(Calendar.YEAR);
                yearSecond = byoperationCal.get(Calendar.YEAR);
                result = yearFirst - yearSecond;
                if (result < 0) {
                    return -1;
                } else if (result > 0) {
                    monthFirst = operationCal.get(Calendar.MONTH);
                    monthSecond = byoperationCal.get(Calendar.MONTH);
                    dayFirst = operationCal.get(Calendar.DAY_OF_MONTH);
                    daySecond = byoperationCal.get(Calendar.DAY_OF_MONTH);
                    if ((monthFirst - monthSecond) < 0 || (dayFirst - daySecond) < 0) {
                        result -= 1;
                    }
                }
                break;
        }

        return result;
    }

    /**
     * <p>天、月、季节、年的日期相减</p>
     *
     * @param byoperationdate 被减数
     * @param field           类型
     * @return 成功=天数,失败=-1
     */
    public static long calculatedDate(Date byoperationdate, CalendarType field) {
        return calculatedDate(getTradedate(), byoperationdate, field);
    }

}
