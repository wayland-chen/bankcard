package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_AUTHCARD")
public class TAuthcard implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private String opercode;
    private String cardphyid;
    private String showcardno;
    private Integer privilege;
    private String expiredate;
    private String status;
    private String lossflag;
    private String lossdate;
    private String opendate;
    private String closedate;

    // Constructors

    /**
     * default constructor
     */
    public TAuthcard() {
    }

    /**
     * minimal constructor
     */
    public TAuthcard(Integer cardno) {
        this.cardno = cardno;
    }

    /**
     * full constructor
     */
    public TAuthcard(
            Integer cardno,
            String opercode,
            String cardphyid,
            String showcardno,
            Integer privilege,
            String expiredate,
            String status,
            String lossflag,
            String lossdate,
            String opendate,
            String closedate) {
        this.cardno = cardno;
        this.opercode = opercode;
        this.cardphyid = cardphyid;
        this.showcardno = showcardno;
        this.privilege = privilege;
        this.expiredate = expiredate;
        this.status = status;
        this.lossflag = lossflag;
        this.lossdate = lossdate;
        this.opendate = opendate;
        this.closedate = closedate;
    }

    // Property accessors
    @Id
    @Column(name = "CARDNO", unique = true, nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
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

    @Column(name = "PRIVILEGE")
    public Integer getPrivilege() {
        return this.privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    @Column(name = "EXPIREDATE", length = 8)
    public String getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "LOSSFLAG", length = 1)
    public String getLossflag() {
        return this.lossflag;
    }

    public void setLossflag(String lossflag) {
        this.lossflag = lossflag;
    }

    @Column(name = "LOSSDATE", length = 8)
    public String getLossdate() {
        return this.lossdate;
    }

    public void setLossdate(String lossdate) {
        this.lossdate = lossdate;
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

}