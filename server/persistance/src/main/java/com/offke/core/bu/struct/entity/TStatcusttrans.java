package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TStatcusttrans entity.
 */
@Entity
@Table(name = "T_STATCUSTTRANS")
public class TStatcusttrans implements java.io.Serializable {

    // Fields    

    private TStatcusttransId id;
    private Integer transcnt;
    private BigDecimal transamt;

    // Constructors

    /**
     * default constructor
     */
    public TStatcusttrans() {
    }

    /**
     * full constructor
     */
    public TStatcusttrans(TStatcusttransId id, Integer transcnt, BigDecimal transamt) {
        this.id = id;
        this.transcnt = transcnt;
        this.transamt = transamt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "settledate", column = @Column(name = "SETTLEDATE", nullable = false, precision = 8, scale = 0)),
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", nullable = false)),
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, precision = 8, scale = 0))})
    public TStatcusttransId getId() {
        return this.id;
    }

    public void setId(TStatcusttransId id) {
        this.id = id;
    }

    @Column(name = "TRANSCNT", nullable = false)
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "TRANSAMT", nullable = false, precision = 15)
    public BigDecimal getTransamt() {
        return this.transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

}