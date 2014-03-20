package com.offke.core.bu.struct.entity;

import com.offke.core.common.util.Procadapter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_BMSG")
public class TBmsg implements java.io.Serializable {

    // Fields    

    private String msgid;
    private String amsgid;
    private String tradecode;
    private Integer msglevel;
    private Integer deviceid;
    private Date createdtime;
    private Date expirationtime;
    private Date starttime;
    private Date endtime;
    private Integer sleep;
    private Date nextstime;
    private String reqdata;
    private String filepath;
    private String respata;
    private Integer maxsendcnt;
    private Integer sendcnt;
    private Integer status;

    private Procadapter downbuffer;


    // Constructors

    /**
     * default constructor
     */
    public TBmsg() {
    }

    /**
     * minimal constructor
     */
    public TBmsg(
            String msgid,
            String tradecode,
            Integer msglevel,
            Date createdtime,
            Integer sleep,
            String reqdata,
            Integer status) {
        this.msgid = msgid;
        this.tradecode = tradecode;
        this.msglevel = msglevel;
        this.createdtime = createdtime;
        this.sleep = sleep;
        this.reqdata = reqdata;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TBmsg(
            String msgid,
            String tradecode,
            Integer msglevel,
            Integer deviceid,
            Date createdtime,
            Date expirationtime,
            Date starttime,
            Date endtime,
            Integer sleep,
            Date nextstime,
            String reqdata,
            String respata,
            Integer maxsendcnt,
            Integer sendcnt,
            Integer status
    ) {
        this.msgid = msgid;
        this.tradecode = tradecode;
        this.msglevel = msglevel;
        this.deviceid = deviceid;
        this.createdtime = createdtime;
        this.expirationtime = expirationtime;
        this.starttime = starttime;
        this.endtime = endtime;
        this.sleep = sleep;
        this.nextstime = nextstime;
        this.reqdata = reqdata;
        this.respata = respata;
        this.maxsendcnt = maxsendcnt;
        this.sendcnt = sendcnt;
        this.status = status;
    }

    // Property accessors
    @Id
    @Column(name = "MSGID", unique = true, nullable = false, length = 24)
    public String getMsgid() {
        return this.msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public void setAmsgid(String amsgid) {
        this.amsgid = amsgid;
    }


    public String getAmsgid() {
        return amsgid;
    }

    @Column(name = "TRADECODE", nullable = false, length = 10)
    public String getTradecode() {
        return this.tradecode;
    }

    public void setTradecode(String tradecode) {
        this.tradecode = tradecode;
    }

    @Column(name = "MSGLEVEL", nullable = false, precision = 22, scale = 0)
    public Integer getMsglevel() {
        return this.msglevel;
    }

    public void setMsglevel(Integer msglevel) {
        this.msglevel = msglevel;
    }

    @Column(name = "DEVICEID", precision = 22, scale = 0)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATEDTIME", nullable = false, length = 7)
    public Date getCreatedtime() {
        return this.createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "EXPIRATIONTIME", length = 7)
    public Date getExpirationtime() {
        return this.expirationtime;
    }

    public void setExpirationtime(Date expirationtime) {
        this.expirationtime = expirationtime;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "STARTTIME", length = 7)
    public Date getStarttime() {
        return this.starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ENDTIME", length = 7)
    public Date getEndtime() {
        return this.endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Column(name = "SLEEP", nullable = false, precision = 22, scale = 0)
    public Integer getSleep() {
        return this.sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "NEXTSTIME", length = 7)
    public Date getNextstime() {
        return this.nextstime;
    }

    public void setNextstime(Date nextstime) {
        this.nextstime = nextstime;
    }

    @Column(name = "REQDATA", nullable = false, length = 2048)
    public String getReqdata() {
        return this.reqdata;
    }

    public void setReqdata(String reqdata) {
        this.reqdata = reqdata;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilepath() {
        return filepath;
    }

    @Column(name = "RESPATA", length = 2048)
    public String getRespata() {
        return this.respata;
    }

    public void setRespata(String respata) {
        this.respata = respata;
    }

    @Column(name = "MAXSENDCNT", precision = 22, scale = 0)
    public Integer getMaxsendcnt() {
        return this.maxsendcnt;
    }

    public void setMaxsendcnt(Integer maxsendcnt) {
        this.maxsendcnt = maxsendcnt;
    }

    @Column(name = "SENDCNT", precision = 22, scale = 0)
    public Integer getSendcnt() {
        return this.sendcnt;
    }

    public void setSendcnt(Integer sendcnt) {
        this.sendcnt = sendcnt;
    }

    @Column(name = "STATUS", nullable = false, precision = 22, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setDownbuffer(Procadapter downbuffer) {
        this.downbuffer = downbuffer;
    }

    @Transient
    public Procadapter getDownbuffer() {
        return downbuffer;
    }


}