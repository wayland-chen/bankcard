package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TLosscardinfo entity.
 */
@Entity
@Table(name = "T_LOSSCARDINFO")
public class TLosscardinfo implements java.io.Serializable {

    // Fields    

    private TLosscardinfoId id;
    private String cardphyid;
    private String regtime;
    private Integer status;
    private String enddate;
    private String getcardplace;
    private String tel;
    private String addr;
    private Integer idtype;
    private String idno;
    private String getdate;
    private String gettime;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TLosscardinfo() {
    }

    /**
     * minimal constructor
     */
    public TLosscardinfo(TLosscardinfoId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TLosscardinfo(
            TLosscardinfoId id,
            String cardphyid,
            String regtime,
            Integer status,
            String enddate,
            String getcardplace,
            String tel,
            String addr,
            Integer idtype,
            String idno,
            String getdate,
            String gettime,
            String remark) {
        this.id = id;
        this.cardphyid = cardphyid;
        this.regtime = regtime;
        this.status = status;
        this.enddate = enddate;
        this.getcardplace = getcardplace;
        this.tel = tel;
        this.addr = addr;
        this.idtype = idtype;
        this.idno = idno;
        this.getdate = getdate;
        this.gettime = gettime;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO", nullable = false)),
            @AttributeOverride(name = "shopcode", column = @Column(name = "SHOPCODE", nullable = false, length = 60)),
            @AttributeOverride(name = "regdate", column = @Column(name = "REGDATE", nullable = false, length = 8))})
    public TLosscardinfoId getId() {
        return this.id;
    }

    public void setId(TLosscardinfoId id) {
        this.id = id;
    }

    @Column(name = "CARDPHYID", length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "REGTIME", length = 6)
    public String getRegtime() {
        return this.regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    @Column(name = "STATUS", precision = 1, scale = 0)
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "ENDDATE", length = 8)
    public String getEnddate() {
        return this.enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    @Column(name = "GETCARDPLACE", length = 240)
    public String getGetcardplace() {
        return this.getcardplace;
    }

    public void setGetcardplace(String getcardplace) {
        this.getcardplace = getcardplace;
    }

    @Column(name = "TEL", length = 30)
    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Column(name = "ADDR", length = 240)
    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Column(name = "IDTYPE", precision = 1, scale = 0)
    public Integer getIdtype() {
        return this.idtype;
    }

    public void setIdtype(Integer idtype) {
        this.idtype = idtype;
    }

    @Column(name = "IDNO", length = 60)
    public String getIdno() {
        return this.idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    @Column(name = "GETDATE", length = 8)
    public String getGetdate() {
        return this.getdate;
    }

    public void setGetdate(String getdate) {
        this.getdate = getdate;
    }

    @Column(name = "GETTIME", length = 6)
    public String getGettime() {
        return this.gettime;
    }

    public void setGettime(String gettime) {
        this.gettime = gettime;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}