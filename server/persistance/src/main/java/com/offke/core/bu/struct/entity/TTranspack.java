package com.offke.core.bu.struct.entity;

import javax.persistence.*;


/**
 * TTranspack entity.
 */
@Entity
@Table(name = "T_TRANSPACK")
public class TTranspack implements java.io.Serializable {

    // Fields    

    private TTranspackId id;
    private Integer reqsno;
    private Integer funcno;
    private String transdate;
    private String transtime;
    private Integer revflag;
    private Integer retrycnt;
    private String status;
    private Integer errcode;
    private String errmsg;
    private Integer datalen;
    private String reqdata;
    private String accdate;
    private Integer termid;
    private Long termseqno;
    private String lastupdtime;

    // Constructors

    /**
     * default constructor
     */
    public TTranspack() {
    }

    /**
     * minimal constructor
     */
    public TTranspack(
            TTranspackId id,
            Integer reqsno,
            String transdate,
            String transtime,
            Integer revflag,
            Integer retrycnt,
            String status,
            Integer errcode,
            Integer datalen,
            String lastupdtime) {
        this.id = id;
        this.reqsno = reqsno;
        this.transdate = transdate;
        this.transtime = transtime;
        this.revflag = revflag;
        this.retrycnt = retrycnt;
        this.status = status;
        this.errcode = errcode;
        this.datalen = datalen;
        this.lastupdtime = lastupdtime;
    }

    /**
     * full constructor
     */
    public TTranspack(
            TTranspackId id,
            Integer reqsno,
            Integer funcno,
            String transdate,
            String transtime,
            Integer revflag,
            Integer retrycnt,
            String status,
            Integer errcode,
            String errmsg,
            Integer datalen,
            String reqdata,
            String accdate,
            Integer termid,
            Long termseqno,
            String lastupdtime) {
        this.id = id;
        this.reqsno = reqsno;
        this.funcno = funcno;
        this.transdate = transdate;
        this.transtime = transtime;
        this.revflag = revflag;
        this.retrycnt = retrycnt;
        this.status = status;
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.datalen = datalen;
        this.reqdata = reqdata;
        this.accdate = accdate;
        this.termid = termid;
        this.termseqno = termseqno;
        this.lastupdtime = lastupdtime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "packetid", column = @Column(name = "PACKETID", nullable = false, length = 20)),
            @AttributeOverride(name = "reqid", column = @Column(name = "REQID", nullable = false, length = 20))})
    public TTranspackId getId() {
        return this.id;
    }

    public void setId(TTranspackId id) {
        this.id = id;
    }

    @Column(name = "REQSNO", nullable = false)
    public Integer getReqsno() {
        return this.reqsno;
    }

    public void setReqsno(Integer reqsno) {
        this.reqsno = reqsno;
    }

    @Column(name = "FUNCNO")
    public Integer getFuncno() {
        return this.funcno;
    }

    public void setFuncno(Integer funcno) {
        this.funcno = funcno;
    }

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", nullable = false, length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "REVFLAG", nullable = false, precision = 1, scale = 0)
    public Integer getRevflag() {
        return this.revflag;
    }

    public void setRevflag(Integer revflag) {
        this.revflag = revflag;
    }

    @Column(name = "RETRYCNT", nullable = false)
    public Integer getRetrycnt() {
        return this.retrycnt;
    }

    public void setRetrycnt(Integer retrycnt) {
        this.retrycnt = retrycnt;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "ERRCODE", nullable = false)
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

    @Column(name = "DATALEN", nullable = false)
    public Integer getDatalen() {
        return this.datalen;
    }

    public void setDatalen(Integer datalen) {
        this.datalen = datalen;
    }

    @Column(name = "REQDATA", length = 2000)
    public String getReqdata() {
        return this.reqdata;
    }

    public void setReqdata(String reqdata) {
        this.reqdata = reqdata;
    }

    @Column(name = "ACCDATE", length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "TERMID")
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "TERMSEQNO")
    public Long getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(Long termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "LASTUPDTIME", nullable = false, length = 30)
    public String getLastupdtime() {
        return this.lastupdtime;
    }

    public void setLastupdtime(String lastupdtime) {
        this.lastupdtime = lastupdtime;
    }

}