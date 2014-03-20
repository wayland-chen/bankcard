package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TTranspackId entity.
 */
@Embeddable
public class TTranspackId implements java.io.Serializable {

    // Fields    

    private String packetid;
    private String reqid;

    // Constructors

    /**
     * default constructor
     */
    public TTranspackId() {
    }

    /**
     * full constructor
     */
    public TTranspackId(String packetid, String reqid) {
        this.packetid = packetid;
        this.reqid = reqid;
    }

    // Property accessors

    @Column(name = "PACKETID", nullable = false, length = 20)
    public String getPacketid() {
        return this.packetid;
    }

    public void setPacketid(String packetid) {
        this.packetid = packetid;
    }

    @Column(name = "REQID", nullable = false, length = 20)
    public String getReqid() {
        return this.reqid;
    }

    public void setReqid(String reqid) {
        this.reqid = reqid;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TTranspackId))
            return false;
        TTranspackId castOther = (TTranspackId) other;

        return ((this.getPacketid() == castOther.getPacketid()) || (this.getPacketid() != null
                && castOther.getPacketid() != null && this
                .getPacketid()
                .equals(
                        castOther
                                .getPacketid())))
                && ((this.getReqid() == castOther.getReqid()) || (this.getReqid() != null
                && castOther.getReqid() != null && this
                .getReqid()
                .equals(
                        castOther
                                .getReqid())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getPacketid() == null ? 0 : this.getPacketid().hashCode());
        result = 37 * result + (getReqid() == null ? 0 : this.getReqid().hashCode());
        return result;
    }

}