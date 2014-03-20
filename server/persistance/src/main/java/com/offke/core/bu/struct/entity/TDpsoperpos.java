package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDpsoperpos entity.
 */
@Entity
@Table(name = "T_DPSOPERPOS")
public class TDpsoperpos implements java.io.Serializable {

    // Fields    

    private TDpsoperposId id;
    private String openoper;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TDpsoperpos() {
    }

    /**
     * minimal constructor
     */
    public TDpsoperpos(TDpsoperposId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDpsoperpos(TDpsoperposId id, String openoper, String lastsaved) {
        this.id = id;
        this.openoper = openoper;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8)),
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false))})
    public TDpsoperposId getId() {
        return this.id;
    }

    public void setId(TDpsoperposId id) {
        this.id = id;
    }

    @Column(name = "OPENOPER", length = 8)
    public String getOpenoper() {
        return this.openoper;
    }

    public void setOpenoper(String openoper) {
        this.openoper = openoper;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}