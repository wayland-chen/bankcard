package com.offke.tradeunits.atoms.mq;

/**
 * 前置的错误代码-以后严格执行
 *

 * @version 1.0
 * @since 2012/06/15
 */
public class RAips  {
    public final static String Aips_ADDRESSCONFLICT = "2000"; // 地址冲突
    public final static String Aips_INVALIDMEAipsHANT = "2001"; // 无效商户
    public final static String Aips_SEIZURECARD = "2002"; // 没收卡
    public final static String Aips_TERMINALSTATEERROR = "2003"; // 终端状态错误
    public final static String Aips_AUTHCARD_ERROR = "2004"; // 无权限授权
    public final static String Aips_INVALIDMESSAGE = "2005"; // 无效报文
    public final static String Aips_INVALIDAMOUNT = "2006"; // 无效金额
    public final static String Aips_INVALIDCARDNO = "2007"; // 无效卡号
    public final static String Aips_INVALIDOPAipsARDNO = "2008"; // 无效操作员卡号
    public final static String Aips_NOORIGINALTRANS = "2009"; // 未能找到原交易
    public final static String Aips_DATAGRAMERROR = "2010"; // 报文错
    public final static String Aips_CONFIOVERDUECARD = "2011"; // 过期的卡-没收
    public final static String Aips_CONFIPINWRONGOVERTIMES = "2012"; // 超过允许的PIN试输入-没收
    public final static String Aips_LISTVERSIONERROR = "2013"; // 黑名单版本错误
    public final static String Aips_CONFIREPORTLOSSCARD = "2014"; // 挂失卡-没收
    public final static String Aips_CONFIBESTOLENCARD = "2015"; // 被窃卡-没收
    public final static String Aips_OVERDUECARD = "2016"; // 过期的卡
    public final static String Aips_CARDBALANCE_EXCEED = "2017"; // 卡余额超限
    public final static String Aips_VERSIONERROR = "2018"; // 版本错误(黑名单版本除外)
    public final static String Aips_NOTSUFFICIENT = "2019"; // 无足够的存款
    public final static String Aips_UNALLOWEDTRANSFOAipsARDHOLDER = "2020"; // 不允许持卡人进行的交易
    public final static String Aips_UNALLOWEDTRANSFORTERMINAL = "2021"; // 不允许终端进行的交易
    public final static String Aips_ORIGINALAMOUNTWRONG = "2022"; // 原始金额不正确
    public final static String Aips_GETCASHOVERTIMES = "2023"; // 超出取款次数限制
    public final static String Aips_PINWRONGOVERTIMES = "2024"; // 允许的输入PIN次数超限
    public final static String Aips_BALANCEWRONG = "2025"; // 结算不平
    public final static String Aips_VOUCHERIDWRONG = "2026"; // 凭证号错误
    public final static String Aips_BATCHIDWRONG = "2027"; // 批号错误
    public final static String Aips_ORIGINALTRANSBECHANGED = "2028"; // 原交易已改变
    public final static String Aips_NOANSWER = "2029"; // 收不到发卡方的应答
    public final static String Aips_INVALIDTERMINAL = "2030"; // 无效终端
    public final static String Aips_INDATESWITCHING = "2031"; // 日期切换正在处理
    public final static String Aips_TRANSUNALLOWEDTEMP = "2032"; // 发卡方或POS中心不能操作
    public final static String Aips_TRANSREPEATED = "2033"; // 交易重复
    public final static String Aips_BALANCEWRONGANDBATCHSEND = "2034"; // 结算不平，要求批上送
    public final static String Aips_SYSTEMDISABLED = "2035"; // 系统异常、失效
    public final static String Aips_CARD_CANCEL = "2036"; // 卡已注销
    public final static String Aips_TRADE_FAILED = "2037"; // 后台交易失败
    public final static String Aips_BALANCE_EXCEED = "2038"; // 充值金额超限
    public final static String Aips_CARD_INVALID = "2039"; // 卡状态异常
    public final static String Aips_OTHER_ERR = "2999"; // 其他错误

