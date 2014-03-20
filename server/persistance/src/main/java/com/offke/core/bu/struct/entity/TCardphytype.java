package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CARDPHYTYPE")
public class TCardphytype implements java.io.Serializable {

    // Fields    

    private Integer cardphytype;
    private String cardphytypename;
    private Integer useflag;
    private Integer cardphytypecode;

    // Constructors

    /**
     * default constructor
     */
    public TCardphytype() {
    }

    /**
     * full constructor
     */
    public TCardphytype(
            Integer cardphytype,
            String cardphytypename,
            Integer useflag,
            Integer cardphytypecode) {
        this.cardphytype = cardphytype;
        this.cardphytypename = cardphytypename;
        this.useflag = useflag;
        this.cardphytypecode = cardphytypecode;
    }

    // Property accessors
    @Id
    @Column(name = "CARDPHYTYPE", unique = true, nullable = false)
    public Integer getCardphytype() {
        return this.cardphytype;
    }

    public void setCardphytype(Integer cardphytype) {
        this.cardphytype = cardphytype;
    }

    @Column(name = "CARDPHYTYPENAME", nullable = false, length = 60)
    public String getCardphytypename() {
        return this.cardphytypename;
    }

    public void setCardphytypename(String cardphytypename) {
        this.cardphytypename = cardphytypename;
    }

    @Column(name = "USEFLAG", nullable = false, precision = 1, scale = 0)
    public Integer getUseflag() {
        return this.useflag;
    }

    public void setUseflag(Integer useflag) {
        this.useflag = useflag;
    }

    @Column(name = "CARDPHYTYPECODE", nullable = false)
    public Integer getCardphytypecode() {
        return this.cardphytypecode;
    }

    public void setCardphytypecode(Integer cardphytypecode) {
        this.cardphytypecode = cardphytypecode;
    }

}