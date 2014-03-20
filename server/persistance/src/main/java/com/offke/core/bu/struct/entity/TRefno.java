package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TRefno entity.
 */
@Entity
@Table(name = "T_REFNO")
public class TRefno implements java.io.Serializable {

    // Fields    

    private Long refno;
    private String mac;
    private Integer status;
    private String accdate;
    private Integer termid;
    private Long termseqno;
    private String lastsaved;
    private String reqrefno;

    // Constructors

    /**
     * default constructor
     */
    public TRefno() {
    }

    /**
     * minimal constructor
     */
    public TRefno(Long refno, String mac, Integer status) {
        this.refno = refno;
        this.mac = mac;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TRefno(
            Long refno,
            String mac,
            Integer status,
            String accdate,
            Integer termid,
            Long termseqno,
            String lastsaved,
            String reqrefno) {
        this.refno = refno;
        this.mac = mac;
        this.status = status;
        this.accdate = accdate;
        this.termid = termid;
        this.termseqno = termseqno;
        this.lastsaved = lastsaved;
        this.reqrefno = reqrefno;
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

    @Column(name = "MAC", nullable = false, length = 8)
    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "ACCDATE", length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
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

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

    @Column(name = "REQREFNO", length = 20)
    public String getReqrefno() {
        return this.reqrefno;
    }

    public void setReqrefno(String reqrefno) {
        this.reqrefno = reqrefno;
    }

}