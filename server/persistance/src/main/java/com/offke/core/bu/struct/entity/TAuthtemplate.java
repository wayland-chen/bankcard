package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_AUTHTEMPLATE"
)
public class TAuthtemplate implements java.io.Serializable {


    // Fields    

    private Integer templateid;
    private Integer using;
    private String templatename;
    private String opercode;
    private String lastsaved;
    private String remark;


    // Constructors

    /**
     * default constructor
     */
    public TAuthtemplate() {
    }

    /**
     * minimal constructor
     */
    public TAuthtemplate(Integer templateid, Integer using, String templatename, String opercode) {
        this.templateid = templateid;
        this.using = using;
        this.templatename = templatename;
        this.opercode = opercode;
    }

    /**
     * full constructor
     */
    public TAuthtemplate(Integer templateid, Integer using, String templatename, String opercode, String lastsaved, String remark) {
        this.templateid = templateid;
        this.using = using;
        this.templatename = templatename;
        this.opercode = opercode;
        this.lastsaved = lastsaved;
        this.remark = remark;
    }


    // Property accessors
    @Id

    @Column(name = "TEMPLATEID", unique = true, nullable = false, precision = 6, scale = 0)

    public Integer getTemplateid() {
        return this.templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    @Column(name = "USING", nullable = false, precision = 1, scale = 0)

    public Integer getUsing() {
        return this.using;
    }

    public void setUsing(Integer using) {
        this.using = using;
    }

    @Column(name = "TEMPLATENAME", nullable = false, length = 256)

    public String getTemplatename() {
        return this.templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    @Column(name = "OPERCODE", length = 8)

    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "LASTSAVED", length = 30)

    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

    @Column(name = "REMARK", length = 512)

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}