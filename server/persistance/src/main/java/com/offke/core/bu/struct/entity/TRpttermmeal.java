package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRpttermmeal entity.
 */
@Entity
@Table(name = "T_RPTTERMMEAL")
public class TRpttermmeal implements java.io.Serializable {

    // Fields    

    private TRpttermmealId id;
    private Integer transcnt;
    private BigDecimal dramt;
    private BigDecimal cramt;
    private BigDecimal amount;

    // Constructors

    /**
     * default constructor
     */
    public TRpttermmeal() {
    }

    /**
     * minimal constructor
     */
    public TRpttermmeal(TRpttermmealId id, Integer transcnt, BigDecimal dramt, BigDecimal cramt) {
        this.id = id;
        this.transcnt = transcnt;
        this.dramt = dramt;
        this.cramt = cramt;
    }

    /**
     * full constructor
     */
    public TRpttermmeal(TRpttermmealId id, Integer transcnt, BigDecimal dramt, BigDecimal cramt, BigDecimal amount) {
        this.id = id;
        this.transcnt = transcnt;
        this.dramt = dramt;
        this.cramt = cramt;
        this.amount = amount;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "settledate", column = @Column(name = "SETTLEDATE", nullable = false, precision = 8, scale = 0)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "transtype", column = @Column(name = "TRANSTYPE", nullable = false)),
            @AttributeOverride(name = "summary", column = @Column(name = "SUMMARY", nullable = false, length = 60)),
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "mealtype", column = @Column(name = "MEALTYPE", nullable = false))})
    public TRpttermmealId getId() {
        return this.id;
    }

    public void setId(TRpttermmealId id) {
        this.id = id;
    }

    @Column(name = "TRANSCNT", nullable = false)
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "DRAMT", nullable = false, precision = 15)
    public BigDecimal getDramt() {
        return this.dramt;
    }

    public void setDramt(BigDecimal dramt) {
        this.dramt = dramt;
    }

    @Column(name = "CRAMT", nullable = false, precision = 15)
    public BigDecimal getCramt() {
        return this.cramt;
    }

    public void setCramt(BigDecimal cramt) {
        this.cramt = cramt;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}