package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TPushtask entity.
 */
@Entity
@Table(name = "T_PUSHTASK")
public class TPushtask implements java.io.Serializable {

    // Fields    

    private Integer taskid;
    private Integer taskseq;
    private Integer funcno;
    private Integer funcgroup;
    private Integer sysid;
    private Integer deviceid;
    private String addtime;
    private String begintime;
    private String invalidtime;
    private String exectime;
    private Integer execcnt;
    private Integer maxexec;
    private Integer nextinterval;
    private Integer status;
    private String flag;
    private Integer sendtype;
    private Integer routeid;
    private String contentstr;
    private String retcode;
    private String retmsg;

    // Constructors

    /**
     * default constructor
     */
    public TPushtask() {
    }

    /**
     * minimal constructor
     */
    public TPushtask(Integer taskid) {
        this.taskid = taskid;
    }

    /**
     * full constructor
     */
    public TPushtask(
            Integer taskid,
            Integer taskseq,
            Integer funcno,
            Integer funcgroup,
            Integer sysid,
            Integer deviceid,
            String addtime,
            String begintime,
            String invalidtime,
            String exectime,
            Integer execcnt,
            Integer maxexec,
            Integer nextinterval,
            Integer status,
            String flag,
            Integer sendtype,
            Integer routeid,
            String contentstr,
            String retcode,
            String retmsg) {
        this.taskid = taskid;
        this.taskseq = taskseq;
        this.funcno = funcno;
        this.funcgroup = funcgroup;
        this.sysid = sysid;
        this.deviceid = deviceid;
        this.addtime = addtime;
        this.begintime = begintime;
        this.invalidtime = invalidtime;
        this.exectime = exectime;
        this.execcnt = execcnt;
        this.maxexec = maxexec;
        this.nextinterval = nextinterval;
        this.status = status;
        this.flag = flag;
        this.sendtype = sendtype;
        this.routeid = routeid;
        this.contentstr = contentstr;
        this.retcode = retcode;
        this.retmsg = retmsg;
    }

    // Property accessors
    @Id
    @Column(name = "TASKID", unique = true, nullable = false)
    public Integer getTaskid() {
        return this.taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    @Column(name = "TASKSEQ")
    public Integer getTaskseq() {
        return this.taskseq;
    }

    public void setTaskseq(Integer taskseq) {
        this.taskseq = taskseq;
    }

    @Column(name = "FUNCNO")
    public Integer getFuncno() {
        return this.funcno;
    }

    public void setFuncno(Integer funcno) {
        this.funcno = funcno;
    }

    @Column(name = "FUNCGROUP")
    public Integer getFuncgroup() {
        return this.funcgroup;
    }

    public void setFuncgroup(Integer funcgroup) {
        this.funcgroup = funcgroup;
    }

    @Column(name = "SYSID")
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "DEVICEID")
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "ADDTIME", length = 30)
    public String getAddtime() {
        return this.addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    @Column(name = "BEGINTIME", length = 30)
    public String getBegintime() {
        return this.begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    @Column(name = "INVALIDTIME", length = 30)
    public String getInvalidtime() {
        return this.invalidtime;
    }

    public void setInvalidtime(String invalidtime) {
        this.invalidtime = invalidtime;
    }

    @Column(name = "EXECTIME", length = 30)
    public String getExectime() {
        return this.exectime;
    }

    public void setExectime(String exectime) {
        this.exectime = exectime;
    }

    @Column(name = "EXECCNT")
    public Integer getExeccnt() {
        return this.execcnt;
    }

    public void setExeccnt(Integer execcnt) {
        this.execcnt = execcnt;
    }

    @Column(name = "MAXEXEC")
    public Integer getMaxexec() {
        return this.maxexec;
    }

    public void setMaxexec(Integer maxexec) {
        this.maxexec = maxexec;
    }

    @Column(name = "NEXTINTERVAL")
    public Integer getNextinterval() {
        return this.nextinterval;
    }

    public void setNextinterval(Integer nextinterval) {
        this.nextinterval = nextinterval;
    }

    @Column(name = "STATUS")
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "FLAG", length = 10)
    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Column(name = "SENDTYPE")
    public Integer getSendtype() {
        return this.sendtype;
    }

    public void setSendtype(Integer sendtype) {
        this.sendtype = sendtype;
    }

    @Column(name = "ROUTEID")
    public Integer getRouteid() {
        return this.routeid;
    }

    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }

    @Column(name = "CONTENTSTR", length = 1000)
    public String getContentstr() {
        return this.contentstr;
    }

    public void setContentstr(String contentstr) {
        this.contentstr = contentstr;
    }

    @Column(name = "RETCODE", length = 30)
    public String getRetcode() {
        return this.retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    @Column(name = "RETMSG", length = 240)
    public String getRetmsg() {
        return this.retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

}