package com.offke.core.bu.exception;


/**
 * <p>
 * 校园通的自定义常量字典
 * </p>
 *
 * @author xuehua.yang
 */
public class RDictionary extends RAcctrans {


    public RDictionary(String message) {
        super(message);
    }

    public final static String BFS_INIT = "pI";//初始
    public final static String BFS_GETFILE = "pF";//下载文件中
    public final static String BFS_CVT = "V";//转换中
    public final static String BFS_CHK = "C";//对账中
    public final static String BFS_SUCC = "S";//完成

    public final static String CHKRESULT_INIT = "I";//等待对账
    public final static String CHKRESULT_OK = "=";//完全一致
    public final static String CHKRESULT_DIFF = "X";//两边不相等
    public final static String CHKRESULT_LOCAL_NOTEXIST = "N";//本地不存在
    public final static String CHKRESULT_LOCAL_NOTACC = "U";//本地未记账
    public final static String CHKRESULT_BANK_NOTEXIST = "B";//银行不存在


    public final static String RESOLVED_CLOSE = "C";//关闭
    public final static String RESOLVED_EXCEPT = "E";//异常
    public final static String RESOLVED_ACC = "A";//一卡通已记账
    public final static String RESOLVED_IGN = "I";//忽略
    public final static String RESOLVED_PAUSE = "P";//暂不处理


    public final static String OPER_SYSTEM_KEY = "system";// 用户默认密码,长度为6个字符                                       
    public final static String DEFAULT_CUST_PWD = "666666";

    public final static String BANKCODE = "00";

    public final static String STATUS_NORMAL = "1";
    public final static String STATUS_DELETE = "2";

    public final static String TERMTYPE_OPER = "1";
    public final static String TERMTYPE_DEV = "2";
    public final static String TERMTYPE_ATM = "3";


    public final static int DTLSTATUS_INIT = 1;
    public final static int DTLSTATUS_FAIL = 2;           //失败流水
    public final static int DTLSTATUS_SUCCESS = 3;           //处理成功流水
    public final static int DTLSTATUS_EXCEPT = 4;           //异常流水
    public final static int DTLSTATUS_INVALID = 5;          //无效流水
    public final static int DTLSTATUS_REPEAT = 6;           //重复流水
    public final static int DTLSTATUS_CANCEL = 7;           //中途拔卡流水


    public final static String CARDBADFLAG_MANMADE = "1";//人为损坏
    public final static String CARDBADFLAG_QUALITY = "2";//质量损坏
    public final static String CARDBADFLAG_ACCBAL = "3";//库余额错误
    public final static String CARDBADFLAG_CARDBAL = "4";//卡余额错误


    public final static String TYPE_YES = "1";//是
    public final static String TYPE_NO = "2";//否


    public final static String STATE_TRUE = "1";//真
    public final static String STATE_FALSE = "0";//假

    /*                              
        设备状态    1   未签到
	    设备状态    2   签到后联机           
	    设备状态    3   签到后脱机           
	    设备状态    4   签出              
	*/
    public final static int DEVRUNSTATUS_REGIST = 1;
    public final static int DEVRUNSTATUS_ONLINE = 2;
    public final static int DEVRUNSTATUS_OFFLINE = 3;
    public final static int DEVRUNSTATUS_SIGNOUT = 4;


    /*                              
        三九机型代码  0001    金仕达前置机
	    三九机型代码  0226    三九收费机       
	*/
    public final static String DEVITYPE_SUBSYSTEM = "0001";
    public final static String DEVITYPE_CONSUME = "0226";
    public final static String DEVITYPE_LPORT = "5301";
    public final static String DEVITYPE_JLPORT = "5302";
    public final static String DEVITYPE_JSB = "0121";
    public final static String DEVITYPE_MOBILE_TERM = "1055";
    public final static String DEVITYPE_CONSUME_TERM = "8999";
    public final static String DEVITYPE_DOOR = "9000";
    public final static String DEVITYPE_ADDPOS = "0201";// 充值机

    //索亚机型代码                       
    public final static String DEVITYPE_AR716E = "8001";


	/*
	    子系统状态0    未激活
	    子系统状态1    签到后联机
	    子系统状态2    签到后脱机
	    子系统状态3    签出
	*/

    public final static String SUBSYSRUNSTAT_DEACTIVE = "1";
    public final static String SUBSYSRUNSTAT_ONLINE = "2";
    public final static String SUBSYSRUNSTAT_OFFLINE = "3";
    public final static String SUBSYSRUNSTAT_LOGOUT = "4";


    public final static String CARDSTAT_REG = "0000000000";//注册
    public final static String CARDSTAT_LOGOUT = "1000000000";//注销
    public final static String CARDSTAT_LOST = "0100000000";//挂失
    public final static String CARDSTAT_FREEZE = "0010000000";//冻结
    public final static String CARDSTAT_WFAIL = "0001000000";//写卡失败
    public final static String CARDSTAT_LOSTFREEZE = "0110000000";//挂失冻结


    /*
	    科目类别    1   资产
	    科目类别    2   负债
	    科目类别    3   共同类
	    科目类别    4   所有者权益
	    科目类别    5   成本
	    科目类别    6   损益
	*/
    public final static String SUBJTYPE_FUND = "1";
    public final static String SUBJTYPE_DEBT = "2";
    public final static String SUBJTYPE_OWNER = "3";
    public final static String SUBJTYPE_RIGHT = "4";
    public final static String SUBJTYPE_COST = "5";
    public final static String SBUJTYPE_PROFIT = "6";


    /* 设备模式*/
	/*
	   1    必须联机使用的设备
	   2    必须脱机使用的设备
	   4    可以联机也可以联机使用的设备
	*/
    public final static String DEV_MODE_ONLINE = "1";
    public final static String DEV_MODE_OFFLINE = "2";
    public final static String DEV_MODE_BOTH = "4";


    /*
	    操作员状态 1   注册
	    操作员状态 2   未注册或注销
	    操作员状态 3   登陆
	    操作员状态 4   登出
	*/
    public final static String OPERATOR_REG = "1";
    public final static String OPERATOR_UNREG = "2";
    public final static String OPERATOR_LOGON = "3";
    public final static String OPERATOR_LOGOUT = "4";


    // 补助状态
    // 未下发
    public final static String SUBSIDY_STATUS_INIT = "1";
    // 未领取
    public final static String SUBSIDY_STATUS_PUT = "2";
    // 已领取
    public final static String SUBSIDY_STATUS_GET = "3";
    public final static String SUBSIDY_STATUS_INVALID = "4";
    public final static String SUBSIDY_STATUS_REV = "5";
    // 补助类型
    public final static String SUBSIDY_TYPE_BANK = "1";//网银下发补助


    public final static String DOOR_BEGIN_TIME = "00000000000000";
    public final static String DOOR_END_TIME = "99999999999999";

    /**
     * ***********************************************
     * 汉军门禁设备类型
     * *************************************************
     */
    public final static String HNDR_RAC2000P = "9001";
    public final static String HNDR_RAC2000G = "9002";
    public final static String HNDR_GCU3 = "9003";
    public final static String HNDR_NCU3 = "9004";
    public final static String HNDR_BF430 = "9005";

    // TRANSPACK 状态
	/*
	 N 未处理
	 S 成功
	 R 否决
	 F 失败
	 D 过期
	 C 撤销
	 B 退票
	 V 拒绝
	 W 写卡失败
	*/
    public final static String TRANSPACKSTATE_NODEAL = "N";
    public final static String TRANSPACKSTATE_SUCCESS = "S";
    public final static String TRANSPACKSTATE_REJECT = "R";
    public final static String TRANSPACKSTATE_FAILD = "F";
    public final static String TRANSPACKSTATE_EXPIRD = "D";
    public final static String TRANSPACKSTATE_CANCEL = "C";
    public final static String TRANSPACKSTATE_RETURN = "B";
    public final static String TRANSPACKSTATE_DENY = "V";
    public final static String TRANSPACKSTATE_WRITEFAILD = "W";

    public final static String IS_MAIN_TRUE = "T";//是否为主卡
    public final static String AUTO_TRAN_FALSE = "F";//是否自动转帐

    public final static String VALIDDATE = "501230121212";//黑名单有效期

