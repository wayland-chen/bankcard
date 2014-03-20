package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TOperauth entity.
 */
@Entity
@Table(name = "T_OPERAUTH")
public class TOperauth implements java.io.Serializable {

    // Fields    

    private TOperauthId id;
    private String authorizer;
    private String authdate;

    // Constructors

    /**
     * default constructor
     */
    public TOperauth() {
    }

    /**
     * minimal constructor
     */
    public TOperauth(TOperauthId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TOperauth(TOperauthId id, String authorizer, String authdate) {
        this.id = id;
        this.authorizer = authorizer;
        this.authdate = authdate;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "opercode", column = @Column(name = "OPERCODE", nullable = false, length = 8)),
            @AttributeOverride(name = "authtype", column = @Column(name = "AUTHTYPE", nullable = false))})
    public TOperauthId getId() {
        return this.id;
    }

    public void setId(TOperauthId id) {
        this.id = id;
    }

    @Column(name = "AUTHORIZER", length = 8)
    public String getAuthorizer() {
        return this.authorizer;
    }

    public void setAuthorizer(String authorizer) {
        this.authorizer = authorizer;
    }

    @Column(name = "AUTHDATE", length = 8)
    public String getAuthdate() {
        return this.authdate;
    }

    public void setAuthdate(String authdate) {
        this.authdate = authdate;
    }

}