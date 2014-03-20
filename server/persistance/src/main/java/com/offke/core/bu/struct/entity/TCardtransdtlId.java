package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TCardtransdtlId implements java.io.Serializable {

    // Fields    

    private Integer transflag;
    private Integer cardcnt;
    private Integer cardno;

    // Constructors

    /**
     * default constructor
     */
    public TCardtransdtlId() {
    }

    /**
     * full constructor
     */
    public TCardtransdtlId(Integer transflag, Integer cardcnt, Integer cardno) {
        this.transflag = transflag;
        this.cardcnt = cardcnt;
        this.cardno = cardno;
    }

    // Property accessors

    @Column(name = "TRANSFLAG", nullable = false, precision = 1, scale = 0)
    public Integer getTransflag() {
        return this.transflag;
    }

    public void setTransflag(Integer transflag) {
        this.transflag = transflag;
    }

    @Column(name = "CARDCNT", nullable = false)
    public Integer getCardcnt() {
        return this.cardcnt;
    }

    public void setCardcnt(Integer cardcnt) {
        this.cardcnt = cardcnt;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCardtransdtlId))
            return false;
        TCardtransdtlId castOther = (TCardtransdtlId) other;

        return ((this.getTransflag() == castOther.getTransflag()) || (this.getTransflag() != null
                && castOther.getTransflag() != null && this
                .getTransflag()
                .equals(
                        castOther
                                .getTransflag())))
                && ((this.getCardcnt() == castOther.getCardcnt()) || (this.getCardcnt() != null
                && castOther.getCardcnt() != null && this
                .getCardcnt()
                .equals(
                        castOther
                                .getCardcnt())))
                && ((this.getCardno() == castOther.getCardno()) || (this.getCardno() != null
                && castOther.getCardno() != null && this
                .getCardno()
                .equals(
                        castOther
                                .getCardno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getTransflag() == null ? 0 : this.getTransflag().hashCode());
        result = 37 * result + (getCardcnt() == null ? 0 : this.getCardcnt().hashCode());
        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        return result;
    }

}