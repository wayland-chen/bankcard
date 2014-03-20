package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDoorholidaytimeId entity.
 */
@Embeddable
public class TDoorholidaytimeId implements java.io.Serializable {

    // Fields    

    private Integer holidayid;
    private String holidaydate;

    // Constructors

    /**
     * default constructor
     */
    public TDoorholidaytimeId() {
    }

    /**
     * full constructor
     */
    public TDoorholidaytimeId(Integer holidayid, String holidaydate) {
        this.holidayid = holidayid;
        this.holidaydate = holidaydate;
    }

    // Property accessors

    @Column(name = "HOLIDAYID", nullable = false)
    public Integer getHolidayid() {
        return this.holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    @Column(name = "HOLIDAYDATE", nullable = false, length = 8)
    public String getHolidaydate() {
        return this.holidaydate;
    }

    public void setHolidaydate(String holidaydate) {
        this.holidaydate = holidaydate;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDoorholidaytimeId))
            return false;
        TDoorholidaytimeId castOther = (TDoorholidaytimeId) other;

        return ((this.getHolidayid() == castOther.getHolidayid()) || (this.getHolidayid() != null
                && castOther.getHolidayid() != null && this
                .getHolidayid()
                .equals(
                        castOther
                                .getHolidayid())))
                && ((this.getHolidaydate() == castOther.getHolidaydate()) || (this.getHolidaydate() != null
                && castOther.getHolidaydate() != null && this
                .getHolidaydate()
                .equals(
                        castOther
                                .getHolidaydate())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getHolidayid() == null ? 0 : this.getHolidayid().hashCode());
        result = 37 * result + (getHolidaydate() == null ? 0 : this.getHolidaydate().hashCode());
        return result;
    }

}