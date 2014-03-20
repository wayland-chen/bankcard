package com.offke.core.bu.exception;


/**
 * <p>基础参数设置</p>
 *
 * @version 1.0
 * @since 2012/04/27
 */
public interface RBaseCode extends RGlobalParameter {
    int FEETYPE_COMM = 999;//通用收费类别
    int TRANSTYPE_FREE = 999;//免费
    int USE_CARD_TYPE_NULL = 0;//无卡交易
    int USE_CARD_TYPE_ONLINE = 1;//联机交易
    int USE_CARD_TYPE_OFFLINE = 2;//脱机交易
    int USE_CARD_TYPE_NEWCARD = 3;//换卡交易

    int VALUE_NULL = -1;//空值
    int STATE_VALID = 1;//有效
    int STATE_INVALID = 2;//无效

    int VOCTYPE_DEFALUT = 100;//记帐凭证默认类型
    /*种子密钥*/
    String STATIC_SEED_KEY = "1234567890123456";//数据库中存储的密码的种子密钥
    int WORKTIME_INTERVAL = 600;// 秒

    /* 设备厂商类型 */
    int PHYTYPE_999_DEV = 1000;
    int PHYTYPE_HD_DEV = 1001;
    int PHYTYPE_HUNDURE_DEV = 1002;
    // 根节点ID
    int ROOT_deviceid = 1;

    //CPU卡密钥定义
    int MAINKEY = 1;//主密钥
    int DPK1 = 11;//消费密钥1
    int DPK2 = 12;//消费密钥2
    int DLK1 = 21;//圈存密钥1
    int DLK2 = 22;//圈存密钥1
    int DTAC1 = 31;//内部密钥1
    int DTAC2 = 32;//内部密钥2
    int DUK = 40;//PIN解锁
    int DRPK = 50;//PIN重装
    int DAMK = 60;//维护密钥
    int DACK1 = 71;//外部认证密钥1
    int DACK2 = 72;//外部认证密钥2
    int DACK3 = 73;//外部认证密钥3
    int LDACK = 81;//小钱包外部认证密钥
    int LDAMK = 82;//小钱包维护密钥

