package com.offke.core.bu.exception;


public class RAcctrans extends RWarn {
    public RAcctrans(String message) {
        super(message);
    }

    public static final int TERMID_WEB = 1;//web
    public static final int TERMID_TEL = 2;//电话终端
    public static final int TERMID_SVR = 4;//管理中心
    public static final int TERMID_SYSTEM = 5;//结算中心

    public static final int LOGFLAG_NONE = 0;//不记录流水
    public static final int LOGFLAG_SUCC = 1;//只记录成功交易流水
    public static final int LOGFLAG_FAIL = 2;//只记录失败交易流水
    public static final int LOGFLAG_ALL = 3;//全部记录(包含成功和失败)

    public static final int ACCTYPE_CARD = 1;//持卡人卡帐户
    public static final int ACCTYPE_SHOP = 2;//商户账号
    public static final int ACCTYPE_EACC = 3;//电子钱包账户
    public static final int ACCTYPE_INNER = 4;//内部帐户

    public static final int TYPE_INPUT = 1;
    public static final int TYPE_CONFIG = 2;
    public static final char ACCFLAG_CARD = 'C';//卡账户
    public static final char ACCFLAG_EACC = 'E';//电子账户
    public static final char ACCFLAG_SHOP = 'S';//商户
    public static final char ACCFLAG_INNER = 'N';//内部固定账户
    public static final char ACCFLAG_INNER_INPUT = 'X';//内部固定账户
    public static final char ACCFLAG_FIX = 'F';//固定账户
    public static final char ACCFLAG_INPUT = 'I';//输入账户

    public static final String SUBJECT_CASH = "1001";//现金
    public static final String SUBJECT_BANKACC = "1002";//银行存款
    public static final String SUBJECT_SHEET = "1121";//应收票据
    public static final String SUBJECT_SHEET_BILL = "112101";//应收票据-支票
    public static final String SUBJECT_SHEET_OUTLAY = "112102";//应收票据-经费本
    public static final String SUBJECT_CARDSAVING = "2001";//卡户存款
    public static final String SUBJECT_CARDFOREGIFT = "2002";//卡户押金
    public static final String SUBJECT_ESAVING = "2003";//电子帐户存款
    public static final String SUBJECT_SHOPINCOME = "2004";//商户营业收入
    public static final String SUBJECT_SHOPSAVING = "2005";//商户存款
    public static final String SUBJECT_PROFIT = "4001";//本年利润
    public static final String SUBJECT_INCOME = "6001";//营业外收入 
    public static final String SUBJECT_INCOME_FEE = "6002";//手续费收入
    public static final String SUBJECT_INCOME_RAKEOFF = "6003";//佣金收入 
    public static final String SUBJECT_INCOME_BOARD = "6004";//搭伙费收入
    public static final String SUBJECT_INCOME_CARDCOST = "6005";//卡成本费收入
    public static final String SUBJECT_INCOME_BACKCARDBAL = "6006";//退卡盈余收入
    public static final String SUBJECT_INCOME_DEPRFEE = "6007";//折旧费收入
    public static final String SUBJECT_OUT = "6201";//营业外支出 
    public static final String SUBJECT_OUT_SHOP_DISCOUNT = "6202";//商户提成支出

    //201-204 持卡人交易类-
    public static final int TRANSTYPE_ISSUESAVING = 200;//发卡充值
    public static final int TRANSTYPE_CARDSAVING = 201;//持卡人存款
    public static final int TRANSTYPE_CARDSHOPSAVING = 202;//持卡人存款(充值商户)
    public static final int TRANSTYPE_CARDSUBSIDY = 203;//卡户补助
    public static final int TRANSTYPE_BANKTRANS = 204;//银行圈存转账
    public static final int TRANSTYPE_WATERREFUND = 205;//水控退款
    public static final int TRANSTYPE_ACCSUBSIDY = 206;//补助，下发到待领补助
    public static final int TRANSTYPE_GETSUBSIDY = 207;//从待领补助领取
    public static final int TRANSTYPE_BANKSUBSIDY = 208;//网银补助
    public static final int TRANSTYPE_WATERNOBALAREFUND = 209;//水控不平金额退款
    public static final int TRANSTYPE_BANKCHKADD = 210;//圈存补帐

