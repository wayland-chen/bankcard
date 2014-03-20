package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TPosseqnoId entity.
 */
@Embeddable
public class TPosseqnoId implements java.io.Serializable {

    // Fields    

    private Integer deviceid;
    private Integer devseqno;
    private String transdate;

    // Constructors

    /**
     * default constructor
     */
    public TPosseqnoId() {
    }

    /**
     * full constructor
     */
    public TPosseqnoId(Integer deviceid, Integer devseqno, String transdate) {
        this.deviceid = deviceid;
        this.devseqno = devseqno;
        this.transdate = transdate;
    }

    // Property accessors

    @Column(name = "DEVICEID", nullable = false)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "DEVSEQNO", nullable = false)
    public Integer getDevseqno() {
        return this.devseqno;
    }

    public void setDevseqno(Integer devseqno) {
        this.devseqno = devseqno;
    }

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TPosseqnoId))
            return false;
        TPosseqnoId castOther = (TPosseqnoId) other;

        return ((this.getDeviceid() == castOther.getDeviceid()) || (this.getDeviceid() != null
                && castOther.getDeviceid() != null && this
                .getDeviceid()
                .equals(
                        castOther
                                .getDeviceid())))
                && ((this.getDevseqno() == castOther.getDevseqno()) || (this.getDevseqno() != null
                && castOther.getDevseqno() != null && this
                .getDevseqno()
                .equals(
                        castOther
                                .getDevseqno())))
                && ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        result = 37 * result + (getDevseqno() == null ? 0 : this.getDevseqno().hashCode());
        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        return result;
    }

}