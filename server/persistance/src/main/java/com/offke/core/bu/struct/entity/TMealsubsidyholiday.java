package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TMealsubsidyholiday entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_MEALSUBSIDYHOLIDAY", uniqueConstraints = {
        @UniqueConstraint(columnNames = "DATEVAL"),
        @UniqueConstraint(columnNames = "HOLIDAYNAME")})
public class TMealsubsidyholiday implements java.io.Serializable {

    // Fields

    private Integer holidayid;
    private String holidayname;
    private String dateval;
    private String persistval1;
    private String persistval2;
    private String lasteditor;
    private String lasteditdatetime;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TMealsubsidyholiday() {
    }

    /**
     * minimal constructor
     */
    public TMealsubsidyholiday(Integer holidayid, String holidayname,
                               String dateval, String lasteditor, String lasteditdatetime) {
        this.holidayid = holidayid;
        this.holidayname = holidayname;
        this.dateval = dateval;
        this.lasteditor = lasteditor;
        this.lasteditdatetime = lasteditdatetime;
    }

    /**
     * full constructor
     */
    public TMealsubsidyholiday(Integer holidayid, String holidayname,
                               String dateval, String persistval1, String persistval2,
                               String lasteditor, String lasteditdatetime, String remark) {
        this.holidayid = holidayid;
        this.holidayname = holidayname;
        this.dateval = dateval;
        this.persistval1 = persistval1;
        this.persistval2 = persistval2;
        this.lasteditor = lasteditor;
        this.lasteditdatetime = lasteditdatetime;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "HOLIDAYID", unique = true, nullable = false, precision = 22, scale = 0)
    public Integer getHolidayid() {
        return this.holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    @Column(name = "HOLIDAYNAME", unique = true, nullable = false, length = 60)
    public String getHolidayname() {
        return this.holidayname;
    }

    public void setHolidayname(String holidayname) {
        this.holidayname = holidayname;
    }

    @Column(name = "DATEVAL", unique = true, nullable = false, length = 4)
    public String getDateval() {
        return this.dateval;
    }

    public void setDateval(String dateval) {
        this.dateval = dateval;
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