package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRptshopboard entity.
 */
@Entity
@Table(name = "T_RPTSHOPBOARD")
public class TRptshopboard implements java.io.Serializable {

    // Fields    

    private TRptshopboardId id;
    private Integer transcnt;
    private BigDecimal transamt;

    // Constructors

    /**
     * default constructor
     */
    public TRptshopboard() {
    }

    /**
     * minimal constructor
     */
    public TRptshopboard(TRptshopboardId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptshopboard(TRptshopboardId id, Integer transcnt, BigDecimal transamt) {
        this.id = id;
        this.transcnt = transcnt;
        this.transamt = transamt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10))})
    public TRptshopboardId getId() {
        return this.id;
    }

    public void setId(TRptshopboardId id) {
        this.id = id;
    }

    @Column(name = "TRANSCNT")
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "TRANSAMT", precision = 15)
    public BigDecimal getTransamt() {
        return this.transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

}