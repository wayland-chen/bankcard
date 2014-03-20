package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TPosdtltmp entity.
 */
@Entity
@Table(name = "T_POSDTLTMP")
public class TPosdtltmp implements java.io.Serializable {

    // Fields    

    private TPosdtltmpId id;
    private String transtime;
    private Integer shopid;
    private Integer transcode;
    private Integer cardcnt;
    private Integer purseno;
    private BigDecimal cardbefbal;
    private BigDecimal amount;
    private BigDecimal cardaftbal;
    private BigDecimal managefee;
    private Integer transmark;
    private String batchno;
    private Integer seqno;
    private String impdate;
    private String imptime;
    private String impoper;
    private Long termseqno;
    private String status;
    private String errmsg;
    private String chkoper;
    private String chkdate;

    // Constructors

    /**
     * default constructor
     */
    public TPosdtltmp() {
    }

    /**
     * minimal constructor
     */
    public TPosdtltmp(TPosdtltmpId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TPosdtltmp(
            TPosdtltmpId id,
            String transtime,
            Integer shopid,
            Integer transcode,
            Integer cardcnt,
            Integer purseno,
            BigDecimal cardbefbal,
            BigDecimal amount,
            BigDecimal cardaftbal,
            BigDecimal managefee,
            Integer transmark,
            String batchno,
            Integer seqno,
            String impdate,
            String imptime,
            String impoper,
            Long termseqno,
            String status,
            String errmsg,
            String chkoper,
            String chkdate) {
        this.id = id;
        this.transtime = transtime;
        this.shopid = shopid;
        this.transcode = transcode;
        this.cardcnt = cardcnt;
        this.purseno = purseno;
        this.cardbefbal = cardbefbal;
        this.amount = amount;
        this.cardaftbal = cardaftbal;
        this.managefee = managefee;
        this.transmark = transmark;
        this.batchno = batchno;
        this.seqno = seqno;
        this.impdate = impdate;
        this.imptime = imptime;
        this.impoper = impoper;
        this.termseqno = termseqno;
        this.status = status;
        this.errmsg = errmsg;
        this.chkoper = chkoper;
        this.chkdate = chkdate;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "devphyid", column = @Column(name = "DEVPHYID", nullable = false, length = 20)),
            @AttributeOverride(name = "devseqno", column = @Column(name = "DEVSEQNO", nullable = false)),
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO", nullable = false))})
    public TPosdtltmpId getId() {
        return this.id;
    }

    public void setId(TPosdtltmpId id) {
        this.id = id;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "SHOPID")
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "CARDCNT")
    public Integer getCardcnt() {
        return this.cardcnt;
    }

    public void setCardcnt(Integer cardcnt) {
        this.cardcnt = cardcnt;
    }

    @Column(name = "PURSENO")
    public Integer getPurseno() {
        return this.purseno;
    }

    public void setPurseno(Integer purseno) {
        this.purseno = purseno;
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

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "SEQNO")
    public Integer getSeqno() {
        return this.seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    @Column(name = "IMPDATE", length = 8)
    public String getImpdate() {
        return this.impdate;
    }

    public void setImpdate(String impdate) {
        this.impdate = impdate;
    }

    @Column(name = "IMPTIME", length = 6)
    public String getImptime() {
        return this.imptime;
    }

    public void setImptime(String imptime) {
        this.imptime = imptime;
    }

    @Column(name = "IMPOPER", length = 8)
    public String getImpoper() {
        return this.impoper;
    }

    public void setImpoper(String impoper) {
        this.impoper = impoper;
    }

    @Column(name = "TERMSEQNO")
    public Long getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(Long termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "ERRMSG", length = 240)
    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Column(name = "CHKOPER", length = 8)
    public String getChkoper() {
        return this.chkoper;
    }

    public void setChkoper(String chkoper) {
        this.chkoper = chkoper;
    }

    @Column(name = "CHKDATE", length = 8)
    public String getChkdate() {
        return this.chkdate;
    }

    public void setChkdate(String chkdate) {
        this.chkdate = chkdate;
    }

}