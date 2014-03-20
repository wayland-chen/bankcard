package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TPlantask entity.
 */
@Entity
@Table(name = "T_PLANTASK")
public class TPlantask implements java.io.Serializable {

    // Fields    

    private Integer taskno;
    private String summary;
    private String progname;
    private String progpath;
    private String progargv;
    private Integer dialy;
    private Integer weekly;
    private Integer monthly;
    private String starttime;
    private String endtime;
    private String useflag;

    // Constructors

    /**
     * default constructor
     */
    public TPlantask() {
    }

    /**
     * minimal constructor
     */
    public TPlantask(Integer taskno) {
        this.taskno = taskno;
    }

    /**
     * full constructor
     */
    public TPlantask(
            Integer taskno,
            String summary,
            String progname,
            String progpath,
            String progargv,
            Integer dialy,
            Integer weekly,
            Integer monthly,
            String starttime,
            String endtime,
            String useflag) {
        this.taskno = taskno;
        this.summary = summary;
        this.progname = progname;
        this.progpath = progpath;
        this.progargv = progargv;
        this.dialy = dialy;
        this.weekly = weekly;
        this.monthly = monthly;
        this.starttime = starttime;
        this.endtime = endtime;
        this.useflag = useflag;
    }

    // Property accessors
    @Id
    @Column(name = "TASKNO", unique = true, nullable = false)
    public Integer getTaskno() {
        return this.taskno;
    }

    public void setTaskno(Integer taskno) {
        this.taskno = taskno;
    }

    @Column(name = "SUMMARY", length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "PROGNAME", length = 60)
    public String getProgname() {
        return this.progname;
    }

    public void setProgname(String progname) {
        this.progname = progname;
    }

    @Column(name = "PROGPATH", length = 240)
    public String getProgpath() {
        return this.progpath;
    }

    public void setProgpath(String progpath) {
        this.progpath = progpath;
    }

    @Column(name = "PROGARGV", length = 240)
    public String getProgargv() {
        return this.progargv;
    }

    public void setProgargv(String progargv) {
        this.progargv = progargv;
    }

    @Column(name = "DIALY")
    public Integer getDialy() {
        return this.dialy;
    }

    public void setDialy(Integer dialy) {
        this.dialy = dialy;
    }

    @Column(name = "WEEKLY")
    public Integer getWeekly() {
        return this.weekly;
    }

    public void setWeekly(Integer weekly) {
        this.weekly = weekly;
    }

    @Column(name = "MONTHLY")
    public Integer getMonthly() {
        return this.monthly;
    }

    public void setMonthly(Integer monthly) {
        this.monthly = monthly;
    }

    @Column(name = "STARTTIME", length = 6)
    public String getStarttime() {
        return this.starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    @Column(name = "ENDTIME", length = 6)
    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

}