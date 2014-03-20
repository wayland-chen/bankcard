package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CFGBANKCODE")
public class TCfgbankcode implements java.io.Serializable {

    // Fields    

    private String cardhead;
    private String bankcode;
    private Integer cardheadlen;
    private Integer cardlen;

    // Constructors

    /**
     * default constructor
     */
    public TCfgbankcode() {
    }

    /**
     * minimal constructor
     */
    public TCfgbankcode(String cardhead) {
        this.cardhead = cardhead;
    }

    /**
     * full constructor
     */
    public TCfgbankcode(String cardhead, String bankcode, Integer cardheadlen, Integer cardlen) {
        this.cardhead = cardhead;
        this.bankcode = bankcode;
        this.cardheadlen = cardheadlen;
        this.cardlen = cardlen;
    }

    // Property accessors
    @Id
    @Column(name = "CARDHEAD", unique = true, nullable = false, length = 30)
    public String getCardhead() {
        return this.cardhead;
    }

    public void setCardhead(String cardhead) {
        this.cardhead = cardhead;
    }

    @Column(name = "BANKCODE", length = 2)
    public String getBankcode() {
        return this.bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Column(name = "CARDHEADLEN", precision = 1, scale = 0)
    public Integer getCardheadlen() {
        return this.cardheadlen;
    }

    public void setCardheadlen(Integer cardheadlen) {
        this.cardheadlen = cardheadlen;
    }

    @Column(name = "CARDLEN", precision = 1, scale = 0)
    public Integer getCardlen() {
        return this.cardlen;
    }

    public void setCardlen(Integer cardlen) {
        this.cardlen = cardlen;
    }

}