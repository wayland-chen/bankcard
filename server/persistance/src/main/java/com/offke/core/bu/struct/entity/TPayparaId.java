package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TPayparaId entity.
 */
@Embeddable
public class TPayparaId implements java.io.Serializable {

    // Fields    

    private String paraname;
    private Integer paycode;

    // Constructors

    /**
     * default constructor
     */
    public TPayparaId() {
    }

    /**
     * full constructor
     */
    public TPayparaId(String paraname, Integer paycode) {
        this.paraname = paraname;
        this.paycode = paycode;
    }

    // Property accessors

    @Column(name = "PARANAME", nullable = false, length = 60)
    public String getParaname() {
        return this.paraname;
    }

    public void setParaname(String paraname) {
        this.paraname = paraname;
    }

    @Column(name = "PAYCODE", nullable = false)
    public Integer getPaycode() {
        return this.paycode;
    }

    public void setPaycode(Integer paycode) {
        this.paycode = paycode;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TPayparaId))
            return false;
        TPayparaId castOther = (TPayparaId) other;

        return ((this.getParaname() == castOther.getParaname()) || (this.getParaname() != null
                && castOther.getParaname() != null && this
                .getParaname()
                .equals(
                        castOther
                                .getParaname())))
                && ((this.getPaycode() == castOther.getPaycode()) || (this.getPaycode() != null
                && castOther.getPaycode() != null && this
                .getPaycode()
                .equals(
                        castOther
                                .getPaycode())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getParaname() == null ? 0 : this.getParaname().hashCode());
        result = 37 * result + (getPaycode() == null ? 0 : this.getPaycode().hashCode());
        return result;
    }

}