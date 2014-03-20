package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TFeetype entity. 收费类别表
 */
@Entity
@Table(name = "T_FEETYPE")
public class TFeetype implements java.io.Serializable {

    // Fields    

    private Integer feetype;
    private String feename;
    private String boardfeeflag;
    private String useflag;
    private String remark;
    private BigDecimal boardfeerate;

    // Constructors

    /**
     * default constructor
     */
    public TFeetype() {
    }

    /**
     * minimal constructor
     */
    public TFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    /**
     * full constructor
     */
    public TFeetype(
            Integer feetype,
            String feename,
            String boardfeeflag,
            String useflag,
            String remark,
            BigDecimal boardfeerate) {
        this.feetype = feetype;
        this.feename = feename;
        this.boardfeeflag = boardfeeflag;
        this.useflag = useflag;
        this.remark = remark;
        this.boardfeerate = boardfeerate;
    }

    // Property accessors
    @Id
    @Column(name = "FEETYPE", unique = true, nullable = false)
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "FEENAME", length = 60)
    public String getFeename() {
        return this.feename;
    }

    public void setFeename(String feename) {
        this.feename = feename;
    }

    @Column(name = "BOARDFEEFLAG", length = 1)
    public String getBoardfeeflag() {
        return this.boardfeeflag;
    }

    public void setBoardfeeflag(String boardfeeflag) {
        this.boardfeeflag = boardfeeflag;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "BOARDFEERATE", precision = 8)
    public BigDecimal getBoardfeerate() {
        return this.boardfeerate;
    }

    public void setBoardfeerate(BigDecimal boardfeerate) {
        this.boardfeerate = boardfeerate;
    }

}