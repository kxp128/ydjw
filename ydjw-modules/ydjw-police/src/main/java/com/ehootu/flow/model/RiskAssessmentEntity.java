package com.ehootu.flow.model;

import java.io.Serializable;
import java.util.Date;


/**
 * 工程项目风险评估
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class RiskAssessmentEntity implements Serializable {


	private static final long serialVersionUID = -5410535792687979583L;
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
	 * 工程项目
	 */
	private String project;
    /**
	 * 维稳信息
	 */
	private String information;
    /**
	 * 评估时间
	 */
	private Date evaluationTimes;
    /**
	 * 评估地点
	 */
	private String evaluationSite;
    /**
	 * 评估人员
	 */
	private String evaluationPersonnel;
    /**
	 * 评估内容
	 */
	private String evaluationContent;
    /**
	 * 风险等级
	 */
	private String riskLevel;
    /**
	 * 处置措施
	 */
	private String disposalMeasures;
    /**
	 * 处置结果
	 */
	private String disposalResult;
    /**
	 * 闪存平台
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
	 * 创建时间
	 */
	private Date createTime;
    /**
	 * 任务 id
	 */
	private String taskId;


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
	 * 设置：工程项目
	 */
	public void setProject(String project) {
		this.project = project;
	}
	/**
	 * 获取：工程项目
	 */
	public String getProject() {
		return project;
	}
	/**
	 * 设置：维稳信息
	 */
	public void setInformation(String information) {
		this.information = information;
	}
	/**
	 * 获取：维稳信息
	 */
	public String getInformation() {
		return information;
	}
	/**
	 * 设置：评估时间
	 */
	public void setEvaluationTimes(Date evaluationTimes) {
		this.evaluationTimes = evaluationTimes;
	}
	/**
	 * 获取：评估时间
	 */
	public Date getEvaluationTimes() {
		return evaluationTimes;
	}
	/**
	 * 设置：评估地点
	 */
	public void setEvaluationSite(String evaluationSite) {
		this.evaluationSite = evaluationSite;
	}
	/**
	 * 获取：评估地点
	 */
	public String getEvaluationSite() {
		return evaluationSite;
	}
	/**
	 * 设置：评估人员
	 */
	public void setEvaluationPersonnel(String evaluationPersonnel) {
		this.evaluationPersonnel = evaluationPersonnel;
	}
	/**
	 * 获取：评估人员
	 */
	public String getEvaluationPersonnel() {
		return evaluationPersonnel;
	}
	/**
	 * 设置：评估内容
	 */
	public void setEvaluationContent(String evaluationContent) {
		this.evaluationContent = evaluationContent;
	}
	/**
	 * 获取：评估内容
	 */
	public String getEvaluationContent() {
		return evaluationContent;
	}
	/**
	 * 设置：风险等级
	 */
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	/**
	 * 获取：风险等级
	 */
	public String getRiskLevel() {
		return riskLevel;
	}
	/**
	 * 设置：处置措施
	 */
	public void setDisposalMeasures(String disposalMeasures) {
		this.disposalMeasures = disposalMeasures;
	}
	/**
	 * 获取：处置措施
	 */
	public String getDisposalMeasures() {
		return disposalMeasures;
	}
	/**
	 * 设置：处置结果
	 */
	public void setDisposalResult(String disposalResult) {
		this.disposalResult = disposalResult;
	}
	/**
	 * 获取：处置结果
	 */
	public String getDisposalResult() {
		return disposalResult;
	}
	/**
	 * 设置：闪存平台
	 */
	public void setFlashMemoryPlatform(String flashMemoryPlatform) {
		this.flashMemoryPlatform = flashMemoryPlatform;
	}
	/**
	 * 获取：闪存平台
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
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
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
