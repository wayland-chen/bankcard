package com.offke.core.bu.accounting;

import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;

import java.math.BigDecimal;

/**
 * <p>账务过程信息</p>
 *
 * @version 1.0
 * @since 2012/05/03
 */
public class Accprocess extends Atom {
    protected TradeInfo tradeInfo;

    public Accprocess(TradeInfo tradeInfo) {
        this.tradeInfo = tradeInfo;
    }

    protected int transcode; //交易码
    protected String refno; //交易参考号
    protected int revflag; //0-正常交易1-冲正交易
    protected int termid; //终端编号
    protected int termsno; //终端发送方流水号
    protected long termseqno; //终端主机流水号
    protected String accdate; //记账日期
    protected String acctime; //记账时间
    protected String transdate; //交易日期
    protected String transtime; //交易时间
    protected String sysdatetime;//系统时间 yyyymmddhhmiss
    protected int branchno; //操作员网点号
    protected int loginsiteno; //当前登录的站点
    protected String opercode; //操作员号
    protected String chkopercode;//审核操作员
    protected int offlineflag; //是否联机交易1-脱机交易0-联机交易
    protected int usecardflag; //1与卡有关系的交易0-与卡无关系的交易
    protected int cardflag; //有无卡标志(1有卡交易0无卡交易)
    protected int calccardbalflag;//计算卡余额标志
    protected int cardtype; //卡类型
    protected int cardphytype; //卡物理类型
    protected String cardphyid; //物理卡号
    protected String cardpwd; //卡密码
    protected int cardno; //卡号
    protected int purseno; //钱包号
    protected int dpscnt; //卡充值次数
    protected int paycnt; //卡消费次数
    protected int aftdpscnt; //卡充值后次数
    protected int aftpaycnt; //卡消费后次数
    protected int transflag; //次数类型，1充值2消费
    protected long cardsubsidyno; //卡补助批次号
    protected BigDecimal cardbefbal; //交易前卡余额
    protected BigDecimal cardaftbal; //交易后卡余额
    protected String showcardno;//显示卡号
    protected int feetype; //卡收费类型
    protected int custid; //客户号
    protected String custname; //客户名
    protected String stuempno; //学工号
    protected String deptcode; //部门号
    protected int shopid; //商户号
    protected String cardaccno; //卡帐户号
    protected String eaccno; //电子钱包账号
    protected String shopaccno; //商户账号
    protected String draccno; //输入值:借方账号
    protected String craccno; //输入值:贷方账号
    protected int fundtype; //资金类型 1-现金2-支票3-经费本4-个人帐户存款5-银行存款
    protected String voucherno; //凭证号
    protected String drsubjno; //输出值:借方科目
    protected String crsubjno; //输出值:贷方科目
    protected String draccname; //输出值:借方账户名
    protected String craccname; //输出值:贷方账户名
    protected int transtype; //交易类型
    protected long subseqno; //子流水号
    protected BigDecimal inputamt; //输入金额
    protected BigDecimal transamt; //交易金额
    protected BigDecimal addamt; //补写金额
    protected BigDecimal unusedamt; //剩余金额
    protected BigDecimal totalfeeamt = BigDecimal.valueOf(0); //总收费金额(输出)
    protected BigDecimal totaltransamt = BigDecimal.valueOf(0); //总交易金额(输出)
    protected BigDecimal forgift; //押金金额
    protected BigDecimal draccbefbal; //交易前借方帐户余额
    protected BigDecimal craccbefbal; //交易前贷方帐户余额
    protected BigDecimal draccaftbal; //交易后借方帐户余额
    protected BigDecimal craccaftbal; //交易后贷方帐户余额
    protected boolean summaryflag = false; //是否使用前台或者第三方摘要
    protected String summary; //摘要
    protected int errcode; //错误码
    protected String remark; //备注


    /**
     * 获取交易过程信息
     *
     * @return 交易过程信息
     */
    public TradeInfo getTradeInfo() {
        return tradeInfo;
    }

    /**
     * 设置交易过程信息
     *
     * @param tradeInfo 交易过程信息
     */
    public void setTradeInfo(TradeInfo tradeInfo) {
        this.tradeInfo = tradeInfo;
    }

