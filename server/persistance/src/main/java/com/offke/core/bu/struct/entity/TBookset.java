package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BOOKSET")
public class TBookset implements java.io.Serializable {

    // Fields    

    private Integer booksetno;
    private String booksetname;
    private String deptname;
    private String deptshortname;
    private Integer supervisor;
    private Short periodyear;
    private Integer periodmonth;
    private String voucherclass;
    private Integer enabledate;

    // Constructors

    /**
     * default constructor
     */
    public TBookset() {
    }

    /**
     * minimal constructor
     */
    public TBookset(Integer booksetno, String booksetname) {
        this.booksetno = booksetno;
        this.booksetname = booksetname;
    }

    /**
     * full constructor
     */
    public TBookset(
            Integer booksetno,
            String booksetname,
            String deptname,
            String deptshortname,
            Integer supervisor,
            Short periodyear,
            Integer periodmonth,
            String voucherclass,
            Integer enabledate) {
        this.booksetno = booksetno;
        this.booksetname = booksetname;
        this.deptname = deptname;
        this.deptshortname = deptshortname;
        this.supervisor = supervisor;
        this.periodyear = periodyear;
        this.periodmonth = periodmonth;
        this.voucherclass = voucherclass;
        this.enabledate = enabledate;
    }

    // Property accessors
    @Id
    @Column(name = "BOOKSETNO", unique = true, nullable = false, precision = 2, scale = 0)
    public Integer getBooksetno() {
        return this.booksetno;
    }

    public void setBooksetno(Integer booksetno) {
        this.booksetno = booksetno;
    }

    @Column(name = "BOOKSETNAME", nullable = false, length = 60)
    public String getBooksetname() {
        return this.booksetname;
    }

    public void setBooksetname(String booksetname) {
        this.booksetname = booksetname;
    }

    @Column(name = "DEPTNAME", length = 60)
    public String getDeptname() {
        return this.deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Column(name = "DEPTSHORTNAME", length = 60)
    public String getDeptshortname() {
        return this.deptshortname;
    }

    public void setDeptshortname(String deptshortname) {
        this.deptshortname = deptshortname;
    }

    @Column(name = "SUPERVISOR", precision = 9, scale = 0)
    public Integer getSupervisor() {
        return this.supervisor;
    }

    public void setSupervisor(Integer supervisor) {
        this.supervisor = supervisor;
    }

    @Column(name = "PERIODYEAR", precision = 4, scale = 0)
    public Short getPeriodyear() {
        return this.periodyear;
    }

    public void setPeriodyear(Short periodyear) {
        this.periodyear = periodyear;
    }

    @Column(name = "PERIODMONTH", precision = 2, scale = 0)
    public Integer getPeriodmonth() {
        return this.periodmonth;
    }

    public void setPeriodmonth(Integer periodmonth) {
        this.periodmonth = periodmonth;
    }

    @Column(name = "VOUCHERCLASS", precision = 1, scale = 0)
    public String getVoucherclass() {
        return this.voucherclass;
    }

    public void setVoucherclass(String voucherclass) {
        this.voucherclass = voucherclass;
    }

    @Column(name = "ENABLEDATE", precision = 8, scale = 0)
    public Integer getEnabledate() {
        return this.enabledate;
    }

    public void setEnabledate(Integer enabledate) {
        this.enabledate = enabledate;
    }

}