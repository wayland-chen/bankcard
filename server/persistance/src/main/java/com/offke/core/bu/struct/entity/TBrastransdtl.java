package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TBrastransdtl entity.
 */
@Entity
@Table(name = "T_BRASTRANSDTL")
public class TBrastransdtl implements java.io.Serializable {

    // Fields    

    private String refno;
    private Integer cardno;
    private String custname;
    private String oppaccno;
    private String oppaccname;
    private String transdate;
    private String transtime;
    private Integer transtype;
    private String summary;
    private BigDecimal transamt;
    private Integer status;
    private String remark;
    private Integer chkflag;
    private String stuempno;

    // Constructors

    /**
     * default constructor
     */
    public TBrastransdtl() {
    }

    /**
     * minimal constructor
     */
    public TBrastransdtl(String refno) {
        this.refno = refno;
    }

    /**
     * full constructor
     */
    public TBrastransdtl(
            String refno,
            Integer cardno,
            String custname,
            String oppaccno,
            String oppaccname,
            String transdate,
            String transtime,
            Integer transtype,
            String summary,
            BigDecimal transamt,
            Integer status,
            String remark,
            Integer chkflag,
            String stuempno) {
        this.refno = refno;
        this.cardno = cardno;
        this.custname = custname;
        this.oppaccno = oppaccno;
        this.oppaccname = oppaccname;
        this.transdate = transdate;
        this.transtime = transtime;
        this.transtype = transtype;
        this.summary = summary;
        this.transamt = transamt;
        this.status = status;
        this.remark = remark;
        this.chkflag = chkflag;
        this.stuempno = stuempno;
    }

    // Property accessors
    @Id
    @Column(name = "REFNO", unique = true, nullable = false, length = 14)
    public String getRefno() {
        return this.refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "CUSTNAME", length = 60)
    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Column(name = "OPPACCNO", length = 20)
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

    @Column(name = "TRANSAMT", precision = 15)
    public BigDecimal getTransamt() {
        return this.transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

    @Column(name = "STATUS", precision = 1, scale = 0)
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

    @Column(name = "CHKFLAG", precision = 1, scale = 0)
    public Integer getChkflag() {
        return this.chkflag;
    }

    public void setChkflag(Integer chkflag) {
        this.chkflag = chkflag;
    }

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

}