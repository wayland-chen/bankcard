package com.offke.core.bu.struct.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_BANK", uniqueConstraints = @UniqueConstraint(columnNames = "BANKCODE"))
public class TBank implements java.io.Serializable {

    // Fields    

    private Integer bankid;
    private Integer frontid;
    private String bankcode;
    private String bankname;
    private Boolean useflag;
    private Boolean chkacclag;
    private String svrbegintime;
    private String svrendtime;
    private String bankip;
    private Integer bankport;
    private Byte banktimeout;
    private String chktype;
    private Integer chkbegindate;
    private Integer lastchkdate;
    private String chkbegintime;
    private String cvtexecfile;
    private String chkexecfile;
    private Boolean autoresolve;
    private String getbankfile;

    // Constructors

    /**
     * default constructor
     */
    public TBank() {
    }

    /**
     * minimal constructor
     */
    public TBank(Integer bankid, String bankcode, String bankname, Boolean useflag) {
        this.bankid = bankid;
        this.bankcode = bankcode;
        this.bankname = bankname;
        this.useflag = useflag;
    }

    /**
     * full constructor
     */
    public TBank(
            Integer bankid,
            Integer frontid,
            String bankcode,
            String bankname,
            Boolean useflag,
            Boolean chkacclag,
            String svrbegintime,
            String svrendtime,
            String bankip,
            Integer bankport,
            Byte banktimeout,
            String chktype,
            Integer chkbegindate,
            Integer lastchkdate,
            String chkbegintime,
            String cvtexecfile,
            String chkexecfile,
            Boolean autoresolve,
            String getbankfile) {
        this.bankid = bankid;
        this.frontid = frontid;
        this.bankcode = bankcode;
        this.bankname = bankname;
        this.useflag = useflag;
        this.chkacclag = chkacclag;
        this.svrbegintime = svrbegintime;
        this.svrendtime = svrendtime;
        this.bankip = bankip;
        this.bankport = bankport;
        this.banktimeout = banktimeout;
        this.chktype = chktype;
        this.chkbegindate = chkbegindate;
        this.lastchkdate = lastchkdate;
        this.chkbegintime = chkbegintime;
        this.cvtexecfile = cvtexecfile;
        this.chkexecfile = chkexecfile;
        this.autoresolve = autoresolve;
        this.getbankfile = getbankfile;
    }

    // Property accessors
    @Id
    @Column(name = "BANKID", unique = true, nullable = false)
    public Integer getBankid() {
        return this.bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    @Column(name = "FRONTID")
    public Integer getFrontid() {
        return this.frontid;
    }

    public void setFrontid(Integer frontid) {
        this.frontid = frontid;
    }

    @Column(name = "BANKCODE", unique = true, nullable = false, length = 8)
    public String getBankcode() {
        return this.bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Column(name = "BANKNAME", nullable = false, length = 60)
    public String getBankname() {
        return this.bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Column(name = "USEFLAG", nullable = false, precision = 1, scale = 0)
    public Boolean getUseflag() {
        return this.useflag;
    }

    public void setUseflag(Boolean useflag) {
        this.useflag = useflag;
    }

    @Column(name = "CHKACCLAG", precision = 1, scale = 0)
    public Boolean getChkacclag() {
        return this.chkacclag;
    }

    public void setChkacclag(Boolean chkacclag) {
        this.chkacclag = chkacclag;
    }

    @Column(name = "SVRBEGINTIME", length = 6)
    public String getSvrbegintime() {
        return this.svrbegintime;
    }

    public void setSvrbegintime(String svrbegintime) {
        this.svrbegintime = svrbegintime;
    }

    @Column(name = "SVRENDTIME", length = 6)
    public String getSvrendtime() {
        return this.svrendtime;
    }

    public void setSvrendtime(String svrendtime) {
        this.svrendtime = svrendtime;
    }

    @Column(name = "BANKIP", length = 15)
    public String getBankip() {
        return this.bankip;
    }

    public void setBankip(String bankip) {
        this.bankip = bankip;
    }

    @Column(name = "BANKPORT")
    public Integer getBankport() {
        return this.bankport;
    }

    public void setBankport(Integer bankport) {
        this.bankport = bankport;
    }

    @Column(name = "BANKTIMEOUT", precision = 2, scale = 0)
    public Byte getBanktimeout() {
        return this.banktimeout;
    }

    public void setBanktimeout(Byte banktimeout) {
        this.banktimeout = banktimeout;
    }

    @Column(name = "CHKTYPE", length = 1)
    public String getChktype() {
        return this.chktype;
    }

    public void setChktype(String chktype) {
        this.chktype = chktype;
    }

    @Column(name = "CHKBEGINDATE", precision = 8, scale = 0)
    public Integer getChkbegindate() {
        return this.chkbegindate;
    }

    public void setChkbegindate(Integer chkbegindate) {
        this.chkbegindate = chkbegindate;
    }

    @Column(name = "LASTCHKDATE", precision = 8, scale = 0)
    public Integer getLastchkdate() {
        return this.lastchkdate;
    }

    public void setLastchkdate(Integer lastchkdate) {
        this.lastchkdate = lastchkdate;
    }

    @Column(name = "CHKBEGINTIME", length = 6)
    public String getChkbegintime() {
        return this.chkbegintime;
    }

    public void setChkbegintime(String chkbegintime) {
        this.chkbegintime = chkbegintime;
    }

    @Column(name = "CVTEXECFILE", length = 240)
    public String getCvtexecfile() {
        return this.cvtexecfile;
    }

    public void setCvtexecfile(String cvtexecfile) {
        this.cvtexecfile = cvtexecfile;
    }

    @Column(name = "CHKEXECFILE", length = 240)
    public String getChkexecfile() {
        return this.chkexecfile;
    }

    public void setChkexecfile(String chkexecfile) {
        this.chkexecfile = chkexecfile;
    }

    @Column(name = "AUTORESOLVE", precision = 1, scale = 0)
    public Boolean getAutoresolve() {
        return this.autoresolve;
    }

    public void setAutoresolve(Boolean autoresolve) {
        this.autoresolve = autoresolve;
    }

    @Column(name = "GETBANKFILE", length = 1)
    public String getGetbankfile() {
        return this.getbankfile;
    }

    public void setGetbankfile(String getbankfile) {
        this.getbankfile = getbankfile;
    }

}