package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoordtl entity.
 */
@Entity
@Table(name = "T_DOORDTL")
public class TDoordtl implements java.io.Serializable {

    // Fields    

    private TDoordtlId id;
    private String transtime;
    private Integer deviceid;
    private String coldate;
    private String coltime;
    private Integer cardno;
    private String cardphyid;
    private String showcardno;
    private String stuempno;
    private Integer custid;
    private String custname;
    private Integer transmark;
    private Integer sysid;

    // Constructors

    /**
     * default constructor
     */
    public TDoordtl() {
    }

    /**
     * minimal constructor
     */
    public TDoordtl(TDoordtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDoordtl(
            TDoordtlId id,
            String transtime,
            Integer deviceid,
            String coldate,
            String coltime,
            Integer cardno,
            String cardphyid,
            String showcardno,
            String stuempno,
            Integer custid,
            String custname,
            Integer transmark,
            Integer sysid) {
        this.id = id;
        this.transtime = transtime;
        this.deviceid = deviceid;
        this.coldate = coldate;
        this.coltime = coltime;
        this.cardno = cardno;
        this.cardphyid = cardphyid;
        this.showcardno = showcardno;
        this.stuempno = stuempno;
        this.custid = custid;
        this.custname = custname;
        this.transmark = transmark;
        this.sysid = sysid;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "devphyid", column = @Column(name = "DEVPHYID", nullable = false, length = 20)),
            @AttributeOverride(name = "devseqno", column = @Column(name = "DEVSEQNO", nullable = false))})
    public TDoordtlId getId() {
        return this.id;
    }

    public void setId(TDoordtlId id) {
        this.id = id;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "DEVICEID")
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "COLDATE", length = 8)
    public String getColdate() {
        return this.coldate;
    }

    public void setColdate(String coldate) {
        this.coldate = coldate;
    }

    @Column(name = "COLTIME", length = 6)
    public String getColtime() {
        return this.coltime;
    }

    public void setColtime(String coltime) {
        this.coltime = coltime;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "CARDPHYID", length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "SHOWCARDNO", length = 10)
    public String getShowcardno() {
        return this.showcardno;
    }

    public void setShowcardno(String showcardno) {
        this.showcardno = showcardno;
    }

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
    }

    @Column(name = "CUSTID")
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "CUSTNAME", length = 60)
    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Column(name = "TRANSMARK")
    public Integer getTransmark() {
        return this.transmark;
    }

    public void setTransmark(Integer transmark) {
        this.transmark = transmark;
    }

    @Column(name = "SYSID")
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

}