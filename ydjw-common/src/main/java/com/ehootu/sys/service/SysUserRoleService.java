package com.ehootu.sys.service;

import com.ehootu.sys.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 用户与角色对应关系
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-24 15:10:15
 */
public interface SysUserRoleService {


	void saveOrUpdate(Long userId, List<Long> roleIdList);

	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	void delete(Long userId);

    void save2(SysUserRoleEntity sysUserRoleEntity);
}