    /*                              
	 * PSAM卡状态 1 正常                 
	 * PSAM卡状态 2 注销                 
	 */
    public final static String DEVPSAM_REGISTER = "1";
    public final static String DEVPSAM_SIGNOUT = "1";


    public final static int SYSPARA_ACCFLAG = 1;//结算标志
    public final static int SYSPARA_SETTLEDATE = 2;//结算日期
    public final static int SYSPARA_POSWORKMODE = 3;//POS机工作模式
    public final static int SYSPARA_RENEWCARDDAYCNT = 4;//补办卡天数
    public final static int SYSPARA_AUTORENEWACCMAXAMT = 5;//自动平帐金额最大限额
    public final static int POS_FRONT_VERNO = 6;//前置机版本号
    public final static int SYSPARA_BANKCARDONLINEBIND = 7;//银行卡绑定模式 0-本地绑定,1银行联机绑定
    public final static int SYSPARA_QRYMAXCNT = 9;//无条件查询最大条数
    public final static int SYSPARA_SHOPBOARDFEEFLAG = 10;//消费收搭伙费是否属于商户
    public final static int SYSPARA_MAXBLACKCARDVERNO = 11;//最大黑名单版本号
    public final static int SYSPARA_MAXCARDVERNO = 12;//最大卡名单版本号
    public final static int SYSPARA_DISABLECARDMGR = 13;//是否启用卡片库存管理
    public final static int SYSPARA_CARDPWDVER = 14;//密码版本:1,2-老版本,3-新版本
    public final static int SYSPARA_APPNAME = 15;//应用系统名称
    public final static int SYSPARA_SUBSIDYAUDIT = 18;//下发补助是否需要审核,0-不要；1-需要
    public final static int SYSPARA_BROADCASTBLKLIST = 20;//是否广播黑名单
    public final static int SYSPARA_SINGLEMAXAMT = 21;//单次消费限额
    public final static int SYSPARA_DAYMAXAMT = 22;//日消费限额
    public final static int SYSPARA_CARDCNTPERCUST = 23;//每个客户可以发行正式卡张数
    public final static int SYSPARA_SUBSIDYMODE = 24;//下发补助模式,0-下发到卡账户1-下发到待领补助
    public final static int SYSPARA_CMCCENTERPRICECODE = 25;//移动规范定义企业ID 号
    public final static int SYSPARA_CMCCSUBAPPID = 26;//移动规范定义子应用索引
    public final static int SYSPARA_SYMAXCARDCNT = 27;//索亚门禁支持最大卡片数量
    public final static int SYSPARA_MAXCHARGEFEE = 28;//单笔充值最大金额
    public final static int SYSPARA_WATERMAXAMT = 30;//水控消费最大金额
    public final static int SYSPARA_LOCKDEVNO = 31;//后付费锁卡时记录终端号类型
    public final static int SYSPARA_EPAY_OVERDRAFT = 201;//电子钱包是否允许透支
    public final static int SYSPARA_CARDBITMAP_USED = 202;//是否判断卡位图入账

    public final static int SYSPARA_RSA_2100 = 2100;//rsa.cpp使用，不知道含义
    public final static int SYSPARA_RSA_2101 = 2101;//rsa.cpp使用，不知道含义
    public final static int SYSPARA_RSA_2102 = 2102;//rsa.cpp使用，不知道含义

    public final static int CARDVERTYPE_CARDOPEN = 1;//卡开户
    public final static int CARDVERTYPE_CARDCLOSE = 2;//卡销户
    public final static int CARDVERTYPE_CARDLOSS = 3;//卡挂失
    public final static int CARDVERTYPE_CARDFROZE = 4;//冻结卡
    public final static int CARDVERTYPE_CARDINSTEADNEW = 5;//换卡
    public final static int CARDVERTYPE_CARDUNLOSS = 6;//卡解挂
    public final static int CARDVERTYPE_CARDUNFROZE = 7;//解冻卡
    public final static int CARDVERTYPE_CARDINSTEADOLD = 8;//换卡旧卡

    public final static int PAYTYPE_CASH = 1;//现金
    public final static int PAYTYPE_BILL = 2;//支票
    public final static int PAYTYPE_OUTLAY = 3;//经费本
    public final static int PAYTYPE_ACC = 4;//个人账户

    public final static int EXTTYPE_SUBSIDYNO = 1;//补助批次号
    public final static int EXTTYPE_BANKCARD = 2;//银行卡号
    public final static int EXTTYPE_MOBILE = 3;//手机号
    public final static int EXTTYPE_OLDCARD = 4;//老卡卡号
    public final static int EXTTYPE_NEWCARD = 5;//新卡卡号
    public final static int EXTTYPE_OPPACCNO = 6;//对方账号
    public final static int EXTTYPE_OPPSNO = 7;//对方学号

    public final static int SUBJMAPTYPE_CARDACCNO = 1;//卡账户
    public final static int SUBJMAPTYPE_CARDFOREGIFT = 2;//卡押金账户

    public final static int SUBJMAPTYPE_NETACCNO = 8;//电子钱包

    public final static int SUBJMAPTYPE_SHOPACCNO = 9;//商户账户


    public final static int CARDPHYTYPE_CPU = 10;//CPU
    public final static int CARDPHYTYPE_CPUMF1 = 11;//CPU
    public final static int CARDPHYTYPE_MF1 = 20;//MF1
    public final static int CARDPHYTYPE_RFID = 30;//RFID手机卡
    public final static int CARDPHYTYPE_SAM = 40;//SAM
    public final static int CARDPHYTYPE_DEFAULT = 999;//默认卡物理类型


    public final static int DCFLAG_DEBIT = 1;//借方
    public final static int DCFLAG_CREDIT = 2;//贷方

    public final static int TF_DPS = 1;//充值
    public final static int TF_PAY = 2;//消费

    public final static int POSDATATYPE_REALTIMESEND = 1;//实时联机流水
    public final static int POSDATATYPE_AUTOSEND = 2;//上传脱机流水(自动)
    public final static int POSDATATYPE_BYHANDSEND = 3;//上传脱机流水(手动)
    public final static int POSDATATYPE_COLLSEND = 4;//补采脱机流水
    public final static int POSDATATYPE_IMPORT = 5;//导入脱机流水


    /*                                                        
	    客户类别    1    "商户"                                     
	    客户类别    10  "在职教职工"                                   
	    客户类别    11  "博士后"                                     
	    客户类别    12  "附中"                                      
	    客户类别    13  "教授"                                      
	    客户类别    20  "附属医院"                                    
	    客户类别    30  "博士研究生"                                  
	    客户类别    31  "硕士研究生"                                   
	    客户类别    32  "专业学位研究生"                                 
	    客户类别    33  "留学生"                                     
	    客户类别    40  "本科"                                     
	    客户类别    41  "专科"                                      
	    客户类别    42  "高职"                                      
	    客户类别    43  "网络学院"                                    
	    客户类别    45  "继续教育学院"                                  
	    客户类别    46  "短期留学生"                                   
	    客户类别    50  "退休"                                      
	    客户类别    51  "校外人员"                                    
	    客户类别    52  "重要宾客"                                    
	    客户类别    53  "访问学者"                                    
	*/
    public final static int MEALTYPE_BREAKFAST = 1;
    public final static int MEALTYPE_LUNCH = 2;
    public final static int MEALTYPE_SUPPER = 3;
    public final static int MEALTYPE_NIGHT = 4;


    public final static int NEWCARDSTATUS_INIT = 1;//初始状态
    public final static int NEWCARDSTATUS_UPDOLDCARDFAIL = 2;//旧卡信息清除失败
    public final static int NEWCARDSTATUS_UPDNEWCARDFAIL = 3;//新卡信息写卡失败
    public final static int NEWCARDSTATUS_SUCCESS = 4;//换卡成功

    public final static int CARDUSETYPE_GET = 1;//领入
    public final static int CARDUSETYPE_REUSE = 2;//回收
    public final static int CARDUSETYPE_USE = 3;//发卡
    public final static int CARDUSETYPE_DISABLE = 4;//作废
    public final static int CARDUSETYPE_PUT = 5;//上交
    public final static int CARDUSETYPE_DISABLEREV = 6;//撤销作废

