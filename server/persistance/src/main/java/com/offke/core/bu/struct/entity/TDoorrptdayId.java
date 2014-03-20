package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDoorrptdayId entity.
 */
@Embeddable
public class TDoorrptdayId implements java.io.Serializable {

    // Fields    

    private String transdate;
    private Integer deviceid;

    // Constructors

    /**
     * default constructor
     */
    public TDoorrptdayId() {
    }

    /**
     * full constructor
     */
    public TDoorrptdayId(String transdate, Integer deviceid) {
        this.transdate = transdate;
        this.deviceid = deviceid;
    }

    // Property accessors

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
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
        if (!(other instanceof TDoorrptdayId))
            return false;
        TDoorrptdayId castOther = (TDoorrptdayId) other;

        return ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
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

        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        return result;
    }

}