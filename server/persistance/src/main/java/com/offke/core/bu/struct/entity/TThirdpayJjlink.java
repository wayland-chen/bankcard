package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


/**
 * TThirdpayJjlink entity.
 */
@Entity
@Table(name = "T_THIRDPAY_JJLINK")
public class TThirdpayJjlink implements java.io.Serializable {

    // Fields    

    private Long ecardId;
    private String requestTime;
    private String ecardNum;
    private String username;
    private String fullname;
    private BigDecimal amount;
    private Integer ecardMachineId;
    private String ecardIp;
    private String inpayamountId;
    private String replyTime;
    private String ackTime;
    private String status;
    private String updateTime;
    private Integer checkNum;

    // Constructors

    /**
     * default constructor
     */
    public TThirdpayJjlink() {
    }

    /**
     * minimal constructor
     */
    public TThirdpayJjlink(Long ecardId) {
        this.ecardId = ecardId;
    }

    /**
     * full constructor
     */
    public TThirdpayJjlink(
            Long ecardId,
            String requestTime,
            String ecardNum,
            String username,
            String fullname,
            BigDecimal amount,
            Integer ecardMachineId,
            String ecardIp,
            String inpayamountId,
            String replyTime,
            String ackTime,
            String status,
            String updateTime,
            Integer checkNum) {
        this.ecardId = ecardId;
        this.requestTime = requestTime;
        this.ecardNum = ecardNum;
        this.username = username;
        this.fullname = fullname;
        this.amount = amount;
        this.ecardMachineId = ecardMachineId;
        this.ecardIp = ecardIp;
        this.inpayamountId = inpayamountId;
        this.replyTime = replyTime;
        this.ackTime = ackTime;
        this.status = status;
        this.updateTime = updateTime;
        this.checkNum = checkNum;
    }

    // Property accessors
    @Id
    @Column(name = "ECARD_ID", unique = true, nullable = false, precision = 14, scale = 0)
    public Long getEcardId() {
        return this.ecardId;
    }

    public void setEcardId(Long ecardId) {
        this.ecardId = ecardId;
    }

    @Column(name = "REQUEST_TIME", length = 20)
    public String getRequestTime() {
        return this.requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    @Column(name = "ECARD_NUM", length = 20)
    public String getEcardNum() {
        return this.ecardNum;
    }

    public void setEcardNum(String ecardNum) {
        this.ecardNum = ecardNum;
    }

    @Column(name = "USERNAME", length = 50)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "FULLNAME", length = 50)
    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "ECARD_MACHINE_ID")
    public Integer getEcardMachineId() {
        return this.ecardMachineId;
    }

    public void setEcardMachineId(Integer ecardMachineId) {
        this.ecardMachineId = ecardMachineId;
    }

    @Column(name = "ECARD_IP", length = 20)
    public String getEcardIp() {
        return this.ecardIp;
    }

    public void setEcardIp(String ecardIp) {
        this.ecardIp = ecardIp;
    }

    @Column(name = "INPAYAMOUNT_ID", length = 30)
    public String getInpayamountId() {
        return this.inpayamountId;
    }

    public void setInpayamountId(String inpayamountId) {
        this.inpayamountId = inpayamountId;
    }

    @Column(name = "REPLY_TIME", length = 20)
    public String getReplyTime() {
        return this.replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    @Column(name = "ACK_TIME", length = 20)
    public String getAckTime() {
        return this.ackTime;
    }

    public void setAckTime(String ackTime) {
        this.ackTime = ackTime;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "UPDATE_TIME", length = 20)
    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "CHECK_NUM")
    public Integer getCheckNum() {
        return this.checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

}