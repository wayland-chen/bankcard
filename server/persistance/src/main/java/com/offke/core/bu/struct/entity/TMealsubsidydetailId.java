package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TMealsubsidydetailId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TMealsubsidydetailId implements java.io.Serializable {

    // Fields

    private String countmonth;
    private Integer custid;
    private String transdate;

    // Constructors

    /**
     * default constructor
     */
    public TMealsubsidydetailId() {
    }

    /**
     * full constructor
     */
    public TMealsubsidydetailId(String countmonth, Integer custid,
                                String transdate) {
        this.countmonth = countmonth;
        this.custid = custid;
        this.transdate = transdate;
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

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TMealsubsidydetailId))
            return false;
        TMealsubsidydetailId castOther = (TMealsubsidydetailId) other;

        return ((this.getCountmonth() == castOther.getCountmonth()) || (this
                .getCountmonth() != null && castOther.getCountmonth() != null && this
                .getCountmonth().equals(castOther.getCountmonth())))
                && ((this.getCustid() == castOther.getCustid()) || (this
                .getCustid() != null && castOther.getCustid() != null && this
                .getCustid().equals(castOther.getCustid())))
                && ((this.getTransdate() == castOther.getTransdate()) || (this
                .getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate().equals(castOther.getTransdate())));
    }

    public int hashCode() {
        int result = 17;

        result = 37
                * result
                + (getCountmonth() == null ? 0 : this.getCountmonth()
                .hashCode());
        result = 37 * result
                + (getCustid() == null ? 0 : this.getCustid().hashCode());
        result = 37 * result
                + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        return result;
    }

}