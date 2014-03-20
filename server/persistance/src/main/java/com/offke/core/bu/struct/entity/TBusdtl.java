package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_BUSDTL")
public class TBusdtl implements java.io.Serializable {

    // Fields    

    private TBusdtlId id;
    private String transtime;
    private Integer cardno;
    private Integer cardcnt;
    private BigDecimal cardbefbal;
    private BigDecimal amount;
    private BigDecimal cardaftbal;
    private Integer transmark;
    private Integer datatype;
    private Integer shopid;
    private String stuempno;
    private Integer custid;
    private String custname;
    private String deptcode;
    private Integer feetype;
    private String batchno;
    private String coldate;
    private String coltime;
    private String accdate;
    private String acctime;
    private Integer termid;
    private Long termseqno;
    private String status;
    private Integer errcode;
    private String errmsg;

    // Constructors

    /**
     * default constructor
     */
    public TBusdtl() {
    }

    /**
     * minimal constructor
     */
    public TBusdtl(TBusdtlId id, Integer cardno, Integer shopid, Integer custid, String status) {
        this.id = id;
        this.cardno = cardno;
        this.shopid = shopid;
        this.custid = custid;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TBusdtl(
            TBusdtlId id,
            String transtime,
            Integer cardno,
            Integer cardcnt,
            BigDecimal cardbefbal,
            BigDecimal amount,
            BigDecimal cardaftbal,
            Integer transmark,
            Integer datatype,
            Integer shopid,
            String stuempno,
            Integer custid,
            String custname,
            String deptcode,
            Integer feetype,
            String batchno,
            String coldate,
            String coltime,
            String accdate,
            String acctime,
            Integer termid,
            Long termseqno,
            String status,
            Integer errcode,
            String errmsg) {
        this.id = id;
        this.transtime = transtime;
        this.cardno = cardno;
        this.cardcnt = cardcnt;
        this.cardbefbal = cardbefbal;
        this.amount = amount;
        this.cardaftbal = cardaftbal;
        this.transmark = transmark;
        this.datatype = datatype;
        this.shopid = shopid;
        this.stuempno = stuempno;
        this.custid = custid;
        this.custname = custname;
        this.deptcode = deptcode;
        this.feetype = feetype;
        this.batchno = batchno;
        this.coldate = coldate;
        this.coltime = coltime;
        this.accdate = accdate;
        this.acctime = acctime;
        this.termid = termid;
        this.termseqno = termseqno;
        this.status = status;
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "devphyid", column = @Column(name = "DEVPHYID", nullable = false, length = 20)),
            @AttributeOverride(name = "devseqno", column = @Column(name = "DEVSEQNO", nullable = false))})
    public TBusdtlId getId() {
        return this.id;
    }

    public void setId(TBusdtlId id) {
        this.id = id;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "CARDNO", nullable = false)
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

    @Column(name = "CARDBEFBAL", precision = 15)
    public BigDecimal getCardbefbal() {
        return this.cardbefbal;
    }

    public void setCardbefbal(BigDecimal cardbefbal) {
        this.cardbefbal = cardbefbal;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "CARDAFTBAL", precision = 15)
    public BigDecimal getCardaftbal() {
        return this.cardaftbal;
    }

    public void setCardaftbal(BigDecimal cardaftbal) {
        this.cardaftbal = cardaftbal;
    }

    @Column(name = "TRANSMARK")
    public Integer getTransmark() {
        return this.transmark;
    }

    public void setTransmark(Integer transmark) {
        this.transmark = transmark;
    }

    @Column(name = "DATATYPE")
    public Integer getDatatype() {
        return this.datatype;
    }

    public void setDatatype(Integer datatype) {
        this.datatype = datatype;
    }

    @Column(name = "SHOPID", nullable = false)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CUSTID", nullable = false)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "CUSTNAME", length = 60)
    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Column(name = "DEPTCODE", length = 30)
    public String getDeptcode() {
        return this.deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    @Column(name = "FEETYPE")
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
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

    @Column(name = "STATUS", nullable = false, length = 1)
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

    @Column(name = "ERRMSG", length = 240)
    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}