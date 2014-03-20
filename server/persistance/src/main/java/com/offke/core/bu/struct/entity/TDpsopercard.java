package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDpsopercard entity.
 */
@Entity
@Table(name = "T_DPSOPERCARD")
public class TDpsopercard implements java.io.Serializable {

    // Fields    

    private String opercode;
    private Integer cardno;
    private Integer disableflag;
    private String openoper;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TDpsopercard() {
    }

    /**
     * minimal constructor
     */
    public TDpsopercard(String opercode, Integer cardno, Integer disableflag) {
        this.opercode = opercode;
        this.cardno = cardno;
        this.disableflag = disableflag;
    }

    /**
     * full constructor
     */
    public TDpsopercard(String opercode, Integer cardno, Integer disableflag, String openoper, String lastsaved) {
        this.opercode = opercode;
        this.cardno = cardno;
        this.disableflag = disableflag;
        this.openoper = openoper;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "OPERCODE", unique = true, nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "DISABLEFLAG", nullable = false, precision = 1, scale = 0)
    public Integer getDisableflag() {
        return this.disableflag;
    }

    public void setDisableflag(Integer disableflag) {
        this.disableflag = disableflag;
    }

    @Column(name = "OPENOPER", length = 8)
    public String getOpenoper() {
        return this.openoper;
    }

    public void setOpenoper(String openoper) {
        this.openoper = openoper;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}