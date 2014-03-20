package com.offke.core.bu.struct.entity;

import javax.persistence.*;


/**
 * TRptopercard entity.
 */
@Entity
@Table(name = "T_RPTOPERCARD")
public class TRptopercard implements java.io.Serializable {

    // Fields    

    private TRptopercardId id;
    private Integer branchno;
    private Integer usetype;
    private Integer transcnt;
    private Integer incnt;
    private Integer outcnt;
    private Integer remaincnt;

    // Constructors

    /**
     * default constructor
     */
    public TRptopercard() {
    }

    /**
     * minimal constructor
     */
    public TRptopercard(TRptopercardId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptopercard(
            TRptopercardId id,
            Integer branchno,
            Integer usetype,
            Integer transcnt,
            Integer incnt,
            Integer outcnt,
            Integer remaincnt) {
        this.id = id;
        this.branchno = branchno;
        this.usetype = usetype;
        this.transcnt = transcnt;
        this.incnt = incnt;
        this.outcnt = outcnt;
        this.remaincnt = remaincnt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8)),
            @AttributeOverride(name = "cardtype", column = @Column(name = "CARDTYPE", nullable = false)),
            @AttributeOverride(name = "summary", column = @Column(name = "SUMMARY", nullable = false, length = 60))})
    public TRptopercardId getId() {
        return this.id;
    }

    public void setId(TRptopercardId id) {
        this.id = id;
    }

    @Column(name = "BRANCHNO")
    public Integer getBranchno() {
        return this.branchno;
    }

    public void setBranchno(Integer branchno) {
        this.branchno = branchno;
    }

    @Column(name = "USETYPE")
    public Integer getUsetype() {
        return this.usetype;
    }

    public void setUsetype(Integer usetype) {
        this.usetype = usetype;
    }

    @Column(name = "TRANSCNT")
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "INCNT")
    public Integer getIncnt() {
        return this.incnt;
    }

    public void setIncnt(Integer incnt) {
        this.incnt = incnt;
    }

    @Column(name = "OUTCNT")
    public Integer getOutcnt() {
        return this.outcnt;
    }

    public void setOutcnt(Integer outcnt) {
        this.outcnt = outcnt;
    }

    @Column(name = "REMAINCNT")
    public Integer getRemaincnt() {
        return this.remaincnt;
    }

    public void setRemaincnt(Integer remaincnt) {
        this.remaincnt = remaincnt;
    }

}