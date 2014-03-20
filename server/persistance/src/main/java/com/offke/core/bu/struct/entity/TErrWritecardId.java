package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * TErrWritecardId entity.
 */
@Embeddable
public class TErrWritecardId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private String acctime;
    private Integer termid;
    private Long termseqno;
    private String transdate;
    private String transdate1;
    private String transtime;
    private String transtime1;
    private Integer transcode;
    private Integer transcode1;
    private Integer cardno;
    private Integer cardcnt;
    private Integer cardcnt1;
    private BigDecimal cardbefbal;
    private BigDecimal cardaftbal;
    private BigDecimal cardbefbal1;
    private BigDecimal cardaftbal1;
    private BigDecimal amount;
    private String devphyid;
    private Integer devseqno;
    private String status;
    private Integer errcode;
    private BigDecimal cardbal;
    private BigDecimal availbal;

    // Constructors

    /**
     * default constructor
     */
    public TErrWritecardId() {
    }

    /**
     * full constructor
     */
    public TErrWritecardId(
            String accdate,
            String acctime,
            Integer termid,
            Long termseqno,
            String transdate,
            String transdate1,
            String transtime,
            String transtime1,
            Integer transcode,
            Integer transcode1,
            Integer cardno,
            Integer cardcnt,
            Integer cardcnt1,
            BigDecimal cardbefbal,
            BigDecimal cardaftbal,
            BigDecimal cardbefbal1,
            BigDecimal cardaftbal1,
            BigDecimal amount,
            String devphyid,
            Integer devseqno,
            String status,
            Integer errcode,
            BigDecimal cardbal,
            BigDecimal availbal) {
        this.accdate = accdate;
        this.acctime = acctime;
        this.termid = termid;
        this.termseqno = termseqno;
        this.transdate = transdate;
        this.transdate1 = transdate1;
        this.transtime = transtime;
        this.transtime1 = transtime1;
        this.transcode = transcode;
        this.transcode1 = transcode1;
        this.cardno = cardno;
        this.cardcnt = cardcnt;
        this.cardcnt1 = cardcnt1;
        this.cardbefbal = cardbefbal;
        this.cardaftbal = cardaftbal;
        this.cardbefbal1 = cardbefbal1;
        this.cardaftbal1 = cardaftbal1;
        this.amount = amount;
        this.devphyid = devphyid;
        this.devseqno = devseqno;
        this.status = status;
        this.errcode = errcode;
        this.cardbal = cardbal;
        this.availbal = availbal;
    }

    // Property accessors

    @Column(name = "ACCDATE", length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "ACCTIME", length = 6)
    public String getAcctime() {
        return this.acctime;
    }

    public void setAcctime(String acctime) {
        this.acctime = acctime;
    }

    @Column(name = "TERMID")
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "TERMSEQNO")
    public Long getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(Long termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSDATE1", length = 8)
    public String getTransdate1() {
        return this.transdate1;
    }

    public void setTransdate1(String transdate1) {
        this.transdate1 = transdate1;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "TRANSTIME1", length = 6)
    public String getTranstime1() {
        return this.transtime1;
    }

    public void setTranstime1(String transtime1) {
        this.transtime1 = transtime1;
    }

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "TRANSCODE1")
    public Integer getTranscode1() {
        return this.transcode1;
    }

    public void setTranscode1(Integer transcode1) {
        this.transcode1 = transcode1;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "CARDCNT")
    public Integer getCardcnt() {
        return this.cardcnt;
    }

    public void setCardcnt(Integer cardcnt) {
        this.cardcnt = cardcnt;
    }

    @Column(name = "CARDCNT1")
    public Integer getCardcnt1() {
        return this.cardcnt1;
    }

    public void setCardcnt1(Integer cardcnt1) {
        this.cardcnt1 = cardcnt1;
    }

    @Column(name = "CARDBEFBAL", precision = 38)
    public BigDecimal getCardbefbal() {
        return this.cardbefbal;
    }

    public void setCardbefbal(BigDecimal cardbefbal) {
        this.cardbefbal = cardbefbal;
    }

    @Column(name = "CARDAFTBAL", precision = 38)
    public BigDecimal getCardaftbal() {
        return this.cardaftbal;
    }

    public void setCardaftbal(BigDecimal cardaftbal) {
        this.cardaftbal = cardaftbal;
    }

    @Column(name = "CARDBEFBAL1", precision = 38)
    public BigDecimal getCardbefbal1() {
        return this.cardbefbal1;
    }

    public void setCardbefbal1(BigDecimal cardbefbal1) {
        this.cardbefbal1 = cardbefbal1;
    }

    @Column(name = "CARDAFTBAL1", precision = 38)
    public BigDecimal getCardaftbal1() {
        return this.cardaftbal1;
    }

    public void setCardaftbal1(BigDecimal cardaftbal1) {
        this.cardaftbal1 = cardaftbal1;
    }

    @Column(name = "AMOUNT", precision = 38)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "DEVPHYID", length = 20)
    public String getDevphyid() {
        return this.devphyid;
    }

    public void setDevphyid(String devphyid) {
        this.devphyid = devphyid;
    }

    @Column(name = "DEVSEQNO")
    public Integer getDevseqno() {
        return this.devseqno;
    }

    public void setDevseqno(Integer devseqno) {
        this.devseqno = devseqno;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "ERRCODE")
    public Integer getErrcode() {
        return this.errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    @Column(name = "CARDBAL", precision = 38)
    public BigDecimal getCardbal() {
        return this.cardbal;
    }

    public void setCardbal(BigDecimal cardbal) {
        this.cardbal = cardbal;
    }

    @Column(name = "AVAILBAL", precision = 38)
    public BigDecimal getAvailbal() {
        return this.availbal;
    }

    public void setAvailbal(BigDecimal availbal) {
        this.availbal = availbal;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TErrWritecardId))
            return false;
        TErrWritecardId castOther = (TErrWritecardId) other;

        return ((this.getAccdate() == castOther.getAccdate()) || (this.getAccdate() != null
                && castOther.getAccdate() != null && this
                .getAccdate()
                .equals(
                        castOther
                                .getAccdate())))
                && ((this.getAcctime() == castOther.getAcctime()) || (this.getAcctime() != null
                && castOther.getAcctime() != null && this
                .getAcctime()
                .equals(
                        castOther
                                .getAcctime())))
                && ((this.getTermid() == castOther.getTermid()) || (this.getTermid() != null
                && castOther.getTermid() != null && this
                .getTermid()
                .equals(
                        castOther
                                .getTermid())))
                && ((this.getTermseqno() == castOther.getTermseqno()) || (this.getTermseqno() != null
                && castOther.getTermseqno() != null && this
                .getTermseqno()
                .equals(
                        castOther
                                .getTermseqno())))
                && ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
                && ((this.getTransdate1() == castOther.getTransdate1()) || (this.getTransdate1() != null
                && castOther.getTransdate1() != null && this
                .getTransdate1()
                .equals(
                        castOther
                                .getTransdate1())))
                && ((this.getTranstime() == castOther.getTranstime()) || (this.getTranstime() != null
                && castOther.getTranstime() != null && this
                .getTranstime()
                .equals(
                        castOther
                                .getTranstime())))
                && ((this.getTranstime1() == castOther.getTranstime1()) || (this.getTranstime1() != null
                && castOther.getTranstime1() != null && this
                .getTranstime1()
                .equals(
                        castOther
                                .getTranstime1())))
                && ((this.getTranscode() == castOther.getTranscode()) || (this.getTranscode() != null
                && castOther.getTranscode() != null && this
                .getTranscode()
                .equals(
                        castOther
                                .getTranscode())))
                && ((this.getTranscode1() == castOther.getTranscode1()) || (this.getTranscode1() != null
                && castOther.getTranscode1() != null && this
                .getTranscode1()
                .equals(
                        castOther
                                .getTranscode1())))
                && ((this.getCardno() == castOther.getCardno()) || (this.getCardno() != null
                && castOther.getCardno() != null && this
                .getCardno()
                .equals(
                        castOther
                                .getCardno())))
                && ((this.getCardcnt() == castOther.getCardcnt()) || (this.getCardcnt() != null
                && castOther.getCardcnt() != null && this
                .getCardcnt()
                .equals(
                        castOther
                                .getCardcnt())))
                && ((this.getCardcnt1() == castOther.getCardcnt1()) || (this.getCardcnt1() != null
                && castOther.getCardcnt1() != null && this
                .getCardcnt1()
                .equals(
                        castOther
                                .getCardcnt1())))
                && ((this.getCardbefbal() == castOther.getCardbefbal()) || (this.getCardbefbal() != null
                && castOther.getCardbefbal() != null && this
                .getCardbefbal()
                .equals(
                        castOther
                                .getCardbefbal())))
                && ((this.getCardaftbal() == castOther.getCardaftbal()) || (this.getCardaftbal() != null
                && castOther.getCardaftbal() != null && this
                .getCardaftbal()
                .equals(
                        castOther
                                .getCardaftbal())))
                && ((this.getCardbefbal1() == castOther.getCardbefbal1()) || (this.getCardbefbal1() != null
                && castOther.getCardbefbal1() != null && this
                .getCardbefbal1()
                .equals(
                        castOther
                                .getCardbefbal1())))
                && ((this.getCardaftbal1() == castOther.getCardaftbal1()) || (this.getCardaftbal1() != null
                && castOther.getCardaftbal1() != null && this
                .getCardaftbal1()
                .equals(
                        castOther
                                .getCardaftbal1())))
                && ((this.getAmount() == castOther.getAmount()) || (this.getAmount() != null
                && castOther.getAmount() != null && this
                .getAmount()
                .equals(
                        castOther
                                .getAmount())))
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
                && ((this.getStatus() == castOther.getStatus()) || (this.getStatus() != null
                && castOther.getStatus() != null && this
                .getStatus()
                .equals(
                        castOther
                                .getStatus())))
                && ((this.getErrcode() == castOther.getErrcode()) || (this.getErrcode() != null
                && castOther.getErrcode() != null && this
                .getErrcode()
                .equals(
                        castOther
                                .getErrcode())))
                && ((this.getCardbal() == castOther.getCardbal()) || (this.getCardbal() != null
                && castOther.getCardbal() != null && this
                .getCardbal()
                .equals(
                        castOther
                                .getCardbal())))
                && ((this.getAvailbal() == castOther.getAvailbal()) || (this.getAvailbal() != null
                && castOther.getAvailbal() != null && this
                .getAvailbal()
                .equals(
                        castOther
                                .getAvailbal())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccdate() == null ? 0 : this.getAccdate().hashCode());
        result = 37 * result + (getAcctime() == null ? 0 : this.getAcctime().hashCode());
        result = 37 * result + (getTermid() == null ? 0 : this.getTermid().hashCode());
        result = 37 * result + (getTermseqno() == null ? 0 : this.getTermseqno().hashCode());
        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result + (getTransdate1() == null ? 0 : this.getTransdate1().hashCode());
        result = 37 * result + (getTranstime() == null ? 0 : this.getTranstime().hashCode());
        result = 37 * result + (getTranstime1() == null ? 0 : this.getTranstime1().hashCode());
        result = 37 * result + (getTranscode() == null ? 0 : this.getTranscode().hashCode());
        result = 37 * result + (getTranscode1() == null ? 0 : this.getTranscode1().hashCode());
        result = 37 * result + (getCardno() == null ? 0 : this.getCardno().hashCode());
        result = 37 * result + (getCardcnt() == null ? 0 : this.getCardcnt().hashCode());
        result = 37 * result + (getCardcnt1() == null ? 0 : this.getCardcnt1().hashCode());
        result = 37 * result + (getCardbefbal() == null ? 0 : this.getCardbefbal().hashCode());
        result = 37 * result + (getCardaftbal() == null ? 0 : this.getCardaftbal().hashCode());
        result = 37 * result + (getCardbefbal1() == null ? 0 : this.getCardbefbal1().hashCode());
        result = 37 * result + (getCardaftbal1() == null ? 0 : this.getCardaftbal1().hashCode());
        result = 37 * result + (getAmount() == null ? 0 : this.getAmount().hashCode());
        result = 37 * result + (getDevphyid() == null ? 0 : this.getDevphyid().hashCode());
        result = 37 * result + (getDevseqno() == null ? 0 : this.getDevseqno().hashCode());
        result = 37 * result + (getStatus() == null ? 0 : this.getStatus().hashCode());
        result = 37 * result + (getErrcode() == null ? 0 : this.getErrcode().hashCode());
        result = 37 * result + (getCardbal() == null ? 0 : this.getCardbal().hashCode());
        result = 37 * result + (getAvailbal() == null ? 0 : this.getAvailbal().hashCode());
        return result;
    }

}