package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TGeteleccard entity.
 */
@Entity
@Table(name = "T_GETELECCARD")
public class TGeteleccard implements java.io.Serializable {

    // Fields    

    private TGeteleccardId id;
    private String cardphyid;
    private Integer usetype;
    private Integer adddelflag;
    private String downtime;

    // Constructors

    /**
     * default constructor
     */
    public TGeteleccard() {
    }

    /**
     * minimal constructor
     */
    public TGeteleccard(TGeteleccardId id, String cardphyid, Integer usetype, Integer adddelflag) {
        this.id = id;
        this.cardphyid = cardphyid;
        this.usetype = usetype;
        this.adddelflag = adddelflag;
    }

    /**
     * full constructor
     */
    public TGeteleccard(TGeteleccardId id, String cardphyid, Integer usetype, Integer adddelflag, String downtime) {
        this.id = id;
        this.cardphyid = cardphyid;
        this.usetype = usetype;
        this.adddelflag = adddelflag;
        this.downtime = downtime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO", nullable = false)),
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false))})
    public TGeteleccardId getId() {
        return this.id;
    }

    public void setId(TGeteleccardId id) {
        this.id = id;
    }

    @Column(name = "CARDPHYID", nullable = false, length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "USETYPE", nullable = false, precision = 1, scale = 0)
    public Integer getUsetype() {
        return this.usetype;
    }

    public void setUsetype(Integer usetype) {
        this.usetype = usetype;
    }

    @Column(name = "ADDDELFLAG", nullable = false, precision = 1, scale = 0)
    public Integer getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(Integer adddelflag) {
        this.adddelflag = adddelflag;
    }

    @Column(name = "DOWNTIME", length = 30)
    public String getDowntime() {
        return this.downtime;
    }

    public void setDowntime(String downtime) {
        this.downtime = downtime;
    }

}