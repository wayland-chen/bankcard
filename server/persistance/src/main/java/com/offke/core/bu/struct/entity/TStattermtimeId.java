package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TStattermtimeId entity.
 */
@Embeddable
public class TStattermtimeId implements java.io.Serializable {

    // Fields    

    private Integer settledate;
    private Integer termid;
    private Integer transdate;
    private Byte timeid;

    // Constructors

    /**
     * default constructor
     */
    public TStattermtimeId() {
    }

    /**
     * full constructor
     */
    public TStattermtimeId(Integer settledate, Integer termid, Integer transdate, Byte timeid) {
        this.settledate = settledate;
        this.termid = termid;
        this.transdate = transdate;
        this.timeid = timeid;
    }

    // Property accessors

    @Column(name = "SETTLEDATE", nullable = false, precision = 8, scale = 0)
    public Integer getSettledate() {
        return this.settledate;
    }

    public void setSettledate(Integer settledate) {
        this.settledate = settledate;
    }

    @Column(name = "TERMID", nullable = false)
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "TRANSDATE", nullable = false, precision = 8, scale = 0)
    public Integer getTransdate() {
        return this.transdate;
    }

    public void setTransdate(Integer transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TIMEID", nullable = false, precision = 2, scale = 0)
    public Byte getTimeid() {
        return this.timeid;
    }

    public void setTimeid(Byte timeid) {
        this.timeid = timeid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TStattermtimeId))
            return false;
        TStattermtimeId castOther = (TStattermtimeId) other;

        return ((this.getSettledate() == castOther.getSettledate()) || (this.getSettledate() != null
                && castOther.getSettledate() != null && this
                .getSettledate()
                .equals(
                        castOther
                                .getSettledate())))
                && ((this.getTermid() == castOther.getTermid()) || (this.getTermid() != null
                && castOther.getTermid() != null && this
                .getTermid()
                .equals(
                        castOther
                                .getTermid())))
                && ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
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

        result = 37 * result + (getSettledate() == null ? 0 : this.getSettledate().hashCode());
        result = 37 * result + (getTermid() == null ? 0 : this.getTermid().hashCode());
        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result + (getTimeid() == null ? 0 : this.getTimeid().hashCode());
        return result;
    }

}