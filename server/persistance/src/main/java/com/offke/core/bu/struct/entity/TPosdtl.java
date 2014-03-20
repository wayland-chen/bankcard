package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TPosdtl entity.
 */
@Entity
@Table(name = "T_POSDTL")
public class TPosdtl implements java.io.Serializable {

    // Fields    

    private TPosdtlId id;
    private String transtime;
    private Integer termid;
    private Integer purseno;
    private Integer cardcnt;
    private BigDecimal cardbefbal;
    private BigDecimal amount;
    private BigDecimal cardaftbal;
    private BigDecimal managefee;
    private Integer transmark;
    private Integer transcode;
    private Integer shopid;
    private Integer subsidyno;
    private String batchno;
    private Integer sysid;
    private String coldate;
    private String coltime;
    private String accdate;
    private String acctime;
    private Long termseqno;
    private String status;
    private Integer errcode;
    private String errmsg;
    private String delflag;
    private Integer datatype;

    // Constructors

    /**
     * default constructor
     */
    public TPosdtl() {
    }

    /**
     * minimal constructor
     */
    public TPosdtl(TPosdtlId id, String status) {
        this.id = id;
        this.status = status;
    }

    public TPosdtl(TPosdtlId id) {
        this.id = id;
        this.transtime = "";
        this.termid = 0;
        this.purseno = 0;
        this.cardcnt = 0;
        this.cardbefbal = BigDecimal.ZERO;
        this.amount = BigDecimal.ZERO;
        this.cardaftbal = BigDecimal.ZERO;
        this.managefee = BigDecimal.ZERO;
        this.transmark = 0;
        this.transcode = 0;
        this.shopid = 0;
        this.subsidyno = 0;
        this.batchno = "";
        this.sysid = 0;
        this.coldate = "";
        this.coltime = "";
        this.accdate = "";
        this.acctime = "";
        this.termseqno = Long.valueOf(0);
        this.status = "";
        this.errcode = 0;
        this.errmsg = "";
        this.delflag = "";
        this.datatype = 0;
    }

    /**
     * full constructor
     */
    public TPosdtl(
            TPosdtlId id,
            String transtime,
            Integer termid,
            Integer purseno,
            Integer cardcnt,
            BigDecimal cardbefbal,
            BigDecimal amount,
            BigDecimal cardaftbal,
            BigDecimal managefee,
            Integer transmark,
            Integer transcode,
            Integer shopid,
            Integer subsidyno,
            String batchno,
            Integer sysid,
            String coldate,
            String coltime,
            String accdate,
            String acctime,
            Long termseqno,
            String status,
            Integer errcode,
            String errmsg,
            String delflag,
            Integer datatype) {
        this.id = id;
        this.transtime = transtime;
        this.termid = termid;
        this.purseno = purseno;
        this.cardcnt = cardcnt;
        this.cardbefbal = cardbefbal;
        this.amount = amount;
        this.cardaftbal = cardaftbal;
        this.managefee = managefee;
        this.transmark = transmark;
        this.transcode = transcode;
        this.shopid = shopid;
        this.subsidyno = subsidyno;
        this.batchno = batchno;
        this.sysid = sysid;
        this.coldate = coldate;
        this.coltime = coltime;
        this.accdate = accdate;
        this.acctime = acctime;
        this.termseqno = termseqno;
        this.status = status;
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.delflag = delflag;
        this.datatype = datatype;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "devphyid", column = @Column(name = "DEVPHYID", nullable = false, length = 20)),
            @AttributeOverride(name = "devseqno", column = @Column(name = "DEVSEQNO", nullable = false)),
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO", nullable = false))})
    public TPosdtlId getId() {
        return this.id;
    }

    public void setId(TPosdtlId id) {
        this.id = id;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "TERMID")
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "PURSENO")
    public Integer getPurseno() {
        return this.purseno;
    }

    public void setPurseno(Integer purseno) {
        this.purseno = purseno;
    }

    @Column(name = "CARDCNT")
    public Integer getCardcnt() {
        return this.cardcnt;
    }

    public void setCardcnt(Integer cardcnt) {
        this.cardcnt = cardcnt;
    }

    @Column(name = "CARDBEFBAL", precision = 15)
    public BigDecimal getCardbefbal() {
        return this.cardbefbal;
    }

    public void setCardbefbal(BigDecimal cardbefbal) {
        this.cardbefbal = cardbefbal;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "CARDAFTBAL", precision = 15)
    public BigDecimal getCardaftbal() {
        return this.cardaftbal;
    }

    public void setCardaftbal(BigDecimal cardaftbal) {
        this.cardaftbal = cardaftbal;
    }

    @Column(name = "MANAGEFEE", precision = 15)
    public BigDecimal getManagefee() {
        return this.managefee;
    }

    public void setManagefee(BigDecimal managefee) {
        this.managefee = managefee;
    }

    @Column(name = "TRANSMARK")
    public Integer getTransmark() {
        return this.transmark;
    }

    public void setTransmark(Integer transmark) {
        this.transmark = transmark;
    }

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "SHOPID")
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "SUBSIDYNO")
    public Integer getSubsidyno() {
        return this.subsidyno;
    }

    public void setSubsidyno(Integer subsidyno) {
        this.subsidyno = subsidyno;
    }

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "SYSID")
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "COLDATE", length = 8)
    public String getColdate() {
        return this.coldate;
    }

    public void setColdate(String coldate) {
        this.coldate = coldate;
    }

    @Column(name = "COLTIME", length = 6)
    public String getColtime() {
        return this.coltime;
    }

    public void setColtime(String coltime) {
        this.coltime = coltime;
    }

    @Column(name = "ACCDATE", length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "ACCTIME", length = 6)
    public String getAcctime() {
        return this.acctime;
    }

    public void setAcctime(String acctime) {
        this.acctime = acctime;
    }

    @Column(name = "TERMSEQNO")
    public Long getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(Long termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Column(name = "DATATYPE", precision = 1, scale = 0)
    public Integer getDatatype() {
        return this.datatype;
    }

    public void setDatatype(Integer datatype) {
        this.datatype = datatype;
    }

}