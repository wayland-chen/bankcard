package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TNewcapecCard entity.
 */
@Entity
@Table(name = "T_NEWCAPEC_CARD")
public class TNewcapecCard implements java.io.Serializable {

    // Fields    

    private String cardphyno;
    private Integer apptype;
    private Integer feetype;
    private Integer custtype;
    private Integer custid;
    private Integer idtype;
    private Integer dpscnt;
    private Integer transdate;
    private Integer daymaxamt;
    private Integer publishid;
    private Integer showcardno;
    private Integer subsidyno;
    private Integer cardstruct;
    private Integer schoolcode;

    // Constructors

    /**
     * default constructor
     */
    public TNewcapecCard() {
    }

    /**
     * minimal constructor
     */
    public TNewcapecCard(String cardphyno) {
        this.cardphyno = cardphyno;
    }

    /**
     * full constructor
     */
    public TNewcapecCard(
            String cardphyno,
            Integer apptype,
            Integer feetype,
            Integer custtype,
            Integer custid,
            Integer idtype,
            Integer dpscnt,
            Integer transdate,
            Integer daymaxamt,
            Integer publishid,
            Integer showcardno,
            Integer subsidyno,
            Integer cardstruct,
            Integer schoolcode) {
        this.cardphyno = cardphyno;
        this.apptype = apptype;
        this.feetype = feetype;
        this.custtype = custtype;
        this.custid = custid;
        this.idtype = idtype;
        this.dpscnt = dpscnt;
        this.transdate = transdate;
        this.daymaxamt = daymaxamt;
        this.publishid = publishid;
        this.showcardno = showcardno;
        this.subsidyno = subsidyno;
        this.cardstruct = cardstruct;
        this.schoolcode = schoolcode;
    }

    // Property accessors
    @Id
    @Column(name = "CARDPHYNO", unique = true, nullable = false, length = 16)
    public String getCardphyno() {
        return this.cardphyno;
    }

    public void setCardphyno(String cardphyno) {
        this.cardphyno = cardphyno;
    }

    @Column(name = "APPTYPE")
    public Integer getApptype() {
        return this.apptype;
    }

    public void setApptype(Integer apptype) {
        this.apptype = apptype;
    }

    @Column(name = "FEETYPE")
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "CUSTTYPE")
    public Integer getCusttype() {
        return this.custtype;
    }

    public void setCusttype(Integer custtype) {
        this.custtype = custtype;
    }

    @Column(name = "CUSTID")
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "IDTYPE")
    public Integer getIdtype() {
        return this.idtype;
    }

    public void setIdtype(Integer idtype) {
        this.idtype = idtype;
    }

    @Column(name = "DPSCNT")
    public Integer getDpscnt() {
        return this.dpscnt;
    }

    public void setDpscnt(Integer dpscnt) {
        this.dpscnt = dpscnt;
    }

    @Column(name = "TRANSDATE")
    public Integer getTransdate() {
        return this.transdate;
    }

    public void setTransdate(Integer transdate) {
        this.transdate = transdate;
    }

    @Column(name = "DAYMAXAMT")
    public Integer getDaymaxamt() {
        return this.daymaxamt;
    }

    public void setDaymaxamt(Integer daymaxamt) {
        this.daymaxamt = daymaxamt;
    }

    @Column(name = "PUBLISHID")
    public Integer getPublishid() {
        return this.publishid;
    }

    public void setPublishid(Integer publishid) {
        this.publishid = publishid;
    }

    @Column(name = "SHOWCARDNO")
    public Integer getShowcardno() {
        return this.showcardno;
    }

    public void setShowcardno(Integer showcardno) {
        this.showcardno = showcardno;
    }

    @Column(name = "SUBSIDYNO")
    public Integer getSubsidyno() {
        return this.subsidyno;
    }

    public void setSubsidyno(Integer subsidyno) {
        this.subsidyno = subsidyno;
    }

    @Column(name = "CARDSTRUCT")
    public Integer getCardstruct() {
        return this.cardstruct;
    }

    public void setCardstruct(Integer cardstruct) {
        this.cardstruct = cardstruct;
    }

    @Column(name = "SCHOOLCODE")
    public Integer getSchoolcode() {
        return this.schoolcode;
    }

    public void setSchoolcode(Integer schoolcode) {
        this.schoolcode = schoolcode;
    }

}