    /*
    //系统主键内容
    String KEYTYPE_TERMID    =      "TERMID"                //终端号
    String KEYTYPE_CARDACCNO  =     "CARDACCNO"                 //账号
    String KEYTYPE_SHOPACCNO   =    "SHOPACCNO"                 //账号
    String KEYTYPE_NETACCNO    =    "NETACCNO"                  //账号
    String KEYTYPE_CARDNO      =    "CARDNO"                //卡号
    String KEYTYPE_CUSTOMER    =    "CUSTID"                //客户号
    String KEYTYPE_SHOP      =      "SHOPID"                //商户号
    String KEYTYPE_SUBSYSTEM    =   "SYSID"                 //子系统注册表
    String KEYTYPE_VOUCHERID    =   "VOUCHERID"             //凭证表ID
    String KEYTYPE_SUBLEDGERID    = "SUBLEDGERID"               //明细账ID
    String KEYTYPE_WATERFEECFG    = "WATERFEECFG"           //水控费率参数
    //String KEYTYPE_PHYDEVICE     =    "T_PIF_PHYDEVICE"           //设备物理结构信息
    //String KEYTYPE_DEVTIME    =   "T_PIF_DEVTIME"         //设备工作时间段设置
    //String KEYTYPE_DEVASSET     =     "T_PIF_DEVASSET"            //设备资产表
    String KEYTYPE_MESLIST    =     "MSGID"                     //消息队列
    //String KEYTYPE_DEVMONITOR        =    "T_MIF_DEVMONITOR"      //监控设备表
    //String KEYTYPE_MIF_CONSUME     =      "T_MIF_CONSUME"             //监控异常消费流水
    //String KEYTYPE_MIF_TRAN       =       "T_MIF_TRAN"                    //监控异常转帐流水
    //String KEYTYPE_MIF_CARDOPERATE   =    "T_MIF_CARDOPERATE"         //监控异常卡操作流水
    //String KEYTYPE_MIF_CARDDBINCON   =    "T_MIF_CARDDBINCON"         //监控卡库不平异常表
    //String KEYTYPE_MIF_SYSSTATE      =    "T_MIF_SYSSTATE"                //监控系统状态异常表
    //String KEYTYPE_MIF_ALARMOP      =     "T_MIF_ALARMOP"             //报警处理记录表
    //String KEYTYPE_MIF_TRADESERIALERRORERROR   =  "T_MIF_TRADESERIALERROR"                //监控交易流水异常表
    //String KEYTYPE_MIF_TRADESERIALERROR        =      "T_MIF_TRADESERIAL"             //交易流水表
    //String KEYTYPE_TMPPERSON     "TMP_PERSON_ID"         =        //临时 人员ID
    //String KEYTYPE_CUT_INFO_UPD  "T_TIF_CUT_INFO_UPDATE"     =   // 客户信息更新表ID
    String KEYTYPE_DOOR_CARDLIST   "T_DOOR_CARDLIST"       // 人员名单版本
    //String KEYTYPE_DOOR_DEVICE_WORKTIME      "T_DOOR_DEVICE_WORKTIME"// 门禁设备工作时间段表
    String KEYTYPE_DOOR_HOLIDAY                "t_doorholiday"     //门禁节假日
    String KEYTYPE_DOOR_DEV_HLD                "T_DOOR_DEVICE_HOLIDAY_VER" ;//门禁机节假日版本                      //
    String KEYTYPE_MEAL_TYPE                   "T_PIF_MEAL_TYPE"   ;//商户餐次定义
    String KEYTYPE_DOOR_time               "T_DOOR_TIME_SECT"  ;//门禁时间段
    String KEYTYPE_DOOR_WEEKS              "T_DOOR_WEEKS" ;//门禁时间段组
    String KEYTYPE_DOOR_GROUP              "T_DOOR_GROUP" ;//门禁组
    String KEYTYPE_DOOR_TIME_GROUP         "T_DOOR_TIMES_GROUP" ;//门禁时间段组
    String KEYTYPE_PIF_SUB_UPDATE          "T_PIF_SUB_UPDATE" ;//子系统更新名单表
    String KEYTYPE_SUBSIDYNO               "SUBSIDYNO" ;//补助批次号
    String KEYTYPE_T_ATTSERIAL             "T_ATTSERIAL"
    String KEYTYPE_DOORDTL                 "DOORDTL"   //门禁流水
    String KEYTYPE_DOORDOWNLOAD            "T_DOORDOWNLOAD"    //门禁下发名单表
    String KEYTYPE_SMLDTL                  "SMLDTL" ;// 小钱包流水号
    */

    String KEYTYPE_ISBP_SERIALNO = "ISBP_SERIALNO";//ISBP报盘文件

    String KEYTYPE_PLANTASK = "PLANTASK";

    //结算部分
    int REPORT_SERI_TYPE = 1;// 结算部分 操作情况汇总报表的 字典大类为 1 Dean 2004-8-17 11:43
    int CUSTSTAT_NORMAL = 0;//客户状态--正常

    //内部帐号的定义宏，一般不会改变的
    String INNER_ACCOUNT_CASH = "1011";//现金帐号
    String INNER_ACCOUNT_BANKDEPOSIT = "1021";//银行存款帐号

    String INNER_ACCOUNT_BANKTRANSFER = "2031";//银行划拨帐号
    String INNER_ACCOUNT_FINANCETRANSER = "2041";//财务划拨帐号

    /* 交易代码宏定义
     *  定义规则：TXCODE_ + 实际意义组合。
     */
    int TXCODE_BANK_SCHOOL = 240001;//圈存转帐
    int TXCODE_BANK_DETRANS = 241011;//圈存冲正
    int TXCODE_INNERTRANS = 240155;//内部帐号转帐
    int TXCODE_WITHDRAWMNGFEE = 240156;//退管理费
    int TXCODE_MAKEUPSERIAL = 240157;//补帐流水
    int TXCODE_GET_SUBSIDY = 240104;//领取补助

