package com.offke.core.bu.exception;

/**
 * <p>全局参数定义</p>
 *
 * @version 1.0
 * @since 2012/04/27
 */
public interface RGlobalParameter {
    int GLOBE_FLAG_BALANCE = 1;//结算标志全局参数
    int GLOBE_MAXCARDBALANCE = 2;//最大充值金额
    int GLOBE_MONTH_ACC_TIME = 3;//月结日期
    int GLOBE_BLACKSHEETVER = 5;//黑名单版本
    int GLOBE_BLACKSHEETTIME = 6;//黑名单有效期
    int GLOBE_TMPCARDVALIDDATE = 7;//过渡临时卡有效期
    int GLOBE_TRADESEIALDATE = 8;//默认所有设备交易流水同步间隔
    int GLOBE_RENEWCARDDATE = 9;//默认挂失补办正式卡期限
    int GLOBE_NO_NAME_TMPCARDVALIDDATE = 10;//非记名临时卡有效期
    int GLOBE_MAX_CARDDB_NOBALANCE_TIMES = 11;//允许卡库不平最大次数邋（天数）
    int GLOBE_MAX_CARDDB_NOBALANCE_MONEY = 12;//允许卡库不平最大金额
    //int GLOBE_FLAG_SYNCCUT          =          13   ;//客户同步程序标识
    int GLOBE_FLAG_TEMPCARD_FEETYPE = 13;
    int GLOBE_FLAG_TEMPCARD_CUTTYPE = 14;
    int GLOBE_SCHOOL_NAME = 15;//一卡通用户名
    int GLOBAL_MAX_PER_SUBSIDY = 16;// 单笔补助最大金额

    /*监控部分－设备监控*/
    int GLOBE_DEV_BEATTIME = 1000;//设备心跳间隔时间
    int GLOBE_DEV_BEATCOUNT = 1001;//没有收到设备心跳次数阀值
    int GLOBE_DEV_BSVER = 1002;//设备黑名单版本号与系统当前版本号差值阀值       
    int GLOBE_DEV_STORGEP = 1003;//硬盘应用百分比警戒值                           
    int GLOBE_DEV_MEMORYP = 1004;//内存应用百分比警戒值                           
    int GLOBE_DEV_CPUP = 1005;//CPU应用百分比警戒值 
    int GLOBE_DEV_TIME = 1006;//设备时钟不同步阀值
    /*监控部分－应用监控*/
    int GLOBE_APP_BEATTIME = 1100;//应用心跳间隔时间
    int GLOBE_MIF_SUMTIME = 1101;//默认结算运行时间
    int GLOBE_MIF_NOTIFTIME = 1102;//默认报警处理时间全局参数(单位秒)

    int GLOBE_MIF_CARDOPERATETIMES = 1103;//监控定时长内卡操作次数，定时长全局参数
    int GLOBE_MIF_CARDOPERATECOUNT = 1104;//监控定时长内卡操作次数，卡操作次数全局参数
    int GLOBE_MIF_CARDOPERATEMAXFEE = 1105;//单次卡操作默认最大额全局参数

    int GLOBE_DEV_DAY_TRADE_LIMIT = 1106;// 终端日消费限额
    int GLOBE_DEV_ONCE_TRADE_LIMIT = 1107;// 终端单次消费限额

    /*三九相关*/
    int GLOBE_999_SHUTTIMES = 2005;//扎帐时间
    int GLOBE_999_DEVAUTHKEY = 2006;//设备授权密钥
    int GLOBE_999_65CARDKEY = 2007;//65类卡密钥

    /* 门禁相关*/
    int GLOBE_DOOR_HOLIDAY_MAX = 2008;//门禁节假日最大个数
    int GLOBE_PURSE_TWO_CARDKEY = 2009;//小钱包密钥
    int GLOBE_WATER_PURSE_NO = 2010;//水控钱包号

    /*小钱包上限, 单位为元*/
    int GLB_PACKET_LIMITS = 3001;
    ;//add by hhd
    int GLOBLE_SYSPARA_STATIC_KEY = 2006; /* 密钥*/

    int GLOBAL_SCHOOL_CODE = 2999; /* 学校编号 */

    // add by 汤成 2008-1-11 , 下载文件的路径
    int GLOBAL_DOWNLOAD_PATH = 2305;
    ;// 上传文件路径
    int GLOBAL_UPLOAD_PATH = 2306;

    //对账文件可执行程序存放路径
    int GOLBAL_EXC_ACC_CHK_PATH = 2100;
}
