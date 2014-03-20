package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TAttdevcardlistId implements java.io.Serializable {

    // Fields    

    private Integer deviceid;
    private Integer custid;
    private Integer weekid;

    // Constructors

    /**
     * default constructor
     */
    public TAttdevcardlistId() {
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

    @Column(name = "WEEKID", nullable = false)
    public Integer getWeekid() {
        return this.weekid;
    }

    public void setWeekid(Integer weekid) {
        this.weekid = weekid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TAttdevcardlistId))
            return false;
        TAttdevcardlistId castOther = (TAttdevcardlistId) other;

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
                && ((this.getWeekid() == castOther.getWeekid()) || (this.getWeekid() != null
                && castOther.getWeekid() != null && this
                .getWeekid()
                .equals(
                        castOther
                                .getWeekid())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        result = 37 * result + (getCustid() == null ? 0 : this.getCustid().hashCode());
        result = 37 * result + (getWeekid() == null ? 0 : this.getWeekid().hashCode());
        return result;
    }

}