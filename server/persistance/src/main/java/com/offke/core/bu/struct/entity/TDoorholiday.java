package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDoorholiday entity.
 */
@Entity
@Table(name = "T_DOORHOLIDAY")
public class TDoorholiday implements java.io.Serializable {

    // Fields    

    private Integer holidayid;
    private String holidayname;
    private Integer daycnt;
    private Integer adddelflag;
    private Integer downstatus;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoorholiday() {
    }

    /**
     * minimal constructor
     */
    public TDoorholiday(Integer holidayid) {
        this.holidayid = holidayid;
    }

    /**
     * full constructor
     */
    public TDoorholiday(
            Integer holidayid,
            String holidayname,
            Integer daycnt,
            Integer adddelflag,
            Integer downstatus,
            String updatetime) {
        this.holidayid = holidayid;
        this.holidayname = holidayname;
        this.daycnt = daycnt;
        this.adddelflag = adddelflag;
        this.downstatus = downstatus;
        this.updatetime = updatetime;
    }

    // Property accessors
    @Id
    @Column(name = "HOLIDAYID", unique = true, nullable = false)
    public Integer getHolidayid() {
        return this.holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    @Column(name = "HOLIDAYNAME", length = 60)
    public String getHolidayname() {
        return this.holidayname;
    }

    public void setHolidayname(String holidayname) {
        this.holidayname = holidayname;
    }

    @Column(name = "DAYCNT")
    public Integer getDaycnt() {
        return this.daycnt;
    }

    public void setDaycnt(Integer daycnt) {
        this.daycnt = daycnt;
    }

    @Column(name = "ADDDELFLAG", precision = 1, scale = 0)
    public Integer getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(Integer adddelflag) {
        this.adddelflag = adddelflag;
    }

    @Column(name = "DOWNSTATUS")
    public Integer getDownstatus() {
        return this.downstatus;
    }

    public void setDownstatus(Integer downstatus) {
        this.downstatus = downstatus;
    }

    @Column(name = "UPDATETIME", length = 30)
    public String getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

}