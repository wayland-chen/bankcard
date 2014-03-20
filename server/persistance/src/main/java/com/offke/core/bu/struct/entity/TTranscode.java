package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TTranscode entity.
 */
@Entity
@Table(name = "T_TRANSCODE")
public class TTranscode implements java.io.Serializable {

    // Fields    

    private Integer transcode;
    private String transname;
    private Integer logflag;
    private Integer limitflag;
    private Integer feeflag;
    private Integer transflag;
    private Integer disableflag;

    // Constructors

    /**
     * default constructor
     */
    public TTranscode() {
    }

    /**
     * minimal constructor
     */
    public TTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    /**
     * full constructor
     */
    public TTranscode(
            Integer transcode,
            String transname,
            Integer logflag,
            Integer limitflag,
            Integer feeflag,
            Integer transflag,
            Integer disableflag) {
        this.transcode = transcode;
        this.transname = transname;
        this.logflag = logflag;
        this.limitflag = limitflag;
        this.feeflag = feeflag;
        this.transflag = transflag;
        this.disableflag = disableflag;
    }

    // Property accessors
    @Id
    @Column(name = "TRANSCODE", unique = true, nullable = false)
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "TRANSNAME", length = 60)
    public String getTransname() {
        return this.transname;
    }

    public void setTransname(String transname) {
        this.transname = transname;
    }

    @Column(name = "LOGFLAG")
    public Integer getLogflag() {
        return this.logflag;
    }

    public void setLogflag(Integer logflag) {
        this.logflag = logflag;
    }

    @Column(name = "LIMITFLAG")
    public Integer getLimitflag() {
        return this.limitflag;
    }

    public void setLimitflag(Integer limitflag) {
        this.limitflag = limitflag;
    }

    @Column(name = "FEEFLAG")
    public Integer getFeeflag() {
        return this.feeflag;
    }

    public void setFeeflag(Integer feeflag) {
        this.feeflag = feeflag;
    }

    @Column(name = "TRANSFLAG")
    public Integer getTransflag() {
        return this.transflag;
    }

    public void setTransflag(Integer transflag) {
        this.transflag = transflag;
    }

    @Column(name = "DISABLEFLAG")
    public Integer getDisableflag() {
        return this.disableflag;
    }

    public void setDisableflag(Integer disableflag) {
        this.disableflag = disableflag;
    }

}