package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TInneracc entity.
 */
@Entity
@Table(name = "T_INNERACC")
public class TInneracc implements java.io.Serializable {

    // Fields    

    private String accno;
    private String accname;
    private String subjno;
    private BigDecimal ydaybal;
    private BigDecimal balance;
    private Integer balflag;
    private String lasttransdate;
    private String lastaccdate;

    // Constructors

    /**
     * default constructor
     */
    public TInneracc() {
    }

    /**
     * minimal constructor
     */
    public TInneracc(String accno) {
        this.accno = accno;
    }

    /**
     * full constructor
     */
    public TInneracc(
            String accno,
            String accname,
            String subjno,
            BigDecimal ydaybal,
            BigDecimal balance,
            Integer balflag,
            String lasttransdate,
            String lastaccdate) {
        this.accno = accno;
        this.accname = accname;
        this.subjno = subjno;
        this.ydaybal = ydaybal;
        this.balance = balance;
        this.balflag = balflag;
        this.lasttransdate = lasttransdate;
        this.lastaccdate = lastaccdate;
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

    @Column(name = "BALFLAG", precision = 1, scale = 0)
    public Integer getBalflag() {
        return this.balflag;
    }

    public void setBalflag(Integer balflag) {
        this.balflag = balflag;
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

}