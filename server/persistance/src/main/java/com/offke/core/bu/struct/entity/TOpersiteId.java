package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TOpersiteId entity.
 */
@Embeddable
public class TOpersiteId implements java.io.Serializable {

    // Fields    

    private String opercode;
    private Integer siteno;

    // Constructors

    /**
     * default constructor
     */
    public TOpersiteId() {
    }

    /**
     * full constructor
     */
    public TOpersiteId(String opercode, Integer siteno) {
        this.opercode = opercode;
        this.siteno = siteno;
    }

    // Property accessors

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "SITENO", nullable = false)
    public Integer getSiteno() {
        return this.siteno;
    }

    public void setSiteno(Integer siteno) {
        this.siteno = siteno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TOpersiteId))
            return false;
        TOpersiteId castOther = (TOpersiteId) other;

        return ((this.getOpercode() == castOther.getOpercode()) || (this.getOpercode() != null
                && castOther.getOpercode() != null && this
                .getOpercode()
                .equals(
                        castOther
                                .getOpercode())))
                && ((this.getSiteno() == castOther.getSiteno()) || (this.getSiteno() != null
                && castOther.getSiteno() != null && this
                .getSiteno()
                .equals(
                        castOther
                                .getSiteno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getOpercode() == null ? 0 : this.getOpercode().hashCode());
        result = 37 * result + (getSiteno() == null ? 0 : this.getSiteno().hashCode());
        return result;
    }

}