package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDevicetmpId entity.
 */
@Embeddable
public class TDevicetmpId implements java.io.Serializable {

    // Fields    

    private String batchno;
    private Long seqno;

    // Constructors

    /**
     * default constructor
     */
    public TDevicetmpId() {
    }

    /**
     * full constructor
     */
    public TDevicetmpId(String batchno, Long seqno) {
        this.batchno = batchno;
        this.seqno = seqno;
    }

    // Property accessors

    @Column(name = "BATCHNO", nullable = false, length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "SEQNO", nullable = false)
    public Long getSeqno() {
        return this.seqno;
    }

    public void setSeqno(Long seqno) {
        this.seqno = seqno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDevicetmpId))
            return false;
        TDevicetmpId castOther = (TDevicetmpId) other;

        return ((this.getBatchno() == castOther.getBatchno()) || (this.getBatchno() != null
                && castOther.getBatchno() != null && this
                .getBatchno()
                .equals(
                        castOther
                                .getBatchno())))
                && ((this.getSeqno() == castOther.getSeqno()) || (this.getSeqno() != null
                && castOther.getSeqno() != null && this
                .getSeqno()
                .equals(
                        castOther
                                .getSeqno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getBatchno() == null ? 0 : this.getBatchno().hashCode());
        result = 37 * result + (getSeqno() == null ? 0 : this.getSeqno().hashCode());
        return result;
    }

}