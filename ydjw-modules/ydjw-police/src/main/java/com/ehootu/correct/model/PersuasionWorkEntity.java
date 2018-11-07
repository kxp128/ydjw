package com.ehootu.correct.model;

import com.ehootu.dictionary.model.SysDictionary;

import java.io.Serializable;
import java.util.Date;


/**
 * 心连心”心理疏导工作站工作记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class PersuasionWorkEntity implements Serializable {

	
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
	 * 工作内容
	 */
	private String workingContent;
    /**
	 * 工作时间
	 */
	private Date workingHours;
    /**
	 * 工作地点
	 */
	private String workingPlace;
    /**
	 * 工作人员
	 */
	private String personnel;
    /**
	 * 工作对象
	 */
	private String workingObject;
    /**
	 * 分级管理
	 */
	private String classifiedManagement;
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
	 * 设置：工作内容
	 */
	public void setWorkingContent(String workingContent) {
		this.workingContent = workingContent;
	}
	/**
	 * 获取：工作内容
	 */
	public String getWorkingContent() {
		return workingContent;
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
	 * 设置：工作地点
	 */
	public void setWorkingPlace(String workingPlace) {
		this.workingPlace = workingPlace;
	}
	/**
	 * 获取：工作地点
	 */
	public String getWorkingPlace() {
		return workingPlace;
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
	 * 设置：工作对象
	 */
	public void setWorkingObject(String workingObject) {
		this.workingObject = workingObject;
	}
	/**
	 * 获取：工作对象
	 */
	public String getWorkingObject() {
		return workingObject;
	}
	/**
	 * 设置：分级管理
	 */
	public void setClassifiedManagement(String classifiedManagement) {
		this.classifiedManagement = classifiedManagement;
	}
	/**
	 * 获取：分级管理
	 */
	public String getClassifiedManagement() {
		return classifiedManagement;
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
}
