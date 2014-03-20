package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TCardbalanceId implements java.io.Serializable {

    // Fields    

    private String accno;
    private Integer pursetype;

    // Constructors

    /**
     * default constructor
     */
    public TCardbalanceId() {
    }

    /**
     * full constructor
     */
    public TCardbalanceId(String accno, Integer pursetype) {
        this.accno = accno;
        this.pursetype = pursetype;
    }

    // Property accessors

    @Column(name = "ACCNO", nullable = false, length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "PURSETYPE", nullable = false, precision = 1, scale = 0)
    public Integer getPursetype() {
        return this.pursetype;
    }

    public void setPursetype(Integer pursetype) {
        this.pursetype = pursetype;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TCardbalanceId))
            return false;
        TCardbalanceId castOther = (TCardbalanceId) other;

        return ((this.getAccno() == castOther.getAccno()) || (this.getAccno() != null
                && castOther.getAccno() != null && this
                .getAccno()
                .equals(
                        castOther
                                .getAccno())))
                && ((this.getPursetype() == castOther.getPursetype()) || (this.getPursetype() != null
                && castOther.getPursetype() != null && this
                .getPursetype()
                .equals(
                        castOther
                                .getPursetype())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccno() == null ? 0 : this.getAccno().hashCode());
        result = 37 * result + (getPursetype() == null ? 0 : this.getPursetype().hashCode());
        return result;
    }

}