    /**
     * 获取交易码
     *
     * @return 交易码
     */
    public int getTranscode() {
        return transcode;
    }

    /**
     * 设置交易码
     *
     * @param transcode 交易码
     */
    public void setTranscode(int transcode) {
        this.transcode = transcode;
    }

    /**
     * 获取交易参考号
     *
     * @return 交易参考号
     */
    public String getRefno() {
        return refno;
    }

    /**
     * 设置交易参考号
     *
     * @param refno 交易参考号
     */
    public void setRefno(String refno) {
        this.refno = refno;
    }

    /**
     * 设置交易类型
     *
     * @return 0-正常交易1-冲正交易
     */
    public int getRevflag() {
        return revflag;
    }

    /**
     * 获取交易类型
     *
     * @param revflag 0-正常交易1-冲正交易
     */
    public void setRevflag(int revflag) {
        this.revflag = revflag;
    }

    /**
     * 设置终端编号
     *
     * @return 获取终端编号
     */
    public int getTermid() {
        return termid;
    }

    /**
     * 设置终端编号
     *
     * @param termid 终端编号
     */
    public void setTermid(int termid) {
        this.termid = termid;
    }

    /**
     * 获取终端发送方流水号
     *
     * @return 终端发送方流水号
     */
    public int getTermsno() {
        return termsno;
    }

    /**
     * 设置终端发送方流水号
     *
     * @param termsno
     */
    public void setTermsno(int termsno) {
        this.termsno = termsno;
    }

    /**
     * 获取终端主机流水号
     *
     * @return 终端主机流水号
     */
    public long getTermseqno() {
        return termseqno;
    }

    /**
     * 设置终端主机流水号
     *
     * @param termseqno 终端主机流水号
     */
    public void setTermseqno(long termseqno) {
        this.termseqno = termseqno;
    }

    /**
     * 获取记账日期
     *
     * @return 记账日期
     */
    public String getAccdate() {
        return accdate;
    }

    /**
     * 设置记账日期
     *
     * @param accdate 记账日期
     */
    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    /**
     * 获取记账时间
     *
     * @return 记账时间
     */
    public String getAcctime() {
        return acctime;
    }

    /**
     * 设置记账时间
     *
     * @param acctime 记账时间
     */
    public void setAcctime(String acctime) {
        this.acctime = acctime;
    }

    /**
     * 获取交易日期
     *
     * @return 交易日期
     */
    public String getTransdate() {
        return transdate;
    }

    /**
     * 设置交易日期
     *
     * @param transdate 交易日期
     */
    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    /**
     * 获取交易时间
     *
     * @return 交易时间
     */
    public String getTranstime() {
        return transtime;
    }

    /**
     * 设置交易时间
     *
     * @param transtime 交易时间
     */
    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    /**
     * 获取系统时间 yyyymmddhhmiss
     *
     * @return 系统时间 yyyymmddhhmiss
     */
    public String getSysdatetime() {
        return sysdatetime;
    }

    /**
     * 设置系统时间 yyyymmddhhmiss
     *
     * @param sysdatetime 系统时间 yyyymmddhhmiss
     */
    public void setSysdatetime(String sysdatetime) {
        this.sysdatetime = sysdatetime;
    }

    /**
     * 获取操作员网点号
     *
     * @return 操作员网点号
     */
    public int getBranchno() {
        return branchno;
    }

    /**
     * 设置操作员网点号
     *
     * @param branchno 操作员网点号
     */
    public void setBranchno(int branchno) {
        this.branchno = branchno;
    }

    /**
     * 获取当前登录的站点
     *
     * @return 当前登录的站点
     */
    public int getLoginsiteno() {
        return loginsiteno;
    }

    /**
     * 设置当前登录的站点
     *
     * @param loginsiteno 当前登录的站点
     */
    public void setLoginsiteno(int loginsiteno) {
        this.loginsiteno = loginsiteno;
    }

    /**
     * 获取操作员号
     *
     * @return 操作员号
     */
    public String getOpercode() {
        return opercode;
    }

    /**
     * 设置操作员号
     *
     * @param opercode 操作员号
     */
    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    /**
     * 获取审核操作员
     *
     * @return 审核操作员
     */
    public String getChkopercode() {
        return chkopercode;
    }

