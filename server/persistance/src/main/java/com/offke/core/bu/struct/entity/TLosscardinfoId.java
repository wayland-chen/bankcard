package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TLosscardinfoId entity.
 */
@Embeddable
public class TLosscardinfoId implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private String shopcode;
    private String regdate;

    // Constructors

    /**
     * default constructor
     */
    public TLosscardinfoId() {
    }

    /**
     * full constructor
     */
    public TLosscardinfoId(Integer cardno, String shopcode, String regdate) {
        this.cardno = cardno;
        this.shopcode = shopcode;
        this.regdate = regdate;
    }

    // Property accessors

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "SHOPCODE", nullable = false, length = 60)
    public String getShopcode() {
        return this.shopcode;
    }

    public void setShopcode(String shopcode) {
        this.shopcode = shopcode;
    }

    @Column(name = "REGDATE", nullable = false, length = 8)
    public String getRegdate() {
        return this.regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TLosscardinfoId))
            return false;
        TLosscardinfoId castOther = (TLosscardinfoId) other;

        return ((this.getCardno() == castOther.getCardno()) || (this.getCardno() != null
                && castOther.getCardno() != null && this
                .getCardno()
                .equals(
                        castOther
                                .getCardno())))
                && ((this.getShopcode() == castOther.getShopcode()) || (this.getShopcode() != null
                && castOther.getShopcode() != null && this
                .getShopcode()
                .equals(
                        castOther
                                .getShopcode())))
                && ((this.getRegdate() == castOther.getRegdate()) || (this.getRegdate() != null
                && castOther.getRegdate() != null && this
                .getRegdate()
                .equals(
                        castOther
                                .getRegdate())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        result = 37 * result + (getShopcode() == null ? 0 : this.getShopcode().hashCode());
        result = 37 * result + (getRegdate() == null ? 0 : this.getRegdate().hashCode());
        return result;
    }

}