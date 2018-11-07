package com.ehootu.census.model;

import java.util.Date;

/**
 * @Author: KongXiaoPing
 * @Date: 2018/1/8  13:24
 * @Description: 设置审核流程实体
 */
public class CensusApprovalSet {
    private String id;
    /**
     * 审核内容(1 户籍办理审批  2 流动人口办理审批。)
     */
    private Integer approvalSetContent;
    /**
     * 审核层级(1 指1级，2  指2级...)
     */
    private Integer approvalSetTier;
    /**
     * 审核级别(1 当前为第一阶段  2 当前为第二阶段...)
     */
    private Integer approvalSetLevel;
    /**
     * 审核人员
     */
    private String approvalSetPerson;
    /**
     * 编号
     */
    private String approvalSetNumber;
    /**
     * 所属派出所
     */
    private String policeStation;
    /**
     * 所属警务室
     */
    private String policeOffice;
    /**
     * 所属工作站
     */
    private String workStation;
    /**
     * 所属行政区划
     */
    private String administrativeDivision;
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
    /**
     * 预留字段
     */
    private String spareField1;

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public Integer getApprovalSetContent() {
        return approvalSetContent;
    }

    public void setApprovalSetContent(Integer approvalSetContent) {
        this.approvalSetContent = approvalSetContent;
    }

    public Integer getApprovalSetTier() {
        return approvalSetTier;
    }

    public void setApprovalSetTier(Integer approvalSetTier) {
        this.approvalSetTier = approvalSetTier;
    }

    public Integer getApprovalSetLevel() {
        return approvalSetLevel;
    }

    public void setApprovalSetLevel(Integer approvalSetLevel) {
        this.approvalSetLevel = approvalSetLevel;
    }

    public String getApprovalSetPerson() {
        return approvalSetPerson;
    }

    public void setApprovalSetPerson(String approvalSetPerson) {
        this.approvalSetPerson = approvalSetPerson == null ? null : approvalSetPerson.trim();
    }

    public String getApprovalSetNumber() {
        return approvalSetNumber;
    }

    public void setApprovalSetNumber(String approvalSetNumber) {
        this.approvalSetNumber = approvalSetNumber == null ? null : approvalSetNumber.trim();
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation == null ? null : policeStation.trim();
    }

    public String getPoliceOffice() {
        return policeOffice;
    }

    public void setPoliceOffice(String policeOffice) {
        this.policeOffice = policeOffice == null ? null : policeOffice.trim();
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation == null ? null : workStation.trim();
    }

    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(String administrativeDivision) {
        this.administrativeDivision = administrativeDivision == null ? null : administrativeDivision.trim();
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

    public String getSpareField1() {
        return spareField1;
    }

    public void setSpareField1(String spareField1) {
        this.spareField1 = spareField1 == null ? null : spareField1.trim();
    }
}