package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class TDoordevtimeId implements java.io.Serializable {

    // Fields    

    private Integer majordevid;
    private Integer minordevid;
    private Integer timeid;

    // Constructors

    /**
     * default constructor
     */
    public TDoordevtimeId() {
    }

    /**
     * full constructor
     */
    public TDoordevtimeId(Integer majordevid, Integer minordevid, Integer timeid) {
        this.majordevid = majordevid;
        this.minordevid = minordevid;
        this.timeid = timeid;
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

    @Column(name = "TIMEID", nullable = false)
    public Integer getTimeid() {
        return this.timeid;
    }

    public void setTimeid(Integer timeid) {
        this.timeid = timeid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDoordevtimeId))
            return false;
        TDoordevtimeId castOther = (TDoordevtimeId) other;

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
                && ((this.getTimeid() == castOther.getTimeid()) || (this.getTimeid() != null
                && castOther.getTimeid() != null && this
                .getTimeid()
                .equals(
                        castOther
                                .getTimeid())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getMajordevid() == null ? 0 : this.getMajordevid().hashCode());
        result = 37 * result + (getMinordevid() == null ? 0 : this.getMinordevid().hashCode());
        result = 37 * result + (getTimeid() == null ? 0 : this.getTimeid().hashCode());
        return result;
    }

}