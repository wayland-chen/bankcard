package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TBankchkbillId implements java.io.Serializable {

    // Fields    

    private String transdate;
    private String bankcardno;
    private String banksn;
    private Integer cardno;

    // Constructors

    /**
     * default constructor
     */
    public TBankchkbillId() {
    }

    /**
     * full constructor
     */
    public TBankchkbillId(String transdate, String bankcardno, String banksn, Integer cardno) {
        this.transdate = transdate;
        this.bankcardno = bankcardno;
        this.banksn = banksn;
        this.cardno = cardno;
    }

    // Property accessors

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "BANKCARDNO", nullable = false, length = 30)
    public String getBankcardno() {
        return this.bankcardno;
    }

    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno;
    }

    @Column(name = "BANKSN", nullable = false, length = 30)
    public String getBanksn() {
        return this.banksn;
    }

    public void setBanksn(String banksn) {
        this.banksn = banksn;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TBankchkbillId))
            return false;
        TBankchkbillId castOther = (TBankchkbillId) other;

        return ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
                && ((this.getBankcardno() == castOther.getBankcardno()) || (this.getBankcardno() != null
                && castOther.getBankcardno() != null && this
                .getBankcardno()
                .equals(
                        castOther
                                .getBankcardno())))
                && ((this.getBanksn() == castOther.getBanksn()) || (this.getBanksn() != null
                && castOther.getBanksn() != null && this
                .getBanksn()
                .equals(
                        castOther
                                .getBanksn())))
                && ((this.getCardno() == castOther.getCardno()) || (this.getCardno() != null
                && castOther.getCardno() != null && this
                .getCardno()
                .equals(
                        castOther
                                .getCardno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result + (getBankcardno() == null ? 0 : this.getBankcardno().hashCode());
        result = 37 * result + (getBanksn() == null ? 0 : this.getBanksn().hashCode());
        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        return result;
    }

}