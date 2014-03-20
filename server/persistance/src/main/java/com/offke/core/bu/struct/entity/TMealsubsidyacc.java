package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TMealsubsidyacc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_MEALSUBSIDYACC")
public class TMealsubsidyacc implements java.io.Serializable {

    // Fields

    private TMealsubsidyaccId id;
    private BigDecimal omitallowance;
    private Integer omitmoncnt;
    private BigDecimal curallowance;
    private BigDecimal difference;
    private BigDecimal allowance;
    private String stuempno;
    private String custname;
    private Integer cardno;
    private Integer status;
    private Integer countflag;
    private String checker;
    private String checkdatetime;
    private String lasteditor;
    private String lasteditdatetime;
    private String issueder;
    private String issueddatetime;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TMealsubsidyacc() {
    }

    /**
     * minimal constructor
     */
    public TMealsubsidyacc(TMealsubsidyaccId id, BigDecimal omitallowance, Integer omitmoncnt,
                           BigDecimal curallowance, BigDecimal difference, BigDecimal allowance,
                           String stuempno, Integer cardno, Integer status, Integer countflag) {
        this.id = id;
        this.omitallowance = omitallowance;
        this.omitmoncnt = omitmoncnt;
        this.curallowance = curallowance;
        this.difference = difference;
        this.allowance = allowance;
        this.stuempno = stuempno;
        this.cardno = cardno;
        this.status = status;
        this.countflag = countflag;
    }

    /**
     * full constructor
     */
    public TMealsubsidyacc(TMealsubsidyaccId id, BigDecimal omitallowance, Integer omitmoncnt,
                           BigDecimal curallowance, BigDecimal difference, BigDecimal allowance,
                           String stuempno, String custname, Integer cardno,
                           Integer status, Integer countflag, String checker, String checkdatetime,
                           String lasteditor, String lasteditdatetime, String issueder,
                           String issueddatetime, String remark) {
        this.id = id;
        this.omitallowance = omitallowance;
        this.omitmoncnt = omitmoncnt;
        this.curallowance = curallowance;
        this.difference = difference;
        this.allowance = allowance;
        this.stuempno = stuempno;
        this.custname = custname;
        this.cardno = cardno;
        this.status = status;
        this.countflag = countflag;
        this.checker = checker;
        this.checkdatetime = checkdatetime;
        this.lasteditor = lasteditor;
        this.lasteditdatetime = lasteditdatetime;
        this.issueder = issueder;
        this.issueddatetime = issueddatetime;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "countmonth", column = @Column(name = "COUNTMONTH", nullable = false, length = 6)),
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", nullable = false, precision = 22, scale = 0))})
    public TMealsubsidyaccId getId() {
        return this.id;
    }

    public void setId(TMealsubsidyaccId id) {
        this.id = id;
    }

    @Column(name = "OMITALLOWANCE", nullable = false, precision = 8, scale = 2)
    public BigDecimal getOmitallowance() {
        return this.omitallowance;
    }

    public void setOmitallowance(BigDecimal omitallowance) {
        this.omitallowance = omitallowance;
    }

    @Column(name = "OMITMONCNT", nullable = false, precision = 10)
    public Integer getOmitmoncnt() {
        return this.omitmoncnt;
    }

    public void setOmitmoncnt(Integer omitmoncnt) {
        this.omitmoncnt = omitmoncnt;
    }

    @Column(name = "CURALLOWANCE", nullable = false, precision = 8, scale = 2)
    public BigDecimal getCurallowance() {
        return this.curallowance;
    }

    public void setCurallowance(BigDecimal curallowance) {
        this.curallowance = curallowance;
    }

    @Column(name = "DIFFERENCE", nullable = false, precision = 8, scale = 2)
    public BigDecimal getDifference() {
        return this.difference;
    }

    public void setDifference(BigDecimal difference) {
        this.difference = difference;
    }

    @Column(name = "ALLOWANCE", nullable = false, precision = 8, scale = 2)
    public BigDecimal getAllowance() {
        return this.allowance;
    }

    public void setAllowance(BigDecimal allowance) {
        this.allowance = allowance;
    }

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CUSTNAME", length = 60)
    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Column(name = "CARDNO", precision = 22, scale = 0)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "COUNTFLAG", nullable = false, precision = 1, scale = 0)
    public Integer getCountflag() {
        return this.countflag;
    }

    public void setCountflag(Integer countflag) {
        this.countflag = countflag;
    }

    @Column(name = "CHECKER", length = 10)
    public String getChecker() {
        return this.checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    @Column(name = "CHECKDATETIME", length = 14)
    public String getCheckdatetime() {
        return this.checkdatetime;
    }

    public void setCheckdatetime(String checkdatetime) {
        this.checkdatetime = checkdatetime;
    }

    @Column(name = "LASTEDITOR", length = 10)
    public String getLasteditor() {
        return this.lasteditor;
    }

    public void setLasteditor(String lasteditor) {
        this.lasteditor = lasteditor;
    }

    @Column(name = "LASTEDITDATETIME", length = 14)
    public String getLasteditdatetime() {
        return this.lasteditdatetime;
    }

    public void setLasteditdatetime(String lasteditdatetime) {
        this.lasteditdatetime = lasteditdatetime;
    }

    @Column(name = "ISSUEDER", length = 10)
    public String getIssueder() {
        return this.issueder;
    }

    public void setIssueder(String issueder) {
        this.issueder = issueder;
    }

    @Column(name = "ISSUEDDATETIME", length = 14)
    public String getIssueddatetime() {
        return this.issueddatetime;
    }

    public void setIssueddatetime(String issueddatetime) {
        this.issueddatetime = issueddatetime;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}