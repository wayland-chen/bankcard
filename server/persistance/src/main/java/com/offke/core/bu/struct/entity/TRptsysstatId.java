package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TRptsysstatId entity.
 */
@Embeddable
public class TRptsysstatId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private Integer itemid;

    // Constructors

    /**
     * default constructor
     */
    public TRptsysstatId() {
    }

    /**
     * full constructor
     */
    public TRptsysstatId(String accdate, Integer itemid) {
        this.accdate = accdate;
        this.itemid = itemid;
    }

    // Property accessors

    @Column(name = "ACCDATE", nullable = false, length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "ITEMID", nullable = false)
    public Integer getItemid() {
        return this.itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TRptsysstatId))
            return false;
        TRptsysstatId castOther = (TRptsysstatId) other;

        return ((this.getAccdate() == castOther.getAccdate()) || (this.getAccdate() != null
                && castOther.getAccdate() != null && this
                .getAccdate()
                .equals(
                        castOther
                                .getAccdate())))
                && ((this.getItemid() == castOther.getItemid()) || (this.getItemid() != null
                && castOther.getItemid() != null && this
                .getItemid()
                .equals(
                        castOther
                                .getItemid())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccdate() == null ? 0 : this.getAccdate().hashCode());
        result = 37 * result + (getItemid() == null ? 0 : this.getItemid().hashCode());
        return result;
    }

}