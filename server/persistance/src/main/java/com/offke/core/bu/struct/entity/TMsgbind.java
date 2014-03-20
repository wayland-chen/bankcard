package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_MSGBIND")
public class TMsgbind implements java.io.Serializable {

    // Fields    

    private Integer id;
    private String tradecode;
    private Integer devtype;
    private String devmode;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TMsgbind() {
    }


    // Property accessors
    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 6, scale = 0)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "TRADECODE", nullable = false, length = 10)
    public String getTradecode() {
        return this.tradecode;
    }

    public void setTradecode(String tradecode) {
        this.tradecode = tradecode;
    }

    @Column(name = "DEVTYPE", nullable = false, precision = 6, scale = 0)
    public Integer getDevtype() {
        return this.devtype;
    }

    public void setDevtype(Integer devtype) {
        this.devtype = devtype;
    }

    @Column(name = "DEVMODE")
    public String getDevmode() {
        return this.devmode;
    }

    public void setDevmode(String devmode) {
        this.devmode = devmode;
    }

    @Column(name = "REMARK", length = 1024)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}