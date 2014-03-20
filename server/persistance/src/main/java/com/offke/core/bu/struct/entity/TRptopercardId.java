package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TRptopercardId entity.
 */
@Embeddable
public class TRptopercardId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private String opercode;
    private Integer cardtype;
    private String summary;

    // Constructors

    /**
     * default constructor
     */
    public TRptopercardId() {
    }

    /**
     * full constructor
     */
    public TRptopercardId(String accdate, String opercode, Integer cardtype, String summary) {
        this.accdate = accdate;
        this.opercode = opercode;
        this.cardtype = cardtype;
        this.summary = summary;
    }

    // Property accessors

    @Column(name = "ACCDATE", nullable = false, length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "CARDTYPE", nullable = false)
    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Column(name = "SUMMARY", nullable = false, length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TRptopercardId))
            return false;
        TRptopercardId castOther = (TRptopercardId) other;

        return ((this.getAccdate() == castOther.getAccdate()) || (this.getAccdate() != null
                && castOther.getAccdate() != null && this
                .getAccdate()
                .equals(
                        castOther
                                .getAccdate())))
                && ((this.getOpercode() == castOther.getOpercode()) || (this.getOpercode() != null
                && castOther.getOpercode() != null && this
                .getOpercode()
                .equals(
                        castOther
                                .getOpercode())))
                && ((this.getCardtype() == castOther.getCardtype()) || (this.getCardtype() != null
                && castOther.getCardtype() != null && this
                .getCardtype()
                .equals(
                        castOther
                                .getCardtype())))
                && ((this.getSummary() == castOther.getSummary()) || (this.getSummary() != null
                && castOther.getSummary() != null && this
                .getSummary()
                .equals(
                        castOther
                                .getSummary())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccdate() == null ? 0 : this.getAccdate().hashCode());
        result = 37 * result + (getOpercode() == null ? 0 : this.getOpercode().hashCode());
        result = 37 * result + (getCardtype() == null ? 0 : this.getCardtype().hashCode());
        result = 37 * result + (getSummary() == null ? 0 : this.getSummary().hashCode());
        return result;
    }

}