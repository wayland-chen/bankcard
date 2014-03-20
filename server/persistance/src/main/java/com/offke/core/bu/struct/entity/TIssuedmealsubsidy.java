package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TIssuedmealsubsidy entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_ISSUEDMEALSUBSIDY", schema = "YKT_CUR")
public class TIssuedmealsubsidy implements java.io.Serializable {

    // Fields

    private TIssuedmealsubsidyId id;
    private String issuedmonth;
    private BigDecimal lastomitallowance;
    private BigDecimal curallowance;
    private BigDecimal difference;
    private BigDecimal issuedallowance;
    private String stuempno;
    private String custname;
    private Integer cardno;
    private Integer status;
    private Integer issuedfundtype;
    private String issuedvoucherno;
    private String issueder;
    private String issueddatetime;
    private Integer issudetermid;
    private Integer issudetermseqno;
    private String drawdatetime;
    private Integer drawtermid;
    private Integer drawterseqno;
    private Integer drawcardno;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TIssuedmealsubsidy() {
    }

    /**
     * minimal constructor
     */
    public TIssuedmealsubsidy(TIssuedmealsubsidyId id, String issuedmonth,
                              BigDecimal lastomitallowance, BigDecimal curallowance,
                              BigDecimal difference, BigDecimal issuedallowance, String stuempno,
                              Integer cardno, Integer status, Integer issuedfundtype,
                              String issueder, String issueddatetime, Integer issudetermid,
                              Integer issudetermseqno) {
        this.id = id;
        this.issuedmonth = issuedmonth;
        this.lastomitallowance = lastomitallowance;
        this.curallowance = curallowance;
        this.difference = difference;
        this.issuedallowance = issuedallowance;
        this.stuempno = stuempno;
        this.cardno = cardno;
        this.status = status;
        this.issuedfundtype = issuedfundtype;
        this.issueder = issueder;
        this.issueddatetime = issueddatetime;
        this.issudetermid = issudetermid;
        this.issudetermseqno = issudetermseqno;
    }

    /**
     * full constructor
     */
    public TIssuedmealsubsidy(TIssuedmealsubsidyId id, String issuedmonth,
                              BigDecimal lastomitallowance, BigDecimal curallowance,
                              BigDecimal difference, BigDecimal issuedallowance, String stuempno,
                              String custname, Integer cardno, Integer status,
                              Integer issuedfundtype, String issuedvoucherno, String issueder, String issueddatetime,
                              Integer issudetermid, Integer issudetermseqno,
                              String drawdatetime, Integer drawtermid,
                              Integer drawterseqno, Integer drawcardno, String remark) {
        this.id = id;
        this.issuedmonth = issuedmonth;
        this.lastomitallowance = lastomitallowance;
        this.curallowance = curallowance;
        this.difference = difference;
        this.issuedallowance = issuedallowance;
        this.stuempno = stuempno;
        this.custname = custname;
        this.cardno = cardno;
        this.status = status;
        this.issuedfundtype = issuedfundtype;
        this.issuedvoucherno = issuedvoucherno;
        this.issueder = issueder;
        this.issueddatetime = issueddatetime;
        this.issudetermid = issudetermid;
        this.issudetermseqno = issudetermseqno;
        this.drawdatetime = drawdatetime;
        this.drawtermid = drawtermid;
        this.drawterseqno = drawterseqno;
        this.drawcardno = drawcardno;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "issuedbatchno", column = @Column(name = "ISSUEDBATCHNO", nullable = false, precision = 22, scale = 0)),
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", nullable = false, precision = 22, scale = 0))})
    public TIssuedmealsubsidyId getId() {
        return this.id;
    }

    public void setId(TIssuedmealsubsidyId id) {
        this.id = id;
    }

    @Column(name = "ISSUEDMONTH", nullable = false, length = 6)
    public String getIssuedmonth() {
        return this.issuedmonth;
    }

    public void setIssuedmonth(String issuedmonth) {
        this.issuedmonth = issuedmonth;
    }

