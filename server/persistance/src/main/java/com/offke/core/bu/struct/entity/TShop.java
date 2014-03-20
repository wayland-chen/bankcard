package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


/**
 * TShop entity.
 */
@Entity
@Table(name = "T_SHOP")
public class TShop implements java.io.Serializable {

    // Fields    

    private Integer shopid;
    private Integer fshopid;
    private String areacode;
    private String deptcode;
    private String shopname;
    private Integer shoptype;
    private String accflag;
    private String status;
    private String accno;
    private String contactman;
    private String idtype;
    private String idno;
    private String tel;
    private String mobile;
    private String email;
    private String addr;
    private String zipcode;
    private String boardfeeflag;
    private String rakeofftype;
    private BigDecimal rakeoffrate;
    private BigDecimal depositagio;
    private Integer depositcnt;
    private BigDecimal depositamt;
    private BigDecimal discountamt;
    private String bankcode;
    private String bankaccno;
    private String bankaccname;
    private String opendate;
    private String closedate;
    private String useflag;

    // Constructors

    /**
     * default constructor
     */
    public TShop() {
    }

    /**
     * minimal constructor
     */
    public TShop(Integer shopid) {
        this.shopid = shopid;
    }

    /**
     * full constructor
     */
    public TShop(
            Integer shopid,
            Integer fshopid,
            String areacode,
            String deptcode,
            String shopname,
            Integer shoptype,
            String accflag,
            String status,
            String accno,
            String contactman,
            String idtype,
            String idno,
            String tel,
            String mobile,
            String email,
            String addr,
            String zipcode,
            String boardfeeflag,
            String rakeofftype,
            BigDecimal rakeoffrate,
            BigDecimal depositagio,
            Integer depositcnt,
            BigDecimal depositamt,
            BigDecimal discountamt,
            String bankcode,
            String bankaccno,
            String bankaccname,
            String opendate,
            String closedate,
            String useflag) {
        this.shopid = shopid;
        this.fshopid = fshopid;
        this.areacode = areacode;
        this.deptcode = deptcode;
        this.shopname = shopname;
        this.shoptype = shoptype;
        this.accflag = accflag;
        this.status = status;
        this.accno = accno;
        this.contactman = contactman;
        this.idtype = idtype;
        this.idno = idno;
        this.tel = tel;
        this.mobile = mobile;
        this.email = email;
        this.addr = addr;
        this.zipcode = zipcode;
        this.boardfeeflag = boardfeeflag;
        this.rakeofftype = rakeofftype;
        this.rakeoffrate = rakeoffrate;
        this.depositagio = depositagio;
        this.depositcnt = depositcnt;
        this.depositamt = depositamt;
        this.discountamt = discountamt;
        this.bankcode = bankcode;
        this.bankaccno = bankaccno;
        this.bankaccname = bankaccname;
        this.opendate = opendate;
        this.closedate = closedate;
        this.useflag = useflag;
    }

    // Property accessors
    @Id
    @Column(name = "SHOPID", unique = true, nullable = false)
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "FSHOPID")
    public Integer getFshopid() {
        return this.fshopid;
    }

    public void setFshopid(Integer fshopid) {
        this.fshopid = fshopid;
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

    @Column(name = "SHOPNAME", length = 60)
    public String getShopname() {
        return this.shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    @Column(name = "SHOPTYPE", precision = 1, scale = 0)
    public Integer getShoptype() {
        return this.shoptype;
    }

    public void setShoptype(Integer shoptype) {
        this.shoptype = shoptype;
    }

    @Column(name = "ACCFLAG", length = 1)
    public String getAccflag() {
        return this.accflag;
    }

    public void setAccflag(String accflag) {
        this.accflag = accflag;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "ACCNO", length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "CONTACTMAN", length = 60)
    public String getContactman() {
        return this.contactman;
    }

    public void setContactman(String contactman) {
        this.contactman = contactman;
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

    @Column(name = "EMAIL", length = 60)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Column(name = "BOARDFEEFLAG", length = 1)
    public String getBoardfeeflag() {
        return this.boardfeeflag;
    }

    public void setBoardfeeflag(String boardfeeflag) {
        this.boardfeeflag = boardfeeflag;
    }

    @Column(name = "RAKEOFFTYPE", length = 1)
    public String getRakeofftype() {
        return this.rakeofftype;
    }

    public void setRakeofftype(String rakeofftype) {
        this.rakeofftype = rakeofftype;
    }

    @Column(name = "RAKEOFFRATE", precision = 5, scale = 4)
    public BigDecimal getRakeoffrate() {
        return this.rakeoffrate;
    }

    public void setRakeoffrate(BigDecimal rakeoffrate) {
        this.rakeoffrate = rakeoffrate;
    }

    @Column(name = "DEPOSITAGIO", precision = 5, scale = 4)
    public BigDecimal getDepositagio() {
        return this.depositagio;
    }

    public void setDepositagio(BigDecimal depositagio) {
        this.depositagio = depositagio;
    }

    @Column(name = "DEPOSITCNT")
    public Integer getDepositcnt() {
        return this.depositcnt;
    }

    public void setDepositcnt(Integer depositcnt) {
        this.depositcnt = depositcnt;
    }

    @Column(name = "DEPOSITAMT", precision = 15)
    public BigDecimal getDepositamt() {
        return this.depositamt;
    }

    public void setDepositamt(BigDecimal depositamt) {
        this.depositamt = depositamt;
    }

    @Column(name = "DISCOUNTAMT", precision = 15)
    public BigDecimal getDiscountamt() {
        return this.discountamt;
    }

    public void setDiscountamt(BigDecimal discountamt) {
        this.discountamt = discountamt;
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

}