    public final static int CARDUSESTATUS_UNUSED = 1;//未使用
    public final static int CARDUSESTATUS_USED = 2;//已使用
    public final static int CARDUSESTATUS_DISABLE = 3;//作废


    public final static int BANKCARDTMPSTATUS_INVALID = 1;//无效
    public final static int BANKCARDTMPSTATUS_ACCEPT = 2;//已接收等待处理
    public final static int BANKCARDTMPSTATUS_FAIL = 3;//处理失败
    public final static int BANKCARDTMPSTATUS_SUCC = 4;//处理成功

    public final static int CARDTYPE_TEMP = 99;//过渡临时卡
    public final static int CARDTYPE_ANONYMOUS = 2;//匿名卡

    /**
     * ************************************************      =
     * 计划任务状态说明
     * PUSHTASK_NEW
     */
    public final static int PUSHTASK_NEW = 1;
    public final static int PUSHTASK_RUN = 2;
    public final static int PUSHTASK_FAILED = 3;
    public final static int PUSHTASK_ERROR = 4;
    public final static int PUSHTASK_EXPIRED = 5;
    public final static int PUSHTASK_SUCCESS = 6;
	                        
	/*                      
	        系统状态    1   流水入帐状态                                =
	        系统状态    2   结算状态    流水不入帐状态                       =
	        系统状态    3   结算超时状态                                =
	*/

    public final static int SYSSTATE_INACT = 1;
    public final static int SYSSTATE_NOTINACT = 2;
    public final static int SYSSTATE_SUMOUTTIME = 3;

    /*                                                        
	        是否××  1   是     
	        是否××  2   否     
	*/
    public final static int IS_YES = 1;
    public final static int IS_NO = 2;


    ;//收入支出                 
    public final static int INOUTFLAG_IN = 1;//收入
    public final static int INOUTFLAG_OUT = 2;//支出
    /*                      
	    卡信息相关宏定义            
	*/
    public final static int PURSE_NO_ONE = 0;//钱一钱包号
    public final static int PURSE_NO_TWO = 1;//第二钱包号
    public final static int PURSE_NO_THREE = 2;//第三个钱包
    public final static int PURSE_NO_FOUR = 3;//第四个钱包


    public final static int ACCOUNT_COUNT_ONE = 1;//卡对应帐户个数
    public final static int PHYTYPE_NO_ONE = 1;//设备物理型号
    public final static int LOSS_TYPE_INFORMAL = 1;//挂失类型
    public final static int ADD_BLACKLIST = 0;//增加黑名单标志
    public final static int DELETE_BLACKLIST = 1;//删除黑名单标志
    public final static int CANCEL_BLACKLIST = 2;// 注销卡名单
    public final static int CHCARD_BLACKLIST = 9;// 换卡名单


    /*                      
	    流水状态    1   发起未入帐   
	    流水状态    2   已入帐     
	    流水状态    3   已结算汇总   
	    流水状态    4   已冲正     
	    流水状态    5   结算时段采集未入帐状态                               =
	    流水状态    6   重复上传异常状态:当工作站重复上传时，系统记录，并判断，发现重复则置该状态     =
	    流水状态    7   已归档     
	    流水状态    8   入帐异常    
	    流水状态    9   发起（不用入帐业务）                                =
	*/
    public final static int SERISTAT_NODEBT = 1;//发起未入帐
    public final static int SERISTAT_DEBT = 2;//已入帐
    public final static int SERISTAT_GATHER = 3;//已结算汇总
    public final static int SERISTAT_RUSH = 4;//已冲正
    public final static int SERISTAT_BNODEBT = 5;//结算时段采集未入帐状态
    public final static int SERISTAT_ECHO = 6;//重复上传异常状态:当工作站重复上传时，系统记录，并判断，发现重复则置该状态
    public final static int SERISTAT_ARCHIVE = 7;//已归档
    public final static int SERISTAT_DEBTEXC = 8;//入帐异常
    public final static int SERISTAT_NONEEDDEBT = 9;//发起（不用入帐业务）
    public final static int SERISTAT_INVALID = 10;//上传流水数据错误
	                        
	                        
	/*                      
	    写卡状态    1   发起未写入白名单
	    写卡状态    2   写入白名单   
	    写卡状态    3   已写卡     
	*/

    public final static int WCARDSTAT_LAUNCH = 1;
    public final static int WCARDSTAT_WHITE = 2;
    public final static int WCARDSTAT_WCARD = 3;
	                        

	                        

	                        
	/*                      
	    设备类型    1   普通消费类设备 
	    设备类型    2   以太网消费类设备
	    设备类型    3   水控消费类设备 
	    设备类型    4   电控消费类设备 
	    设备类型    5   认证类设备   
	    设备类型    6   自助圈存机   
	    设备类型    7   自助充值机   
	    设备类型    8   工作站(LPort）                                
	    设备类型    9   工作站(PC） 
	                        
	public final static int   DEVITYPE_CONSUME        1   =
	public final static int   DEVITYPE_ETHERNET       2   =
	public final static int   DEVITYPE_WATER          3   =
	public final static int   DEVITYPE_ELECTR         4   =
	public final static int   DEVITYPE_ATTEST         5   =
	public final static int   DEVITYPE_KEEP           6   =
	public final static int   DEVITYPE_CHARGE         7   =
	public final static int   DEVITYPE_LPORT          8   =
	public final static int   DEVITYPE_PC         9       =
	*/


    public final static int DEV_CONN_COM = 1;// =COM 连接
    public final static int DEv_CONN_MODEM = 0;// MOD=EM 连接
    public final static int DEV_CONN_TCP = 3;// TCP/=IP 连接
    public final static int DEV_CONN_SUBLEVEL = 9;// 下级设备

    ;// 设备用途
    ;// 计时宝
    public final static int DU_JSB_NORMAL = 1001;//门禁
    public final static int DU_JSB_MEDICAL = 1002;// 医疗认证
    public final static int DU_JSB_CONFRENCE = 1003;// 会议签到
    public final static int DU_JSB_ATTENDANCE = 1004;// 考勤

    public final static int DU_POS_NORMAL = 2001;// 消费 POS 机


    /*
	    子系统类型 1   圈存类
	    子系统类型 2   食堂商店消费类
	    子系统类型 3   图书馆消费类
	    子系统类型 4   医院消费类
	    子系统类型 5   电控消费类
	    子系统类型 6   水控消费类
	    子系统类型 7   机房消费类
	    子系统类型 8   图书馆认证类
	    子系统类型 9   门禁认证类
	    子系统类型 10  考勤认证类
	    子系统类型 11  对接类
	    子系统类型 12  三九前置机
	    子系统类型 13  外接子系统
	*/
    public final static int SUBSYSTYPE_KEEP = 1;
    public final static int SUBSYSTYPE_REST = 2;
    public final static int SUBSYSTYPE_LIB = 3;
    public final static int SUBSYSTYPE_HOSPIT = 4;
    public final static int SUBSYSTYPE_ELECTR = 5;
    public final static int SUBSYSTYPE_WATER = 6;
    public final static int SUBSYSTYPE_COMPUT = 7;
    public final static int SUBSYSTYPE_LIBCERT = 8;
    public final static int SUBSYSTYPE_DOORCERT = 9;
    public final static int SUBSYSTYPE_CHECK = 10;
    public final static int SUBSYSTYPE_INTERFACE = 11;
    public final static int SUBSYSTYPE_999 = 12;
    public final static int SUBSYSTYPE_THIRDPARY = 14;
    public final static int SUBSYSTYPE_YKT_GW = 15;
    public final static int SUBSYSTYPE_XSQ = 17;

    /*
	    学生状态    1   注册
	    学生状态    2   休学
	    学生状态    3   毕业注销
	    学生状态    4   退学注销
	*/
    public final static int STUSTAT_REGIST = 1;
    public final static int STUSTAT_TEMPOFF = 2;
    public final static int STUSTAT_GRADUATE = 3;
    public final static int STUSTAT_GIVEUP = 4;

    /*
	   子系统名单类型    1    挂失解挂注销名单
	   子系统名单类型     9    换卡
	   子系统名单类型    2    注销
	   子系统名单类型    4    用户信息变更
	 */
    public final static int SUB_UPDATE_BLK = 1;
    public final static int SUB_UPDATE_CHUSERINFO = 2;


