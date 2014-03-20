package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_CARDTRANSDTL")
public class TCardtransdtl implements java.io.Serializable {

    // Fields    

    private TCardtransdtlId id;
    private String transdate;
    private String transtime;
    private String termno;
    private Long termsno;
    private BigDecimal cardbefbal;
    private BigDecimal amount;
    private BigDecimal addamt;
    private BigDecimal managefee;
    private Integer shopid;
    private String coldate;
    private String coltime;
    private Integer status;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TCardtransdtl() {
    }

    /**
     * minimal constructor
     */
    public TCardtransdtl(
            TCardtransdtlId id,
            String transdate,
            String transtime,
            String termno,
            Long termsno,
            BigDecimal cardbefbal,
            BigDecimal amount,
            Integer status) {
        this.id = id;
        this.transdate = transdate;
        this.transtime = transtime;
        this.termno = termno;
        this.termsno = termsno;
        this.cardbefbal = cardbefbal;
        this.amount = amount;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TCardtransdtl(
            TCardtransdtlId id,
            String transdate,
            String transtime,
            String termno,
            Long termsno,
            BigDecimal cardbefbal,
            BigDecimal amount,
            BigDecimal addamt,
            BigDecimal managefee,
            Integer shopid,
            String coldate,
            String coltime,
            Integer status,
            String remark) {
        this.id = id;
        this.transdate = transdate;
        this.transtime = transtime;
        this.termno = termno;
        this.termsno = termsno;
        this.cardbefbal = cardbefbal;
        this.amount = amount;
        this.addamt = addamt;
        this.managefee = managefee;
        this.shopid = shopid;
        this.coldate = coldate;
        this.coltime = coltime;
        this.status = status;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transflag", column = @Column(name = "TRANSFLAG", nullable = false, precision = 1, scale = 0)),
            @AttributeOverride(name = "cardcnt", column = @Column(name = "CARDCNT", nullable = false)),
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO", nullable = false))})
    public TCardtransdtlId getId() {
        return this.id;
    }

    public void setId(TCardtransdtlId id) {
        this.id = id;
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

    @Column(name = "TERMNO", nullable = false, length = 12)
    public String getTermno() {
        return this.termno;
    }

    public void setTermno(String termno) {
        this.termno = termno;
    }

    @Column(name = "TERMSNO", nullable = false)
    public Long getTermsno() {
        return this.termsno;
    }

    public void setTermsno(Long termsno) {
        this.termsno = termsno;
    }

    @Column(name = "CARDBEFBAL", nullable = false, precision = 15)
    public BigDecimal getCardbefbal() {
        return this.cardbefbal;
    }

    public void setCardbefbal(BigDecimal cardbefbal) {
        this.cardbefbal = cardbefbal;
    }

    @Column(name = "AMOUNT", nullable = false, precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "ADDAMT", precision = 15)
    public BigDecimal getAddamt() {
        return this.addamt;
    }

    public void setAddamt(BigDecimal addamt) {
        this.addamt = addamt;
    }

    @Column(name = "MANAGEFEE", precision = 15)
    public BigDecimal getManagefee() {
        return this.managefee;
    }

    public void setManagefee(BigDecimal managefee) {
        this.managefee = managefee;
    }

    @Column(name = "SHOPID")
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "COLDATE", length = 8)
    public String getColdate() {
        return this.coldate;
    }

    public void setColdate(String coldate) {
        this.coldate = coldate;
    }

    @Column(name = "COLTIME", length = 6)
    public String getColtime() {
        return this.coltime;
    }

    public void setColtime(String coltime) {
        this.coltime = coltime;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}