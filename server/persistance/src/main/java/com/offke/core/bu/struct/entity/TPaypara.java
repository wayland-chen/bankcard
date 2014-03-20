package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TPaypara entity.
 */
@Entity
@Table(name = "T_PAYPARA")
public class TPaypara implements java.io.Serializable {

    // Fields    

    private TPayparaId id;
    private String paraval;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TPaypara() {
    }

    /**
     * minimal constructor
     */
    public TPaypara(TPayparaId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TPaypara(TPayparaId id, String paraval, String remark) {
        this.id = id;
        this.paraval = paraval;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "paraname", column = @Column(name = "PARANAME", nullable = false, length = 60)),
            @AttributeOverride(name = "paycode", column = @Column(name = "PAYCODE", nullable = false))})
    public TPayparaId getId() {
        return this.id;
    }

    public void setId(TPayparaId id) {
        this.id = id;
    }

    @Column(name = "PARAVAL", length = 60)
    public String getParaval() {
        return this.paraval;
    }

    public void setParaval(String paraval) {
        this.paraval = paraval;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}