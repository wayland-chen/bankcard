package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TErrAccountTmp entity.
 */
@Entity
@Table(name = "T_ERR_ACCOUNT_TMP")
public class TErrAccountTmp implements java.io.Serializable {

    // Fields    

    private Integer cardno;

    // Constructors

    /**
     * default constructor
     */
    public TErrAccountTmp() {
    }

    /**
     * full constructor
     */
    public TErrAccountTmp(Integer cardno) {
        this.cardno = cardno;
    }

    // Property accessors
    @Id
    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

}