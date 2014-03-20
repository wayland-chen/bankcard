package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_CFGRAKEOFF")
public class TCfgrakeoff implements java.io.Serializable {

    // Fields    

    private TCfgrakeoffId id;
    private BigDecimal agio;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TCfgrakeoff() {
    }

    /**
     * minimal constructor
     */
    public TCfgrakeoff(TCfgrakeoffId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TCfgrakeoff(TCfgrakeoffId id, BigDecimal agio, String remark) {
        this.id = id;
        this.agio = agio;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "shopid", column = @Column(name = "SHOPID", nullable = false)),
            @AttributeOverride(name = "amount", column = @Column(name = "AMOUNT", nullable = false, precision = 15))})
    public TCfgrakeoffId getId() {
        return this.id;
    }

    public void setId(TCfgrakeoffId id) {
        this.id = id;
    }

    @Column(name = "AGIO", precision = 5, scale = 4)
    public BigDecimal getAgio() {
        return this.agio;
    }

    public void setAgio(BigDecimal agio) {
        this.agio = agio;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}