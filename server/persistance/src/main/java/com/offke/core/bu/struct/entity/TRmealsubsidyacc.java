package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TRmealsubsidyacc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_RMEALSUBSIDYACC")
public class TRmealsubsidyacc implements java.io.Serializable {

    // Fields

    private TRmealsubsidyaccId id;
    private String accdate;
    private Integer consumecnt;
    private BigDecimal subsidyamt;
    private String stuempno;
    private String custname;
    private Integer cardno;
    private Integer countsign;
    private String remark;
    private BigDecimal consumeamt;

    // Constructors

    /**
     * default constructor
     */
    public TRmealsubsidyacc() {
    }

    /**
     * minimal constructor
     */
    public TRmealsubsidyacc(TRmealsubsidyaccId id, String accdate,
                            Integer consumecnt, BigDecimal subsidyamt, String stuempno,
                            Integer cardno, Integer countsign, BigDecimal consumeamt) {
        this.id = id;
        this.accdate = accdate;
        this.consumecnt = consumecnt;
        this.subsidyamt = subsidyamt;
        this.stuempno = stuempno;
        this.cardno = cardno;
        this.countsign = countsign;
        this.consumeamt = consumeamt;
    }

    /**
     * full constructor
     */
    public TRmealsubsidyacc(TRmealsubsidyaccId id, String accdate,
                            Integer consumecnt, BigDecimal subsidyamt, String stuempno,
                            String custname, Integer cardno, Integer countsign, String remark, BigDecimal consumeamt) {
        this.id = id;
        this.accdate = accdate;
        this.consumecnt = consumecnt;
        this.subsidyamt = subsidyamt;
        this.stuempno = stuempno;
        this.custname = custname;
        this.cardno = cardno;
        this.countsign = countsign;
        this.remark = remark;
        this.consumeamt = consumeamt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", nullable = false, precision = 22, scale = 0)),
            @AttributeOverride(name = "mealtype", column = @Column(name = "MEALTYPE", nullable = false, precision = 1, scale = 0))})
    public TRmealsubsidyaccId getId() {
        return this.id;
    }

    public void setId(TRmealsubsidyaccId id) {
        this.id = id;
    }

    @Column(name = "ACCDATE", nullable = false, length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "CONSUMECNT", nullable = false, precision = 20, scale = 0)
    public Integer getConsumecnt() {
        return this.consumecnt;
    }

    public void setConsumecnt(Integer consumecnt) {
        this.consumecnt = consumecnt;
    }

    @Column(name = "SUBSIDYAMT", nullable = false, precision = 8)
    public BigDecimal getSubsidyamt() {
        return this.subsidyamt;
    }

    public void setSubsidyamt(BigDecimal subsidyamt) {
        this.subsidyamt = subsidyamt;
    }

    @Column(name = "STUEMPNO", length = 20)
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

    @Column(name = "COUNTSIGN", nullable = false, precision = 1, scale = 0)
    public Integer getCountsign() {
        return this.countsign;
    }

    public void setCountsign(Integer countsign) {
        this.countsign = countsign;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "CONSUMEAMT", nullable = false, precision = 8, scale = 2)
    public BigDecimal getConsumeamt() {
        return this.consumeamt;
    }

    public void setConsumeamt(BigDecimal consumeamt) {
        this.consumeamt = consumeamt;
    }

}