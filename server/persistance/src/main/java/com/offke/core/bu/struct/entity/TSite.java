package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TSite entity.
 */
@Entity
@Table(name = "T_SITE")
public class TSite implements java.io.Serializable {

    // Fields    

    private Integer siteno;
    private String sitename;
    private String ip;
    private String machinecode;
    private String lastsaved;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TSite() {
    }

    /**
     * minimal constructor
     */
    public TSite(Integer siteno) {
        this.siteno = siteno;
    }

    /**
     * full constructor
     */
    public TSite(
            Integer siteno,
            String sitename,
            String ip,
            String machinecode,
            String lastsaved,
            String remark) {
        this.siteno = siteno;
        this.sitename = sitename;
        this.ip = ip;
        this.machinecode = machinecode;
        this.lastsaved = lastsaved;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "SITENO", unique = true, nullable = false)
    public Integer getSiteno() {
        return this.siteno;
    }

    public void setSiteno(Integer siteno) {
        this.siteno = siteno;
    }

    @Column(name = "SITENAME", length = 60)
    public String getSitename() {
        return this.sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    @Column(name = "IP", length = 15)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "MACHINECODE", length = 60)
    public String getMachinecode() {
        return this.machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}