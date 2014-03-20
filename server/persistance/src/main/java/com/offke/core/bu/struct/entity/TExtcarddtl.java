package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TExtcarddtl entity.
 */
@Entity
@Table(name = "T_EXTCARDDTL")
public class TExtcarddtl implements java.io.Serializable {

    // Fields    

    private Long refno;
    private String accdate;
    private BigDecimal termid;
    private BigDecimal termseqno;
    private BigDecimal cardno;
    private BigDecimal amount;
    private String transdate;
    private String transtime;
    private Boolean status;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TExtcarddtl() {
    }

    /**
     * minimal constructor
     */
    public TExtcarddtl(Long refno, BigDecimal cardno, Boolean status) {
        this.refno = refno;
        this.cardno = cardno;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TExtcarddtl(
            Long refno,
            String accdate,
            BigDecimal termid,
            BigDecimal termseqno,
            BigDecimal cardno,
            BigDecimal amount,
            String transdate,
            String transtime,
            Boolean status,
            String remark) {
        this.refno = refno;
        this.accdate = accdate;
        this.termid = termid;
        this.termseqno = termseqno;
        this.cardno = cardno;
        this.amount = amount;
        this.transdate = transdate;
        this.transtime = transtime;
        this.status = status;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "REFNO", unique = true, nullable = false, precision = 14, scale = 0)
    public Long getRefno() {
        return this.refno;
    }

    public void setRefno(Long refno) {
        this.refno = refno;
    }

    @Column(name = "ACCDATE", length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "TERMID")
    public BigDecimal getTermid() {
        return this.termid;
    }

    public void setTermid(BigDecimal termid) {
        this.termid = termid;
    }

    @Column(name = "TERMSEQNO")
    public BigDecimal getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(BigDecimal termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "CARDNO", nullable = false)
    public BigDecimal getCardno() {
        return this.cardno;
    }

    public void setCardno(BigDecimal cardno) {
        this.cardno = cardno;
    }

    @Column(name = "AMOUNT")
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}