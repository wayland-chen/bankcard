package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRptopercash entity.
 */
@Entity
@Table(name = "T_RPTOPERCASH")
public class TRptopercash implements java.io.Serializable {

    // Fields    

    private TRptopercashId id;
    private Integer branchno;
    private Integer transtype;
    private Integer transcnt;
    private BigDecimal inamt;
    private BigDecimal outamt;
    private BigDecimal amount;

    // Constructors

    /**
     * default constructor
     */
    public TRptopercash() {
    }

    /**
     * minimal constructor
     */
    public TRptopercash(TRptopercashId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptopercash(
            TRptopercashId id,
            Integer branchno,
            Integer transtype,
            Integer transcnt,
            BigDecimal inamt,
            BigDecimal outamt,
            BigDecimal amount) {
        this.id = id;
        this.branchno = branchno;
        this.transtype = transtype;
        this.transcnt = transcnt;
        this.inamt = inamt;
        this.outamt = outamt;
        this.amount = amount;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8)),
            @AttributeOverride(name = "subjno", column = @Column(name = "SUBJNO", nullable = false, length = 6)),
            @AttributeOverride(name = "summary", column = @Column(name = "SUMMARY", nullable = false, length = 60))})
    public TRptopercashId getId() {
        return this.id;
    }

    public void setId(TRptopercashId id) {
        this.id = id;
    }

    @Column(name = "BRANCHNO")
    public Integer getBranchno() {
        return this.branchno;
    }

    public void setBranchno(Integer branchno) {
        this.branchno = branchno;
    }

    @Column(name = "TRANSTYPE")
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "TRANSCNT")
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "INAMT", precision = 15)
    public BigDecimal getInamt() {
        return this.inamt;
    }

    public void setInamt(BigDecimal inamt) {
        this.inamt = inamt;
    }

    @Column(name = "OUTAMT", precision = 15)
    public BigDecimal getOutamt() {
        return this.outamt;
    }

    public void setOutamt(BigDecimal outamt) {
        this.outamt = outamt;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}