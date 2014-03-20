package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TNewcardchange entity.
 */
@Entity
@Table(name = "T_NEWCARDCHANGE")
public class TNewcardchange implements java.io.Serializable {

    // Fields    

    private String showcardno;
    private String stuempno;
    private String expiredate;
    private String status;
    private String batchno;
    private Integer seqno;
    private String cardphyid;
    private String oldcardphyid;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TNewcardchange() {
    }

    /**
     * minimal constructor
     */
    public TNewcardchange(String showcardno, String stuempno, String expiredate, String status) {
        this.showcardno = showcardno;
        this.stuempno = stuempno;
        this.expiredate = expiredate;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TNewcardchange(
            String showcardno,
            String stuempno,
            String expiredate,
            String status,
            String batchno,
            Integer seqno,
            String cardphyid,
            String oldcardphyid,
            String lastsaved) {
        this.showcardno = showcardno;
        this.stuempno = stuempno;
        this.expiredate = expiredate;
        this.status = status;
        this.batchno = batchno;
        this.seqno = seqno;
        this.cardphyid = cardphyid;
        this.oldcardphyid = oldcardphyid;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "SHOWCARDNO", unique = true, nullable = false, length = 10)
    public String getShowcardno() {
        return this.showcardno;
    }

    public void setShowcardno(String showcardno) {
        this.showcardno = showcardno;
    }

    @Column(name = "STUEMPNO", nullable = false, length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "EXPIREDATE", nullable = false, length = 8)
    public String getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "SEQNO")
    public Integer getSeqno() {
        return this.seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    @Column(name = "CARDPHYID", length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "OLDCARDPHYID", length = 16)
    public String getOldcardphyid() {
        return this.oldcardphyid;
    }

    public void setOldcardphyid(String oldcardphyid) {
        this.oldcardphyid = oldcardphyid;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}