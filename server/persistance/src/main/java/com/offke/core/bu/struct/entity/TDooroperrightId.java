package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDooroperrightId entity.
 */
@Embeddable
public class TDooroperrightId implements java.io.Serializable {

    // Fields    

    private Integer deviceid;
    private String opercode;

    // Constructors

    /**
     * default constructor
     */
    public TDooroperrightId() {
    }

    /**
     * full constructor
     */
    public TDooroperrightId(Integer deviceid, String opercode) {
        this.deviceid = deviceid;
        this.opercode = opercode;
    }

    // Property accessors

    @Column(name = "DEVICEID", nullable = false)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDooroperrightId))
            return false;
        TDooroperrightId castOther = (TDooroperrightId) other;

        return ((this.getDeviceid() == castOther.getDeviceid()) || (this.getDeviceid() != null
                && castOther.getDeviceid() != null && this
                .getDeviceid()
                .equals(
                        castOther
                                .getDeviceid())))
                && ((this.getOpercode() == castOther.getOpercode()) || (this.getOpercode() != null
                && castOther.getOpercode() != null && this
                .getOpercode()
                .equals(
                        castOther
                                .getOpercode())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        result = 37 * result + (getOpercode() == null ? 0 : this.getOpercode().hashCode());
        return result;
    }

}