    public static final int TRANSTYPE_CARDDRAW = 231;//持卡人取款
    public static final int TRANSTYPE_POSPAYMENT = 232;//POS消费
    public static final int TRANSTYPE_CARDPAYMENT = 233;//支付交易
    public static final int TRANSTYPE_CLOSEDRAW = 234;//消费退款
    public static final int TRANSTYPE_WATERTRANS = 235;//水控转账
    public static final int TRANSTYPE_POSPAYCANCEL = 236;//消费取消
    public static final int TRANSTYPE_CARD2CARD = 237;//卡卡转账
    public static final int TRANSTYPE_WATERDEPOSIT = 238;//水控充值
    public static final int TRANSTYPE_WATERDRAW = 239;//水控消费
    public static final int TRANSTYPE_WATERPAY = 240;//后付费补扣

    ;//电子账户类41-50
    public static final int TRANSTYPE_EACCSAVING = 241;//电子账户存款
    public static final int TRANSTYPE_CARD2EACC = 242;//电子账户转账(卡到电子账户)
    public static final int TRANSTYPE_BANK2EACC = 243;//电子账户圈存(银行卡到电子账户)

    public static final int TRANSTYPE_EACCDRAW = 251;//电子账户取款
    public static final int TRANSTYPE_EACC2CARD = 252;//电子账户转账到卡(电子账户到卡)
    public static final int TRANSTYPE_EACCPAYMENT = 253;//支付交易

    //充值商户类51-59
    public static final int TRANSTYPE_DEPOSITSHOPSAV = 261;//充值商户存款
    public static final int TRANSTYPE_DEPOSITSHOPSAVDISCNT = 262;//充值商户存款提成
    public static final int TRANSTYPE_DEPOSITSHOPDRAW = 271;//充值商户取款
    public static final int TRANSTYPE_DEPOSITSHOPDRAWDISCNT = 272;//充值商户退提成
    //收费商户类61-70
    public static final int TRANSTYPE_SHOPBOARDFEE = 281;//商户收搭伙费
    public static final int TRANSTYPE_SHOPBOARDFEE2 = 283;// 商户收搭伙费(预收模式，流水上来后结算给商户)
    public static final int TRANSTYPE_SHOPPAYMENT = 290;//商户解款

    public static final int TRANSTYPE_RETURNBOARDFEE = 291;//商户退搭伙费
    public static final int TRANSTYPE_SHOPREFUND = 292;//商户退款
    public static final int TRANSTYPE_SHOPDRAW = 293;//商户取款

    //利润
    public static final int TRANSTYPE_PROFIT = 401;//本年利润
    //601-620
    public static final int TRANSTYPE_FOREGIFT = 601;//收押金
    public static final int TRANSTYPE_CARDCOSTFEE = 602;//收卡成本费
    public static final int TRANSTYPE_POUNDAGE = 603;//收手续费
    public static final int TRANSTYPE_BOARDFEE = 604;//学校收搭伙费
    public static final int TRANSTYPE_DEPRFEE = 605;//收折旧费
    //621-640
    public static final int TRANSTYPE_RETURNFOREGIFT = 621;//退还押金
    public static final int TRANSTYPE_RETURNCARDCOSTFEE = 622;//退卡成本费
    public static final int TRANSTYPE_RETURNPOUNDAGE = 623;//退手续费
    public static final int TRANSTYPE_RETURNADVBOARDFEE = 624;//退学校搭伙费
    public static final int TRANSTYPE_RETURNDEPRFEE = 625;//退折旧费

