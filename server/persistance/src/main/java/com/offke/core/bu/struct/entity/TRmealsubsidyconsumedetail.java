package com.offke.core.bu.struct.entity;


import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TRmealsubsidyconsumedetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_RMEALSUBSIDYCONSUMEDETAIL")
public class TRmealsubsidyconsumedetail implements java.io.Serializable {

    // Fields

    private TRmealsubsidyconsumedetailId id;
    private String acctime;
    private String transdate;
    private String transtime;
    private Integer custid;
    private String stuempno;
    private String custname;
    private Integer cardno;
    private Integer mealtype;
    private String remark;
    private BigDecimal amount;

    // Constructors

    /**
     * default constructor
     */
    public TRmealsubsidyconsumedetail() {
    }

    /**
     * minimal constructor
     */
    public TRmealsubsidyconsumedetail(TRmealsubsidyconsumedetailId id,
                                      String transdate, String transtime, Integer custid,
                                      String stuempno, Integer cardno, Integer mealtype, BigDecimal amount) {
        this.id = id;
        this.transdate = transdate;
        this.transtime = transtime;
        this.custid = custid;
        this.stuempno = stuempno;
        this.cardno = cardno;
        this.mealtype = mealtype;
        this.amount = amount;
    }

    /**
     * full constructor
     */
    public TRmealsubsidyconsumedetail(TRmealsubsidyconsumedetailId id,
                                      String acctime, String transdate, String transtime,
                                      Integer custid, String stuempno, String custname,
                                      Integer cardno, Integer mealtype, String remark, BigDecimal amount) {
        this.id = id;
        this.acctime = acctime;
        this.transdate = transdate;
        this.transtime = transtime;
        this.custid = custid;
        this.stuempno = stuempno;
        this.custname = custname;
        this.cardno = cardno;
        this.mealtype = mealtype;
        this.remark = remark;
        this.amount = amount;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false, precision = 22, scale = 0)),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO", nullable = false, precision = 22, scale = 0))})
    public TRmealsubsidyconsumedetailId getId() {
        return this.id;
    }

    public void setId(TRmealsubsidyconsumedetailId id) {
        this.id = id;
    }

    @Column(name = "ACCTIME", length = 6)
    public String getAcctime() {
        return this.acctime;
    }

    public void setAcctime(String acctime) {
        this.acctime = acctime;
    }

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", nullable = false, length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "CUSTID", nullable = false, precision = 22, scale = 0)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "STUEMPNO", precision = 20, scale = 0)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CUSTNAME", length = 60)
    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Column(name = "CARDNO", precision = 22, scale = 0)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "MEALTYPE", nullable = false, precision = 1, scale = 0)
    public Integer getMealtype() {
        return this.mealtype;
    }

    public void setMealtype(Integer mealtype) {
        this.mealtype = mealtype;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "AMOUNT", precision = 8, scale = 2)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}