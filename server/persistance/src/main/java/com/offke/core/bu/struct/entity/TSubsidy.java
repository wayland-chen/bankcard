package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TSubsidy entity.
 */
@Entity
@Table(name = "T_SUBSIDY", uniqueConstraints = @UniqueConstraint(columnNames = {"BATCHNO", "CUSTID"}))
public class TSubsidy implements java.io.Serializable {

    // Fields    

    private TSubsidyId id;
    private String stuempno;
    private Integer custid;
    private Integer subsidyno;
    private Integer cardno;
    private String summary;
    private String brokername;
    private String brokeridno;
    private Integer paytype;
    private String voucherno;
    private BigDecimal amount;
    private String subsidytype;
    private String impdate;
    private String imptime;
    private String putdate;
    private String puttime;
    private String getdate;
    private String gettime;
    private String status;
    private String errmsg;
    private String opercode;
    private String subsidymode;
    private String checkflag;

    // Constructors

    /**
     * default constructor
     */
    public TSubsidy() {
    }

    /**
     * minimal constructor
     */
    public TSubsidy(TSubsidyId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TSubsidy(
            TSubsidyId id,
            String stuempno,
            Integer custid,
            Integer subsidyno,
            Integer cardno,
            String summary,
            String brokername,
            String brokeridno,
            Integer paytype,
            String voucherno,
            BigDecimal amount,
            String subsidytype,
            String impdate,
            String imptime,
            String putdate,
            String puttime,
            String getdate,
            String gettime,
            String status,
            String errmsg,
            String opercode,
            String subsidymode,
            String checkflag) {
        this.id = id;
        this.stuempno = stuempno;
        this.custid = custid;
        this.subsidyno = subsidyno;
        this.cardno = cardno;
        this.summary = summary;
        this.brokername = brokername;
        this.brokeridno = brokeridno;
        this.paytype = paytype;
        this.voucherno = voucherno;
        this.amount = amount;
        this.subsidytype = subsidytype;
        this.impdate = impdate;
        this.imptime = imptime;
        this.putdate = putdate;
        this.puttime = puttime;
        this.getdate = getdate;
        this.gettime = gettime;
        this.status = status;
        this.errmsg = errmsg;
        this.opercode = opercode;
        this.subsidymode = subsidymode;
        this.checkflag = checkflag;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "batchno", column = @Column(name = "BATCHNO", nullable = false, length = 30)),
            @AttributeOverride(name = "seqno", column = @Column(name = "SEQNO", nullable = false))})
    public TSubsidyId getId() {
        return this.id;
    }

    public void setId(TSubsidyId id) {
        this.id = id;
    }

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CUSTID")
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "SUBSIDYNO")
    public Integer getSubsidyno() {
        return this.subsidyno;
    }

    public void setSubsidyno(Integer subsidyno) {
        this.subsidyno = subsidyno;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "SUMMARY", length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "BROKERNAME", length = 60)
    public String getBrokername() {
        return this.brokername;
    }

    public void setBrokername(String brokername) {
        this.brokername = brokername;
    }

    @Column(name = "BROKERIDNO", length = 60)
    public String getBrokeridno() {
        return this.brokeridno;
    }

    public void setBrokeridno(String brokeridno) {
        this.brokeridno = brokeridno;
    }

    @Column(name = "PAYTYPE")
    public Integer getPaytype() {
        return this.paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    @Column(name = "VOUCHERNO", length = 20)
    public String getVoucherno() {
        return this.voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "SUBSIDYTYPE", length = 1)
    public String getSubsidytype() {
        return this.subsidytype;
    }

    public void setSubsidytype(String subsidytype) {
        this.subsidytype = subsidytype;
    }

    @Column(name = "IMPDATE", length = 8)
    public String getImpdate() {
        return this.impdate;
    }

    public void setImpdate(String impdate) {
        this.impdate = impdate;
    }

    @Column(name = "IMPTIME", length = 6)
    public String getImptime() {
        return this.imptime;
    }

    public void setImptime(String imptime) {
        this.imptime = imptime;
    }

    @Column(name = "PUTDATE", length = 8)
    public String getPutdate() {
        return this.putdate;
    }

    public void setPutdate(String putdate) {
        this.putdate = putdate;
    }

    @Column(name = "PUTTIME", length = 6)
    public String getPuttime() {
        return this.puttime;
    }

    public void setPuttime(String puttime) {
        this.puttime = puttime;
    }

    @Column(name = "GETDATE", length = 8)
    public String getGetdate() {
        return this.getdate;
    }

    public void setGetdate(String getdate) {
        this.getdate = getdate;
    }

    @Column(name = "GETTIME", length = 6)
    public String getGettime() {
        return this.gettime;
    }

    public void setGettime(String gettime) {
        this.gettime = gettime;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "ERRMSG", length = 240)
    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "SUBSIDYMODE", precision = 1, scale = 0)
    public String getSubsidymode() {
        return this.subsidymode;
    }

    public void setSubsidymode(String subsidymode) {
        this.subsidymode = subsidymode;
    }

    @Column(name = "CHECKFLAG", precision = 1, scale = 0)
    public String getCheckflag() {
        return this.checkflag;
    }

    public void setCheckflag(String checkflag) {
        this.checkflag = checkflag;
    }

}