    /* 交易代码宏定义
     *  定义规则：TXCODE_ + 实际意义组合
     */
    int TXCODE_AMBIGUITY = 0;//不明确的交易
    int TXCODE_COSUME_LOG = 930031;//消费流水
    int TXCODE_SUBSIDY_LOG = 930033;//补助流水
    int TXCODE_DEPOSIT_LOG = 930034;//充值流水
    int TXCODE_DRAW_DEPOSIT_LOG = 847107;//现金支取
    int TXCODE_WITHDRAW_LOG = 847107;//取款流水
    int TXCODE_CHECKOUT_CUR = 930035;//结账流水
    int TXCODE_DEPOSITMANAGE_LOG = 930036;//充值管理流水
    int TXCODE_CARD_LOSS = 930001;//卡挂失流水
    int TXCODE_CARD_COMEBACK_LOSS = 930002;//卡解挂流水
    int TXCODE_MODIFICATIONPW = 930003;//更改卡密码流水
    int TXCODE_WRITE_ERROR = 847108;//卡写失败更新卡状态
    int TXCODE_CARD_OPEN_CASH = 847101;//发行正式(现金)
    int TXCODE_CARD_OPEN_BILL = 8471012;//发行正式卡(支票)
    int TXCODE_CARD_OPEN_FUNDBOOK = 8471013;//发行正式卡(经费本)
    int TXCODE_CARD_OPEN_OTHER = 8471014;//发行正式卡(其他)
    int TXCODE_CARD_OPEN_TMP_CASH = 847124;//发行记名临时卡(现金)
    int TXCODE_CARD_OPEN_TMP_BILL = 8471242;//发行记名临时卡(支票)
    int TXCODE_CARD_OPEN_TMP_FUNDBOOK = 8471243;//发行记名临时卡(经费本)
    int TXCODE_CARD_OPEN_TMP_OTHER = 8471244;//发行记名临时卡(其他)

    int TXCODE_TEMPCARD_OPEN = 847116;//发行临时卡
    int TXCODE_CALLBACK_CARD = 847105;//收回卡
    int TXCODE_SAVING_CASH = 847106;//现金充值
    int TXCODE_REVERSE_CASH = 8471061;//现金充值冲正
    int TXCODE_SAVING_BILL = 8471062;//支票充值
    int TXCODE_SAVING_FUNDBOOK = 8471063;//经费本充值
    int TXCODE_SAVING_OTHER = 8471064;//其他充值
    int TXCODE_CASH_DEPOSIT = 847107;//现金支取
    int TXCODE_TMPCARD_OPEN = 847116;//发行过渡临时卡
    int TXCODE_FREEZE_CARD = 847117;//冻结卡
    int TXCODE_UNFREEZE_CARD = 847118;//解冻卡
    int TXCODE_REWRITE_CARD = 847119;//补写卡
    int TXCODE_CHANGE_CARD = 8471040;//补办卡
    int TXCODE_LOSTNOMALCARD_LOGOUT = 8471041;//挂失正式卡注销
    int TXCODE_LOSTTMPCARD_LOGOUT = 8471042;//挂失临时卡注销转账
    int TXCODE_UNLOSTTMPCARD_LOGOUT = 8471043;//非挂失临时卡注销转账
    int TXCODE_CARD_OPEN_FOR_TEMP = 847125;//发行非记名临时卡
    int TXCODE_CARD_OPEN_VIP_CASH = 847126;//发行贵宾临时卡(现金)
    int TXCODE_CARD_OPEN_VIP_BILL = 8471262;//发行贵宾临时卡(支票)
    int TXCODE_CARD_OPEN_VIP_FUNDBOOK = 8471263;//发行贵宾临时卡(经费本)
    int TXCODE_CARD_OPEN_VIP_OTHER = 8471264;//发行贵宾临时卡(其他)
    int TXCODE_CARD_DBCR = 847127;//手工借贷
    int TXCODE_SHOP_OPEN = 843335;//商户开户
    int TXCODE_SHOP_LOGOUT = 843336;//商户注销
    int TXCODE_TX_REVEAL = 847183;//交易冲正
    int TXCODE_SET_SUBSIDY = 847132;//下发补助
    int TXCODE_DESUBSIDY_DOWN = 847140;//扣款下发
    int TXCODE_MOBILE_TRANS = 847133;//手机充值
    int TXCODE_ELECT_TRANS = 847134;//电控转账
    int TXCODE_MERCH_OPEN = 847135;//发行商户卡
    int TXCODE_MERCH_CLOSE = 847136;//注销商户卡
    //int TXCODE_ELECT_TRANS     =       847136  ;//电控转账

