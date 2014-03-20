package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_AUTHOPTMENU")
public class TAuthoptmenu implements java.io.Serializable {

    // Fields    

    private Integer opermenuid;
    private String opercode;
    private Integer sysmenuid;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TAuthoptmenu() {
    }

    /**
     * minimal constructor
     */
    public TAuthoptmenu(Integer opermenuid, String opercode, Integer sysmenuid) {
        this.opermenuid = opermenuid;
        this.opercode = opercode;
        this.sysmenuid = sysmenuid;
    }

    /**
     * full constructor
     */
    public TAuthoptmenu(Integer opermenuid, String opercode, Integer sysmenuid, String remark) {
        this.opermenuid = opermenuid;
        this.opercode = opercode;
        this.sysmenuid = sysmenuid;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "OPERMENUID", unique = true, nullable = false, precision = 6, scale = 0)
    public Integer getOpermenuid() {
        return this.opermenuid;
    }

    public void setOpermenuid(Integer opermenuid) {
        this.opermenuid = opermenuid;
    }

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "SYSMENUID", nullable = false, precision = 6, scale = 0)
    public Integer getSysmenuid() {
        return this.sysmenuid;
    }

    public void setSysmenuid(Integer sysmenuid) {
        this.sysmenuid = sysmenuid;
    }

    @Column(name = "REMARK", length = 500)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}