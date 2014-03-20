package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TKeys entity.
 */
@Entity
@Table(name = "T_KEYS")
public class TKeys implements java.io.Serializable {

    // Fields    

    private Integer keyid;
    private String keyval;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TKeys() {
    }

    /**
     * minimal constructor
     */
    public TKeys(Integer keyid) {
        this.keyid = keyid;
    }

    /**
     * full constructor
     */
    public TKeys(Integer keyid, String keyval, String remark) {
        this.keyid = keyid;
        this.keyval = keyval;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "KEYID", unique = true, nullable = false)
    public Integer getKeyid() {
        return this.keyid;
    }

    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    @Column(name = "KEYVAL", length = 64)
    public String getKeyval() {
        return this.keyval;
    }

    public void setKeyval(String keyval) {
        this.keyval = keyval;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}