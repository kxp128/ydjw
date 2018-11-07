package com.ehootu.sys.service;

import com.ehootu.sys.entity.SysRoleDeptEntity;

import java.util.List;
import java.util.Map;

/**
 * 角色与部门对应关系
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-24 15:10:14
 */
public interface SysRoleDeptService {
	void saveOrUpdate(Long roleId, List<Long> deptIdList);

	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long roleId);
}
