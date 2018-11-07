package com.ehootu.flow.model;

import java.io.Serializable;
import java.util.Date;


/**
 * 工程项目阻工事件记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class BlockingEventEntity implements Serializable {


	private static final long serialVersionUID = -2189323101386152846L;
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
	 * 阻工时间
	 */
	private Date blockingTime;
    /**
	 * 阻工地点
	 */
	private String blockingLocation;
    /**
	 * 阻工人员
	 */
	private String blockingPersonnel;
    /**
	 * 阻工原因
	 */
	private String blockingReason;
    /**
	 * 阻工损失
	 */
	private String blockingLoss;
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
	 * 设置：阻工时间
	 */
	public void setBlockingTime(Date blockingTime) {
		this.blockingTime = blockingTime;
	}
	/**
	 * 获取：阻工时间
	 */
	public Date getBlockingTime() {
		return blockingTime;
	}
	/**
	 * 设置：阻工地点
	 */
	public void setBlockingLocation(String blockingLocation) {
		this.blockingLocation = blockingLocation;
	}
	/**
	 * 获取：阻工地点
	 */
	public String getBlockingLocation() {
		return blockingLocation;
	}
	/**
	 * 设置：阻工人员
	 */
	public void setBlockingPersonnel(String blockingPersonnel) {
		this.blockingPersonnel = blockingPersonnel;
	}
	/**
	 * 获取：阻工人员
	 */
	public String getBlockingPersonnel() {
		return blockingPersonnel;
	}
	/**
	 * 设置：阻工原因
	 */
	public void setBlockingReason(String blockingReason) {
		this.blockingReason = blockingReason;
	}
	/**
	 * 获取：阻工原因
	 */
	public String getBlockingReason() {
		return blockingReason;
	}
	/**
	 * 设置：阻工损失
	 */
	public void setBlockingLoss(String blockingLoss) {
		this.blockingLoss = blockingLoss;
	}
	/**
	 * 获取：阻工损失
	 */
	public String getBlockingLoss() {
		return blockingLoss;
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
