package com.ehootu.rural.model;

import com.ehootu.park.model.PublicInformationEntity;

import java.io.Serializable;
import java.util.Date;


/**
 * 旅店、网吧实名管理工作记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class RealNameManagementEntity implements Serializable {


	private static final long serialVersionUID = -683255889744418090L;
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
	 * 检查人姓名
	 */
	private String examiner;
    /**
	 * 检查时间
	 */
	private Date inspectionTime;
    /**
	 * 检查地点
	 */
	private String inspectionPlace;
    /**
	 * 检查内容
	 */
	private String inspectionContent;
    /**
	 * 检查情况
	 */
	private String inspectionStatus;
    /**
	 * 处罚情况
	 */
	private String penalties;
    /**
	 * 抓捕嫌疑人情况
	 */
	private String arrestSuspects;
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
	 * 检查人员（警员）id，多个用，拼接
	 */
	private String checkPoliceId;
    /**
	 * 公共信息
	 */
	private String publicId;
    /**
	 * 记录填写人（警员）id
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
	 * 设置：检查内容
	 */
	public void setInspectionContent(String inspectionContent) {
		this.inspectionContent = inspectionContent;
	}
	/**
	 * 获取：检查内容
	 */
	public String getInspectionContent() {
		return inspectionContent;
	}
	/**
	 * 设置：检查情况
	 */
	public void setInspectionStatus(String inspectionStatus) {
		this.inspectionStatus = inspectionStatus;
	}
	/**
	 * 获取：检查情况
	 */
	public String getInspectionStatus() {
		return inspectionStatus;
	}
	/**
	 * 设置：处罚情况
	 */
	public void setPenalties(String penalties) {
		this.penalties = penalties;
	}
	/**
	 * 获取：处罚情况
	 */
	public String getPenalties() {
		return penalties;
	}
	/**
	 * 设置：抓捕嫌疑人情况
	 */
	public void setArrestSuspects(String arrestSuspects) {
		this.arrestSuspects = arrestSuspects;
	}
	/**
	 * 获取：抓捕嫌疑人情况
	 */
	public String getArrestSuspects() {
		return arrestSuspects;
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
	 * 设置：检查人员（警员）id，多个用，拼接
	 */
	public void setCheckPoliceId(String checkPoliceId) {
		this.checkPoliceId = checkPoliceId;
	}
	/**
	 * 获取：检查人员（警员）id，多个用，拼接
	 */
	public String getCheckPoliceId() {
		return checkPoliceId;
	}
	/**
	 * 设置：公共信息
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	/**
	 * 获取：公共信息
	 */
	public String getPublicId() {
		return publicId;
	}
	/**
	 * 设置：记录填写人（警员）id
	 */
	public void setPoliceId(String policeId) {
		this.policeId = policeId;
	}
	/**
	 * 获取：记录填写人（警员）id
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
}
