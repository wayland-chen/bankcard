package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoordevweek entity.
 */
@Entity
@Table(name = "T_DOORDEVWEEK")
public class TDoordevweek implements java.io.Serializable {

    // Fields    

    private TDoordevweekId id;
    private Long seqno;
    private Integer adddelflag;
    private Integer downstatus;
    private String downtime;
    private Integer refcnt;
    private String updatetime;
    private Integer linkcnt;

    // Constructors

    /**
     * default constructor
     */
    public TDoordevweek() {
    }

    /**
     * minimal constructor
     */
    public TDoordevweek(TDoordevweekId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDoordevweek(
            TDoordevweekId id,
            Long seqno,
            Integer adddelflag,
            Integer downstatus,
            String downtime,
            Integer refcnt,
            String updatetime,
            Integer linkcnt) {
        this.id = id;
        this.seqno = seqno;
        this.adddelflag = adddelflag;
        this.downstatus = downstatus;
        this.downtime = downtime;
        this.refcnt = refcnt;
        this.updatetime = updatetime;
        this.linkcnt = linkcnt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "majordevid", column = @Column(name = "MAJORDEVID", nullable = false)),
            @AttributeOverride(name = "minordevid", column = @Column(name = "MINORDEVID", nullable = false)),
            @AttributeOverride(name = "weekid", column = @Column(name = "WEEKID", nullable = false))})
    public TDoordevweekId getId() {
        return this.id;
    }

    public void setId(TDoordevweekId id) {
        this.id = id;
    }

    @Column(name = "SEQNO")
    public Long getSeqno() {
        return this.seqno;
    }

    public void setSeqno(Long seqno) {
        this.seqno = seqno;
    }

    @Column(name = "ADDDELFLAG", precision = 1, scale = 0)
    public Integer getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(Integer adddelflag) {
        this.adddelflag = adddelflag;
    }

    @Column(name = "DOWNSTATUS")
    public Integer getDownstatus() {
        return this.downstatus;
    }

    public void setDownstatus(Integer downstatus) {
        this.downstatus = downstatus;
    }

    @Column(name = "DOWNTIME", length = 30)
    public String getDowntime() {
        return this.downtime;
    }

    public void setDowntime(String downtime) {
        this.downtime = downtime;
    }

    @Column(name = "REFCNT")
    public Integer getRefcnt() {
        return this.refcnt;
    }

    public void setRefcnt(Integer refcnt) {
        this.refcnt = refcnt;
    }

    @Column(name = "UPDATETIME", length = 30)
    public String getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    @Column(name = "LINKCNT")
    public Integer getLinkcnt() {
        return this.linkcnt;
    }

    public void setLinkcnt(Integer linkcnt) {
        this.linkcnt = linkcnt;
    }

}