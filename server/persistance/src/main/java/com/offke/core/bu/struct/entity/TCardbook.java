package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CARDBOOK")
public class TCardbook implements java.io.Serializable {

    // Fields    

    private Long showcardno;
    private Integer cardtype;
    private String cardphyid;
    private String opercode;
    private String putopercode;
    private String batchno;
    private String getdate;
    private String usedate;
    private String reclaimdate;
    private Integer usestatus;

    // Constructors

    /**
     * default constructor
     */
    public TCardbook() {
    }

    /**
     * minimal constructor
     */
    public TCardbook(Long showcardno, Integer cardtype, String opercode, Integer usestatus) {
        this.showcardno = showcardno;
        this.cardtype = cardtype;
        this.opercode = opercode;
        this.usestatus = usestatus;
    }

    /**
     * full constructor
     */
    public TCardbook(
            Long showcardno,
            Integer cardtype,
            String cardphyid,
            String opercode,
            String putopercode,
            String batchno,
            String getdate,
            String usedate,
            String reclaimdate,
            Integer usestatus) {
        this.showcardno = showcardno;
        this.cardtype = cardtype;
        this.cardphyid = cardphyid;
        this.opercode = opercode;
        this.putopercode = putopercode;
        this.batchno = batchno;
        this.getdate = getdate;
        this.usedate = usedate;
        this.reclaimdate = reclaimdate;
        this.usestatus = usestatus;
    }

    // Property accessors
    @Id
    @Column(name = "SHOWCARDNO", unique = true, nullable = false, precision = 10, scale = 0)
    public Long getShowcardno() {
        return this.showcardno;
    }

    public void setShowcardno(Long showcardno) {
        this.showcardno = showcardno;
    }

    @Column(name = "CARDTYPE", nullable = false)
    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Column(name = "CARDPHYID", length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "PUTOPERCODE", length = 8)
    public String getPutopercode() {
        return this.putopercode;
    }

    public void setPutopercode(String putopercode) {
        this.putopercode = putopercode;
    }

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "GETDATE", length = 8)
    public String getGetdate() {
        return this.getdate;
    }

    public void setGetdate(String getdate) {
        this.getdate = getdate;
    }

    @Column(name = "USEDATE", length = 8)
    public String getUsedate() {
        return this.usedate;
    }

    public void setUsedate(String usedate) {
        this.usedate = usedate;
    }

    @Column(name = "RECLAIMDATE", length = 8)
    public String getReclaimdate() {
        return this.reclaimdate;
    }

    public void setReclaimdate(String reclaimdate) {
        this.reclaimdate = reclaimdate;
    }

    @Column(name = "USESTATUS", nullable = false, precision = 1, scale = 0)
    public Integer getUsestatus() {
        return this.usestatus;
    }

    public void setUsestatus(Integer usestatus) {
        this.usestatus = usestatus;
    }

}