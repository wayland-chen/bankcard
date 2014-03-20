package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TRptsysstat entity.
 */
@Entity
@Table(name = "T_RPTSYSSTAT")
public class TRptsysstat implements java.io.Serializable {

    // Fields    

    private TRptsysstatId id;
    private String itemname;
    private String itemval;

    // Constructors

    /**
     * default constructor
     */
    public TRptsysstat() {
    }

    /**
     * minimal constructor
     */
    public TRptsysstat(TRptsysstatId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptsysstat(TRptsysstatId id, String itemname, String itemval) {
        this.id = id;
        this.itemname = itemname;
        this.itemval = itemval;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "itemid", column = @Column(name = "ITEMID", nullable = false))})
    public TRptsysstatId getId() {
        return this.id;
    }

    public void setId(TRptsysstatId id) {
        this.id = id;
    }

    @Column(name = "ITEMNAME", length = 60)
    public String getItemname() {
        return this.itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    @Column(name = "ITEMVAL", length = 30)
    public String getItemval() {
        return this.itemval;
    }

    public void setItemval(String itemval) {
        this.itemval = itemval;
    }

}