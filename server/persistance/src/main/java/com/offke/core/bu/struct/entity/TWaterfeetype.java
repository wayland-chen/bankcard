package com.offke.core.bu.struct.entity;

import javax.persistence.*;


/**
 * TWaterfeetype entity.
 */
@Entity
@Table(name = "T_WATERFEETYPE")
public class TWaterfeetype implements java.io.Serializable {

    // Fields    

    private TWaterfeetypeId id;
    private Integer feecnt;
    private Integer starttime1;
    private Integer feetime1;
    private Integer feeamt1;
    private Integer starttime2;
    private Integer feetime2;
    private Integer feeamt2;
    private Integer starttime3;
    private Integer feetime3;
    private Integer feeamt3;

    // Constructors

    /**
     * default constructor
     */
    public TWaterfeetype() {
    }

    /**
     * minimal constructor
     */
    public TWaterfeetype(TWaterfeetypeId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TWaterfeetype(
            TWaterfeetypeId id,
            Integer feecnt,
            Integer starttime1,
            Integer feetime1,
            Integer feeamt1,
            Integer starttime2,
            Integer feetime2,
            Integer feeamt2,
            Integer starttime3,
            Integer feetime3,
            Integer feeamt3) {
        this.id = id;
        this.feecnt = feecnt;
        this.starttime1 = starttime1;
        this.feetime1 = feetime1;
        this.feeamt1 = feeamt1;
        this.starttime2 = starttime2;
        this.feetime2 = feetime2;
        this.feeamt2 = feeamt2;
        this.starttime3 = starttime3;
        this.feetime3 = feetime3;
        this.feeamt3 = feeamt3;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "feeid", column = @Column(name = "FEEID", nullable = false)),
            @AttributeOverride(name = "feetype", column = @Column(name = "FEETYPE", nullable = false))})
    public TWaterfeetypeId getId() {
        return this.id;
    }

    public void setId(TWaterfeetypeId id) {
        this.id = id;
    }

    @Column(name = "FEECNT")
    public Integer getFeecnt() {
        return this.feecnt;
    }

    public void setFeecnt(Integer feecnt) {
        this.feecnt = feecnt;
    }

    @Column(name = "STARTTIME1")
    public Integer getStarttime1() {
        return this.starttime1;
    }

    public void setStarttime1(Integer starttime1) {
        this.starttime1 = starttime1;
    }

    @Column(name = "FEETIME1")
    public Integer getFeetime1() {
        return this.feetime1;
    }

    public void setFeetime1(Integer feetime1) {
        this.feetime1 = feetime1;
    }

    @Column(name = "FEEAMT1")
    public Integer getFeeamt1() {
        return this.feeamt1;
    }

    public void setFeeamt1(Integer feeamt1) {
        this.feeamt1 = feeamt1;
    }

    @Column(name = "STARTTIME2")
    public Integer getStarttime2() {
        return this.starttime2;
    }

    public void setStarttime2(Integer starttime2) {
        this.starttime2 = starttime2;
    }

    @Column(name = "FEETIME2")
    public Integer getFeetime2() {
        return this.feetime2;
    }

    public void setFeetime2(Integer feetime2) {
        this.feetime2 = feetime2;
    }

    @Column(name = "FEEAMT2")
    public Integer getFeeamt2() {
        return this.feeamt2;
    }

    public void setFeeamt2(Integer feeamt2) {
        this.feeamt2 = feeamt2;
    }

    @Column(name = "STARTTIME3")
    public Integer getStarttime3() {
        return this.starttime3;
    }

    public void setStarttime3(Integer starttime3) {
        this.starttime3 = starttime3;
    }

    @Column(name = "FEETIME3")
    public Integer getFeetime3() {
        return this.feetime3;
    }

    public void setFeetime3(Integer feetime3) {
        this.feetime3 = feetime3;
    }

    @Column(name = "FEEAMT3")
    public Integer getFeeamt3() {
        return this.feeamt3;
    }

    public void setFeeamt3(Integer feeamt3) {
        this.feeamt3 = feeamt3;
    }

}