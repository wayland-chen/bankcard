package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * TSessionpool entity.
 */
@Entity
@Table(name = "T_SESSIONPOOL")
public class TSessionpool implements java.io.Serializable {

    // Fields    

    private String sessionid;
    private String opercode;
    private Timestamp atime;
    private String ip;
    private String sitelimit;

    // Constructors

    /**
     * default constructor
     */
    public TSessionpool() {
    }

    /**
     * minimal constructor
     */
    public TSessionpool(String sessionid, String opercode, Timestamp atime, String sitelimit) {
        this.sessionid = sessionid;
        this.opercode = opercode;
        this.atime = atime;
        this.sitelimit = sitelimit;
    }

    /**
     * full constructor
     */
    public TSessionpool(String sessionid, String opercode, Timestamp atime, String ip, String sitelimit) {
        this.sessionid = sessionid;
        this.opercode = opercode;
        this.atime = atime;
        this.ip = ip;
        this.sitelimit = sitelimit;
    }

    // Property accessors
    @Id
    @Column(name = "SESSIONID", unique = true, nullable = false, length = 12)
    public String getSessionid() {
        return this.sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    @Column(name = "OPERCODE", nullable = false, length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "ATIME", nullable = false, length = 11)
    public Timestamp getAtime() {
        return this.atime;
    }

    public void setAtime(Timestamp atime) {
        this.atime = atime;
    }

    @Column(name = "IP", length = 15)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "SITELIMIT", nullable = false, length = 1)
    public String getSitelimit() {
        return this.sitelimit;
    }

    public void setSitelimit(String sitelimit) {
        this.sitelimit = sitelimit;
    }

}