    @Column(name = "LASTOMITALLOWANCE", nullable = false, precision = 8)
    public BigDecimal getLastomitallowance() {
        return this.lastomitallowance;
    }

    public void setLastomitallowance(BigDecimal lastomitallowance) {
        this.lastomitallowance = lastomitallowance;
    }

    @Column(name = "CURALLOWANCE", nullable = false, precision = 8)
    public BigDecimal getCurallowance() {
        return this.curallowance;
    }

    public void setCurallowance(BigDecimal curallowance) {
        this.curallowance = curallowance;
    }

    @Column(name = "DIFFERENCE", nullable = false, precision = 8)
    public BigDecimal getDifference() {
        return this.difference;
    }

    public void setDifference(BigDecimal difference) {
        this.difference = difference;
    }

    @Column(name = "ISSUEDALLOWANCE", nullable = false, precision = 8)
    public BigDecimal getIssuedallowance() {
        return this.issuedallowance;
    }

    public void setIssuedallowance(BigDecimal issuedallowance) {
        this.issuedallowance = issuedallowance;
    }

    @Column(name = "STUEMPNO", nullable = false, length = 20)
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

    @Column(name = "CARDNO", nullable = false, precision = 22, scale = 0)
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

    @Column(name = "ISSUEDFUNDTYPE", nullable = false, precision = 1, scale = 0)
    public Integer getIssuedfundtype() {
        return this.issuedfundtype;
    }

    public void setIssuedfundtype(Integer issuedfundtype) {
        this.issuedfundtype = issuedfundtype;
    }


    @Column(name = "ISSUEDVOUCHERNO", length = 20)
    public String getIssuedvoucherno() {
        return this.issuedvoucherno;
    }

    public void setIssuedvoucherno(String issuedvoucherno) {
        this.issuedvoucherno = issuedvoucherno;
    }

    @Column(name = "ISSUEDER", nullable = false, length = 10)
    public String getIssueder() {
        return this.issueder;
    }

    public void setIssueder(String issueder) {
        this.issueder = issueder;
    }

    @Column(name = "ISSUEDDATETIME", nullable = false, length = 14)
    public String getIssueddatetime() {
        return this.issueddatetime;
    }

    public void setIssueddatetime(String issueddatetime) {
        this.issueddatetime = issueddatetime;
    }

    @Column(name = "ISSUDETERMID", nullable = false, precision = 22, scale = 0)
    public Integer getIssudetermid() {
        return this.issudetermid;
    }

    public void setIssudetermid(Integer issudetermid) {
        this.issudetermid = issudetermid;
    }

    @Column(name = "ISSUDETERMSEQNO", nullable = false, precision = 22, scale = 0)
    public Integer getIssudetermseqno() {
        return this.issudetermseqno;
    }

    public void setIssudetermseqno(Integer issudetermseqno) {
        this.issudetermseqno = issudetermseqno;
    }

    @Column(name = "DRAWDATETIME", length = 14)
    public String getDrawdatetime() {
        return this.drawdatetime;
    }

    public void setDrawdatetime(String drawdatetime) {
        this.drawdatetime = drawdatetime;
    }

    @Column(name = "DRAWTERMID", precision = 22, scale = 0)
    public Integer getDrawtermid() {
        return this.drawtermid;
    }

    public void setDrawtermid(Integer drawtermid) {
        this.drawtermid = drawtermid;
    }

    @Column(name = "DRAWTERSEQNO", precision = 22, scale = 0)
    public Integer getDrawterseqno() {
        return this.drawterseqno;
    }

    public void setDrawterseqno(Integer drawterseqno) {
        this.drawterseqno = drawterseqno;
    }

    @Column(name = "DRAWCARDNO", precision = 22, scale = 0)
    public Integer getDrawcardno() {
        return this.drawcardno;
    }

    public void setDrawcardno(Integer drawcardno) {
        this.drawcardno = drawcardno;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}