package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSpecialty entity.
 */
@Entity
@Table(name = "T_SPECIALTY")
public class TSpecialty implements java.io.Serializable {

    // Fields    

    private String specialtycode;
    private String specialtyname;
    private String useflag;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TSpecialty() {
    }

    /**
     * minimal constructor
     */
    public TSpecialty(String specialtycode) {
        this.specialtycode = specialtycode;
    }

    /**
     * full constructor
     */
    public TSpecialty(String specialtycode, String specialtyname, String useflag, String lastsaved) {
        this.specialtycode = specialtycode;
        this.specialtyname = specialtyname;
        this.useflag = useflag;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "SPECIALTYCODE", unique = true, nullable = false, length = 30)
    public String getSpecialtycode() {
        return this.specialtycode;
    }

    public void setSpecialtycode(String specialtycode) {
        this.specialtycode = specialtycode;
    }

    @Column(name = "SPECIALTYNAME", length = 60)
    public String getSpecialtyname() {
        return this.specialtyname;
    }

    public void setSpecialtyname(String specialtyname) {
        this.specialtyname = specialtyname;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}