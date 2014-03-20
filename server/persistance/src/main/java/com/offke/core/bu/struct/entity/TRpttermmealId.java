package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TRpttermmealId entity.
 */
@Embeddable
public class TRpttermmealId implements java.io.Serializable {

    // Fields    

    private Integer settledate;
    private String accno;
    private Integer termid;
    private Integer transtype;
    private String summary;
    private String transdate;
    private Integer mealtype;

    // Constructors

    /**
     * default constructor
     */
    public TRpttermmealId() {
    }

    /**
     * full constructor
     */
    public TRpttermmealId(
            Integer settledate,
            String accno,
            Integer termid,
            Integer transtype,
            String summary,
            String transdate,
            Integer mealtype) {
        this.settledate = settledate;
        this.accno = accno;
        this.termid = termid;
        this.transtype = transtype;
        this.summary = summary;
        this.transdate = transdate;
        this.mealtype = mealtype;
    }

    // Property accessors

    @Column(name = "SETTLEDATE", nullable = false, precision = 8, scale = 0)
    public Integer getSettledate() {
        return this.settledate;
    }

    public void setSettledate(Integer settledate) {
        this.settledate = settledate;
    }

    @Column(name = "ACCNO", nullable = false, length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "TERMID", nullable = false)
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "TRANSTYPE", nullable = false)
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "SUMMARY", nullable = false, length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "MEALTYPE", nullable = false)
    public Integer getMealtype() {
        return this.mealtype;
    }

    public void setMealtype(Integer mealtype) {
        this.mealtype = mealtype;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TRpttermmealId))
            return false;
        TRpttermmealId castOther = (TRpttermmealId) other;

        return ((this.getSettledate() == castOther.getSettledate()) || (this.getSettledate() != null
                && castOther.getSettledate() != null && this
                .getSettledate()
                .equals(
                        castOther
                                .getSettledate())))
                && ((this.getAccno() == castOther.getAccno()) || (this.getAccno() != null
                && castOther.getAccno() != null && this
                .getAccno()
                .equals(
                        castOther
                                .getAccno())))
                && ((this.getTermid() == castOther.getTermid()) || (this.getTermid() != null
                && castOther.getTermid() != null && this
                .getTermid()
                .equals(
                        castOther
                                .getTermid())))
                && ((this.getTranstype() == castOther.getTranstype()) || (this.getTranstype() != null
                && castOther.getTranstype() != null && this
                .getTranstype()
                .equals(
                        castOther
                                .getTranstype())))
                && ((this.getSummary() == castOther.getSummary()) || (this.getSummary() != null
                && castOther.getSummary() != null && this
                .getSummary()
                .equals(
                        castOther
                                .getSummary())))
                && ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
                && ((this.getMealtype() == castOther.getMealtype()) || (this.getMealtype() != null
                && castOther.getMealtype() != null && this
                .getMealtype()
                .equals(
                        castOther
                                .getMealtype())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getSettledate() == null ? 0 : this.getSettledate().hashCode());
        result = 37 * result + (getAccno() == null ? 0 : this.getAccno().hashCode());
        result = 37 * result + (getTermid() == null ? 0 : this.getTermid().hashCode());
        result = 37 * result + (getTranstype() == null ? 0 : this.getTranstype().hashCode());
        result = 37 * result + (getSummary() == null ? 0 : this.getSummary().hashCode());
        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result + (getMealtype() == null ? 0 : this.getMealtype().hashCode());
        return result;
    }

}