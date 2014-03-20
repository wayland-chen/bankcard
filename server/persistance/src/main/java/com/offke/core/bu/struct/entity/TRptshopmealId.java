package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TRptshopmealId entity.
 */
@Embeddable
public class TRptshopmealId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private String accno;

    // Constructors

    /**
     * default constructor
     */
    public TRptshopmealId() {
    }

    /**
     * full constructor
     */
    public TRptshopmealId(String accdate, String accno) {
        this.accdate = accdate;
        this.accno = accno;
    }

    // Property accessors

    @Column(name = "ACCDATE", nullable = false, length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "ACCNO", nullable = false, length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TRptshopmealId))
            return false;
        TRptshopmealId castOther = (TRptshopmealId) other;

        return ((this.getAccdate() == castOther.getAccdate()) || (this.getAccdate() != null
                && castOther.getAccdate() != null && this
                .getAccdate()
                .equals(
                        castOther
                                .getAccdate())))
                && ((this.getAccno() == castOther.getAccno()) || (this.getAccno() != null
                && castOther.getAccno() != null && this
                .getAccno()
                .equals(
                        castOther
                                .getAccno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccdate() == null ? 0 : this.getAccdate().hashCode());
        result = 37 * result + (getAccno() == null ? 0 : this.getAccno().hashCode());
        return result;
    }

}