package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TMobilechkdtl entity.
 */
@Entity
@Table(name = "T_MOBILECHKDTL")
public class TMobilechkdtl implements java.io.Serializable {

    // Fields    

    private Long refno;
    private String transdate;
    private Integer cardno;
    private String mobile;
    private BigDecimal amount;
    private Integer chkstatus;
    private Integer chkflag;
    private String chkoper;
    private String chkdate;
    private String chktime;

    // Constructors

    /**
     * default constructor
     */
    public TMobilechkdtl() {
    }

    /**
     * minimal constructor
     */
    public TMobilechkdtl(Long refno, String transdate) {
        this.refno = refno;
        this.transdate = transdate;
    }

    /**
     * full constructor
     */
    public TMobilechkdtl(
            Long refno,
            String transdate,
            Integer cardno,
            String mobile,
            BigDecimal amount,
            Integer chkstatus,
            Integer chkflag,
            String chkoper,
            String chkdate,
            String chktime) {
        this.refno = refno;
        this.transdate = transdate;
        this.cardno = cardno;
        this.mobile = mobile;
        this.amount = amount;
        this.chkstatus = chkstatus;
        this.chkflag = chkflag;
        this.chkoper = chkoper;
        this.chkdate = chkdate;
        this.chktime = chktime;
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

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "MOBILE", length = 30)
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "CHKSTATUS", precision = 1, scale = 0)
    public Integer getChkstatus() {
        return this.chkstatus;
    }

    public void setChkstatus(Integer chkstatus) {
        this.chkstatus = chkstatus;
    }

    @Column(name = "CHKFLAG", precision = 1, scale = 0)
    public Integer getChkflag() {
        return this.chkflag;
    }

    public void setChkflag(Integer chkflag) {
        this.chkflag = chkflag;
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

    @Column(name = "CHKTIME", length = 6)
    public String getChktime() {
        return this.chktime;
    }

    public void setChktime(String chktime) {
        this.chktime = chktime;
    }

}