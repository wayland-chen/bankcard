package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TShoppos entity.
 */
@Entity
@Table(name = "T_SHOPPOS")
public class TShoppos implements java.io.Serializable {

    // Fields    

    private Integer id;
    private Integer deviceid;
    private String devphyid;
    private Integer shopid;
    private String endtime;
    private String remark;
    private String startdate;
    private String enddate;
    private String status;
    private String opercode;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TShoppos() {
    }

    /**
     * minimal constructor
     */
    public TShoppos(Integer id, Integer deviceid, Integer shopid) {
        this.id = id;
        this.deviceid = deviceid;
        this.shopid = shopid;
    }

    /**
     * full constructor
     */
    public TShoppos(
            Integer id,
            Integer deviceid,
            String devphyid,
            Integer shopid,
            String endtime,
            String remark,
            String startdate,
            String enddate,
            String status,
            String opercode,
            String lastsaved) {
        this.id = id;
        this.deviceid = deviceid;
        this.devphyid = devphyid;
        this.shopid = shopid;
        this.endtime = endtime;
        this.remark = remark;
        this.startdate = startdate;
        this.enddate = enddate;
        this.status = status;
        this.opercode = opercode;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "DEVICEID", nullable = false)
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

    @Column(name = "SHOPID", nullable = false)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "ENDTIME", length = 6)
    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "STARTDATE", length = 8)
    public String getStartdate() {
        return this.startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    @Column(name = "ENDDATE", length = 8)
    public String getEnddate() {
        return this.enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}