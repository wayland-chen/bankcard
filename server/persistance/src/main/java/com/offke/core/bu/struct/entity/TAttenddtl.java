package com.offke.core.bu.struct.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_ATTENDDTL")
public class TAttenddtl implements java.io.Serializable {

    // Fields    

    private TAttenddtlId id;
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
    private Boolean status;

    // Constructors

    /**
     * default constructor
     */
    public TAttenddtl() {
    }

    /**
     * minimal constructor
     */
    public TAttenddtl(TAttenddtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TAttenddtl(
            TAttenddtlId id,
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
            Boolean status) {
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
        this.status = status;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "devphyid", column = @Column(name = "DEVPHYID", nullable = false, length = 20)),
            @AttributeOverride(name = "devseqno", column = @Column(name = "DEVSEQNO", nullable = false))})
    public TAttenddtlId getId() {
        return this.id;
    }

    public void setId(TAttenddtlId id) {
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

    @Column(name = "STATUS", precision = 1, scale = 0)
    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}