package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TWaterfeecfg entity.
 */
@Entity
@Table(name = "T_WATERFEECFG")
public class TWaterfeecfg implements java.io.Serializable {

    // Fields    

    private Integer feeid;
    private String feename;
    private Integer purseno;
    private Integer feemode;
    private Integer feetypecnt;

    // Constructors

    /**
     * default constructor
     */
    public TWaterfeecfg() {
    }

    /**
     * minimal constructor
     */
    public TWaterfeecfg(Integer feeid) {
        this.feeid = feeid;
    }

    /**
     * full constructor
     */
    public TWaterfeecfg(
            Integer feeid,
            String feename,
            Integer purseno,
            Integer feemode,
            Integer feetypecnt) {
        this.feeid = feeid;
        this.feename = feename;
        this.purseno = purseno;
        this.feemode = feemode;
        this.feetypecnt = feetypecnt;
    }

    // Property accessors
    @Id
    @Column(name = "FEEID", unique = true, nullable = false)
    public Integer getFeeid() {
        return this.feeid;
    }

    public void setFeeid(Integer feeid) {
        this.feeid = feeid;
    }

    @Column(name = "FEENAME", length = 60)
    public String getFeename() {
        return this.feename;
    }

    public void setFeename(String feename) {
        this.feename = feename;
    }

    @Column(name = "PURSENO")
    public Integer getPurseno() {
        return this.purseno;
    }

    public void setPurseno(Integer purseno) {
        this.purseno = purseno;
    }

    @Column(name = "FEEMODE")
    public Integer getFeemode() {
        return this.feemode;
    }

    public void setFeemode(Integer feemode) {
        this.feemode = feemode;
    }

    @Column(name = "FEETYPECNT")
    public Integer getFeetypecnt() {
        return this.feetypecnt;
    }

    public void setFeetypecnt(Integer feetypecnt) {
        this.feetypecnt = feetypecnt;
    }

}