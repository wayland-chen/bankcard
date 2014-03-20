package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TBankcardtmp entity.
 */
@Entity
@Table(name = "T_BANKCARDTMP")
public class TBankcardtmp implements java.io.Serializable {

    // Fields    

    private Long recordno;
    private Integer termid;
    private String batchno;
    private String opercode;
    private Integer custid;
    private String stuempno;
    private String bankcardno;
    private String optype;
    private String transdate;
    private String status;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TBankcardtmp() {
    }

    /**
     * minimal constructor
     */
    public TBankcardtmp(Long recordno, String status) {
        this.recordno = recordno;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TBankcardtmp(
            Long recordno,
            Integer termid,
            String batchno,
            String opercode,
            Integer custid,
            String stuempno,
            String bankcardno,
            String optype,
            String transdate,
            String status,
            String remark) {
        this.recordno = recordno;
        this.termid = termid;
        this.batchno = batchno;
        this.opercode = opercode;
        this.custid = custid;
        this.stuempno = stuempno;
        this.bankcardno = bankcardno;
        this.optype = optype;
        this.transdate = transdate;
        this.status = status;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "RECORDNO", unique = true, nullable = false, precision = 14, scale = 0)
    public Long getRecordno() {
        return this.recordno;
    }

    public void setRecordno(Long recordno) {
        this.recordno = recordno;
    }

    @Column(name = "TERMID")
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
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

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
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