package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDoordownload entity.
 */
@Entity
@Table(name = "T_DOORDOWNLOAD")
public class TDoordownload implements java.io.Serializable {

    // Fields    

    private Integer id;
    private String cardverno;
    private Integer custid;
    private Integer ctrlid;
    private Integer sysid;
    private Integer cardno;
    private String cardphyid;
    private String rightbit;
    private Integer cardseqno;
    private Integer weekid;
    private Integer weekseqno;
    private Integer holidayid;
    private Integer holidayseqno;
    private String createtime;
    private String succtime;
    private Integer status;
    private Integer adddelflag;
    private Integer doorcount;

    // Constructors

    /**
     * default constructor
     */
    public TDoordownload() {
    }

    /**
     * minimal constructor
     */
    public TDoordownload(
            Integer id,
            Integer custid,
            Integer ctrlid,
            Integer sysid,
            Integer cardno,
            String cardphyid,
            Integer cardseqno,
            Integer weekid,
            Integer weekseqno,
            Integer holidayid,
            Integer holidayseqno,
            String createtime,
            Integer status,
            Integer adddelflag) {
        this.id = id;
        this.custid = custid;
        this.ctrlid = ctrlid;
        this.sysid = sysid;
        this.cardno = cardno;
        this.cardphyid = cardphyid;
        this.cardseqno = cardseqno;
        this.weekid = weekid;
        this.weekseqno = weekseqno;
        this.holidayid = holidayid;
        this.holidayseqno = holidayseqno;
        this.createtime = createtime;
        this.status = status;
        this.adddelflag = adddelflag;
    }

    /**
     * full constructor
     */
    public TDoordownload(
            Integer id,
            String cardverno,
            Integer custid,
            Integer ctrlid,
            Integer sysid,
            Integer cardno,
            String cardphyid,
            String rightbit,
            Integer cardseqno,
            Integer weekid,
            Integer weekseqno,
            Integer holidayid,
            Integer holidayseqno,
            String createtime,
            String succtime,
            Integer status,
            Integer adddelflag,
            Integer doorcount) {
        this.id = id;
        this.cardverno = cardverno;
        this.custid = custid;
        this.ctrlid = ctrlid;
        this.sysid = sysid;
        this.cardno = cardno;
        this.cardphyid = cardphyid;
        this.rightbit = rightbit;
        this.cardseqno = cardseqno;
        this.weekid = weekid;
        this.weekseqno = weekseqno;
        this.holidayid = holidayid;
        this.holidayseqno = holidayseqno;
        this.createtime = createtime;
        this.succtime = succtime;
        this.status = status;
        this.adddelflag = adddelflag;
        this.doorcount = doorcount;
    }

    // Property accessors
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "CARDVERNO", length = 12)
    public String getCardverno() {
        return this.cardverno;
    }

    public void setCardverno(String cardverno) {
        this.cardverno = cardverno;
    }

    @Column(name = "CUSTID", nullable = false)
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "CTRLID", nullable = false)
    public Integer getCtrlid() {
        return this.ctrlid;
    }

    public void setCtrlid(Integer ctrlid) {
        this.ctrlid = ctrlid;
    }

    @Column(name = "SYSID", nullable = false)
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "CARDPHYID", nullable = false, length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "RIGHTBIT")
    public String getRightbit() {
        return this.rightbit;
    }

    public void setRightbit(String rightbit) {
        this.rightbit = rightbit;
    }

    @Column(name = "CARDSEQNO", nullable = false)
    public Integer getCardseqno() {
        return this.cardseqno;
    }

    public void setCardseqno(Integer cardseqno) {
        this.cardseqno = cardseqno;
    }

    @Column(name = "WEEKID", nullable = false)
    public Integer getWeekid() {
        return this.weekid;
    }

    public void setWeekid(Integer weekid) {
        this.weekid = weekid;
    }

    @Column(name = "WEEKSEQNO", nullable = false)
    public Integer getWeekseqno() {
        return this.weekseqno;
    }

    public void setWeekseqno(Integer weekseqno) {
        this.weekseqno = weekseqno;
    }

    @Column(name = "HOLIDAYID", nullable = false)
    public Integer getHolidayid() {
        return this.holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    @Column(name = "HOLIDAYSEQNO", nullable = false)
    public Integer getHolidayseqno() {
        return this.holidayseqno;
    }

    public void setHolidayseqno(Integer holidayseqno) {
        this.holidayseqno = holidayseqno;
    }

    @Column(name = "CREATETIME", nullable = false, length = 30)
    public String getCreatetime() {
        return this.createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Column(name = "SUCCTIME", length = 30)
    public String getSucctime() {
        return this.succtime;
    }

    public void setSucctime(String succtime) {
        this.succtime = succtime;
    }

    @Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "ADDDELFLAG", nullable = false, precision = 1, scale = 0)
    public Integer getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(Integer adddelflag) {
        this.adddelflag = adddelflag;
    }

    @Column(name = "DOORCOUNT")
    public Integer getDoorcount() {
        return this.doorcount;
    }

    public void setDoorcount(Integer doorcount) {
        this.doorcount = doorcount;
    }

}