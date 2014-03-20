package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMealtype entity.
 */
@Entity
@Table(name = "T_MEALTYPE")
public class TMealtype implements java.io.Serializable {

    // Fields    

    private Integer mealtype;
    private String mealname;
    private String endtime;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TMealtype() {
    }

    /**
     * minimal constructor
     */
    public TMealtype(Integer mealtype, String mealname, String endtime) {
        this.mealtype = mealtype;
        this.mealname = mealname;
        this.endtime = endtime;
    }

    /**
     * full constructor
     */
    public TMealtype(Integer mealtype, String mealname, String endtime, String lastsaved) {
        this.mealtype = mealtype;
        this.mealname = mealname;
        this.endtime = endtime;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "MEALTYPE", unique = true, nullable = false)
    public Integer getMealtype() {
        return this.mealtype;
    }

    public void setMealtype(Integer mealtype) {
        this.mealtype = mealtype;
    }

    @Column(name = "MEALNAME", nullable = false, length = 30)
    public String getMealname() {
        return this.mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    @Column(name = "ENDTIME", nullable = false, length = 6)
    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}