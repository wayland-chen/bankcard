package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TIssuedmealsubsidyId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TIssuedmealsubsidyId implements java.io.Serializable {

    // Fields

    private Long issuedbatchno;
    private Integer custid;

    // Constructors

    /**
     * default constructor
     */
    public TIssuedmealsubsidyId() {
    }

    /**
     * full constructor
     */
    public TIssuedmealsubsidyId(Long issuedbatchno, Integer custid) {
        this.issuedbatchno = issuedbatchno;
        this.custid = custid;
    }

    // Property accessors

    @Column(name = "ISSUEDBATCHNO", nullable = false, precision = 22, scale = 0)
    public Long getIssuedbatchno() {
        return this.issuedbatchno;
    }

    public void setIssuedbatchno(Long issuedbatchno) {
        this.issuedbatchno = issuedbatchno;
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
        if (!(other instanceof TIssuedmealsubsidyId))
            return false;
        TIssuedmealsubsidyId castOther = (TIssuedmealsubsidyId) other;

        return ((this.getIssuedbatchno() == castOther.getIssuedbatchno()) || (this
                .getIssuedbatchno() != null
                && castOther.getIssuedbatchno() != null && this
                .getIssuedbatchno().equals(castOther.getIssuedbatchno())))
                && ((this.getCustid() == castOther.getCustid()) || (this
                .getCustid() != null && castOther.getCustid() != null && this
                .getCustid().equals(castOther.getCustid())));
    }

    public int hashCode() {
        int result = 17;

        result = 37
                * result
                + (getIssuedbatchno() == null ? 0 : this.getIssuedbatchno()
                .hashCode());
        result = 37 * result
                + (getCustid() == null ? 0 : this.getCustid().hashCode());
        return result;
    }

}