package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>修改为合适的类型</p>
 *
 * @version 1.0
 * @since 2012/04/28
 */
@Entity
@Table(name = "T_SEQNOCTL")
public class TSeqnoctl implements java.io.Serializable {

    // Fields    

    private Integer termid;
    private Long termseqno;
    private Integer accdate;

    // Constructors

    /**
     * default constructor
     */
    public TSeqnoctl() {
    }

    /**
     * minimal constructor
     */
    public TSeqnoctl(Integer termid) {
        this.termid = termid;
    }

    /**
     * full constructor
     */
    public TSeqnoctl(Integer termid, Long termseqno, Integer accdate) {
        this.termid = termid;
        this.termseqno = termseqno;
        this.accdate = accdate;
    }

    // Property accessors
    @Id
    @Column(name = "TERMID", unique = true, nullable = false)
    public Integer getTermid() {
        return this.termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    @Column(name = "TERMSEQNO")
    public Long getTermseqno() {
        return this.termseqno;
    }

    public void setTermseqno(Long termseqno) {
        this.termseqno = termseqno;
    }

    @Column(name = "ACCDATE")
    public Integer getAccdate() {
        return this.accdate;
    }

    public void setAccdate(Integer accdate) {
        this.accdate = accdate;
    }

}