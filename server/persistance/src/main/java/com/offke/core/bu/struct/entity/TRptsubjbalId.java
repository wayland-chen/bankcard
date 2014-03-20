package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TRptsubjbalId entity.
 */
@Embeddable
public class TRptsubjbalId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private String subjno;

    // Constructors

    /**
     * default constructor
     */
    public TRptsubjbalId() {
    }

    /**
     * full constructor
     */
    public TRptsubjbalId(String accdate, String subjno) {
        this.accdate = accdate;
        this.subjno = subjno;
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

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TRptsubjbalId))
            return false;
        TRptsubjbalId castOther = (TRptsubjbalId) other;

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
                                .getSubjno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccdate() == null ? 0 : this.getAccdate().hashCode());
        result = 37 * result + (getSubjno() == null ? 0 : this.getSubjno().hashCode());
        return result;
    }

}