package com.ehootu.sys.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-25 17:26:15
 */
public class DmdzEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//表ID
	private Integer dmdzId;
	//父级ID
	private Integer parentId;
	//编码类型
	private Integer dmdzType;
	//地址编码
	private String dmdzCode;
	//地址名称
	private String dmdzName;
	//插入数据的用户ID
	private Integer userId;
	//删除标志
	private Integer delFlag;

	private List<?>  list;

	/**
	 * 设置：表ID
	 */
	public void setDmdzId(Integer dmdzId) {
		this.dmdzId = dmdzId;
	}
	/**
	 * 获取：表ID
	 */
	public Integer getDmdzId() {
		return dmdzId;
	}
	/**
	 * 设置：父级ID
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父级ID
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：编码类型
	 */
	public void setDmdzType(Integer dmdzType) {
		this.dmdzType = dmdzType;
	}
	/**
	 * 获取：编码类型
	 */
	public Integer getDmdzType() {
		return dmdzType;
	}
	/**
	 * 设置：地址编码
	 */
	public void setDmdzCode(String dmdzCode) {
		this.dmdzCode = dmdzCode;
	}
	/**
	 * 获取：地址编码
	 */
	public String getDmdzCode() {
		return dmdzCode;
	}
	/**
	 * 设置：地址名称
	 */
	public void setDmdzName(String dmdzName) {
		this.dmdzName = dmdzName;
	}
	/**
	 * 获取：地址名称
	 */
	public String getDmdzName() {
		return dmdzName;
	}
	/**
	 * 设置：插入数据的用户ID
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：插入数据的用户ID
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：删除标志
	 */
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：删除标志
	 */
	public Integer getDelFlag() {
		return delFlag;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
}
