package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TRptaccbal entity.
 */
@Entity
@Table(name = "T_RPTACCBAL")
public class TRptaccbal implements java.io.Serializable {

    // Fields    

    private TRptaccbalId id;
    private String subjno;
    private Integer balflag;
    private BigDecimal balance;

    // Constructors

    /**
     * default constructor
     */
    public TRptaccbal() {
    }

    /**
     * minimal constructor
     */
    public TRptaccbal(TRptaccbalId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptaccbal(TRptaccbalId id, String subjno, Integer balflag, BigDecimal balance) {
        this.id = id;
        this.subjno = subjno;
        this.balflag = balflag;
        this.balance = balance;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10))})
    public TRptaccbalId getId() {
        return this.id;
    }

    public void setId(TRptaccbalId id) {
        this.id = id;
    }

    @Column(name = "SUBJNO", length = 6)
    public String getSubjno() {
        return this.subjno;
    }

    public void setSubjno(String subjno) {
        this.subjno = subjno;
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

}