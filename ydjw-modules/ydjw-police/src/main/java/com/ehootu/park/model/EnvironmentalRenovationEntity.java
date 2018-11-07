package com.ehootu.park.model;

import java.io.Serializable;
import java.util.Date;



/**
 * 园区企业周边环境整治
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:37
 */
public class EnvironmentalRenovationEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//所属派出所
	private String policeStation;
	//所属警务室
	private String policeOffice;
	//整治类别
	private String renovationCategory;
	//整治时间
	private Date renovationTime;
	//整治地点
	private String renovationSite;
	//整治对象
	private String renovationObject;
	//整治原因
	private String renovationReasons;
	//整治状况
	private String renovationSituation;
	//四巡平台(第三方链接)
	private String fourPatrolPlatform;
	//闪存平台(第三方链接)
	private String flashMemoryPlatform;
	//工作照片
	private String workingPicture;
	//警察id
	private String policeId;
	//添加时间
	private Date date;
	//通用信息
	private String publicId;
	// 任务id
	private String taskId;

	/*************** 页面展示字段 ********************/
	private PublicInformationEntity publicInformation;
	//整治类别
	private String renovationCategoryName;

	public String getRenovationCategoryName() {
		return renovationCategoryName;
	}

	public void setRenovationCategoryName(String renovationCategoryName) {
		this.renovationCategoryName = renovationCategoryName;
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
	 * 设置：整治类别
	 */
	public void setRenovationCategory(String renovationCategory) {
		this.renovationCategory = renovationCategory;
	}
	/**
	 * 获取：整治类别
	 */
	public String getRenovationCategory() {
		return renovationCategory;
	}
	/**
	 * 设置：整治时间
	 */
	public void setRenovationTime(Date renovationTime) {
		this.renovationTime = renovationTime;
	}
	/**
	 * 获取：整治时间
	 */
	public Date getRenovationTime() {
		return renovationTime;
	}
	/**
	 * 设置：整治地点
	 */
	public void setRenovationSite(String renovationSite) {
		this.renovationSite = renovationSite;
	}
	/**
	 * 获取：整治地点
	 */
	public String getRenovationSite() {
		return renovationSite;
	}
	/**
	 * 设置：整治对象
	 */
	public void setRenovationObject(String renovationObject) {
		this.renovationObject = renovationObject;
	}
	/**
	 * 获取：整治对象
	 */
	public String getRenovationObject() {
		return renovationObject;
	}
	/**
	 * 设置：整治原因
	 */
	public void setRenovationReasons(String renovationReasons) {
		this.renovationReasons = renovationReasons;
	}
	/**
	 * 获取：整治原因
	 */
	public String getRenovationReasons() {
		return renovationReasons;
	}
	/**
	 * 设置：整治状况
	 */
	public void setRenovationSituation(String renovationSituation) {
		this.renovationSituation = renovationSituation;
	}
	/**
	 * 获取：整治状况
	 */
	public String getRenovationSituation() {
		return renovationSituation;
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
