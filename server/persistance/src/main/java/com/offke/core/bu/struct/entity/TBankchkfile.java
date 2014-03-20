package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "T_BANKCHKFILE")
public class TBankchkfile implements java.io.Serializable {

    // Fields    

    private TBankchkfileId id;
    private String bankchkfile;
    private String localchkfile;
    private String localcvtfile;
    private String filesource;
    private String status;
    private String resolved;
    private String remark;
    private Integer bankcnt;
    private BigDecimal bankamt;
    private Integer localcnt;
    private BigDecimal localamt;
    private String crttime;
    private String updtime;

    // Constructors

    /**
     * default constructor
     */
    public TBankchkfile() {
    }

    /**
     * minimal constructor
     */
    public TBankchkfile(TBankchkfileId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TBankchkfile(
            TBankchkfileId id,
            String bankchkfile,
            String localchkfile,
            String localcvtfile,
            String filesource,
            String status,
            String resolved,
            String remark,
            Integer bankcnt,
            BigDecimal bankamt,
            Integer localcnt,
            BigDecimal localamt,
            String crttime,
            String updtime) {
        this.id = id;
        this.bankchkfile = bankchkfile;
        this.localchkfile = localchkfile;
        this.localcvtfile = localcvtfile;
        this.filesource = filesource;
        this.status = status;
        this.resolved = resolved;
        this.remark = remark;
        this.bankcnt = bankcnt;
        this.bankamt = bankamt;
        this.localcnt = localcnt;
        this.localamt = localamt;
        this.crttime = crttime;
        this.updtime = updtime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "bankid", column = @Column(name = "BANKID", nullable = false)),
            @AttributeOverride(name = "bankdate", column = @Column(name = "BANKDATE", nullable = false, precision = 8, scale = 0))})
    public TBankchkfileId getId() {
        return this.id;
    }

    public void setId(TBankchkfileId id) {
        this.id = id;
    }

    @Column(name = "BANKCHKFILE", length = 240)
    public String getBankchkfile() {
        return this.bankchkfile;
    }

    public void setBankchkfile(String bankchkfile) {
        this.bankchkfile = bankchkfile;
    }

    @Column(name = "LOCALCHKFILE", length = 240)
    public String getLocalchkfile() {
        return this.localchkfile;
    }

    public void setLocalchkfile(String localchkfile) {
        this.localchkfile = localchkfile;
    }

    @Column(name = "LOCALCVTFILE", length = 240)
    public String getLocalcvtfile() {
        return this.localcvtfile;
    }

    public void setLocalcvtfile(String localcvtfile) {
        this.localcvtfile = localcvtfile;
    }

    @Column(name = "FILESOURCE", length = 1)
    public String getFilesource() {
        return this.filesource;
    }

    public void setFilesource(String filesource) {
        this.filesource = filesource;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "RESOLVED", length = 1)
    public String getResolved() {
        return this.resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "BANKCNT")
    public Integer getBankcnt() {
        return this.bankcnt;
    }

    public void setBankcnt(Integer bankcnt) {
        this.bankcnt = bankcnt;
    }

    @Column(name = "BANKAMT", precision = 15)
    public BigDecimal getBankamt() {
        return this.bankamt;
    }

    public void setBankamt(BigDecimal bankamt) {
        this.bankamt = bankamt;
    }

    @Column(name = "LOCALCNT")
    public Integer getLocalcnt() {
        return this.localcnt;
    }

    public void setLocalcnt(Integer localcnt) {
        this.localcnt = localcnt;
    }

    @Column(name = "LOCALAMT", precision = 15)
    public BigDecimal getLocalamt() {
        return this.localamt;
    }

    public void setLocalamt(BigDecimal localamt) {
        this.localamt = localamt;
    }

    @Column(name = "CRTTIME", length = 14)
    public String getCrttime() {
        return this.crttime;
    }

    public void setCrttime(String crttime) {
        this.crttime = crttime;
    }

    @Column(name = "UPDTIME", length = 14)
    public String getUpdtime() {
        return this.updtime;
    }

    public void setUpdtime(String updtime) {
        this.updtime = updtime;
    }

}