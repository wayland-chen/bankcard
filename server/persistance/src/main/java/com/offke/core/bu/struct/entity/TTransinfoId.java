package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TTransinfoId entity.
 */
@Embeddable
public class TTransinfoId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private Integer termid;
    private Long termseqno;

    // Constructors

    /**
     * default constructor
     */
    public TTransinfoId() {
    }

    /**
     * full constructor
     */
    public TTransinfoId(String accdate, Integer termid, Long termseqno) {
        this.accdate = accdate;
        this.termid = termid;
        this.termseqno = termseqno;
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

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TTransinfoId))
            return false;
        TTransinfoId castOther = (TTransinfoId) other;

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
                                .getTermseqno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccdate() == null ? 0 : this.getAccdate().hashCode());
        result = 37 * result + (getTermid() == null ? 0 : this.getTermid().hashCode());
        result = 37 * result + (getTermseqno() == null ? 0 : this.getTermseqno().hashCode());
        return result;
    }

}