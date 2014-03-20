package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BANKCARDDTL")
public class TBankcarddtl implements java.io.Serializable {
    // Fields    

    private Long refno;
    private String transdate;
    private String transtime;
    private Integer termid;
    private String opercode;
    private String batchno;
    private Integer custid;
    private String custname;
    private String stuempno;
    private String bankcardno;
    private String optype;
    private String adddelflag;
    private Integer errcode;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TBankcarddtl() {
    }

    /**
     * minimal constructor
     */
    public TBankcarddtl(Long refno) {
        this.refno = refno;
    }

    /**
     * full constructor
     */
    public TBankcarddtl(
            Long refno,
            String transdate,
            String transtime,
            Integer termid,
            String opercode,
            String batchno,
            Integer custid,
            String custname,
            String stuempno,
            String bankcardno,
            String optype,
            String adddelflag,
            Integer errcode,
            String remark) {
        this.refno = refno;
        this.transdate = transdate;
        this.transtime = transtime;
        this.termid = termid;
        this.opercode = opercode;
        this.batchno = batchno;
        this.custid = custid;
        this.custname = custname;
        this.stuempno = stuempno;
        this.bankcardno = bankcardno;
        this.optype = optype;
        this.adddelflag = adddelflag;
        this.errcode = errcode;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "REFNO", unique = true, nullable = false, precision = 14, scale = 0)
    public Long getRefno() {
        return this.refno;
    }

    public void setRefno(Long refno) {
        this.refno = refno;
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

    @Column(name = "TERMID")
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "CUSTID")
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

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "BANKCARDNO", length = 30)
    public String getBankcardno() {
        return this.bankcardno;
    }

    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno;
    }

    @Column(name = "OPTYPE", precision = 1, scale = 0)
    public String getOptype() {
        return this.optype;
    }

    public void setOptype(String optype) {
        this.optype = optype;
    }

    @Column(name = "ADDDELFLAG", precision = 1, scale = 0)
    public String getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(String adddelflag) {
        this.adddelflag = adddelflag;
    }

    @Column(name = "ERRCODE")
    public Integer getErrcode() {
        return this.errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}