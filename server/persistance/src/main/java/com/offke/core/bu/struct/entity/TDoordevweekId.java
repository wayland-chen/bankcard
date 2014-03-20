package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDoordevweekId entity.
 */
@Embeddable
public class TDoordevweekId implements java.io.Serializable {

    // Fields    

    private Integer majordevid;
    private Integer minordevid;
    private Integer weekid;

    // Constructors

    /**
     * default constructor
     */
    public TDoordevweekId() {
    }

    /**
     * full constructor
     */
    public TDoordevweekId(Integer majordevid, Integer minordevid, Integer weekid) {
        this.majordevid = majordevid;
        this.minordevid = minordevid;
        this.weekid = weekid;
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
        if (!(other instanceof TDoordevweekId))
            return false;
        TDoordevweekId castOther = (TDoordevweekId) other;

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

        result = 37 * result + (getMajordevid() == null ? 0 : this.getMajordevid().hashCode());
        result = 37 * result + (getMinordevid() == null ? 0 : this.getMinordevid().hashCode());
        result = 37 * result + (getWeekid() == null ? 0 : this.getWeekid().hashCode());
        return result;
    }

}