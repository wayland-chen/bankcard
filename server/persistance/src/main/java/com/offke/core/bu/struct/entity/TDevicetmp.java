package com.offke.core.bu.struct.entity;

import javax.persistence.*;


@Entity
@Table(name = "T_DEVICETMP")
public class TDevicetmp implements java.io.Serializable {

    // Fields    

    private TDevicetmpId id;
    private String transdate;
    private String transtime;
    private String opercode;
    private String areacode;
    private String devicename;
    private String devphyid;
    private Integer devphytype;
    private String devtypecode;
    private Integer deviceno;
    private Integer fdeviceid;
    private String cardphytype;
    private Integer commtype;
    private String ip;
    private Integer portno;
    private Integer svrportno;
    private Integer svrportcnt;
    private Integer sysid;
    private Integer devusage;
    private String errmsg;

    // Constructors

    /**
     * default constructor
     */
    public TDevicetmp() {
    }

    /**
     * minimal constructor
     */
    public TDevicetmp(TDevicetmpId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDevicetmp(
            TDevicetmpId id,
            String transdate,
            String transtime,
            String opercode,
            String areacode,
            String devicename,
            String devphyid,
            Integer devphytype,
            String devtypecode,
            Integer deviceno,
            Integer fdeviceid,
            String cardphytype,
            Integer commtype,
            String ip,
            Integer portno,
            Integer svrportno,
            Integer svrportcnt,
            Integer sysid,
            Integer devusage,
            String errmsg) {
        this.id = id;
        this.transdate = transdate;
        this.transtime = transtime;
        this.opercode = opercode;
        this.areacode = areacode;
        this.devicename = devicename;
        this.devphyid = devphyid;
        this.devphytype = devphytype;
        this.devtypecode = devtypecode;
        this.deviceno = deviceno;
        this.fdeviceid = fdeviceid;
        this.cardphytype = cardphytype;
        this.commtype = commtype;
        this.ip = ip;
        this.portno = portno;
        this.svrportno = svrportno;
        this.svrportcnt = svrportcnt;
        this.sysid = sysid;
        this.devusage = devusage;
        this.errmsg = errmsg;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "batchno", column = @Column(name = "BATCHNO", nullable = false, length = 30)),
            @AttributeOverride(name = "seqno", column = @Column(name = "SEQNO", nullable = false))})
    public TDevicetmpId getId() {
        return this.id;
    }

    public void setId(TDevicetmpId id) {
        this.id = id;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "AREACODE", length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
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

    @Column(name = "DEVICENO")
    public Integer getDeviceno() {
        return this.deviceno;
    }

    public void setDeviceno(Integer deviceno) {
        this.deviceno = deviceno;
    }

    @Column(name = "FDEVICEID")
    public Integer getFdeviceid() {
        return this.fdeviceid;
    }

    public void setFdeviceid(Integer fdeviceid) {
        this.fdeviceid = fdeviceid;
    }

    @Column(name = "CARDPHYTYPE", length = 2)
    public String getCardphytype() {
        return this.cardphytype;
    }

    public void setCardphytype(String cardphytype) {
        this.cardphytype = cardphytype;
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

    @Column(name = "SVRPORTNO")
    public Integer getSvrportno() {
        return this.svrportno;
    }

    public void setSvrportno(Integer svrportno) {
        this.svrportno = svrportno;
    }

    @Column(name = "SVRPORTCNT")
    public Integer getSvrportcnt() {
        return this.svrportcnt;
    }

    public void setSvrportcnt(Integer svrportcnt) {
        this.svrportcnt = svrportcnt;
    }

    @Column(name = "SYSID")
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "DEVUSAGE")
    public Integer getDevusage() {
        return this.devusage;
    }

    public void setDevusage(Integer devusage) {
        this.devusage = devusage;
    }

    @Column(name = "ERRMSG", length = 240)
    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}