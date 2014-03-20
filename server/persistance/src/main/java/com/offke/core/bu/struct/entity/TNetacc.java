package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


/**
 * TNetacc entity.
 */
@Entity
@Table(name = "T_NETACC")
public class TNetacc implements java.io.Serializable {

    // Fields    

    private String accno;
    private String accname;
    private String subjno;
    private String accpwd;
    private Integer custid;
    private Integer stoppayflag;
    private String status;
    private BigDecimal ydaybal;
    private BigDecimal balance;
    private BigDecimal availbal;
    private BigDecimal frozebal;
    private String lasttransdate;
    private String lastaccdate;
    private String opendate;
    private String closedate;
    private String paypwd;
    private Integer failedcnt;
    private String lastlogintime;
    private String lastblocktime;
    private String lastunblocktime;

    // Constructors

    /**
     * default constructor
     */
    public TNetacc() {
    }

    /**
     * minimal constructor
     */
    public TNetacc(String accno) {
        this.accno = accno;
    }

    /**
     * full constructor
     */
    public TNetacc(
            String accno,
            String accname,
            String subjno,
            String accpwd,
            Integer custid,
            Integer stoppayflag,
            String status,
            BigDecimal ydaybal,
            BigDecimal balance,
            BigDecimal availbal,
            BigDecimal frozebal,
            String lasttransdate,
            String lastaccdate,
            String opendate,
            String closedate,
            String paypwd,
            Integer failedcnt,
            String lastlogintime,
            String lastblocktime,
            String lastunblocktime) {
        this.accno = accno;
        this.accname = accname;
        this.subjno = subjno;
        this.accpwd = accpwd;
        this.custid = custid;
        this.stoppayflag = stoppayflag;
        this.status = status;
        this.ydaybal = ydaybal;
        this.balance = balance;
        this.availbal = availbal;
        this.frozebal = frozebal;
        this.lasttransdate = lasttransdate;
        this.lastaccdate = lastaccdate;
        this.opendate = opendate;
        this.closedate = closedate;
        this.paypwd = paypwd;
        this.failedcnt = failedcnt;
        this.lastlogintime = lastlogintime;
        this.lastblocktime = lastblocktime;
        this.lastunblocktime = lastunblocktime;
    }

    // Property accessors
    @Id
    @Column(name = "ACCNO", unique = true, nullable = false, length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "ACCNAME", length = 60)
    public String getAccname() {
        return this.accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    @Column(name = "SUBJNO", length = 6)
    public String getSubjno() {
        return this.subjno;
    }

    public void setSubjno(String subjno) {
        this.subjno = subjno;
    }

    @Column(name = "ACCPWD", length = 64)
    public String getAccpwd() {
        return this.accpwd;
    }

    public void setAccpwd(String accpwd) {
        this.accpwd = accpwd;
    }

    @Column(name = "CUSTID")
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "STOPPAYFLAG")
    public Integer getStoppayflag() {
        return this.stoppayflag;
    }

    public void setStoppayflag(Integer stoppayflag) {
        this.stoppayflag = stoppayflag;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "YDAYBAL", precision = 15)
    public BigDecimal getYdaybal() {
        return this.ydaybal;
    }

    public void setYdaybal(BigDecimal ydaybal) {
        this.ydaybal = ydaybal;
    }

    @Column(name = "BALANCE", precision = 15)
    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Column(name = "AVAILBAL", precision = 15)
    public BigDecimal getAvailbal() {
        return this.availbal;
    }

    public void setAvailbal(BigDecimal availbal) {
        this.availbal = availbal;
    }

    @Column(name = "FROZEBAL", precision = 15)
    public BigDecimal getFrozebal() {
        return this.frozebal;
    }

    public void setFrozebal(BigDecimal frozebal) {
        this.frozebal = frozebal;
    }

    @Column(name = "LASTTRANSDATE", length = 8)
    public String getLasttransdate() {
        return this.lasttransdate;
    }

    public void setLasttransdate(String lasttransdate) {
        this.lasttransdate = lasttransdate;
    }

    @Column(name = "LASTACCDATE", length = 8)
    public String getLastaccdate() {
        return this.lastaccdate;
    }

    public void setLastaccdate(String lastaccdate) {
        this.lastaccdate = lastaccdate;
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

    @Column(name = "PAYPWD", length = 64)
    public String getPaypwd() {
        return this.paypwd;
    }

    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd;
    }

    @Column(name = "FAILEDCNT")
    public Integer getFailedcnt() {
        return this.failedcnt;
    }

    public void setFailedcnt(Integer failedcnt) {
        this.failedcnt = failedcnt;
    }

    @Column(name = "LASTLOGINTIME", length = 14)
    public String getLastlogintime() {
        return this.lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    @Column(name = "LASTBLOCKTIME", length = 14)
    public String getLastblocktime() {
        return this.lastblocktime;
    }

    public void setLastblocktime(String lastblocktime) {
        this.lastblocktime = lastblocktime;
    }

    @Column(name = "LASTUNBLOCKTIME", length = 14)
    public String getLastunblocktime() {
        return this.lastunblocktime;
    }

    public void setLastunblocktime(String lastunblocktime) {
        this.lastunblocktime = lastunblocktime;
    }

}