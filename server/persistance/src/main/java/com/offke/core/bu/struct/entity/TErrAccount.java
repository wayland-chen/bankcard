package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TErrAccount entity.
 */
@Entity
@Table(name = "T_ERR_ACCOUNT")
public class TErrAccount implements java.io.Serializable {

    // Fields    

    private TErrAccountId id;

    // Constructors

    /**
     * default constructor
     */
    public TErrAccount() {
    }

    /**
     * full constructor
     */
    public TErrAccount(TErrAccountId id) {
        this.id = id;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "cardno", column = @Column(name = "CARDNO")),
            @AttributeOverride(name = "totalnum", column = @Column(name = "TOTALNUM")),
            @AttributeOverride(name = "lostcntdetail", column = @Column(name = "LOSTCNTDETAIL", length = 1000))})
    public TErrAccountId getId() {
        return this.id;
    }

    public void setId(TErrAccountId id) {
        this.id = id;
    }

}