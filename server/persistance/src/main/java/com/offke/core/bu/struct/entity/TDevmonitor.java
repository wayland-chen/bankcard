package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDevmonitor entity.
 */
@Entity
@Table(name = "T_DEVMONITOR")
public class TDevmonitor implements java.io.Serializable {

    // Fields    

    private Integer deviceid;
    private String optime;
    private String coltime;
    private String devtime;
    private Integer beatstatus;
    private String cardverno;
    private Integer hardiskper;
    private Integer memoryper;
    private Integer cpuper;

    // Constructors

    /**
     * default constructor
     */
    public TDevmonitor() {
    }

    /**
     * minimal constructor
     */
    public TDevmonitor(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * full constructor
     */
    public TDevmonitor(
            Integer deviceid,
            String optime,
            String coltime,
            String devtime,
            Integer beatstatus,
            String cardverno,
            Integer hardiskper,
            Integer memoryper,
            Integer cpuper) {
        this.deviceid = deviceid;
        this.optime = optime;
        this.coltime = coltime;
        this.devtime = devtime;
        this.beatstatus = beatstatus;
        this.cardverno = cardverno;
        this.hardiskper = hardiskper;
        this.memoryper = memoryper;
        this.cpuper = cpuper;
    }

    // Property accessors
    @Id
    @Column(name = "DEVICEID", unique = true, nullable = false)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "OPTIME", length = 30)
    public String getOptime() {
        return this.optime;
    }

    public void setOptime(String optime) {
        this.optime = optime;
    }

    @Column(name = "COLTIME", length = 30)
    public String getColtime() {
        return this.coltime;
    }

    public void setColtime(String coltime) {
        this.coltime = coltime;
    }

    @Column(name = "DEVTIME", length = 30)
    public String getDevtime() {
        return this.devtime;
    }

    public void setDevtime(String devtime) {
        this.devtime = devtime;
    }

    @Column(name = "BEATSTATUS")
    public Integer getBeatstatus() {
        return this.beatstatus;
    }

    public void setBeatstatus(Integer beatstatus) {
        this.beatstatus = beatstatus;
    }

    @Column(name = "CARDVERNO", length = 12)
    public String getCardverno() {
        return this.cardverno;
    }

    public void setCardverno(String cardverno) {
        this.cardverno = cardverno;
    }

    @Column(name = "HARDISKPER")
    public Integer getHardiskper() {
        return this.hardiskper;
    }

    public void setHardiskper(Integer hardiskper) {
        this.hardiskper = hardiskper;
    }

    @Column(name = "MEMORYPER")
    public Integer getMemoryper() {
        return this.memoryper;
    }

    public void setMemoryper(Integer memoryper) {
        this.memoryper = memoryper;
    }

    @Column(name = "CPUPER")
    public Integer getCpuper() {
        return this.cpuper;
    }

    public void setCpuper(Integer cpuper) {
        this.cpuper = cpuper;
    }

}