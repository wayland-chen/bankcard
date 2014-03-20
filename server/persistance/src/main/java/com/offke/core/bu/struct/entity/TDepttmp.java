package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_DEPTTMP")
public class TDepttmp implements java.io.Serializable {

    // Fields    

    private String deptcode;
    private String areacode;
    private String deptname;
    private String deptename;
    private String deptfullname;
    private String fdeptcode;
    private Integer deptlevel;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TDepttmp() {
    }

    /**
     * minimal constructor
     */
    public TDepttmp(String deptcode) {
        this.deptcode = deptcode;
    }

    /**
     * full constructor
     */
    public TDepttmp(
            String deptcode,
            String areacode,
            String deptname,
            String deptename,
            String deptfullname,
            String fdeptcode,
            Integer deptlevel,
            String lastsaved) {
        this.deptcode = deptcode;
        this.areacode = areacode;
        this.deptname = deptname;
        this.deptename = deptename;
        this.deptfullname = deptfullname;
        this.fdeptcode = fdeptcode;
        this.deptlevel = deptlevel;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "DEPTCODE", unique = true, nullable = false, length = 30)
    public String getDeptcode() {
        return this.deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    @Column(name = "AREACODE", length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Column(name = "DEPTNAME", length = 240)
    public String getDeptname() {
        return this.deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Column(name = "DEPTENAME", length = 240)
    public String getDeptename() {
        return this.deptename;
    }

    public void setDeptename(String deptename) {
        this.deptename = deptename;
    }

    @Column(name = "DEPTFULLNAME", length = 1000)
    public String getDeptfullname() {
        return this.deptfullname;
    }

    public void setDeptfullname(String deptfullname) {
        this.deptfullname = deptfullname;
    }

    @Column(name = "FDEPTCODE", length = 30)
    public String getFdeptcode() {
        return this.fdeptcode;
    }

    public void setFdeptcode(String fdeptcode) {
        this.fdeptcode = fdeptcode;
    }

    @Column(name = "DEPTLEVEL")
    public Integer getDeptlevel() {
        return this.deptlevel;
    }

    public void setDeptlevel(Integer deptlevel) {
        this.deptlevel = deptlevel;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}