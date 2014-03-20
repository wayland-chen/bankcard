package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "T_CARDBALLIST")
public class TCardballist implements java.io.Serializable {

    // Fields    

    private String stuempno;
    private BigDecimal cardbal;
    private Integer flag;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TCardballist() {
    }

    /**
     * minimal constructor
     */
    public TCardballist(String stuempno) {
        this.stuempno = stuempno;
    }

    /**
     * full constructor
     */
    public TCardballist(String stuempno, BigDecimal cardbal, Integer flag, String lastsaved) {
        this.stuempno = stuempno;
        this.cardbal = cardbal;
        this.flag = flag;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "STUEMPNO", unique = true, nullable = false, length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CARDBAL", precision = 15)
    public BigDecimal getCardbal() {
        return this.cardbal;
    }

    public void setCardbal(BigDecimal cardbal) {
        this.cardbal = cardbal;
    }

    @Column(name = "FLAG", precision = 1, scale = 0)
    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}