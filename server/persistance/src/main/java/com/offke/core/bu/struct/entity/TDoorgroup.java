package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDoorgroup entity.
 */
@Entity
@Table(name = "T_DOORGROUP")
public class TDoorgroup implements java.io.Serializable {

    // Fields    

    private Integer groupid;
    private String groupname;
    private String status;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoorgroup() {
    }

    /**
     * minimal constructor
     */
    public TDoorgroup(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * full constructor
     */
    public TDoorgroup(Integer groupid, String groupname, String status, String updatetime) {
        this.groupid = groupid;
        this.groupname = groupname;
        this.status = status;
        this.updatetime = updatetime;
    }

    // Property accessors
    @Id
    @Column(name = "GROUPID", unique = true, nullable = false)
    public Integer getGroupid() {
        return this.groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    @Column(name = "GROUPNAME", length = 60)
    public String getGroupname() {
        return this.groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "UPDATETIME", length = 30)
    public String getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

}