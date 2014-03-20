package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TGeteleccardId entity.
 */
@Embeddable
public class TGeteleccardId implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private Integer deviceid;

    // Constructors

    /**
     * default constructor
     */
    public TGeteleccardId() {
    }

    /**
     * full constructor
     */
    public TGeteleccardId(Integer cardno, Integer deviceid) {
        this.cardno = cardno;
        this.deviceid = deviceid;
    }

    // Property accessors

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "DEVICEID", nullable = false)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TGeteleccardId))
            return false;
        TGeteleccardId castOther = (TGeteleccardId) other;

        return ((this.getCardno() == castOther.getCardno()) || (this.getCardno() != null
                && castOther.getCardno() != null && this
                .getCardno()
                .equals(
                        castOther
                                .getCardno())))
                && ((this.getDeviceid() == castOther.getDeviceid()) || (this.getDeviceid() != null
                && castOther.getDeviceid() != null && this
                .getDeviceid()
                .equals(
                        castOther
                                .getDeviceid())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        return result;
    }

}