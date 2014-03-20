package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BRANCH")
public class TBranch implements java.io.Serializable {

    // Fields    

    private Integer branchno;
    private String areacode;
    private String branchname;
    private String branchtype;
    private String bankcode;
    private String bankaccno;
    private String bankaccname;
    private String contactman;
    private String tel;
    private String mobile;
    private String fax;
    private String addr;
    private String zipcode;
    private String status;
    private String opendate;
    private String closedate;
    private String useflag;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TBranch() {
    }

    /**
     * minimal constructor
     */
    public TBranch(Integer branchno) {
        this.branchno = branchno;
    }

    /**
     * full constructor
     */
    public TBranch(
            Integer branchno,
            String areacode,
            String branchname,
            String branchtype,
            String bankcode,
            String bankaccno,
            String bankaccname,
            String contactman,
            String tel,
            String mobile,
            String fax,
            String addr,
            String zipcode,
            String status,
            String opendate,
            String closedate,
            String useflag,
            String lastsaved) {
        this.branchno = branchno;
        this.areacode = areacode;
        this.branchname = branchname;
        this.branchtype = branchtype;
        this.bankcode = bankcode;
        this.bankaccno = bankaccno;
        this.bankaccname = bankaccname;
        this.contactman = contactman;
        this.tel = tel;
        this.mobile = mobile;
        this.fax = fax;
        this.addr = addr;
        this.zipcode = zipcode;
        this.status = status;
        this.opendate = opendate;
        this.closedate = closedate;
        this.useflag = useflag;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "BRANCHNO", unique = true, nullable = false)
    public Integer getBranchno() {
        return this.branchno;
    }

    public void setBranchno(Integer branchno) {
        this.branchno = branchno;
    }

    @Column(name = "AREACODE", length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Column(name = "BRANCHNAME", length = 60)
    public String getBranchname() {
        return this.branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    @Column(name = "BRANCHTYPE", length = 1)
    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    @Column(name = "BANKCODE", length = 2)
    public String getBankcode() {
        return this.bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Column(name = "BANKACCNO", length = 20)
    public String getBankaccno() {
        return this.bankaccno;
    }

    public void setBankaccno(String bankaccno) {
        this.bankaccno = bankaccno;
    }

    @Column(name = "BANKACCNAME", length = 60)
    public String getBankaccname() {
        return this.bankaccname;
    }

    public void setBankaccname(String bankaccname) {
        this.bankaccname = bankaccname;
    }

    @Column(name = "CONTACTMAN", length = 60)
    public String getContactman() {
        return this.contactman;
    }

    public void setContactman(String contactman) {
        this.contactman = contactman;
    }

    @Column(name = "TEL", length = 30)
    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Column(name = "MOBILE", length = 30)
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name = "FAX", length = 30)
    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Column(name = "ADDR", length = 240)
    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Column(name = "ZIPCODE", length = 6)
    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "OPENDATE", length = 8)
    public String getOpendate() {
        return this.opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    @Column(name = "CLOSEDATE", length = 8)
    public String getClosedate() {
        return this.closedate;
    }

    public void setClosedate(String closedate) {
        this.closedate = closedate;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}