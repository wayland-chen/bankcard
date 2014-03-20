/*
 * Pubdef.java  v1.00  2012-4-23
 * Peoject	com.wisdragon.splus-atom
 * Copyright (c) 2012 Wisdragon
 *
 * Filename	:	Pubdef.java  v1.00 2012-4-23
 * Project	: 	com.wisdragon.splus-atom
 * Copyight	:	Copyright (c) 2012 Wisdragon
 */
package com.offke.core.bu.exception;

/**
 * 公共参数定义.
 *
 * @author <a href="mailto:genliang.jiang@wisdragon.com">蒋根亮</a>
 * @version v1.00
 * @since 1.00 2012-4-23
 */
public class RPubdef extends RuntimeException {

    public static final int SUCCESS = 0;
    public static final int DB_SUCCESS = 0;
    public static final int DB_NOTFOUND = 100;

    public static final int DB_REPEAT = -803;
    public static final int DB_DISCONN = -1024;
    public static final int DB_BADCONN = -900;

    public static final int DB_TIMESTAMP = -818;
    public static final int DB_DEADLOCK = -911;
    public static final int DB_EXIST = 1;

    public static final int CODE_SCHOOL = 1000;
    public static final float MAX_RATIO = 0.5f;

    public static final int FEETYPE_COMM = 999;// 通用收费类别
    public static final int TRANSTYPE_FREE = 999;// 免费
    public static final int USE_CARD_TYPE_NULL = 0;// 无卡交易
    public static final int USE_CARD_TYPE_ONLINE = 1;// 联机交易
    public static final int USE_CARD_TYPE_OFFLINE = 2;// 脱机交易
    public static final int USE_CARD_TYPE_NEWCARD = 3;// 换卡交易

    public static final String CARD_STRUCT_VERSION = "1"; //制卡版本
    public static final String CARD_REGISTER_PUBLISH_CODE = "9156000027"; //发卡注册标识
    public static final String CARD_REGISTER_SERVICE_CODE = "D156000026"; //服务注册标识

    public static final char CARDBITMAPTYPE_INIT = '0';           //重置
    public static final char CARDBITMAPTYPE_REV = '/';         //消费冲正
    public static final char CARDBITMAPTYPE_POS_ONLINE = '-';     //POS联机消费
    public static final char CARDBITMAPTYPE_POS_OFFLINE = '|'; //POS脱机消费
    public static final char CARDBITMAPTYPE_SYS_ONLINE = '=';     //非POS机消费，系统消费

    //XML报文域
    public static final String XML_KEY_CARDID = "CARDID";//卡号
    public static final String XML_KEY_VERNUM = "VERNUM";//黑名单版本号
    public static final String XML_KEY_ADDDELSIGN = "ADDDELSIGN";//增删标志

}
