package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TFront entity.
 */
@Entity
@Table(name = "T_FRONT")
public class TFront implements java.io.Serializable {

    // Fields    

    private TFrontId id;

    // Constructors

    /**
     * default constructor
     */
    public TFront() {
    }

    /**
     * full constructor
     */
    public TFront(TFrontId id) {
        this.id = id;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "frontid", column = @Column(name = "FRONTID", nullable = false)),
            @AttributeOverride(name = "frontname", column = @Column(name = "FRONTNAME", length = 60)),
            @AttributeOverride(name = "ip", column = @Column(name = "IP", length = 15)),
            @AttributeOverride(name = "drtpport", column = @Column(name = "DRTPPORT")),
            @AttributeOverride(name = "drtpnode", column = @Column(name = "DRTPNODE")),
            @AttributeOverride(name = "bccmainfuncno", column = @Column(name = "BCCMAINFUNCNO"))})
    public TFrontId getId() {
        return this.id;
    }

    public void setId(TFrontId id) {
        this.id = id;
    }

}