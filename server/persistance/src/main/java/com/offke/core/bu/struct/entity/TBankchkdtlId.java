package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TBankchkdtlId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TBankchkdtlId implements java.io.Serializable {

    // Fields    

    private Integer bankid;
    private Integer bankdate;
    private Integer recordno;

    // Constructors

    /**
     * default constructor
     */
    public TBankchkdtlId() {
    }

    /**
     * full constructor
     */
    public TBankchkdtlId(Integer bankid, Integer bankdate, Integer recordno) {
        this.bankid = bankid;
        this.bankdate = bankdate;
        this.recordno = recordno;
    }

    // Property accessors

    @Column(name = "BANKID")
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

    @Column(name = "RECORDNO", nullable = false, precision = 8, scale = 0)
    public Integer getRecordno() {
        return this.recordno;
    }

    public void setRecordno(Integer recordno) {
        this.recordno = recordno;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TBankchkdtlId))
            return false;
        TBankchkdtlId castOther = (TBankchkdtlId) other;

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
                                .getBankdate())))
                && ((this.getRecordno() == castOther.getRecordno()) || (this.getRecordno() != null
                && castOther.getRecordno() != null && this
                .getRecordno()
                .equals(
                        castOther
                                .getRecordno())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getBankid() == null ? 0 : this.getBankid().hashCode());
        result = 37 * result + (getBankdate() == null ? 0 : this.getBankdate().hashCode());
        result = 37 * result + (getRecordno() == null ? 0 : this.getRecordno().hashCode());
        return result;
    }

}