package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CFGVER")
public class TCfgver implements java.io.Serializable {

    // Fields    

    private Integer cfgtype;
    private Integer cfgverno;
    private String opercode;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TCfgver() {
    }

    /**
     * minimal constructor
     */
    public TCfgver(Integer cfgtype, Integer cfgverno) {
        this.cfgtype = cfgtype;
        this.cfgverno = cfgverno;
    }

    /**
     * full constructor
     */
    public TCfgver(Integer cfgtype, Integer cfgverno, String opercode, String lastsaved) {
        this.cfgtype = cfgtype;
        this.cfgverno = cfgverno;
        this.opercode = opercode;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "CFGTYPE", unique = true, nullable = false)
    public Integer getCfgtype() {
        return this.cfgtype;
    }

    public void setCfgtype(Integer cfgtype) {
        this.cfgtype = cfgtype;
    }

    @Column(name = "CFGVERNO", nullable = false)
    public Integer getCfgverno() {
        return this.cfgverno;
    }

    public void setCfgverno(Integer cfgverno) {
        this.cfgverno = cfgverno;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}