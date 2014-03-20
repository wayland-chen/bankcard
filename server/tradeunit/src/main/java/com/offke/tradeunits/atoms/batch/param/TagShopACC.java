package com.offke.tradeunits.atoms.batch.param;

import java.math.BigDecimal;

public class TagShopACC {
    private Integer shopid;  //商户号
    private String accno;  //账号
    private String shopname;  //商户名
    private BigDecimal rakeoffrate;  //佣金费率
    private BigDecimal balance;  //商户余额

    public TagShopACC() {

    }

    public TagShopACC(Integer shopid,
                      String accno,
                      String shopname,
                      BigDecimal rakeoffrate,
                      BigDecimal balance) {
        this.shopid = shopid;
        this.accno = accno;
        this.shopname = shopname;
        this.rakeoffrate = rakeoffrate;
        this.balance = balance;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public BigDecimal getRakeoffrate() {
        return rakeoffrate;
    }

    public void setRakeoffrate(BigDecimal rakeoffrate) {
        this.rakeoffrate = rakeoffrate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
