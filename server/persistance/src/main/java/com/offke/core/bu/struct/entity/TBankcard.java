package com.offke.core.bu.struct.entity;

import javax.persistence.*;


@Entity
@Table(name = "T_BANKCARD", uniqueConstraints = @UniqueConstraint(columnNames = "CUSTID"))
public class TBankcard implements java.io.Serializable {

    // Fields    

    private TBankcardId id;
    private String bankcode;
    private String batchno;
    private String createddate;
    private String lastsaved;
    private String relatedate;

    // Constructors

    /**
     * default constructor
     */
    public TBankcard() {
    }

    /**
     * minimal constructor
     */
    public TBankcard(TBankcardId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TBankcard(
            TBankcardId id,
            String bankcode,
            String batchno,
            String createddate,
            String lastsaved,
            String relatedate) {
        this.id = id;
        this.bankcode = bankcode;
        this.batchno = batchno;
        this.createddate = createddate;
        this.lastsaved = lastsaved;
        this.relatedate = relatedate;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", unique = true, nullable = false)),
            @AttributeOverride(name = "bankcardno", column = @Column(name = "BANKCARDNO", nullable = false, length = 30))})
    public TBankcardId getId() {
        return this.id;
    }

    public void setId(TBankcardId id) {
        this.id = id;
    }

    @Column(name = "BANKCODE", length = 2)
    public String getBankcode() {
        return this.bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "CREATEDDATE", length = 8)
    public String getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

    @Column(name = "RELATEDATE", length = 8)
    public String getRelatedate() {
        return this.relatedate;
    }

    public void setRelatedate(String relatedate) {
        this.relatedate = relatedate;
    }

}