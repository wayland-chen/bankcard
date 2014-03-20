package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TTranstype entity.
 */
@Entity
@Table(name = "T_TRANSTYPE")
public class TTranstype implements java.io.Serializable {

    // Fields    

    private Integer transtype;
    private String transname;
    private String displayflag;
    private String useflag;

    // Constructors

    /**
     * default constructor
     */
    public TTranstype() {
    }

    /**
     * minimal constructor
     */
    public TTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    /**
     * full constructor
     */
    public TTranstype(Integer transtype, String transname, String displayflag, String useflag) {
        this.transtype = transtype;
        this.transname = transname;
        this.displayflag = displayflag;
        this.useflag = useflag;
    }

    // Property accessors
    @Id
    @Column(name = "TRANSTYPE", unique = true, nullable = false)
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "TRANSNAME", length = 60)
    public String getTransname() {
        return this.transname;
    }

    public void setTransname(String transname) {
        this.transname = transname;
    }

    @Column(name = "DISPLAYFLAG", length = 1)
    public String getDisplayflag() {
        return this.displayflag;
    }

    public void setDisplayflag(String displayflag) {
        this.displayflag = displayflag;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

}