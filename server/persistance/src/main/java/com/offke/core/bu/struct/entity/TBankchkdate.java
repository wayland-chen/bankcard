package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BANKCHKDATE")
public class TBankchkdate implements java.io.Serializable {

    // Fields    

    private String chkdate;
    private String chkflag;

    // Constructors

    /**
     * default constructor
     */
    public TBankchkdate() {
    }

    /**
     * minimal constructor
     */
    public TBankchkdate(String chkdate) {
        this.chkdate = chkdate;
    }

    /**
     * full constructor
     */
    public TBankchkdate(String chkdate, String chkflag) {
        this.chkdate = chkdate;
        this.chkflag = chkflag;
    }

    // Property accessors
    @Id
    @Column(name = "CHKDATE", unique = true, nullable = false, length = 8)
    public String getChkdate() {
        return this.chkdate;
    }

    public void setChkdate(String chkdate) {
        this.chkdate = chkdate;
    }

    @Column(name = "CHKFLAG", precision = 1, scale = 0)
    public String getChkflag() {
        return this.chkflag;
    }

    public void setChkflag(String chkflag) {
        this.chkflag = chkflag;
    }

}