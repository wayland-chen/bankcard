package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "T_CARDTRANS")
public class TCardtrans implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private String transdate;
    private String transtime;
    private Integer transcode;
    private Integer termid;
    private Long termseqno;
    private Integer dpscnt;
    private Integer paycnt;
    private BigDecimal amount;
    private BigDecimal cardbefbal;
    private BigDecimal cardaftbal;
    private Integer updcnt;
    private String updtime;

    // Constructors

    /**
     * default constructor
     */
    public TCardtrans() {
    }

    /**
     * minimal constructor
     */
    public TCardtrans(
            Integer cardno,
            String transdate,
            String transtime,
            Integer transcode,
            Integer termid,
            Long termseqno,
            Integer dpscnt,
            Integer paycnt,
            BigDecimal amount,
            BigDecimal cardbefbal,
            BigDecimal cardaftbal) {
        this.cardno = cardno;
        this.transdate = transdate;
        this.transtime = transtime;
        this.transcode = transcode;
        this.termid = termid;
        this.termseqno = termseqno;
        this.dpscnt = dpscnt;
        this.paycnt = paycnt;
        this.amount = amount;
        this.cardbefbal = cardbefbal;
        this.cardaftbal = cardaftbal;
    }

    /**
     * full constructor
     */
    public TCardtrans(
            Integer cardno,
            String transdate,
            String transtime,
            Integer transcode,
            Integer termid,
            Long termseqno,
            Integer dpscnt,
            Integer paycnt,
            BigDecimal amount,
            BigDecimal cardbefbal,
            BigDecimal cardaftbal,
            Integer updcnt,
            String updtime) {
        this.cardno = cardno;
        this.transdate = transdate;
        this.transtime = transtime;
        this.transcode = transcode;
        this.termid = termid;
        this.termseqno = termseqno;
        this.dpscnt = dpscnt;
        this.paycnt = paycnt;
        this.amount = amount;
        this.cardbefbal = cardbefbal;
        this.cardaftbal = cardaftbal;
        this.updcnt = updcnt;
        this.updtime = updtime;
    }

    // Property accessors
    @Id
    @Column(name = "CARDNO", unique = true, nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
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

    @Column(name = "TRANSCODE", nullable = false)
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "TERMID", nullable = false)
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "TERMSEQNO", nullable = false)
    public Long getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(Long termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "DPSCNT", nullable = false)
    public Integer getDpscnt() {
        return this.dpscnt;
    }

    public void setDpscnt(Integer dpscnt) {
        this.dpscnt = dpscnt;
    }

    @Column(name = "PAYCNT", nullable = false)
    public Integer getPaycnt() {
        return this.paycnt;
    }

    public void setPaycnt(Integer paycnt) {
        this.paycnt = paycnt;
    }

    @Column(name = "AMOUNT", nullable = false, precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "CARDBEFBAL", nullable = false, precision = 15)
    public BigDecimal getCardbefbal() {
        return this.cardbefbal;
    }

    public void setCardbefbal(BigDecimal cardbefbal) {
        this.cardbefbal = cardbefbal;
    }

    @Column(name = "CARDAFTBAL", nullable = false, precision = 15)
    public BigDecimal getCardaftbal() {
        return this.cardaftbal;
    }

    public void setCardaftbal(BigDecimal cardaftbal) {
        this.cardaftbal = cardaftbal;
    }

    @Column(name = "UPDCNT")
    public Integer getUpdcnt() {
        return this.updcnt;
    }

    public void setUpdcnt(Integer updcnt) {
        this.updcnt = updcnt;
    }

    @Column(name = "UPDTIME", length = 14)
    public String getUpdtime() {
        return this.updtime;
    }

    public void setUpdtime(String updtime) {
        this.updtime = updtime;
    }

}