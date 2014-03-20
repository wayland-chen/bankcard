package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDoorweektime entity.
 */
@Entity
@Table(name = "T_DOORWEEKTIME")
public class TDoorweektime implements java.io.Serializable {

    // Fields    

    private Integer weekid;
    private String weekname;
    private Integer day1timegrpid;
    private Integer day2timegrpid;
    private Integer day3timegrpid;
    private Integer day4timegrpid;
    private Integer day5timegrpid;
    private Integer day6timegrpid;
    private Integer day7timegrpid;
    private Integer adddelflag;
    private Integer downstatus;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoorweektime() {
    }

    /**
     * minimal constructor
     */
    public TDoorweektime(Integer weekid) {
        this.weekid = weekid;
    }

    /**
     * full constructor
     */
    public TDoorweektime(
            Integer weekid,
            String weekname,
            Integer day1timegrpid,
            Integer day2timegrpid,
            Integer day3timegrpid,
            Integer day4timegrpid,
            Integer day5timegrpid,
            Integer day6timegrpid,
            Integer day7timegrpid,
            Integer adddelflag,
            Integer downstatus,
            String updatetime) {
        this.weekid = weekid;
        this.weekname = weekname;
        this.day1timegrpid = day1timegrpid;
        this.day2timegrpid = day2timegrpid;
        this.day3timegrpid = day3timegrpid;
        this.day4timegrpid = day4timegrpid;
        this.day5timegrpid = day5timegrpid;
        this.day6timegrpid = day6timegrpid;
        this.day7timegrpid = day7timegrpid;
        this.adddelflag = adddelflag;
        this.downstatus = downstatus;
        this.updatetime = updatetime;
    }

    // Property accessors
    @Id
    @Column(name = "WEEKID", unique = true, nullable = false)
    public Integer getWeekid() {
        return this.weekid;
    }

    public void setWeekid(Integer weekid) {
        this.weekid = weekid;
    }

    @Column(name = "WEEKNAME", length = 60)
    public String getWeekname() {
        return this.weekname;
    }

    public void setWeekname(String weekname) {
        this.weekname = weekname;
    }

    @Column(name = "DAY1TIMEGRPID")
    public Integer getDay1timegrpid() {
        return this.day1timegrpid;
    }

    public void setDay1timegrpid(Integer day1timegrpid) {
        this.day1timegrpid = day1timegrpid;
    }

    @Column(name = "DAY2TIMEGRPID")
    public Integer getDay2timegrpid() {
        return this.day2timegrpid;
    }

    public void setDay2timegrpid(Integer day2timegrpid) {
        this.day2timegrpid = day2timegrpid;
    }

    @Column(name = "DAY3TIMEGRPID")
    public Integer getDay3timegrpid() {
        return this.day3timegrpid;
    }

    public void setDay3timegrpid(Integer day3timegrpid) {
        this.day3timegrpid = day3timegrpid;
    }

    @Column(name = "DAY4TIMEGRPID")
    public Integer getDay4timegrpid() {
        return this.day4timegrpid;
    }

    public void setDay4timegrpid(Integer day4timegrpid) {
        this.day4timegrpid = day4timegrpid;
    }

    @Column(name = "DAY5TIMEGRPID")
    public Integer getDay5timegrpid() {
        return this.day5timegrpid;
    }

    public void setDay5timegrpid(Integer day5timegrpid) {
        this.day5timegrpid = day5timegrpid;
    }

    @Column(name = "DAY6TIMEGRPID")
    public Integer getDay6timegrpid() {
        return this.day6timegrpid;
    }

    public void setDay6timegrpid(Integer day6timegrpid) {
        this.day6timegrpid = day6timegrpid;
    }

    @Column(name = "DAY7TIMEGRPID")
    public Integer getDay7timegrpid() {
        return this.day7timegrpid;
    }

    public void setDay7timegrpid(Integer day7timegrpid) {
        this.day7timegrpid = day7timegrpid;
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