    /**
     * 设置审核操作员
     *
     * @param chkopercode 审核操作员
     */
    public void setChkopercode(String chkopercode) {
        this.chkopercode = chkopercode;
    }

    /**
     * 是否联机交易1-脱机交易0-联机交易
     *
     * @return 1-脱机交易0-联机交易
     */
    public int getOfflineflag() {
        return offlineflag;
    }

    /**
     * 设置 是否联机交易1-脱机交易0-联机交易
     *
     * @param offlineflag 1-脱机交易0-联机交易
     */
    public void setOfflineflag(int offlineflag) {
        this.offlineflag = offlineflag;
    }

    /**
     * 获取 1与卡有关系的交易0-与卡无关系的交易
     *
     * @return 1与卡有关系的交易0-与卡无关系的交易
     */
    public int getUsecardflag() {
        return usecardflag;
    }

    /**
     * 设置 1与卡有关系的交易0-与卡无关系的交易
     *
     * @param usecardflag 1与卡有关系的交易0-与卡无关系的交易
     */
    public void setUsecardflag(int usecardflag) {
        this.usecardflag = usecardflag;
    }

    /**
     * 有无卡标志(1有卡交易0无卡交易)
     *
     * @return 1有卡交易0无卡交易
     */
    public int getCardflag() {
        return cardflag;
    }

    /**
     * 设置计算卡余额标志
     *
     * @param cardflag 计算卡余额标志
     */
    public void setCardflag(int cardflag) {
        this.cardflag = cardflag;
    }

    /**
     * 获取计算卡余额标志
     *
     * @return 计算卡余额标志
     */
    public int getCalccardbalflag() {
        return calccardbalflag;
    }

    /**
     * 设置计算卡余额标志
     *
     * @param calccardbalflag 计算卡余额标志
     */
    public void setCalccardbalflag(int calccardbalflag) {
        this.calccardbalflag = calccardbalflag;
    }

    /**
     * 获取卡类型
     *
     * @return 计算卡余额标志
     */
    public int getCardtype() {
        return cardtype;
    }

