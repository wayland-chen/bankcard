package com.offke.core.bu.struct.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CARDTYPERIGHT")
public class TCardtyperight implements java.io.Serializable {

    // Fields    

    private TCardtyperightId id;
    private String opercode;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TCardtyperight() {
    }

    /**
     * minimal constructor
     */
    public TCardtyperight(TCardtyperightId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TCardtyperight(TCardtyperightId id, String opercode, String lastsaved) {
        this.id = id;
        this.opercode = opercode;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "cardtype", column = @Column(name = "CARDTYPE", nullable = false)),
            @AttributeOverride(name = "feetype", column = @Column(name = "FEETYPE", nullable = false))})
    public TCardtyperightId getId() {
        return this.id;
    }

    public void setId(TCardtyperightId id) {
        this.id = id;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}