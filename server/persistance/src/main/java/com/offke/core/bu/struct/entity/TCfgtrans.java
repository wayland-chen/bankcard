package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_CFGTRANS")
public class TCfgtrans implements java.io.Serializable {

    // Fields    

    private TCfgtransId id;
    private Integer ratetype;
    private BigDecimal rateamt;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TCfgtrans() {
    }

    /**
     * minimal constructor
     */
    public TCfgtrans(TCfgtransId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TCfgtrans(TCfgtransId id, Integer ratetype, BigDecimal rateamt, String remark) {
        this.id = id;
        this.ratetype = ratetype;
        this.rateamt = rateamt;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "feetype", column = @Column(name = "FEETYPE", nullable = false)),
            @AttributeOverride(name = "transcode", column = @Column(name = "TRANSCODE", nullable = false)),
            @AttributeOverride(name = "transtype", column = @Column(name = "TRANSTYPE", nullable = false))})
    public TCfgtransId getId() {
        return this.id;
    }

    public void setId(TCfgtransId id) {
        this.id = id;
    }

    @Column(name = "RATETYPE")
    public Integer getRatetype() {
        return this.ratetype;
    }

    public void setRatetype(Integer ratetype) {
        this.ratetype = ratetype;
    }

    @Column(name = "RATEAMT", precision = 15)
    public BigDecimal getRateamt() {
        return this.rateamt;
    }

    public void setRateamt(BigDecimal rateamt) {
        this.rateamt = rateamt;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}