package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TMealsubsidycusttype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_MEALSUBSIDYCUSTTYPE", uniqueConstraints = {
        @UniqueConstraint(columnNames = "CUSTTYPENAME"),
        @UniqueConstraint(columnNames = "CUSTTYPE")})
public class TMealsubsidycusttype implements java.io.Serializable {

    // Fields

    private Integer mscusttypeid;
    private Integer custtype;
    private String custtypename;
    private String persistval1;
    private String persistval2;
    private String lasteditor;
    private String lasteditdatetime;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TMealsubsidycusttype() {
    }

    /**
     * minimal constructor
     */
    public TMealsubsidycusttype(Integer mscusttypeid, Integer custtype,
                                String custtypename, String lasteditor, String lasteditdatetime) {
        this.mscusttypeid = mscusttypeid;
        this.custtype = custtype;
        this.custtypename = custtypename;
        this.lasteditor = lasteditor;
        this.lasteditdatetime = lasteditdatetime;
    }

    /**
     * full constructor
     */
    public TMealsubsidycusttype(Integer mscusttypeid, Integer custtype,
                                String custtypename, String persistval1, String persistval2,
                                String lasteditor, String lasteditdatetime, String remark) {
        this.mscusttypeid = mscusttypeid;
        this.custtype = custtype;
        this.custtypename = custtypename;
        this.persistval1 = persistval1;
        this.persistval2 = persistval2;
        this.lasteditor = lasteditor;
        this.lasteditdatetime = lasteditdatetime;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "MSCUSTTYPEID", unique = true, nullable = false, precision = 22, scale = 0)
    public Integer getMscusttypeid() {
        return this.mscusttypeid;
    }

    public void setMscusttypeid(Integer mscusttypeid) {
        this.mscusttypeid = mscusttypeid;
    }

    @Column(name = "CUSTTYPE", unique = true, nullable = false, precision = 22, scale = 0)
    public Integer getCusttype() {
        return this.custtype;
    }

    public void setCusttype(Integer custtype) {
        this.custtype = custtype;
    }

    @Column(name = "CUSTTYPENAME", unique = true, nullable = false, length = 60)
    public String getCusttypename() {
        return this.custtypename;
    }

    public void setCusttypename(String custtypename) {
        this.custtypename = custtypename;
    }

    @Column(name = "PERSISTVAL1", length = 20)
    public String getPersistval1() {
        return this.persistval1;
    }

    public void setPersistval1(String persistval1) {
        this.persistval1 = persistval1;
    }

    @Column(name = "PERSISTVAL2", length = 20)
    public String getPersistval2() {
        return this.persistval2;
    }

    public void setPersistval2(String persistval2) {
        this.persistval2 = persistval2;
    }

    @Column(name = "LASTEDITOR", nullable = false, length = 10)
    public String getLasteditor() {
        return this.lasteditor;
    }

    public void setLasteditor(String lasteditor) {
        this.lasteditor = lasteditor;
    }

    @Column(name = "LASTEDITDATETIME", nullable = false, length = 14)
    public String getLasteditdatetime() {
        return this.lasteditdatetime;
    }

    public void setLasteditdatetime(String lasteditdatetime) {
        this.lasteditdatetime = lasteditdatetime;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}