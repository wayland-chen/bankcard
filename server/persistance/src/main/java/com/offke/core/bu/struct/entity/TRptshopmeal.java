package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRptshopmeal entity.
 */
@Entity
@Table(name = "T_RPTSHOPMEAL")
public class TRptshopmeal implements java.io.Serializable {

    // Fields    

    private TRptshopmealId id;
    private Integer transcnt1;
    private BigDecimal transamt1;
    private Integer transcnt2;
    private BigDecimal transamt2;
    private Integer transcnt3;
    private BigDecimal transamt3;
    private Integer transcnt4;
    private BigDecimal transamt4;

    // Constructors

    /**
     * default constructor
     */
    public TRptshopmeal() {
    }

    /**
     * minimal constructor
     */
    public TRptshopmeal(TRptshopmealId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TRptshopmeal(
            TRptshopmealId id,
            Integer transcnt1,
            BigDecimal transamt1,
            Integer transcnt2,
            BigDecimal transamt2,
            Integer transcnt3,
            BigDecimal transamt3,
            Integer transcnt4,
            BigDecimal transamt4) {
        this.id = id;
        this.transcnt1 = transcnt1;
        this.transamt1 = transamt1;
        this.transcnt2 = transcnt2;
        this.transamt2 = transamt2;
        this.transcnt3 = transcnt3;
        this.transamt3 = transamt3;
        this.transcnt4 = transcnt4;
        this.transamt4 = transamt4;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "accno", column = @Column(name = "ACCNO", nullable = false, length = 10))})
    public TRptshopmealId getId() {
        return this.id;
    }

    public void setId(TRptshopmealId id) {
        this.id = id;
    }

    @Column(name = "TRANSCNT1")
    public Integer getTranscnt1() {
        return this.transcnt1;
    }

    public void setTranscnt1(Integer transcnt1) {
        this.transcnt1 = transcnt1;
    }

    @Column(name = "TRANSAMT1", precision = 15)
    public BigDecimal getTransamt1() {
        return this.transamt1;
    }

    public void setTransamt1(BigDecimal transamt1) {
        this.transamt1 = transamt1;
    }

    @Column(name = "TRANSCNT2")
    public Integer getTranscnt2() {
        return this.transcnt2;
    }

    public void setTranscnt2(Integer transcnt2) {
        this.transcnt2 = transcnt2;
    }

    @Column(name = "TRANSAMT2", precision = 15)
    public BigDecimal getTransamt2() {
        return this.transamt2;
    }

    public void setTransamt2(BigDecimal transamt2) {
        this.transamt2 = transamt2;
    }

    @Column(name = "TRANSCNT3")
    public Integer getTranscnt3() {
        return this.transcnt3;
    }

    public void setTranscnt3(Integer transcnt3) {
        this.transcnt3 = transcnt3;
    }

    @Column(name = "TRANSAMT3", precision = 15)
    public BigDecimal getTransamt3() {
        return this.transamt3;
    }

    public void setTransamt3(BigDecimal transamt3) {
        this.transamt3 = transamt3;
    }

    @Column(name = "TRANSCNT4")
    public Integer getTranscnt4() {
        return this.transcnt4;
    }

    public void setTranscnt4(Integer transcnt4) {
        this.transcnt4 = transcnt4;
    }

    @Column(name = "TRANSAMT4", precision = 15)
    public BigDecimal getTransamt4() {
        return this.transamt4;
    }

    public void setTransamt4(BigDecimal transamt4) {
        this.transamt4 = transamt4;
    }

}