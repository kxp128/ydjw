package com.ehootu.park.model;

import java.io.Serializable;
import java.util.Date;



/**
 * 企业内保工作检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:18
 */
public class EnterpriseInspectionRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//id
	private String id;
	//所属派出所
	private String policeStation;
	//所属警务室
	private String policeOffice;
	//内部组织机构
	private String enterpriseInternalOrganization;
	//内保负责人
	private String enterpriseIncharge;
	//内保负责人电话
	private String phoneNumber;
	//从业人员流动人口平台录入
	private String practitionersInput;
	//检查人员
	private String inspectors;
	//检查类别
	private String inspectionType;
	//检查时间
	private Date inspectionTime;
	//检查状态
	private String inspectionStatus;
	//整改发放
	private String rectificationAndDistribution;
	//依法查处
	private String investigate;
	//台账
	private String  standingBook;
	//图片
	private String workingPicture;
	//四巡平台(第三方链接)
	private String fourPatrolPlatform;
	//闪存平台(第三方链接)
	private String flashMemoryPlatform;
	//警察id
	private String policeId;
	//添加时间
	private Date date;
	//通用信息
	private String publicId;
	// 任务id
	private String taskId;

	/******* 用于显示，非数据库字段 ********/
	private PublicInformationEntity publicInformation;
	//检查类别
	private String inspectionTypeName;
	//检查人员
	private String inspectorsName;

	public String getInspectionTypeName() {
		return inspectionTypeName;
	}

	public String getInspectorsName() {
		return inspectorsName;
	}

	public void setInspectorsName(String inspectorsName) {
		this.inspectorsName = inspectorsName;
	}

	public void setInspectionTypeName(String inspectionTypeName) {
		this.inspectionTypeName = inspectionTypeName;
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
	 * 设置：内部组织机构
	 */
	public void setEnterpriseInternalOrganization(String enterpriseInternalOrganization) {
		this.enterpriseInternalOrganization = enterpriseInternalOrganization;
	}
	/**
	 * 获取：内部组织机构
	 */
	public String getEnterpriseInternalOrganization() {
		return enterpriseInternalOrganization;
	}
	/**
	 * 设置：内保负责人
	 */
	public void setEnterpriseIncharge(String enterpriseIncharge) {
		this.enterpriseIncharge = enterpriseIncharge;
	}
	/**
	 * 获取：内保负责人
	 */
	public String getEnterpriseIncharge() {
		return enterpriseIncharge;
	}
	/**
	 * 设置：从业人员流动人口平台录入
	 */
	public void setPractitionersInput(String practitionersInput) {
		this.practitionersInput = practitionersInput;
	}
	/**
	 * 获取：从业人员流动人口平台录入
	 */
	public String getPractitionersInput() {
		return practitionersInput;
	}
	/**
	 * 设置：检查类别
	 */
	public void setInspectionType(String inspectionType) {
		this.inspectionType = inspectionType;
	}
	/**
	 * 获取：检查类别
	 */
	public String getInspectionType() {
		return inspectionType;
	}
	/**
	 * 设置：检查时间
	 */
	public void setInspectionTime(Date inspectionTime) {
		this.inspectionTime = inspectionTime;
	}
	/**
	 * 获取：检查时间
	 */
	public Date getInspectionTime() {
		return inspectionTime;
	}
	/**
	 * 设置：检查人员
	 */
	public void setInspectors(String inspectors) {
		this.inspectors = inspectors;
	}
	/**
	 * 获取：检查人员
	 */
	public String getInspectors() {
		return inspectors;
	}
	/**
	 * 设置：检查状态
	 */
	public void setInspectionStatus(String inspectionStatus) {
		this.inspectionStatus = inspectionStatus;
	}
	/**
	 * 获取：检查状态
	 */
	public String getInspectionStatus() {
		return inspectionStatus;
	}
	/**
	 * 设置：整改发放
	 */
	public void setRectificationAndDistribution(String rectificationAndDistribution) {
		this.rectificationAndDistribution = rectificationAndDistribution;
	}
	/**
	 * 获取：整改发放
	 */
	public String getRectificationAndDistribution() {
		return rectificationAndDistribution;
	}
	/**
	 * 设置：依法查处
	 */
	public void setInvestigate(String investigate) {
		this.investigate = investigate;
	}
	/**
	 * 获取：依法查处
	 */
	public String getInvestigate() {
		return investigate;
	}
	/**
	 * 设置：四巡平台(第三方链接)
	 */
	public void setFourPatrolPlatform(String fourPatrolPlatform) {
		this.fourPatrolPlatform = fourPatrolPlatform;
	}
	/**
	 * 获取：四巡平台(第三方链接)
	 */
	public String getFourPatrolPlatform() {
		return fourPatrolPlatform;
	}
	/**
	 * 设置：闪存平台(第三方链接)
	 */
	public void setFlashMemoryPlatform(String flashMemoryPlatform) {
		this.flashMemoryPlatform = flashMemoryPlatform;
	}
	/**
	 * 获取：闪存平台(第三方链接)
	 */
	public String getFlashMemoryPlatform() {
		return flashMemoryPlatform;
	}
	/**
	 * 设置：图片
	 */
	public void setWorkingPicture(String workingPicture) {
		this.workingPicture = workingPicture;
	}
	/**
	 * 获取：图片
	 */
	public String getWorkingPicture() {
		return workingPicture;
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
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStandingBook() {
		return standingBook;
	}
	public void setStandingBook(String standingBook) {
		this.standingBook = standingBook;
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
	@Override
	public String toString() {
		return "EnterpriseInspectionRecordEntity [id=" + id + ", policeStation=" + policeStation + ", policeOffice="
				+ policeOffice + ", enterpriseInternalOrganization=" + enterpriseInternalOrganization
				+ ", enterpriseIncharge=" + enterpriseIncharge + ", practitionersInput=" + practitionersInput
				+ ", inspectionType=" + inspectionType + ", inspectionTime=" + inspectionTime + ", inspectors="
				+ inspectors + ", inspectionStatus=" + inspectionStatus + ", rectificationAndDistribution="
				+ rectificationAndDistribution + ", investigate=" + investigate + ", fourPatrolPlatform="
				+ fourPatrolPlatform + ", flashMemoryPlatform=" + flashMemoryPlatform + ", workingPicture="
				+ workingPicture + ", policeId=" + policeId + ", phoneNumber=" + phoneNumber + ", date=" + date
				+ ", standingBook=" + standingBook + ", publicId=" + publicId + "]";
	}
	
	
}
