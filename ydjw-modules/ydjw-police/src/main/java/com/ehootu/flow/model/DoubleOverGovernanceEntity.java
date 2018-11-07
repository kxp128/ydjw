package com.ehootu.flow.model;

import com.ehootu.park.model.PublicInformationEntity;

import java.io.Serializable;
import java.util.Date;


/**
 * 流动警务室建筑工地双超治理情况记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class DoubleOverGovernanceEntity implements Serializable {


	private static final long serialVersionUID = -1407025364212844367L;
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
	 * 工地名称
	 */
	private String siteName;
    /**
	 * 检查时间
	 */
	private Date inspectionTime;
    /**
	 * 检查人员姓名
	 */
	private String inspectionName;
    /**
	 * 检查方式
	 */
	private String inspectionMode;
    /**
	 * 发现问题
	 */
	private String discoverProblems;
    /**
	 * 处理结果
	 */
	private String treatmentResult;
    /**
	 * 四巡平台(第三方链接)
	 */
	private String fourPatrolPlatform;
    /**
	 * 闪存平台(第三方链接)
	 */
	private String flashMemoryPlatform;
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
	 * 任务 id
	 */
	private String taskId;
    /**
	 * 检查人员（警察）id
	 */
	private String checkPoliceId;
    /**
	 * 企业公共信息表id
	 */
	private String publicId;

	/**************** 页面展示字段 *******************/
	private PublicInformationEntity publicInformation;

	public PublicInformationEntity getPublicInformation() {
		return publicInformation;
	}

	public void setPublicInformation(PublicInformationEntity publicInformation) {
		this.publicInformation = publicInformation;
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
	 * 设置：工地名称
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**
	 * 获取：工地名称
	 */
	public String getSiteName() {
		return siteName;
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
	public void setInspectionName(String inspectionName) {
		this.inspectionName = inspectionName;
	}
	/**
	 * 获取：检查人员
	 */
	public String getInspectionName() {
		return inspectionName;
	}
	/**
	 * 设置：检查方式
	 */
	public void setInspectionMode(String inspectionMode) {
		this.inspectionMode = inspectionMode;
	}
	/**
	 * 获取：检查方式
	 */
	public String getInspectionMode() {
		return inspectionMode;
	}
	/**
	 * 设置：发现问题
	 */
	public void setDiscoverProblems(String discoverProblems) {
		this.discoverProblems = discoverProblems;
	}
	/**
	 * 获取：发现问题
	 */
	public String getDiscoverProblems() {
		return discoverProblems;
	}
	/**
	 * 设置：处理结果
	 */
	public void setTreatmentResult(String treatmentResult) {
		this.treatmentResult = treatmentResult;
	}
	/**
	 * 获取：处理结果
	 */
	public String getTreatmentResult() {
		return treatmentResult;
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
	/**
	 * 设置：检查人员（警察）id
	 */
	public void setCheckPoliceId(String checkPoliceId) {
		this.checkPoliceId = checkPoliceId;
	}
	/**
	 * 获取：检查人员（警察）id
	 */
	public String getCheckPoliceId() {
		return checkPoliceId;
	}
	/**
	 * 设置：企业公共信息表id
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	/**
	 * 获取：企业公共信息表id
	 */
	public String getPublicId() {
		return publicId;
	}
}
