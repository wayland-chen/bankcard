package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_CFGBANK")
public class TCfgbank implements java.io.Serializable {

    // Fields    

    private String bankcode;
    private String bankname;
    private String bankstarttime;
    private String bankendtime;
    private String bankip;
    private Integer bankport;
    private Integer banktimeout;
    private Integer bccdrtpno;
    private Integer bccfuncno;
    private Integer bcctimeout;
    private Integer qrycardflag;

    // Constructors

    /**
     * default constructor
     */
    public TCfgbank() {
    }

    /**
     * minimal constructor
     */
    public TCfgbank(String bankcode) {
        this.bankcode = bankcode;
    }

    /**
     * full constructor
     */
    public TCfgbank(
            String bankcode,
            String bankname,
            String bankstarttime,
            String bankendtime,
            String bankip,
            Integer bankport,
            Integer banktimeout,
            Integer bccdrtpno,
            Integer bccfuncno,
            Integer bcctimeout,
            Integer qrycardflag) {
        this.bankcode = bankcode;
        this.bankname = bankname;
        this.bankstarttime = bankstarttime;
        this.bankendtime = bankendtime;
        this.bankip = bankip;
        this.bankport = bankport;
        this.banktimeout = banktimeout;
        this.bccdrtpno = bccdrtpno;
        this.bccfuncno = bccfuncno;
        this.bcctimeout = bcctimeout;
        this.qrycardflag = qrycardflag;
    }

    // Property accessors
    @Id
    @Column(name = "BANKCODE", unique = true, nullable = false, length = 2)
    public String getBankcode() {
        return this.bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Column(name = "BANKNAME", length = 30)
    public String getBankname() {
        return this.bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Column(name = "BANKSTARTTIME", length = 6)
    public String getBankstarttime() {
        return this.bankstarttime;
    }

    public void setBankstarttime(String bankstarttime) {
        this.bankstarttime = bankstarttime;
    }

    @Column(name = "BANKENDTIME", length = 6)
    public String getBankendtime() {
        return this.bankendtime;
    }

    public void setBankendtime(String bankendtime) {
        this.bankendtime = bankendtime;
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

    @Column(name = "BANKTIMEOUT")
    public Integer getBanktimeout() {
        return this.banktimeout;
    }

    public void setBanktimeout(Integer banktimeout) {
        this.banktimeout = banktimeout;
    }

    @Column(name = "BCCDRTPNO")
    public Integer getBccdrtpno() {
        return this.bccdrtpno;
    }

    public void setBccdrtpno(Integer bccdrtpno) {
        this.bccdrtpno = bccdrtpno;
    }

    @Column(name = "BCCFUNCNO")
    public Integer getBccfuncno() {
        return this.bccfuncno;
    }

    public void setBccfuncno(Integer bccfuncno) {
        this.bccfuncno = bccfuncno;
    }

    @Column(name = "BCCTIMEOUT")
    public Integer getBcctimeout() {
        return this.bcctimeout;
    }

    public void setBcctimeout(Integer bcctimeout) {
        this.bcctimeout = bcctimeout;
    }

    @Column(name = "QRYCARDFLAG", precision = 1, scale = 0)
    public Integer getQrycardflag() {
        return this.qrycardflag;
    }

    public void setQrycardflag(Integer qrycardflag) {
        this.qrycardflag = qrycardflag;
    }

}