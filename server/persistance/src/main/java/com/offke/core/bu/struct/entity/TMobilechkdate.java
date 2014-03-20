package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMobilechkdate entity.
 */
@Entity
@Table(name = "T_MOBILECHKDATE")
public class TMobilechkdate implements java.io.Serializable {

    // Fields    

    private String chkdate;
    private Integer chkflag;

    // Constructors

    /**
     * default constructor
     */
    public TMobilechkdate() {
    }

    /**
     * minimal constructor
     */
    public TMobilechkdate(String chkdate) {
        this.chkdate = chkdate;
    }

    /**
     * full constructor
     */
    public TMobilechkdate(String chkdate, Integer chkflag) {
        this.chkdate = chkdate;
        this.chkflag = chkflag;
    }

    // Property accessors
    @Id
    @Column(name = "CHKDATE", unique = true, nullable = false, length = 8)
    public String getChkdate() {
        return this.chkdate;
    }

    public void setChkdate(String chkdate) {
        this.chkdate = chkdate;
    }

    @Column(name = "CHKFLAG", precision = 1, scale = 0)
    public Integer getChkflag() {
        return this.chkflag;
    }

    public void setChkflag(Integer chkflag) {
        this.chkflag = chkflag;
    }

}