package com.ehootu.rural.model;

import com.ehootu.park.model.PublicInformationEntity;

import java.io.Serializable;
import java.util.Date;


/**
 * 治安重点工作记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class PeaceWorkEntity implements Serializable {


	private static final long serialVersionUID = -8696280103506756665L;
	/**
	 * id
	 */
	private String id;
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
	private String policeWorkstation;
    /**
	 * 管理项目
	 */
	private String managementProject;
    /**
	 * 检查时间
	 */
	private Date inspectionTime;
    /**
	 * 检查地点
	 */
	private String inspectionPlace;
    /**
	 * 检查人姓名
	 */
	private String examiner;
    /**
	 * 检查方式
	 */
	private String checkMode;
    /**
	 * 检查结果
	 */
	private String examinationResult;
    /**
	 * 处理情况
	 */
	private String treatmentSituation;
    /**
	 * 四巡平台(第三方链接)
	 */
	private String fourPatrolPlatform;
    /**
	 * 闪存平台(第三方链接)
	 */
	private String flashMemoryPlatform;
    /**
	 * 备注
	 */
	private String remarks;
    /**
	 * 工作照片
	 */
	private String workingPicture;
    /**
	 * 记录登记人员（警察）id
	 */
	private String policeId;
    /**
	 * 添加时间
	 */
	private Date createTime;
    /**
	 * 检查人员（警员）id，多个，拼接
	 */
	private String checkPoliceId;
    /**
	 * 企业信息公共表id
	 */
	private String publicId;
    /**
	 * 任务 id
	 */
	private String taskId;

	private PublicInformationEntity publicInformation;

	public PublicInformationEntity getPublicInformation() {
		return publicInformation;
	}

	public void setPublicInformation(PublicInformationEntity publicInformation) {
		this.publicInformation = publicInformation;
	}

	/** 管理项目 name。 用于页面显示 */
	private String managementProjectName;
	/** 检查方式 name。用于页面显示 */
	private String checkModeName;

	public String getManagementProjectName() {
		return managementProjectName;
	}
	public void setManagementProjectName(String managementProjectName) {
		this.managementProjectName = managementProjectName;
	}
	public String getCheckModeName() {
		return checkModeName;
	}
	public void setCheckModeName(String checkModeName) {
		this.checkModeName = checkModeName;
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
	 * 设置：所属工作站
	 */
	public void setPoliceWorkstation(String policeWorkstation) {
		this.policeWorkstation = policeWorkstation;
	}
	/**
	 * 获取：所属工作站
	 */
	public String getPoliceWorkstation() {
		return policeWorkstation;
	}
	/**
	 * 设置：管理项目
	 */
	public void setManagementProject(String managementProject) {
		this.managementProject = managementProject;
	}
	/**
	 * 获取：管理项目
	 */
	public String getManagementProject() {
		return managementProject;
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
	 * 设置：检查地点
	 */
	public void setInspectionPlace(String inspectionPlace) {
		this.inspectionPlace = inspectionPlace;
	}
	/**
	 * 获取：检查地点
	 */
	public String getInspectionPlace() {
		return inspectionPlace;
	}
	/**
	 * 设置：检查人
	 */
	public void setExaminer(String examiner) {
		this.examiner = examiner;
	}
	/**
	 * 获取：检查人
	 */
	public String getExaminer() {
		return examiner;
	}
	/**
	 * 设置：检查方式
	 */
	public void setCheckMode(String checkMode) {
		this.checkMode = checkMode;
	}
	/**
	 * 获取：检查方式
	 */
	public String getCheckMode() {
		return checkMode;
	}
	/**
	 * 设置：检查结果
	 */
	public void setExaminationResult(String examinationResult) {
		this.examinationResult = examinationResult;
	}
	/**
	 * 获取：检查结果
	 */
	public String getExaminationResult() {
		return examinationResult;
	}
	/**
	 * 设置：处理情况
	 */
	public void setTreatmentSituation(String treatmentSituation) {
		this.treatmentSituation = treatmentSituation;
	}
	/**
	 * 获取：处理情况
	 */
	public String getTreatmentSituation() {
		return treatmentSituation;
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
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置：工作照片
	 */
	public void setWorkingPicture(String workingPicture) {
		this.workingPicture = workingPicture;
	}
	/**
	 * 获取：工作照片
	 */
	public String getWorkingPicture() {
		return workingPicture;
	}
	/**
	 * 设置：记录登记人员（警察）id
	 */
	public void setPoliceId(String policeId) {
		this.policeId = policeId;
	}
	/**
	 * 获取：记录登记人员（警察）id
	 */
	public String getPoliceId() {
		return policeId;
	}
	/**
	 * 设置：添加时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：添加时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：检查人员（警员）id，多个，拼接
	 */
	public void setCheckPoliceId(String checkPoliceId) {
		this.checkPoliceId = checkPoliceId;
	}
	/**
	 * 获取：检查人员（警员）id，多个，拼接
	 */
	public String getCheckPoliceId() {
		return checkPoliceId;
	}
	/**
	 * 设置：企业信息公共表id
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	/**
	 * 获取：企业信息公共表id
	 */
	public String getPublicId() {
		return publicId;
	}
	/**
	 * 设置：任务 id
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	/**
	 * 获取：任务 id
	 */
	public String getTaskId() {
		return taskId;
	}
}
