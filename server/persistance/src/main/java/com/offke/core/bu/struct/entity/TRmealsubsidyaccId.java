package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TRmealsubsidyaccId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TRmealsubsidyaccId implements java.io.Serializable {

    // Fields

    private String transdate;
    private Integer custid;
    private Integer mealtype;

    // Constructors

    /**
     * default constructor
     */
    public TRmealsubsidyaccId() {
    }

    /**
     * full constructor
     */
    public TRmealsubsidyaccId(String transdate, Integer custid,
                              Integer mealtype) {
        this.transdate = transdate;
        this.custid = custid;
        this.mealtype = mealtype;
    }

    // Property accessors

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "CUSTID", nullable = false, precision = 22, scale = 0)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "MEALTYPE", nullable = false, precision = 1, scale = 0)
    public Integer getMealtype() {
        return this.mealtype;
    }

    public void setMealtype(Integer mealtype) {
        this.mealtype = mealtype;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TRmealsubsidyaccId))
            return false;
        TRmealsubsidyaccId castOther = (TRmealsubsidyaccId) other;

        return ((this.getTransdate() == castOther.getTransdate()) || (this
                .getTransdate() != null && castOther.getTransdate() != null && this
                .getTransdate().equals(castOther.getTransdate())))
                && ((this.getCustid() == castOther.getCustid()) || (this
                .getCustid() != null && castOther.getCustid() != null && this
                .getCustid().equals(castOther.getCustid())))
                && ((this.getMealtype() == castOther.getMealtype()) || (this
                .getMealtype() != null
                && castOther.getMealtype() != null && this
                .getMealtype().equals(castOther.getMealtype())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result
                + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result
                + (getCustid() == null ? 0 : this.getCustid().hashCode());
        result = 37 * result
                + (getMealtype() == null ? 0 : this.getMealtype().hashCode());
        return result;
    }

}