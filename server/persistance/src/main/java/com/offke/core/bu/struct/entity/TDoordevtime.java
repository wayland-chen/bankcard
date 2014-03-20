package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoordevtime entity.
 */
@Entity
@Table(name = "T_DOORDEVTIME")
public class TDoordevtime implements java.io.Serializable {

    // Fields    

    private TDoordevtimeId id;
    private Long seqno;
    private Boolean adddelflag;
    private Integer downstatus;
    private String downtime;
    private Integer refcnt;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoordevtime() {
    }

    /**
     * minimal constructor
     */
    public TDoordevtime(TDoordevtimeId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDoordevtime(
            TDoordevtimeId id,
            Long seqno,
            Boolean adddelflag,
            Integer downstatus,
            String downtime,
            Integer refcnt,
            String updatetime) {
        this.id = id;
        this.seqno = seqno;
        this.adddelflag = adddelflag;
        this.downstatus = downstatus;
        this.downtime = downtime;
        this.refcnt = refcnt;
        this.updatetime = updatetime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "majordevid", column = @Column(name = "MAJORDEVID", nullable = false)),
            @AttributeOverride(name = "minordevid", column = @Column(name = "MINORDEVID", nullable = false)),
            @AttributeOverride(name = "timeid", column = @Column(name = "TIMEID", nullable = false))})
    public TDoordevtimeId getId() {
        return this.id;
    }

    public void setId(TDoordevtimeId id) {
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
    public Boolean getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(Boolean adddelflag) {
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

}