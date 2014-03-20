package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoorgrpoperright entity.
 */
@Entity
@Table(name = "T_DOORGRPOPERRIGHT")
public class TDoorgrpoperright implements java.io.Serializable {

    // Fields    

    private TDoorgrpoperrightId id;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoorgrpoperright() {
    }

    /**
     * minimal constructor
     */
    public TDoorgrpoperright(TDoorgrpoperrightId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDoorgrpoperright(TDoorgrpoperrightId id, String updatetime) {
        this.id = id;
        this.updatetime = updatetime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "groupid", column = @Column(name = "GROUPID", nullable = false)),
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8))})
    public TDoorgrpoperrightId getId() {
        return this.id;
    }

    public void setId(TDoorgrpoperrightId id) {
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