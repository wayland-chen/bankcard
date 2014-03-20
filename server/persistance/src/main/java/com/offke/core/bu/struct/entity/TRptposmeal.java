package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRptposmeal entity.
 */
@Entity
@Table(name = "T_RPTPOSMEAL")
public class TRptposmeal implements java.io.Serializable {

    // Fields    

    private TRptposmealId id;
    private Integer transtype;
    private Integer mealtype;
    private Integer transcnt;
    private BigDecimal dramt;
    private BigDecimal cramt;
    private BigDecimal amount;

    // Constructors

    /**
     * default constructor
     */
    public TRptposmeal() {
    }

    /**
     * minimal constructor
     */
    public TRptposmeal(TRptposmealId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptposmeal(
            TRptposmealId id,
            Integer transtype,
            Integer mealtype,
            Integer transcnt,
            BigDecimal dramt,
            BigDecimal cramt,
            BigDecimal amount) {
        this.id = id;
        this.transtype = transtype;
        this.mealtype = mealtype;
        this.transcnt = transcnt;
        this.dramt = dramt;
        this.cramt = cramt;
        this.amount = amount;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10)),
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false)),
            @AttributeOverride(name = "summary", column = @Column(name = "SUMMARY", nullable = false, length = 60)),
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "mealname", column = @Column(name = "MEALNAME", nullable = false, length = 60))})
    public TRptposmealId getId() {
        return this.id;
    }

    public void setId(TRptposmealId id) {
        this.id = id;
    }

    @Column(name = "TRANSTYPE")
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "MEALTYPE")
    public Integer getMealtype() {
        return this.mealtype;
    }

    public void setMealtype(Integer mealtype) {
        this.mealtype = mealtype;
    }

    @Column(name = "TRANSCNT")
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "DRAMT", precision = 15)
    public BigDecimal getDramt() {
        return this.dramt;
    }

    public void setDramt(BigDecimal dramt) {
        this.dramt = dramt;
    }

    @Column(name = "CRAMT", precision = 15)
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