    /**
     * 设置卡类型
     *
     * @param cardtype
     */
    public void setCardtype(int cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 获取卡物理类型
     *
     * @return
     */
    public int getCardphytype() {
        return cardphytype;
    }

    /**
     * 设置卡物理类型
     *
     * @param cardphytype 卡物理类型
     */
    public void setCardphytype(int cardphytype) {
        this.cardphytype = cardphytype;
    }

    /**
     * 获取卡物理类型
     *
     * @return 卡物理类型
     */
    public String getCardphyid() {
        return cardphyid;
    }

    /**
     * 设置物理卡号
     *
     * @param cardphyid 物理卡号
     */
    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    /**
     * 获取卡密码
     *
     * @return 卡密码
     */
    public String getCardpwd() {
        return cardpwd;
    }

    /**
     * 设置卡密码
     *
     * @param cardpwd 卡密码
     */
    public void setCardpwd(String cardpwd) {
        this.cardpwd = cardpwd;
    }

    /**
     * 获取卡号
     *
     * @return 卡号
     */
    public int getCardno() {
        return cardno;
    }

    /**
     * 设置钱包号
     *
     * @param cardno 钱包号
     */
    public void setCardno(int cardno) {
        this.cardno = cardno;
    }

    /**
     * 获取钱包号
     *
     * @return 钱包号
     */
    public int getPurseno() {
        return purseno;
    }

    /**
     * 设置钱包号
     *
     * @param purseno 钱包号
     */
    public void setPurseno(int purseno) {
        this.purseno = purseno;
    }

    /**
     * 获取卡充值次数
     *
     * @return 卡充值次数
     */
    public int getDpscnt() {
        return dpscnt;
    }

    /**
     * 设置卡充值次数
     *
     * @param dpscnt 卡充值次数
     */
    public void setDpscnt(int dpscnt) {
        this.dpscnt = dpscnt;
    }

    /**
     * 获取卡消费次数
     *
     * @return 卡消费次数
     */
    public int getPaycnt() {
        return paycnt;
    }

    /**
     * 设置卡消费次数
     *
     * @param paycnt 卡消费次数
     */
    public void setPaycnt(int paycnt) {
        this.paycnt = paycnt;
    }

    /**
     * 获取卡充值后次数
     *
     * @return 卡充值后次数
     */
    public int getAftdpscnt() {
        return aftdpscnt;
    }

    /**
     * 设置卡充值后次数
     *
     * @param aftdpscnt 卡充值后次数
     */
    public void setAftdpscnt(int aftdpscnt) {
        this.aftdpscnt = aftdpscnt;
    }

    /**
     * 获取卡消费后次数
     *
     * @return 卡消费后次数
     */
    public int getAftpaycnt() {
        return aftpaycnt;
    }

    /**
     * 设置卡消费后次数
     *
     * @param aftpaycnt
     */
    public void setAftpaycnt(int aftpaycnt) {
        this.aftpaycnt = aftpaycnt;
    }

    /**
     * 获取次数类型
     *
     * @return 1充值2消费
     */
    public int getTransflag() {
        return transflag;
    }

    /**
     * 设置次数类型
     *
     * @param transflag 1充值2消费
     */
    public void setTransflag(int transflag) {
        this.transflag = transflag;
    }

    /**
     * 获取卡补助批次号
     *
     * @return 卡补助批次号
     */
    public long getCardsubsidyno() {
        return cardsubsidyno;
    }

    /**
     * 设置卡补助批次号
     *
     * @param cardsubsidyno 卡补助批次号
     */
    public void setCardsubsidyno(long cardsubsidyno) {
        this.cardsubsidyno = cardsubsidyno;
    }

    /**
     * 获取交易前卡余额
     *
     * @return 交易前卡余额
     */
    public BigDecimal getCardbefbal() {
        return cardbefbal;
    }

    /**
     * 设置交易前卡余额
     *
     * @param cardbefbal 交易前卡余额
     */
    public void setCardbefbal(BigDecimal cardbefbal) {
        this.cardbefbal = cardbefbal;
    }

    /**
     * 获取交易后卡余额
     *
     * @return 交易后卡余额
     */
    public BigDecimal getCardaftbal() {
        return cardaftbal;
    }

    /**
     * 设置交易后卡余额
     *
     * @param cardaftbal 交易后卡余额
     */
    public void setCardaftbal(BigDecimal cardaftbal) {
        this.cardaftbal = cardaftbal;
    }

    /**
     * 获取显示卡号
     *
     * @return 显示卡号
     */
    public String getShowcardno() {
        return showcardno;
    }

    /**
     * 设置显示卡号
     *
     * @param showcardno
     */
    public void setShowcardno(String showcardno) {
        this.showcardno = showcardno;
    }

    /**
     * 获取卡收费类型
     *
     * @return 卡收费类型
     */
    public int getFeetype() {
        return feetype;
    }

    /**
     * 设置卡收费类型
     *
     * @param feetype 卡收费类型
     */
    public void setFeetype(int feetype) {
        this.feetype = feetype;
    }

    /**
     * 获取客户号
     *
     * @return 客户号
     */
    public int getCustid() {
        return custid;
    }

    /**
     * 设置客户号
     *
     * @param custid 客户号
     */
    public void setCustid(int custid) {
        this.custid = custid;
    }

    /**
     * 获取客户名
     *
     * @return 客户名
     */
    public String getCustname() {
        return custname;
    }

    /**
     * 设置客户名
     *
     * @param custname
     */
    public void setCustname(String custname) {
        this.custname = custname;
    }

    /**
     * 获取学工号
     *
     * @return 部门号
     */
    public String getStuempno() {
        return stuempno;
    }

    /**
     * 设置学工号
     *
     * @param stuempno 学工号
     */
    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    /**
     * 获取部门号
     *
     * @return 部门号
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
     * 设置部门号
     *
     * @param deptcode 部门号
     */
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    /**
     * 获取商户号
     *
     * @return 商户号
     */
    public int getShopid() {
        return shopid;
    }

    /**
     * 设置商户号
     *
     * @param shopid 商户号
     */
    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    /**
     * 获取卡帐户号
     *
     * @return 卡帐户号
     */
    public String getCardaccno() {
        return cardaccno;
    }

    /**
     * 设置卡帐户号
     *
     * @param cardaccno 卡帐户号
     */
    public void setCardaccno(String cardaccno) {
        this.cardaccno = cardaccno;
    }

    /**
     * 获取电子钱包账号
     *
     * @return 电子钱包账号
     */
    public String getEaccno() {
        return eaccno;
    }

    /**
     * 设置电子钱包账号
     *
     * @param eaccno 电子钱包账号
     */
    public void setEaccno(String eaccno) {
        this.eaccno = eaccno;
    }

    /**
     * 获取商户账号
     *
     * @return 商户账号
     */
    public String getShopaccno() {
        return shopaccno;
    }

    /**
     * 设置商户账号
     *
     * @param shopaccno 商户账号
     */
    public void setShopaccno(String shopaccno) {
        this.shopaccno = shopaccno;
    }

    /**
     * 获取借方账号
     *
     * @return 借方账号
     */
    public String getDraccno() {
        return draccno;
    }

    /**
     * 设置借方账号
     *
     * @param draccno 借方账号
     */
    public void setDraccno(String draccno) {
        this.draccno = draccno;
    }

    /**
     * 获取贷方账号
     *
     * @return 贷方账号
     */
    public String getCraccno() {
        return craccno;
    }

    /**
     * 设置贷方账号
     *
     * @param craccno 贷方账号
     */
    public void setCraccno(String craccno) {
        this.craccno = craccno;
    }

    /**
     * 获取资金类型
     *
     * @return 1-现金2-支票3-经费本4-个人帐户存款5-银行存款
     */
    public int getFundtype() {
        return fundtype;
    }

    /**
     * 设置资金类型
     *
     * @param fundtype 1-现金2-支票3-经费本4-个人帐户存款5-银行存款
     */
    public void setFundtype(int fundtype) {
        this.fundtype = fundtype;
    }

    /**
     * 获取凭证号
     *
     * @return 凭证号
     */
    public String getVoucherno() {
        return voucherno;
    }

    /**
     * 设置凭证号
     *
     * @param voucherno 凭证号
     */
    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    /**
     * 获取借方科目
     *
     * @return
     */
    public String getDrsubjno() {
        return drsubjno;
    }

    /**
     * 设置贷方科目
     *
     * @param drsubjno 贷方科目
     */
    public void setDrsubjno(String drsubjno) {
        this.drsubjno = drsubjno;
    }

    /**
     * 获取贷方科目
     *
     * @return 贷方科目
     */
    public String getCrsubjno() {
        return crsubjno;
    }

    /**
     * 设置贷方科目
     *
     * @param crsubjno 贷方科目
     */
    public void setCrsubjno(String crsubjno) {
        this.crsubjno = crsubjno;
    }

    /**
     * 获取借方账户名
     *
     * @return 借方账户名
     */
    public String getDraccname() {
        return draccname;
    }

    /**
     * 设置借方账户名
     *
     * @param draccname 借方账户名
     */
    public void setDraccname(String draccname) {
        this.draccname = draccname;
    }

    /**
     * 获取贷方账户名
     *
     * @return 贷方账户名
     */
    public String getCraccname() {
        return craccname;
    }

    /**
     * 设置贷方账户名
     *
     * @param craccname 贷方账户名
     */
    public void setCraccname(String craccname) {
        this.craccname = craccname;
    }

    /**
     * 获取交易类型
     *
     * @return 交易类型
     */
    public int getTranstype() {
        return transtype;
    }

    /**
     * 设置交易类型
     *
     * @param transtype 交易类型
     */
    public void setTranstype(int transtype) {
        this.transtype = transtype;
    }

    /**
     * 获取子流水号
     *
     * @return
     */
    public long getSubseqno() {
        return subseqno;
    }

    /**
     * 设置子流水号
     *
     * @param subseqno 子流水号
     */
    public void setSubseqno(long subseqno) {
        this.subseqno = subseqno;
    }

    /**
     * 获取输入金额
     *
     * @return 输入金额
     */
    public BigDecimal getInputamt() {
        return inputamt;
    }

    /**
     * 设置输入金额
     *
     * @param inputamt 输入金额
     */
    public void setInputamt(BigDecimal inputamt) {
        this.inputamt = inputamt;
    }

    /**
     * 获取交易金额
     *
     * @return 交易金额
     */
    public BigDecimal getTransamt() {
        return transamt;
    }

    /**
     * 设置交易金额
     *
     * @param transamt
     */
    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

    /**
     * 获取补写金额
     *
     * @return 补写金额
     */
    public BigDecimal getAddamt() {
        return addamt;
    }

    /**
     * 设置补写金额
     *
     * @param addamt 补写金额
     */
    public void setAddamt(BigDecimal addamt) {
        this.addamt = addamt;
    }

    /**
     * 获取剩余金额
     *
     * @return 剩余金额
     */
    public BigDecimal getUnusedamt() {
        return unusedamt;
    }

    /**
     * 设置剩余金额
     *
     * @param unusedamt 剩余金额
     */
    public void setUnusedamt(BigDecimal unusedamt) {
        this.unusedamt = unusedamt;
    }

    /**
     * 获取总收费金额(输出)
     *
     * @return
     */
    public BigDecimal getTotalfeeamt() {
        return totalfeeamt;
    }

    /**
     * 设置总收费金额
     *
     * @param totalfeeamt
     */
    protected void setTotalfeeamt(BigDecimal totalfeeamt) {
        this.totalfeeamt = totalfeeamt;
    }

    /**
     * 获取总交易金额(输出)
     *
     * @return 总交易金额(输出)
     */
    public BigDecimal getTotaltransamt() {
        return totaltransamt;
    }

    /**
     * 设置总交易金额
     *
     * @param totaltransamt
     */
    protected void setTotaltransamt(BigDecimal totaltransamt) {
        this.totaltransamt = totaltransamt;
    }

    /**
     * 获取押金金额
     *
     * @return 押金金额
     */
    public BigDecimal getForgift() {
        return forgift;
    }

    /**
     * 设置押金金额
     *
     * @param forgift 押金金额
     */
    public void setForgift(BigDecimal forgift) {
        this.forgift = forgift;
    }

    /**
     * 获取交易前借方帐户余额
     *
     * @return 交易前借方帐户余额
     */
    public BigDecimal getDraccbefbal() {
        return draccbefbal;
    }

    /**
     * 设置交易前借方帐户余额
     *
     * @param draccbefbal 交易前借方帐户余额
     */
    public void setDraccbefbal(BigDecimal draccbefbal) {
        this.draccbefbal = draccbefbal;
    }

    /**
     * 获取交易前贷方帐户余额
     *
     * @return 交易前贷方帐户余额
     */
    public BigDecimal getCraccbefbal() {
        return craccbefbal;
    }

    /**
     * 设置交易前贷方帐户余额
     *
     * @param craccbefbal 交易前贷方帐户余额
     */
    public void setCraccbefbal(BigDecimal craccbefbal) {
        this.craccbefbal = craccbefbal;
    }

    /**
     * 获取交易后借方帐户余额
     *
     * @return 交易后借方帐户余额
     */
    public BigDecimal getDraccaftbal() {
        return draccaftbal;
    }

    /**
     * 设置交易后借方帐户余额
     *
     * @param draccaftbal 交易后借方帐户余额
     */
    public void setDraccaftbal(BigDecimal draccaftbal) {
        this.draccaftbal = draccaftbal;
    }

    /**
     * 获取交易后贷方帐户余额
     *
     * @return 交易后贷方帐户余额
     */
    public BigDecimal getCraccaftbal() {
        return craccaftbal;
    }

    /**
     * 设置交易后贷方帐户余额
     *
     * @param craccaftbal 交易后贷方帐户余额
     */
    public void setCraccaftbal(BigDecimal craccaftbal) {
        this.craccaftbal = craccaftbal;
    }

    /**
     * 摘要
     *
     * @return 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
        this.summaryflag = true;
    }

    /**
     * 获取错误码
     *
     * @return 错误码
     */
    public int getErrcode() {
        return errcode;
    }

    /**
     * 设置错误码
     *
     * @param errcode 错误码
     */
    protected void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    /**
     * 获取备注
     *
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 空实现
     */
    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        return true;
    }

}
