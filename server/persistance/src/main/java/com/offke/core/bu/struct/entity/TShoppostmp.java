package com.offke.core.bu.struct.entity;

import javax.persistence.*;


/**
 * TShoppostmp entity.
 */
@Entity
@Table(name = "T_SHOPPOSTMP")
public class TShoppostmp implements java.io.Serializable {

    // Fields    

    private TShoppostmpId id;
    private String transdate;
    private String transtime;
    private String opercode;
    private Integer deviceid;
    private String devphyid;
    private Integer shopid;
    private String endtime;
    private String startdate;
    private String enddate;
    private String errmsg;

    // Constructors

    /**
     * default constructor
     */
    public TShoppostmp() {
    }

    /**
     * minimal constructor
     */
    public TShoppostmp(TShoppostmpId id, Integer shopid) {
        this.id = id;
        this.shopid = shopid;
    }

    /**
     * full constructor
     */
    public TShoppostmp(
            TShoppostmpId id,
            String transdate,
            String transtime,
            String opercode,
            Integer deviceid,
            String devphyid,
            Integer shopid,
            String endtime,
            String startdate,
            String enddate,
            String errmsg) {
        this.id = id;
        this.transdate = transdate;
        this.transtime = transtime;
        this.opercode = opercode;
        this.deviceid = deviceid;
        this.devphyid = devphyid;
        this.shopid = shopid;
        this.endtime = endtime;
        this.startdate = startdate;
        this.enddate = enddate;
        this.errmsg = errmsg;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "batchno", column = @Column(name = "BATCHNO", nullable = false, length = 30)),
            @AttributeOverride(name = "seqno", column = @Column(name = "SEQNO", nullable = false))})
    public TShoppostmpId getId() {
        return this.id;
    }

    public void setId(TShoppostmpId id) {
        this.id = id;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "DEVICEID")
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "DEVPHYID", length = 20)
    public String getDevphyid() {
        return this.devphyid;
    }

    public void setDevphyid(String devphyid) {
        this.devphyid = devphyid;
    }

    @Column(name = "SHOPID")
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Column(name = "ENDTIME", length = 6)
    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Column(name = "STARTDATE", length = 8)
    public String getStartdate() {
        return this.startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    @Column(name = "ENDDATE", length = 8)
    public String getEnddate() {
        return this.enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    @Column(name = "ERRMSG", length = 240)
    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}