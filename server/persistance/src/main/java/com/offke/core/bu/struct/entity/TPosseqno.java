package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TPosseqno entity.
 */
@Entity
@Table(name = "T_POSSEQNO")
public class TPosseqno implements java.io.Serializable {

    // Fields    

    private TPosseqnoId id;

    // Constructors

    /**
     * default constructor
     */
    public TPosseqno() {
    }

    /**
     * full constructor
     */
    public TPosseqno(TPosseqnoId id) {
        this.id = id;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false)),
            @AttributeOverride(name = "devseqno", column = @Column(name = "DEVSEQNO", nullable = false)),
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8))})
    public TPosseqnoId getId() {
        return this.id;
    }

    public void setId(TPosseqnoId id) {
        this.id = id;
    }

}