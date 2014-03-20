package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TCardtyperightId implements java.io.Serializable {

    // Fields    

    private Integer cardtype;
    private Integer feetype;

    // Constructors

    /**
     * default constructor
     */
    public TCardtyperightId() {
    }

    /**
     * full constructor
     */
    public TCardtyperightId(Integer cardtype, Integer feetype) {
        this.cardtype = cardtype;
        this.feetype = feetype;
    }

    // Property accessors

    @Column(name = "CARDTYPE", nullable = false)
    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
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
        if (!(other instanceof TCardtyperightId))
            return false;
        TCardtyperightId castOther = (TCardtyperightId) other;

        return ((this.getCardtype() == castOther.getCardtype()) || (this.getCardtype() != null
                && castOther.getCardtype() != null && this
                .getCardtype()
                .equals(
                        castOther
                                .getCardtype())))
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

        result = 37 * result + (getCardtype() == null ? 0 : this.getCardtype().hashCode());
        result = 37 * result + (getFeetype() == null ? 0 : this.getFeetype().hashCode());
        return result;
    }

}