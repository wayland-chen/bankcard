package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoorgrpmember entity.
 */
@Entity
@Table(name = "T_DOORGRPMEMBER")
public class TDoorgrpmember implements java.io.Serializable {

    // Fields    

    private TDoorgrpmemberId id;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoorgrpmember() {
    }

    /**
     * minimal constructor
     */
    public TDoorgrpmember(TDoorgrpmemberId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDoorgrpmember(TDoorgrpmemberId id, String updatetime) {
        this.id = id;
        this.updatetime = updatetime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "groupid", column = @Column(name = "GROUPID", nullable = false)),
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false))})
    public TDoorgrpmemberId getId() {
        return this.id;
    }

    public void setId(TDoorgrpmemberId id) {
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