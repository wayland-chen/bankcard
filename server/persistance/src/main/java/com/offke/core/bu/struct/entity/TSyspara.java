package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TSyspara entity.
 */
@Entity
@Table(name = "T_SYSPARA")
public class TSyspara implements java.io.Serializable {

    // Fields    

    private Integer paraid;
    private String paraval;
    private String paraname;
    private String paraunit;
    private String displayflag;
    private String remark;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TSyspara() {
    }

    /**
     * minimal constructor
     */
    public TSyspara(Integer paraid) {
        this.paraid = paraid;
    }

    /**
     * full constructor
     */
    public TSyspara(
            Integer paraid,
            String paraval,
            String paraname,
            String paraunit,
            String displayflag,
            String remark,
            String lastsaved) {
        this.paraid = paraid;
        this.paraval = paraval;
        this.paraname = paraname;
        this.paraunit = paraunit;
        this.displayflag = displayflag;
        this.remark = remark;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "PARAID", unique = true, nullable = false)
    public Integer getParaid() {
        return this.paraid;
    }

    public void setParaid(Integer paraid) {
        this.paraid = paraid;
    }

    @Column(name = "PARAVAL", length = 60)
    public String getParaval() {
        return this.paraval;
    }

    public void setParaval(String paraval) {
        this.paraval = paraval;
    }

    @Column(name = "PARANAME", length = 60)
    public String getParaname() {
        return this.paraname;
    }

    public void setParaname(String paraname) {
        this.paraname = paraname;
    }

    @Column(name = "PARAUNIT", length = 30)
    public String getParaunit() {
        return this.paraunit;
    }

    public void setParaunit(String paraunit) {
        this.paraunit = paraunit;
    }

    @Column(name = "DISPLAYFLAG", length = 1)
    public String getDisplayflag() {
        return this.displayflag;
    }

    public void setDisplayflag(String displayflag) {
        this.displayflag = displayflag;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}