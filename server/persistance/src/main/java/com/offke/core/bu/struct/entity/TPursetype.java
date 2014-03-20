package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TPursetype entity.
 */
@Entity
@Table(name = "T_PURSETYPE")
public class TPursetype implements java.io.Serializable {

    // Fields    

    private Integer pursetype;
    private String pursetypename;
    private BigDecimal pursemaxbal;
    private Integer onlineflag;
    private Integer shopid;
    private Integer refundflag;
    private Integer primaryflag;
    private Integer enableflag;
    private String remark;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TPursetype() {
    }

    /**
     * minimal constructor
     */
    public TPursetype(Integer pursetype) {
        this.pursetype = pursetype;
    }

    /**
     * full constructor
     */
    public TPursetype(
            Integer pursetype,
            String pursetypename,
            BigDecimal pursemaxbal,
            Integer onlineflag,
            Integer shopid,
            Integer refundflag,
            Integer primaryflag,
            Integer enableflag,
            String remark,
            String lastsaved) {
        this.pursetype = pursetype;
        this.pursetypename = pursetypename;
        this.pursemaxbal = pursemaxbal;
        this.onlineflag = onlineflag;
        this.shopid = shopid;
        this.refundflag = refundflag;
        this.primaryflag = primaryflag;
        this.enableflag = enableflag;
        this.remark = remark;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "PURSETYPE", unique = true, nullable = false, precision = 1, scale = 0)
    public Integer getPursetype() {
        return this.pursetype;
    }

    public void setPursetype(Integer pursetype) {
        this.pursetype = pursetype;
    }

    @Column(name = "PURSETYPENAME", length = 60)
    public String getPursetypename() {
        return this.pursetypename;
    }

    public void setPursetypename(String pursetypename) {
        this.pursetypename = pursetypename;
    }

    @Column(name = "PURSEMAXBAL", precision = 15)
    public BigDecimal getPursemaxbal() {
        return this.pursemaxbal;
    }

    public void setPursemaxbal(BigDecimal pursemaxbal) {
        this.pursemaxbal = pursemaxbal;
    }

    @Column(name = "ONLINEFLAG", precision = 1, scale = 0)
    public Integer getOnlineflag() {
        return this.onlineflag;
    }

    public void setOnlineflag(Integer onlineflag) {
        this.onlineflag = onlineflag;
    }

    @Column(name = "SHOPID", precision = 2, scale = 0)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "REFUNDFLAG", precision = 1, scale = 0)
    public Integer getRefundflag() {
        return this.refundflag;
    }

    public void setRefundflag(Integer refundflag) {
        this.refundflag = refundflag;
    }

    @Column(name = "PRIMARYFLAG", precision = 1, scale = 0)
    public Integer getPrimaryflag() {
        return this.primaryflag;
    }

    public void setPrimaryflag(Integer primaryflag) {
        this.primaryflag = primaryflag;
    }

    @Column(name = "ENABLEFLAG", precision = 1, scale = 0)
    public Integer getEnableflag() {
        return this.enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}