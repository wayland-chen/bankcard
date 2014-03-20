package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TRptaccledgerId entity.
 */
@Embeddable
public class TRptaccledgerId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private String accno;
    private String summary;

    // Constructors

    /**
     * default constructor
     */
    public TRptaccledgerId() {
    }

    /**
     * full constructor
     */
    public TRptaccledgerId(String accdate, String accno, String summary) {
        this.accdate = accdate;
        this.accno = accno;
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

    @Column(name = "ACCNO", nullable = false, length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
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
        if (!(other instanceof TRptaccledgerId))
            return false;
        TRptaccledgerId castOther = (TRptaccledgerId) other;

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
                                .getAccno())))
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
        result = 37 * result + (getAccno() == null ? 0 : this.getAccno().hashCode());
        result = 37 * result + (getSummary() == null ? 0 : this.getSummary().hashCode());
        return result;
    }

}