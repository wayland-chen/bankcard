package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TErrcode entity.
 */
@Entity
@Table(name = "T_ERRCODE")
public class TErrcode implements java.io.Serializable {

    // Fields    

    private Integer errcode;
    private String errmsg;

    // Constructors

    /**
     * default constructor
     */
    public TErrcode() {
    }

    /**
     * minimal constructor
     */
    public TErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    /**
     * full constructor
     */
    public TErrcode(Integer errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    // Property accessors
    @Id
    @Column(name = "ERRCODE", unique = true, nullable = false)
    public Integer getErrcode() {
        return this.errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    @Column(name = "ERRMSG", length = 240)
    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}