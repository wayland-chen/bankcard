package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TWaterrate entity.
 */
@Entity
@Table(name = "T_WATERRATE")
public class TWaterrate implements java.io.Serializable {

    // Fields    

    private Integer feetype;
    private Integer rate1;
    private Integer rate2;
    private Integer rate3;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TWaterrate() {
    }

    /**
     * minimal constructor
     */
    public TWaterrate(Integer feetype) {
        this.feetype = feetype;
    }

    /**
     * full constructor
     */
    public TWaterrate(Integer feetype, Integer rate1, Integer rate2, Integer rate3, String lastsaved) {
        this.feetype = feetype;
        this.rate1 = rate1;
        this.rate2 = rate2;
        this.rate3 = rate3;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "FEETYPE", unique = true, nullable = false)
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "RATE1")
    public Integer getRate1() {
        return this.rate1;
    }

    public void setRate1(Integer rate1) {
        this.rate1 = rate1;
    }

    @Column(name = "RATE2")
    public Integer getRate2() {
        return this.rate2;
    }

    public void setRate2(Integer rate2) {
        this.rate2 = rate2;
    }

    @Column(name = "RATE3")
    public Integer getRate3() {
        return this.rate3;
    }

    public void setRate3(Integer rate3) {
        this.rate3 = rate3;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}