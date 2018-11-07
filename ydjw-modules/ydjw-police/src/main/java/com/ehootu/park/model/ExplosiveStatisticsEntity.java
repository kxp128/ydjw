package com.ehootu.park.model;

import java.io.Serializable;
import java.util.Date;



/**
 * 爆炸物基本情况登记表
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:39
 */
public class ExplosiveStatisticsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//所属派出所
	private String policeStation;
	//所属警务室
	private String policeOffice;
	//爆炸物品管理负责人
	private String explosivesIncharge;
	//爆炸物品种类
	private String explosivesType;
	//管理人员
	private String stockman;
	//安保措施
	private String securityMeasures;
	//处罚记录
	private String penaltyRecord;
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
	 * 设置：爆炸物品管理负责人
	 */
	public void setExplosivesIncharge(String explosivesIncharge) {
		this.explosivesIncharge = explosivesIncharge;
	}
	/**
	 * 获取：爆炸物品管理负责人
	 */
	public String getExplosivesIncharge() {
		return explosivesIncharge;
	}
	/**
	 * 设置：爆炸物品种类
	 */
	public void setExplosivesType(String explosivesType) {
		this.explosivesType = explosivesType;
	}
	/**
	 * 获取：爆炸物品种类
	 */
	public String getExplosivesType() {
		return explosivesType;
	}
	/**
	 * 设置：管理人员
	 */
	public void setStockman(String stockman) {
		this.stockman = stockman;
	}
	/**
	 * 获取：管理人员
	 */
	public String getStockman() {
		return stockman;
	}
	/**
	 * 设置：安保措施
	 */
	public void setSecurityMeasures(String securityMeasures) {
		this.securityMeasures = securityMeasures;
	}
	/**
	 * 获取：安保措施
	 */
	public String getSecurityMeasures() {
		return securityMeasures;
	}
	/**
	 * 设置：处罚记录
	 */
	public void setPenaltyRecord(String penaltyRecord) {
		this.penaltyRecord = penaltyRecord;
	}
	/**
	 * 获取：处罚记录
	 */
	public String getPenaltyRecord() {
		return penaltyRecord;
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
