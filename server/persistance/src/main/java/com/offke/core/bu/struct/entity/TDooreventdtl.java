package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDooreventdtl entity.
 */
@Entity
@Table(name = "T_DOOREVENTDTL")
public class TDooreventdtl implements java.io.Serializable {

    // Fields    

    private TDooreventdtlId id;
    private String eventmsg;
    private Integer sysid;
    private String coldate;
    private String coltime;

    // Constructors

    /**
     * default constructor
     */
    public TDooreventdtl() {
    }

    /**
     * minimal constructor
     */
    public TDooreventdtl(TDooreventdtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDooreventdtl(TDooreventdtlId id, String eventmsg, Integer sysid, String coldate, String coltime) {
        this.id = id;
        this.eventmsg = eventmsg;
        this.sysid = sysid;
        this.coldate = coldate;
        this.coltime = coltime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false)),
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "transtime", column = @Column(name = "TRANSTIME", nullable = false, length = 6)),
            @AttributeOverride(name = "eventcode", column = @Column(name = "EVENTCODE", nullable = false))})
    public TDooreventdtlId getId() {
        return this.id;
    }

    public void setId(TDooreventdtlId id) {
        this.id = id;
    }

    @Column(name = "EVENTMSG", length = 240)
    public String getEventmsg() {
        return this.eventmsg;
    }

    public void setEventmsg(String eventmsg) {
        this.eventmsg = eventmsg;
    }

    @Column(name = "SYSID")
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "COLDATE", length = 8)
    public String getColdate() {
        return this.coldate;
    }

    public void setColdate(String coldate) {
        this.coldate = coldate;
    }

    @Column(name = "COLTIME", length = 6)
    public String getColtime() {
        return this.coltime;
    }

    public void setColtime(String coltime) {
        this.coltime = coltime;
    }

}