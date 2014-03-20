package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TSubsystem entity.
 */
@Entity
@Table(name = "T_SUBSYSTEM")
public class TSubsystem implements java.io.Serializable {

    // Fields    

    private Integer sysid;
    private String sysname;
    private Integer systype;
    private String areacode;
    private Integer serverid;
    private String macaddr;
    private String ip;
    private Integer port;
    private String cardverno;
    private String initkey;
    private String dynakey;
    private String synctime;
    private Integer runstatus;
    private String status;
    private String opendate;
    private String closedate;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TSubsystem() {
    }

    /**
     * minimal constructor
     */
    public TSubsystem(Integer sysid) {
        this.sysid = sysid;
    }

    /**
     * full constructor
     */
    public TSubsystem(
            Integer sysid,
            String sysname,
            Integer systype,
            String areacode,
            Integer serverid,
            String macaddr,
            String ip,
            Integer port,
            String cardverno,
            String initkey,
            String dynakey,
            String synctime,
            Integer runstatus,
            String status,
            String opendate,
            String closedate,
            String remark) {
        this.sysid = sysid;
        this.sysname = sysname;
        this.systype = systype;
        this.areacode = areacode;
        this.serverid = serverid;
        this.macaddr = macaddr;
        this.ip = ip;
        this.port = port;
        this.cardverno = cardverno;
        this.initkey = initkey;
        this.dynakey = dynakey;
        this.synctime = synctime;
        this.runstatus = runstatus;
        this.status = status;
        this.opendate = opendate;
        this.closedate = closedate;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "SYSID", unique = true, nullable = false)
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "SYSNAME", length = 60)
    public String getSysname() {
        return this.sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname;
    }

    @Column(name = "SYSTYPE")
    public Integer getSystype() {
        return this.systype;
    }

    public void setSystype(Integer systype) {
        this.systype = systype;
    }

    @Column(name = "AREACODE", length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Column(name = "SERVERID")
    public Integer getServerid() {
        return this.serverid;
    }

    public void setServerid(Integer serverid) {
        this.serverid = serverid;
    }

    @Column(name = "MACADDR", length = 17)
    public String getMacaddr() {
        return this.macaddr;
    }

    public void setMacaddr(String macaddr) {
        this.macaddr = macaddr;
    }

    @Column(name = "IP", length = 15)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "PORT")
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Column(name = "CARDVERNO", length = 12)
    public String getCardverno() {
        return this.cardverno;
    }

    public void setCardverno(String cardverno) {
        this.cardverno = cardverno;
    }

    @Column(name = "INITKEY", length = 32)
    public String getInitkey() {
        return this.initkey;
    }

    public void setInitkey(String initkey) {
        this.initkey = initkey;
    }

    @Column(name = "DYNAKEY", length = 32)
    public String getDynakey() {
        return this.dynakey;
    }

    public void setDynakey(String dynakey) {
        this.dynakey = dynakey;
    }

    @Column(name = "SYNCTIME", length = 30)
    public String getSynctime() {
        return this.synctime;
    }

    public void setSynctime(String synctime) {
        this.synctime = synctime;
    }

    @Column(name = "RUNSTATUS")
    public Integer getRunstatus() {
        return this.runstatus;
    }

    public void setRunstatus(Integer runstatus) {
        this.runstatus = runstatus;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "OPENDATE", length = 8)
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