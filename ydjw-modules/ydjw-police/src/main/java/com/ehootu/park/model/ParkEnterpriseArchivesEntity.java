package com.ehootu.park.model;

import java.io.Serializable;
import java.util.Date;



/**
 * 园区企业档案
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:10
 */
public class ParkEnterpriseArchivesEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//所属派出所
	private String policeStation;
	//所属警务室
	private String policeOffice;
	//企业法人
	private String enterpriseLegalPerson;
	//企业内部组织及负责人
	private String enterpriseInternalOrganization;
	//安保力量
	private Integer securityForces;
	//从业人员
	private Integer employeeCount;
	//经营范围
	private String businessScope;
	//经营状况
	private String businessStatus;
	//星级评定
	private Integer judgeStart;
	//警察id
	private String policeId;
	//企业负责人电话
	private String phoneNumber;
	//是否发生群体上访（具体情况）0:表示是 , 1:表示否'
	private Integer petitionStatus;
	//添加时间
	private Date date;
	//上访详情
	private String petitionDetail;
	private String publicId;
	private String taskId;

	/******* 用于显示，非数据库字段 ********/
	private PublicInformationEntity publicInformation;
	//经营状况 名称
	private String businessStatusName;

	public String getBusinessStatusName() {
		return businessStatusName;
	}

	public void setBusinessStatusName(String businessStatusName) {
		this.businessStatusName = businessStatusName;
	}

	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	/**
	 * 设置：id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：所属派出所
	 */
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	/**
	 * 获取：所属派出所
	 */
	public String getPoliceStation() {
		return policeStation;
	}
	/**
	 * 设置：所属警务室
	 */
	public void setPoliceOffice(String policeOffice) {
		this.policeOffice = policeOffice;
	}
	/**
	 * 获取：所属警务室
	 */
	public String getPoliceOffice() {
		return policeOffice;
	}
	/**
	 * 设置：企业法人
	 */
	public void setEnterpriseLegalPerson(String enterpriseLegalPerson) {
		this.enterpriseLegalPerson = enterpriseLegalPerson;
	}
	/**
	 * 获取：企业法人
	 */
	public String getEnterpriseLegalPerson() {
		return enterpriseLegalPerson;
	}
	/**
	 * 设置：企业内部组织及负责人
	 */
	public void setEnterpriseInternalOrganization(String enterpriseInternalOrganization) {
		this.enterpriseInternalOrganization = enterpriseInternalOrganization;
	}
	/**
	 * 获取：企业内部组织及负责人
	 */
	public String getEnterpriseInternalOrganization() {
		return enterpriseInternalOrganization;
	}
	/**
	 * 设置：安保力量
	 */
	public void setSecurityForces(Integer securityForces) {
		this.securityForces = securityForces;
	}
	/**
	 * 获取：安保力量
	 */
	public Integer getSecurityForces() {
		return securityForces;
	}
	/**
	 * 设置：从业人员
	 */
	public void setEmployeeCount(Integer employeeCount) {
		this.employeeCount = employeeCount;
	}
	/**
	 * 获取：从业人员
	 */
	public Integer getEmployeeCount() {
		return employeeCount;
	}
	/**
	 * 设置：经营范围
	 */
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	/**
	 * 获取：经营范围
	 */
	public String getBusinessScope() {
		return businessScope;
	}
	/**
	 * 设置：经营状况
	 */
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}
	/**
	 * 获取：经营状况
	 */
	public String getBusinessStatus() {
		return businessStatus;
	}
	/**
	 * 设置：星级评定
	 */
	public void setJudgeStart(Integer judgeStart) {
		this.judgeStart = judgeStart;
	}
	/**
	 * 获取：星级评定
	 */
	public Integer getJudgeStart() {
		return judgeStart;
	}
	/**
	 * 设置：警察id
	 */
	public void setPoliceId(String policeId) {
		this.policeId = policeId;
	}
	/**
	 * 获取：警察id
	 */
	public String getPoliceId() {
		return policeId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Integer getPetitionStatus() {
		return petitionStatus;
	}
	public void setPetitionStatus(Integer petitionStatus) {
		this.petitionStatus = petitionStatus;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPetitionDetail() {
		return petitionDetail;
	}
	public void setPetitionDetail(String petitionDetail) {
		this.petitionDetail = petitionDetail;
	}
	public String getPublicId() {
		return publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public PublicInformationEntity getPublicInformation() {
		return publicInformation;
	}
	public void setPublicInformation(PublicInformationEntity publicInformation) {
		this.publicInformation = publicInformation;
	}
	
	
	
}
