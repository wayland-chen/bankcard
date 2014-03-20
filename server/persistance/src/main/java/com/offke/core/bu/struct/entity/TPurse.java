package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


/**
 * TPurse entity.
 */
@Entity
@Table(name = "T_PURSE")
public class TPurse implements java.io.Serializable {

    // Fields    

    private Integer purseno;
    private String pursename;
    private BigDecimal cardmaxbal;
    private String useflag;

    // Constructors

    /**
     * default constructor
     */
    public TPurse() {
    }

    /**
     * minimal constructor
     */
    public TPurse(Integer purseno) {
        this.purseno = purseno;
    }

    /**
     * full constructor
     */
    public TPurse(Integer purseno, String pursename, BigDecimal cardmaxbal, String useflag) {
        this.purseno = purseno;
        this.pursename = pursename;
        this.cardmaxbal = cardmaxbal;
        this.useflag = useflag;
    }

    // Property accessors
    @Id
    @Column(name = "PURSENO", unique = true, nullable = false)
    public Integer getPurseno() {
        return this.purseno;
    }

    public void setPurseno(Integer purseno) {
        this.purseno = purseno;
    }

    @Column(name = "PURSENAME", length = 60)
    public String getPursename() {
        return this.pursename;
    }

    public void setPursename(String pursename) {
        this.pursename = pursename;
    }

    @Column(name = "CARDMAXBAL", precision = 15)
    public BigDecimal getCardmaxbal() {
        return this.cardmaxbal;
    }

    public void setCardmaxbal(BigDecimal cardmaxbal) {
        this.cardmaxbal = cardmaxbal;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

}