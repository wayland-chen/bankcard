package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TPaymentdtl entity.
 */
@Entity
@Table(name = "T_PAYMENTDTL")
public class TPaymentdtl implements java.io.Serializable {

    // Fields    

    private TPaymentdtlId id;
    private Integer shopid;
    private String accno;
    private String accname;
    private String transdate;
    private String transtime;
    private BigDecimal amount;
    private String paybankaccno;
    private String paybankaccname;
    private String payeebankaccno;
    private String payeebankaccname;
    private String opercode;

    // Constructors

    /**
     * default constructor
     */
    public TPaymentdtl() {
    }

    /**
     * minimal constructor
     */
    public TPaymentdtl(TPaymentdtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TPaymentdtl(
            TPaymentdtlId id,
            Integer shopid,
            String accno,
            String accname,
            String transdate,
            String transtime,
            BigDecimal amount,
            String paybankaccno,
            String paybankaccname,
            String payeebankaccno,
            String payeebankaccname,
            String opercode) {
        this.id = id;
        this.shopid = shopid;
        this.accno = accno;
        this.accname = accname;
        this.transdate = transdate;
        this.transtime = transtime;
        this.amount = amount;
        this.paybankaccno = paybankaccno;
        this.paybankaccname = paybankaccname;
        this.payeebankaccno = payeebankaccno;
        this.payeebankaccname = payeebankaccname;
        this.opercode = opercode;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO", nullable = false))})
    public TPaymentdtlId getId() {
        return this.id;
    }

    public void setId(TPaymentdtlId id) {
        this.id = id;
    }

    @Column(name = "SHOPID")
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "ACCNO", length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "ACCNAME", length = 60)
    public String getAccname() {
        return this.accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "PAYBANKACCNO", length = 20)
    public String getPaybankaccno() {
        return this.paybankaccno;
    }

    public void setPaybankaccno(String paybankaccno) {
        this.paybankaccno = paybankaccno;
    }

    @Column(name = "PAYBANKACCNAME", length = 60)
    public String getPaybankaccname() {
        return this.paybankaccname;
    }

    public void setPaybankaccname(String paybankaccname) {
        this.paybankaccname = paybankaccname;
    }

    @Column(name = "PAYEEBANKACCNO", length = 20)
    public String getPayeebankaccno() {
        return this.payeebankaccno;
    }

    public void setPayeebankaccno(String payeebankaccno) {
        this.payeebankaccno = payeebankaccno;
    }

    @Column(name = "PAYEEBANKACCNAME", length = 60)
    public String getPayeebankaccname() {
        return this.payeebankaccname;
    }

    public void setPayeebankaccname(String payeebankaccname) {
        this.payeebankaccname = payeebankaccname;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

}