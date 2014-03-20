package com.offke.tradeunits.atoms.batch.param;

import java.math.BigDecimal;

public class VShopbusiacc {
    private Integer transcnt; //交易次数
    private BigDecimal transamt; //交易金额
    private Integer personcnt; //卡交易次数

    //默认构造器
    public VShopbusiacc() {

    }

    public VShopbusiacc(Integer transcnt, BigDecimal transamt, Integer personcnt) {
        this.transcnt = transcnt;
        this.transamt = transamt;
        this.personcnt = personcnt;
    }

    public Integer getTranscnt() {
        return transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    public BigDecimal getTransamt() {
        return transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

    public Integer getPersoncnt() {
        return personcnt;
    }

    public void setPersoncnt(Integer personcnt) {
        this.personcnt = personcnt;
    }


}
