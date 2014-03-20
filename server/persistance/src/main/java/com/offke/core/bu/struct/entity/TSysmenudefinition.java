package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_SYSMENUDEFINITION")
public class TSysmenudefinition implements java.io.Serializable {

    // Fields    

    private Integer sysmenuid;
    private Integer bsysmenuid;
    private String trademapid;
    private Integer imageid;
    private Short order;
    private String type;
    private String memo;

    // Constructors

    /**
     * default constructor
     */
    public TSysmenudefinition() {
    }

    /**
     * minimal constructor
     */
    public TSysmenudefinition(Integer sysmenuid, String type) {
        this.sysmenuid = sysmenuid;
        this.type = type;
    }

    /**
     * full constructor
     */
    public TSysmenudefinition(
            Integer sysmenuid,
            Integer bsysmenuid,
            String trademapid,
            Short order,
            String type,
            String memo) {
        this.sysmenuid = sysmenuid;
        this.bsysmenuid = bsysmenuid;
        this.trademapid = trademapid;
        this.order = order;
        this.type = type;
        this.memo = memo;
    }

    // Property accessors
    @Id
    @Column(name = "SYSMENUID", unique = true, nullable = false, precision = 6, scale = 0)
    public Integer getSysmenuid() {
        return this.sysmenuid;
    }

    public void setSysmenuid(Integer sysmenuid) {
        this.sysmenuid = sysmenuid;
    }

    @Column(name = "BSYSMENUID", precision = 6, scale = 0)
    public Integer getBsysmenuid() {
        return this.bsysmenuid;
    }

    public void setBsysmenuid(Integer bsysmenuid) {
        this.bsysmenuid = bsysmenuid;
    }

    @Column(name = "TRADEMAPID", length = 10)
    public String getTrademapid() {
        return this.trademapid;
    }

    public void setTrademapid(String trademapid) {
        this.trademapid = trademapid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public Integer getImageid() {
        return imageid;
    }

    @Column(name = "ORDER_", precision = 4, scale = 0)
    public Short getOrder() {
        return this.order;
    }

    public void setOrder(Short order) {
        this.order = order;
    }

    @Column(name = "TYPE", nullable = false, length = 1)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "MEMO", length = 500)
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

}