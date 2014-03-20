package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class TCardaccdiffId implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private String startdate;

    // Constructors

    /**
     * default constructor
     */
    public TCardaccdiffId() {
    }

    /**
     * full constructor
     */
    public TCardaccdiffId(Integer cardno, String startdate) {
        this.cardno = cardno;
        this.startdate = startdate;
    }

    // Property accessors

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "STARTDATE", nullable = false, length = 8)
    public String getStartdate() {
        return this.startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCardaccdiffId))
            return false;
        TCardaccdiffId castOther = (TCardaccdiffId) other;

        return ((this.getCardno() == castOther.getCardno()) || (this.getCardno() != null
                && castOther.getCardno() != null && this
                .getCardno()
                .equals(
                        castOther
                                .getCardno())))
                && ((this.getStartdate() == castOther.getStartdate()) || (this.getStartdate() != null
                && castOther.getStartdate() != null && this
                .getStartdate()
                .equals(
                        castOther
                                .getStartdate())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        result = 37 * result + (getStartdate() == null ? 0 : this.getStartdate().hashCode());
        return result;
    }

}