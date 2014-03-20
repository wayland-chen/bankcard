package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGdctpara entity.
 */
@Entity
@Table(name = "T_GDCTPARA")
public class TGdctpara implements java.io.Serializable {

    // Fields    

    private String paraname;
    private String paraval;
    private String remark;
    private Integer paraflag;

    // Constructors

    /**
     * default constructor
     */
    public TGdctpara() {
    }

    /**
     * minimal constructor
     */
    public TGdctpara(String paraname) {
        this.paraname = paraname;
    }

    /**
     * full constructor
     */
    public TGdctpara(String paraname, String paraval, String remark, Integer paraflag) {
        this.paraname = paraname;
        this.paraval = paraval;
        this.remark = remark;
        this.paraflag = paraflag;
    }

    // Property accessors
    @Id
    @Column(name = "PARANAME", unique = true, nullable = false, length = 60)
    public String getParaname() {
        return this.paraname;
    }

    public void setParaname(String paraname) {
        this.paraname = paraname;
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

    @Column(name = "PARAFLAG", precision = 1, scale = 0)
    public Integer getParaflag() {
        return this.paraflag;
    }

    public void setParaflag(Integer paraflag) {
        this.paraflag = paraflag;
    }

}