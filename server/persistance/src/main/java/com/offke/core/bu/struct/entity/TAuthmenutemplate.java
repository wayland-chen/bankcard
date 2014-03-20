package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_AUTHMENUTEMPLATE")
public class TAuthmenutemplate implements java.io.Serializable {

    // Fields    

    private Integer menutemplateid;
    private Integer templateid;
    private Integer sysmenuid;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TAuthmenutemplate() {
    }

    /**
     * minimal constructor
     */
    public TAuthmenutemplate(Integer menutemplateid, Integer templateid, Integer sysmenuid) {
        this.menutemplateid = menutemplateid;
        this.templateid = templateid;
        this.sysmenuid = sysmenuid;
    }

    /**
     * full constructor
     */
    public TAuthmenutemplate(Integer menutemplateid, Integer templateid, Integer sysmenuid, String remark) {
        this.menutemplateid = menutemplateid;
        this.templateid = templateid;
        this.sysmenuid = sysmenuid;
        this.remark = remark;
    }

    // Property accessors
    @Id
    @Column(name = "MENUTEMPLATEID", unique = true, nullable = false, precision = 6, scale = 0)
    public Integer getMenutemplateid() {
        return this.menutemplateid;
    }

    public void setMenutemplateid(Integer menutemplateid) {
        this.menutemplateid = menutemplateid;
    }

    @Column(name = "TEMPLATEID", nullable = false, precision = 6, scale = 0)
    public Integer getTemplateid() {
        return this.templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
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