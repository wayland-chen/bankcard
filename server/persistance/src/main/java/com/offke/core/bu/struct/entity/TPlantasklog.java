package com.offke.core.bu.struct.entity;

import javax.persistence.*;


/**
 * TPlantasklog entity.
 */
@Entity
@Table(name = "T_PLANTASKLOG")
public class TPlantasklog implements java.io.Serializable {

    // Fields    

    private TPlantasklogId id;
    private String progname;
    private String endtime;
    private Integer runstatus;
    private String summary;

    // Constructors

    /**
     * default constructor
     */
    public TPlantasklog() {
    }

    /**
     * minimal constructor
     */
    public TPlantasklog(TPlantasklogId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TPlantasklog(TPlantasklogId id, String progname, String endtime, Integer runstatus, String summary) {
        this.id = id;
        this.progname = progname;
        this.endtime = endtime;
        this.runstatus = runstatus;
        this.summary = summary;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transdate", column = @Column(name = "TRANSDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "starttime", column = @Column(name = "STARTTIME", nullable = false, length = 6)),
            @AttributeOverride(name = "taskno", column = @Column(name = "TASKNO", nullable = false))})
    public TPlantasklogId getId() {
        return this.id;
    }

    public void setId(TPlantasklogId id) {
        this.id = id;
    }

    @Column(name = "PROGNAME", length = 60)
    public String getProgname() {
        return this.progname;
    }

    public void setProgname(String progname) {
        this.progname = progname;
    }

    @Column(name = "ENDTIME", length = 30)
    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Column(name = "RUNSTATUS")
    public Integer getRunstatus() {
        return this.runstatus;
    }

    public void setRunstatus(Integer runstatus) {
        this.runstatus = runstatus;
    }

    @Column(name = "SUMMARY", length = 240)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}