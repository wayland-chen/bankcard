package com.offke.core.bu.struct.pojo;

import java.math.BigDecimal;

public final class Syspara {
    private Integer renewCardDayCnt; //补办卡天数
    private String settleDate; //结算日期
    private String preSettleDate; //上一个结算日期
    private String nextSettleDate; //下一个结算日期
    private String posdtlExpireDate; //POS流水过期日期
    private String renewAccDate; //补办卡日期
    private BigDecimal autoRenewAccMaxAmt; //自动补帐最大限额
    private int shopBoardFeeFlag; //是否是商户收搭伙费
    private boolean enableCardMgr; //是否启用卡片库存管理
    private Integer qryMaxCnt; //查询最大条数

    public Integer getRenewCardDayCnt() {
        return renewCardDayCnt;
    }

    public void setRenewCardDayCnt(Integer renewCardDayCnt) {
        this.renewCardDayCnt = renewCardDayCnt;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getPreSettleDate() {
        return preSettleDate;
    }

    public void setPreSettleDate(String preSettleDate) {
        this.preSettleDate = preSettleDate;
    }

    public String getNextSettleDate() {
        return nextSettleDate;
    }

    public void setNextSettleDate(String nextSettleDate) {
        this.nextSettleDate = nextSettleDate;
    }

    public String getPosdtlExpireDate() {
        return posdtlExpireDate;
    }

    public void setPosdtlExpireDate(String posdtlExpireDate) {
        this.posdtlExpireDate = posdtlExpireDate;
    }

    public String getRenewAccDate() {
        return renewAccDate;
    }

    public void setRenewAccDate(String renewAccDate) {
        this.renewAccDate = renewAccDate;
    }

    public BigDecimal getAutoRenewAccMaxAmt() {
        return autoRenewAccMaxAmt;
    }

    public void setAutoRenewAccMaxAmt(BigDecimal autoRenewAccMaxAmt) {
        this.autoRenewAccMaxAmt = autoRenewAccMaxAmt;
    }

    public int getShopBoardFeeFlag() {
        return shopBoardFeeFlag;
    }

    public void setShopBoardFeeFlag(int shopBoardFeeFlag) {
        this.shopBoardFeeFlag = shopBoardFeeFlag;
    }

    public boolean isEnableCardMgr() {
        return enableCardMgr;
    }

    public void setEnableCardMgr(boolean enableCardMgr) {
        this.enableCardMgr = enableCardMgr;
    }

    public Integer getQryMaxCnt() {
        return qryMaxCnt;
    }

    public void setQryMaxCnt(Integer qryMaxCnt) {
        this.qryMaxCnt = qryMaxCnt;
    }

    // private   double dCardMaxBal;           //最大充值金额

}
