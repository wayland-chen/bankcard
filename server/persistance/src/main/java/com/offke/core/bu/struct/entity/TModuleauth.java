package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TModuleauth entity.
 */
@Entity
@Table(name = "T_MODULEAUTH")
public class TModuleauth implements java.io.Serializable {

    // Fields    

    private String modulecode;
    private String modulename;
    private String menuset;
    private String funcset;
    private String opercode;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TModuleauth() {
    }

    /**
     * minimal constructor
     */
    public TModuleauth(String modulecode) {
        this.modulecode = modulecode;
    }

    /**
     * full constructor
     */
    public TModuleauth(
            String modulecode,
            String modulename,
            String menuset,
            String funcset,
            String opercode,
            String lastsaved) {
        this.modulecode = modulecode;
        this.modulename = modulename;
        this.menuset = menuset;
        this.funcset = funcset;
        this.opercode = opercode;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @Id
    @Column(name = "MODULECODE", unique = true, nullable = false, length = 30)
    public String getModulecode() {
        return this.modulecode;
    }

    public void setModulecode(String modulecode) {
        this.modulecode = modulecode;
    }

    @Column(name = "MODULENAME", length = 60)
    public String getModulename() {
        return this.modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    @Column(name = "MENUSET", length = 800)
    public String getMenuset() {
        return this.menuset;
    }

    public void setMenuset(String menuset) {
        this.menuset = menuset;
    }

    @Column(name = "FUNCSET", length = 600)
    public String getFuncset() {
        return this.funcset;
    }

    public void setFuncset(String funcset) {
        this.funcset = funcset;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}