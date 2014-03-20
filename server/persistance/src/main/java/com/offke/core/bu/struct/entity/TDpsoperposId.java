package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDpsoperposId entity.
 */
@Embeddable
public class TDpsoperposId implements java.io.Serializable {

    // Fields    

    private String opercode;
    private Integer deviceid;

    // Constructors

    /**
     * default constructor
     */
    public TDpsoperposId() {
    }

    /**
     * full constructor
     */
    public TDpsoperposId(String opercode, Integer deviceid) {
        this.opercode = opercode;
        this.deviceid = deviceid;
    }

    // Property accessors

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
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
        if (!(other instanceof TDpsoperposId))
            return false;
        TDpsoperposId castOther = (TDpsoperposId) other;

        return ((this.getOpercode() == castOther.getOpercode()) || (this.getOpercode() != null
                && castOther.getOpercode() != null && this
                .getOpercode()
                .equals(
                        castOther
                                .getOpercode())))
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

        result = 37 * result + (getOpercode() == null ? 0 : this.getOpercode().hashCode());
        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        return result;
    }

}