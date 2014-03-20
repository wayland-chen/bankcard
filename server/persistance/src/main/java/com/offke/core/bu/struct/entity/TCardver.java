package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCardver entity.
 */
@Entity
@Table(name = "T_CARDVER")
public class TCardver implements java.io.Serializable {

    // Fields    

    private String cardverno;
    private String accdate;
    private Integer termid;
    private Long termseqno;
    private Integer cardno;
    private String cardphyid;
    private String stuempno;
    private Integer cardvertype;
    private String adddelflag;
    private String status;

    // Constructors

    /**
     * default constructor
     */
    public TCardver() {
    }

    /**
     * minimal constructor
     */
    public TCardver(String cardverno) {
        this.cardverno = cardverno;
    }

    /**
     * full constructor
     */
    public TCardver(
            String cardverno,
            String accdate,
            Integer termid,
            Long termseqno,
            Integer cardno,
            String cardphyid,
            String stuempno,
            Integer cardvertype,
            String adddelflag,
            String status) {
        this.cardverno = cardverno;
        this.accdate = accdate;
        this.termid = termid;
        this.termseqno = termseqno;
        this.cardno = cardno;
        this.cardphyid = cardphyid;
        this.stuempno = stuempno;
        this.cardvertype = cardvertype;
        this.adddelflag = adddelflag;
        this.status = status;
    }

    // Property accessors
    @Id
    @Column(name = "CARDVERNO", unique = true, nullable = false, length = 12)
    public String getCardverno() {
        return this.cardverno;
    }

    public void setCardverno(String cardverno) {
        this.cardverno = cardverno;
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

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "CARDPHYID", length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CARDVERTYPE")
    public Integer getCardvertype() {
        return this.cardvertype;
    }

    public void setCardvertype(Integer cardvertype) {
        this.cardvertype = cardvertype;
    }

    @Column(name = "ADDDELFLAG", precision = 1, scale = 0)
    public String getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(String adddelflag) {
        this.adddelflag = adddelflag;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}