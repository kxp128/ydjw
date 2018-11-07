package com.ehootu.rural.model;

import com.ehootu.dictionary.model.SysDictionary;

import java.io.Serializable;
import java.util.Date;


/**
 * 社情民意工作记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class SocialWorkRecordEntity implements Serializable {


	private static final long serialVersionUID = 131435874929129500L;
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
	 * 收集时间
	 */
	private Date collectionTime;
	/**
	 * 收集地点
	 */
	private String collectionSite;
	/**
	 * 收集人员
	 */
	private String collector;
	/**
	 * 收集对象
	 */
	private String collectionObjects;
	/**
	 * 调查内容
	 */
	private String surveyContent;
	/**
	 * 收集内容
	 */
	private String collectionContent;
	/**
	 * 上报时间
	 */
	private Date reportingTime;
    /**
	 * 上报对象
	 */
	private String reportedObject;
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
	 * 警察id
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

	/************ 页面展示字段 **************/
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
	 * 设置：调查内容
	 */
	public void setSurveyContent(String surveyContent) {
		this.surveyContent = surveyContent;
	}
	/**
	 * 获取：调查内容
	 */
	public String getSurveyContent() {
		return surveyContent;
	}
	/**
	 * 设置：收集时间
	 */
	public void setCollectionTime(Date collectionTime) {
		this.collectionTime = collectionTime;
	}
	/**
	 * 获取：收集时间
	 */
	public Date getCollectionTime() {
		return collectionTime;
	}
	/**
	 * 设置：收集地点
	 */
	public void setCollectionSite(String collectionSite) {
		this.collectionSite = collectionSite;
	}
	/**
	 * 获取：收集地点
	 */
	public String getCollectionSite() {
		return collectionSite;
	}
	/**
	 * 设置：收集人员
	 */
	public void setCollector(String collector) {
		this.collector = collector;
	}
	/**
	 * 获取：收集人员
	 */
	public String getCollector() {
		return collector;
	}
	/**
	 * 设置：收集对象
	 */
	public void setCollectionObjects(String collectionObjects) {
		this.collectionObjects = collectionObjects;
	}
	/**
	 * 获取：收集对象
	 */
	public String getCollectionObjects() {
		return collectionObjects;
	}
	/**
	 * 设置：收集内容
	 */
	public void setCollectionContent(String collectionContent) {
		this.collectionContent = collectionContent;
	}
	/**
	 * 获取：收集内容
	 */
	public String getCollectionContent() {
		return collectionContent;
	}
	/**
	 * 设置：上报时间
	 */
	public void setReportingTime(Date reportingTime) {
		this.reportingTime = reportingTime;
	}
	/**
	 * 获取：上报时间
	 */
	public Date getReportingTime() {
		return reportingTime;
	}
	/**
	 * 设置：上报对象
	 */
	public void setReportedObject(String reportedObject) {
		this.reportedObject = reportedObject;
	}
	/**
	 * 获取：上报对象
	 */
	public String getReportedObject() {
		return reportedObject;
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
