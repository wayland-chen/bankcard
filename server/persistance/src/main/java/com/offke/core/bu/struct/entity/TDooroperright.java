package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDooroperright entity.
 */
@Entity
@Table(name = "T_DOOROPERRIGHT")
public class TDooroperright implements java.io.Serializable {

    // Fields    

    private TDooroperrightId id;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDooroperright() {
    }

    /**
     * minimal constructor
     */
    public TDooroperright(TDooroperrightId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDooroperright(TDooroperrightId id, String updatetime) {
        this.id = id;
        this.updatetime = updatetime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false)),
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8))})
    public TDooroperrightId getId() {
        return this.id;
    }

    public void setId(TDooroperrightId id) {
        this.id = id;
    }

    @Column(name = "UPDATETIME", length = 30)
    public String getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

}