    /*
	    学生类型    1   普通正式专科
	    学生类型    2   普通正式本科
	    学生类型    3   普通正式硕士
	    学生类型    4   普通正式博士
	    学生类型    5   普通正式博士后
	    学生类型    6   普通自考专科
	    学生类型    7   普通自考本科
	    学生类型    8   普通成人专科
	    学生类型    9   普通成人本科
	*/
    public final static int STUTYPE_OFFIZHUAN = 1;
    public final static int STUTYPE_OFFISCHOLAR = 2;
    public final static int STUTYPE_OFFIMASTER = 3;

    /*
	    员工状态    1   注册
	    员工状态    2   注销
	*/
    public final static int EMPLSTAT_REGIST = 1;
    public final static int EMPLSTAT_LOGOUT = 2;

    /*
	    员工类型    1   后勤
	    员工类型    1   机关
	    员工类型    1   教师
	*/
    public final static int EMPLTYPE_LOGI = 1;
    public final static int EMPLTYPE_DEPART = 2;
    public final static int EMPLTYPE_TEACH = 3;

    /*
	    商户状态    1   注册
	    商户状态    2   注销
	*/
    public final static int SHOPSTAT_REGIST = 1;
    public final static int SHOPSTAT_LOGOUT = 2;

    /*
	    商户类型    1   独立核算盈利类
	    商户类型    2   非独立核算盈利类
	    商户类型    3   学校公共类
	*/
    public final static int SHOPTYPE_ABSOLUTE = 1;
    public final static int SHOPTYPE_NOABSOLUTE = 2;
    public final static int SHOPTYPE_PUBLIC = 3;
    public final static int SHOPTYPE_GROUP = 0;
    public final static int SHOPTYPE_COSUMESHOP = 1;
    public final static int SHOPTYPE_DEPOSITSHOP = 2;
    public final static int SHOPTYPE_ESHOP = 3;

    /*
	    商户部门状态  1   注册
	    商户部门状态  2   注销
	*/
    public final static int DEPARTSTAT_REGIST = 1;
    public final static int DEPARTSTAT_LOGOUT = 2;


    /*
	    商户部门类型  1   独立核算盈利类
	    商户部门类型  2   非独立核算盈利类
	    商户部门类型  3   学校公共类
	*/
    public final static int DEPARTTYPE_ABSOLUTE = 1;
    public final static int DEPARTTYPE_NOABSOLUTE = 2;
    public final static int DEPARTTYPE_PUBLIC = 3;

    /*
	    客户状态    1   注册
	    客户状态    2   注销
	*/
    public final static int CUSTSTAT_REGIST = 1;
    public final static int CUSTSTAT_LOGOUT = 2;

    /*
	    客户类型    1   学生
	    客户类型    2   教职员工
	    客户类型    3   商户
	    客户类型    4   临时人员
	*/
    public final static int CUSTTYPE_SHOP = 1;
    public final static int CUSTTYPE_TEACH = 2;
    public final static int CUSTTYPE_STU = 3;
    public final static int CUSTTYPE_TEMP = 4;

    public final static int CARDSTAT_TYPE_REG = 0;
    public final static int CARDSTAT_TYPE_LOST = 1;//卡状态:挂失0-正常1-挂失
    public final static int CARDSTAT_TYPE_FREEZE = 2;//卡状态 冻结0-正常1-冻结
    public final static int CARDSTAT_TYPE_WFAIL = 3;//卡状态:卡结构损坏
    public final static int CARDSTAT_TYPE_BAD = 4;//卡状态:坏卡-正常0-1人为损坏卡

    public final static int CARDSTATUS_NORMAL = 0;//正常卡
    public final static int CARDSTATUS_LOCK = 1;//锁定卡
    public final static int CARDSTATUS_FROZE = 2;//冻结卡
    public final static int CARDSTATUS_LOST = 3;//挂失卡
    public final static int CARDSTATUS_CLOSE = 4;//注销卡
    public final static int CARDSTATUS_EXPIRE = 5;//过期卡
    public final static int CARDSTATUS_EXCEPT = 9;//异常卡


    /*
	    卡类型       1   学生正式卡
	    卡类型       2   教工正式卡
	    卡类型       3   学生制卡临时卡   正式卡未制作完毕前使用
	    卡类型       4   教工制卡临时卡   正式卡未制作完毕前使用
	    卡类型       5   学生补办临时卡   挂失后临时使用
	    卡类型       6   教工补办临时卡   挂失后临时使用
	    卡类型       7   贵宾卡   无照片
	    卡类型       8   临时人员卡 无照片
	*/
	/*
	    卡类型       1   正式卡
	    卡类型       2   过渡临时卡
	    卡类型       3   不记名临时卡
	    卡类型       4   VIP记名临时卡
	    卡类型       5   记名临时卡
	*/
    public final static int CT_NORMAL = 1;
    public final static int CT_TEMP = 2;
    public final static int CT_TEMP_NONAME = 3;
    public final static int CT_VIP = 4;
    public final static int CT_TEMP_NAME = 5;

    /*
	    医院消费类别  1   挂号费
	    医院消费类别  2   药费
	*/
    public final static int HOSCONTYPE_REGIST = 1;
    public final static int HOSCONTYPE_MEDI = 2;

    /*
	    入帐资金类别  1   食堂、商店消费类
	    入帐资金类别  2   手续费
	    入帐资金类别  3   押金
	    入帐资金类别  4   充值金
	    入帐资金类别  5   退回金
	    入帐资金类别  6   管理费
	    入帐资金类别  7   搭伙费
	    入帐资金类别  8   转帐

	*/
    public final static int FUNDTYPE_COMSUME = 1;
    public final static int FUNDTYPE_HANDING = 2;
    public final static int FUNDTYPE_DEPOSIT = 3;
    public final static int FUNDTYPE_FILL = 4;
    public final static int FUNDTYPE_BACK = 5;
    public final static int FUNDTYPE_MANAGE = 6;
    public final static int FUNDTYPE_BOARD = 7;
    public final static int FUNDTYPE_TRAN = 8;

    /*
	    定时任务执行类别    1   运行一次
	    定时任务执行类别    2   重复调度
	*/
    public final static int MASKTYPE_ONCE = 1;
    public final static int MASKTYPE_REPEAT = 2;

    /*
	    时间间隔单位      分钟
	    时间间隔单位      小时
	    时间间隔单位      天
	    时间间隔单位      周
	    时间间隔单位      月
	    时间间隔单位      年
	*/
    public final static int INTERVAL_MIN = 1;
    public final static int INTERVAL_HOUR = 2;
    public final static int INTERVAL_DAY = 3;
    public final static int INTERVAL_WEEK = 4;
    public final static int INTERVAL_MONTH = 5;
    public final static int INTERVAL_YEAR = 6;

    /*
	    归档内容    1   流水表（包含签到日志）
	    归档内容    2   汇总、结算表
	    归档内容    3   流水表、汇总、结算表
	*/
    public final static int SORTCONT_GLIDE = 1;
    public final static int SORTCONT_SUM = 2;
    public final static int SORTCONT_ALL = 3;

    /*
	    挂失期限类别  1   无限延长
	    挂失期限类别  2   用户指定
	*/
    public final static int LIMITTYPE_FOREVER = 1;
    public final static int LIMITTYPE_SPECIFY = 2;

    /*
	    借贷标识    1   借方
	    借贷标识    2   贷方
	*/
    public final static int DEBITCREBIT_DEBIT = 1;
    public final static int DEBITCRRBIT_CREBIT = 2;

    /*
	    借方标志    1   读默认
	    借方标志    2   读输入
	    借方标志    3   读配置
	*/
    public final static int DEBITSYMBOL_READ = 1;
    public final static int DEBITSYMBOL_RINPUT = 2;
    public final static int DEBITSYMBOL_RCONFIG = 3;

    /*
	    凭证类别    1   收款凭证
	    凭证类别    2   付款凭证
	    凭证类别    3   转帐凭证
	*/
    public final static int PAPERTYPE_IN = 1;
    public final static int PAPERTYPE_OUT = 2;
    public final static int PAPERTYPE_TURN = 3;


