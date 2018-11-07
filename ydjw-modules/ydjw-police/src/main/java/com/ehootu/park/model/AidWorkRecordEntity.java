package com.ehootu.park.model;

import java.io.Serializable;
import java.util.Date;



/**
 * 困难帮扶工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:49
 */
public class AidWorkRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//所属派出所
	private String policeStation;
	//所属警务室
	private String policeOffice;
	//帮扶地点
	private String helpingLocation;
	//帮扶人
	private String helpingPeople;
	// 帮扶对象
	private String helpingObject;
	//帮扶时间
	private Date helpingTime;
	//帮扶措施
	private String helpingMeasures;
	//帮扶结果
	private String helpingResults;
	//工作照片
	private String workingPicture;
	//闪存平台(第三方链接)
	private String flashMemoryPlatform;
	//警察id
	private String policeId;
	//添加时间
	private Date date;
	//通用信息
	private String publicId;

	private PublicInformationEntity publicInformation;

	private String taskId;
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
	 * 设置：帮扶时间
	 */
	public void setHelpingTime(Date helpingTime) {
		this.helpingTime = helpingTime;
	}
	/**
	 * 获取：帮扶时间
	 */
	public Date getHelpingTime() {
		return helpingTime;
	}
	/**
	 * 设置：帮扶地点
	 */
	public void setHelpingLocation(String helpingLocation) {
		this.helpingLocation = helpingLocation;
	}
	/**
	 * 获取：帮扶地点
	 */
	public String getHelpingLocation() {
		return helpingLocation;
	}
	/**
	 * 设置：帮扶人
	 */
	public void setHelpingPeople(String helpingPeople) {
		this.helpingPeople = helpingPeople;
	}
	/**
	 * 获取：帮扶人
	 */
	public String getHelpingPeople() {
		return helpingPeople;
	}
	/**
	 * 获取：帮扶对象
	 */
	public String getHelpingObject() {
		return helpingObject;
	}
	/**
	 * 设置：帮扶对象
	 */
	public void setHelpingObject(String helpingObject) {
		this.helpingObject = helpingObject;
	}
	/**
	 * 设置：帮扶措施
	 */
	public void setHelpingMeasures(String helpingMeasures) {
		this.helpingMeasures = helpingMeasures;
	}
	/**
	 * 获取：帮扶措施
	 */
	public String getHelpingMeasures() {
		return helpingMeasures;
	}
	/**
	 * 设置：帮扶结果
	 */
	public void setHelpingResults(String helpingResults) {
		this.helpingResults = helpingResults;
	}
	/**
	 * 获取：帮扶结果
	 */
	public String getHelpingResults() {
		return helpingResults;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
