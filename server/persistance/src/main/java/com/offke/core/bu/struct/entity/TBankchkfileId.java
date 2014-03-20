package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TBankchkfileId entity.
 */
@Embeddable
public class TBankchkfileId implements java.io.Serializable {

    // Fields    

    private Integer bankid;
    private Integer bankdate;

    // Constructors

    /**
     * default constructor
     */
    public TBankchkfileId() {
    }

    /**
     * full constructor
     */
    public TBankchkfileId(Integer bankid, Integer bankdate) {
        this.bankid = bankid;
        this.bankdate = bankdate;
    }

    // Property accessors

    @Column(name = "BANKID", nullable = false)
    public Integer getBankid() {
        return this.bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    @Column(name = "BANKDATE", nullable = false, precision = 8, scale = 0)
    public Integer getBankdate() {
        return this.bankdate;
    }

    public void setBankdate(Integer bankdate) {
        this.bankdate = bankdate;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TBankchkfileId))
            return false;
        TBankchkfileId castOther = (TBankchkfileId) other;

        return ((this.getBankid() == castOther.getBankid()) || (this.getBankid() != null
                && castOther.getBankid() != null && this
                .getBankid()
                .equals(
                        castOther
                                .getBankid())))
                && ((this.getBankdate() == castOther.getBankdate()) || (this.getBankdate() != null
                && castOther.getBankdate() != null && this
                .getBankdate()
                .equals(
                        castOther
                                .getBankdate())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getBankid() == null ? 0 : this.getBankid().hashCode());
        result = 37 * result + (getBankdate() == null ? 0 : this.getBankdate().hashCode());
        return result;
    }

}