    public final static int SUBJCLASS_FUND = 1;//资产
    public final static int SUBJCLASS_DEBT = 2;//负债
    public final static int SUBJCLASS_RIGHT = 3;//所有者权益
    public final static int SUBJCLASS_COST = 4;//费用成本
    public final static int SBUJCLASS_INCOMING = 5;//收入类

    /*
	    科目余额方向  1   借
	    科目余额方向  2   贷
	    科目余额方向  3   共同
	*/
    public final static int BALANCEDIR_DEBIT = 1;
    public final static int BALANCEDIR_CREBIT = 2;
    public final static int BALANCEDIR_BOTH = 3;

    /*
	    科目性质    1   现金
	    科目性质    2   银行
	    科目性质    3   往来
	    科目性质    4   费用
	    科目性质    5   数量
	    科目性质    6   部门
	    科目性质    7   个人
	    科目性质    8   项目
	    科目性质    9   对帐
	    科目性质    10  转帐
	*/
    public final static int SUBJCHAR_CASH = 1;
    public final static int SUBJCHAR_BANK = 2;
    public final static int SUBJCHAR_ROTA = 3;
    public final static int SUBJCHAR_FEE = 4;
    public final static int SUBJCHAR_QUAN = 5;
    public final static int SUBJCHAR_DEPART = 6;
    public final static int SUBJCHAR_PERSON = 7;
    public final static int SUBJCHAR_PROJ = 8;
    public final static int SUBJCHAR_CHECK = 9;
    public final static int SUBJCHAR_TRANS = 10;

	/*
	    科目信息表
	    101     现金
	    102     银行往来
	    103     应收暂付
	    201     个人存款
	    202     商户存款
	    203     应付暂收
	    301     管理费
	    10101   现金充值
	    10201   银行转帐
	    20301   押金
	    20302   预付搭伙费
	    30101   一卡通管理费
	    30102   商户手续费
	*/

    /*
	    末级标志    1   是
	    末级标志    2   非
	*/
    public final static int FINALSYMBOL_YES = 1;
    public final static int FINALSYMBOL_NO = 2;

	/*
	    政治面貌    1
	*/


	/*
	    民族代码    1
	*/

	/*
	    职称代码    1   是
	*/

    /*
	    卡生产厂商 1   飞利浦
	    卡生产厂商 2   微星
	*/
    public final static int CARDCORP_PHILIP = 1;
    public final static int CARDCORP_MICROSTAR = 2;

    /*
	    区域级别    1   根
	    区域级别    2   校区
	    区域级别    3   楼
	    区域级别    4   楼层
	    区域级别    5   窗口
	*/
    public final static int AREALEVEL_ROOT = 1;
    public final static int AREALEVEL_SCHOOL = 2;
    public final static int AREALEVEL_BUILD = 3;
    public final static int AREALEVEL_FLOOR = 4;
    public final static int AREALEVEL_WINDOW = 5;
    /*
	    帐号类别    1   个人主账号
	    帐号类别    2   商户主账号
	    帐号类别    3   个人副账号
	    帐号类别    4   商户副账号
	    帐号类别    5   学校虚拟账号（与学校交互）
	    帐号类别    6   学校虚拟账号（与银行交互）
	    帐号类别    7   学校虚拟账号（与现金交互）
	    帐号类别    8   学校虚拟账号（与财务交互）
	*/
    public final static int ACCTYPE_PERMAIN = 1;
    public final static int ACCTYPE_SHOPMAIN = 2;
    public final static int ACCTYPE_PEROTHER = 3;
    public final static int ACCTYPE_SHOPOTHER = 4;
    public final static int ACCTYPE_SCHSCH = 5;
    public final static int ACCTYPE_SCHBANK = 6;
    public final static int ACCTYPE_SCHCASH = 7;
    public final static int ACCTYPE_SCHFINA = 8;
    /*
	    授权卡状态 1   注册
	    授权卡状态 2   注销
	*/
    public final static int AuthCardS_LOGON = 1;
    public final static int AuthCardS_LOGOUT = 2;
    /*
	    授权卡类别 1   授权母卡
	    授权卡类别 2   消费密钥卡
	    授权卡类别 3   充值密钥卡
	*/
    public final static int AuthCardT_MOTHER = 1;
    public final static int AuthCardT_COUSME = 2;
    public final static int AuthCardT_DEPOSIT = 3;
    /*
	    外部系统标识  1   农行1
	    外部系统标识  2   农行2
	*/
    public final static int OUTSYS_BANKONE = 1;
    public final static int OUTSYS_BANKTWO = 2;

    /*
	    消息状态1: 等待发起请求
	    消息状态2: 已发起请求
	    消息状态3: 执行成功
	    消息状态4: 执行失败
	    消息状态5: 999返回信息错误
	    消息状态6: 无须返回结果
	    消息状态7: 连续返回数据集
	*/
    public final static int MESLISTSTATE_SUCCEED = 1;
    public final static int MESLISTSTATE_ERROR = 2;
    public final static int MESLISTSTATE_WAIT = 3;
    public final static int MESLISTSTATE_RETERROR = 5;
    public final static int MESLISTSTATE_START = 4;
    public final static int MESLISTSTATE_NOTRET = 6;
    public final static int MESLISTSTATE_CONTINUUM = 7;
    public final static int MESLISTSTATE_HUNG = 9;

    public final static int MESLIST_TYPE_NORMAL = 0;
    public final static int MESLIST_TYPE_ORDER = 1;
    // 正常
    public final static int MESLIST_PRIORITY_NORMAL = 1;
    // 实时
    public final static int MESLIST_PRIORITY_REALTIME = 2;
    // 抢占
    public final static int MESLIST_PRIORITY_PREEMPT = 3;

    /*
	    消息队列默认失败后发送次数
	*/
    public final static int MESLIST_SENDCOUNT = 3;

    /*
	    黑名单增删标志
	    0       添加
	    1       删除
	*/
    public final static int BLACK_SHEET_ISADD = 0;
    public final static int BLACK_SHEET_ISDEL = 1;
    public final static int BLACK_SHEET_CANCEL = 2;
    public final static int BLACK_SHEET_CHCARD = 9;


    /*  ----------------监控中心部分------------------------------    */
	/*
	    设备心跳状态  1   联机
	    设备心跳状态  2   脱机
	*/
    public final static int DEVBEATSTATE_ON = 1;
    public final static int DEVBEATSTATE_OFF = 2;


    /*
	    异常流水状态  1   发起
	    异常流水状态  2   已通知
	    异常流水状态  3   已处理
	*/
    public final static int ERRSERIALSTATE_BEGIN = 1;
    public final static int ERRSERIALSTATE_NOTIF = 2;
    public final static int ERRSERIALSTATE_DEAL = 3;

    /*
	    报警流水状态  1   已报警
	    报警流水状态  2   已处理完成
	    报警流水状态  3   超期未完成
	*/
    public final static int NOTIFSERIALSTATE_NOTIF = 1;
    public final static int NOTIFSERIALSTATE_END = 2;
    public final static int NOTIFSERIALSTATE_OVERTIME = 3;


    public final static int TYPE_CASH = 1;//现金充值
    public final static int TYPE_BILL = 2;//支票充值
    public final static int TYPE_FUNDBOOK = 3;//经费本充值
    public final static int TYPE_OTHER = 4;//其他方式充值

    public final static int CUTUPD_UPDATE = 0;// 增加一条客户信息更新的记录
    public final static int CUTUPD_CANCEL = 1;// 增加一条注销客户信息的记录
    public final static int CUTUPD_ADD = 2;// 增加一条新增客户信息的记录
    public final static int CUTUPD_CH_OLDCARD = 3;// 增加一条换卡旧卡的记录
    public final static int CUTUPD_CH_NEWCARD = 4;// 增加一条换卡新卡的记录

    public final static int FEE_CODE_DEFAULT = 0;// 不使用科目收费
    public final static int FEE_CODE_MAX = 99;// 最大科目号

    /*
	 * 子系统对应的功能号列表
	*/
    public final static int SUBSYSTEM_BLKCARD_FUNC = 400000;// 挂失解挂注销换卡
    public final static int SUBSYSTEM_NEWCARD_FUNC = 400002;// 发新卡名单


    /// 一卡通子系统
    public final static int YKT_SYS_PHONE = 1000;
    public final static int YKT_SYS_ATM = 1001;
    public final static int YKT_SYS_WEB = 2000;
    public final static int YKT_SYS_ADVQUREY = 2001;
    public final static int YKT_SYS_MM = 2002;
    public final static int YKT_SYS_MONITOR = 2003;


