package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 区域表
 */
@Entity
@Table(name = "T_AREA")
public class TArea implements java.io.Serializable {

    // Fields    

    private String areacode;
    private String areaname;
    private String fareacode;
    private String oldareacode;
    private Integer arealevel;
    private String addr;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TArea() {
    }

    /**
     * minimal constructor
     */
    public TArea(String areacode) {
        this.areacode = areacode;
    }

    /**
     * full constructor
     */
    public TArea(
            String areacode,
            String areaname,
            String fareacode,
            String oldareacode,
            Integer arealevel,
            String addr,
            String remark) {
        this.areacode = areacode;
        this.areaname = areaname;
        this.fareacode = fareacode;
        this.oldareacode = oldareacode;
        this.arealevel = arealevel;
        this.addr = addr;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "AREACODE", unique = true, nullable = false, length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Column(name = "AREANAME", length = 60)
    public String getAreaname() {
        return this.areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    @Column(name = "FAREACODE", length = 3)
    public String getFareacode() {
        return this.fareacode;
    }

    public void setFareacode(String fareacode) {
        this.fareacode = fareacode;
    }

    @Column(name = "OLDAREACODE", length = 3)
    public String getOldareacode() {
        return this.oldareacode;
    }

    public void setOldareacode(String oldareacode) {
        this.oldareacode = oldareacode;
    }

    @Column(name = "AREALEVEL")
    public Integer getArealevel() {
        return this.arealevel;
    }

    public void setArealevel(Integer arealevel) {
        this.arealevel = arealevel;
    }

    @Column(name = "ADDR", length = 240)
    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}