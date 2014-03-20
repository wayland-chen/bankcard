package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_CUSTTYPE")
public class TCusttype implements java.io.Serializable {

    // Fields    

    private Integer custtype;
    private String custtypename;
    private Integer feetype;
    private String areacode;
    private String oldcusttype;
    private String useflag;

    // Constructors

    /**
     * default constructor
     */
    public TCusttype() {
    }

    /**
     * minimal constructor
     */
    public TCusttype(Integer custtype) {
        this.custtype = custtype;
    }

    /**
     * full constructor
     */
    public TCusttype(
            Integer custtype,
            String custtypename,
            Integer feetype,
            String areacode,
            String oldcusttype,
            String useflag) {
        this.custtype = custtype;
        this.custtypename = custtypename;
        this.feetype = feetype;
        this.areacode = areacode;
        this.oldcusttype = oldcusttype;
        this.useflag = useflag;
    }

    // Property accessors
    @Id
    @Column(name = "CUSTTYPE", unique = true, nullable = false)
    public Integer getCusttype() {
        return this.custtype;
    }

    public void setCusttype(Integer custtype) {
        this.custtype = custtype;
    }

    @Column(name = "CUSTTYPENAME", length = 60)
    public String getCusttypename() {
        return this.custtypename;
    }

    public void setCusttypename(String custtypename) {
        this.custtypename = custtypename;
    }

    @Column(name = "FEETYPE")
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "AREACODE", length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Column(name = "OLDCUSTTYPE", length = 10)
    public String getOldcusttype() {
        return this.oldcusttype;
    }

    public void setOldcusttype(String oldcusttype) {
        this.oldcusttype = oldcusttype;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

}