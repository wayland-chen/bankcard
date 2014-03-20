package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDooreventdtlId entity.
 */
@Embeddable
public class TDooreventdtlId implements java.io.Serializable {

    // Fields    

    private Integer deviceid;
    private String transdate;
    private String transtime;
    private Integer eventcode;

    // Constructors

    /**
     * default constructor
     */
    public TDooreventdtlId() {
    }

    /**
     * full constructor
     */
    public TDooreventdtlId(Integer deviceid, String transdate, String transtime, Integer eventcode) {
        this.deviceid = deviceid;
        this.transdate = transdate;
        this.transtime = transtime;
        this.eventcode = eventcode;
    }

    // Property accessors

    @Column(name = "DEVICEID", nullable = false)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", nullable = false, length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "EVENTCODE", nullable = false)
    public Integer getEventcode() {
        return this.eventcode;
    }

    public void setEventcode(Integer eventcode) {
        this.eventcode = eventcode;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDooreventdtlId))
            return false;
        TDooreventdtlId castOther = (TDooreventdtlId) other;

        return ((this.getDeviceid() == castOther.getDeviceid()) || (this.getDeviceid() != null
                && castOther.getDeviceid() != null && this
                .getDeviceid()
                .equals(
                        castOther
                                .getDeviceid())))
                && ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
                && ((this.getTranstime() == castOther.getTranstime()) || (this.getTranstime() != null
                && castOther.getTranstime() != null && this
                .getTranstime()
                .equals(
                        castOther
                                .getTranstime())))
                && ((this.getEventcode() == castOther.getEventcode()) || (this.getEventcode() != null
                && castOther.getEventcode() != null && this
                .getEventcode()
                .equals(
                        castOther
                                .getEventcode())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result + (getTranstime() == null ? 0 : this.getTranstime().hashCode());
        result = 37 * result + (getEventcode() == null ? 0 : this.getEventcode().hashCode());
        return result;
    }

}