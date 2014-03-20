package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "T_CARDACCDIFF")
public class TCardaccdiff implements java.io.Serializable {

    // Fields    

    private TCardaccdiffId id;
    private Integer custid;
    private String stuempno;
    private String custname;
    private String areacode;
    private BigDecimal diffamt;
    private Integer diffdaycnt;
    private BigDecimal availbal;
    private BigDecimal lastcardbal;
    private Integer lastcardcnt;
    private String statdate;
    private String stattime;
    private String enddate;
    private Long maxcardcnt;
    private BigDecimal cardaftbal;
    private BigDecimal paylossamt;
    private BigDecimal dpslossamt;
    private BigDecimal totallossamt;
    private BigDecimal totallosscnt;
    private String dealdate;
    private String opercode;
    private String status;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TCardaccdiff() {
    }

    /**
     * minimal constructor
     */
    public TCardaccdiff(TCardaccdiffId id) {
        this.id = id;
    }


    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO", nullable = false)),
            @AttributeOverride(name = "startdate", column = @Column(name = "STARTDATE", nullable = false, length = 8))})
    public TCardaccdiffId getId() {
        return this.id;
    }

    public void setId(TCardaccdiffId id) {
        this.id = id;
    }

    @Column(name = "CUSTID")
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

    @Column(name = "DIFFAMT", precision = 15)
    public BigDecimal getDiffamt() {
        return this.diffamt;
    }

    public void setDiffamt(BigDecimal diffamt) {
        this.diffamt = diffamt;
    }

    @Column(name = "DIFFDAYCNT")
    public Integer getDiffdaycnt() {
        return this.diffdaycnt;
    }

    public void setDiffdaycnt(Integer diffdaycnt) {
        this.diffdaycnt = diffdaycnt;
    }

    @Column(name = "AVAILBAL", precision = 15)
    public BigDecimal getAvailbal() {
        return this.availbal;
    }

    public void setAvailbal(BigDecimal availbal) {
        this.availbal = availbal;
    }

    @Column(name = "LASTCARDBAL", precision = 15)
    public BigDecimal getLastcardbal() {
        return this.lastcardbal;
    }

    public void setLastcardbal(BigDecimal lastcardbal) {
        this.lastcardbal = lastcardbal;
    }

    @Column(name = "LASTCARDCNT")
    public Integer getLastcardcnt() {
        return this.lastcardcnt;
    }

    public void setLastcardcnt(Integer lastcardcnt) {
        this.lastcardcnt = lastcardcnt;
    }

    @Column(name = "STATDATE", length = 8)
    public String getStatdate() {
        return this.statdate;
    }

    public void setStatdate(String statdate) {
        this.statdate = statdate;
    }

    @Column(name = "STATTIME", length = 6)
    public String getStattime() {
        return this.stattime;
    }

    public void setStattime(String stattime) {
        this.stattime = stattime;
    }

    @Column(name = "ENDDATE", length = 8)
    public String getEnddate() {
        return this.enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    @Column(name = "MAXCARDCNT")
    public Long getMaxcardcnt() {
        return this.maxcardcnt;
    }

    public void setMaxcardcnt(Long maxcardcnt) {
        this.maxcardcnt = maxcardcnt;
    }

    @Column(name = "CARDAFTBAL", precision = 15)
    public BigDecimal getCardaftbal() {
        return this.cardaftbal;
    }

    public void setCardaftbal(BigDecimal cardaftbal) {
        this.cardaftbal = cardaftbal;
    }

    @Column(name = "PAYLOSSAMT", precision = 15)
    public BigDecimal getPaylossamt() {
        return this.paylossamt;
    }

    public void setPaylossamt(BigDecimal paylossamt) {
        this.paylossamt = paylossamt;
    }

    @Column(name = "DPSLOSSAMT", precision = 15)
    public BigDecimal getDpslossamt() {
        return this.dpslossamt;
    }

    public void setDpslossamt(BigDecimal dpslossamt) {
        this.dpslossamt = dpslossamt;
    }

    @Column(name = "TOTALLOSSAMT", precision = 15)
    public BigDecimal getTotallossamt() {
        return this.totallossamt;
    }

    public void setTotallossamt(BigDecimal totallossamt) {
        this.totallossamt = totallossamt;
    }

    @Column(name = "TOTALLOSSCNT")
    public BigDecimal getTotallosscnt() {
        return this.totallosscnt;
    }

    public void setTotallosscnt(BigDecimal totallosscnt) {
        this.totallosscnt = totallosscnt;
    }

    @Column(name = "DEALDATE", length = 8)
    public String getDealdate() {
        return this.dealdate;
    }

    public void setDealdate(String dealdate) {
        this.dealdate = dealdate;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}