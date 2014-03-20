package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TStatcusttransId entity.
 */
@Embeddable
public class TStatcusttransId implements java.io.Serializable {

    // Fields    

    private Integer settledate;
    private Integer custid;
    private Integer transdate;

    // Constructors

    /**
     * default constructor
     */
    public TStatcusttransId() {
    }

    /**
     * full constructor
     */
    public TStatcusttransId(Integer settledate, Integer custid, Integer transdate) {
        this.settledate = settledate;
        this.custid = custid;
        this.transdate = transdate;
    }

    // Property accessors

    @Column(name = "SETTLEDATE", nullable = false, precision = 8, scale = 0)
    public Integer getSettledate() {
        return this.settledate;
    }

    public void setSettledate(Integer settledate) {
        this.settledate = settledate;
    }

    @Column(name = "CUSTID", nullable = false)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "TRANSDATE", nullable = false, precision = 8, scale = 0)
    public Integer getTransdate() {
        return this.transdate;
    }

    public void setTransdate(Integer transdate) {
        this.transdate = transdate;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TStatcusttransId))
            return false;
        TStatcusttransId castOther = (TStatcusttransId) other;

        return ((this.getSettledate() == castOther.getSettledate()) || (this.getSettledate() != null
                && castOther.getSettledate() != null && this
                .getSettledate()
                .equals(
                        castOther
                                .getSettledate())))
                && ((this.getCustid() == castOther.getCustid()) || (this.getCustid() != null
                && castOther.getCustid() != null && this
                .getCustid()
                .equals(
                        castOther
                                .getCustid())))
                && ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getSettledate() == null ? 0 : this.getSettledate().hashCode());
        result = 37 * result + (getCustid() == null ? 0 : this.getCustid().hashCode());
        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        return result;
    }

}