    public static final int TRANSTYPE_FOREGIFT2COSTFEE = 631;//卡押金转成本费收入
    public static final int TRANSTYPE_CARDBAL2COSTFEE = 632;//卡余额转卡成本费收入
    public static final int TRANSTYPE_CARDBAL2FORGIFT = 633;//卡余额转卡押金
    //长款处理-641-650
    public static final int TRANSTYPE_MORE_CARDBAL = 641;//卡余额转退卡盈余
    public static final int TRANSTYPE_MORE_POSPAYMENT = 642;//消费流水发生额长款(针对无商户流水)
    public static final int TRANSTYPE_MORE_SHOPBOARDFEE = 643;//消费流水搭伙费长款(针对无商户流水)
    public static final int TRANSTYPE_MORE_CARDBALINCOME = 644;//卡余额转营业外收入
    public static final int TRANSTYPE_DEDUCTMONEY = 645;//扣款补助

    //短款处理651-660
    public static final int TRANSTYPE_LESS_CARDBAL = 651;//退卡损益转-卡余额
    public static final int TRANSTYPE_LESS_POSPAYMENT = 652;//消费流水发生额短款(针对挂失或注销卡)
    public static final int TRANSTYPE_LESS_SHOPBOARDFEE = 653;//消费流水搭伙费短款(针对挂失或注销卡),如果是商户收搭伙费的情况
    public static final int TRANSTYPE_LESS_SCHOOLBOARDFEE = 654;//消费流水搭伙费短款(针对挂失或注销卡),如果是学校收搭伙费的情况
    public static final int TRANSTYPE_LESSOUT2MOREIN = 655;//在商户和卡户都注销的情况下,流水从营业外支出到营业外收入
    //其他80-98
    public static final int TRANSTYPE_MANDRCR = 700;//手工借贷
    public static final int TRANSTYPE_SHOPRAKEOFF = 900;//佣金划拨

    public static final int OPERRIGHT_SYSTEM = 0;//只有系统操作员才能使用
    public static final int OPERRIGHT_CHECK = 1;//审核操作员才能使用
    public static final int OPERRIGHT_OPER = 2;//操作员才能使用

    public static final int SEQNO_BANK = -1; //银行圈存
    public static final int SEQNO_RECORD = -2; //记录号
    public static final int SEQNO_HOSTNO = -5; //主机流水号
    public static final int SEQNO_REFNO = -10; //一卡通使用
    public static final int SEQNO_MEDICAL = -20; //医疗系统

    public static final int MAXAMT_CARDGTACC = 200; //卡比库大不平允许最大金额
    public static final int RS_INIT = 0; //初始状态
    public static final int RS_FAIL = 1; //交易失败状态
    public static final int RS_SUCC = 2; //交易成功
    public static final int RS_WAITREV = 3; //一卡通后台待冲正
    public static final int RS_YKTREVSUCC = 4; //银行方待冲正
    public static final int RS_REVSUCC = 5; //全部冲正成功

    /* 用于帐务处理 */
    public static final int FREEFLAG = 1;    //卡成本或押金免费标志
    public static final int TRANSTYPE_FREE = 999;    //不收费免费条目交易类型
    public static final int DCFLAG_DEBIT = 1;        //借方标志
    public static final int DCFLAG_CREDIT = 2;       //贷方标志
    public static final int D4U5_SCALE = 2;          //四舍五入小数点后保留位数
    public static final int OFFLINEFLAG = 1;         //脱机交易标志
    public static final int REVFLAG = 1;             //冲正交易标志
    public static final int CARDPHYTYPE_MF1 = 20;    //MF1卡类型
    public static final String STATUS_NORMAL = "1";  //帐户正常状态
    public static final int CARDFLAG = 1;            //有卡标志
    public static final int CALCCARDBALFLAG = 1;     //计算卡余额标志
    public static final int FEETYPE_COMM = 999;      //通用收费类别
    public static final char STATUS_DELETE = '2';    //注销标志
    /* end */
}
