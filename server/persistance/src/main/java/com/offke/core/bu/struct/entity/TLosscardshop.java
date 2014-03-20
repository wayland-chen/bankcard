package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TLosscardshop entity.
 */
@Entity
@Table(name = "T_LOSSCARDSHOP")
public class TLosscardshop implements java.io.Serializable {

    // Fields    

    private String shopcode;
    private String shopname;
    private String addr;
    private String tel;
    private String getcardplace;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TLosscardshop() {
    }

    /**
     * minimal constructor
     */
    public TLosscardshop(String shopcode) {
        this.shopcode = shopcode;
    }

    /**
     * full constructor
     */
    public TLosscardshop(
            String shopcode,
            String shopname,
            String addr,
            String tel,
            String getcardplace,
            String lastsaved) {
        this.shopcode = shopcode;
        this.shopname = shopname;
        this.addr = addr;
        this.tel = tel;
        this.getcardplace = getcardplace;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "SHOPCODE", unique = true, nullable = false, length = 60)
    public String getShopcode() {
        return this.shopcode;
    }

    public void setShopcode(String shopcode) {
        this.shopcode = shopcode;
    }

    @Column(name = "SHOPNAME", length = 60)
    public String getShopname() {
        return this.shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    @Column(name = "ADDR", length = 240)
    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Column(name = "TEL", length = 30)
    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Column(name = "GETCARDPLACE", length = 240)
    public String getGetcardplace() {
        return this.getcardplace;
    }

    public void setGetcardplace(String getcardplace) {
        this.getcardplace = getcardplace;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}