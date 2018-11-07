package com.ehootu.rural.model;

import com.ehootu.dictionary.model.SysDictionary;

import java.io.Serializable;
import java.util.Date;


/**
 * 农村道路交通管理工作记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class TrafficControlEntity implements Serializable {


	private static final long serialVersionUID = -4547379763646539081L;
	/**
	 * id
	 */
	private String id;
    /**
	 * 所属派出所
	 */
	private String policeStation;
    /**
	 * 所属工作站
	 */
	private String policeWorkstation;
    /**
	 * 管理项目
	 */
	private String managementProject;
    /**
	 * 工作时间
	 */
	private Date workingHours;
    /**
	 * 工作人员
	 */
	private String personnel;
    /**
	 * 工作结果
	 */
	private String workingResults;
    /**
	 * 四巡平台(第三方链接)
	 */
	private String fourPatrolPlatform;
    /**
	 * 工作照片
	 */
	private String workingPicture;
    /**
	 * 登记人员(警察)id
	 */
	private String policeId;
    /**
	 * 添加时间
	 */
	private Date createTime;
    /**
	 * 任务id
	 */
	private String taskId;

	/********** 页面展示字段 ************/
	private SysDictionary sysDictionary;

	public SysDictionary getSysDictionary() {
		return sysDictionary;
	}

	public void setSysDictionary(SysDictionary sysDictionary) {
		this.sysDictionary = sysDictionary;
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
	 * 设置：工作时间
	 */
	public void setWorkingHours(Date workingHours) {
		this.workingHours = workingHours;
	}
	/**
	 * 获取：工作时间
	 */
	public Date getWorkingHours() {
		return workingHours;
	}
	/**
	 * 设置：工作人员
	 */
	public void setPersonnel(String personnel) {
		this.personnel = personnel;
	}
	/**
	 * 获取：工作人员
	 */
	public String getPersonnel() {
		return personnel;
	}
	/**
	 * 设置：工作结果
	 */
	public void setWorkingResults(String workingResults) {
		this.workingResults = workingResults;
	}
	/**
	 * 获取：工作结果
	 */
	public String getWorkingResults() {
		return workingResults;
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
	 * 设置：登记人员(警察)id
	 */
	public void setPoliceId(String policeId) {
		this.policeId = policeId;
	}
	/**
	 * 获取：登记人员(警察)id
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
	 * 设置：任务id
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	/**
	 * 获取：任务id
	 */
	public String getTaskId() {
		return taskId;
	}
}
