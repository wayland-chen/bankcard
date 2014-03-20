package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_ACTPARA")
public class TActpara implements java.io.Serializable {

    // Fields    

    private Integer paraid;
    private Byte booksetno;

    // Constructors

    /**
     * default constructor
     */
    public TActpara() {
    }

    /**
     * full constructor
     */
    public TActpara(Integer paraid, Byte booksetno) {
        this.paraid = paraid;
        this.booksetno = booksetno;
    }

    // Property accessors
    @Id
    @Column(name = "PARAID", unique = true, nullable = false, precision = 9, scale = 0)
    public Integer getParaid() {
        return this.paraid;
    }

    public void setParaid(Integer paraid) {
        this.paraid = paraid;
    }

    @Column(name = "BOOKSETNO", nullable = false, precision = 2, scale = 0)
    public Byte getBooksetno() {
        return this.booksetno;
    }

    public void setBooksetno(Byte booksetno) {
        this.booksetno = booksetno;
    }

}