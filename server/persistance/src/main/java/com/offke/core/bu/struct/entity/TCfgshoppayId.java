package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class TCfgshoppayId implements java.io.Serializable {

    // Fields    

    private Integer shopid;
    private Integer feetype;

    // Constructors

    /**
     * default constructor
     */
    public TCfgshoppayId() {
    }

    /**
     * full constructor
     */
    public TCfgshoppayId(Integer shopid, Integer feetype) {
        this.shopid = shopid;
        this.feetype = feetype;
    }

    // Property accessors

    @Column(name = "SHOPID", nullable = false)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "FEETYPE", nullable = false)
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCfgshoppayId))
            return false;
        TCfgshoppayId castOther = (TCfgshoppayId) other;

        return ((this.getShopid() == castOther.getShopid()) || (this.getShopid() != null
                && castOther.getShopid() != null && this
                .getShopid()
                .equals(
                        castOther
                                .getShopid())))
                && ((this.getFeetype() == castOther.getFeetype()) || (this.getFeetype() != null
                && castOther.getFeetype() != null && this
                .getFeetype()
                .equals(
                        castOther
                                .getFeetype())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getShopid() == null ? 0 : this.getShopid().hashCode());
        result = 37 * result + (getFeetype() == null ? 0 : this.getFeetype().hashCode());
        return result;
    }

}