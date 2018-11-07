package com.ehootu.flow.model;

import java.util.Date;

/**
 * @Title:OutResultList
 * @Author: KongXiaoPing
 * @Date: 2018-01-11 10:35
 * @Description: 输出 办事结果对象
 */
public class OutResultList {
    private String id;
    /**
     * 登录人id
     */
    private String userId;
    /**
     * 警察id
     */
    private String policeId;
    /**
     * 户籍类型 4 夫妻投靠 5 新生儿 6 户籍注销
     * 流动人口类型（1-出租、2-建筑工地人员，3-企业单位）
     */
    private Integer type;
    /**
     * 登记时间
     */
    private Date inputTime;

    /**
     * 审核状态(0未审核，1驳回,2审核通过)
     */
    private Integer approvalStatus;

    /**
     * 编号
     */
    private String acceptNumber;
    /**
     * 审核日期
     */
    private Date approvalime;
    /**
     * 审核意见
     */
    private String approvalSuggestion;

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getAcceptNumber() {
        return acceptNumber;
    }

    public void setAcceptNumber(String acceptNumber) {
        this.acceptNumber = acceptNumber;
    }

    public Date getApprovalime() {
        return approvalime;
    }

    public void setApprovalime(Date approvalime) {
        this.approvalime = approvalime;
    }

    public String getApprovalSuggestion() {
        return approvalSuggestion;
    }

    public void setApprovalSuggestion(String approvalSuggestion) {
        this.approvalSuggestion = approvalSuggestion;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
    }

    @Override
    public String toString() {
        return "OutResultList{" +
                "id=" + id +
                ", userId=" + userId +
                ", policeId=" + policeId +
                ", type=" + type +
                ", inputTime=" + inputTime +
                ", approvalStatus=" + approvalStatus +
                ", acceptNumber='" + acceptNumber + '\'' +
                ", approvalime=" + approvalime +
                ", approvalSuggestion='" + approvalSuggestion + '\'' +
                '}';
    }
}