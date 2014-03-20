package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TRptsubjledgerId entity.
 */
@Embeddable
public class TRptsubjledgerId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private String subjno;
    private String summary;

    // Constructors

    /**
     * default constructor
     */
    public TRptsubjledgerId() {
    }

    /**
     * full constructor
     */
    public TRptsubjledgerId(String accdate, String subjno, String summary) {
        this.accdate = accdate;
        this.subjno = subjno;
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

    @Column(name = "SUBJNO", nullable = false, length = 6)
    public String getSubjno() {
        return this.subjno;
    }

    public void setSubjno(String subjno) {
        this.subjno = subjno;
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
        if (!(other instanceof TRptsubjledgerId))
            return false;
        TRptsubjledgerId castOther = (TRptsubjledgerId) other;

        return ((this.getAccdate() == castOther.getAccdate()) || (this.getAccdate() != null
                && castOther.getAccdate() != null && this
                .getAccdate()
                .equals(
                        castOther
                                .getAccdate())))
                && ((this.getSubjno() == castOther.getSubjno()) || (this.getSubjno() != null
                && castOther.getSubjno() != null && this
                .getSubjno()
                .equals(
                        castOther
                                .getSubjno())))
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
        result = 37 * result + (getSubjno() == null ? 0 : this.getSubjno().hashCode());
        result = 37 * result + (getSummary() == null ? 0 : this.getSummary().hashCode());
        return result;
    }

}