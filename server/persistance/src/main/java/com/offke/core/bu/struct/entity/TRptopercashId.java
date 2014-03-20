package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TRptopercashId entity.
 */
@Embeddable
public class TRptopercashId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private String opercode;
    private String subjno;
    private String summary;

    // Constructors

    /**
     * default constructor
     */
    public TRptopercashId() {
    }

    /**
     * full constructor
     */
    public TRptopercashId(String accdate, String opercode, String subjno, String summary) {
        this.accdate = accdate;
        this.opercode = opercode;
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

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
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
        if (!(other instanceof TRptopercashId))
            return false;
        TRptopercashId castOther = (TRptopercashId) other;

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
        result = 37 * result + (getOpercode() == null ? 0 : this.getOpercode().hashCode());
        result = 37 * result + (getSubjno() == null ? 0 : this.getSubjno().hashCode());
        result = 37 * result + (getSummary() == null ? 0 : this.getSummary().hashCode());
        return result;
    }

}