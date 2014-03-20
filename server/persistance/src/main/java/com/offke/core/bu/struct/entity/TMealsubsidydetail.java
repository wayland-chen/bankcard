package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TMealsubsidydetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_MEALSUBSIDYDETAIL")
public class TMealsubsidydetail implements java.io.Serializable {

    // Fields

    private TMealsubsidydetailId id;
    private Integer mealsubsidycnt;
    private BigDecimal mealsubsidysingleamt;
    private BigDecimal mealsubsidyamt;
    private String stuempno;
    private String custname;
    private Integer cardno;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TMealsubsidydetail() {
    }

    /**
     * minimal constructor
     */
    public TMealsubsidydetail(TMealsubsidydetailId id, Integer mealsubsidycnt,
                              BigDecimal mealsubsidysingleamt, BigDecimal mealsubsidyamt,
                              String stuempno, Integer cardno) {
        this.id = id;
        this.mealsubsidycnt = mealsubsidycnt;
        this.mealsubsidysingleamt = mealsubsidysingleamt;
        this.mealsubsidyamt = mealsubsidyamt;
        this.stuempno = stuempno;
        this.cardno = cardno;
    }

    /**
     * full constructor
     */
    public TMealsubsidydetail(TMealsubsidydetailId id, Integer mealsubsidycnt,
                              BigDecimal mealsubsidysingleamt, BigDecimal mealsubsidyamt,
                              String stuempno, String custname, Integer cardno,
                              String remark) {
        this.id = id;
        this.mealsubsidycnt = mealsubsidycnt;
        this.mealsubsidysingleamt = mealsubsidysingleamt;
        this.mealsubsidyamt = mealsubsidyamt;
        this.stuempno = stuempno;
        this.custname = custname;
        this.cardno = cardno;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "countmonth", column = @Column(name = "COUNTMONTH", nullable = false, length = 6)),
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", nullable = false, precision = 22, scale = 0)),
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8))})
    public TMealsubsidydetailId getId() {
        return this.id;
    }

    public void setId(TMealsubsidydetailId id) {
        this.id = id;
    }

    @Column(name = "MEALSUBSIDYCNT", nullable = false, precision = 8, scale = 0)
    public Integer getMealsubsidycnt() {
        return this.mealsubsidycnt;
    }

    public void setMealsubsidycnt(Integer mealsubsidycnt) {
        this.mealsubsidycnt = mealsubsidycnt;
    }

    @Column(name = "MEALSUBSIDYSINGLEAMT", nullable = false, precision = 8)
    public BigDecimal getMealsubsidysingleamt() {
        return this.mealsubsidysingleamt;
    }

    public void setMealsubsidysingleamt(BigDecimal mealsubsidysingleamt) {
        this.mealsubsidysingleamt = mealsubsidysingleamt;
    }

    @Column(name = "MEALSUBSIDYAMT", nullable = false, precision = 8)
    public BigDecimal getMealsubsidyamt() {
        return this.mealsubsidyamt;
    }

    public void setMealsubsidyamt(BigDecimal mealsubsidyamt) {
        this.mealsubsidyamt = mealsubsidyamt;
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

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}