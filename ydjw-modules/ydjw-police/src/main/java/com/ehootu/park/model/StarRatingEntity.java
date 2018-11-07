package com.ehootu.park.model;

import java.io.Serializable;
import java.util.Date;



/**
 * 园区企业星级评定
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:59
 */
public class StarRatingEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//所属派出所
	private String policeStation;
	//所属警务室
	private String policeOffice;
	//内保工作 得分
	private String internalSecurityScore;
	//内保工作 理由
	private String internalSecurityReason;
	//反恐防爆工作 得分
	private String explosionproofScore;
	//反恐防爆工作 理由
	private String explosionproofReason;
	//综治联防工作 得分
	private String jointDefenseScore;
	//综治联防工作 理由
	private String jointDefenseReason;
	//流动人口管理工作 得分
	private String managementScore;
	//流动人口管理工作 理由
	private String managementReason;
	//可防性案件 得分
	private String preventableScore;
	//可防性案件 理由
	private String preventableReason;
	//安全生产工作 得分
	private String productionScore;
	//安全生产工作 理由
	private String productionReason;
	//安全教育工作 得分
	private String educationScore;
	//安全教育工作 理由
	private String educationReason;
	//总分
	private String score;
	//星级评定
	private String judgeStart;
	//警察id
	private String policeId;
	//添加时间
	private Date date;
	//通用信息
	private String publicId;
	// 任务id
	private String taskId;

	private PublicInformationEntity publicInformation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	public String getPoliceOffice() {
		return policeOffice;
	}

	public void setPoliceOffice(String policeOffice) {
		this.policeOffice = policeOffice;
	}

	public String getInternalSecurityScore() {
		return internalSecurityScore;
	}

	public void setInternalSecurityScore(String internalSecurityScore) {
		this.internalSecurityScore = internalSecurityScore;
	}

	public String getInternalSecurityReason() {
		return internalSecurityReason;
	}

	public void setInternalSecurityReason(String internalSecurityReason) {
		this.internalSecurityReason = internalSecurityReason;
	}

	public String getExplosionproofScore() {
		return explosionproofScore;
	}

	public void setExplosionproofScore(String explosionproofScore) {
		this.explosionproofScore = explosionproofScore;
	}

	public String getExplosionproofReason() {
		return explosionproofReason;
	}

	public void setExplosionproofReason(String explosionproofReason) {
		this.explosionproofReason = explosionproofReason;
	}

	public String getJointDefenseScore() {
		return jointDefenseScore;
	}

	public void setJointDefenseScore(String jointDefenseScore) {
		this.jointDefenseScore = jointDefenseScore;
	}

	public String getJointDefenseReason() {
		return jointDefenseReason;
	}

	public void setJointDefenseReason(String jointDefenseReason) {
		this.jointDefenseReason = jointDefenseReason;
	}

	public String getManagementScore() {
		return managementScore;
	}

	public void setManagementScore(String managementScore) {
		this.managementScore = managementScore;
	}

	public String getManagementReason() {
		return managementReason;
	}

	public void setManagementReason(String managementReason) {
		this.managementReason = managementReason;
	}

	public String getPreventableScore() {
		return preventableScore;
	}

	public void setPreventableScore(String preventableScore) {
		this.preventableScore = preventableScore;
	}

	public String getPreventableReason() {
		return preventableReason;
	}

	public void setPreventableReason(String preventableReason) {
		this.preventableReason = preventableReason;
	}

	public String getProductionScore() {
		return productionScore;
	}

	public void setProductionScore(String productionScore) {
		this.productionScore = productionScore;
	}

	public String getProductionReason() {
		return productionReason;
	}

	public void setProductionReason(String productionReason) {
		this.productionReason = productionReason;
	}

	public String getEducationScore() {
		return educationScore;
	}

	public void setEducationScore(String educationScore) {
		this.educationScore = educationScore;
	}

	public String getEducationReason() {
		return educationReason;
	}

	public void setEducationReason(String educationReason) {
		this.educationReason = educationReason;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getJudgeStart() {
		return judgeStart;
	}

	public void setJudgeStart(String judgeStart) {
		this.judgeStart = judgeStart;
	}

	public String getPoliceId() {
		return policeId;
	}

	public void setPoliceId(String policeId) {
		this.policeId = policeId;
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

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public PublicInformationEntity getPublicInformation() {
		return publicInformation;
	}

	public void setPublicInformation(PublicInformationEntity publicInformation) {
		this.publicInformation = publicInformation;
	}
}
