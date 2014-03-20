package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRptaccledger entity.
 */
@Entity
@Table(name = "T_RPTACCLEDGER")
public class TRptaccledger implements java.io.Serializable {

    // Fields    

    private TRptaccledgerId id;
    private Integer transtype;
    private Integer transcnt;
    private BigDecimal dramt;
    private BigDecimal cramt;
    private Integer balflag;
    private BigDecimal balance;
    private Integer personcnt;

    // Constructors

    /**
     * default constructor
     */
    public TRptaccledger() {
    }

    /**
     * minimal constructor
     */
    public TRptaccledger(TRptaccledgerId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptaccledger(
            TRptaccledgerId id,
            Integer transtype,
            Integer transcnt,
            BigDecimal dramt,
            BigDecimal cramt,
            Integer balflag,
            BigDecimal balance,
            Integer personcnt) {
        this.id = id;
        this.transtype = transtype;
        this.transcnt = transcnt;
        this.dramt = dramt;
        this.cramt = cramt;
        this.balflag = balflag;
        this.balance = balance;
        this.personcnt = personcnt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10)),
            @AttributeOverride(name = "summary", column = @Column(name = "SUMMARY", nullable = false, length = 60))})
    public TRptaccledgerId getId() {
        return this.id;
    }

    public void setId(TRptaccledgerId id) {
        this.id = id;
    }

    @Column(name = "TRANSTYPE")
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "TRANSCNT")
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "DRAMT", precision = 15)
    public BigDecimal getDramt() {
        return this.dramt;
    }

    public void setDramt(BigDecimal dramt) {
        this.dramt = dramt;
    }

    @Column(name = "CRAMT", precision = 15)
    public BigDecimal getCramt() {
        return this.cramt;
    }

    public void setCramt(BigDecimal cramt) {
        this.cramt = cramt;
    }

    @Column(name = "BALFLAG", precision = 1, scale = 0)
    public Integer getBalflag() {
        return this.balflag;
    }

    public void setBalflag(Integer balflag) {
        this.balflag = balflag;
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