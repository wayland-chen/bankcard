package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDoorcardId entity.
 */
@Embeddable
public class TDoorcardId implements java.io.Serializable {

    // Fields    

    private Integer deviceid;
    private Integer custid;
    private Integer cardno;

    // Constructors

    /**
     * default constructor
     */
    public TDoorcardId() {
    }

    /**
     * full constructor
     */
    public TDoorcardId(Integer deviceid, Integer custid, Integer cardno) {
        this.deviceid = deviceid;
        this.custid = custid;
        this.cardno = cardno;
    }

    // Property accessors

    @Column(name = "DEVICEID", nullable = false)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "CUSTID", nullable = false)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
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
        if (!(other instanceof TDoorcardId))
            return false;
        TDoorcardId castOther = (TDoorcardId) other;

        return ((this.getDeviceid() == castOther.getDeviceid()) || (this.getDeviceid() != null
                && castOther.getDeviceid() != null && this
                .getDeviceid()
                .equals(
                        castOther
                                .getDeviceid())))
                && ((this.getCustid() == castOther.getCustid()) || (this.getCustid() != null
                && castOther.getCustid() != null && this
                .getCustid()
                .equals(
                        castOther
                                .getCustid())))
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

        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        result = 37 * result + (getCustid() == null ? 0 : this.getCustid().hashCode());
        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        return result;
    }

}