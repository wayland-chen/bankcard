package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TCustidctlId entity.
 */
@Embeddable
public class TCustidctlId implements java.io.Serializable {

    // Fields    

    private String areacode;
    private Integer startno;

    // Constructors

    /**
     * default constructor
     */
    public TCustidctlId() {
    }

    /**
     * full constructor
     */
    public TCustidctlId(String areacode, Integer startno) {
        this.areacode = areacode;
        this.startno = startno;
    }

    // Property accessors

    @Column(name = "AREACODE", nullable = false, length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Column(name = "STARTNO", nullable = false)
    public Integer getStartno() {
        return this.startno;
    }

    public void setStartno(Integer startno) {
        this.startno = startno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCustidctlId))
            return false;
        TCustidctlId castOther = (TCustidctlId) other;

        return ((this.getAreacode() == castOther.getAreacode()) || (this.getAreacode() != null
                && castOther.getAreacode() != null && this
                .getAreacode()
                .equals(
                        castOther
                                .getAreacode())))
                && ((this.getStartno() == castOther.getStartno()) || (this.getStartno() != null
                && castOther.getStartno() != null && this
                .getStartno()
                .equals(
                        castOther
                                .getStartno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAreacode() == null ? 0 : this.getAreacode().hashCode());
        result = 37 * result + (getStartno() == null ? 0 : this.getStartno().hashCode());
        return result;
    }

}