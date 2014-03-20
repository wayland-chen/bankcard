package com.offke.core.annotation.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TradeCode {
    String TCM_AREA = "";//区域
    String TCM_BRANCH = "";//网点
    String TCM_SITE = "";//站点
    String TCM_OPER = "";//操作员
    String TC_OPERPWDUPD = "";//操作员密码修改
    String TC_OPERPWDRESET = "";//操作员密码重置
    String TCM_OPERSITE = "";//操作员站点
    String TCM_AUTHTPL = "";//权限模板
    String TCM_DEPT = "";//部门
    String TCM_SPECIALTY = "";//专业
    String TCM_SUBSYS = "";//子系统
    String TCM_DEVICE = "";//设备
    String TCM_DICTIONARY = "";//数据字典
    String TCM_PARAM = "";//全局参数
    String TCM_CARDTYPE = "";//卡类别
    String TCM_PURSE = "";//钱包
    String TCM_CUSTTYPE = "";//客户类别
    String TCM_FEETYPE = "";//收费类别
    String TCM_CFGFEE = "";//交易配置
    String TCM_TASK = "";//计划任务
    String TC_TASKLOGQRY = "";//计划任务日志查询
    String TCM_MQ = "";//消息队列
    String TCM_BANKCARD = "";//银行卡绑定
    String TCM_POSSHOP = "";//POS商户
    String TCM_DEPOSITSHOPPOS = "";//充值商户POS
    String TCM_DEPOSITOPER = "";//充值操作员
    String TCM_DEPOSITOPERPOS = "";//充值操作员POS
    String TCM_MEAL = "";//餐次
    String TCM_SHOPMEAL = "";//商户餐次
    String TCM_SHOPRAKEOFF = "";//商户佣金
    String TCM_CUSTOMER = "";//客户信息
    String TCM_CFGSHOPFEE = "";//商户搭伙费费率
    String TCM_CARDTYPERIGHT = "";//卡类别权限
    String TCM_BANKTMP = "";//银行卡名单
    String TC_BANKBIND = "";//银行卡联机绑定
    String TCM_OPERAUTH = "";//操作员权限
    String TCM_DEPOSITOPERAUTH = "";//充值操作员授权
    String TCM_WATERRATE = "";//水费设置
    String TCM_DOORGROUP = "";//门禁组

    String TCM_PSAM = "";//PSAM卡
    String TCM_WATERFEE = "";//水控费率

    String TC_CUSTOMERTMPIMP = "";//客户信息导入
    String TC_CUSTOMERTMPDEL = "";//客户信息导入删除
    String TC_CUSTOMERTMPUPD = "";//客户信息导入修改
    String TC_CUSTOMERTMPQRY = "";//客户信息导入查询
    String TC_CUSTOMERTMPCHK = "";//客户信息导入审核

    String TC_DEVICETMPIMP = "";//设备文件导入
    String TC_DEVICETMPDEL = "";//设备文件导入删除
    String TC_DEVICETMPUPD = "";//设备文件导入修改
    String TC_DEVICETMPQRY = "";//设备文件查询
    String TC_DEVICETMPCHK = "";//设备文件审核

    String TC_SHOPPOSTMPIMP = "";//商户POS文件导入
    String TC_SHOPPOSTMPDEL = "";//商户POS文件导入删除
    String TC_SHOPPOSTMPUPD = "";//商户POS文件导入修改
    String TC_SHOPPOSTMPQRY = "";//商户POS文件导入查询
    String TC_SHOPPOSTMPCHK = "";//商户POS文件导入审核

    String TC_POSDTLTMPIMP = "";//POS流水导入
    String TC_POSDTLTMPADD = "";//POS流水手工录入
    String TC_POSDTLTMPDEL = "";//POS流水导入删除
    String TC_POSDTLTMPUPD = "";//POS流水导入修改
    String TC_POSDTLTMPQRY = "";//POS流水导入查询
    String TC_POSDTLTMPCHK = "";//POS流水导入审核

    String TCM_POSDTL = "";//POS异常流水
    String TC_CARDGET = "";//卡片领入
    String TC_CARDPUT = "";//卡片上交
    String TC_CARDDISABLE = "";//卡片作废
    String TC_CARDDISABLEREV = "";//卡片作废取消
    String TC_CARDCHANGE = "";//卡片交接
    String TCM_CARDBAD = "";//坏卡登记
    String TC_CARDQRY = "";//卡片查询

    String TC_AUTHCARDOPEN = "";//授权卡发行
    String TC_AUTHCARDCLOSE = "";//授权卡回收
    String TC_AUTHCARDLOSS = "";//授权卡挂失
    String TC_AUTHCARDUNLOSS = "";//授权卡解挂
    String TC_AUTHCARDUPD = "";//授权卡更新
    String TC_AUTHCARDQRY = "";//授权卡查询

    String TC_SHOPCARDOPEN = "";//商户卡发行
    String TC_SHOPCARDCLOSE = "";//商户卡回收
    String TC_SHOPCARDLOSS = "";//商户卡挂失
    String TC_SHOPCARDUNLOSS = "";//商户卡解挂

    String TC_CARDOPEN = "40003100";//卡片开户
    String TC_CARDOPENREV = "";//卡片开户冲正
    String TC_CARDCLOSE = "";//卡片销户
    String TC_CARDRENEW = "";//卡补办
    String TC_CARDRETURN = "";//卡回收
    String TC_CARDLOSS = "";//卡挂失
    String TC_CARDUNLOSS = "";//卡解挂
    String TC_CARDFROZE = "";//卡冻结
    String TC_CARDUNFROZE = "";//卡解冻
    String TC_CARDUPDBASEINFO = "";//更新卡基本信息
    String TC_CARDUPDEXPIREDATE = "";//更新卡有效期
    String TC_CARDUPDBADCARD = "";//坏卡修复
    String TC_CARDREWRITE = "";//重写卡信息
    String TC_CARDCLEAR = "";// 清空卡信息
    String TC_CARDSAVEINFO = "";//换卡保存卡信息
    String TC_CARDINSTEAD = "";//换卡
    String TC_CARDINSTEADREV = "";//换卡撤销
    String TC_NEWCARDCHANGE = "";//新生换卡

    String TC_CARDDEPOSIT = "";//卡充值
    String TC_CARDDEPOSITREV = "";//卡充值冲正
    String TC_CARDAUTODEPOSIT = "";//自助现金充值
    String TC_CARDDRAW = "";//卡支取
    String TC_SUBSIDYIMP = "";//补助导入
    String TC_SUBSIDYDEL = "";//补助删除
    String TC_SUBSIDYUPD = "";//补助修改
    String TC_SUBSIDYQRY = "";//补助查询
    String TC_SUBSIDYCHECK = "";//补助审核
    String TC_SUBSIDYREV = "";//补贴冲正
    String TC_SUBSIDYPUT = "";//补助下发

    String TC_POSDEPOSIT = "";//POS充值
    String TC_POSDEPOSITREV = "";//POS充值冲正
    String TC_SHOPPOSDEPOSIT = "";//充值商户POS充值
    String TC_SHOPPOSDEPOSITREV = "";//充值商户POS充值冲正
    String TC_POSDRAW = "";//POS消费
    String TC_POSDRAWREV = "";//消费冲正
    String TC_POSDRAWCANCEL = "";//消费取消
    String TC_BANKTRANS = "";//圈存转账
    String TC_BANKSUBSIDY = "";//网银下发补助
    String TC_BANKTRANSADD = "";//圈存补帐
    String TC_CARDPAYMENT = "";//卡支付交易
    ;// String  TC_DEDUCTPUT      ""  ;//下发扣款
    String TC_CARDPWDUPD = "";//卡密码修改
    String TC_CARDPWDRESET = "";//卡密码重置
    String TC_SUBSIDYGET = "";//补助领取
    String TC_CARD2CARTRANS = "";//卡卡转账(旧卡到新卡)
    String TC_CARDBALMOD = "";//卡余额调整
    String TC_CARDBALUPD = "";//卡余额修正
    String TC_WATERCARDBALMOD = "";//水控卡余额调整
    String TC_WATERTRANS = "";//水控转账
    String TC_WATERJD2XT = "";//竟达转新天水控
    String TC_WATERXT2JD = "";//新天转竟达水控
    String TC_WATERPAY = "";//后付费补扣
    String TC_WATERPAYUNLOCK = "";//后付费解锁
    String TC_CARD2CARD = "";//卡卡转账
    String TC_POSLOCKCARD = "";//POS锁卡
    String TC_CONSUMEFAIL = "";//消费失败
    String TC_SYSREV = "";//系统冲正
    String TC_WATERDEPOSIT = "";//水控充值
    String TC_WATERBALRETURN = "";//退水控余额
    String TC_WATERDRAW = "";//水控消费
    String TC_BUSDRAW = "";//车载消费
    String TC_WATERNOBALARET = "";//水控不平金额退款

    String TC_TRANSREV = "";//冲账交易
    String TC_CARDACCDIFF = "";//卡库不平

    String TC_SHOPOPEN = "";//商户开户
    String TC_SHOPCLOSE = "";//商户销户
    String TC_SHOPUPD = "";//商户信息修改
    String TC_SHOPQRY = "";//商户信息查询
    String TC_SHOPSAVING = "";//商户存款
    String TC_SHOPSUBJECTADD = "";//商户科目映射
    String TC_SHOPSUBJECTUPD = "";//商户科目映射修改
    String TC_SHOPSUBJECTDEL = "";//商户科目映射删除

    String TC_EACCOPEN = "";//电子钱包开户
    String TC_EACCCLOSE = "";//电子钱包销户
    String TC_EACCDEPOSIT = "";//电子钱包充值
    String TC_EACCDRAW = "";//电子钱包取款
    String TC_CARD2EACC = "";//卡到电子钱包转帐
    String TC_EACC2CARD = "";//电子钱包到卡转帐
    String TC_BANK2EACC = "";//银行卡到电子钱包转帐
    String TC_EACCSTOPPAY = "";//电子钱包止付
    String TC_EACCUNSTOPPAY = "";//电子钱包解付
    String TC_EACCQRY = "";//电子钱包信息查询
    String TC_EACCPWDUPD = "";//电子钱包密码修改
    String TC_EACCPWDRESET = "";//电子钱包密码重置
    String TC_EACCLOGIN = "";//电子钱包支付系统签到
    String TC_EACCQRYBAL = "";//电子钱包余额查询
    String TC_EACCFROZE = "";//电子钱包冻结
    String TC_EACC2SHOP = "";//电子钱包支付
    String TC_EACC2SHOPREV = "";//电子钱包支付冲正
    String TC_MANUALDRCR = "";//手工借贷

    String TC_VOUCHERMAKE = "";//凭证录入
    String TC_VOUCHERUPD = "";//凭证修改
    String TC_VOUCHERDEL = "";//凭证删除
    String TC_VOUCHERSIGN = "";//凭证签字
    String TC_VOUCHERCHECK = "";//凭证复核
    String TC_VOUCHERCHECKREV = "";//凭证复核取消
    String TC_VOUCHERBOOK = "";//凭证入账
    String TC_VOUCHERBOOKREV = "";//凭证冲销

    String TC_SHOPPAYMENT = "";//商户解款
    String TC_DAYEND = "";//日终结算
    String TC_MONTHEND = "";//期末结转
    String TC_YEAREND = "";//年终结转

    /**
     * *****************Begin Pos******************
     */
    String Backversion = "5001";//下发黑名单版本号
    String Downcfgfee = "5002";//下发搭伙费
    String Downclock = "5003";//下发时间
    String Downallpass = "5004";//下传累计密码启用金额
    String Uploadclock = "5005";//上传时间
    String Downnames = "5006";//下传黑名单
    String Downdevparam = "5007";//下传设备主参数
    String Downamountpasswd = "5008";//下传密码启用金额
    String Downltestink = "5009";//下传回响测试
    /********************End  Pos*******************/

}
