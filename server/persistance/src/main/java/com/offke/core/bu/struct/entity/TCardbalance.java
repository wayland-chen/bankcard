package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TCardbalance entity.
 */
@Entity
@Table(name = "T_CARDBALANCE")
public class TCardbalance implements java.io.Serializable {

    // Fields    

    private TCardbalanceId id;
    private Integer cardno;
    private Integer oldcardno;
    private String transdate;
    private String transtime;
    private Integer dpscnt;
    private Integer paycnt;
    private BigDecimal balance;
    private BigDecimal cardbal;
    private BigDecimal accumdpsamt;

    // Constructors

    /**
     * default constructor
     */
    public TCardbalance() {
    }

    /**
     * minimal constructor
     */
    public TCardbalance(TCardbalanceId id, Integer cardno, Integer dpscnt, BigDecimal cardbal) {
        this.id = id;
        this.cardno = cardno;
        this.dpscnt = dpscnt;
        this.cardbal = cardbal;
    }

    /**
     * full constructor
     */
    public TCardbalance(
            TCardbalanceId id,
            Integer cardno,
            Integer oldcardno,
            String transdate,
            String transtime,
            Integer dpscnt,
            Integer paycnt,
            BigDecimal balance,
            BigDecimal cardbal,
            BigDecimal accumdpsamt) {
        this.id = id;
        this.cardno = cardno;
        this.oldcardno = oldcardno;
        this.transdate = transdate;
        this.transtime = transtime;
        this.dpscnt = dpscnt;
        this.paycnt = paycnt;
        this.balance = balance;
        this.cardbal = cardbal;
        this.accumdpsamt = accumdpsamt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10)),
            @AttributeOverride(name = "pursetype", column = @Column(name = "PURSETYPE", nullable = false, precision = 1, scale = 0))})
    public TCardbalanceId getId() {
        return this.id;
    }

    public void setId(TCardbalanceId id) {
        this.id = id;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "OLDCARDNO")
    public Integer getOldcardno() {
        return this.oldcardno;
    }

    public void setOldcardno(Integer oldcardno) {
        this.oldcardno = oldcardno;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "DPSCNT", nullable = false)
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

    @Column(name = "BALANCE", precision = 15)
    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Column(name = "CARDBAL", nullable = false, precision = 15)
    public BigDecimal getCardbal() {
        return this.cardbal;
    }

    public void setCardbal(BigDecimal cardbal) {
        this.cardbal = cardbal;
    }

    @Column(name = "ACCUMDPSAMT", precision = 15)
    public BigDecimal getAccumdpsamt() {
        return this.accumdpsamt;
    }

    public void setAccumdpsamt(BigDecimal accumdpsamt) {
        this.accumdpsamt = accumdpsamt;
    }

}