    // 上大账务定义
    int TXCODE_FAN_PAY_MONEY = 847220;//充值解款
    int TXCODE_FAN_RUSH_PAY = 847221;//冲正充值解款

    //水控转账
    int TXCODE_CONSUME = 847301;//大钱包转小钱包扣款
    int TXCODE_SAVING_SMALL_PACKET = 847300;//小钱包充值
    //int TXCODE_REWRITE_CARD_PACKET=   847303//水控大钱包补写卡
    int TXCODE_RESET_DEVICE = 847303;//设置重置设备
    int TXCODE_COLLECT_IN_ACCOUNT = 847306;//采集总额入账

    int TXCODE_FAN_BALANCE = 847222;//商户消费结算
    int TXCODE_FAN_RUSH_BALANCE = 847223;//冲正商户消费结算

    // 操作员授权卡定义
    int TXCODE_ISSUE_AUTHCARD = 847226;//发行授权卡
    int TXCODE_CANCEL_AUTHCARD = 847227;//回收授权卡
    int TXCODE_MODIFY_AUTHCARD = 847228;//更新授权卡
    int TXCODE_LOSS_AUTHCARD = 847229;//挂失授权卡
    int TXCODE_UNLOSS_AUTHCARD = 847230;//解挂授权卡

    int TXCODE_RAKEOFF = 847231;//佣金划拨
    int TXCODE_AGIO = 847232;//佣金折扣

    //海事考试报名
    int TXCODE_TURNOVER = 847233;//考试报名

    /* 交易代码宏定义
     *  添加：耿刚
     *  时间：2004-09-23
     *  定义规则：TXCODE_ + 实际意义组合,备注:闻剑统一规定。
     */
    int TXCODE_DEVLOGIN = 930054;//设备签到
    int TXCODE_DEVLOGOUT = 930055;//设备签出
    int TXCODE_OPERLOGIN = 820351;//操作员登陆
    int TXCODE_OPERLOGOUT = 820352;//操作员登出
    int TXCODE_SYSLOGIN = 930052;//前置机签到
    int TXCODE_SYSLOGOUT = 930053;//前置机签出

    //下传设备主参数
    String XML_KEY_DEVPHY999_NO = "DEVPHYID";//终端设备id
    String XML_KEY_DEV999_NO = "DEV999_NO";//机号
    String XML_KEY_DEV999_ID = "DEV999_ID";//注册号
    String XML_KEY_BAUDRATE = "BAUDRATE";//波特率
    String XML_KEY_SYSPWD = "SYSPWD";//系统员密码
    String XML_KEY_ADMPWD = "ADMPWD";//管理员密码
    String XML_KEY_PWDONOFF = "PWDONOFF";//密码开关
    String XML_KEY_CARDSTR = "CARDSTR";//卡片结构
    String XML_KEY_CARDUSENUM = "CARDUSENUM";//卡的最大使用次数\允许最大消费次数
    String XML_KEY_MAXDEPOSIT = "MAXDEPOSIT";//钱包最高存款限额
    String XML_KEY_MINDEPOSIT = "MINDEPOSIT";//钱包最低剩余款限额
    String XML_KEY_RATION = "RATION";//定值收费方式使用的定值额\定值金额
    String XML_KEY_PUSERNO = "PUSERNO";//钱包代码\钱包号
    String XML_KEY_MAXTRADE = "MAXTRADE";//每次交易最高额\大额消费限额
    String XML_KEY_VCARDSET = "VCARDSET";//终端机适用用户卡类别\卡类(用设置128类卡)
    String XML_KEY_FUNONOFF = "FUNONOFF";//收费机增强功能开关
    String XML_KEY_CLOCK = "CLOCK";//   //时钟(上传、下传)