    public final static int CUT_RELATION_TYPE_BANK = 1;
    public final static int CARDINF_NEW_STATE = 2;
    public final static int CARDINF_AGAIN_STATE = 1;

    // 充值平台,操作状态定义
    // 发新卡
    public final static int UNI_CARD_NEW_CARD = 1;
    // 补办正式卡
    public final static int UNI_CARD_REISSUE_CARD = 2;
    // 补写卡信息
    public final static int UNI_CARD_REWRITE_CARD = 3;
    // 挂失
    public final static int UNI_CARD_LOSS = 4;
    // 冻结
    public final static int UNI_CARD_FROZEN = 5;
    // 充值
    public final static int UNI_CARD_ADD_MONEY = 6;
    // 注销
    public final static int UNI_CARD_CANCEL = 7;

    // 操作员授权卡状态
    // 正常
    public final static int AUTHCARD_STATUS_NORMAL = 1;
    // 挂失
    public final static int AUTHCARD_STATUS_LOSS = 2;
    // 注销
    public final static int AUTHCARD_STATUS_CANCEL = 4;


    ;//审核状态
    ;// 未审核
    public final static int SUBSIDY_CHECKFLAG_INIT = 0;
    ;// 审核通过
    public final static int SUBSIDY_CHECKFLAG_OK = 1;
    ;// 审核不通过
    public final static int SUBSIDY_CHECKFLAG_REJECT = 2;
    //审核撤销
    public final static int SUBSIDY_CHECKFLAG_REVOKE = 3;


    /**
     * **********************************************
     * 授权卡权限位
     * *********************************************
     */
    public final static int AUTHCARD_PRV_POS = 1;// 收费终端
    public final static int AUTHCARD_PRV_CENTER = 2;// 管理中心
    public final static int AUTHCARD_PRV_ADDPOS = 4;// 充值终端
    public final static int AUTHCARD_PRV_DOOR = 8;// 门禁终端
    public final static int AUTHCARD_PRV_ID = 16;// 认证终端
    public final static int AUTHCARD_PRV_AREA = 32;// 区域控制

    /*************************************************
     门禁系统状态参数定义
     */
    ;//public final static int   DOOR_ADDFLAG_UNDOWNLOAD 1         ;//白名单标志-未下传
    ;//public final static int   DOOR_FLAG_NORMAL  2               ;//白名单已下传
    ;//public final static int   DOOR_DELFLAG_UNDOWNLOAD 7         ;//黑名单删除-未下传
    ;//public final static int   DOOR_FLAG_WAITING_DEL 8           ;//黑名单等待删除
    ;//public final static int   DOOR_FLAG_DELETE     9            ;//黑名单已删除-已下传
    public final static int DOOR_ADDFLAG_UNDOWNLOAD = 1;//白名单标志-未下传
    public final static int DOOR_ADDFLAG_DOWNLOAD = 2;//白名单已下传
    public final static int DOOR_DELFLAG_UNDOWNLOAD = 7;//白名单删除-未下传
    public final static int DOOR_DELFLAG_WAITDOWNLOAD = 8;//白名单等待删除
    public final static int DOOR_DELFLAG_DOWNDOWNLOAD = 9;//白名单已删除-已下传

    public final static String ADDDELFLAG_ADD = "1";//添加
    public final static String ADDDELFLAG_DEL = "2";//删除

    public final static int DOWNSTATUS_INIT = 1;//未下传
    public final static int DOWNSTATUS_SUCCESS = 2;//下传成功
    /* 门禁星期定义*/
    public final static int DOOR_WEEK_MON = 1;
    public final static int DOOR_WEEK_TUE = 2;
    public final static int DOOR_WEEK_WEN = 3;
    public final static int DOOR_WEEK_THU = 4;
    public final static int DOOR_WEEK_FRI = 5;
    public final static int DOOR_WEEK_SAT = 6;
    public final static int DOOR_WEEK_SUN = 7;


    /**
     * ***********************************************
     * 外部银行代码
     * *************************************************
     */
    public final static int NONGYE_BANK = 1;
    public final static int GONGSHANG_BANK = 2;
    public final static int JIANSHE_BANK = 3;
    public final static int ZHONGGUO_BANK = 4;


    //对账类别
    public final static int BANK_ACCCHK_TYPE = 1;
    public final static int MOBILE_ACCCHK_TYPE = 2;

    public final static String SUBJECT_CASH = "1001";             //现金
    public final static String SUBJECT_BANKACC = "1002";             //银行存款
    public final static String SUBJECT_SHEET = "1121";             //应收票据
    public final static String SUBJECT_SHEET_BILL = "112101";         //应收票据-支票
    public final static String SUBJECT_SHEET_OUTLAY = "112102";         //应收票据-经费本
    public final static String SUBJECT_CARDSAVING = "2001";             //卡户存款
    public final static String SUBJECT_CARDFOREGIFT = "2002";             //卡户押金
    public final static String SUBJECT_ESAVING = "2003";             //电子帐户存款
    public final static String SUBJECT_SHOPINCOME = "2004";             //商户营业收入
    public final static String SUBJECT_SHOPSAVING = "2005";             //商户存款
    public final static String SUBJECT_PROFIT = "4001";             //本年利润
    public final static String SUBJECT_INCOME = "6001";          //营业外收入 
    public final static String SUBJECT_INCOME_FEE = "6002";          //手续费收入
    public final static String SUBJECT_INCOME_RAKEOFF = "6003";          //佣金收入 
    public final static String SUBJECT_INCOME_BOARD = "6004";          //搭伙费收入
    public final static String SUBJECT_INCOME_CARDCOST = "6005";          //卡成本费收入
    public final static String SUBJECT_INCOME_BACKCARDBAL = "6006";          //退卡盈余收入
    public final static String SUBJECT_INCOME_DEPRFEE = "6007";          //折旧费收入
    public final static String SUBJECT_OUT = "6201";             //营业外支出 
    public final static String SUBJECT_OUT_SHOP_DISCOUNT = "6202";             //商户提成支出	


    public final static int SEQNO_RECORD = -2;            //记录号
    public final static int SEQNO_REFNO = -10;           //一卡通使用
    public final static int OPTYPE_ADD = 1;              //签约
    public final static int OPTYPE_DEL = 2;//解约
    public final static int OPTYPE_SYNC = 3;//同步
    public final static int OPTYPE_RESET = 4;//重置


    /////////////////////////transcode///////////////////////////////////

    public final static int CARDOPEN = 1001;


    public final static int TCTYPE_ADD = 1;//添加
    public final static int TCTYPE_DEL = 2;//删除
    public final static int TCTYPE_UPD = 3;//修改
    public final static int TCTYPE_QRY = 4;//查询
    public final static int TCTYPE_IMP = 5;//导入
    public final static int TCTYPE_CHK = 6;//审核
    public final static int TCTYPE_RESET = 7;//重置
    public final static int TCTYPE_REVERSE = 1;//冲正


    public final static String MAKETRANSCODEADD = "(x+TCTYPE_ADD)";
    public final static String MAKETRANSCODEDEL = "(x+TCTYPE_DEL)";
    public final static String MAKETRANSCODEUPD = "(x+TCTYPE_UPD)";
    public final static String MAKETRANSCODEQRY = "(x+TCTYPE_QRY)";
    public final static String MAKETRANSCODEIMP = "(x+TCTYPE_IMP)";
    public final static String MAKETRANSCODEREVERSE = "(x+TCTYPE_REVERSE)";


    public final static String IS_TRANSCODEQRY = "(x%10=TCTYPE_QRY)";

