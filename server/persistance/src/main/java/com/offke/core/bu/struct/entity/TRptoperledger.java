package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRptoperledger entity.
 */
@Entity
@Table(name = "T_RPTOPERLEDGER")
public class TRptoperledger implements java.io.Serializable {

    // Fields    

    private TRptoperledgerId id;
    private String subjno;
    private Integer transtype;
    private Integer transcnt;
    private BigDecimal dramt;
    private BigDecimal cramt;

    // Constructors

    /**
     * default constructor
     */
    public TRptoperledger() {
    }

    /**
     * minimal constructor
     */
    public TRptoperledger(TRptoperledgerId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptoperledger(
            TRptoperledgerId id,
            String subjno,
            Integer transtype,
            Integer transcnt,
            BigDecimal dramt,
            BigDecimal cramt) {
        this.id = id;
        this.subjno = subjno;
        this.transtype = transtype;
        this.transcnt = transcnt;
        this.dramt = dramt;
        this.cramt = cramt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10)),
            @AttributeOverride(name = "summary", column = @Column(name = "SUMMARY", nullable = false, length = 60))})
    public TRptoperledgerId getId() {
        return this.id;
    }

    public void setId(TRptoperledgerId id) {
        this.id = id;
    }

    @Column(name = "SUBJNO", length = 6)
    public String getSubjno() {
        return this.subjno;
    }

    public void setSubjno(String subjno) {
        this.subjno = subjno;
    }

    @Column(name = "TRANSTYPE")
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "TRANSCNT")
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "DRAMT", precision = 15)
    public BigDecimal getDramt() {
        return this.dramt;
    }

    public void setDramt(BigDecimal dramt) {
        this.dramt = dramt;
    }

    @Column(name = "CRAMT", precision = 15)
    public BigDecimal getCramt() {
        return this.cramt;
    }

    public void setCramt(BigDecimal cramt) {
        this.cramt = cramt;
    }

}