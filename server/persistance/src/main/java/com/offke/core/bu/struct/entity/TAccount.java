package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 账户表
 *
 * @version 1.0
 */
@Entity
@Table(name = "T_ACCOUNT")
public class TAccount implements java.io.Serializable {

    // Fields    

    private String accno;
    private String accname;
    private String subjno;
    private String accpwd;
    private Integer custid;
    private Integer cardno;
    private Integer purseno;
    private BigDecimal singlemaxamt;
    private BigDecimal daycostmaxamt;
    private BigDecimal daycostamt;
    private BigDecimal cardmaxbal;
    private String status;
    private BigDecimal foregift;
    private BigDecimal ydaybal;
    private BigDecimal balance;
    private BigDecimal availbal;
    private BigDecimal frozebal;
    private BigDecimal subsidybal;
    private Integer subsidyno;
    private BigDecimal cardbal;
    private Integer cardcnt;
    private Integer dpscnt;
    private Integer paycnt;
    private BigDecimal lastsubsidyamt;
    private Integer lastsubsidyno;
    private BigDecimal lastcardbal;
    private Integer lastcardcnt;
    private Integer lastdpscnt;
    private Integer lastpaycnt;
    private String lasttransdate;
    private String lastaccdate;
    private String opendate;
    private String closedate;
    private Integer termid;
    private String transtime;

    // Constructors

    /**
     * default constructor
     */
    public TAccount() {
    }

    /**
     * minimal constructor
     */
    public TAccount(String accno) {
        this.accno = accno;
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

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "PURSENO")
    public Integer getPurseno() {
        return this.purseno;
    }

    public void setPurseno(Integer purseno) {
        this.purseno = purseno;
    }

    @Column(name = "SINGLEMAXAMT")
    public BigDecimal getSinglemaxamt() {
        return this.singlemaxamt;
    }

    public void setSinglemaxamt(BigDecimal singlemaxamt) {
        this.singlemaxamt = singlemaxamt;
    }

    @Column(name = "DAYCOSTMAXAMT")
    public BigDecimal getDaycostmaxamt() {
        return this.daycostmaxamt;
    }

    public void setDaycostmaxamt(BigDecimal daycostmaxamt) {
        this.daycostmaxamt = daycostmaxamt;
    }

    @Column(name = "DAYCOSTAMT")
    public BigDecimal getDaycostamt() {
        return this.daycostamt;
    }

    public void setDaycostamt(BigDecimal daycostamt) {
        this.daycostamt = daycostamt;
    }

    @Column(name = "CARDMAXBAL")
    public BigDecimal getCardmaxbal() {
        return this.cardmaxbal;
    }

    public void setCardmaxbal(BigDecimal cardmaxbal) {
        this.cardmaxbal = cardmaxbal;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "FOREGIFT")
    public BigDecimal getForegift() {
        return this.foregift;
    }

    public void setForegift(BigDecimal foregift) {
        this.foregift = foregift;
    }

    @Column(name = "YDAYBAL")
    public BigDecimal getYdaybal() {
        return this.ydaybal;
    }

    public void setYdaybal(BigDecimal ydaybal) {
        this.ydaybal = ydaybal;
    }

    @Column(name = "BALANCE")
    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Column(name = "AVAILBAL")
    public BigDecimal getAvailbal() {
        return this.availbal;
    }

    public void setAvailbal(BigDecimal availbal) {
        this.availbal = availbal;
    }

    @Column(name = "FROZEBAL")
    public BigDecimal getFrozebal() {
        return this.frozebal;
    }

    public void setFrozebal(BigDecimal frozebal) {
        this.frozebal = frozebal;
    }

    @Column(name = "SUBSIDYBAL")
    public BigDecimal getSubsidybal() {
        return this.subsidybal;
    }

    public void setSubsidybal(BigDecimal subsidybal) {
        this.subsidybal = subsidybal;
    }

    @Column(name = "SUBSIDYNO")
    public Integer getSubsidyno() {
        return this.subsidyno;
    }

    public void setSubsidyno(Integer subsidyno) {
        this.subsidyno = subsidyno;
    }

    @Column(name = "CARDBAL")
    public BigDecimal getCardbal() {
        return this.cardbal;
    }

    public void setCardbal(BigDecimal cardbal) {
        this.cardbal = cardbal;
    }

    @Column(name = "CARDCNT")
    public Integer getCardcnt() {
        return this.cardcnt;
    }

    public void setCardcnt(Integer cardcnt) {
        this.cardcnt = cardcnt;
    }

    @Column(name = "DPSCNT")
    public Integer getDpscnt() {
        return this.dpscnt;
    }

    public void setDpscnt(Integer dpscnt) {
        this.dpscnt = dpscnt;
    }

    @Column(name = "PAYCNT")
    public Integer getPaycnt() {
        return this.paycnt;
    }

    public void setPaycnt(Integer paycnt) {
        this.paycnt = paycnt;
    }

    @Column(name = "LASTSUBSIDYAMT")
    public BigDecimal getLastsubsidyamt() {
        return this.lastsubsidyamt;
    }

    public void setLastsubsidyamt(BigDecimal lastsubsidyamt) {
        this.lastsubsidyamt = lastsubsidyamt;
    }

    @Column(name = "LASTSUBSIDYNO")
    public Integer getLastsubsidyno() {
        return this.lastsubsidyno;
    }

    public void setLastsubsidyno(Integer lastsubsidyno) {
        this.lastsubsidyno = lastsubsidyno;
    }

    @Column(name = "LASTCARDBAL")
    public BigDecimal getLastcardbal() {
        return this.lastcardbal;
    }

    public void setLastcardbal(BigDecimal lastcardbal) {
        this.lastcardbal = lastcardbal;
    }

    @Column(name = "LASTCARDCNT")
    public Integer getLastcardcnt() {
        return this.lastcardcnt;
    }

    public void setLastcardcnt(Integer lastcardcnt) {
        this.lastcardcnt = lastcardcnt;
    }

    @Column(name = "LASTDPSCNT")
    public Integer getLastdpscnt() {
        return this.lastdpscnt;
    }

    public void setLastdpscnt(Integer lastdpscnt) {
        this.lastdpscnt = lastdpscnt;
    }

    @Column(name = "LASTPAYCNT")
    public Integer getLastpaycnt() {
        return this.lastpaycnt;
    }

    public void setLastpaycnt(Integer lastpaycnt) {
        this.lastpaycnt = lastpaycnt;
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

    @Column(name = "TERMID")
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "TRANSTIME", length = 14)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

}