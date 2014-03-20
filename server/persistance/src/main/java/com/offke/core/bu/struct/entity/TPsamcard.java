package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TPsamcard entity.
 */
@Entity
@Table(name = "T_PSAMCARD")
public class TPsamcard implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private Integer cardtype;
    private Integer cardver;
    private String termno;
    private Integer status;
    private String startdate;
    private String expiredate;
    private Integer keyindex;
    private Integer deviceid;
    private String devjointime;
    private String publishid;
    private String userid;
    private String opendate;
    private String closedate;
    private String disabledate;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TPsamcard() {
    }

    /**
     * minimal constructor
     */
    public TPsamcard(Integer cardno) {
        this.cardno = cardno;
    }

    /**
     * full constructor
     */
    public TPsamcard(
            Integer cardno,
            Integer cardtype,
            Integer cardver,
            String termno,
            Integer status,
            String startdate,
            String expiredate,
            Integer keyindex,
            Integer deviceid,
            String devjointime,
            String publishid,
            String userid,
            String opendate,
            String closedate,
            String disabledate,
            String lastsaved) {
        this.cardno = cardno;
        this.cardtype = cardtype;
        this.cardver = cardver;
        this.termno = termno;
        this.status = status;
        this.startdate = startdate;
        this.expiredate = expiredate;
        this.keyindex = keyindex;
        this.deviceid = deviceid;
        this.devjointime = devjointime;
        this.publishid = publishid;
        this.userid = userid;
        this.opendate = opendate;
        this.closedate = closedate;
        this.disabledate = disabledate;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "CARDNO", unique = true, nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "CARDTYPE")
    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Column(name = "CARDVER")
    public Integer getCardver() {
        return this.cardver;
    }

    public void setCardver(Integer cardver) {
        this.cardver = cardver;
    }

    @Column(name = "TERMNO", length = 12)
    public String getTermno() {
        return this.termno;
    }

    public void setTermno(String termno) {
        this.termno = termno;
    }

    @Column(name = "STATUS", precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "STARTDATE", length = 8)
    public String getStartdate() {
        return this.startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    @Column(name = "EXPIREDATE", length = 8)
    public String getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    @Column(name = "KEYINDEX")
    public Integer getKeyindex() {
        return this.keyindex;
    }

    public void setKeyindex(Integer keyindex) {
        this.keyindex = keyindex;
    }

    @Column(name = "DEVICEID")
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "DEVJOINTIME", length = 30)
    public String getDevjointime() {
        return this.devjointime;
    }

    public void setDevjointime(String devjointime) {
        this.devjointime = devjointime;
    }

    @Column(name = "PUBLISHID", length = 8)
    public String getPublishid() {
        return this.publishid;
    }

    public void setPublishid(String publishid) {
        this.publishid = publishid;
    }

    @Column(name = "USERID", length = 8)
    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    @Column(name = "DISABLEDATE", length = 8)
    public String getDisabledate() {
        return this.disabledate;
    }

    public void setDisabledate(String disabledate) {
        this.disabledate = disabledate;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}