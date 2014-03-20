package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRptshoprakeoff entity.
 */
@Entity
@Table(name = "T_RPTSHOPRAKEOFF")
public class TRptshoprakeoff implements java.io.Serializable {

    // Fields    

    private TRptshoprakeoffId id;
    private Integer shopid;
    private String accname;
    private BigDecimal rakeoffrate;
    private Integer transcnt;
    private BigDecimal transamt;
    private BigDecimal rakeoffamt;
    private BigDecimal amount;
    private BigDecimal balance;
    private Integer personcnt;

    // Constructors

    /**
     * default constructor
     */
    public TRptshoprakeoff() {
    }

    /**
     * minimal constructor
     */
    public TRptshoprakeoff(TRptshoprakeoffId id, BigDecimal rakeoffrate, Integer transcnt, BigDecimal transamt) {
        this.id = id;
        this.rakeoffrate = rakeoffrate;
        this.transcnt = transcnt;
        this.transamt = transamt;
    }

    /**
     * full constructor
     */
    public TRptshoprakeoff(
            TRptshoprakeoffId id,
            Integer shopid,
            String accname,
            BigDecimal rakeoffrate,
            Integer transcnt,
            BigDecimal transamt,
            BigDecimal rakeoffamt,
            BigDecimal amount,
            BigDecimal balance,
            Integer personcnt) {
        this.id = id;
        this.shopid = shopid;
        this.accname = accname;
        this.rakeoffrate = rakeoffrate;
        this.transcnt = transcnt;
        this.transamt = transamt;
        this.rakeoffamt = rakeoffamt;
        this.amount = amount;
        this.balance = balance;
        this.personcnt = personcnt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10))})
    public TRptshoprakeoffId getId() {
        return this.id;
    }

    public void setId(TRptshoprakeoffId id) {
        this.id = id;
    }

    @Column(name = "SHOPID")
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

    @Column(name = "RAKEOFFRATE", nullable = false, precision = 5, scale = 4)
    public BigDecimal getRakeoffrate() {
        return this.rakeoffrate;
    }

    public void setRakeoffrate(BigDecimal rakeoffrate) {
        this.rakeoffrate = rakeoffrate;
    }

    @Column(name = "TRANSCNT", nullable = false)
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "TRANSAMT", nullable = false, precision = 15)
    public BigDecimal getTransamt() {
        return this.transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

    @Column(name = "RAKEOFFAMT", precision = 15)
    public BigDecimal getRakeoffamt() {
        return this.rakeoffamt;
    }

    public void setRakeoffamt(BigDecimal rakeoffamt) {
        this.rakeoffamt = rakeoffamt;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "BALANCE", precision = 15)
    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Column(name = "PERSONCNT")
    public Integer getPersoncnt() {
        return this.personcnt;
    }

    public void setPersoncnt(Integer personcnt) {
        this.personcnt = personcnt;
    }

}