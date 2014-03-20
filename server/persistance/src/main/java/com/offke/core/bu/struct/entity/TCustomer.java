package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CUSTOMER")
public class TCustomer implements java.io.Serializable {

    // Fields    

    private Integer custid;
    private String stuempno;
    private Integer custtype;
    private Integer feetype;
    private String status;
    private String custname;
    private String areacode;
    private String deptcode;
    private String deptfullname;
    private String specialtycode;
    private String classcode;
    private String classname;
    private String idtype;
    private String idno;
    private String sex;
    private String country;
    private String nation;
    private String email;
    private String tel;
    private String mobile;
    private String addr;
    private String zipcode;
    private String custattr;
    private String indate;
    private String outdate;
    private String opendate;
    private String closedate;
    private String batchno;
    private Boolean openflag;
    private Integer holdcardcnt;
    private String useflag;
    private String eaccflag;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TCustomer() {
    }

    /**
     * minimal constructor
     */
    public TCustomer(Integer custid) {
        this.custid = custid;
    }

    /**
     * full constructor
     */
    public TCustomer(
            Integer custid,
            String stuempno,
            Integer custtype,
            Integer feetype,
            String status,
            String custname,
            String areacode,
            String deptcode,
            String deptfullname,
            String specialtycode,
            String classcode,
            String classname,
            String idtype,
            String idno,
            String sex,
            String country,
            String nation,
            String email,
            String tel,
            String mobile,
            String addr,
            String zipcode,
            String custattr,
            String indate,
            String outdate,
            String opendate,
            String closedate,
            String batchno,
            Boolean openflag,
            Integer holdcardcnt,
            String useflag,
            String eaccflag,
            String lastsaved) {
        this.custid = custid;
        this.stuempno = stuempno;
        this.custtype = custtype;
        this.feetype = feetype;
        this.status = status;
        this.custname = custname;
        this.areacode = areacode;
        this.deptcode = deptcode;
        this.deptfullname = deptfullname;
        this.specialtycode = specialtycode;
        this.classcode = classcode;
        this.classname = classname;
        this.idtype = idtype;
        this.idno = idno;
        this.sex = sex;
        this.country = country;
        this.nation = nation;
        this.email = email;
        this.tel = tel;
        this.mobile = mobile;
        this.addr = addr;
        this.zipcode = zipcode;
        this.custattr = custattr;
        this.indate = indate;
        this.outdate = outdate;
        this.opendate = opendate;
        this.closedate = closedate;
        this.batchno = batchno;
        this.openflag = openflag;
        this.holdcardcnt = holdcardcnt;
        this.useflag = useflag;
        this.eaccflag = eaccflag;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "CUSTID", unique = true, nullable = false)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CUSTTYPE")
    public Integer getCusttype() {
        return this.custtype;
    }

    public void setCusttype(Integer custtype) {
        this.custtype = custtype;
    }

    @Column(name = "FEETYPE")
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "CUSTNAME", length = 60)
    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Column(name = "AREACODE", length = 3)
    public String getAreacode() {
        return this.areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Column(name = "DEPTCODE", length = 30)
    public String getDeptcode() {
        return this.deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    @Column(name = "DEPTFULLNAME", length = 1000)
    public String getDeptfullname() {
        return this.deptfullname;
    }

    public void setDeptfullname(String deptfullname) {
        this.deptfullname = deptfullname;
    }

    @Column(name = "SPECIALTYCODE", length = 30)
    public String getSpecialtycode() {
        return this.specialtycode;
    }

    public void setSpecialtycode(String specialtycode) {
        this.specialtycode = specialtycode;
    }

    @Column(name = "CLASSCODE", length = 30)
    public String getClasscode() {
        return this.classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    @Column(name = "CLASSNAME", length = 60)
    public String getClassname() {
        return this.classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Column(name = "IDTYPE", length = 1)
    public String getIdtype() {
        return this.idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    @Column(name = "IDNO", length = 60)
    public String getIdno() {
        return this.idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    @Column(name = "SEX", length = 1)
    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name = "COUNTRY", length = 3)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "NATION", length = 2)
    public String getNation() {
        return this.nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Column(name = "EMAIL", length = 60)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Column(name = "CUSTATTR", length = 10)
    public String getCustattr() {
        return this.custattr;
    }

    public void setCustattr(String custattr) {
        this.custattr = custattr;
    }

    @Column(name = "INDATE", length = 8)
    public String getIndate() {
        return this.indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    @Column(name = "OUTDATE", length = 8)
    public String getOutdate() {
        return this.outdate;
    }

    public void setOutdate(String outdate) {
        this.outdate = outdate;
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

    @Column(name = "BATCHNO", length = 30)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "OPENFLAG", precision = 1, scale = 0)
    public Boolean getOpenflag() {
        return this.openflag;
    }

    public void setOpenflag(Boolean openflag) {
        this.openflag = openflag;
    }

    @Column(name = "HOLDCARDCNT")
    public Integer getHoldcardcnt() {
        return this.holdcardcnt;
    }

    public void setHoldcardcnt(Integer holdcardcnt) {
        this.holdcardcnt = holdcardcnt;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

    @Column(name = "EACCFLAG", length = 1)
    public String getEaccflag() {
        return this.eaccflag;
    }

    public void setEaccflag(String eaccflag) {
        this.eaccflag = eaccflag;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}