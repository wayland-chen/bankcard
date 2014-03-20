package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 帐户交易明细表
 *
 * @version 1.0
 */
@Entity
@Table(name = "T_ACCDTL")
public class TAccdtl implements java.io.Serializable {

    // Fields    

    private TAccdtlId id;
    private String acctime;
    private String transdate;
    private String transtime;
    private Integer paytype;
    private String voucherno;
    private Integer transcode;
    private Integer transtype;
    private String summary;
    private String subjno;
    private String accname;
    private Integer dcflag;
    private BigDecimal amount;
    private BigDecimal balance;
    private String oppsubjno;
    private String oppaccno;
    private String oppaccname;
    private String opercode;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TAccdtl() {
    }

    /**
     * minimal constructor
     */
    public TAccdtl(TAccdtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TAccdtl(
            TAccdtlId id,
            String acctime,
            String transdate,
            String transtime,
            Integer paytype,
            String voucherno,
            Integer transcode,
            Integer transtype,
            String summary,
            String subjno,
            String accname,
            Integer dcflag,
            BigDecimal amount,
            BigDecimal balance,
            String oppsubjno,
            String oppaccno,
            String oppaccname,
            String opercode,
            String remark) {
        this.id = id;
        this.acctime = acctime;
        this.transdate = transdate;
        this.transtime = transtime;
        this.paytype = paytype;
        this.voucherno = voucherno;
        this.transcode = transcode;
        this.transtype = transtype;
        this.summary = summary;
        this.subjno = subjno;
        this.accname = accname;
        this.dcflag = dcflag;
        this.amount = amount;
        this.balance = balance;
        this.oppsubjno = oppsubjno;
        this.oppaccno = oppaccno;
        this.oppaccname = oppaccname;
        this.opercode = opercode;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO", nullable = false)),
            @AttributeOverride(name = "subseqno", column = @Column(name = "SUBSEQNO", nullable = false)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10))})
    public TAccdtlId getId() {
        return this.id;
    }

    public void setId(TAccdtlId id) {
        this.id = id;
    }

    @Column(name = "ACCTIME", length = 6)
    public String getAcctime() {
        return this.acctime;
    }

    public void setAcctime(String acctime) {
        this.acctime = acctime;
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

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "TRANSTYPE")
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "SUMMARY", length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "SUBJNO", length = 6)
    public String getSubjno() {
        return this.subjno;
    }

    public void setSubjno(String subjno) {
        this.subjno = subjno;
    }

    @Column(name = "ACCNAME", length = 60)
    public String getAccname() {
        return this.accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    @Column(name = "DCFLAG", precision = 1, scale = 0)
    public Integer getDcflag() {
        return this.dcflag;
    }

    public void setDcflag(Integer dcflag) {
        this.dcflag = dcflag;
    }

    @Column(name = "AMOUNT")
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "BALANCE")
    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Column(name = "OPPSUBJNO", length = 6)
    public String getOppsubjno() {
        return this.oppsubjno;
    }

    public void setOppsubjno(String oppsubjno) {
        this.oppsubjno = oppsubjno;
    }

    @Column(name = "OPPACCNO", length = 10)
    public String getOppaccno() {
        return this.oppaccno;
    }

    public void setOppaccno(String oppaccno) {
        this.oppaccno = oppaccno;
    }

    @Column(name = "OPPACCNAME", length = 60)
    public String getOppaccname() {
        return this.oppaccname;
    }

    public void setOppaccname(String oppaccname) {
        this.oppaccname = oppaccname;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}