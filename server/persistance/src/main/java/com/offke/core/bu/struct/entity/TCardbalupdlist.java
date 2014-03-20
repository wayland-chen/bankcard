package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_CARDBALUPDLIST")
public class TCardbalupdlist implements java.io.Serializable {

    // Fields    

    private TCardbalupdlistId id;
    private Integer cardno;
    private Integer transdate;
    private String status;
    private BigDecimal amount;
    private String summary;
    private Integer transcode;
    private String lastupdtime;

    // Constructors

    /**
     * default constructor
     */
    public TCardbalupdlist() {
    }

    /**
     * minimal constructor
     */
    public TCardbalupdlist(TCardbalupdlistId id, Integer cardno, String status, BigDecimal amount) {
        this.id = id;
        this.cardno = cardno;
        this.status = status;
        this.amount = amount;
    }

    /**
     * full constructor
     */
    public TCardbalupdlist(
            TCardbalupdlistId id,
            Integer cardno,
            Integer transdate,
            String status,
            BigDecimal amount,
            String summary,
            Integer transcode,
            String lastupdtime) {
        this.id = id;
        this.cardno = cardno;
        this.transdate = transdate;
        this.status = status;
        this.amount = amount;
        this.summary = summary;
        this.transcode = transcode;
        this.lastupdtime = lastupdtime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "batchno", column = @Column(name = "BATCHNO", nullable = false, length = 30)),
            @AttributeOverride(name = "seqno", column = @Column(name = "SEQNO", nullable = false))})
    public TCardbalupdlistId getId() {
        return this.id;
    }

    public void setId(TCardbalupdlistId id) {
        this.id = id;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "TRANSDATE", precision = 8, scale = 0)
    public Integer getTransdate() {
        return this.transdate;
    }

    public void setTransdate(Integer transdate) {
        this.transdate = transdate;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "AMOUNT", nullable = false, precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "SUMMARY", length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "LASTUPDTIME", length = 30)
    public String getLastupdtime() {
        return this.lastupdtime;
    }

    public void setLastupdtime(String lastupdtime) {
        this.lastupdtime = lastupdtime;
    }

}