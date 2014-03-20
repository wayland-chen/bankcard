package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoordevholiday entity.
 */
@Entity
@Table(name = "T_DOORDEVHOLIDAY")
public class TDoordevholiday implements java.io.Serializable {

    // Fields    

    private TDoordevholidayId id;
    private Long seqno;
    private Integer adddelflag;
    private Integer downstatus;
    private String downtime;
    private Integer refcnt;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoordevholiday() {
    }

    /**
     * minimal constructor
     */
    public TDoordevholiday(TDoordevholidayId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDoordevholiday(
            TDoordevholidayId id,
            Long seqno,
            Integer adddelflag,
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
            @AttributeOverride(name = "holidayid", column = @Column(name = "HOLIDAYID", nullable = false))})
    public TDoordevholidayId getId() {
        return this.id;
    }

    public void setId(TDoordevholidayId id) {
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

}