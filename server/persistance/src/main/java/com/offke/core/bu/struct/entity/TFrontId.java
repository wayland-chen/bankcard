package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TFrontId entity.
 */
@Embeddable
public class TFrontId implements java.io.Serializable {

    // Fields    

    private Integer frontid;
    private String frontname;
    private String ip;
    private Integer drtpport;
    private Integer drtpnode;
    private Integer bccmainfuncno;

    // Constructors

    /**
     * default constructor
     */
    public TFrontId() {
    }

    /**
     * minimal constructor
     */
    public TFrontId(Integer frontid) {
        this.frontid = frontid;
    }

    /**
     * full constructor
     */
    public TFrontId(
            Integer frontid,
            String frontname,
            String ip,
            Integer drtpport,
            Integer drtpnode,
            Integer bccmainfuncno) {
        this.frontid = frontid;
        this.frontname = frontname;
        this.ip = ip;
        this.drtpport = drtpport;
        this.drtpnode = drtpnode;
        this.bccmainfuncno = bccmainfuncno;
    }

    // Property accessors

    @Column(name = "FRONTID", nullable = false)
    public Integer getFrontid() {
        return this.frontid;
    }

    public void setFrontid(Integer frontid) {
        this.frontid = frontid;
    }

    @Column(name = "FRONTNAME", length = 60)
    public String getFrontname() {
        return this.frontname;
    }

    public void setFrontname(String frontname) {
        this.frontname = frontname;
    }

    @Column(name = "IP", length = 15)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "DRTPPORT")
    public Integer getDrtpport() {
        return this.drtpport;
    }

    public void setDrtpport(Integer drtpport) {
        this.drtpport = drtpport;
    }

    @Column(name = "DRTPNODE")
    public Integer getDrtpnode() {
        return this.drtpnode;
    }

    public void setDrtpnode(Integer drtpnode) {
        this.drtpnode = drtpnode;
    }

    @Column(name = "BCCMAINFUNCNO")
    public Integer getBccmainfuncno() {
        return this.bccmainfuncno;
    }

    public void setBccmainfuncno(Integer bccmainfuncno) {
        this.bccmainfuncno = bccmainfuncno;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TFrontId))
            return false;
        TFrontId castOther = (TFrontId) other;

        return ((this.getFrontid() == castOther.getFrontid()) || (this.getFrontid() != null
                && castOther.getFrontid() != null && this
                .getFrontid()
                .equals(
                        castOther
                                .getFrontid())))
                && ((this.getFrontname() == castOther.getFrontname()) || (this.getFrontname() != null
                && castOther.getFrontname() != null && this
                .getFrontname()
                .equals(
                        castOther
                                .getFrontname())))
                && ((this.getIp() == castOther.getIp()) || (this.getIp() != null
                && castOther.getIp() != null && this
                .getIp()
                .equals(
                        castOther
                                .getIp())))
                && ((this.getDrtpport() == castOther.getDrtpport()) || (this.getDrtpport() != null
                && castOther.getDrtpport() != null && this
                .getDrtpport()
                .equals(
                        castOther
                                .getDrtpport())))
                && ((this.getDrtpnode() == castOther.getDrtpnode()) || (this.getDrtpnode() != null
                && castOther.getDrtpnode() != null && this
                .getDrtpnode()
                .equals(
                        castOther
                                .getDrtpnode())))
                && ((this.getBccmainfuncno() == castOther.getBccmainfuncno()) || (this.getBccmainfuncno() != null
                && castOther
                .getBccmainfuncno() != null && this
                .getBccmainfuncno()
                .equals(
                        castOther
                                .getBccmainfuncno())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getFrontid() == null ? 0 : this.getFrontid().hashCode());
        result = 37 * result + (getFrontname() == null ? 0 : this.getFrontname().hashCode());
        result = 37 * result + (getIp() == null ? 0 : this.getIp().hashCode());
        result = 37 * result + (getDrtpport() == null ? 0 : this.getDrtpport().hashCode());
        result = 37 * result + (getDrtpnode() == null ? 0 : this.getDrtpnode().hashCode());
        result = 37 * result + (getBccmainfuncno() == null ? 0 : this.getBccmainfuncno().hashCode());
        return result;
    }

}