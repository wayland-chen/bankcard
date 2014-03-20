package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TOperauthId entity.
 */
@Embeddable
public class TOperauthId implements java.io.Serializable {

    // Fields    

    private String opercode;
    private Integer authtype;

    // Constructors

    /**
     * default constructor
     */
    public TOperauthId() {
    }

    /**
     * full constructor
     */
    public TOperauthId(String opercode, Integer authtype) {
        this.opercode = opercode;
        this.authtype = authtype;
    }

    // Property accessors

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "AUTHTYPE", nullable = false)
    public Integer getAuthtype() {
        return this.authtype;
    }

    public void setAuthtype(Integer authtype) {
        this.authtype = authtype;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TOperauthId))
            return false;
        TOperauthId castOther = (TOperauthId) other;

        return ((this.getOpercode() == castOther.getOpercode()) || (this.getOpercode() != null
                && castOther.getOpercode() != null && this
                .getOpercode()
                .equals(
                        castOther
                                .getOpercode())))
                && ((this.getAuthtype() == castOther.getAuthtype()) || (this.getAuthtype() != null
                && castOther.getAuthtype() != null && this
                .getAuthtype()
                .equals(
                        castOther
                                .getAuthtype())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getOpercode() == null ? 0 : this.getOpercode().hashCode());
        result = 37 * result + (getAuthtype() == null ? 0 : this.getAuthtype().hashCode());
        return result;
    }

}