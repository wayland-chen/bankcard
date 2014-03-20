package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TPhydevice entity.
 */
@Entity
@Table(name = "T_PHYDEVICE")
public class TPhydevice implements java.io.Serializable {

    // Fields    

    private Integer phytype;
    private String dname;
    private String dtype;
    private String factory;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TPhydevice() {
    }

    /**
     * minimal constructor
     */
    public TPhydevice(Integer phytype) {
        this.phytype = phytype;
    }

    /**
     * full constructor
     */
    public TPhydevice(Integer phytype, String dname, String dtype, String factory, String remark) {
        this.phytype = phytype;
        this.dname = dname;
        this.dtype = dtype;
        this.factory = factory;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "PHYTYPE", unique = true, nullable = false)
    public Integer getPhytype() {
        return this.phytype;
    }

    public void setPhytype(Integer phytype) {
        this.phytype = phytype;
    }

    @Column(name = "DNAME", length = 60)
    public String getDname() {
        return this.dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Column(name = "DTYPE", length = 60)
    public String getDtype() {
        return this.dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    @Column(name = "FACTORY", length = 60)
    public String getFactory() {
        return this.factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}