package com.ehootu.flow.model;

import java.util.Date;
/**
 * @Author: KongXiaoPing
 * @Date: 2017/9/21  11:38
 * @Description: 审核实体
 */
public class Approval {
    private String id;

    /**
     * 流动人口业务表id
     */
    private String personFlowId;
    /**
     * 受理编号
     */
    private String acceptNumber;
    /**
     * 审核状态(0未审核，1驳回,2审核通过)
     */
    private Integer approvalStatus;
    /**
     * 是否提交上级，0-否；1-是
     */
    private Integer ifSubmitSuperior;
    /**
     * 审核意见
     */
    private String approvalSuggestion;
    /**
     * 预约日期（保留字段，目前不用）
     */
    private String appointmentDate;
    /**
     * 审核时间
     */
    private Date approvalTime;
    /**
     * 警员id（操作人）
     */
    private String policeId;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 是否发红包(0 否 1 是 )
     */
    private Integer ifSendRedPacket;
    /**
     * 留言
     */
    private String leaveMessage;
    /**
     * 红包金额
     */
    private String redPacketMoney;


    public Approval() {
    }

    public Approval(InputPersonFlow inputPersonFlow) {

        this.personFlowId = inputPersonFlow.getPersonFlowId();
        this.acceptNumber = inputPersonFlow.getAcceptNumber();
        this.approvalStatus = inputPersonFlow.getApprovalStatus();
//        this.ifSubmitSuperior = inputPersonFlow.getIfSubmitSuperior();
        this.approvalSuggestion = inputPersonFlow.getApprovalSuggestion();
//        this.appointmentDate = inputPersonFlow.getAppointmentDate();
//        this.approvalTime = inputPersonFlow.getApprovalTime();
        this.policeId = inputPersonFlow.getPoliceId();
        this.leaveMessage = inputPersonFlow.getLeaveMessage();
        this.redPacketMoney = inputPersonFlow.getRedPacketMoney();

    }

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getPersonFlowId() {
        return personFlowId;
    }

    public void setPersonFlowId(String personFlowId) {
        this.personFlowId = personFlowId;
    }

    public String getAcceptNumber() {
        return acceptNumber;
    }

    public void setAcceptNumber(String acceptNumber) {
        this.acceptNumber = acceptNumber == null ? null : acceptNumber.trim();
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getIfSubmitSuperior() {
        return ifSubmitSuperior;
    }

    public void setIfSubmitSuperior(Integer ifSubmitSuperior) {
        this.ifSubmitSuperior = ifSubmitSuperior;
    }

    public String getApprovalSuggestion() {
        return approvalSuggestion;
    }

    public void setApprovalSuggestion(String approvalSuggestion) {
        this.approvalSuggestion = approvalSuggestion == null ? null : approvalSuggestion.trim();
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate == null ? null : appointmentDate.trim();
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIfSendRedPacket() {
        return ifSendRedPacket;
    }

    public void setIfSendRedPacket(Integer ifSendRedPacket) {
        this.ifSendRedPacket = ifSendRedPacket;
    }

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage == null ? null : leaveMessage.trim();
    }

    public String getRedPacketMoney() {
        return redPacketMoney;
    }

    public void setRedPacketMoney(String redPacketMoney) {
        this.redPacketMoney = redPacketMoney == null ? null : redPacketMoney.trim();
    }
}