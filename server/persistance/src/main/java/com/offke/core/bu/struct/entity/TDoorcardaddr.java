package com.offke.core.bu.struct.entity;

import javax.persistence.*;


@Entity
@Table(name = "T_DOORCARDADDR")
public class TDoorcardaddr implements java.io.Serializable {

    // Fields    

    private TDoorcardaddrId id;
    private Integer cardno;
    private String useflag;
    private Integer listid;
    private Boolean adddelflag;

    // Constructors

    /**
     * default constructor
     */
    public TDoorcardaddr() {
    }

    /**
     * minimal constructor
     */
    public TDoorcardaddr(TDoorcardaddrId id, Integer cardno, Boolean adddelflag) {
        this.id = id;
        this.cardno = cardno;
        this.adddelflag = adddelflag;
    }

    /**
     * full constructor
     */
    public TDoorcardaddr(
            TDoorcardaddrId id,
            Integer cardno,
            String useflag,
            Integer listid,
            Boolean adddelflag) {
        this.id = id;
        this.cardno = cardno;
        this.useflag = useflag;
        this.listid = listid;
        this.adddelflag = adddelflag;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "cardaddr", column = @Column(name = "CARDADDR", nullable = false)),
            @AttributeOverride(name = "ctrlid", column = @Column(name = "CTRLID", nullable = false))})
    public TDoorcardaddrId getId() {
        return this.id;
    }

    public void setId(TDoorcardaddrId id) {
        this.id = id;
    }

    @Column(name = "CARDNO", nullable = false)
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "USEFLAG", length = 1)
    public String getUseflag() {
        return this.useflag;
    }

    public void setUseflag(String useflag) {
        this.useflag = useflag;
    }

    @Column(name = "LISTID")
    public Integer getListid() {
        return this.listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    @Column(name = "ADDDELFLAG", nullable = false, precision = 1, scale = 0)
    public Boolean getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(Boolean adddelflag) {
        this.adddelflag = adddelflag;
    }

}