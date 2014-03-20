package com.offke.core.bu.struct.entity;

import javax.persistence.*;


@Entity
@Table(name = "T_DOORCARD")
public class TDoorcard implements java.io.Serializable {

    // Fields    

    private TDoorcardId id;
    private String cardphyid;
    private String cardverno;
    private Integer status;
    private String insertdate;

    // Constructors

    /**
     * default constructor
     */
    public TDoorcard() {
    }

    /**
     * minimal constructor
     */
    public TDoorcard(TDoorcardId id, Integer status) {
        this.id = id;
        this.status = status;
    }

    /**
     * full constructor
     */
    public TDoorcard(TDoorcardId id, String cardphyid, String cardverno, Integer status, String insertdate) {
        this.id = id;
        this.cardphyid = cardphyid;
        this.cardverno = cardverno;
        this.status = status;
        this.insertdate = insertdate;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false)),
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", nullable = false)),
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO", nullable = false))})
    public TDoorcardId getId() {
        return this.id;
    }

    public void setId(TDoorcardId id) {
        this.id = id;
    }

    @Column(name = "CARDPHYID", length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "CARDVERNO", length = 12)
    public String getCardverno() {
        return this.cardverno;
    }

    public void setCardverno(String cardverno) {
        this.cardverno = cardverno;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "INSERTDATE", length = 14)
    public String getInsertdate() {
        return this.insertdate;
    }

    public void setInsertdate(String insertdate) {
        this.insertdate = insertdate;
    }

}