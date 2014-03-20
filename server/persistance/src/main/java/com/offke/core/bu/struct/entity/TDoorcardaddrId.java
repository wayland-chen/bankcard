package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDoorcardaddrId entity.
 */
@Embeddable
public class TDoorcardaddrId implements java.io.Serializable {

    // Fields    

    private Integer cardaddr;
    private Integer ctrlid;

    // Constructors

    /**
     * default constructor
     */
    public TDoorcardaddrId() {
    }

    /**
     * full constructor
     */
    public TDoorcardaddrId(Integer cardaddr, Integer ctrlid) {
        this.cardaddr = cardaddr;
        this.ctrlid = ctrlid;
    }

    // Property accessors

    @Column(name = "CARDADDR", nullable = false)
    public Integer getCardaddr() {
        return this.cardaddr;
    }

    public void setCardaddr(Integer cardaddr) {
        this.cardaddr = cardaddr;
    }

    @Column(name = "CTRLID", nullable = false)
    public Integer getCtrlid() {
        return this.ctrlid;
    }

    public void setCtrlid(Integer ctrlid) {
        this.ctrlid = ctrlid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDoorcardaddrId))
            return false;
        TDoorcardaddrId castOther = (TDoorcardaddrId) other;

        return ((this.getCardaddr() == castOther.getCardaddr()) || (this.getCardaddr() != null
                && castOther.getCardaddr() != null && this
                .getCardaddr()
                .equals(
                        castOther
                                .getCardaddr())))
                && ((this.getCtrlid() == castOther.getCtrlid()) || (this.getCtrlid() != null
                && castOther.getCtrlid() != null && this
                .getCtrlid()
                .equals(
                        castOther
                                .getCtrlid())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCardaddr() == null ? 0 : this.getCardaddr().hashCode());
        result = 37 * result + (getCtrlid() == null ? 0 : this.getCtrlid().hashCode());
        return result;
    }

}