package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TBankcardId implements java.io.Serializable {

    // Fields    

    private Integer custid;
    private String bankcardno;

    // Constructors

    /**
     * default constructor
     */
    public TBankcardId() {
    }

    /**
     * full constructor
     */
    public TBankcardId(Integer custid, String bankcardno) {
        this.custid = custid;
        this.bankcardno = bankcardno;
    }

    // Property accessors

    @Column(name = "CUSTID", unique = true, nullable = false)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "BANKCARDNO", nullable = false, length = 30)
    public String getBankcardno() {
        return this.bankcardno;
    }

    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TBankcardId))
            return false;
        TBankcardId castOther = (TBankcardId) other;

        return ((this.getCustid() == castOther.getCustid()) || (this.getCustid() != null
                && castOther.getCustid() != null && this
                .getCustid()
                .equals(
                        castOther
                                .getCustid())))
                && ((this.getBankcardno() == castOther.getBankcardno()) || (this.getBankcardno() != null
                && castOther.getBankcardno() != null && this
                .getBankcardno()
                .equals(
                        castOther
                                .getBankcardno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCustid() == null ? 0 : this.getCustid().hashCode());
        result = 37 * result + (getBankcardno() == null ? 0 : this.getBankcardno().hashCode());
        return result;
    }

}