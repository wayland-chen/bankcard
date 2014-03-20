package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TMealsubsidyaccId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TMealsubsidyaccId implements java.io.Serializable {

    // Fields

    private String countmonth;
    private Integer custid;

    // Constructors

    /**
     * default constructor
     */
    public TMealsubsidyaccId() {
    }

    /**
     * full constructor
     */
    public TMealsubsidyaccId(String countmonth, Integer custid) {
        this.countmonth = countmonth;
        this.custid = custid;
    }

    // Property accessors

    @Column(name = "COUNTMONTH", nullable = false, length = 6)
    public String getCountmonth() {
        return this.countmonth;
    }

    public void setCountmonth(String countmonth) {
        this.countmonth = countmonth;
    }

    @Column(name = "CUSTID", nullable = false, precision = 22, scale = 0)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TMealsubsidyaccId))
            return false;
        TMealsubsidyaccId castOther = (TMealsubsidyaccId) other;

        return ((this.getCountmonth() == castOther.getCountmonth()) || (this
                .getCountmonth() != null && castOther.getCountmonth() != null && this
                .getCountmonth().equals(castOther.getCountmonth())))
                && ((this.getCustid() == castOther.getCustid()) || (this
                .getCustid() != null && castOther.getCustid() != null && this
                .getCustid().equals(castOther.getCustid())));
    }

    public int hashCode() {
        int result = 17;

        result = 37
                * result
                + (getCountmonth() == null ? 0 : this.getCountmonth()
                .hashCode());
        result = 37 * result
                + (getCustid() == null ? 0 : this.getCustid().hashCode());
        return result;
    }

}