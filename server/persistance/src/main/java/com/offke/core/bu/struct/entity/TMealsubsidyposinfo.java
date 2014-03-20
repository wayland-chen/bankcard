package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMealsubsidyposinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_MEALSUBSIDYPOSINFO")
public class TMealsubsidyposinfo implements java.io.Serializable {

    // Fields

    private Long id;
    private Integer deviceid;
    private String devphyid;
    private String devicename;
    private Integer status;
    private String opendate;
    private String closedate;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TMealsubsidyposinfo() {
    }

    /**
     * minimal constructor
     */
    public TMealsubsidyposinfo(Long id, Integer deviceid,
                               Integer status, String opendate) {
        this.id = id;
        this.deviceid = deviceid;
        this.status = status;
        this.opendate = opendate;
    }

    /**
     * full constructor
     */
    public TMealsubsidyposinfo(Long id, Integer deviceid,
                               String devphyid, String devicename, Integer status,
                               String opendate, String closedate, String remark) {
        this.id = id;
        this.deviceid = deviceid;
        this.devphyid = devphyid;
        this.devicename = devicename;
        this.status = status;
        this.opendate = opendate;
        this.closedate = closedate;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "DEVICEID", nullable = false, precision = 22, scale = 0)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "DEVPHYID", length = 20)
    public String getDevphyid() {
        return this.devphyid;
    }

    public void setDevphyid(String devphyid) {
        this.devphyid = devphyid;
    }

    @Column(name = "DEVICENAME", length = 60)
    public String getDevicename() {
        return this.devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "OPENDATE", nullable = false, length = 8)
    public String getOpendate() {
        return this.opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    @Column(name = "CLOSEDATE", length = 8)
    public String getClosedate() {
        return this.closedate;
    }

    public void setClosedate(String closedate) {
        this.closedate = closedate;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}