package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TMedicaldtl entity.
 */
@Entity
@Table(name = "T_MEDICALDTL")
public class TMedicaldtl implements java.io.Serializable {

    // Fields    

    private Long refno;
    private Integer custid;
    private String custname;
    private String stuempno;
    private String voucherno;
    private String medicines;
    private String medicalinfo;
    private Integer cardno;
    private String transdate;
    private String transtime;
    private Integer transtype;
    private BigDecimal transamt;
    private String devphyid;
    private Integer devseqno;
    private String opercode;
    private Integer status;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TMedicaldtl() {
    }

    /**
     * minimal constructor
     */
    public TMedicaldtl(
            Long refno,
            Integer custid,
            String custname,
            Integer cardno,
            String transdate,
            String transtime,
            Integer transtype,
            BigDecimal transamt,
            String devphyid,
            Integer status) {
        this.refno = refno;
        this.custid = custid;
        this.custname = custname;
        this.cardno = cardno;
        this.transdate = transdate;
        this.transtime = transtime;
        this.transtype = transtype;
        this.transamt = transamt;
        this.devphyid = devphyid;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TMedicaldtl(
            Long refno,
            Integer custid,
            String custname,
            String stuempno,
            String voucherno,
            String medicines,
            String medicalinfo,
            Integer cardno,
            String transdate,
            String transtime,
            Integer transtype,
            BigDecimal transamt,
            String devphyid,
            Integer devseqno,
            String opercode,
            Integer status,
            String remark) {
        this.refno = refno;
        this.custid = custid;
        this.custname = custname;
        this.stuempno = stuempno;
        this.voucherno = voucherno;
        this.medicines = medicines;
        this.medicalinfo = medicalinfo;
        this.cardno = cardno;
        this.transdate = transdate;
        this.transtime = transtime;
        this.transtype = transtype;
        this.transamt = transamt;
        this.devphyid = devphyid;
        this.devseqno = devseqno;
        this.opercode = opercode;
        this.status = status;
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

    @Column(name = "CUSTID", nullable = false)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "CUSTNAME", nullable = false, length = 60)
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

    @Column(name = "VOUCHERNO", length = 20)
    public String getVoucherno() {
        return this.voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    @Column(name = "MEDICINES", length = 1000)
    public String getMedicines() {
        return this.medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    @Column(name = "MEDICALINFO", length = 1000)
    public String getMedicalinfo() {
        return this.medicalinfo;
    }

    public void setMedicalinfo(String medicalinfo) {
        this.medicalinfo = medicalinfo;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
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

    @Column(name = "TRANSTYPE", nullable = false)
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "TRANSAMT", nullable = false, precision = 15)
    public BigDecimal getTransamt() {
        return this.transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

    @Column(name = "DEVPHYID", nullable = false, length = 20)
    public String getDevphyid() {
        return this.devphyid;
    }

    public void setDevphyid(String devphyid) {
        this.devphyid = devphyid;
    }

    @Column(name = "DEVSEQNO")
    public Integer getDevseqno() {
        return this.devseqno;
    }

    public void setDevseqno(Integer devseqno) {
        this.devseqno = devseqno;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
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