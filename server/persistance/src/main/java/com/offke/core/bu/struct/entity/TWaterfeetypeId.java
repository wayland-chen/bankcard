package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TWaterfeetypeId entity.
 */
@Embeddable
public class TWaterfeetypeId implements java.io.Serializable {

    // Fields    

    private Integer feeid;
    private Integer feetype;

    // Constructors

    /**
     * default constructor
     */
    public TWaterfeetypeId() {
    }

    /**
     * full constructor
     */
    public TWaterfeetypeId(Integer feeid, Integer feetype) {
        this.feeid = feeid;
        this.feetype = feetype;
    }

    // Property accessors

    @Column(name = "FEEID", nullable = false)
    public Integer getFeeid() {
        return this.feeid;
    }

    public void setFeeid(Integer feeid) {
        this.feeid = feeid;
    }

    @Column(name = "FEETYPE", nullable = false)
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TWaterfeetypeId))
            return false;
        TWaterfeetypeId castOther = (TWaterfeetypeId) other;

        return ((this.getFeeid() == castOther.getFeeid()) || (this.getFeeid() != null
                && castOther.getFeeid() != null && this
                .getFeeid()
                .equals(
                        castOther
                                .getFeeid())))
                && ((this.getFeetype() == castOther.getFeetype()) || (this.getFeetype() != null
                && castOther.getFeetype() != null && this
                .getFeetype()
                .equals(
                        castOther
                                .getFeetype())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getFeeid() == null ? 0 : this.getFeeid().hashCode());
        result = 37 * result + (getFeetype() == null ? 0 : this.getFeetype().hashCode());
        return result;
    }

}