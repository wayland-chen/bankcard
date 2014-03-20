package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoorholidaytime entity.
 */
@Entity
@Table(name = "T_DOORHOLIDAYTIME")
public class TDoorholidaytime implements java.io.Serializable {

    // Fields    

    private TDoorholidaytimeId id;
    private Integer timegrpid;
    private Integer adddelflag;
    private Integer downstatus;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoorholidaytime() {
    }

    /**
     * minimal constructor
     */
    public TDoorholidaytime(TDoorholidaytimeId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDoorholidaytime(
            TDoorholidaytimeId id,
            Integer timegrpid,
            Integer adddelflag,
            Integer downstatus,
            String updatetime) {
        this.id = id;
        this.timegrpid = timegrpid;
        this.adddelflag = adddelflag;
        this.downstatus = downstatus;
        this.updatetime = updatetime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "holidayid", column = @Column(name = "HOLIDAYID", nullable = false)),
            @AttributeOverride(name = "holidaydate", column = @Column(name = "HOLIDAYDATE", nullable = false, length = 8))})
    public TDoorholidaytimeId getId() {
        return this.id;
    }

    public void setId(TDoorholidaytimeId id) {
        this.id = id;
    }

    @Column(name = "TIMEGRPID")
    public Integer getTimegrpid() {
        return this.timegrpid;
    }

    public void setTimegrpid(Integer timegrpid) {
        this.timegrpid = timegrpid;
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