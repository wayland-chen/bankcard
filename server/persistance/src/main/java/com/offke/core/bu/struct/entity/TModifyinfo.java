package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TModifyinfo entity.
 */
@Entity
@Table(name = "T_MODIFYINFO")
public class TModifyinfo implements java.io.Serializable {

    // Fields    

    private TModifyinfoId id;
    private String modifydate;
    private String modifytime;
    private String opercode;

    // Constructors

    /**
     * default constructor
     */
    public TModifyinfo() {
    }

    /**
     * minimal constructor
     */
    public TModifyinfo(TModifyinfoId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TModifyinfo(TModifyinfoId id, String modifydate, String modifytime, String opercode) {
        this.id = id;
        this.modifydate = modifydate;
        this.modifytime = modifytime;
        this.opercode = opercode;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", nullable = false)),
            @AttributeOverride(name = "stuempno", column = @Column(name = "STUEMPNO", nullable = false, length = 20)),
            @AttributeOverride(name = "enrollno", column = @Column(name = "ENROLLNO", nullable = false, length = 30))})
    public TModifyinfoId getId() {
        return this.id;
    }

    public void setId(TModifyinfoId id) {
        this.id = id;
    }

    @Column(name = "MODIFYDATE", length = 8)
    public String getModifydate() {
        return this.modifydate;
    }

    public void setModifydate(String modifydate) {
        this.modifydate = modifydate;
    }

    @Column(name = "MODIFYTIME", length = 6)
    public String getModifytime() {
        return this.modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

}