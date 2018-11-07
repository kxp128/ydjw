package com.ehootu.dictionary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 *  字典工具类
 *
 * @author Liaoxb
 * @date 2017/12/1
 */
public class SysDictionary implements Serializable {

	/*********  【 移动警务四大模块 的下拉类型 】  *********/
	public static final String SQMYDCGL_DCXM = "sqmydcgl_dcxm";  // 城乡警务：社情民意 调查项目

	public static final String ZAZDGZJL_GLXM = "zazdgzjl_glxm";  // 城乡警务：治安重点工作记录 管理项目

	public static final String ZAZDGZJL_JCFS = "zazdgzjl_jcfs";  // 城乡警务：治安重点工作记录 检查方式

	public static final String NCDLJTGL_GLXM = "ncdljtgl_glxm";  // 城乡警务：农村道路交通管理工作记录 管理项目

	public static final String CSXFAQJCJL_JCCS = "csxfaqjcjl_jccs";    // 城乡警务：村社消防安全监督管理 检查场所

	public static final String XLXXLSD_FJGL = "xlxxlsd_fjgl";    // 矫正警务：“心连心”心里疏导工作站工作记录 分级管理

	public static final String YQQYDA_JYZK = "yqqyda_jyzk";    // 园区警务：园区企业档案 经营状况

	public static final String QYNB_JCLB = "qynb_jclb";    // 园区警务：企业内保工作检查记录 检查类别

	public static final String YQQYWWXXSJ_SCJYZK = "yqqywwxxsj_scjyzk";    // 园区警务：园区企业维稳信息记录 生产经营状况

	public static final String YQQYZBHJZZ_ZZLB = "yqqyzbhjzz_zzlb";    // 园区警务：园区企业周边环境整治：整治类别


	/**
	 * 主键id
	 */
	private String id;
    /**
	 * 类型
	 */
	private String type;
    /**
	 * 标签名
	 */
	private String label;
    /**
	 * 类型名称
	 */
	private String name;
    /**
	 * 值
	 */
	private String value;
    /**
	 * 序号
	 */
	private BigDecimal sort;
    /**
	 * 父级编号
	 */
	private String parentId;
    /**
	 * 创建者
	 */
	private String createBy;
    /**
	 * 创建时间
	 */
	private Date createTime;
    /**
	 * 备注信息
	 */
	private String remarks;
    /**
	 * 删除标记。0-未删除，1-删除
	 */
	private String delFlag;


	/**
	 * 设置：主键id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：主键id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：标签名
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * 获取：标签名
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * 设置：类型名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：类型名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：值
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 获取：值
	 */
	public String getValue() {
		return value;
	}
	/**
	 * 设置：序号
	 */
	public void setSort(BigDecimal sort) {
		this.sort = sort;
	}
	/**
	 * 获取：序号
	 */
	public BigDecimal getSort() {
		return sort;
	}
	/**
	 * 设置：父级编号
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父级编号
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：创建者
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建者
	 */
	public String getCreateBy() {
		return createBy;
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
	 * 设置：备注信息
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注信息
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置：删除标记。0-未删除，1-删除
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：删除标记。0-未删除，1-删除
	 */
	public String getDelFlag() {
		return delFlag;
	}
}
