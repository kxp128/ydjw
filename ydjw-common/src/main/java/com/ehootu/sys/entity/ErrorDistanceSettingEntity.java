package com.ehootu.sys.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 误差距离设置
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-03-05 14:40:03
 */
public class ErrorDistanceSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//表ID
	private Integer id;
	//标题
	private String title;
	//距离
	private Integer distance;

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
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：距离
	 */
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	/**
	 * 获取：距离
	 */
	public Integer getDistance() {
		return distance;
	}
}
