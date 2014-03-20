package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;


@Embeddable
public class TCfgrakeoffId implements java.io.Serializable {

    // Fields    

    private Integer shopid;
    private BigDecimal amount;

    // Constructors

    /**
     * default constructor
     */
    public TCfgrakeoffId() {
    }

    /**
     * full constructor
     */
    public TCfgrakeoffId(Integer shopid, BigDecimal amount) {
        this.shopid = shopid;
        this.amount = amount;
    }

    // Property accessors

    @Column(name = "SHOPID", nullable = false)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "AMOUNT", nullable = false, precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCfgrakeoffId))
            return false;
        TCfgrakeoffId castOther = (TCfgrakeoffId) other;

        return ((this.getShopid() == castOther.getShopid()) || (this.getShopid() != null
                && castOther.getShopid() != null && this
                .getShopid()
                .equals(
                        castOther
                                .getShopid())))
                && ((this.getAmount() == castOther.getAmount()) || (this.getAmount() != null
                && castOther.getAmount() != null && this
                .getAmount()
                .equals(
                        castOther
                                .getAmount())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getShopid() == null ? 0 : this.getShopid().hashCode());
        result = 37 * result + (getAmount() == null ? 0 : this.getAmount().hashCode());
        return result;
    }

}