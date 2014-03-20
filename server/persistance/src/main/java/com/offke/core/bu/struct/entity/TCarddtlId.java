package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TCarddtlId entity.
 */
@Embeddable
public class TCarddtlId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private Long termseqno;
    private Integer termid;
    private String opercode;
    private Integer usetype;

    // Constructors

    /**
     * default constructor
     */
    public TCarddtlId() {
    }

    /**
     * full constructor
     */
    public TCarddtlId(String accdate, Long termseqno, Integer termid, String opercode, Integer usetype) {
        this.accdate = accdate;
        this.termseqno = termseqno;
        this.termid = termid;
        this.opercode = opercode;
        this.usetype = usetype;
    }

    // Property accessors

    @Column(name = "ACCDATE", nullable = false, length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "TERMSEQNO", nullable = false)
    public Long getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(Long termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "TERMID", nullable = false)
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "USETYPE", nullable = false)
    public Integer getUsetype() {
        return this.usetype;
    }

    public void setUsetype(Integer usetype) {
        this.usetype = usetype;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCarddtlId))
            return false;
        TCarddtlId castOther = (TCarddtlId) other;

        return ((this.getAccdate() == castOther.getAccdate()) || (this.getAccdate() != null
                && castOther.getAccdate() != null && this
                .getAccdate()
                .equals(
                        castOther
                                .getAccdate())))
                && ((this.getTermseqno() == castOther.getTermseqno()) || (this.getTermseqno() != null
                && castOther.getTermseqno() != null && this
                .getTermseqno()
                .equals(
                        castOther
                                .getTermseqno())))
                && ((this.getTermid() == castOther.getTermid()) || (this.getTermid() != null
                && castOther.getTermid() != null && this
                .getTermid()
                .equals(
                        castOther
                                .getTermid())))
                && ((this.getOpercode() == castOther.getOpercode()) || (this.getOpercode() != null
                && castOther.getOpercode() != null && this
                .getOpercode()
                .equals(
                        castOther
                                .getOpercode())))
                && ((this.getUsetype() == castOther.getUsetype()) || (this.getUsetype() != null
                && castOther.getUsetype() != null && this
                .getUsetype()
                .equals(
                        castOther
                                .getUsetype())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccdate() == null ? 0 : this.getAccdate().hashCode());
        result = 37 * result + (getTermseqno() == null ? 0 : this.getTermseqno().hashCode());
        result = 37 * result + (getTermid() == null ? 0 : this.getTermid().hashCode());
        result = 37 * result + (getOpercode() == null ? 0 : this.getOpercode().hashCode());
        result = 37 * result + (getUsetype() == null ? 0 : this.getUsetype().hashCode());
        return result;
    }

}