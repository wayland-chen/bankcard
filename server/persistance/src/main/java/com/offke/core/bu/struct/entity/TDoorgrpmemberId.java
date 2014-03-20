package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDoorgrpmemberId entity.
 */
@Embeddable
public class TDoorgrpmemberId implements java.io.Serializable {

    // Fields    

    private Integer groupid;
    private Integer deviceid;

    // Constructors

    /**
     * default constructor
     */
    public TDoorgrpmemberId() {
    }

    /**
     * full constructor
     */
    public TDoorgrpmemberId(Integer groupid, Integer deviceid) {
        this.groupid = groupid;
        this.deviceid = deviceid;
    }

    // Property accessors

    @Column(name = "GROUPID", nullable = false)
    public Integer getGroupid() {
        return this.groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
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
        if (!(other instanceof TDoorgrpmemberId))
            return false;
        TDoorgrpmemberId castOther = (TDoorgrpmemberId) other;

        return ((this.getGroupid() == castOther.getGroupid()) || (this.getGroupid() != null
                && castOther.getGroupid() != null && this
                .getGroupid()
                .equals(
                        castOther
                                .getGroupid())))
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

        result = 37 * result + (getGroupid() == null ? 0 : this.getGroupid().hashCode());
        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        return result;
    }

}