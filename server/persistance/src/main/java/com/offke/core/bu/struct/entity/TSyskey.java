package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TSyskey entity.
 */
@Entity
@Table(name = "T_SYSKEY")
public class TSyskey implements java.io.Serializable {

    // Fields    

    private String keycode;
    private String keyname;
    private Long keyval;
    private Integer maxval;
    private String keytype;

    // Constructors

    /**
     * default constructor
     */
    public TSyskey() {
    }

    /**
     * minimal constructor
     */
    public TSyskey(String keycode) {
        this.keycode = keycode;
    }

    /**
     * full constructor
     */
    public TSyskey(String keycode, String keyname, Long keyval, Integer maxval, String keytype) {
        this.keycode = keycode;
        this.keyname = keyname;
        this.keyval = keyval;
        this.maxval = maxval;
        this.keytype = keytype;
    }

    // Property accessors
    @Id
    @Column(name = "KEYCODE", unique = true, nullable = false, length = 60)
    public String getKeycode() {
        return this.keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode;
    }

    @Column(name = "KEYNAME", length = 60)
    public String getKeyname() {
        return this.keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    @Column(name = "KEYVAL", precision = 10, scale = 0)
    public Long getKeyval() {
        return this.keyval;
    }

    public void setKeyval(Long keyval) {
        this.keyval = keyval;
    }

    @Column(name = "MAXVAL")
    public Integer getMaxval() {
        return this.maxval;
    }

    public void setMaxval(Integer maxval) {
        this.maxval = maxval;
    }

    @Column(name = "KEYTYPE", length = 1)
    public String getKeytype() {
        return this.keytype;
    }

    public void setKeytype(String keytype) {
        this.keytype = keytype;
    }

}