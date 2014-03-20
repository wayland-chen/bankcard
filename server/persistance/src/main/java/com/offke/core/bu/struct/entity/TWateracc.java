package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


/**
 * TWateracc entity.
 */
@Entity
@Table(name = "T_WATERACC")
public class TWateracc implements java.io.Serializable {

    // Fields    

    private String accno;
    private String accname;
    private String subjno;
    private Integer cardno;
    private Integer status;
    private BigDecimal balance;
    private BigDecimal cardbal;
    private Integer dpscnt;
    private Integer paycnt;
    private String opendate;
    private String closedate;

    // Constructors

    /**
     * default constructor
     */
    public TWateracc() {
    }

    /**
     * minimal constructor
     */
    public TWateracc(String accno) {
        this.accno = accno;
    }

    /**
     * full constructor
     */
    public TWateracc(
            String accno,
            String accname,
            String subjno,
            Integer cardno,
            Integer status,
            BigDecimal balance,
            BigDecimal cardbal,
            Integer dpscnt,
            Integer paycnt,
            String opendate,
            String closedate) {
        this.accno = accno;
        this.accname = accname;
        this.subjno = subjno;
        this.cardno = cardno;
        this.status = status;
        this.balance = balance;
        this.cardbal = cardbal;
        this.dpscnt = dpscnt;
        this.paycnt = paycnt;
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

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "STATUS", precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "BALANCE", precision = 15)
    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Column(name = "CARDBAL", precision = 15)
    public BigDecimal getCardbal() {
        return this.cardbal;
    }

    public void setCardbal(BigDecimal cardbal) {
        this.cardbal = cardbal;
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