    //设置补助开关
    //设置消费快捷编号
    String XML_KEY_SUBSIDYONOFF = "SUBSIDYONOFF";//补助开关

    //设置消费编号及版本
    //设置消费时间段参数
    String XML_KEY_CONCODEVER = "CONCODEVER";//消费编号版本
    String XML_KEY_CONCODE = "CONCODE";//消费编号

    //设置消费快捷编号
    String XML_KEY_CONKEYCODE = "CONKEYCODE";//消费快捷编号

    //设置消费时间段参数
    String XML_KEY_STARTDT = "STARTDT";//开始时间
    String XML_KEY_ENDDT = "ENDDT";//结束时间

    //防火防盗状态设置
    String XML_KEY_FTFLAG = "FTFLAG";//防火设置标志

    //设备控制
    String XML_KEY_CONTROLONOFF = "CONTROLONOFF";//控制命令值

    //采集消费流水
    String XML_KEY_FEETYPE = "FEETYPE";//收数类型
    String XML_KEY_STARTNUM = "STARTNUM";//收数起始流水号
    String XML_KEY_ENDNUM = "ENDNUM";//收数结束流水号

    //下传补助发放名单
    String XML_KEY_SUBSIDYFEE = "SUBSIDYFEE";//补助金额
    String XML_KEY_OUTNUM = "OUTNUM";//发放批次
    String XML_KEY_SUBSIDYTYPE = "SBSTYPE";//补助类型
    String XML_KEY_SUBSIDYFLAG = "SBSFLAG";//补助标志

    //下传设备档案信息
    String XML_KEY_DEVTYPE = "DEVTYPE";//机型代码
    String XML_KEY_DEVVERSION = "DEVVERSION";//设备版本号
    String XML_KEY_PORTCOUNT = "PORTCOUNT";//服务器端口总数
    String XML_KEY_FDEVPHY_ID = "FDEVPHY_ID";//上级设备物理ID
    String XML_KEY_PORTNO = "PORTNO";//服务器端口号
    String XML_KEY_status = "status";//设备状态
    String XML_KEY_JOINMODE = "JOINMODE";//链路模式
    String XML_KEY_COMADD = "COMADD";//通信地址
    String XML_KEY_PORT = "PORT";//通讯端口
    String XML_KEY_COMTYPE = "COMTYPE";//数据通讯方式
    String XML_KEY_LASTSHUTSERNO = "LASTSHUTSERNO";//终端轧帐流水号期末值
    String XML_KEY_LASTSHUTDATE = "LASTSHUTDATE";//终端轧帐时间期末值
    String XML_KEY_LASTTRASERNO = "LASTTRASERNO";//终端交易流水号期末值
    String XML_KEY_LASTTRADATE = "LASTTRADATE";//终端交易时间期末值

    String XML_KEY_OPERATEDATE = "OPERATE_DATE";//交易日期
    String XML_KEY_SERIALNO = "SERIAL_NO";//交易流水号
    String XML_KEY_TRADECODE = "TRADE_CODE";//交易码

