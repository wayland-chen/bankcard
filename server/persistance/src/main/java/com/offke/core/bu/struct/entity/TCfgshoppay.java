package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "T_CFGSHOPPAY")
public class TCfgshoppay implements java.io.Serializable {

    // Fields    

    private TCfgshoppayId id;
    private Integer flag;
    private BigDecimal payamt;

    // Constructors

    /**
     * default constructor
     */
    public TCfgshoppay() {
    }

    /**
     * minimal constructor
     */
    public TCfgshoppay(TCfgshoppayId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TCfgshoppay(TCfgshoppayId id, Integer flag, BigDecimal payamt) {
        this.id = id;
        this.flag = flag;
        this.payamt = payamt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "shopid", column = @Column(name = "SHOPID", nullable = false)),
            @AttributeOverride(name = "feetype", column = @Column(name = "FEETYPE", nullable = false))})
    public TCfgshoppayId getId() {
        return this.id;
    }

    public void setId(TCfgshoppayId id) {
        this.id = id;
    }

    @Column(name = "FLAG")
    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Column(name = "PAYAMT", precision = 15)
    public BigDecimal getPayamt() {
        return this.payamt;
    }

    public void setPayamt(BigDecimal payamt) {
        this.payamt = payamt;
    }

}