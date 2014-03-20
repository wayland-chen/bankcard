package com.offke.core.bu.struct.pojo;

public class Basetransinfo {
    private int transcode; //交易码
    private int termid; //终端编号
    private int termseqno; //终端流水号
    private String accdate; //记账日期
    private String acctime; //记账时间
    private String transdate; //交易日期
    private String transtime; //交易时间
    private String opercode; //操作员号
    private int cardno; //交易卡号
    private int cardflag; //有无卡标志 1-有卡交易0-无卡交易

    public int getTranscode() {
        return transcode;
    }

    public void setTranscode(int transcode) {
        this.transcode = transcode;
    }

    public int getTermid() {
        return termid;
    }

    public void setTermid(int termid) {
        this.termid = termid;
    }

    public int getTermseqno() {
        return termseqno;
    }

    public void setTermseqno(int termseqno) {
        this.termseqno = termseqno;
    }

    public String getAccdate() {
        return accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    public String getAcctime() {
        return acctime;
    }

    public void setAcctime(String acctime) {
        this.acctime = acctime;
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    public String getTranstime() {
        return transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public int getCardno() {
        return cardno;
    }

    public void setCardno(int cardno) {
        this.cardno = cardno;
    }

    public int getCardflag() {
        return cardflag;
    }

    public void setCardflag(int cardflag) {
        this.cardflag = cardflag;
    }

}
