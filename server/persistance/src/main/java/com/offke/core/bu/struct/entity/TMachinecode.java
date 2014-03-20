package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMachinecode entity.
 */
@Entity
@Table(name = "T_MACHINECODE")
public class TMachinecode implements java.io.Serializable {

    // Fields    

    private String machinecode;
    private String ip;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TMachinecode() {
    }

    /**
     * minimal constructor
     */
    public TMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    /**
     * full constructor
     */
    public TMachinecode(String machinecode, String ip, String lastsaved) {
        this.machinecode = machinecode;
        this.ip = ip;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "MACHINECODE", unique = true, nullable = false, length = 60)
    public String getMachinecode() {
        return this.machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    @Column(name = "IP", length = 15)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}