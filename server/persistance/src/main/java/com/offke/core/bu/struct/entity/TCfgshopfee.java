package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_CFGSHOPFEE")
public class TCfgshopfee implements java.io.Serializable {

    // Fields    

    private TCfgshopfeeId id;
    private BigDecimal feerate;
    private String opercode;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TCfgshopfee() {
    }

    /**
     * minimal constructor
     */
    public TCfgshopfee(TCfgshopfeeId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TCfgshopfee(TCfgshopfeeId id, BigDecimal feerate, String opercode, String lastsaved) {
        this.id = id;
        this.feerate = feerate;
        this.opercode = opercode;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "shopid", column = @Column(name = "SHOPID", nullable = false)),
            @AttributeOverride(name = "feetype", column = @Column(name = "FEETYPE", nullable = false))})
    public TCfgshopfeeId getId() {
        return this.id;
    }

    public void setId(TCfgshopfeeId id) {
        this.id = id;
    }

    @Column(name = "FEERATE", precision = 5, scale = 2)
    public BigDecimal getFeerate() {
        return this.feerate;
    }

    public void setFeerate(BigDecimal feerate) {
        this.feerate = feerate;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}