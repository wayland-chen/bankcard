package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_BOOKTYPE")
public class TBooktype implements java.io.Serializable {

    // Fields    

    private Integer booktype;
    private String bookname;

    // Constructors

    /**
     * default constructor
     */
    public TBooktype() {
    }

    /**
     * full constructor
     */
    public TBooktype(Integer booktype, String bookname) {
        this.booktype = booktype;
        this.bookname = bookname;
    }

    // Property accessors
    @Id
    @Column(name = "BOOKTYPE", unique = true, nullable = false, precision = 2, scale = 0)
    public Integer getBooktype() {
        return this.booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
    }

    @Column(name = "BOOKNAME", nullable = false, length = 240)
    public String getBookname() {
        return this.bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

}