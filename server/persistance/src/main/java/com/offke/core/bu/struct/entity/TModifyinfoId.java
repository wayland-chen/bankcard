package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TModifyinfoId entity.
 */
@Embeddable
public class TModifyinfoId implements java.io.Serializable {

    // Fields    

    private Integer custid;
    private String stuempno;
    private String enrollno;

    // Constructors

    /**
     * default constructor
     */
    public TModifyinfoId() {
    }

    /**
     * full constructor
     */
    public TModifyinfoId(Integer custid, String stuempno, String enrollno) {
        this.custid = custid;
        this.stuempno = stuempno;
        this.enrollno = enrollno;
    }

    // Property accessors

    @Column(name = "CUSTID", nullable = false)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "STUEMPNO", nullable = false, length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "ENROLLNO", nullable = false, length = 30)
    public String getEnrollno() {
        return this.enrollno;
    }

    public void setEnrollno(String enrollno) {
        this.enrollno = enrollno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TModifyinfoId))
            return false;
        TModifyinfoId castOther = (TModifyinfoId) other;

        return ((this.getCustid() == castOther.getCustid()) || (this.getCustid() != null
                && castOther.getCustid() != null && this
                .getCustid()
                .equals(
                        castOther
                                .getCustid())))
                && ((this.getStuempno() == castOther.getStuempno()) || (this.getStuempno() != null
                && castOther.getStuempno() != null && this
                .getStuempno()
                .equals(
                        castOther
                                .getStuempno())))
                && ((this.getEnrollno() == castOther.getEnrollno()) || (this.getEnrollno() != null
                && castOther.getEnrollno() != null && this
                .getEnrollno()
                .equals(
                        castOther
                                .getEnrollno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCustid() == null ? 0 : this.getCustid().hashCode());
        result = 37 * result + (getStuempno() == null ? 0 : this.getStuempno().hashCode());
        result = 37 * result + (getEnrollno() == null ? 0 : this.getEnrollno().hashCode());
        return result;
    }

}