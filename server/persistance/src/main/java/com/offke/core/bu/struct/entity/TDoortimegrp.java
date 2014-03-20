package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_DOORTIMEGRP")
public class TDoortimegrp implements java.io.Serializable {

    // Fields    

    private Integer timegrpid;
    private String timegrpname;
    private Integer timeid1;
    private Integer timeid2;
    private Integer timeid3;
    private Integer timeid4;
    private Integer timeid5;
    private Integer timeid6;
    private Integer timeid7;
    private Integer timeid8;
    private Integer adddelflag;
    private Integer downstatus;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoortimegrp() {
    }

    /**
     * minimal constructor
     */
    public TDoortimegrp(Integer timegrpid) {
        this.timegrpid = timegrpid;
    }

    /**
     * full constructor
     */
    public TDoortimegrp(
            Integer timegrpid,
            String timegrpname,
            Integer timeid1,
            Integer timeid2,
            Integer timeid3,
            Integer timeid4,
            Integer timeid5,
            Integer timeid6,
            Integer timeid7,
            Integer timeid8,
            Integer adddelflag,
            Integer downstatus,
            String updatetime) {
        this.timegrpid = timegrpid;
        this.timegrpname = timegrpname;
        this.timeid1 = timeid1;
        this.timeid2 = timeid2;
        this.timeid3 = timeid3;
        this.timeid4 = timeid4;
        this.timeid5 = timeid5;
        this.timeid6 = timeid6;
        this.timeid7 = timeid7;
        this.timeid8 = timeid8;
        this.adddelflag = adddelflag;
        this.downstatus = downstatus;
        this.updatetime = updatetime;
    }

    // Property accessors
    @Id
    @Column(name = "TIMEGRPID", unique = true, nullable = false)
    public Integer getTimegrpid() {
        return this.timegrpid;
    }

    public void setTimegrpid(Integer timegrpid) {
        this.timegrpid = timegrpid;
    }

    @Column(name = "TIMEGRPNAME", length = 60)
    public String getTimegrpname() {
        return this.timegrpname;
    }

    public void setTimegrpname(String timegrpname) {
        this.timegrpname = timegrpname;
    }

    @Column(name = "TIMEID1")
    public Integer getTimeid1() {
        return this.timeid1;
    }

    public void setTimeid1(Integer timeid1) {
        this.timeid1 = timeid1;
    }

    @Column(name = "TIMEID2")
    public Integer getTimeid2() {
        return this.timeid2;
    }

    public void setTimeid2(Integer timeid2) {
        this.timeid2 = timeid2;
    }

    @Column(name = "TIMEID3")
    public Integer getTimeid3() {
        return this.timeid3;
    }

    public void setTimeid3(Integer timeid3) {
        this.timeid3 = timeid3;
    }

    @Column(name = "TIMEID4")
    public Integer getTimeid4() {
        return this.timeid4;
    }

    public void setTimeid4(Integer timeid4) {
        this.timeid4 = timeid4;
    }

    @Column(name = "TIMEID5")
    public Integer getTimeid5() {
        return this.timeid5;
    }

    public void setTimeid5(Integer timeid5) {
        this.timeid5 = timeid5;
    }

    @Column(name = "TIMEID6")
    public Integer getTimeid6() {
        return this.timeid6;
    }

    public void setTimeid6(Integer timeid6) {
        this.timeid6 = timeid6;
    }

    @Column(name = "TIMEID7")
    public Integer getTimeid7() {
        return this.timeid7;
    }

    public void setTimeid7(Integer timeid7) {
        this.timeid7 = timeid7;
    }

    @Column(name = "TIMEID8")
    public Integer getTimeid8() {
        return this.timeid8;
    }

    public void setTimeid8(Integer timeid8) {
        this.timeid8 = timeid8;
    }

    @Column(name = "ADDDELFLAG", precision = 1, scale = 0)
    public Integer getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(Integer adddelflag) {
        this.adddelflag = adddelflag;
    }

    @Column(name = "DOWNSTATUS")
    public Integer getDownstatus() {
        return this.downstatus;
    }

    public void setDownstatus(Integer downstatus) {
        this.downstatus = downstatus;
    }

    @Column(name = "UPDATETIME", length = 30)
    public String getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

}