    //交易码规则:第1为表示类型第2、3位表示交易类别第4为序号
    //TCM_标志为交易码宏
    public final static int TCM_AREA = 1000;//区域
    public final static int TCM_BRANCH = 1010;//网点
    public final static int TCM_SITE = 1020;//站点
    public final static int TCM_OPER = 1030;//操作员
    public final static int TC_OPERPWDUPD = 1040;//操作员密码修改
    public final static int TC_OPERPWDRESET = 1041;//操作员密码重置
    public final static int TCM_OPERSITE = 1050;//操作员站点
    public final static int TCM_AUTHTPL = 1060;//权限模板
    public final static int TCM_DEPT = 1070;//部门
    public final static int TCM_SPECIALTY = 1080;//专业
    public final static int TCM_SUBSYS = 1090;//子系统
    public final static int TCM_DEVICE = 1100;//设备
    public final static int TCM_DICTIONARY = 1120;//数据字典
    public final static int TCM_PARAM = 1130;//全局参数
    public final static int TCM_CARDTYPE = 1140;//卡类别
    public final static int TCM_PURSE = 1150;//钱包
    public final static int TCM_CUSTTYPE = 1160;//客户类别
    public final static int TCM_FEETYPE = 1170;//收费类别
    public final static int TCM_CFGFEE = 1180;//交易配置
    public final static int TCM_TASK = 1190;//计划任务
    public final static int TC_TASKLOGQRY = 1200;//计划任务日志查询
    public final static int TCM_MQ = 1210;//消息队列
    public final static int TCM_BANKCARD = 1220;//银行卡绑定
    public final static int TCM_POSSHOP = 1230;//POS商户
    public final static int TCM_DEPOSITSHOPPOS = 1240;//充值商户POS
    public final static int TCM_DEPOSITOPER = 1250;//充值操作员
    public final static int TCM_DEPOSITOPERPOS = 1260;//充值操作员POS
    public final static int TCM_MEAL = 1270;//餐次
    public final static int TCM_SHOPMEAL = 1280;//商户餐次
    public final static int TCM_SHOPRAKEOFF = 1290;//商户佣金
    public final static int TCM_CUSTOMER = 1300;//客户信息
    public final static int TCM_CFGSHOPFEE = 1310;//商户搭伙费费率
    public final static int TCM_CARDTYPERIGHT = 1320;//卡类别权限
    public final static int TCM_BANKTMP = 1330;//银行卡名单
    public final static int TC_BANKBIND = 1340;//银行卡联机绑定
    public final static int TCM_OPERAUTH = 1350;//操作员权限
    public final static int TCM_DEPOSITOPERAUTH = 1360;//充值操作员授权
    public final static int TCM_WATERRATE = 1370;//水费设置
    public final static int TCM_DOORGROUP = 1400;//门禁组


    public final static int TCM_PSAM = 1500;//PSAM卡
    public final static int TCM_WATERFEE = 1510;//水控费率

    public final static int TC_CUSTOMERTMPIMP = 2001;//客户信息导入
    public final static int TC_CUSTOMERTMPDEL = 2002;//客户信息导入删除
    public final static int TC_CUSTOMERTMPUPD = 2003;//客户信息导入修改
    public final static int TC_CUSTOMERTMPQRY = 2004;//客户信息导入查询
    public final static int TC_CUSTOMERTMPCHK = 2005;//客户信息导入审核


    public final static int TC_DEVICETMPIMP = 2011;//设备文件导入
    public final static int TC_DEVICETMPDEL = 2012;//设备文件导入删除
    public final static int TC_DEVICETMPUPD = 2013;//设备文件导入修改
    public final static int TC_DEVICETMPQRY = 2014;//设备文件查询
    public final static int TC_DEVICETMPCHK = 2015;//设备文件审核

    public final static int TC_SHOPPOSTMPIMP = 2021;//商户POS文件导入
    public final static int TC_SHOPPOSTMPDEL = 2022;//商户POS文件导入删除
    public final static int TC_SHOPPOSTMPUPD = 2023;//商户POS文件导入修改
    public final static int TC_SHOPPOSTMPQRY = 2024;//商户POS文件导入查询
    public final static int TC_SHOPPOSTMPCHK = 2025;//商户POS文件导入审核

    public final static int TC_POSDTLTMPIMP = 2030;//POS流水导入
    public final static int TC_POSDTLTMPADD = 2031;//POS流水手工录入
    public final static int TC_POSDTLTMPDEL = 2032;//POS流水导入删除
    public final static int TC_POSDTLTMPUPD = 2033;//POS流水导入修改
    public final static int TC_POSDTLTMPQRY = 2034;//POS流水导入查询
    public final static int TC_POSDTLTMPCHK = 2035;//POS流水导入审核

    public final static int TCM_POSDTL = 2040;//POS异常流水
    public final static int TC_CARDGET = 2100;//卡片领入
    public final static int TC_CARDPUT = 2110;//卡片上交
    public final static int TC_CARDDISABLE = 2120;//卡片作废
    public final static int TC_CARDDISABLEREV = 2121;//卡片作废取消
    public final static int TC_CARDCHANGE = 2130;//卡片交接
    public final static int TCM_CARDBAD = 2140;//坏卡登记
    public final static int TC_CARDQRY = 2154;//卡片查询

    public final static int TC_AUTHCARDOPEN = 2200;//授权卡发行
    public final static int TC_AUTHCARDCLOSE = 2210;//授权卡回收
    public final static int TC_AUTHCARDLOSS = 2220;//授权卡挂失
    public final static int TC_AUTHCARDUNLOSS = 2230;//授权卡解挂
    public final static int TC_AUTHCARDUPD = 2240;//授权卡更新
    public final static int TC_AUTHCARDQRY = 2254;//授权卡查询

    public final static int TC_SHOPCARDOPEN = 2300;//商户卡发行
    public final static int TC_SHOPCARDCLOSE = 2310;//商户卡回收
    public final static int TC_SHOPCARDLOSS = 2320;//商户卡挂失
    public final static int TC_SHOPCARDUNLOSS = 2330;//商户卡解挂


    public final static int TC_CARDOPEN = 3000;//卡片开户
    public final static int TC_CARDOPENREV = 3001;//卡片开户冲正
    public final static int TC_CARDCLOSE = 3010;//卡片销户
    public final static int TC_CARDRENEW = 3020;//卡补办
    public final static int TC_CARDRETURN = 3030;//卡回收
    public final static int TC_CARDLOSS = 3040;//卡挂失
    public final static int TC_CARDUNLOSS = 3050;//卡解挂
    public final static int TC_CARDFROZE = 3060;//卡冻结
    public final static int TC_CARDUNFROZE = 3070;//卡解冻
    public final static int TC_CARDUPDBASEINFO = 3080;//更新卡基本信息
    public final static int TC_CARDUPDEXPIREDATE = 3081;//更新卡有效期
    public final static int TC_CARDUPDBADCARD = 3082;//坏卡修复
    public final static int TC_CARDREWRITE = 3083;//重写卡信息
    public final static int TC_CARDCLEAR = 3084;// 清空卡信息
    public final static int TC_CARDSAVEINFO = 3090;//换卡保存卡信息
    public final static int TC_CARDINSTEAD = 3091;//换卡
    public final static int TC_CARDINSTEADREV = 3092;//换卡撤销
    public final static int TC_NEWCARDCHANGE = 3093;//新生换卡

    public final static int TC_CARDDEPOSIT = 3100;//卡充值
    public final static int TC_CARDDEPOSITREV = 3101;//卡充值冲正
    public final static int TC_CARDAUTODEPOSIT = 3102;//自助现金充值
    public final static int TC_CARDDRAW = 3110;//卡支取
    public final static int TC_SUBSIDYIMP = 3121;//补助导入
    public final static int TC_SUBSIDYDEL = 3122;//补助删除
    public final static int TC_SUBSIDYUPD = 3123;//补助修改
    public final static int TC_SUBSIDYQRY = 3124;//补助查询
    public final static int TC_SUBSIDYCHECK = 3125;//补助审核
    public final static int TC_SUBSIDYREV = 3126;//补贴冲正
    public final static int TC_SUBSIDYPUT = 3130;//补助下发
    public final static int TC_MSUBSIDYPUT = 3131;//餐补下发
    public final static int TC_MSUBSIDYPUTCANCLE = 3132;//补助下发取消
    public final static int TC_MSUBSIDYGET = 3133;//餐补领取
    public final static int TC_MSUBSIDYGETCANCLE = 3134;//餐补领取取消

