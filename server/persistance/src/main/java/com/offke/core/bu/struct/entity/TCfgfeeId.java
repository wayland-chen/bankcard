package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TCfgfeeId implements java.io.Serializable {

    private Integer feetype;
    private Integer transcode;
    private Integer cardtype;
    private Integer transtype;

    // Constructors

    /**
     * default constructor
     */
    public TCfgfeeId() {
    }

    /**
     * full constructor
     */
    public TCfgfeeId(Integer feetype, Integer transcode, Integer cardtype, Integer transtype) {
        this.feetype = feetype;
        this.transcode = transcode;
        this.cardtype = cardtype;
        this.transtype = transtype;
    }

    // Property accessors

    @Column(name = "FEETYPE", nullable = false)
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "TRANSCODE", nullable = false)
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "CARDTYPE", nullable = false)
    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Column(name = "TRANSTYPE", nullable = false)
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCfgfeeId))
            return false;
        TCfgfeeId castOther = (TCfgfeeId) other;

        return ((this.getFeetype() == castOther.getFeetype()) || (this.getFeetype() != null
                && castOther.getFeetype() != null && this
                .getFeetype()
                .equals(
                        castOther
                                .getFeetype())))
                && ((this.getTranscode() == castOther.getTranscode()) || (this.getTranscode() != null
                && castOther.getTranscode() != null && this
                .getTranscode()
                .equals(
                        castOther
                                .getTranscode())))
                && ((this.getCardtype() == castOther.getCardtype()) || (this.getCardtype() != null
                && castOther.getCardtype() != null && this
                .getCardtype()
                .equals(
                        castOther
                                .getCardtype())))
                && ((this.getTranstype() == castOther.getTranstype()) || (this.getTranstype() != null
                && castOther.getTranstype() != null && this
                .getTranstype()
                .equals(
                        castOther
                                .getTranstype())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getFeetype() == null ? 0 : this.getFeetype().hashCode());
        result = 37 * result + (getTranscode() == null ? 0 : this.getTranscode().hashCode());
        result = 37 * result + (getCardtype() == null ? 0 : this.getCardtype().hashCode());
        result = 37 * result + (getTranstype() == null ? 0 : this.getTranstype().hashCode());
        return result;
    }

}