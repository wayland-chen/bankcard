package com.offke.tradeunits.atoms.aips.upload.storage;

import java.math.BigDecimal;

public class ConsumerInfos {
    private Integer cardno;//卡号
    private BigDecimal cardbefbal; //交易前卡余额
    private BigDecimal amount;//交易金额
    private BigDecimal cardaftbal;//交易后交易金额
    private String tradedate;//交易日期和时间
    private Integer pursesn; //钱包流水号,卡交易次数
    private Integer possn; //pos流水号
    private Integer srcpossn; //原pos流水号
    private String opercode; //本笔交易的操作员卡号
    private Integer termno;//终端序列号
    private BigDecimal fee;//交易金额
    private Integer shopid;//商户号
    private Integer purseindex; //钱包索引号,钱包号
    private Integer transmark; //交易标识
    private Integer consumptionmode; //消费模式
    private String mac;//校验

    public ConsumerInfos() {
        this.cardno = 0;
        this.cardbefbal = BigDecimal.ZERO;
        this.amount = BigDecimal.ZERO;
        this.cardaftbal = BigDecimal.ZERO;
        this.tradedate = " ";
        this.pursesn = 0;
        this.possn = 0;
        this.srcpossn = 0;
        this.opercode = " ";
        this.termno = 0;
        this.fee = BigDecimal.ZERO;
        this.shopid = 0;
        this.purseindex = 0;
        this.transmark = 0;
        this.consumptionmode = 0;
        this.mac = " ";
    }

    public ConsumerInfos(Integer cardno,
                         BigDecimal cardbefbal,
                         BigDecimal amount,
                         BigDecimal cardaftbal,
                         String tradedate,
                         Integer pursesn,
                         Integer possn,
                         Integer srcpossn,
                         String opercode,
                         Integer termno,
                         BigDecimal fee,
                         Integer shopid,
                         Integer purseindex,
                         Integer transmark,
                         Integer consumptionmode,
                         String mac) {
        this.cardno = cardno;
        this.cardbefbal = cardbefbal;
        this.amount = amount;
        this.cardaftbal = cardaftbal;
        this.tradedate = tradedate;
        this.pursesn = pursesn;
        this.possn = possn;
        this.srcpossn = srcpossn;
        this.opercode = opercode;
        this.termno = termno;
        this.fee = fee;
        this.shopid = shopid;
        this.purseindex = purseindex;
        this.transmark = transmark;
        this.consumptionmode = consumptionmode;
        this.mac = mac;
    }

    public Integer getCardno() {
        return cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    public BigDecimal getCardbefbal() {
        return cardbefbal;
    }

    public void setCardbefbal(BigDecimal cardbefbal) {
        this.cardbefbal = cardbefbal;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCardaftbal() {
        return cardaftbal;
    }

    public void setCardaftbal(BigDecimal cardaftbal) {
        this.cardaftbal = cardaftbal;
    }

    public String getTradedate() {
        return tradedate;
    }

    public void setTradedate(String tradedate) {
        this.tradedate = tradedate;
    }

    public Integer getPursesn() {
        return pursesn;
    }

    public void setPursesn(Integer pursesn) {
        this.pursesn = pursesn;
    }

    public Integer getPossn() {
        return possn;
    }

    public void setPossn(Integer possn) {
        this.possn = possn;
    }

    public Integer getSrcpossn() {
        return srcpossn;
    }

    public void setSrcpossn(Integer srcpossn) {
        this.srcpossn = srcpossn;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public Integer getTermno() {
        return termno;
    }

    public void setTermno(Integer termno) {
        this.termno = termno;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getPurseindex() {
        return purseindex;
    }

    public void setPurseindex(Integer purseindex) {
        this.purseindex = purseindex;
    }

    public Integer getTransmark() {
        return transmark;
    }

    public void setTransmark(Integer transmark) {
        this.transmark = transmark;
    }

    public Integer getConsumptionmode() {
        return consumptionmode;
    }

    public void setConsumptionmode(Integer consumptionmode) {
        this.consumptionmode = consumptionmode;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

}
