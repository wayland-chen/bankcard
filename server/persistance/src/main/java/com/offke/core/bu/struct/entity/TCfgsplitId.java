package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TCfgsplitId implements java.io.Serializable {

    // Fields    

    private Integer transtype;
    private Integer fundtype;

    // Constructors

    /**
     * default constructor
     */
    public TCfgsplitId() {
    }

    /**
     * full constructor
     */
    public TCfgsplitId(Integer transtype, Integer fundtype) {
        this.transtype = transtype;
        this.fundtype = fundtype;
    }

    // Property accessors

    @Column(name = "TRANSTYPE", nullable = false)
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "FUNDTYPE", nullable = false)
    public Integer getFundtype() {
        return this.fundtype;
    }

    public void setFundtype(Integer fundtype) {
        this.fundtype = fundtype;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCfgsplitId))
            return false;
        TCfgsplitId castOther = (TCfgsplitId) other;

        return ((this.getTranstype() == castOther.getTranstype()) || (this.getTranstype() != null
                && castOther.getTranstype() != null && this
                .getTranstype()
                .equals(
                        castOther
                                .getTranstype())))
                && ((this.getFundtype() == castOther.getFundtype()) || (this.getFundtype() != null
                && castOther.getFundtype() != null && this
                .getFundtype()
                .equals(
                        castOther
                                .getFundtype())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getTranstype() == null ? 0 : this.getTranstype().hashCode());
        result = 37 * result + (getFundtype() == null ? 0 : this.getFundtype().hashCode());
        return result;
    }

}