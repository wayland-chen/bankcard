package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCardbitmap entity.
 */
@Entity
@Table(name = "T_CARDBITMAP")
public class TCardbitmap implements java.io.Serializable {

    // Fields    

    private Integer cardno;
    private Integer baseno;
    private String bitmap0;
    private String bitmap1;
    private String bitmap2;
    private String bitmap3;
    private String bitmap4;
    private String bitmap5;
    private String bitmap6;
    private String bitmap7;
    private String bitmap8;
    private String bitmap9;
    private String delflag;

    // Constructors

    /**
     * default constructor
     */
    public TCardbitmap() {
    }

    /**
     * minimal constructor
     */
    public TCardbitmap(Integer cardno) {
        this.cardno = cardno;
    }

    /**
     * full constructor
     */
    public TCardbitmap(
            Integer cardno,
            Integer baseno,
            String bitmap0,
            String bitmap1,
            String bitmap2,
            String bitmap3,
            String bitmap4,
            String bitmap5,
            String bitmap6,
            String bitmap7,
            String bitmap8,
            String bitmap9,
            String delflag) {
        this.cardno = cardno;
        this.baseno = baseno;
        this.bitmap0 = bitmap0;
        this.bitmap1 = bitmap1;
        this.bitmap2 = bitmap2;
        this.bitmap3 = bitmap3;
        this.bitmap4 = bitmap4;
        this.bitmap5 = bitmap5;
        this.bitmap6 = bitmap6;
        this.bitmap7 = bitmap7;
        this.bitmap8 = bitmap8;
        this.bitmap9 = bitmap9;
        this.delflag = delflag;
    }

    // Property accessors
    @Id
    @Column(name = "CARDNO", unique = true, nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "BASENO")
    public Integer getBaseno() {
        return this.baseno;
    }

    public void setBaseno(Integer baseno) {
        this.baseno = baseno;
    }

    @Column(name = "BITMAP0", length = 100)
    public String getBitmap0() {
        return this.bitmap0;
    }

    public void setBitmap0(String bitmap0) {
        this.bitmap0 = bitmap0;
    }

    @Column(name = "BITMAP1", length = 100)
    public String getBitmap1() {
        return this.bitmap1;
    }

    public void setBitmap1(String bitmap1) {
        this.bitmap1 = bitmap1;
    }

    @Column(name = "BITMAP2", length = 100)
    public String getBitmap2() {
        return this.bitmap2;
    }

    public void setBitmap2(String bitmap2) {
        this.bitmap2 = bitmap2;
    }

    @Column(name = "BITMAP3", length = 100)
    public String getBitmap3() {
        return this.bitmap3;
    }

    public void setBitmap3(String bitmap3) {
        this.bitmap3 = bitmap3;
    }

    @Column(name = "BITMAP4", length = 100)
    public String getBitmap4() {
        return this.bitmap4;
    }

    public void setBitmap4(String bitmap4) {
        this.bitmap4 = bitmap4;
    }

    @Column(name = "BITMAP5", length = 100)
    public String getBitmap5() {
        return this.bitmap5;
    }

    public void setBitmap5(String bitmap5) {
        this.bitmap5 = bitmap5;
    }

    @Column(name = "BITMAP6", length = 100)
    public String getBitmap6() {
        return this.bitmap6;
    }

    public void setBitmap6(String bitmap6) {
        this.bitmap6 = bitmap6;
    }

    @Column(name = "BITMAP7", length = 100)
    public String getBitmap7() {
        return this.bitmap7;
    }

    public void setBitmap7(String bitmap7) {
        this.bitmap7 = bitmap7;
    }

    @Column(name = "BITMAP8", length = 100)
    public String getBitmap8() {
        return this.bitmap8;
    }

    public void setBitmap8(String bitmap8) {
        this.bitmap8 = bitmap8;
    }

    @Column(name = "BITMAP9", length = 100)
    public String getBitmap9() {
        return this.bitmap9;
    }

    public void setBitmap9(String bitmap9) {
        this.bitmap9 = bitmap9;
    }

    @Column(name = "DELFLAG", length = 1)
    public String getDelflag() {
        return this.delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

}