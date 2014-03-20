package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDoordevholidayId entity.
 */
@Embeddable
public class TDoordevholidayId implements java.io.Serializable {

    // Fields    

    private Integer majordevid;
    private Integer minordevid;
    private Integer holidayid;

    // Constructors

    /**
     * default constructor
     */
    public TDoordevholidayId() {
    }

    /**
     * full constructor
     */
    public TDoordevholidayId(Integer majordevid, Integer minordevid, Integer holidayid) {
        this.majordevid = majordevid;
        this.minordevid = minordevid;
        this.holidayid = holidayid;
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

    @Column(name = "HOLIDAYID", nullable = false)
    public Integer getHolidayid() {
        return this.holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDoordevholidayId))
            return false;
        TDoordevholidayId castOther = (TDoordevholidayId) other;

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
                && ((this.getHolidayid() == castOther.getHolidayid()) || (this.getHolidayid() != null
                && castOther.getHolidayid() != null && this
                .getHolidayid()
                .equals(
                        castOther
                                .getHolidayid())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getMajordevid() == null ? 0 : this.getMajordevid().hashCode());
        result = 37 * result + (getMinordevid() == null ? 0 : this.getMinordevid().hashCode());
        result = 37 * result + (getHolidayid() == null ? 0 : this.getHolidayid().hashCode());
        return result;
    }

}