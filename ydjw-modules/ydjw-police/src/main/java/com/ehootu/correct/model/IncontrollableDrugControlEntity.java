package com.ehootu.correct.model;

import java.io.Serializable;
import java.util.Date;


/**
 * 失控吸毒类重点人员动态管控工作记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class IncontrollableDrugControlEntity implements Serializable {

	
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
	 * 吸毒者姓名
	 */
	private String drugAddicts;
    /**
	 * 失控时间
	 */
	private Date runawayTime;
    /**
	 * 失控原因
	 */
	private String incontrollableReason;
    /**
	 * 报告局领导,情指中心
	 */
	private String presentation;
    /**
	 * 轨迹追踪
	 */
	private String trajectoryTracking;
    /**
	 * 行为矫正
	 */
	private String behaviorCorrection;
    /**
	 * 打击处理
	 */
	private String percussionTreatment;
    /**
	 * 强制戒毒
	 */
	private String compulsoryDetoxification;
    /**
	 * 困难帮扶
	 */
	private String difficultiesHelp;
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
	 * 设置：吸毒者姓名
	 */
	public void setDrugAddicts(String drugAddicts) {
		this.drugAddicts = drugAddicts;
	}
	/**
	 * 获取：吸毒者姓名
	 */
	public String getDrugAddicts() {
		return drugAddicts;
	}
	/**
	 * 设置：失控时间
	 */
	public void setRunawayTime(Date runawayTime) {
		this.runawayTime = runawayTime;
	}
	/**
	 * 获取：失控时间
	 */
	public Date getRunawayTime() {
		return runawayTime;
	}
	/**
	 * 设置：失控原因
	 */
	public void setIncontrollableReason(String incontrollableReason) {
		this.incontrollableReason = incontrollableReason;
	}
	/**
	 * 获取：失控原因
	 */
	public String getIncontrollableReason() {
		return incontrollableReason;
	}
	/**
	 * 设置：报告局领导,情指中心
	 */
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	/**
	 * 获取：报告局领导,情指中心
	 */
	public String getPresentation() {
		return presentation;
	}
	/**
	 * 设置：轨迹追踪
	 */
	public void setTrajectoryTracking(String trajectoryTracking) {
		this.trajectoryTracking = trajectoryTracking;
	}
	/**
	 * 获取：轨迹追踪
	 */
	public String getTrajectoryTracking() {
		return trajectoryTracking;
	}
	/**
	 * 设置：行为矫正
	 */
	public void setBehaviorCorrection(String behaviorCorrection) {
		this.behaviorCorrection = behaviorCorrection;
	}
	/**
	 * 获取：行为矫正
	 */
	public String getBehaviorCorrection() {
		return behaviorCorrection;
	}
	/**
	 * 设置：打击处理
	 */
	public void setPercussionTreatment(String percussionTreatment) {
		this.percussionTreatment = percussionTreatment;
	}
	/**
	 * 获取：打击处理
	 */
	public String getPercussionTreatment() {
		return percussionTreatment;
	}
	/**
	 * 设置：强制戒毒
	 */
	public void setCompulsoryDetoxification(String compulsoryDetoxification) {
		this.compulsoryDetoxification = compulsoryDetoxification;
	}
	/**
	 * 获取：强制戒毒
	 */
	public String getCompulsoryDetoxification() {
		return compulsoryDetoxification;
	}
	/**
	 * 设置：困难帮扶
	 */
	public void setDifficultiesHelp(String difficultiesHelp) {
		this.difficultiesHelp = difficultiesHelp;
	}
	/**
	 * 获取：困难帮扶
	 */
	public String getDifficultiesHelp() {
		return difficultiesHelp;
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
