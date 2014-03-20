package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TRptsubjbal entity.
 */
@Entity
@Table(name = "T_RPTSUBJBAL")
public class TRptsubjbal implements java.io.Serializable {

    // Fields    

    private TRptsubjbalId id;
    private BigDecimal beginbal;
    private Integer beginbalflag;
    private BigDecimal dramt;
    private BigDecimal cramt;
    private BigDecimal endbal;
    private Integer endbalflag;

    // Constructors

    /**
     * default constructor
     */
    public TRptsubjbal() {
    }

    /**
     * minimal constructor
     */
    public TRptsubjbal(TRptsubjbalId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptsubjbal(
            TRptsubjbalId id,
            BigDecimal beginbal,
            Integer beginbalflag,
            BigDecimal dramt,
            BigDecimal cramt,
            BigDecimal endbal,
            Integer endbalflag) {
        this.id = id;
        this.beginbal = beginbal;
        this.beginbalflag = beginbalflag;
        this.dramt = dramt;
        this.cramt = cramt;
        this.endbal = endbal;
        this.endbalflag = endbalflag;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "subjno", column = @Column(name = "SUBJNO", nullable = false, length = 6))})
    public TRptsubjbalId getId() {
        return this.id;
    }

    public void setId(TRptsubjbalId id) {
        this.id = id;
    }

    @Column(name = "BEGINBAL", precision = 15)
    public BigDecimal getBeginbal() {
        return this.beginbal;
    }

    public void setBeginbal(BigDecimal beginbal) {
        this.beginbal = beginbal;
    }

    @Column(name = "BEGINBALFLAG", precision = 1, scale = 0)
    public Integer getBeginbalflag() {
        return this.beginbalflag;
    }

    public void setBeginbalflag(Integer beginbalflag) {
        this.beginbalflag = beginbalflag;
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

    @Column(name = "ENDBAL", precision = 15)
    public BigDecimal getEndbal() {
        return this.endbal;
    }

    public void setEndbal(BigDecimal endbal) {
        this.endbal = endbal;
    }

    @Column(name = "ENDBALFLAG", precision = 1, scale = 0)
    public Integer getEndbalflag() {
        return this.endbalflag;
    }

    public void setEndbalflag(Integer endbalflag) {
        this.endbalflag = endbalflag;
    }

}