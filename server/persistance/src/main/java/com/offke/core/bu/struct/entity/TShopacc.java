package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


/**
 * TShopacc entity.
 */
@Entity
@Table(name = "T_SHOPACC")
public class TShopacc implements java.io.Serializable {

    // Fields    

    private String accno;
    private Integer shopid;
    private String accname;
    private String subjno;
    private String accpwd;
    private String status;
    private BigDecimal ydaybal;
    private BigDecimal balance;
    private BigDecimal availbal;
    private BigDecimal frozebal;
    private String lasttransdate;
    private String lastaccdate;
    private String opendate;
    private String closedate;

    // Constructors

    /**
     * default constructor
     */
    public TShopacc() {
    }

    /**
     * minimal constructor
     */
    public TShopacc(String accno, Integer shopid) {
        this.accno = accno;
        this.shopid = shopid;
    }

    /**
     * full constructor
     */
    public TShopacc(
            String accno,
            Integer shopid,
            String accname,
            String subjno,
            String accpwd,
            String status,
            BigDecimal ydaybal,
            BigDecimal balance,
            BigDecimal availbal,
            BigDecimal frozebal,
            String lasttransdate,
            String lastaccdate,
            String opendate,
            String closedate) {
        this.accno = accno;
        this.shopid = shopid;
        this.accname = accname;
        this.subjno = subjno;
        this.accpwd = accpwd;
        this.status = status;
        this.ydaybal = ydaybal;
        this.balance = balance;
        this.availbal = availbal;
        this.frozebal = frozebal;
        this.lasttransdate = lasttransdate;
        this.lastaccdate = lastaccdate;
        this.opendate = opendate;
        this.closedate = closedate;
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

    @Column(name = "SHOPID", nullable = false)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
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

}