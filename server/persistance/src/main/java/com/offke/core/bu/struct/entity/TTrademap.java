package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_TRADEMAP")
public class TTrademap implements java.io.Serializable {

    // Fields    

    private String trademapid;
    private String pluginid;
    private String tradeid;
    private String name;
    private Integer status;
    private String version;
    private String memo;

    // Constructors

    /**
     * default constructor
     */
    public TTrademap() {
    }

    /**
     * minimal constructor
     */
    public TTrademap(String trademapid, String pluginid, String tradeid, String name, Integer status) {
        this.trademapid = trademapid;
        this.pluginid = pluginid;
        this.tradeid = tradeid;
        this.name = name;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TTrademap(
            String trademapid,
            String pluginid,
            String tradeid,
            String name,
            Integer status,
            String version,
            String memo) {
        this.trademapid = trademapid;
        this.pluginid = pluginid;
        this.tradeid = tradeid;
        this.name = name;
        this.status = status;
        this.version = version;
        this.memo = memo;
    }

    // Property accessors
    @Id
    @Column(name = "TRADEMAPID", unique = true, nullable = false, length = 10)
    public String getTrademapid() {
        return this.trademapid;
    }

    public void setTrademapid(String trademapid) {
        this.trademapid = trademapid;
    }

    @Column(name = "PLUGINID", length = 10)
    public String getPluginid() {
        return this.pluginid;
    }

    public void setPluginid(String pluginid) {
        this.pluginid = pluginid;
    }

    @Column(name = "TRADEID", length = 10)
    public String getTradeid() {
        return this.tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    @Column(name = "NAME", nullable = false, length = 300)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "STATUS")
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "VERSION", length = 10)
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Column(name = "MEMO", length = 500)
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

}