package com.ehootu.sys.service;

import com.ehootu.sys.entity.SysMenuEntity;

import java.util.List;
import java.util.Map;

/**
 * 菜单管理
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-18 18:47:39
 */
public interface SysMenuService {
	
	SysMenuEntity queryObject(Long menuId);
	
	List<SysMenuEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysMenuEntity sysMenu);
	
	void update(SysMenuEntity sysMenu);
	
	void delete(Long menuId);
	
	void deleteBatch(Long[] menuIds);

	/**
	 * 获取用户菜单列表
	 */
	List<SysMenuEntity> getUserMenuList(Long userId);

	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 * @param menuIdList  用户菜单ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId, List<Long> menuIdList);

	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId);

	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenuEntity> queryNotButtonList();
}
