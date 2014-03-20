package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TPlantasklogId entity.
 */
@Embeddable
public class TPlantasklogId implements java.io.Serializable {

    // Fields    

    private String transdate;
    private String starttime;
    private Integer taskno;

    // Constructors

    /**
     * default constructor
     */
    public TPlantasklogId() {
    }

    /**
     * full constructor
     */
    public TPlantasklogId(String transdate, String starttime, Integer taskno) {
        this.transdate = transdate;
        this.starttime = starttime;
        this.taskno = taskno;
    }

    // Property accessors

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "STARTTIME", nullable = false, length = 6)
    public String getStarttime() {
        return this.starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    @Column(name = "TASKNO", nullable = false)
    public Integer getTaskno() {
        return this.taskno;
    }

    public void setTaskno(Integer taskno) {
        this.taskno = taskno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TPlantasklogId))
            return false;
        TPlantasklogId castOther = (TPlantasklogId) other;

        return ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
                && ((this.getStarttime() == castOther.getStarttime()) || (this.getStarttime() != null
                && castOther.getStarttime() != null && this
                .getStarttime()
                .equals(
                        castOther
                                .getStarttime())))
                && ((this.getTaskno() == castOther.getTaskno()) || (this.getTaskno() != null
                && castOther.getTaskno() != null && this
                .getTaskno()
                .equals(
                        castOther
                                .getTaskno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result + (getStarttime() == null ? 0 : this.getStarttime().hashCode());
        result = 37 * result + (getTaskno() == null ? 0 : this.getTaskno().hashCode());
        return result;
    }

}