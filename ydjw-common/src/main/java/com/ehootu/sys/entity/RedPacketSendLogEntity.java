package com.ehootu.sys.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 红包发送记录
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-03-05 14:40:02
 */
public class RedPacketSendLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//表ID
	private Integer id;
	//警察名称
	private String policeName;
	//用户名称
	private String userName;
	//红包金额
	private String redPacketAmount;
	//发送时间
	private Date sendTime;

	/**
	 * 设置：表ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：表ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：警察名称
	 */
	public void setPoliceName(String policeName) {
		this.policeName = policeName;
	}
	/**
	 * 获取：警察名称
	 */
	public String getPoliceName() {
		return policeName;
	}
	/**
	 * 设置：用户名称
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户名称
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：红包金额
	 */
	public void setRedPacketAmount(String redPacketAmount) {
		this.redPacketAmount = redPacketAmount;
	}
	/**
	 * 获取：红包金额
	 */
	public String getRedPacketAmount() {
		return redPacketAmount;
	}
	/**
	 * 设置：发送时间
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	/**
	 * 获取：发送时间
	 */
	public Date getSendTime() {
		return sendTime;
	}
}
