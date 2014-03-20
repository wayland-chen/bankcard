/**
 * <p>通用日期处理类</p>
 * <p>Description:通用日期处理函数</p>
 * <p>Copyright: Copyright (c) 2009-2099</p>
 * <p>Company: fmcc,newland</p>
 * @author huang yongjin 
 */
package com.offke.core.common.util;

import com.offke.core.status.procedure.DateSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    private static final int[] dayArray = new int[] // 每月的天数
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * 标准日期格式 MM/dd/yyyy
     */
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");
    /**
     * 标准时间格式 MM/dd/yyyy HH:mm
     */
    public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("MM/dd/yyyy HH:mm");
    /**
     * 带时分秒的标准时间格式 MM/dd/yyyy HH:mm:ss
     */
    public static final SimpleDateFormat DATE_TIME_EXTENDED_FORMAT = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    /**
     * ORA标准日期格式 yyyyMMdd
     */
    public static final SimpleDateFormat ORA_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
    /**
     * ORA标准时间格式 yyyyMMddHHmm
     */
    public static final SimpleDateFormat ORA_DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmm");
    /**
     * 带时分秒的ORA标准时间格式 yyyyMMddHHmmss
     */
    public static final SimpleDateFormat ORA_DATE_TIME_EXTENDED_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
    /**
     * 不包含日期的ORA标准时间格式 HHmmss
     */
    public static final SimpleDateFormat ORA_TIME_EXTENDED_FORMAT = new SimpleDateFormat("HHmmss");
    /**
     * yyyy-MM-dd
     */
    public static final SimpleDateFormat CHN_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * yyyy-MM-dd HH:mm
     */
    public static final SimpleDateFormat CHN_DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final SimpleDateFormat CHN_DATE_TIME_EXTENDED_FORMAT =
            new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss");

    /**
     * 无参构造函数，默认的日期为系统时间
     */
    public DateUtil() {
        today();
    }

    /**
     * 有参构造函数
     *
     * @param inValue 14位日期格式的字符串，不满14位的，后面补0处理
     */
    public DateUtil(String inValue) {
        SetDate(inValue);
    }

    /**
     * 有参构造函数
     *
     * @param mills 毫秒数
     */
    DateUtil(long mills) {
        setTimeInMillis(mills);
    }

    /**
     * 有参构造函数
     *
     * @param year   年
     * @param month  月
     * @param day    日
     * @param hour   时
     * @param minute 分
     * @param second 秒
     */
    DateUtil(int year, int month, int day, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute, second);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

    }

    /**
     * 设置日期函数
     *
     * @param inValue
     */
    public void SetDate(String inValue) {
        if (inValue.length() != 14) {// 不够14位日期格式的，后面都补0处理
            for (int i = inValue.length(); i < 14; i++) {
                inValue = inValue + "0";
            }
            System.out.println(inValue);
        }
        try {

            int year = Integer.parseInt(inValue.substring(0, 4));
            int month = Integer.parseInt(inValue.substring(4, 6));
            int day = Integer.parseInt(inValue.substring(6, 8));
            int hour = Integer.parseInt(inValue.substring(8, 10));
            int minute = Integer.parseInt(inValue.substring(10, 12));
            int second = Integer.parseInt(inValue.substring(12));

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day, hour, minute, second);
            this.year = calendar.get(Calendar.YEAR);
            this.month = calendar.get(Calendar.MONTH) + 1;
            this.day = calendar.get(Calendar.DAY_OF_MONTH);
            this.hour = calendar.get(Calendar.HOUR_OF_DAY);
            this.minute = calendar.get(Calendar.MINUTE);
            this.second = calendar.get(Calendar.SECOND);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 取得当前时间
     */
    private void today() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateSource.getTradedate());
        /*
        this.year = calendar.get( Calendar.YEAR );
        this.month = calendar.get( Calendar.MONTH ) + 1;
        this.day = calendar.get( Calendar.DAY_OF_MONTH );
        this.hour = calendar.get( Calendar.HOUR_OF_DAY );
        this.minute = calendar.get( Calendar.MINUTE );
        this.second = calendar.get( Calendar.SECOND );
        */
    }

    /**
     * 格式化日期
     *
     * @param df
     * @return
     */
    public String format(SimpleDateFormat df) {
        // Date date = new Date(year-1900,month-1,day,hour,minute,second);
        // return df.format(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateSource.getTradedate());
        return df.format(calendar.getTime());
    }


    /**
     * 格式化日期，不推荐在外面直接调用这个方法 直接调用也可以，只是要保证strFormat的格式要正确
     *
     * @param strFormat
     * @return
     */
    public String format2(String strFormat) {
        /*
           * Date date = new Date(year-1900,month-1,day,hour,minute,second);
           * SimpleDateFormat df = new SimpleDateFormat(strFormat); return
           * df.format(date);
           */

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat(strFormat);
        calendar.setTime(DateSource.getTradedate());
        return df.format(calendar.getTime());
    }

    /**
     * toString方法 用yyyy-MM-dd HH:mm:ss格式
     */
    public String toString() {
        return this.format(this.CHN_DATE_TIME_EXTENDED_FORMAT);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 得到毫秒数 长整型
     */
    public long getTimeInMillis() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.month - 1, this.day, this.hour, this.minute, this.second);
        return calendar.getTime().getTime();
    }

    /**
     * 根据毫秒数来设置日期
     *
     * @param mills 毫秒数 长整型
     */
    public void setTimeInMillis(long mills) {
        Date dd = new Date(mills);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dd);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

    }

    /**
     * 判断当前年是否是闰年
     *
     * @return
     */
    public boolean isLeapYear() {
        return this.isLeapYear(year);
    }

    /**
     * 判断是否是闰年
     *
     * @param year 年
     * @return
     */
    public boolean isLeapYear(int year) {
        if ((year % 400) == 0)
            return true;
        else if ((year % 4) == 0) {
            if ((year % 100) == 0)
                return false;
            else
                return true;
        } else
            return false;
    }

    /**
     * 日期增减操作
     *
     * @param years   年数
     * @param months  月数
     * @param days    日数
     * @param hours   小时数
     * @param minutes 分数
     * @param seconds 秒数
     */
    public void _add(int years, int months, int days, int hours, int minutes, int seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(
                this.year + years,
                this.month - 1 + months,
                this.day + days,
                this.hour + hours,
                this.minute + minutes,
                this.second + seconds);
        setTimeInMillis(calendar.getTime().getTime());
    }

    /**
     * 年增减操作
     *
     * @param years 年数
     */
    public void addYear(int years) {
        if (month == 2 && day == 29)// 当前时间是闰年并且日期是2月29号
        {
            if (this.isLeapYear(year + years) == true)// 目标年是闰年时
                this._add(years, 0, 0, 0, 0, 0);
            else
                this._add(years, 0, -1, 0, 0, 0);// 目标年不是闰年，则2月只有28天，天数减去1
        } else
            this._add(years, 0, 0, 0, 0, 0);
    }

    /**
     * 月增减操作(与oracle对月份增减的操作一样)
     *
     * @param months 月数
     */
    public void addMonth(int months) {
        int this_day_end = daysOfMonth();// 本月的天数
        int that_day_end = getDayOfMonth(months);// 离现在n个月的天数
        if (this.day == this_day_end)
            this.day = that_day_end;// 如果现在是本月的最后一天,则day设置成that_day_end
        else if (this.day > that_day_end)
            this.day = that_day_end; // 如果离现在n个月的天数that_day_end比现在的day小,则现在的day设置成that_day_end

        this._add(0, months, 0, 0, 0, 0);
    }

    /**
     * 天数增减操作
     *
     * @param days 天数
     */
    public void addDay(int days) {
        this._add(0, 0, days, 0, 0, 0);
    }

    /**
     * 小时增减操作
     *
     * @param hours 小时数
     */
    public void addHour(int hours) {
        this._add(0, 0, 0, hours, 0, 0);
    }

    /**
     * 分钟增减操作
     *
     * @param minutes 分钟数
     */
    public void addMinute(int minutes) {
        this._add(0, 0, 0, 0, minutes, 0);
    }

    /**
     * 秒增减操作
     *
     * @param seconds 秒数
     */
    public void addSecond(int seconds) {
        this._add(0, 0, 0, 0, 0, seconds);
    }

    /**
     * 取本月中有多少天
     *
     * @return 本月的实际天数
     */
    public int daysOfMonth() {
        if (month > 12 || month < 0)
            return 0;
        if (month == 2 && this.isLeapYear())
            return 29;
        else
            return dayArray[month - 1];
    }

    /**
     * 获取离当前时间ms个月的月份的天数
     *
     * @param ms 月份
     * @return
     */
    public int getDayOfMonth(int ms) {
        int yy = ms / 12;
        int mm = ms % 12;
        int year = this.year + yy;
        int month = this.month + mm;

        if (month > 12) {
            month = month - 12;
            year = year + 1;
        }
        if (month < 1) {
            month = month + 12;
            year = year - 1;
        }

        if (month == 2 && isLeapYear(year))
            return 29;
        else
            return dayArray[month - 1];
    }

    /**
     * 判断字符串是否是合法的日期型
     *
     * @return
     */
    public static boolean isValidDate(String s, SimpleDateFormat dateFormat) {
        try {
            dateFormat.parse(s);
            return true;
        } catch (Exception e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            return false;
        }
    }

    /**
     * 得到两个日期之间的秒数,静态方法 调用方法：DateUtil.diffSec(DateUtil1, DateUtil2)
     * 要得到两个日期之间之间的天数，则再除以(3600*24)即可
     *
     * @param DateUtil1
     * @param DateUtil2
     * @return
     */
    public static long diffSec(DateUtil DateUtil1, DateUtil DateUtil2) {
        return (DateUtil1.getTimeInMillis() - DateUtil2.getTimeInMillis()) / 1000;
    }

    /**
     * 将字符串根据指定的日期格式转换为日期型
     *
     * @param dateString 日期
     * @param dateFormat 日期格式
     * @return 日期
     * @throws ParseException
     */
    public static Date parseString(String dateString, SimpleDateFormat dateFormat) throws ParseException {
        return dateFormat.parse(dateString);
    }

    /**
     * 日期加减处理模块 (将日期加上某些天或减去天数)返回日期,
     *
     * @param fromdate 原始日期
     * @param days     需要加减的值
     * @return 增加后返回日期
     */
    public static Date dateAdd(Date fromdate, int days) {
        Calendar intDate = Calendar.getInstance(); // java.util包
        intDate.setTime(fromdate);
        intDate.add(Calendar.DATE, days); // 日期减 如果不够减会将月变动
        return intDate.getTime();
    }

    /**
     * DateToString方法
     *
     * @param date       原始日期
     * @param dateFormat 日期格式
     * @return 返回日期
     */
    public static String toString(Date date, SimpleDateFormat dateFormat) {
        return dateFormat.format(date);
    }

    /**
     * 根据传入的日期格式，得到当前时间信息
     *
     * @return 当前时间
     */
    public static String getCurrentDate(SimpleDateFormat dateFormat) {
        return dateFormat.format(Calendar.getInstance().getTime());
    }

}
