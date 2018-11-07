package com.ehootu.sys.service;

import com.ehootu.sys.entity.SysDeptEntity;

import java.util.List;
import java.util.Map;

/**
 * 部门管理
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-24 15:10:15
 */
public interface SysDeptService {
	
	SysDeptEntity queryObject(Long deptId);
	
	List<SysDeptEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysDeptEntity sysDept);
	
	void update(SysDeptEntity sysDept);
	
	void delete(Long deptId);
	
	void deleteBatch(Long[] deptIds);

	/**
	 * 查询子部门ID列表
	 * @param parentId  上级部门ID
	 */
	List<Long> queryDetpIdList(Long parentId);

	/**
	 * 获取子部门ID(包含本部门ID)，用于数据过滤
	 */
	String getSubDeptIdList(Long deptId);
}
