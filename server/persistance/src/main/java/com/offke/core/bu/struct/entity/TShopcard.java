package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TShopcard entity.
 */
@Entity
@Table(name = "T_SHOPCARD")
public class TShopcard implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private Integer shopid;
    private String showcardno;
    private String cardphyid;
    private String cardpwd;
    private String expiredate;
    private String status;
    private String lossflag;
    private String lossdate;
    private String opendate;
    private String closedate;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TShopcard() {
    }

    /**
     * minimal constructor
     */
    public TShopcard(Integer cardno, String status, String lossflag) {
        this.cardno = cardno;
        this.status = status;
        this.lossflag = lossflag;
    }

    /**
     * full constructor
     */
    public TShopcard(
            Integer cardno,
            Integer shopid,
            String showcardno,
            String cardphyid,
            String cardpwd,
            String expiredate,
            String status,
            String lossflag,
            String lossdate,
            String opendate,
            String closedate,
            String lastsaved) {
        this.cardno = cardno;
        this.shopid = shopid;
        this.showcardno = showcardno;
        this.cardphyid = cardphyid;
        this.cardpwd = cardpwd;
        this.expiredate = expiredate;
        this.status = status;
        this.lossflag = lossflag;
        this.lossdate = lossdate;
        this.opendate = opendate;
        this.closedate = closedate;
        this.lastsaved = lastsaved;
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

    @Column(name = "SHOPID")
    public Integer getShopid() {
        return this.shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
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

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}