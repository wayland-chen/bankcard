package com.offke.core.bu.struct.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CUSTOMERTMP")
public class TCustomertmp implements java.io.Serializable {

    // Fields    

    private TCustomertmpId id;
    private String transdate;
    private String opercode;
    private String stuempno;
    private Integer custtype;
    private String custtypename;
    private Integer feetype;
    private String custname;
    private String areacode;
    private String deptcode;
    private String deptname;
    private String specialtycode;
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
    private String indate;
    private String outdate;
    private String syncflag;
    private String chkflag;
    private String errmsg;
    private String updflag;

    // Constructors

    /**
     * default constructor
     */
    public TCustomertmp() {
    }

    /**
     * full constructor
     */
    public TCustomertmp(TCustomertmpId id) {
        this.id = id;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "batchno", column = @Column(name = "BATCHNO", nullable = false, length = 30)),
            @AttributeOverride(name = "seqno", column = @Column(name = "SEQNO", nullable = false))})
    public TCustomertmpId getId() {
        return this.id;
    }

    public void setId(TCustomertmpId id) {
        this.id = id;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
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

    @Column(name = "DEPTNAME", length = 90)
    public String getDeptname() {
        return this.deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Column(name = "SPECIALTYCODE", length = 30)
    public String getSpecialtycode() {
        return this.specialtycode;
    }

    public void setSpecialtycode(String specialtycode) {
        this.specialtycode = specialtycode;
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

    @Column(name = "SYNCFLAG", nullable = false, precision = 1, scale = 0)
    public String getSyncflag() {
        return this.syncflag;
    }

    public void setSyncflag(String syncflag) {
        this.syncflag = syncflag;
    }

    @Column(name = "CHKFLAG", nullable = false, precision = 1, scale = 0)
    public String getChkflag() {
        return this.chkflag;
    }

    public void setChkflag(String chkflag) {
        this.chkflag = chkflag;
    }

    @Column(name = "ERRMSG", length = 240)
    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Column(name = "UPDFLAG", precision = 1, scale = 0)
    public String getUpdflag() {
        return this.updflag;
    }

    public void setUpdflag(String updflag) {
        this.updflag = updflag;
    }

}