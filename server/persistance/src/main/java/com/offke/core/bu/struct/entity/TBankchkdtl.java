package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_BANKCHKDTL")
public class TBankchkdtl implements java.io.Serializable {

    // Fields    

    private TBankchkdtlId id;
    private BigDecimal amount;
    private Integer transdate;
    private String chkresult;
    private String resolved;
    private String remark;
    private String bankcardno;
    private String localsno;
    private String banksno;
    private Integer custid;
    private String stuempno;
    private Integer cardno;
    private String opercode;

    // Constructors

    /**
     * default constructor
     */
    public TBankchkdtl() {
    }

    /**
     * minimal constructor
     */
    public TBankchkdtl(TBankchkdtlId id, BigDecimal amount, String resolved) {
        this.id = id;
        this.amount = amount;
        this.resolved = resolved;
    }

    /**
     * full constructor
     */
    public TBankchkdtl(
            TBankchkdtlId id,
            BigDecimal amount,
            Integer transdate,
            String chkresult,
            String resolved,
            String remark,
            String bankcardno,
            String localsno,
            String banksno,
            Integer custid,
            String stuempno,
            Integer cardno,
            String opercode) {
        this.id = id;
        this.amount = amount;
        this.transdate = transdate;
        this.chkresult = chkresult;
        this.resolved = resolved;
        this.remark = remark;
        this.bankcardno = bankcardno;
        this.localsno = localsno;
        this.banksno = banksno;
        this.custid = custid;
        this.stuempno = stuempno;
        this.cardno = cardno;
        this.opercode = opercode;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "bankid", column = @Column(name = "BANKID", nullable = false)),
            @AttributeOverride(name = "bankdate", column = @Column(name = "BANKDATE", nullable = false, precision = 8, scale = 0)),
            @AttributeOverride(name = "recordno", column = @Column(name = "RECORDNO", nullable = false, precision = 8, scale = 0))})
    public TBankchkdtlId getId() {
        return this.id;
    }

    public void setId(TBankchkdtlId id) {
        this.id = id;
    }

    @Column(name = "AMOUNT", nullable = false, precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "TRANSDATE", precision = 8, scale = 0)
    public Integer getTransdate() {
        return this.transdate;
    }

    public void setTransdate(Integer transdate) {
        this.transdate = transdate;
    }

    @Column(name = "CHKRESULT", length = 1)
    public String getChkresult() {
        return this.chkresult;
    }

    public void setChkresult(String chkresult) {
        this.chkresult = chkresult;
    }

    @Column(name = "RESOLVED", nullable = false, length = 1)
    public String getResolved() {
        return this.resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "BANKCARDNO", length = 20)
    public String getBankcardno() {
        return this.bankcardno;
    }

    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno;
    }

    @Column(name = "LOCALSNO", length = 20)
    public String getLocalsno() {
        return this.localsno;
    }

    public void setLocalsno(String localsno) {
        this.localsno = localsno;
    }

    @Column(name = "BANKSNO", length = 20)
    public String getBanksno() {
        return this.banksno;
    }

    public void setBanksno(String banksno) {
        this.banksno = banksno;
    }

    @Column(name = "CUSTID")
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

}