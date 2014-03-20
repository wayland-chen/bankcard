package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class TDoordevtimegrpId implements java.io.Serializable {

    // Fields    

    private Integer majordevid;
    private Integer minordevid;
    private Integer timegrpid;

    // Constructors

    /**
     * default constructor
     */
    public TDoordevtimegrpId() {
    }

    /**
     * full constructor
     */
    public TDoordevtimegrpId(Integer majordevid, Integer minordevid, Integer timegrpid) {
        this.majordevid = majordevid;
        this.minordevid = minordevid;
        this.timegrpid = timegrpid;
    }

    // Property accessors

    @Column(name = "MAJORDEVID", nullable = false)
    public Integer getMajordevid() {
        return this.majordevid;
    }

    public void setMajordevid(Integer majordevid) {
        this.majordevid = majordevid;
    }

    @Column(name = "MINORDEVID", nullable = false)
    public Integer getMinordevid() {
        return this.minordevid;
    }

    public void setMinordevid(Integer minordevid) {
        this.minordevid = minordevid;
    }

    @Column(name = "TIMEGRPID", nullable = false)
    public Integer getTimegrpid() {
        return this.timegrpid;
    }

    public void setTimegrpid(Integer timegrpid) {
        this.timegrpid = timegrpid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDoordevtimegrpId))
            return false;
        TDoordevtimegrpId castOther = (TDoordevtimegrpId) other;

        return ((this.getMajordevid() == castOther.getMajordevid()) || (this.getMajordevid() != null
                && castOther.getMajordevid() != null && this
                .getMajordevid()
                .equals(
                        castOther
                                .getMajordevid())))
                && ((this.getMinordevid() == castOther.getMinordevid()) || (this.getMinordevid() != null
                && castOther.getMinordevid() != null && this
                .getMinordevid()
                .equals(
                        castOther
                                .getMinordevid())))
                && ((this.getTimegrpid() == castOther.getTimegrpid()) || (this.getTimegrpid() != null
                && castOther.getTimegrpid() != null && this
                .getTimegrpid()
                .equals(
                        castOther
                                .getTimegrpid())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getMajordevid() == null ? 0 : this.getMajordevid().hashCode());
        result = 37 * result + (getMinordevid() == null ? 0 : this.getMinordevid().hashCode());
        result = 37 * result + (getTimegrpid() == null ? 0 : this.getTimegrpid().hashCode());
        return result;
    }

}