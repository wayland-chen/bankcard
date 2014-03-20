package com.offke.core.common.util;

import com.offke.core.bu.struct.pojo.DataType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean isExpression(String prs_srcValue, DataType flag) {
        if (prs_srcValue == null || prs_srcValue.length() <= 0) {
            return false;
        }

        Pattern pattern = null;
        switch (flag) {
            case Int:
                pattern = Pattern.compile("^-?[0-9]\\d*$");
                break;
            case Float:
                pattern = Pattern.compile("^-?([0-9]\\d*\\.*\\d*|0\\.\\d*[0-9]\\d*|0?\\.0+|0)$");
                break;
            case Date:
                pattern = Pattern.compile("^[0-9]{4}/{1}[0-9]{1,2}/{1}[0-9]{1,2}$");
                break;
            case Emain:
                pattern = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
                break;
            case Hpone:
                pattern = Pattern.compile("\\d{3}\\d{8}|\\d{4}\\d{7}|\\d{8}|\\d{7}");
                break;
            case Dak:
                pattern = Pattern.compile("[0-9]\\d{5}(?!\\d)");
                break;
            case IdCard:
                pattern = Pattern.compile("(^\\d{15}$)|(\\d{17}(?:\\d|x|X)$)");
                break;
            case Subject:
                pattern = Pattern.compile(".{5}");
                break;

            default:
                pattern = Pattern.compile("(.)*");
                break;
        }

        Matcher iseffective = pattern.matcher(prs_srcValue);
        if (!iseffective.matches()) {
            return false;
        }

        return true;
    }

    /**
     * <p>多种方式来判断值是否为空</p>
     *
     * @param value 待判断的值
     * @return 是否为空
     */
    public static boolean isEmpty(Object value) {
        if (value == null) {
            return true;
        } else if (value != null && value instanceof String && value.toString().isEmpty()) {
            return true;
        } else if (value != null && value instanceof Number) {
            return false;
        }

        return false;
    }


    public static String getStrAfterDStr(String strSource, String strSplit, String strDefine) {
        String desStr = "";
        if (strSource == null) {
            return null;
        }

        String[] strArrary = strSource.split(strSplit);

        for (int i = 0; i < strArrary.length; i++) {
            int n_pos;
            n_pos = strArrary[i].indexOf(strDefine);
            desStr += strArrary[i].substring(n_pos + 1);
            if (i != strArrary.length - 1) {
                desStr += ",";
            }
        } //end for

        return desStr;
    }

    public static String getStrAfterDStr(String strSource, String strDefine) {
        String desStr = "";
        if (strSource == null) {
            return null;
        }

        int n_pos;
        n_pos = strSource.indexOf(strDefine);
        desStr = strSource.substring(n_pos + 1);

        return desStr;
    }
}
