package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_BANKCHKBILL")
public class TBankchkbill implements java.io.Serializable {

    // Fields    

    private TBankchkbillId id;
    private String localsn;
    private Integer transcode;
    private String summary;
    private BigDecimal bankamt;
    private BigDecimal localamt;
    private BigDecimal diffamt;
    private String chkflag;

    // Constructors

    /**
     * default constructor
     */
    public TBankchkbill() {
    }

    /**
     * minimal constructor
     */
    public TBankchkbill(TBankchkbillId id, BigDecimal bankamt) {
        this.id = id;
        this.bankamt = bankamt;
    }

    /**
     * full constructor
     */
    public TBankchkbill(
            TBankchkbillId id,
            String localsn,
            Integer transcode,
            String summary,
            BigDecimal bankamt,
            BigDecimal localamt,
            BigDecimal diffamt,
            String chkflag) {
        this.id = id;
        this.localsn = localsn;
        this.transcode = transcode;
        this.summary = summary;
        this.bankamt = bankamt;
        this.localamt = localamt;
        this.diffamt = diffamt;
        this.chkflag = chkflag;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "bankcardno", column = @Column(name = "BANKCARDNO", nullable = false, length = 30)),
            @AttributeOverride(name = "banksn", column = @Column(name = "BANKSN", nullable = false, length = 30)),
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO", nullable = false))})
    public TBankchkbillId getId() {
        return this.id;
    }

    public void setId(TBankchkbillId id) {
        this.id = id;
    }

    @Column(name = "LOCALSN", length = 30)
    public String getLocalsn() {
        return this.localsn;
    }

    public void setLocalsn(String localsn) {
        this.localsn = localsn;
    }

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "SUMMARY", length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "BANKAMT", nullable = false)
    public BigDecimal getBankamt() {
        return this.bankamt;
    }

    public void setBankamt(BigDecimal bankamt) {
        this.bankamt = bankamt;
    }

    @Column(name = "LOCALAMT")
    public BigDecimal getLocalamt() {
        return this.localamt;
    }

    public void setLocalamt(BigDecimal localamt) {
        this.localamt = localamt;
    }

    @Column(name = "DIFFAMT")
    public BigDecimal getDiffamt() {
        return this.diffamt;
    }

    public void setDiffamt(BigDecimal diffamt) {
        this.diffamt = diffamt;
    }

    @Column(name = "CHKFLAG", length = 1)
    public String getChkflag() {
        return this.chkflag;
    }

    public void setChkflag(String chkflag) {
        this.chkflag = chkflag;
    }

}