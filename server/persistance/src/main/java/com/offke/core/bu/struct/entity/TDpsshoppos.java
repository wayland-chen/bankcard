package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDpsshoppos entity.
 */
@Entity
@Table(name = "T_DPSSHOPPOS")
public class TDpsshoppos implements java.io.Serializable {

    // Fields    

    private Integer deviceid;
    private Integer shopid;
    private String opercode;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TDpsshoppos() {
    }

    /**
     * minimal constructor
     */
    public TDpsshoppos(Integer deviceid, Integer shopid) {
        this.deviceid = deviceid;
        this.shopid = shopid;
    }

    /**
     * full constructor
     */
    public TDpsshoppos(Integer deviceid, Integer shopid, String opercode, String lastsaved) {
        this.deviceid = deviceid;
        this.shopid = shopid;
        this.opercode = opercode;
        this.lastsaved = lastsaved;
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

    @Column(name = "SHOPID", nullable = false)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
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