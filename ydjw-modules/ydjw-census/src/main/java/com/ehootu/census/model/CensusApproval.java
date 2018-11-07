package com.ehootu.census.model;

import java.util.Date;
/**
 * @Author: KongXiaoPing
 * @Date: 2017/12/28  10:27
 * @Description: 户籍审核表
 */
public class CensusApproval {

    private String id;
    /**
     * 户籍登记表id
     */
    private String censusRegisterId;
    /**
     * 受理编号
     */
    private String acceptNumber;
    /**
     * 办理类型
     */
    private String approvalType;
    /**
     * 办理地点
     */
    private String approvalPlace;
    /**
     * 审核阶段(0户政大厅，1治安大队,2领导)
     */
    private Integer approvalStage;
    /**
     * 审核状态(0未审核，1驳回,2审核通过 3 pc端初审通过)
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
    private Date appointmentDate;
    /**
     * 审核时间
     */
    private Date approvalTime;
    /**
     * 流动人口表id
     */
    private String personFlowId;
    /**
     * 警员id（操作人）
     */
    private String policeId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 删除标记1表示删除 0 表示未删除
     */
    private Integer deleteFlag;

    public CensusApproval() {
    }

    public CensusApproval(InputCensus inputCensus) {

        this.censusRegisterId = inputCensus.getCensusRegisterId();
        this.acceptNumber = inputCensus.getAcceptNumber();
        this.approvalType = inputCensus.getApprovalType();
        this.approvalPlace = inputCensus.getApprovalPlace();
//        this.approvalStage = inputCensus.getApprovalStage();
        this.approvalStatus = inputCensus.getApprovalStatus();
        this.ifSubmitSuperior = inputCensus.getIfSubmitSuperior();
        this.approvalSuggestion = inputCensus.getApprovalSuggestion();
//        this.appointmentDate = inputCensus.getAppointmentDate();
//        this.approvalTime = approvalTime;

    }

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getCensusRegisterId() {
        return censusRegisterId;
    }

    public void setCensusRegisterId(String censusRegisterId) {
        this.censusRegisterId = censusRegisterId;
    }

    public String getAcceptNumber() {
        return acceptNumber;
    }

    public void setAcceptNumber(String acceptNumber) {
        this.acceptNumber = acceptNumber == null ? null : acceptNumber.trim();
    }

    public String getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType == null ? null : approvalType.trim();
    }

    public String getApprovalPlace() {
        return approvalPlace;
    }

    public void setApprovalPlace(String approvalPlace) {
        this.approvalPlace = approvalPlace == null ? null : approvalPlace.trim();
    }

    public Integer getApprovalStage() {
        return approvalStage;
    }

    public void setApprovalStage(Integer approvalStage) {
        this.approvalStage = approvalStage;
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

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getPersonFlowId() {
        return personFlowId;
    }

    public void setPersonFlowId(String personFlowId) {
        this.personFlowId = personFlowId;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}