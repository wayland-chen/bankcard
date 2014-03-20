package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TOperator entity.
 */
@Entity
@Table(name = "T_OPERATOR")
public class TOperator implements java.io.Serializable {

    // Fields    

    private String opercode;
    private String opertype;
    private Integer branchno;
    private Integer cardno;
    private String opername;
    private String tel;
    private String mobile;
    private String email;
    private String addr;
    private String zipcode;
    private String operpwd;
    private String status;
    private String lasttransdate;
    private String menuset;
    private String funcset;
    private String sitelimit;
    private String loginflag;
    private Integer loginsiteno;
    private String logintime;
    private String logouttime;
    private Integer failnumber;
    private String opendate;
    private String closedate;
    private Integer rightflag;

    // Constructors

    /**
     * default constructor
     */
    public TOperator() {
    }

    /**
     * minimal constructor
     */
    public TOperator(String opercode, String opername) {
        this.opercode = opercode;
        this.opername = opername;
    }

    /**
     * full constructor
     */
    public TOperator(
            String opercode,
            String opertype,
            Integer branchno,
            Integer cardno,
            String opername,
            String tel,
            String mobile,
            String email,
            String addr,
            String zipcode,
            String operpwd,
            String status,
            String lasttransdate,
            String menuset,
            String funcset,
            String sitelimit,
            String loginflag,
            Integer loginsiteno,
            String logintime,
            String logouttime,
            Integer failnumber,
            String opendate,
            String closedate,
            Integer rightflag) {
        this.opercode = opercode;
        this.opertype = opertype;
        this.branchno = branchno;
        this.cardno = cardno;
        this.opername = opername;
        this.tel = tel;
        this.mobile = mobile;
        this.email = email;
        this.addr = addr;
        this.zipcode = zipcode;
        this.operpwd = operpwd;
        this.status = status;
        this.lasttransdate = lasttransdate;
        this.menuset = menuset;
        this.funcset = funcset;
        this.sitelimit = sitelimit;
        this.loginflag = loginflag;
        this.loginsiteno = loginsiteno;
        this.logintime = logintime;
        this.logouttime = logouttime;
        this.failnumber = failnumber;
        this.opendate = opendate;
        this.closedate = closedate;
        this.rightflag = rightflag;
    }

    // Property accessors
    @Id
    @Column(name = "OPERCODE", unique = true, nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "OPERTYPE", length = 1)
    public String getOpertype() {
        return this.opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype;
    }

    @Column(name = "BRANCHNO")
    public Integer getBranchno() {
        return this.branchno;
    }

    public void setBranchno(Integer branchno) {
        this.branchno = branchno;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "OPERNAME", nullable = false, length = 60)
    public String getOpername() {
        return this.opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    @Column(name = "TEL", length = 30)
    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Column(name = "MOBILE", length = 30)
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name = "EMAIL", length = 60)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "ADDR", length = 240)
    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Column(name = "ZIPCODE", length = 6)
    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Column(name = "OPERPWD", length = 32)
    public String getOperpwd() {
        return this.operpwd;
    }

    public void setOperpwd(String operpwd) {
        this.operpwd = operpwd;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "LASTTRANSDATE", length = 8)
    public String getLasttransdate() {
        return this.lasttransdate;
    }

    public void setLasttransdate(String lasttransdate) {
        this.lasttransdate = lasttransdate;
    }

    @Column(name = "MENUSET", length = 800)
    public String getMenuset() {
        return this.menuset;
    }

    public void setMenuset(String menuset) {
        this.menuset = menuset;
    }

    @Column(name = "FUNCSET", length = 600)
    public String getFuncset() {
        return this.funcset;
    }

    public void setFuncset(String funcset) {
        this.funcset = funcset;
    }

    @Column(name = "SITELIMIT", length = 1)
    public String getSitelimit() {
        return this.sitelimit;
    }

    public void setSitelimit(String sitelimit) {
        this.sitelimit = sitelimit;
    }

    @Column(name = "LOGINFLAG", length = 1)
    public String getLoginflag() {
        return this.loginflag;
    }

    public void setLoginflag(String loginflag) {
        this.loginflag = loginflag;
    }

    @Column(name = "LOGINSITENO")
    public Integer getLoginsiteno() {
        return this.loginsiteno;
    }

    public void setLoginsiteno(Integer loginsiteno) {
        this.loginsiteno = loginsiteno;
    }

    @Column(name = "LOGINTIME", length = 30)
    public String getLogintime() {
        return this.logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    @Column(name = "LOGOUTTIME", length = 30)
    public String getLogouttime() {
        return this.logouttime;
    }

    public void setLogouttime(String logouttime) {
        this.logouttime = logouttime;
    }

    @Column(name = "FAILNUMBER")
    public Integer getFailnumber() {
        return this.failnumber;
    }

    public void setFailnumber(Integer failnumber) {
        this.failnumber = failnumber;
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

    @Column(name = "RIGHTFLAG", precision = 1, scale = 0)
    public Integer getRightflag() {
        return this.rightflag;
    }

    public void setRightflag(Integer rightflag) {
        this.rightflag = rightflag;
    }

}