    String XML_KEY_WEEKNO = "WEEKNO";//星期1-8
    String XML_KEY_CARDRIGHTTYPE = "CARDRIGHTTYPE";//卡权限类型
    String XML_KEY_DOORTIME1 = "T1";//门禁时间段1
    String XML_KEY_DOORTIME2 = "T2";//门禁时间段2
    String XML_KEY_DOORTIME3 = "T3";//门禁时间段3
    String XML_KEY_DOORTIME4 = "T4";//门禁时间段4
    String XML_KEY_DOORTIME5 = "T5";//门禁时间段5
    String XML_KEY_DOORTIME6 = "T6";//门禁时间段6
    String XML_KEY_DOORTIME7 = "T7";//门禁时间段7
    String XML_KEY_DOORTIME8 = "T8";//门禁时间段8
    String XML_KEY_WEEK_DAY1 = "WD1";//星期1
    String XML_KEY_WEEK_DAY2 = "WD2";//星期2
    String XML_KEY_WEEK_DAY3 = "WD3";//星期3
    String XML_KEY_WEEK_DAY4 = "WD4";//星期4
    String XML_KEY_WEEK_DAY5 = "WD5";//星期5
    String XML_KEY_WEEK_DAY6 = "WD6";//星期6
    String XML_KEY_WEEK_DAY7 = "WD7";//星期7
    String XML_KEY_SEQNO = "SEQ";//序号
    String XML_KEY_HOLIDAY = "HOLIDAY";//门禁门禁节假日
    String XML_KEY_WORKMODE = "WORKMODE";//工作模式
    String XML_KEY_LOCK1_TIME = "LOCK1";//锁1开的时间
    String XML_KEY_LOCK2_TIME = "LOCK2";//锁2开的时间
    String XML_KEY_IS_ALLEYWAY = "ALLEYWAY";//是否通道
    String XML_KEY_IS_SAVE = "SAVE";//是否保存打卡记录
    String XML_KEY_IS_LCD = "LCD";//是否液晶显示

    // 写卡失败标志
    String CARDWFAIL_NORMAL = "N";//普通

    // 写卡失败标志记录是或者否, 进入写卡失败表
    String CARDWFAIL_PACKET_DEAL_FLAG_Y = "Y";// 写卡钱包失败标记
    String CARDWFAIL_PACKET_DEAL_FLAG_N = "N";

    //wen jian add
    String FEETYPE_CASH = "C";//收费方式--现金
    String FEETYPE_ACCOUNT = "M";//收费方式--个人消费帐户
    // wenjian add end

    String SCHOOL_CODE = "XYK00002"; //院校代码－－银行定义的
    String STATIC_KEY = "87906576"; //银行接口的静态密钥－－银行提供的

    //交易类型定义
    int TXTYPE_SAVING_CASH = 1;//现金充值
    int TXTYPE_SAVING_BILL = 2;//支票充值
    int TXTYPE_SAVING_FUNDBOOK = 3;//经费本充值
    int TXTYPE_SAVING_OTHER = 4;//其他充值

    int TXTYPE_DRAW_CASH = 5;//现金支取
    int TXTYPE_DRAW_BILL = 6;//支票支取
    int TXTYPE_DRAW_FUNDBOOK = 7;//经费本支取
    int TXTYPE_DRAW_OTHER = 8;//其他支取

    int TXTYPE_PRE_TOLL_BOARD = 9;//预收搭伙费
    int TXTYPE_TOLL_BOARD = 10;//商户收搭伙费
    int TXTYPE_TOLL_CARDCOST = 11;//收卡成本费
    int TXTYPE_TOLL_CHARGE = 12;//收手续费
    int TXTYPE_TOLL_DEPOSIT = 13;//收押金
    int TXTYPE_TOLL_DEPRECIATION = 14;//学校收搭伙费
    int TXTYPE_TOLL_MESS_CONSUME = 15;//食堂消费

    int TXTYPE_RETURN_DEPOSIT = 16;//退押金
    int TXTYPE_RETURN_BOARD = 17;//退搭伙费

    int TXTYPE_DEDUCT_BALANCE = 18;//扣卡余额
    int TXTYPE_DEDUCT_BOARD = 19;//扣搭伙费
    int TXTYPE_DEDUCT_DEPOSIT = 20;//扣押金

