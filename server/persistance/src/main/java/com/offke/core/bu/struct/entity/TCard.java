package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCard entity.
 */
@Entity
@Table(name = "T_CARD")
public class TCard implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private String accno;
    private Integer cardtype;
    private Integer feetype;
    private Integer custid;
    private String showcardno;
    private String cardphyid;
    private String cardpwd;
    private String expiredate;
    private String status;
    private String lossflag;
    private String lossdate;
    private String lossefttime;
    private String frozeflag;
    private String frozedate;
    private String badflag;
    private String badtype;
    private String baddate;
    private String lockflag;
    private String lockdate;
    private String opendate;
    private String closedate;
    private String cardverno;
    private String lastsaved;
    private Integer cardphytype;

    // Constructors

    /**
     * default constructor
     */
    public TCard() {
    }

    /**
     * minimal constructor
     */
    public TCard(Integer cardno, String status, String lossflag, String frozeflag, String badflag) {
        this.cardno = cardno;
        this.status = status;
        this.lossflag = lossflag;
        this.frozeflag = frozeflag;
        this.badflag = badflag;
    }

    /**
     * full constructor
     */
    public TCard(
            Integer cardno,
            String accno,
            Integer cardtype,
            Integer feetype,
            Integer custid,
            String showcardno,
            String cardphyid,
            String cardpwd,
            String expiredate,
            String status,
            String lossflag,
            String lossdate,
            String lossefttime,
            String frozeflag,
            String frozedate,
            String badflag,
            String badtype,
            String baddate,
            String lockflag,
            String lockdate,
            String opendate,
            String closedate,
            String cardverno,
            String lastsaved,
            Integer cardphytype) {
        this.cardno = cardno;
        this.accno = accno;
        this.cardtype = cardtype;
        this.feetype = feetype;
        this.custid = custid;
        this.showcardno = showcardno;
        this.cardphyid = cardphyid;
        this.cardpwd = cardpwd;
        this.expiredate = expiredate;
        this.status = status;
        this.lossflag = lossflag;
        this.lossdate = lossdate;
        this.lossefttime = lossefttime;
        this.frozeflag = frozeflag;
        this.frozedate = frozedate;
        this.badflag = badflag;
        this.badtype = badtype;
        this.baddate = baddate;
        this.lockflag = lockflag;
        this.lockdate = lockdate;
        this.opendate = opendate;
        this.closedate = closedate;
        this.cardverno = cardverno;
        this.lastsaved = lastsaved;
        this.cardphytype = cardphytype;
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

    @Column(name = "ACCNO", length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "CARDTYPE")
    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Column(name = "FEETYPE")
    public Integer getFeetype() {
        return this.feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    @Column(name = "CUSTID")
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "SHOWCARDNO", length = 10)
    public String getShowcardno() {
        return this.showcardno;
    }

    public void setShowcardno(String showcardno) {
        this.showcardno = showcardno;
    }

    @Column(name = "CARDPHYID", length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "CARDPWD", length = 32)
    public String getCardpwd() {
        return this.cardpwd;
    }

    public void setCardpwd(String cardpwd) {
        this.cardpwd = cardpwd;
    }

    @Column(name = "EXPIREDATE", length = 8)
    public String getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "LOSSFLAG", nullable = false, length = 1)
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

    @Column(name = "LOSSEFTTIME", length = 30)
    public String getLossefttime() {
        return this.lossefttime;
    }

    public void setLossefttime(String lossefttime) {
        this.lossefttime = lossefttime;
    }

    @Column(name = "FROZEFLAG", nullable = false, length = 1)
    public String getFrozeflag() {
        return this.frozeflag;
    }

    public void setFrozeflag(String frozeflag) {
        this.frozeflag = frozeflag;
    }

    @Column(name = "FROZEDATE", length = 8)
    public String getFrozedate() {
        return this.frozedate;
    }

    public void setFrozedate(String frozedate) {
        this.frozedate = frozedate;
    }

    @Column(name = "BADFLAG", nullable = false, length = 1)
    public String getBadflag() {
        return this.badflag;
    }

    public void setBadflag(String badflag) {
        this.badflag = badflag;
    }

    @Column(name = "BADTYPE", length = 1)
    public String getBadtype() {
        return this.badtype;
    }

    public void setBadtype(String badtype) {
        this.badtype = badtype;
    }

    @Column(name = "BADDATE", length = 8)
    public String getBaddate() {
        return this.baddate;
    }

    public void setBaddate(String baddate) {
        this.baddate = baddate;
    }

    @Column(name = "LOCKFLAG", length = 1)
    public String getLockflag() {
        return this.lockflag;
    }

    public void setLockflag(String lockflag) {
        this.lockflag = lockflag;
    }

    @Column(name = "LOCKDATE", length = 8)
    public String getLockdate() {
        return this.lockdate;
    }

    public void setLockdate(String lockdate) {
        this.lockdate = lockdate;
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

    @Column(name = "CARDVERNO", length = 12)
    public String getCardverno() {
        return this.cardverno;
    }

    public void setCardverno(String cardverno) {
        this.cardverno = cardverno;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

    @Column(name = "CARDPHYTYPE")
    public Integer getCardphytype() {
        return this.cardphytype;
    }

    public void setCardphytype(Integer cardphytype) {
        this.cardphytype = cardphytype;
    }

}