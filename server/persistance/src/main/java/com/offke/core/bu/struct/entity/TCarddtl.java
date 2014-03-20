package com.offke.core.bu.struct.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CARDDTL")
public class TCarddtl implements java.io.Serializable {

    // Fields    

    private TCarddtlId id;
    private String acctime;
    private Integer branchno;
    private Integer cardtype;
    private String summary;
    private Integer inoutflag;
    private Integer transcnt;
    private String cardphyid;
    private String showcardno;

    // Constructors

    /**
     * default constructor
     */
    public TCarddtl() {
    }

    /**
     * minimal constructor
     */
    public TCarddtl(TCarddtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TCarddtl(
            TCarddtlId id,
            String acctime,
            Integer branchno,
            Integer cardtype,
            String summary,
            Integer inoutflag,
            Integer transcnt,
            String cardphyid,
            String showcardno) {
        this.id = id;
        this.acctime = acctime;
        this.branchno = branchno;
        this.cardtype = cardtype;
        this.summary = summary;
        this.inoutflag = inoutflag;
        this.transcnt = transcnt;
        this.cardphyid = cardphyid;
        this.showcardno = showcardno;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO", nullable = false)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8)),
            @AttributeOverride(name = "usetype", column = @Column(name = "USETYPE", nullable = false))})
    public TCarddtlId getId() {
        return this.id;
    }

    public void setId(TCarddtlId id) {
        this.id = id;
    }

    @Column(name = "ACCTIME", length = 6)
    public String getAcctime() {
        return this.acctime;
    }

    public void setAcctime(String acctime) {
        this.acctime = acctime;
    }

    @Column(name = "BRANCHNO")
    public Integer getBranchno() {
        return this.branchno;
    }

    public void setBranchno(Integer branchno) {
        this.branchno = branchno;
    }

    @Column(name = "CARDTYPE")
    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Column(name = "SUMMARY", length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "INOUTFLAG")
    public Integer getInoutflag() {
        return this.inoutflag;
    }

    public void setInoutflag(Integer inoutflag) {
        this.inoutflag = inoutflag;
    }

    @Column(name = "TRANSCNT")
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
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

}