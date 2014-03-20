package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TOpersite entity.
 */
@Entity
@Table(name = "T_OPERSITE")
public class TOpersite implements java.io.Serializable {

    // Fields    

    private TOpersiteId id;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TOpersite() {
    }

    /**
     * minimal constructor
     */
    public TOpersite(TOpersiteId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TOpersite(TOpersiteId id, String lastsaved) {
        this.id = id;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8)),
            @AttributeOverride(name = "siteno", column = @Column(name = "SITENO", nullable = false))})
    public TOpersiteId getId() {
        return this.id;
    }

    public void setId(TOpersiteId id) {
        this.id = id;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}