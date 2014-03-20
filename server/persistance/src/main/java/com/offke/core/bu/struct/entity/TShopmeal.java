package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TShopmeal entity.
 */
@Entity
@Table(name = "T_SHOPMEAL")
public class TShopmeal implements java.io.Serializable {

    // Fields    

    private Integer shopid;
    private String accno;
    private String endtime1;
    private String endtime2;
    private String endtime3;
    private String endtime4;
    private String opercode;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TShopmeal() {
    }

    /**
     * minimal constructor
     */
    public TShopmeal(Integer shopid) {
        this.shopid = shopid;
    }

    /**
     * full constructor
     */
    public TShopmeal(
            Integer shopid,
            String accno,
            String endtime1,
            String endtime2,
            String endtime3,
            String endtime4,
            String opercode,
            String lastsaved) {
        this.shopid = shopid;
        this.accno = accno;
        this.endtime1 = endtime1;
        this.endtime2 = endtime2;
        this.endtime3 = endtime3;
        this.endtime4 = endtime4;
        this.opercode = opercode;
        this.lastsaved = lastsaved;
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

    @Column(name = "ACCNO", length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "ENDTIME1", length = 6)
    public String getEndtime1() {
        return this.endtime1;
    }

    public void setEndtime1(String endtime1) {
        this.endtime1 = endtime1;
    }

    @Column(name = "ENDTIME2", length = 6)
    public String getEndtime2() {
        return this.endtime2;
    }

    public void setEndtime2(String endtime2) {
        this.endtime2 = endtime2;
    }

    @Column(name = "ENDTIME3", length = 6)
    public String getEndtime3() {
        return this.endtime3;
    }

    public void setEndtime3(String endtime3) {
        this.endtime3 = endtime3;
    }

    @Column(name = "ENDTIME4", length = 6)
    public String getEndtime4() {
        return this.endtime4;
    }

    public void setEndtime4(String endtime4) {
        this.endtime4 = endtime4;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}