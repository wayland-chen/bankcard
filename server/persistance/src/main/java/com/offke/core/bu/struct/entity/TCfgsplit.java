package com.offke.core.bu.struct.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CFGSPLIT")
public class TCfgsplit implements java.io.Serializable {

    // Fields    

    private TCfgsplitId id;
    private Integer offlineflag;
    private Integer usecardflag;
    private Integer calccardbal;
    private String draccflag;
    private String drsubjno;
    private String draccno;
    private String craccflag;
    private String crsubjno;
    private String craccno;
    private String summary;

    // Constructors

    /**
     * default constructor
     */
    public TCfgsplit() {
    }

    /**
     * minimal constructor
     */
    public TCfgsplit(TCfgsplitId id, String draccflag, String craccflag) {
        this.id = id;
        this.draccflag = draccflag;
        this.craccflag = craccflag;
    }

    /**
     * full constructor
     */
    public TCfgsplit(
            TCfgsplitId id,
            Integer offlineflag,
            Integer usecardflag,
            Integer calccardbal,
            String draccflag,
            String drsubjno,
            String draccno,
            String craccflag,
            String crsubjno,
            String craccno,
            String summary) {
        this.id = id;
        this.offlineflag = offlineflag;
        this.usecardflag = usecardflag;
        this.calccardbal = calccardbal;
        this.draccflag = draccflag;
        this.drsubjno = drsubjno;
        this.draccno = draccno;
        this.craccflag = craccflag;
        this.crsubjno = crsubjno;
        this.craccno = craccno;
        this.summary = summary;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "transtype", column = @Column(name = "TRANSTYPE", nullable = false)),
            @AttributeOverride(name = "fundtype", column = @Column(name = "FUNDTYPE", nullable = false))})
    public TCfgsplitId getId() {
        return this.id;
    }

    public void setId(TCfgsplitId id) {
        this.id = id;
    }

    @Column(name = "OFFLINEFLAG")
    public Integer getOfflineflag() {
        return this.offlineflag;
    }

    public void setOfflineflag(Integer offlineflag) {
        this.offlineflag = offlineflag;
    }

    @Column(name = "USECARDFLAG")
    public Integer getUsecardflag() {
        return this.usecardflag;
    }

    public void setUsecardflag(Integer usecardflag) {
        this.usecardflag = usecardflag;
    }

    @Column(name = "CALCCARDBAL")
    public Integer getCalccardbal() {
        return this.calccardbal;
    }

    public void setCalccardbal(Integer calccardbal) {
        this.calccardbal = calccardbal;
    }

    @Column(name = "DRACCFLAG", nullable = false, length = 1)
    public String getDraccflag() {
        return this.draccflag;
    }

    public void setDraccflag(String draccflag) {
        this.draccflag = draccflag;
    }

    @Column(name = "DRSUBJNO", length = 6)
    public String getDrsubjno() {
        return this.drsubjno;
    }

    public void setDrsubjno(String drsubjno) {
        this.drsubjno = drsubjno;
    }

    @Column(name = "DRACCNO", length = 10)
    public String getDraccno() {
        return this.draccno;
    }

    public void setDraccno(String draccno) {
        this.draccno = draccno;
    }

    @Column(name = "CRACCFLAG", nullable = false, length = 1)
    public String getCraccflag() {
        return this.craccflag;
    }

    public void setCraccflag(String craccflag) {
        this.craccflag = craccflag;
    }

    @Column(name = "CRSUBJNO", length = 6)
    public String getCrsubjno() {
        return this.crsubjno;
    }

    public void setCrsubjno(String crsubjno) {
        this.crsubjno = crsubjno;
    }

    @Column(name = "CRACCNO", length = 10)
    public String getCraccno() {
        return this.craccno;
    }

    public void setCraccno(String craccno) {
        this.craccno = craccno;
    }

    @Column(name = "SUMMARY", length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}