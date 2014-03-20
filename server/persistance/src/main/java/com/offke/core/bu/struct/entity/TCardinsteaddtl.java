package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_CARDINSTEADDTL")
public class TCardinsteaddtl implements java.io.Serializable {

    // Fields    

    private TCardinsteaddtlId id;
    private Integer cardno;
    private Integer oldcardtype;
    private String oldcardphyid;
    private String oldshowcardno;
    private Integer oldcardcnt;
    private BigDecimal oldcardbal;
    private Long oldsubsidyno;
    private String cardphyid;
    private String showcardno;
    private String revflag;
    private String status;

    // Constructors

    /**
     * default constructor
     */
    public TCardinsteaddtl() {
    }

    /**
     * minimal constructor
     */
    public TCardinsteaddtl(TCardinsteaddtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TCardinsteaddtl(
            TCardinsteaddtlId id,
            Integer cardno,
            Integer oldcardtype,
            String oldcardphyid,
            String oldshowcardno,
            Integer oldcardcnt,
            BigDecimal oldcardbal,
            Long oldsubsidyno,
            String cardphyid,
            String showcardno,
            String revflag,
            String status) {
        this.id = id;
        this.cardno = cardno;
        this.oldcardtype = oldcardtype;
        this.oldcardphyid = oldcardphyid;
        this.oldshowcardno = oldshowcardno;
        this.oldcardcnt = oldcardcnt;
        this.oldcardbal = oldcardbal;
        this.oldsubsidyno = oldsubsidyno;
        this.cardphyid = cardphyid;
        this.showcardno = showcardno;
        this.revflag = revflag;
        this.status = status;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO", nullable = false))})
    public TCardinsteaddtlId getId() {
        return this.id;
    }

    public void setId(TCardinsteaddtlId id) {
        this.id = id;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "OLDCARDTYPE")
    public Integer getOldcardtype() {
        return this.oldcardtype;
    }

    public void setOldcardtype(Integer oldcardtype) {
        this.oldcardtype = oldcardtype;
    }

    @Column(name = "OLDCARDPHYID", length = 16)
    public String getOldcardphyid() {
        return this.oldcardphyid;
    }

    public void setOldcardphyid(String oldcardphyid) {
        this.oldcardphyid = oldcardphyid;
    }

    @Column(name = "OLDSHOWCARDNO", length = 10)
    public String getOldshowcardno() {
        return this.oldshowcardno;
    }

    public void setOldshowcardno(String oldshowcardno) {
        this.oldshowcardno = oldshowcardno;
    }

    @Column(name = "OLDCARDCNT")
    public Integer getOldcardcnt() {
        return this.oldcardcnt;
    }

    public void setOldcardcnt(Integer oldcardcnt) {
        this.oldcardcnt = oldcardcnt;
    }

    @Column(name = "OLDCARDBAL", precision = 15)
    public BigDecimal getOldcardbal() {
        return this.oldcardbal;
    }

    public void setOldcardbal(BigDecimal oldcardbal) {
        this.oldcardbal = oldcardbal;
    }

    @Column(name = "OLDSUBSIDYNO")
    public Long getOldsubsidyno() {
        return this.oldsubsidyno;
    }

    public void setOldsubsidyno(Long oldsubsidyno) {
        this.oldsubsidyno = oldsubsidyno;
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

    @Column(name = "REVFLAG", length = 1)
    public String getRevflag() {
        return this.revflag;
    }

    public void setRevflag(String revflag) {
        this.revflag = revflag;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}