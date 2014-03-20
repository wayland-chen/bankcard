package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TErrAccountId entity.
 */
@Embeddable
public class TErrAccountId implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private Integer totalnum;
    private String lostcntdetail;

    // Constructors

    /**
     * default constructor
     */
    public TErrAccountId() {
    }

    /**
     * full constructor
     */
    public TErrAccountId(Integer cardno, Integer totalnum, String lostcntdetail) {
        this.cardno = cardno;
        this.totalnum = totalnum;
        this.lostcntdetail = lostcntdetail;
    }

    // Property accessors

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "TOTALNUM")
    public Integer getTotalnum() {
        return this.totalnum;
    }

    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }

    @Column(name = "LOSTCNTDETAIL", length = 1000)
    public String getLostcntdetail() {
        return this.lostcntdetail;
    }

    public void setLostcntdetail(String lostcntdetail) {
        this.lostcntdetail = lostcntdetail;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TErrAccountId))
            return false;
        TErrAccountId castOther = (TErrAccountId) other;

        return ((this.getCardno() == castOther.getCardno()) || (this.getCardno() != null
                && castOther.getCardno() != null && this
                .getCardno()
                .equals(
                        castOther
                                .getCardno())))
                && ((this.getTotalnum() == castOther.getTotalnum()) || (this.getTotalnum() != null
                && castOther.getTotalnum() != null && this
                .getTotalnum()
                .equals(
                        castOther
                                .getTotalnum())))
                && ((this.getLostcntdetail() == castOther.getLostcntdetail()) || (this.getLostcntdetail() != null
                && castOther
                .getLostcntdetail() != null && this
                .getLostcntdetail()
                .equals(
                        castOther
                                .getLostcntdetail())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        result = 37 * result + (getTotalnum() == null ? 0 : this.getTotalnum().hashCode());
        result = 37 * result + (getLostcntdetail() == null ? 0 : this.getLostcntdetail().hashCode());
        return result;
    }

}