package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TDictionaryId entity.
 */
@Embeddable
public class TDictionaryId implements java.io.Serializable {

    // Fields    

    private Integer dicttype;
    private String dictval;

    // Constructors

    /**
     * default constructor
     */
    public TDictionaryId() {
    }

    /**
     * full constructor
     */
    public TDictionaryId(Integer dicttype, String dictval) {
        this.dicttype = dicttype;
        this.dictval = dictval;
    }

    // Property accessors

    @Column(name = "DICTTYPE", nullable = false)
    public Integer getDicttype() {
        return this.dicttype;
    }

    public void setDicttype(Integer dicttype) {
        this.dicttype = dicttype;
    }

    @Column(name = "DICTVAL", nullable = false, length = 30)
    public String getDictval() {
        return this.dictval;
    }

    public void setDictval(String dictval) {
        this.dictval = dictval;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TDictionaryId))
            return false;
        TDictionaryId castOther = (TDictionaryId) other;

        return ((this.getDicttype() == castOther.getDicttype()) || (this.getDicttype() != null
                && castOther.getDicttype() != null && this
                .getDicttype()
                .equals(
                        castOther
                                .getDicttype())))
                && ((this.getDictval() == castOther.getDictval()) || (this.getDictval() != null
                && castOther.getDictval() != null && this
                .getDictval()
                .equals(
                        castOther
                                .getDictval())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getDicttype() == null ? 0 : this.getDicttype().hashCode());
        result = 37 * result + (getDictval() == null ? 0 : this.getDictval().hashCode());
        return result;
    }

}