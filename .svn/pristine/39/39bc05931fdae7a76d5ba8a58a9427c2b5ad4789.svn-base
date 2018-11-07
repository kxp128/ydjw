package com.ehootu.sys.service;

import com.ehootu.sys.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;

/**
 * 角色
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-24 15:10:14
 */
public interface SysRoleService {
	
	SysRoleEntity queryObject(Long roleId);
	
	List<SysRoleEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysRoleEntity sysRole);
	
	void update(SysRoleEntity sysRole);
	
	void delete(Long roleId);
	
	void deleteBatch(Long[] roleIds);
}
