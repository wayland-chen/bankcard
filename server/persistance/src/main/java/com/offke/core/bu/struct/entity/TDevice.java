package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "T_DEVICE")
public class TDevice implements java.io.Serializable {

    // Fields    

    private Integer deviceid;
    private String devicename;
    private String devphyid;
    private Integer deviceno;
    private Integer devphytype;
    private String devtypecode;
    private String devverno;
    private String cardphytype;
    private Integer fdeviceid;
    private Integer runstatus;
    private String status;
    private Integer svrportcnt;
    private Integer svrportno;
    private Integer commtype;
    private String ip;
    private Integer portno;
    private Integer baudrate;
    private String cardset;
    private String cardverno;
    private Long lastseqno;
    private String lasttranstime;
    private Integer purseno;
    private BigDecimal maxamt;
    private Integer sysid;
    private String areacode;
    private String doorlstver;
    private Integer devusage;
    private String opendate;
    private String closedate;
    private String batchno;
    private String lastsaved;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TDevice() {
    }

    /**
     * minimal constructor
     */
    public TDevice(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * full constructor
     */
    public TDevice(
            Integer deviceid,
            String devicename,
            String devphyid,
            Integer deviceno,
            Integer devphytype,
            String devtypecode,
            String devverno,
            String cardphytype,
            Integer fdeviceid,
            Integer runstatus,
            String status,
            Integer svrportcnt,
            Integer svrportno,
            Integer commtype,
            String ip,
            Integer portno,
            Integer baudrate,
            String cardset,
            String cardverno,
            Long lastseqno,
            String lasttranstime,
            Integer purseno,
            BigDecimal maxamt,
            Integer sysid,
            String areacode,
            String doorlstver,
            Integer devusage,
            String opendate,
            String closedate,
            String batchno,
            String lastsaved,
            String remark) {
        this.deviceid = deviceid;
        this.devicename = devicename;
        this.devphyid = devphyid;
        this.deviceno = deviceno;
        this.devphytype = devphytype;
        this.devtypecode = devtypecode;
        this.devverno = devverno;
        this.cardphytype = cardphytype;
        this.fdeviceid = fdeviceid;
        this.runstatus = runstatus;
        this.status = status;
        this.svrportcnt = svrportcnt;
        this.svrportno = svrportno;
        this.commtype = commtype;
        this.ip = ip;
        this.portno = portno;
        this.baudrate = baudrate;
        this.cardset = cardset;
        this.cardverno = cardverno;
        this.lastseqno = lastseqno;
        this.lasttranstime = lasttranstime;
        this.purseno = purseno;
        this.maxamt = maxamt;
        this.sysid = sysid;
        this.areacode = areacode;
        this.doorlstver = doorlstver;
        this.devusage = devusage;
        this.opendate = opendate;
        this.closedate = closedate;
        this.batchno = batchno;
        this.lastsaved = lastsaved;
        this.remark = remark;
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

    @Column(name = "DEVICENAME", length = 60)
    public String getDevicename() {
        return this.devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    @Column(name = "DEVPHYID", length = 20)
    public String getDevphyid() {
        return this.devphyid;
    }

    public void setDevphyid(String devphyid) {
        this.devphyid = devphyid;
    }

    @Column(name = "DEVICENO")
    public Integer getDeviceno() {
        return this.deviceno;
    }

    public void setDeviceno(Integer deviceno) {
        this.deviceno = deviceno;
    }

    @Column(name = "DEVPHYTYPE")
    public Integer getDevphytype() {
        return this.devphytype;
    }

    public void setDevphytype(Integer devphytype) {
        this.devphytype = devphytype;
    }

    @Column(name = "DEVTYPECODE", length = 30)
    public String getDevtypecode() {
        return this.devtypecode;
    }

    public void setDevtypecode(String devtypecode) {
        this.devtypecode = devtypecode;
    }

    @Column(name = "DEVVERNO", length = 30)
    public String getDevverno() {
        return this.devverno;
    }

    public void setDevverno(String devverno) {
        this.devverno = devverno;
    }

    @Column(name = "CARDPHYTYPE", length = 2)
    public String getCardphytype() {
        return this.cardphytype;
    }

    public void setCardphytype(String cardphytype) {
        this.cardphytype = cardphytype;
    }

    @Column(name = "FDEVICEID")
    public Integer getFdeviceid() {
        return this.fdeviceid;
    }

    public void setFdeviceid(Integer fdeviceid) {
        this.fdeviceid = fdeviceid;
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

    @Column(name = "SVRPORTCNT")
    public Integer getSvrportcnt() {
        return this.svrportcnt;
    }

    public void setSvrportcnt(Integer svrportcnt) {
        this.svrportcnt = svrportcnt;
    }

    @Column(name = "SVRPORTNO")
    public Integer getSvrportno() {
        return this.svrportno;
    }

    public void setSvrportno(Integer svrportno) {
        this.svrportno = svrportno;
    }

    @Column(name = "COMMTYPE")
    public Integer getCommtype() {
        return this.commtype;
    }

    public void setCommtype(Integer commtype) {
        this.commtype = commtype;
    }

    @Column(name = "IP", length = 15)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "PORTNO")
    public Integer getPortno() {
        return this.portno;
    }

    public void setPortno(Integer portno) {
        this.portno = portno;
    }

    @Column(name = "BAUDRATE")
    public Integer getBaudrate() {
        return this.baudrate;
    }

    public void setBaudrate(Integer baudrate) {
        this.baudrate = baudrate;
    }

    @Column(name = "CARDSET", length = 64)
    public String getCardset() {
        return this.cardset;
    }

    public void setCardset(String cardset) {
        this.cardset = cardset;
    }

    @Column(name = "CARDVERNO", length = 12)
    public String getCardverno() {
        return this.cardverno;
    }

    public void setCardverno(String cardverno) {
        this.cardverno = cardverno;
    }

    @Column(name = "LASTSEQNO")
    public Long getLastseqno() {
        return this.lastseqno;
    }

    public void setLastseqno(Long lastseqno) {
        this.lastseqno = lastseqno;
    }

    @Column(name = "LASTTRANSTIME", length = 30)
    public String getLasttranstime() {
        return this.lasttranstime;
    }

    public void setLasttranstime(String lasttranstime) {
        this.lasttranstime = lasttranstime;
    }

    @Column(name = "PURSENO")
    public Integer getPurseno() {
        return this.purseno;
    }

    public void setPurseno(Integer purseno) {
        this.purseno = purseno;
    }

    @Column(name = "MAXAMT", precision = 15)
    public BigDecimal getMaxamt() {
        return this.maxamt;
    }

    public void setMaxamt(BigDecimal maxamt) {
        this.maxamt = maxamt;
    }

    @Column(name = "SYSID")
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "AREACODE", length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Column(name = "DOORLSTVER", length = 12)
    public String getDoorlstver() {
        return this.doorlstver;
    }

    public void setDoorlstver(String doorlstver) {
        this.doorlstver = doorlstver;
    }

    @Column(name = "DEVUSAGE")
    public Integer getDevusage() {
        return this.devusage;
    }

    public void setDevusage(Integer devusage) {
        this.devusage = devusage;
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

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
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