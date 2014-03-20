package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMsglist entity.
 */
@Entity
@Table(name = "T_MSGLIST")
public class TMsglist implements java.io.Serializable {

    // Fields    

    private Integer msgid;
    private Integer msgtype;
    private Integer msglevel;
    private Integer sysid;
    private Integer deviceid;
    private Integer cardno;
    private String transdate;
    private String createdtime;
    private String starttime;
    private String endtime;
    private String reqdata;
    private String respdata;
    private Integer funcno;
    private Integer pfuncno;
    private Integer maxsendcnt;
    private Integer sendcnt;
    private Integer recvcnt;
    private Integer status;
    private Integer seqno;
    private String opercode;
    private Integer errcode;
    private String errmsg;
    private String delflag;

    // Constructors

    /**
     * default constructor
     */
    public TMsglist() {
    }

    /**
     * minimal constructor
     */
    public TMsglist(Integer msgid) {
        this.msgid = msgid;
    }

    /**
     * full constructor
     */
    public TMsglist(
            Integer msgid,
            Integer msgtype,
            Integer msglevel,
            Integer sysid,
            Integer deviceid,
            Integer cardno,
            String transdate,
            String createdtime,
            String starttime,
            String endtime,
            String reqdata,
            String respdata,
            Integer funcno,
            Integer pfuncno,
            Integer maxsendcnt,
            Integer sendcnt,
            Integer recvcnt,
            Integer status,
            Integer seqno,
            String opercode,
            Integer errcode,
            String errmsg,
            String delflag) {
        this.msgid = msgid;
        this.msgtype = msgtype;
        this.msglevel = msglevel;
        this.sysid = sysid;
        this.deviceid = deviceid;
        this.cardno = cardno;
        this.transdate = transdate;
        this.createdtime = createdtime;
        this.starttime = starttime;
        this.endtime = endtime;
        this.reqdata = reqdata;
        this.respdata = respdata;
        this.funcno = funcno;
        this.pfuncno = pfuncno;
        this.maxsendcnt = maxsendcnt;
        this.sendcnt = sendcnt;
        this.recvcnt = recvcnt;
        this.status = status;
        this.seqno = seqno;
        this.opercode = opercode;
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.delflag = delflag;
    }

    // Property accessors
    @Id
    @Column(name = "MSGID", unique = true, nullable = false)
    public Integer getMsgid() {
        return this.msgid;
    }

    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    @Column(name = "MSGTYPE")
    public Integer getMsgtype() {
        return this.msgtype;
    }

    public void setMsgtype(Integer msgtype) {
        this.msgtype = msgtype;
    }

    @Column(name = "MSGLEVEL")
    public Integer getMsglevel() {
        return this.msglevel;
    }

    public void setMsglevel(Integer msglevel) {
        this.msglevel = msglevel;
    }

    @Column(name = "SYSID")
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "DEVICEID")
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "CREATEDTIME", length = 30)
    public String getCreatedtime() {
        return this.createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    @Column(name = "STARTTIME", length = 30)
    public String getStarttime() {
        return this.starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    @Column(name = "ENDTIME", length = 30)
    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Column(name = "REQDATA", length = 1000)
    public String getReqdata() {
        return this.reqdata;
    }

    public void setReqdata(String reqdata) {
        this.reqdata = reqdata;
    }

    @Column(name = "RESPDATA", length = 1000)
    public String getRespdata() {
        return this.respdata;
    }

    public void setRespdata(String respdata) {
        this.respdata = respdata;
    }

    @Column(name = "FUNCNO")
    public Integer getFuncno() {
        return this.funcno;
    }

    public void setFuncno(Integer funcno) {
        this.funcno = funcno;
    }

    @Column(name = "PFUNCNO")
    public Integer getPfuncno() {
        return this.pfuncno;
    }

    public void setPfuncno(Integer pfuncno) {
        this.pfuncno = pfuncno;
    }

    @Column(name = "MAXSENDCNT")
    public Integer getMaxsendcnt() {
        return this.maxsendcnt;
    }

    public void setMaxsendcnt(Integer maxsendcnt) {
        this.maxsendcnt = maxsendcnt;
    }

    @Column(name = "SENDCNT")
    public Integer getSendcnt() {
        return this.sendcnt;
    }

    public void setSendcnt(Integer sendcnt) {
        this.sendcnt = sendcnt;
    }

    @Column(name = "RECVCNT")
    public Integer getRecvcnt() {
        return this.recvcnt;
    }

    public void setRecvcnt(Integer recvcnt) {
        this.recvcnt = recvcnt;
    }

    @Column(name = "STATUS", precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "SEQNO")
    public Integer getSeqno() {
        return this.seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "ERRCODE")
    public Integer getErrcode() {
        return this.errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    @Column(name = "ERRMSG", length = 240)
    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Column(name = "DELFLAG", length = 1)
    public String getDelflag() {
        return this.delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

}