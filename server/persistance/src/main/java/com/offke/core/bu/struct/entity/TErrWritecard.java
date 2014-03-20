package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TErrWritecard entity.
 */
@Entity
@Table(name = "T_ERR_WRITECARD")
public class TErrWritecard implements java.io.Serializable {

    // Fields    

    private TErrWritecardId id;

    // Constructors

    /**
     * default constructor
     */
    public TErrWritecard() {
    }

    /**
     * full constructor
     */
    public TErrWritecard(TErrWritecardId id) {
        this.id = id;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", length = 8)),
            @AttributeOverride(name = "acctime", column = @Column(name = "ACCTIME", length = 6)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID")),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO")),
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", length = 8)),
            @AttributeOverride(name = "transdate1", column = @Column(name = "TRANSDATE1", length = 8)),
            @AttributeOverride(name = "transtime", column = @Column(name = "TRANSTIME", length = 6)),
            @AttributeOverride(name = "transtime1", column = @Column(name = "TRANSTIME1", length = 6)),
            @AttributeOverride(name = "transcode", column = @Column(name = "TRANSCODE")),
            @AttributeOverride(name = "transcode1", column = @Column(name = "TRANSCODE1")),
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO")),
            @AttributeOverride(name = "cardcnt", column = @Column(name = "CARDCNT")),
            @AttributeOverride(name = "cardcnt1", column = @Column(name = "CARDCNT1")),
            @AttributeOverride(name = "cardbefbal", column = @Column(name = "CARDBEFBAL", precision = 38)),
            @AttributeOverride(name = "cardaftbal", column = @Column(name = "CARDAFTBAL", precision = 38)),
            @AttributeOverride(name = "cardbefbal1", column = @Column(name = "CARDBEFBAL1", precision = 38)),
            @AttributeOverride(name = "cardaftbal1", column = @Column(name = "CARDAFTBAL1", precision = 38)),
            @AttributeOverride(name = "amount", column = @Column(name = "AMOUNT", precision = 38)),
            @AttributeOverride(name = "devphyid", column = @Column(name = "DEVPHYID", length = 20)),
            @AttributeOverride(name = "devseqno", column = @Column(name = "DEVSEQNO")),
            @AttributeOverride(name = "status", column = @Column(name = "STATUS", length = 1)),
            @AttributeOverride(name = "errcode", column = @Column(name = "ERRCODE")),
            @AttributeOverride(name = "cardbal", column = @Column(name = "CARDBAL", precision = 38)),
            @AttributeOverride(name = "availbal", column = @Column(name = "AVAILBAL", precision = 38))})
    public TErrWritecardId getId() {
        return this.id;
    }

    public void setId(TErrWritecardId id) {
        this.id = id;
    }

}