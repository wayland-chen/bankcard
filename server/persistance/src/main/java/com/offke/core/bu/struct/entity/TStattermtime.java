package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TStattermtime entity.
 */
@Entity
@Table(name = "T_STATTERMTIME")
public class TStattermtime implements java.io.Serializable {

    // Fields    

    private TStattermtimeId id;
    private Integer feecnt;
    private Integer freecnt;
    private Integer totalcnt;
    private BigDecimal totalamt;

    // Constructors

    /**
     * default constructor
     */
    public TStattermtime() {
    }

    /**
     * full constructor
     */
    public TStattermtime(
            TStattermtimeId id,
            Integer feecnt,
            Integer freecnt,
            Integer totalcnt,
            BigDecimal totalamt) {
        this.id = id;
        this.feecnt = feecnt;
        this.freecnt = freecnt;
        this.totalcnt = totalcnt;
        this.totalamt = totalamt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "settledate", column = @Column(name = "SETTLEDATE", nullable = false, precision = 8, scale = 0)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, precision = 8, scale = 0)),
            @AttributeOverride(name = "timeid", column = @Column(name = "TIMEID", nullable = false, precision = 2, scale = 0))})
    public TStattermtimeId getId() {
        return this.id;
    }

    public void setId(TStattermtimeId id) {
        this.id = id;
    }

    @Column(name = "FEECNT", nullable = false)
    public Integer getFeecnt() {
        return this.feecnt;
    }

    public void setFeecnt(Integer feecnt) {
        this.feecnt = feecnt;
    }

    @Column(name = "FREECNT", nullable = false)
    public Integer getFreecnt() {
        return this.freecnt;
    }

    public void setFreecnt(Integer freecnt) {
        this.freecnt = freecnt;
    }

    @Column(name = "TOTALCNT", nullable = false)
    public Integer getTotalcnt() {
        return this.totalcnt;
    }

    public void setTotalcnt(Integer totalcnt) {
        this.totalcnt = totalcnt;
    }

    @Column(name = "TOTALAMT", nullable = false, precision = 15)
    public BigDecimal getTotalamt() {
        return this.totalamt;
    }

    public void setTotalamt(BigDecimal totalamt) {
        this.totalamt = totalamt;
    }

}