    public final static int TC_POSDEPOSIT = 3140;//POS充值
    public final static int TC_POSDEPOSITREV = 3141;//POS充值冲正
    public final static int TC_SHOPPOSDEPOSIT = 3150;//充值商户POS充值
    public final static int TC_SHOPPOSDEPOSITREV = 3151;//充值商户POS充值冲正
    public final static int TC_POSDRAW = 3160;//POS消费
    public final static int TC_POSDRAWREV = 3161;//消费冲正
    public final static int TC_POSDRAWCANCEL = 3162;//消费取消
    public final static int TC_BANKTRANS = 3170;//圈存转账
    public final static int TC_BANKSUBSIDY = 3171;//网银下发补助
    public final static int TC_BANKTRANSADD = 3175;//圈存补帐
    public final static int TC_CARDPAYMENT = 3180;//卡支付交易
    ;//public final static int  TC_DEDUCTPUT 	=3190  ;//下发扣款
    public final static int TC_CARDPWDUPD = 3200;//卡密码修改
    public final static int TC_CARDPWDRESET = 3210;//卡密码重置
    public final static int TC_SUBSIDYGET = 3220;//补助领取
    public final static int TC_CARD2CARTRANS = 3230;//卡卡转账(旧卡到新卡)
    public final static int TC_CARDBALMOD = 3240;//卡余额调整
    public final static int TC_CARDBALUPD = 3241;//卡余额修正
    public final static int TC_WATERCARDBALMOD = 3250;//水控卡余额调整
    public final static int TC_WATERTRANS = 3260;//水控转账
    public final static int TC_WATERJD2XT = 3261;//竟达转新天水控
    public final static int TC_WATERXT2JD = 3262;//新天转竟达水控
    public final static int TC_WATERPAY = 3263;//后付费补扣
    public final static int TC_WATERPAYUNLOCK = 3264;//后付费解锁
    public final static int TC_CARD2CARD = 3270;//卡卡转账
    public final static int TC_POSLOCKCARD = 3280;//POS锁卡
    public final static int TC_CONSUMEFAIL = 3290;//消费失败
    public final static int TC_SYSREV = 3300;//系统冲正
    public final static int TC_WATERDEPOSIT = 3310;//水控充值
    public final static int TC_WATERBALRETURN = 3320;//退水控余额
    public final static int TC_WATERDRAW = 3330;//水控消费
    public final static int TC_BUSDRAW = 3340;//车载消费
    public final static int TC_WATERNOBALARET = 3350;//水控不平金额退款

    public final static int TC_TRANSREV = 4000;//冲账交易
    public final static int TC_CARDACCDIFF = 4001;//卡库不平

    public final static int TC_SHOPOPEN = 5001;//商户开户
    public final static int TC_SHOPCLOSE = 5002;//商户销户
    public final static int TC_SHOPUPD = 5003;//商户信息修改
    public final static int TC_SHOPQRY = 5004;//商户信息查询
    public final static int TC_SHOPSAVING = 5010;//商户存款
    public final static int TC_SHOPSUBJECTADD = 5020;//商户科目映射
    public final static int TC_SHOPSUBJECTUPD = 5021;//商户科目映射修改
    public final static int TC_SHOPSUBJECTDEL = 5022;//商户科目映射删除

    public final static int TC_EACCOPEN = 6000;//电子钱包开户
    public final static int TC_EACCCLOSE = 6010;//电子钱包销户
    public final static int TC_EACCDEPOSIT = 6020;//电子钱包充值
    public final static int TC_EACCDRAW = 6030;//电子钱包取款
    public final static int TC_CARD2EACC = 6040;//卡到电子钱包转帐
    public final static int TC_EACC2CARD = 6050;//电子钱包到卡转帐
    public final static int TC_BANK2EACC = 6060;//银行卡到电子钱包转帐
    public final static int TC_EACCSTOPPAY = 6070;//电子钱包止付
    public final static int TC_EACCUNSTOPPAY = 6080;//电子钱包解付
    public final static int TC_EACCQRY = 6094;//电子钱包信息查询
    public final static int TC_EACCPWDUPD = 6100;//电子钱包密码修改
    public final static int TC_EACCPWDRESET = 6110;//电子钱包密码重置
    public final static int TC_EACCLOGIN = 6200;//电子钱包支付系统签到
    public final static int TC_EACCQRYBAL = 6210;//电子钱包余额查询
    public final static int TC_EACCFROZE = 6220;//电子钱包冻结
    public final static int TC_EACC2SHOP = 6230;//电子钱包支付
    public final static int TC_EACC2SHOPREV = 6240;//电子钱包支付冲正
    public final static int TC_MANUALDRCR = 7000;//手工借贷

    public final static int TC_VOUCHERMAKE = 7010;//凭证录入
    public final static int TC_VOUCHERUPD = 7011;//凭证修改
    public final static int TC_VOUCHERDEL = 7012;//凭证删除
    public final static int TC_VOUCHERSIGN = 7013;//凭证签字
    public final static int TC_VOUCHERCHECK = 7020;//凭证复核
    public final static int TC_VOUCHERCHECKREV = 7021;//凭证复核取消
    public final static int TC_VOUCHERBOOK = 7030;//凭证入账
    public final static int TC_VOUCHERBOOKREV = 7040;//凭证冲销

    public final static int TC_SHOPPAYMENT = 8000;//商户解款
    public final static int TC_DAYEND = 9000;//日终结算
    public final static int TC_MONTHEND = 9010;//期末结转
    public final static int TC_YEAREND = 9020;//年终结转

    public final static int SYS_CFGVERTYPE = 1;

    public final static int TRANSTYPE_ACCSUBSIDY = 206; //补助，下发到待领补助
    public final static int TRANSTYPE_CARDSUBSIDY = 203; //卡户补助
    public final static int TRANSTYPE_DEDUCTMONEY = 645;  //扣款补助


    public final static int RS_INIT = 0;        //初始状态
    public final static int RS_FAIL = 1;        //交易失败状态
    public final static int RS_SUCC = 2;        //交易成功
    public final static int RS_WAITREV = 3;    //一卡通后台待冲正
    public final static int RS_YKTREVSUCC = 4;    //银行方待冲正
    public final static int RS_REVSUCC = 5;        //全部冲正成功


    public final static int TRANSTYPE_CARDDRAW = 231;    //持卡人取款
    public final static int TRANSTYPE_POSPAYMENT = 232;    //POS消费
    public final static int TRANSTYPE_CARDPAYMENT = 233;    //支付交易
    public final static int TRANSTYPE_CLOSEDRAW = 234; //消费退款
    public final static int TRANSTYPE_WATERTRANS = 235;    //水控转账
    public final static int TRANSTYPE_POSPAYCANCEL = 236;    //消费取消
    public final static int TRANSTYPE_CARD2CARD = 237;    //卡卡转账
    public final static int TRANSTYPE_WATERDEPOSIT = 238;    //水控充值
    public final static int TRANSTYPE_WATERDRAW = 239;    //水控消费
    public final static int TRANSTYPE_WATERPAY = 240; //后付费补扣

    //卡交易次数位图类型
    //#define CARDBITMAPTYPE_INC   '+'      //增值交易
    //#define CARDBITMAPTYPE_DEC      '-'       //POS消费类交易
    //#define CARDBITMAPTYPE_ONLINE '*'     //联机交易
    //#define CARDBITMAPTYPE_INCREV '#'     //增值交易冲正
    //#define CARDBITMAPTYPE_DECREV '~'        //扣款交易冲正
    public final static char CHARDBITMAPTYPE_INIT = '0';         //重置
    public final static char CHARDBITMAPTYPE_REV = '/';       //消费冲正
    public final static char CHARDBITMAPTYPE_POS_ONLINE = '-';   //POS联机消费
    public final static char CHARDBITMAPTYPE_POS_OFFLINE = '|';   //POS脱机消费
    public final static char CHARDBITMAPTYPE_SYS_ONLINE = '=';   //非POS机消费，系统消费


    /*
	 * 操作员相关
	 */
    public final static String OPER_STATUS_NORMAL = "1";   //正常
    public final static String OPER_STATUS_LOCK = "0";        //锁定
    public final static String OPER_STATUS_Logout_ = "2";     //注销


    //补助撤销相关
    public final static int TRANSTYPE_SUBSIDYPUTCANCLE = 220; //补助下发撤销，下发到待领补助
    public final static int TRANSTYPE_SUBSIDYGETCANCLE = 221; //补助领取撤销，从待领补助领取
    //end


}
