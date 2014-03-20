package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CARDNOCHANGE")
public class TCardnochange implements java.io.Serializable {

    // Fields    

    private Integer oldcardno;
    private Integer newcardno;
    private String changedate;

    // Constructors

    /**
     * default constructor
     */
    public TCardnochange() {
    }

    /**
     * minimal constructor
     */
    public TCardnochange(Integer oldcardno, Integer newcardno) {
        this.oldcardno = oldcardno;
        this.newcardno = newcardno;
    }

    /**
     * full constructor
     */
    public TCardnochange(Integer oldcardno, Integer newcardno, String changedate) {
        this.oldcardno = oldcardno;
        this.newcardno = newcardno;
        this.changedate = changedate;
    }

    // Property accessors
    @Id
    @Column(name = "OLDCARDNO", unique = true, nullable = false)
    public Integer getOldcardno() {
        return this.oldcardno;
    }

    public void setOldcardno(Integer oldcardno) {
        this.oldcardno = oldcardno;
    }

    @Column(name = "NEWCARDNO", nullable = false)
    public Integer getNewcardno() {
        return this.newcardno;
    }

    public void setNewcardno(Integer newcardno) {
        this.newcardno = newcardno;
    }

    @Column(name = "CHANGEDATE", length = 8)
    public String getChangedate() {
        return this.changedate;
    }

    public void setChangedate(String changedate) {
        this.changedate = changedate;
    }

}