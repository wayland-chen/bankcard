package com.offke.core.bu.struct.entity;

import javax.persistence.*;


@Entity
@Table(name = "T_CUSTIDCTL")
public class TCustidctl implements java.io.Serializable {

    // Fields    

    private TCustidctlId id;
    private Integer nextno;
    private Integer endno;
    private String lastsaved;

    // Constructors

    /**
     * default constructor
     */
    public TCustidctl() {
    }

    /**
     * minimal constructor
     */
    public TCustidctl(TCustidctlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TCustidctl(TCustidctlId id, Integer nextno, Integer endno, String lastsaved) {
        this.id = id;
        this.nextno = nextno;
        this.endno = endno;
        this.lastsaved = lastsaved;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "areacode", column = @Column(name = "AREACODE", nullable = false, length = 3)),
            @AttributeOverride(name = "startno", column = @Column(name = "STARTNO", nullable = false))})
    public TCustidctlId getId() {
        return this.id;
    }

    public void setId(TCustidctlId id) {
        this.id = id;
    }

    @Column(name = "NEXTNO")
    public Integer getNextno() {
        return this.nextno;
    }

    public void setNextno(Integer nextno) {
        this.nextno = nextno;
    }

    @Column(name = "ENDNO")
    public Integer getEndno() {
        return this.endno;
    }

    public void setEndno(Integer endno) {
        this.endno = endno;
    }

    @Column(name = "LASTSAVED", length = 30)
    public String getLastsaved() {
        return this.lastsaved;
    }

    public void setLastsaved(String lastsaved) {
        this.lastsaved = lastsaved;
    }

}