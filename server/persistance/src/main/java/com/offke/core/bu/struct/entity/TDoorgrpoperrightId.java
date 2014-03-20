package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDoorgrpoperrightId entity.
 */
@Embeddable
public class TDoorgrpoperrightId implements java.io.Serializable {

    // Fields    

    private Integer groupid;
    private String opercode;

    // Constructors

    /**
     * default constructor
     */
    public TDoorgrpoperrightId() {
    }

    /**
     * full constructor
     */
    public TDoorgrpoperrightId(Integer groupid, String opercode) {
        this.groupid = groupid;
        this.opercode = opercode;
    }

    // Property accessors

    @Column(name = "GROUPID", nullable = false)
    public Integer getGroupid() {
        return this.groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
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
        if (!(other instanceof TDoorgrpoperrightId))
            return false;
        TDoorgrpoperrightId castOther = (TDoorgrpoperrightId) other;

        return ((this.getGroupid() == castOther.getGroupid()) || (this.getGroupid() != null
                && castOther.getGroupid() != null && this
                .getGroupid()
                .equals(
                        castOther
                                .getGroupid())))
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

        result = 37 * result + (getGroupid() == null ? 0 : this.getGroupid().hashCode());
        result = 37 * result + (getOpercode() == null ? 0 : this.getOpercode().hashCode());
        return result;
    }

}