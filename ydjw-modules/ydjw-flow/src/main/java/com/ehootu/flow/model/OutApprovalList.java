package com.ehootu.flow.model;

import java.util.Date;

/**
 * @Title:OutApprovalList
 * @Author: KongXiaoPing
 * @Date: 2018-01-09 16:50
 * @Description: 警察app列表展示审核列表实体（包括流动人口和户籍业务）
 */
public class OutApprovalList {
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 户籍类型 4 夫妻投靠 5 新生儿 6 户籍注销
     * 流动人口类型（1-出租、2-建筑工地人员，3-企业单位）
     */
    private Integer type;
    /**
     * 登记时间
     */
    private Date dateInputTime;
    /**
     * 登记时间 返回给前端的时间
     */
    private String inputTime;
    /**
     * 审核状态(0未审核，1驳回,2审核通过)
     */
    private Integer approvalStatus;
    /**
     * 审核时间
     */
    private Date dateApprovalTime;
    /**
     * 审核时间  返回给前端的时间
     */
    private String approvalTime;
    /**
     * 当前审核阶段(0户政大厅，1治安大队,2领导)
     */
    private Integer approvalStage;

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getDateInputTime() {
        return dateInputTime;
    }

    public void setDateInputTime(Date dateInputTime) {
        this.dateInputTime = dateInputTime;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Date getDateApprovalTime() {
        return dateApprovalTime;
    }

    public void setDateApprovalTime(Date dateApprovalTime) {
        this.dateApprovalTime = dateApprovalTime;
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public Integer getApprovalStage() {
        return approvalStage;
    }

    public void setApprovalStage(Integer approvalStage) {
        this.approvalStage = approvalStage;
    }

    @Override
    public String toString() {
        return "OutApprovalList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", dateInputTime=" + dateInputTime +
                ", inputTime='" + inputTime + '\'' +
                ", approvalStatus=" + approvalStatus +
                ", dateApprovalTime=" + dateApprovalTime +
                ", approvalTime='" + approvalTime + '\'' +
                ", approvalStage=" + approvalStage +
                '}';
    }
}