package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TExceptdtl entity. 异常卡流水
 */
@Entity
@Table(name = "T_EXCEPTDTL")
public class TExceptdtl implements java.io.Serializable {

    // Fields    

    private TExceptdtlId id;
    private Long refno;
    private Integer cardno;
    private Integer purseno;
    private Integer dpscnt;
    private Integer paycnt;
    private BigDecimal cardbefbal;
    private BigDecimal cardaftbal;
    private Integer failtype;
    private Integer status;
    private String remark;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TExceptdtl() {
    }

    /**
     * minimal constructor
     */
    public TExceptdtl(
            TExceptdtlId id,
            Long refno,
            Integer cardno,
            Integer purseno,
            Integer dpscnt,
            Integer paycnt,
            BigDecimal cardbefbal,
            BigDecimal cardaftbal,
            Integer status) {
        this.id = id;
        this.refno = refno;
        this.cardno = cardno;
        this.purseno = purseno;
        this.dpscnt = dpscnt;
        this.paycnt = paycnt;
        this.cardbefbal = cardbefbal;
        this.cardaftbal = cardaftbal;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TExceptdtl(
            TExceptdtlId id,
            Long refno,
            Integer cardno,
            Integer purseno,
            Integer dpscnt,
            Integer paycnt,
            BigDecimal cardbefbal,
            BigDecimal cardaftbal,
            Integer failtype,
            Integer status,
            String remark,
            String lastsaved) {
        this.id = id;
        this.refno = refno;
        this.cardno = cardno;
        this.purseno = purseno;
        this.dpscnt = dpscnt;
        this.paycnt = paycnt;
        this.cardbefbal = cardbefbal;
        this.cardaftbal = cardaftbal;
        this.failtype = failtype;
        this.status = status;
        this.remark = remark;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO", nullable = false))})
    public TExceptdtlId getId() {
        return this.id;
    }

    public void setId(TExceptdtlId id) {
        this.id = id;
    }

    @Column(name = "REFNO", nullable = false, precision = 14, scale = 0)
    public Long getRefno() {
        return this.refno;
    }

    public void setRefno(Long refno) {
        this.refno = refno;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "PURSENO", nullable = false)
    public Integer getPurseno() {
        return this.purseno;
    }

    public void setPurseno(Integer purseno) {
        this.purseno = purseno;
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

    @Column(name = "FAILTYPE", precision = 1, scale = 0)
    public Integer getFailtype() {
        return this.failtype;
    }

    public void setFailtype(Integer failtype) {
        this.failtype = failtype;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}