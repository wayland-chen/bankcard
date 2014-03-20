package com.offke.core.bu.struct.entity;

import javax.persistence.*;


/**
 * TOperdtl entity.
 */
@Entity
@Table(name = "T_OPERDTL")
public class TOperdtl implements java.io.Serializable {

    // Fields    

    private TOperdtlId id;
    private String opercode;
    private String transdate;
    private String transtime;
    private Integer transcode;
    private String chkoper;
    private String status;
    private String transinfo;
    private String reqdata;

    // Constructors

    /**
     * default constructor
     */
    public TOperdtl() {
    }

    /**
     * minimal constructor
     */
    public TOperdtl(TOperdtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TOperdtl(
            TOperdtlId id,
            String opercode,
            String transdate,
            String transtime,
            Integer transcode,
            String chkoper,
            String status,
            String transinfo,
            String reqdata) {
        this.id = id;
        this.opercode = opercode;
        this.transdate = transdate;
        this.transtime = transtime;
        this.transcode = transcode;
        this.chkoper = chkoper;
        this.status = status;
        this.transinfo = transinfo;
        this.reqdata = reqdata;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO", nullable = false))})
    public TOperdtlId getId() {
        return this.id;
    }

    public void setId(TOperdtlId id) {
        this.id = id;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "CHKOPER", length = 8)
    public String getChkoper() {
        return this.chkoper;
    }

    public void setChkoper(String chkoper) {
        this.chkoper = chkoper;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "TRANSINFO", length = 480)
    public String getTransinfo() {
        return this.transinfo;
    }

    public void setTransinfo(String transinfo) {
        this.transinfo = transinfo;
    }

    @Column(name = "REQDATA", length = 1000)
    public String getReqdata() {
        return this.reqdata;
    }

    public void setReqdata(String reqdata) {
        this.reqdata = reqdata;
    }

}