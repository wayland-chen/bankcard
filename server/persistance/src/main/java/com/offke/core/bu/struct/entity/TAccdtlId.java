package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 帐户交易明细表ID
 *
 * @version 1.0
 */
@Embeddable
public class TAccdtlId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private Integer termid;
    private Long termseqno;
    private Long subseqno;
    private String accno;

    // Constructors

    /**
     * default constructor
     */
    public TAccdtlId() {
    }

    /**
     * full constructor
     */
    public TAccdtlId(String accdate, Integer termid, Long termseqno, Long subseqno, String accno) {
        this.accdate = accdate;
        this.termid = termid;
        this.termseqno = termseqno;
        this.subseqno = subseqno;
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

    @Column(name = "TERMID", nullable = false)
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "TERMSEQNO", nullable = false)
    public Long getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(Long termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "SUBSEQNO", nullable = false)
    public Long getSubseqno() {
        return this.subseqno;
    }

    public void setSubseqno(Long subseqno) {
        this.subseqno = subseqno;
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
        if (!(other instanceof TAccdtlId))
            return false;
        TAccdtlId castOther = (TAccdtlId) other;

        return ((this.getAccdate() == castOther.getAccdate()) || (this.getAccdate() != null
                && castOther.getAccdate() != null && this
                .getAccdate()
                .equals(
                        castOther
                                .getAccdate())))
                && ((this.getTermid() == castOther.getTermid()) || (this.getTermid() != null
                && castOther.getTermid() != null && this
                .getTermid()
                .equals(
                        castOther
                                .getTermid())))
                && ((this.getTermseqno() == castOther.getTermseqno()) || (this.getTermseqno() != null
                && castOther.getTermseqno() != null && this
                .getTermseqno()
                .equals(
                        castOther
                                .getTermseqno())))
                && ((this.getSubseqno() == castOther.getSubseqno()) || (this.getSubseqno() != null
                && castOther.getSubseqno() != null && this
                .getSubseqno()
                .equals(
                        castOther
                                .getSubseqno())))
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
        result = 37 * result + (getTermid() == null ? 0 : this.getTermid().hashCode());
        result = 37 * result + (getTermseqno() == null ? 0 : this.getTermseqno().hashCode());
        result = 37 * result + (getSubseqno() == null ? 0 : this.getSubseqno().hashCode());
        result = 37 * result + (getAccno() == null ? 0 : this.getAccno().hashCode());
        return result;
    }

}