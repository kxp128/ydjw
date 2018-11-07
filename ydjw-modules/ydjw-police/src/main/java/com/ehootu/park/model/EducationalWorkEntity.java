package com.ehootu.park.model;

import java.io.Serializable;
import java.util.Date;



/**
 * 法制宣传教育工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:55
 */
public class EducationalWorkEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//所属派出所
	private String policeStation;
	//所谓警务室
	private String policeOffice;
	//宣传时间
	private Date publicityTime;
	//宣传地点
	private String publicityLocations;
	//宣传对象
	private String publicityObject;
	//宣传方式
	private String publicityMethod;
	//宣传内容
	private String publicityContent;
	//闪存平台(第三方链接)
	private String flashMemoryPlatform;
	//工作照片
	private String workingPicture;
	//警察id
	private String policeId;
	//添加时间
	private Date date;

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
	 * 设置：所谓警务室
	 */
	public void setPoliceOffice(String policeOffice) {
		this.policeOffice = policeOffice;
	}
	/**
	 * 获取：所谓警务室
	 */
	public String getPoliceOffice() {
		return policeOffice;
	}
	/**
	 * 设置：宣传时间
	 */
	public void setPublicityTime(Date publicityTime) {
		this.publicityTime = publicityTime;
	}
	/**
	 * 获取：宣传时间
	 */
	public Date getPublicityTime() {
		return publicityTime;
	}
	/**
	 * 设置：宣传地点
	 */
	public void setPublicityLocations(String publicityLocations) {
		this.publicityLocations = publicityLocations;
	}
	/**
	 * 获取：宣传地点
	 */
	public String getPublicityLocations() {
		return publicityLocations;
	}
	/**
	 * 设置：宣传对象
	 */
	public void setPublicityObject(String publicityObject) {
		this.publicityObject = publicityObject;
	}
	/**
	 * 获取：宣传对象
	 */
	public String getPublicityObject() {
		return publicityObject;
	}
	/**
	 * 设置：宣传方式
	 */
	public void setPublicityMethod(String publicityMethod) {
		this.publicityMethod = publicityMethod;
	}
	/**
	 * 获取：宣传方式
	 */
	public String getPublicityMethod() {
		return publicityMethod;
	}
	/**
	 * 设置：宣传内容
	 */
	public void setPublicityContent(String publicityContent) {
		this.publicityContent = publicityContent;
	}
	/**
	 * 获取：宣传内容
	 */
	public String getPublicityContent() {
		return publicityContent;
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

}
