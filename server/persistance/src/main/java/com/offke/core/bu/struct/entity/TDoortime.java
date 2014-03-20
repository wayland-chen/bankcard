package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDoortime entity.
 */
@Entity
@Table(name = "T_DOORTIME")
public class TDoortime implements java.io.Serializable {

    // Fields    

    private Integer timeid;
    private String timename;
    private String starttime;
    private String endtime;
    private Integer adddelflag;
    private Integer downstatus;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoortime() {
    }

    /**
     * minimal constructor
     */
    public TDoortime(Integer timeid) {
        this.timeid = timeid;
    }

    /**
     * full constructor
     */
    public TDoortime(
            Integer timeid,
            String timename,
            String starttime,
            String endtime,
            Integer adddelflag,
            Integer downstatus,
            String updatetime) {
        this.timeid = timeid;
        this.timename = timename;
        this.starttime = starttime;
        this.endtime = endtime;
        this.adddelflag = adddelflag;
        this.downstatus = downstatus;
        this.updatetime = updatetime;
    }

    // Property accessors
    @Id
    @Column(name = "TIMEID", unique = true, nullable = false)
    public Integer getTimeid() {
        return this.timeid;
    }

    public void setTimeid(Integer timeid) {
        this.timeid = timeid;
    }

    @Column(name = "TIMENAME", length = 60)
    public String getTimename() {
        return this.timename;
    }

    public void setTimename(String timename) {
        this.timename = timename;
    }

    @Column(name = "STARTTIME", length = 6)
    public String getStarttime() {
        return this.starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    @Column(name = "ENDTIME", length = 6)
    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
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