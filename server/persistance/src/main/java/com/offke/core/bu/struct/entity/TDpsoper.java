package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TDpsoper entity.
 */
@Entity
@Table(name = "T_DPSOPER")
public class TDpsoper implements java.io.Serializable {

    // Fields    

    private String opercode;
    private String devlimitflag;
    private String shopoperflag;
    private String status;
    private String opendate;
    private String closedate;
    private BigDecimal maxdepositamt;
    private Integer depositcnt;
    private BigDecimal depositamt;
    private String lasttransdate;
    private String lastdevphyid;
    private Integer lastdevseqno;
    private String lastsaved;
    private Integer batchno;
    private Integer authcode;
    private String devphyid;

    // Constructors

    /**
     * default constructor
     */
    public TDpsoper() {
    }

    /**
     * minimal constructor
     */
    public TDpsoper(String opercode) {
        this.opercode = opercode;
    }

    /**
     * full constructor
     */
    public TDpsoper(
            String opercode,
            String devlimitflag,
            String shopoperflag,
            String status,
            String opendate,
            String closedate,
            BigDecimal maxdepositamt,
            Integer depositcnt,
            BigDecimal depositamt,
            String lasttransdate,
            String lastdevphyid,
            Integer lastdevseqno,
            String lastsaved,
            Integer batchno,
            Integer authcode,
            String devphyid) {
        this.opercode = opercode;
        this.devlimitflag = devlimitflag;
        this.shopoperflag = shopoperflag;
        this.status = status;
        this.opendate = opendate;
        this.closedate = closedate;
        this.maxdepositamt = maxdepositamt;
        this.depositcnt = depositcnt;
        this.depositamt = depositamt;
        this.lasttransdate = lasttransdate;
        this.lastdevphyid = lastdevphyid;
        this.lastdevseqno = lastdevseqno;
        this.lastsaved = lastsaved;
        this.batchno = batchno;
        this.authcode = authcode;
        this.devphyid = devphyid;
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

    @Column(name = "DEVLIMITFLAG", length = 1)
    public String getDevlimitflag() {
        return this.devlimitflag;
    }

    public void setDevlimitflag(String devlimitflag) {
        this.devlimitflag = devlimitflag;
    }

    @Column(name = "SHOPOPERFLAG", length = 1)
    public String getShopoperflag() {
        return this.shopoperflag;
    }

    public void setShopoperflag(String shopoperflag) {
        this.shopoperflag = shopoperflag;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Column(name = "MAXDEPOSITAMT", precision = 15)
    public BigDecimal getMaxdepositamt() {
        return this.maxdepositamt;
    }

    public void setMaxdepositamt(BigDecimal maxdepositamt) {
        this.maxdepositamt = maxdepositamt;
    }

    @Column(name = "DEPOSITCNT")
    public Integer getDepositcnt() {
        return this.depositcnt;
    }

    public void setDepositcnt(Integer depositcnt) {
        this.depositcnt = depositcnt;
    }

    @Column(name = "DEPOSITAMT", precision = 15)
    public BigDecimal getDepositamt() {
        return this.depositamt;
    }

    public void setDepositamt(BigDecimal depositamt) {
        this.depositamt = depositamt;
    }

    @Column(name = "LASTTRANSDATE", length = 8)
    public String getLasttransdate() {
        return this.lasttransdate;
    }

    public void setLasttransdate(String lasttransdate) {
        this.lasttransdate = lasttransdate;
    }

    @Column(name = "LASTDEVPHYID", length = 20)
    public String getLastdevphyid() {
        return this.lastdevphyid;
    }

    public void setLastdevphyid(String lastdevphyid) {
        this.lastdevphyid = lastdevphyid;
    }

    @Column(name = "LASTDEVSEQNO")
    public Integer getLastdevseqno() {
        return this.lastdevseqno;
    }

    public void setLastdevseqno(Integer lastdevseqno) {
        this.lastdevseqno = lastdevseqno;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

    @Column(name = "BATCHNO")
    public Integer getBatchno() {
        return this.batchno;
    }

    public void setBatchno(Integer batchno) {
        this.batchno = batchno;
    }

    @Column(name = "AUTHCODE")
    public Integer getAuthcode() {
        return this.authcode;
    }

    public void setAuthcode(Integer authcode) {
        this.authcode = authcode;
    }

    @Column(name = "DEVPHYID", length = 20)
    public String getDevphyid() {
        return this.devphyid;
    }

    public void setDevphyid(String devphyid) {
        this.devphyid = devphyid;
    }

}