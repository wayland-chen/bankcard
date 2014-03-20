package com.offke.core.common.util;

import com.offke.core.AppConst;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * <p>校园通GUID生成</p>
 *
 * @version 1.0
 * @since 2012/4/2
 */
public class Ids {
    /**
     * <p>生成GUID</p>
     *
     * @return GUID
     */
    public static String getUUID() {
        String s = UUID.randomUUID().toString();
        return MessageFormat.format(
                "{0}{1}{2}{3}{4}",
                s.substring(0, 8),
                s.substring(9, 13),
                s.substring(14, 18),
                s.substring(19, 23),
                s.substring(24));

    }

    public static String getRefnoMac() {
        String s = UUID.randomUUID().toString();
        return MessageFormat.format("{0}", s.substring(0, 8).toUpperCase());
    }

    /**
     * 获取交易编号
     *
     * @return 编号
     */
    public static synchronized String getTradeid() {
        long ret = (int) Math.random() * 9000 + 1000;
        return new SimpleDateFormat(AppConst.DatePattern7).format(new Date()) + ret;
    }

}
