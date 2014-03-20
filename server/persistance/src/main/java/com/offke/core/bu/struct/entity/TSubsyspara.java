package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TSubsyspara entity.
 */
@Entity
@Table(name = "T_SUBSYSPARA")
public class TSubsyspara implements java.io.Serializable {

    // Fields    

    private Integer sysid;
    private String workmode;
    private Integer beatinterval;
    private Integer beatcntlimit;
    private Integer reqbeatfuncno;
    private Integer reqdevfuncno;
    private Integer reqtaskfuncno;
    private Integer respfuncno;
    private Integer exectimeout;
    private Integer colinterval;
    private Integer qryinterval;
    private Integer taskmaxlimit;
    private Integer bccdrtpno;
    private String bccdrtpip;
    private Integer bccdrtpport;
    private Integer bccmainfuncno;
    private Integer bccinterval;

    // Constructors

    /**
     * default constructor
     */
    public TSubsyspara() {
    }

    /**
     * minimal constructor
     */
    public TSubsyspara(Integer sysid) {
        this.sysid = sysid;
    }

    /**
     * full constructor
     */
    public TSubsyspara(
            Integer sysid,
            String workmode,
            Integer beatinterval,
            Integer beatcntlimit,
            Integer reqbeatfuncno,
            Integer reqdevfuncno,
            Integer reqtaskfuncno,
            Integer respfuncno,
            Integer exectimeout,
            Integer colinterval,
            Integer qryinterval,
            Integer taskmaxlimit,
            Integer bccdrtpno,
            String bccdrtpip,
            Integer bccdrtpport,
            Integer bccmainfuncno,
            Integer bccinterval) {
        this.sysid = sysid;
        this.workmode = workmode;
        this.beatinterval = beatinterval;
        this.beatcntlimit = beatcntlimit;
        this.reqbeatfuncno = reqbeatfuncno;
        this.reqdevfuncno = reqdevfuncno;
        this.reqtaskfuncno = reqtaskfuncno;
        this.respfuncno = respfuncno;
        this.exectimeout = exectimeout;
        this.colinterval = colinterval;
        this.qryinterval = qryinterval;
        this.taskmaxlimit = taskmaxlimit;
        this.bccdrtpno = bccdrtpno;
        this.bccdrtpip = bccdrtpip;
        this.bccdrtpport = bccdrtpport;
        this.bccmainfuncno = bccmainfuncno;
        this.bccinterval = bccinterval;
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

    @Column(name = "WORKMODE", length = 1)
    public String getWorkmode() {
        return this.workmode;
    }

    public void setWorkmode(String workmode) {
        this.workmode = workmode;
    }

    @Column(name = "BEATINTERVAL")
    public Integer getBeatinterval() {
        return this.beatinterval;
    }

    public void setBeatinterval(Integer beatinterval) {
        this.beatinterval = beatinterval;
    }

    @Column(name = "BEATCNTLIMIT")
    public Integer getBeatcntlimit() {
        return this.beatcntlimit;
    }

    public void setBeatcntlimit(Integer beatcntlimit) {
        this.beatcntlimit = beatcntlimit;
    }

    @Column(name = "REQBEATFUNCNO")
    public Integer getReqbeatfuncno() {
        return this.reqbeatfuncno;
    }

    public void setReqbeatfuncno(Integer reqbeatfuncno) {
        this.reqbeatfuncno = reqbeatfuncno;
    }

    @Column(name = "REQDEVFUNCNO")
    public Integer getReqdevfuncno() {
        return this.reqdevfuncno;
    }

    public void setReqdevfuncno(Integer reqdevfuncno) {
        this.reqdevfuncno = reqdevfuncno;
    }

    @Column(name = "REQTASKFUNCNO")
    public Integer getReqtaskfuncno() {
        return this.reqtaskfuncno;
    }

    public void setReqtaskfuncno(Integer reqtaskfuncno) {
        this.reqtaskfuncno = reqtaskfuncno;
    }

    @Column(name = "RESPFUNCNO")
    public Integer getRespfuncno() {
        return this.respfuncno;
    }

    public void setRespfuncno(Integer respfuncno) {
        this.respfuncno = respfuncno;
    }

    @Column(name = "EXECTIMEOUT")
    public Integer getExectimeout() {
        return this.exectimeout;
    }

    public void setExectimeout(Integer exectimeout) {
        this.exectimeout = exectimeout;
    }

    @Column(name = "COLINTERVAL")
    public Integer getColinterval() {
        return this.colinterval;
    }

    public void setColinterval(Integer colinterval) {
        this.colinterval = colinterval;
    }

    @Column(name = "QRYINTERVAL")
    public Integer getQryinterval() {
        return this.qryinterval;
    }

    public void setQryinterval(Integer qryinterval) {
        this.qryinterval = qryinterval;
    }

    @Column(name = "TASKMAXLIMIT")
    public Integer getTaskmaxlimit() {
        return this.taskmaxlimit;
    }

    public void setTaskmaxlimit(Integer taskmaxlimit) {
        this.taskmaxlimit = taskmaxlimit;
    }

    @Column(name = "BCCDRTPNO")
    public Integer getBccdrtpno() {
        return this.bccdrtpno;
    }

    public void setBccdrtpno(Integer bccdrtpno) {
        this.bccdrtpno = bccdrtpno;
    }

    @Column(name = "BCCDRTPIP", length = 15)
    public String getBccdrtpip() {
        return this.bccdrtpip;
    }

    public void setBccdrtpip(String bccdrtpip) {
        this.bccdrtpip = bccdrtpip;
    }

    @Column(name = "BCCDRTPPORT")
    public Integer getBccdrtpport() {
        return this.bccdrtpport;
    }

    public void setBccdrtpport(Integer bccdrtpport) {
        this.bccdrtpport = bccdrtpport;
    }

    @Column(name = "BCCMAINFUNCNO")
    public Integer getBccmainfuncno() {
        return this.bccmainfuncno;
    }

    public void setBccmainfuncno(Integer bccmainfuncno) {
        this.bccmainfuncno = bccmainfuncno;
    }

    @Column(name = "BCCINTERVAL")
    public Integer getBccinterval() {
        return this.bccinterval;
    }

    public void setBccinterval(Integer bccinterval) {
        this.bccinterval = bccinterval;
    }

}