    public final static String Aips_2081 = "2081";//系统故障
    public final static String Aips_2082 = "2082";//网络故障
    public final static String Aips_2083 = "2083";//数据库错误
    public final static String Aips_2089 = "2089";//系统维护中
    public final static String Aips_2810 = "2810";//前置机未注册
    public final static String Aips_2811 = "2811";//前置机未激活
    public final static String Aips_2812 = "2812";//前置机未签到
    public final static String Aips_2813 = "2813";//前置机已注销
    public final static String Aips_2814 = "2814";//前置机密钥错
    public final static String Aips_2815 = "2815";//前置机密钥错
    public final static String Aips_2820 = "2820";//pos未注册
    public final static String Aips_2821 = "2821";//pos未签到
    public final static String Aips_2822 = "2822";//pos未启用
    public final static String Aips_2823 = "2823";//pos已停用
    public final static String Aips_2824 = "2824";//pos已注销
    public final static String Aips_2825 = "2825";//pos终端号错误
    public final static String Aips_2826 = "2826";//pos无指定商户
    public final static String Aips_2827 = "2827";//pos非工作时间
    public final static String Aips_2828 = "2828";//pos无些功能
    public final static String Aips_2829 = "2829";//pos未授权
    public final static String Aips_2830 = "2830";//pos流水号重复
    public final static String Aips_2831 = "2831";//pos流水不存在
    public final static String Aips_2832 = "2832";//交易已冲正
    public final static String Aips_2833 = "2833";//搭伙费率错误
    public final static String Aips_2834 = "2834";//交易金额错
    public final static String Aips_2836 = "2836";//pos商户号错
    public final static String Aips_2840 = "2840";//商户号不存在
    public final static String Aips_2841 = "2841";//商户已经注销
    public final static String Aips_2842 = "2842";//商户类型错误
    public final static String Aips_2843 = "2843";//商户账户已止付
    public final static String Aips_2844 = "2844";//商户账户异常
    public final static String Aips_2845 = "2845";//商户余额不足
    public final static String Aips_2850 = "2850";//卡号不存在
    public final static String Aips_2851 = "2851";//卡已挂失
    public final static String Aips_2852 = "2852";//卡已冻结
    public final static String Aips_2853 = "2853";//卡已登记为坏卡
    public final static String Aips_2854 = "2854";//卡已锁定
    public final static String Aips_2855 = "2855";//卡已禁用
    public final static String Aips_2856 = "2856";//卡已过有效期
    public final static String Aips_2857 = "2857";//卡已注销
    public final static String Aips_2858 = "2858";//卡状态异常
    public final static String Aips_2859 = "2859";//卡无此权限
    public final static String Aips_2860 = "2860";//卡密码错误
    public final static String Aips_2861 = "2861";//卡交易次数重复
    public final static String Aips_2862 = "2862";//卡交易次数异常
    public final static String Aips_2863 = "2863";//卡补助序号异常
    public final static String Aips_2864 = "2864";//卡余额不足
    public final static String Aips_2865 = "2865";//卡已透支
    public final static String Aips_2866 = "2866";//卡余额超过限额
    public final static String Aips_2867 = "2867";//卡余额异常
    public final static String Aips_2868 = "2868";//卡帐户余额不足
    public final static String Aips_2869 = "2869";//卡帐户已透支
    public final static String Aips_2870 = "2870";//卡帐户异常
    public final static String Aips_2871 = "2871";//消费金额超限
    public final static String Aips_2880 = "2880";//授权卡号不存在
    public final static String Aips_2881 = "2881";//授权卡已挂失
    public final static String Aips_2882 = "2882";//授权卡已冻结
    public final static String Aips_2884 = "2884";//授权卡已禁用
    public final static String Aips_2885 = "2885";//授权卡未生效
    public final static String Aips_2886 = "2886";//授权卡已失效
    public final static String Aips_2887 = "2887";//授权卡已注销
    public final static String Aips_2888 = "2888";//授权卡无此权限
    public final static String Aips_2889 = "2889";//授权卡密码错误
    public final static String Aips_2890 = "2890";//充值已达到限额

    static {

    }

    /*
    public RAips(String message) {
        super(message);
        if (tranlsates.containsKey(message)) {
            super.remark = tranlsates.get(message);
        }
    }

    public RAips(String key, Object... args) {
        super(key, args);
    }
    */

}
