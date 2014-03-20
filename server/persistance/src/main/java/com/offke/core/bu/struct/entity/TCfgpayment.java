package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_CFGPAYMENT")
public class TCfgpayment implements java.io.Serializable {

    // Fields    

    private Integer paycode;
    private String summary;
    private Integer enabled;
    private Integer onlinepay;
    private Integer paychkflag;
    private Integer payeeacctype;
    private Integer shopid;
    private Integer bccfuncno;
    private Integer bccdrtpno;
    private String ip;
    private Integer port;
    private Integer timeout;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TCfgpayment() {
    }

    /**
     * minimal constructor
     */
    public TCfgpayment(
            Integer paycode,
            String summary,
            Integer enabled,
            Integer onlinepay,
            Integer paychkflag,
            Integer payeeacctype,
            Integer shopid) {
        this.paycode = paycode;
        this.summary = summary;
        this.enabled = enabled;
        this.onlinepay = onlinepay;
        this.paychkflag = paychkflag;
        this.payeeacctype = payeeacctype;
        this.shopid = shopid;
    }

    /**
     * full constructor
     */
    public TCfgpayment(
            Integer paycode,
            String summary,
            Integer enabled,
            Integer onlinepay,
            Integer paychkflag,
            Integer payeeacctype,
            Integer shopid,
            Integer bccfuncno,
            Integer bccdrtpno,
            String ip,
            Integer port,
            Integer timeout,
            String lastsaved) {
        this.paycode = paycode;
        this.summary = summary;
        this.enabled = enabled;
        this.onlinepay = onlinepay;
        this.paychkflag = paychkflag;
        this.payeeacctype = payeeacctype;
        this.shopid = shopid;
        this.bccfuncno = bccfuncno;
        this.bccdrtpno = bccdrtpno;
        this.ip = ip;
        this.port = port;
        this.timeout = timeout;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "PAYCODE", unique = true, nullable = false)
    public Integer getPaycode() {
        return this.paycode;
    }

    public void setPaycode(Integer paycode) {
        this.paycode = paycode;
    }

    @Column(name = "SUMMARY", nullable = false, length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "ENABLED", nullable = false, precision = 1, scale = 0)
    public Integer getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Column(name = "ONLINEPAY", nullable = false, precision = 1, scale = 0)
    public Integer getOnlinepay() {
        return this.onlinepay;
    }

    public void setOnlinepay(Integer onlinepay) {
        this.onlinepay = onlinepay;
    }

    @Column(name = "PAYCHKFLAG", nullable = false, precision = 1, scale = 0)
    public Integer getPaychkflag() {
        return this.paychkflag;
    }

    public void setPaychkflag(Integer paychkflag) {
        this.paychkflag = paychkflag;
    }

    @Column(name = "PAYEEACCTYPE", nullable = false, precision = 1, scale = 0)
    public Integer getPayeeacctype() {
        return this.payeeacctype;
    }

    public void setPayeeacctype(Integer payeeacctype) {
        this.payeeacctype = payeeacctype;
    }

    @Column(name = "SHOPID", nullable = false)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "BCCFUNCNO")
    public Integer getBccfuncno() {
        return this.bccfuncno;
    }

    public void setBccfuncno(Integer bccfuncno) {
        this.bccfuncno = bccfuncno;
    }

    @Column(name = "BCCDRTPNO")
    public Integer getBccdrtpno() {
        return this.bccdrtpno;
    }

    public void setBccdrtpno(Integer bccdrtpno) {
        this.bccdrtpno = bccdrtpno;
    }

    @Column(name = "IP", length = 15)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "PORT")
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Column(name = "TIMEOUT")
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}