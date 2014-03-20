package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CFGACCCHK")
public class TCfgaccchk implements java.io.Serializable {

    // Fields    

    private Integer accchktype;
    private String accchktypename;
    private String accchkfilepath;
    private String accchkexcname;
    private Integer bccdrtpno;
    private Integer bccfuncno;
    private Integer bcctimeout;
    private String delflag;

    // Constructors

    /**
     * default constructor
     */
    public TCfgaccchk() {
    }

    /**
     * minimal constructor
     */
    public TCfgaccchk(Integer accchktype) {
        this.accchktype = accchktype;
    }

    /**
     * full constructor
     */
    public TCfgaccchk(
            Integer accchktype,
            String accchktypename,
            String accchkfilepath,
            String accchkexcname,
            Integer bccdrtpno,
            Integer bccfuncno,
            Integer bcctimeout,
            String delflag) {
        this.accchktype = accchktype;
        this.accchktypename = accchktypename;
        this.accchkfilepath = accchkfilepath;
        this.accchkexcname = accchkexcname;
        this.bccdrtpno = bccdrtpno;
        this.bccfuncno = bccfuncno;
        this.bcctimeout = bcctimeout;
        this.delflag = delflag;
    }

    // Property accessors
    @Id
    @Column(name = "ACCCHKTYPE", unique = true, nullable = false)
    public Integer getAccchktype() {
        return this.accchktype;
    }

    public void setAccchktype(Integer accchktype) {
        this.accchktype = accchktype;
    }

    @Column(name = "ACCCHKTYPENAME", length = 30)
    public String getAccchktypename() {
        return this.accchktypename;
    }

    public void setAccchktypename(String accchktypename) {
        this.accchktypename = accchktypename;
    }

    @Column(name = "ACCCHKFILEPATH", length = 240)
    public String getAccchkfilepath() {
        return this.accchkfilepath;
    }

    public void setAccchkfilepath(String accchkfilepath) {
        this.accchkfilepath = accchkfilepath;
    }

    @Column(name = "ACCCHKEXCNAME", length = 30)
    public String getAccchkexcname() {
        return this.accchkexcname;
    }

    public void setAccchkexcname(String accchkexcname) {
        this.accchkexcname = accchkexcname;
    }

    @Column(name = "BCCDRTPNO")
    public Integer getBccdrtpno() {
        return this.bccdrtpno;
    }

    public void setBccdrtpno(Integer bccdrtpno) {
        this.bccdrtpno = bccdrtpno;
    }

    @Column(name = "BCCFUNCNO")
    public Integer getBccfuncno() {
        return this.bccfuncno;
    }

    public void setBccfuncno(Integer bccfuncno) {
        this.bccfuncno = bccfuncno;
    }

    @Column(name = "BCCTIMEOUT")
    public Integer getBcctimeout() {
        return this.bcctimeout;
    }

    public void setBcctimeout(Integer bcctimeout) {
        this.bcctimeout = bcctimeout;
    }

    @Column(name = "DELFLAG", length = 1)
    public String getDelflag() {
        return this.delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

}