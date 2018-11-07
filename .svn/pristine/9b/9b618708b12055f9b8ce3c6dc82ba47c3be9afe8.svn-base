package com.ehootu.sys.service;

import com.ehootu.sys.entity.SysRoleMenuEntity;

import java.util.List;
import java.util.Map;

/**
 * 角色与菜单对应关系
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-24 15:10:15
 */
public interface SysRoleMenuService {

	void saveOrUpdate(Long roleId, List<Long> menuIdList);

	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
}
