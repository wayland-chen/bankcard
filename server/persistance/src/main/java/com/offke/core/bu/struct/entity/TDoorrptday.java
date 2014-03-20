package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoorrptday entity.
 */
@Entity
@Table(name = "T_DOORRPTDAY")
public class TDoorrptday implements java.io.Serializable {

    // Fields    

    private TDoorrptdayId id;
    private Integer totalcnt;
    private Integer validcnt;
    private Integer invalidcnt;

    // Constructors

    /**
     * default constructor
     */
    public TDoorrptday() {
    }

    /**
     * minimal constructor
     */
    public TDoorrptday(TDoorrptdayId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDoorrptday(TDoorrptdayId id, Integer totalcnt, Integer validcnt, Integer invalidcnt) {
        this.id = id;
        this.totalcnt = totalcnt;
        this.validcnt = validcnt;
        this.invalidcnt = invalidcnt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false))})
    public TDoorrptdayId getId() {
        return this.id;
    }

    public void setId(TDoorrptdayId id) {
        this.id = id;
    }

    @Column(name = "TOTALCNT")
    public Integer getTotalcnt() {
        return this.totalcnt;
    }

    public void setTotalcnt(Integer totalcnt) {
        this.totalcnt = totalcnt;
    }

    @Column(name = "VALIDCNT")
    public Integer getValidcnt() {
        return this.validcnt;
    }

    public void setValidcnt(Integer validcnt) {
        this.validcnt = validcnt;
    }

    @Column(name = "INVALIDCNT")
    public Integer getInvalidcnt() {
        return this.invalidcnt;
    }

    public void setInvalidcnt(Integer invalidcnt) {
        this.invalidcnt = invalidcnt;
    }

}