    int TXTYPE_BANK_TRANSFER = 21;//银行转账
    int TXTYPE_BANK_PRE_TOLL_BOARD = 22;//银行转帐预收搭伙费
    int TXTYPE_SUBSIDY_CASH = 23;//下发补助(现金)
    int TXTYPE_GET_SUBSIDY = 24;//领取补助
    int TXTYPE_PRE_TOLL_BOARD_BILL = 25;//预收搭伙费(支票)
    int TXTYPE_PRE_TOLL_BOARD_FUNDBOOK = 26;//预收搭伙费(经费本)
    int TXTYPE_TOLL_CHARGE_BILL = 27;//收手续费(支票)
    int TXTYPE_TOLL_CHARGE_FUNDBOOK = 28;//收手续费(经费本)
    int TXTYPE_TOLL_CARDCOST_BILL = 29;//收卡成本费(支票)
    int TXTYPE_TOLL_CARDCOST_FUNDBOOK = 30;//收卡成本费(经费本)
    int TXTYPE_TOLL_DEPOSIT_BILL = 31;//收押金(支票)
    int TXTYPE_TOLL_DEPOSIT_FUNDBOOK = 32;//收押金(经费本)
    int TXTYPE_TOLL_DEPRECIATION_BILL = 33;//收卡折旧费(支票)'
    int TXTYPE_TOLL_DEPRECIATION_FUNDBOOK = 34;//收卡折旧费(经费本)
    int TXTYPE_RETURN_DEPOSIT_BILL = 35;//退押金(支票)
    int TXTYPE_RETURN_DEPOSIT_FUNDBOOK = 36;//退押金(经费本)
    int TXTYPE_RETURN_BOARD_BILL = 37;//退搭伙费(支票)
    int TXTYPE_RETURN_BOARD_FUNDBOOK = 38;//退搭伙费(经费本)
    int TXTYPE_SUBSIDY_BILL = 49;//下发补助(支票)
    int TXTYPE_SUBSIDY_FUNDBOOK = 50;//下发补助(经费本)
    int TXTYPE_SUBSIDY_PRE_TOLL_BOARD_CASH = 51;//补助预收搭伙费(现金)
    int TXTYPE_SUBSIDY_PRE_TOLL_BOARD_BILL = 52;//补助预收搭伙费(支票)
    int TXTYPE_SUBSIDY_PRE_TOLL_BOARD_FUNDBOOK = 53;//补助预收搭伙费(经费本)

    String DOOR_DEV_WORKTIME_UNUSE_VOL = "000000000000";// 门禁时间段未使用的版本标志

    int AUTO_TRANS = 1;//自动转帐
    int SELF_TRANS = 2;//自助转帐

    int POSDATA_REMAIN_MAXDAY = 60;//POS流水保存最大天数(距现在)    60
    int POSDATA_EXPIRE_MAXDAY = 40;//流水过期最大天数(距现在)       40
    int POSDATA_COLLECT_MAXDAY = 30;//流水补采最大天数(距现在)       30
    int RECENTDTL_MAXDAY = 31;//最近流水表最大日期           31

    //卡交易次数位图类型
    //#define CARDBITMAPTYPE_INC   '+'      //增值交易
    //#define CARDBITMAPTYPE_DEC      '-'       //POS消费类交易
    //#define CARDBITMAPTYPE_ONLINE '*'     //联机交易
    //#define CARDBITMAPTYPE_INCREV '#'     //增值交易冲正
    //#define CARDBITMAPTYPE_DECREV '~'        //扣款交易冲正
    String CARDBITMAPTYPE_INIT = "0";//重置
    String CARDBITMAPTYPE_REV = "/";//消费冲正
    String CARDBITMAPTYPE_POS_ONLINE = "-";//POS联机消费
    String CARDBITMAPTYPE_POS_OFFLINE = "|";//POS脱机消费
    String CARDBITMAPTYPE_SYS_ONLINE = "=";//非POS机消费，系统消费

    char CARDBITMAPTYPE_INIT_C = '0';//重置
    char CARDBITMAPTYPE_REV_C = '/';//消费冲正
    char CARDBITMAPTYPE_POS_ONLINE_C = '-';//POS联机消费
    char CARDBITMAPTYPE_POS_OFFLINE_C = '|';//POS脱机消费
    char CARDBITMAPTYPE_SYS_ONLINE_C = '=';//非POS机消费，系统消费

    int TRADE_TRANS = 240001;//自助转帐
    int TRADE_REVERSE = 240002;//银行卡转账功能冲正
    int BANK_QUERYBALA = 240003;// 查询银行卡余额
}
