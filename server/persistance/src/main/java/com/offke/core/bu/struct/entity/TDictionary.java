package com.offke.core.bu.struct.entity;

import javax.persistence.*;


@Entity
@Table(name = "T_DICTIONARY")
public class TDictionary implements java.io.Serializable {

    // Fields    

    private TDictionaryId id;
    private String dicttypename;
    private String dictcaption;

    // Constructors

    /**
     * default constructor
     */
    public TDictionary() {
    }

    /**
     * minimal constructor
     */
    public TDictionary(TDictionaryId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TDictionary(TDictionaryId id, String dicttypename, String dictcaption) {
        this.id = id;
        this.dicttypename = dicttypename;
        this.dictcaption = dictcaption;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "dicttype", column = @Column(name = "DICTTYPE", nullable = false)),
            @AttributeOverride(name = "dictval", column = @Column(name = "DICTVAL", nullable = false, length = 30))})
    public TDictionaryId getId() {
        return this.id;
    }

    public void setId(TDictionaryId id) {
        this.id = id;
    }

    @Column(name = "DICTTYPENAME", length = 60)
    public String getDicttypename() {
        return this.dicttypename;
    }

    public void setDicttypename(String dicttypename) {
        this.dicttypename = dicttypename;
    }

    @Column(name = "DICTCAPTION", length = 60)
    public String getDictcaption() {
        return this.dictcaption;
    }

    public void setDictcaption(String dictcaption) {
        this.dictcaption = dictcaption;
    }

}