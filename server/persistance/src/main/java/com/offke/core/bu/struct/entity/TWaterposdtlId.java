package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TWaterposdtlId entity.
 */
@Embeddable
public class TWaterposdtlId implements java.io.Serializable {

    // Fields    

    private String transdate;
    private String devphyid;
    private Integer devseqno;
    private Integer cardno;

    // Constructors

    /**
     * default constructor
     */
    public TWaterposdtlId() {
    }

    /**
     * full constructor
     */
    public TWaterposdtlId(String transdate, String devphyid, Integer devseqno, Integer cardno) {
        this.transdate = transdate;
        this.devphyid = devphyid;
        this.devseqno = devseqno;
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

    @Column(name = "DEVPHYID", nullable = false, length = 20)
    public String getDevphyid() {
        return this.devphyid;
    }

    public void setDevphyid(String devphyid) {
        this.devphyid = devphyid;
    }

    @Column(name = "DEVSEQNO", nullable = false)
    public Integer getDevseqno() {
        return this.devseqno;
    }

    public void setDevseqno(Integer devseqno) {
        this.devseqno = devseqno;
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
        if (!(other instanceof TWaterposdtlId))
            return false;
        TWaterposdtlId castOther = (TWaterposdtlId) other;

        return ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
                && ((this.getDevphyid() == castOther.getDevphyid()) || (this.getDevphyid() != null
                && castOther.getDevphyid() != null && this
                .getDevphyid()
                .equals(
                        castOther
                                .getDevphyid())))
                && ((this.getDevseqno() == castOther.getDevseqno()) || (this.getDevseqno() != null
                && castOther.getDevseqno() != null && this
                .getDevseqno()
                .equals(
                        castOther
                                .getDevseqno())))
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
        result = 37 * result + (getDevphyid() == null ? 0 : this.getDevphyid().hashCode());
        result = 37 * result + (getDevseqno() == null ? 0 : this.getDevseqno().hashCode());
        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        return result;
    }

}