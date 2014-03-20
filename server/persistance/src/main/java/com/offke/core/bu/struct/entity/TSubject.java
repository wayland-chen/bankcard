package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TSubject entity.
 */
@Entity
@Table(name = "T_SUBJECT")
public class TSubject implements java.io.Serializable {

    // Fields    

    private String subjno;
    private String subjname;
    private Integer subjtype;
    private Integer balflag;
    private String fsubjno;
    private Integer subjlevel;
    private String endflag;

    // Constructors

    /**
     * default constructor
     */
    public TSubject() {
    }

    /**
     * minimal constructor
     */
    public TSubject(String subjno) {
        this.subjno = subjno;
    }

    /**
     * full constructor
     */
    public TSubject(
            String subjno,
            String subjname,
            Integer subjtype,
            Integer balflag,
            String fsubjno,
            Integer subjlevel,
            String endflag) {
        this.subjno = subjno;
        this.subjname = subjname;
        this.subjtype = subjtype;
        this.balflag = balflag;
        this.fsubjno = fsubjno;
        this.subjlevel = subjlevel;
        this.endflag = endflag;
    }

    // Property accessors
    @Id
    @Column(name = "SUBJNO", unique = true, nullable = false, length = 6)
    public String getSubjno() {
        return this.subjno;
    }

    public void setSubjno(String subjno) {
        this.subjno = subjno;
    }

    @Column(name = "SUBJNAME", length = 60)
    public String getSubjname() {
        return this.subjname;
    }

    public void setSubjname(String subjname) {
        this.subjname = subjname;
    }

    @Column(name = "SUBJTYPE")
    public Integer getSubjtype() {
        return this.subjtype;
    }

    public void setSubjtype(Integer subjtype) {
        this.subjtype = subjtype;
    }

    @Column(name = "BALFLAG", precision = 1, scale = 0)
    public Integer getBalflag() {
        return this.balflag;
    }

    public void setBalflag(Integer balflag) {
        this.balflag = balflag;
    }

    @Column(name = "FSUBJNO", length = 6)
    public String getFsubjno() {
        return this.fsubjno;
    }

    public void setFsubjno(String fsubjno) {
        this.fsubjno = fsubjno;
    }

    @Column(name = "SUBJLEVEL")
    public Integer getSubjlevel() {
        return this.subjlevel;
    }

    public void setSubjlevel(Integer subjlevel) {
        this.subjlevel = subjlevel;
    }

    @Column(name = "ENDFLAG", length = 1)
    public String getEndflag() {
        return this.endflag;
    }

    public void setEndflag(String endflag) {
        this.endflag = endflag;
    }

}