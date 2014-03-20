package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_AUTHTYPE")
public class TAuthtype implements java.io.Serializable {

    // Fields    

    private Integer authtype;
    private String authtypename;
    private Integer authclass;

    // Constructors

    /**
     * default constructor
     */
    public TAuthtype() {
    }

    /**
     * minimal constructor
     */
    public TAuthtype(Integer authtype) {
        this.authtype = authtype;
    }

    /**
     * full constructor
     */
    public TAuthtype(Integer authtype, String authtypename, Integer authclass) {
        this.authtype = authtype;
        this.authtypename = authtypename;
        this.authclass = authclass;
    }

    // Property accessors
    @Id
    @Column(name = "AUTHTYPE", unique = true, nullable = false)
    public Integer getAuthtype() {
        return this.authtype;
    }

    public void setAuthtype(Integer authtype) {
        this.authtype = authtype;
    }

    @Column(name = "AUTHTYPENAME", length = 60)
    public String getAuthtypename() {
        return this.authtypename;
    }

    public void setAuthtypename(String authtypename) {
        this.authtypename = authtypename;
    }

    @Column(name = "AUTHCLASS")
    public Integer getAuthclass() {
        return this.authclass;
    }

    public void setAuthclass(Integer authclass) {
        this.authclass = authclass;
    }

}