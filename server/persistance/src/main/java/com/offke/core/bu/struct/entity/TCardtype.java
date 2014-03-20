package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "T_CARDTYPE")
public class TCardtype implements java.io.Serializable {

    // Fields    

    private Integer cardtype;
    private String cardtypename;
    private String anonymflag;
    private Integer feetype;
    private BigDecimal cardcostfee;
    private String reuseable;
    private String renewable;
    private String recycleable;
    private String multipurse;
    private String fixdayflag;
    private Integer fixdaycnt;
    private String useflag;
    private String purpose;
    private Integer cardphytype;

    // Constructors

    /**
     * default constructor
     */
    public TCardtype() {
    }

    /**
     * minimal constructor
     */
    public TCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * full constructor
     */
    public TCardtype(
            Integer cardtype,
            String cardtypename,
            String anonymflag,
            Integer feetype,
            BigDecimal cardcostfee,
            String reuseable,
            String renewable,
            String recycleable,
            String multipurse,
            String fixdayflag,
            Integer fixdaycnt,
            String useflag,
            String purpose,
            Integer cardphytype) {
        this.cardtype = cardtype;
        this.cardtypename = cardtypename;
        this.anonymflag = anonymflag;
        this.feetype = feetype;
        this.cardcostfee = cardcostfee;
        this.reuseable = reuseable;
        this.renewable = renewable;
        this.recycleable = recycleable;
        this.multipurse = multipurse;
        this.fixdayflag = fixdayflag;
        this.fixdaycnt = fixdaycnt;
        this.useflag = useflag;
        this.purpose = purpose;
        this.cardphytype = cardphytype;
    }

    // Property accessors
    @Id
    @Column(name = "CARDTYPE", unique = true, nullable = false)
    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Column(name = "CARDTYPENAME", length = 60)
    public String getCardtypename() {
        return this.cardtypename;
    }

    public void setCardtypename(String cardtypename) {
        this.cardtypename = cardtypename;
    }

    @Column(name = "ANONYMFLAG", length = 1)
    public String getAnonymflag() {
        return this.anonymflag;
    }

    public void setAnonymflag(String anonymflag) {
        this.anonymflag = anonymflag;
    }

    @Column(name = "FEETYPE")
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "CARDCOSTFEE")
    public BigDecimal getCardcostfee() {
        return this.cardcostfee;
    }

    public void setCardcostfee(BigDecimal cardcostfee) {
        this.cardcostfee = cardcostfee;
    }

    @Column(name = "REUSEABLE", length = 1)
    public String getReuseable() {
        return this.reuseable;
    }

    public void setReuseable(String reuseable) {
        this.reuseable = reuseable;
    }

    @Column(name = "RENEWABLE", length = 1)
    public String getRenewable() {
        return this.renewable;
    }

    public void setRenewable(String renewable) {
        this.renewable = renewable;
    }

    @Column(name = "RECYCLEABLE", length = 1)
    public String getRecycleable() {
        return this.recycleable;
    }

    public void setRecycleable(String recycleable) {
        this.recycleable = recycleable;
    }

    @Column(name = "MULTIPURSE", length = 1)
    public String getMultipurse() {
        return this.multipurse;
    }

    public void setMultipurse(String multipurse) {
        this.multipurse = multipurse;
    }

    @Column(name = "FIXDAYFLAG", length = 1)
    public String getFixdayflag() {
        return this.fixdayflag;
    }

    public void setFixdayflag(String fixdayflag) {
        this.fixdayflag = fixdayflag;
    }

    @Column(name = "FIXDAYCNT")
    public Integer getFixdaycnt() {
        return this.fixdaycnt;
    }

    public void setFixdaycnt(Integer fixdaycnt) {
        this.fixdaycnt = fixdaycnt;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

    @Column(name = "PURPOSE", length = 240)
    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Column(name = "CARDPHYTYPE")
    public Integer getCardphytype() {
        return this.cardphytype;
    }

    public void setCardphytype(Integer cardphytype) {
        this.cardphytype = cardphytype;
    }

}