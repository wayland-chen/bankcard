package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TPhotolimit entity.
 */
@Entity
@Table(name = "T_PHOTOLIMIT")
public class TPhotolimit implements java.io.Serializable {

    // Fields    

    private String opercode;
    private String opername;
    private String operpwd;
    private String operlimit;
    private String enabled;
    private String begindate;
    private String enddate;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TPhotolimit() {
    }

    /**
     * minimal constructor
     */
    public TPhotolimit(String opercode) {
        this.opercode = opercode;
    }

    /**
     * full constructor
     */
    public TPhotolimit(
            String opercode,
            String opername,
            String operpwd,
            String operlimit,
            String enabled,
            String begindate,
            String enddate,
            String remark) {
        this.opercode = opercode;
        this.opername = opername;
        this.operpwd = operpwd;
        this.operlimit = operlimit;
        this.enabled = enabled;
        this.begindate = begindate;
        this.enddate = enddate;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "OPERCODE", unique = true, nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "OPERNAME", length = 60)
    public String getOpername() {
        return this.opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    @Column(name = "OPERPWD", length = 64)
    public String getOperpwd() {
        return this.operpwd;
    }

    public void setOperpwd(String operpwd) {
        this.operpwd = operpwd;
    }

    @Column(name = "OPERLIMIT", length = 60)
    public String getOperlimit() {
        return this.operlimit;
    }

    public void setOperlimit(String operlimit) {
        this.operlimit = operlimit;
    }

    @Column(name = "ENABLED", length = 1)
    public String getEnabled() {
        return this.enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Column(name = "BEGINDATE", length = 8)
    public String getBegindate() {
        return this.begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    @Column(name = "ENDDATE", length = 8)
    public String getEnddate() {
        return this.enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}