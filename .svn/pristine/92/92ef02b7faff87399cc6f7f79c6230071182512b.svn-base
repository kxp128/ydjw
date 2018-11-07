package com.ehootu.sys.service.impl;

import com.ehootu.core.util.Constant;
import com.ehootu.sys.dao.SysMenuDao;
import com.ehootu.sys.entity.SysMenuEntity;
import com.ehootu.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
	@Autowired
	private SysMenuDao sysMenuDao;
	
	@Override
	public SysMenuEntity queryObject(Long menuId){
		return sysMenuDao.queryObject(menuId);
	}
	
	@Override
	public List<SysMenuEntity> queryList(Map<String, Object> map){
		return sysMenuDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return sysMenuDao.queryTotal(map);
	}
	
	@Override
	public void save(SysMenuEntity sysMenu){
		sysMenuDao.save(sysMenu);
	}
	
	@Override
	public void update(SysMenuEntity sysMenu){
		sysMenuDao.update(sysMenu);
	}
	
	@Override
	public void delete(Long menuId){
		sysMenuDao.delete(menuId);
	}
	
	@Override
	public void deleteBatch(Long[] menuIds){
		sysMenuDao.deleteBatch(menuIds);
	}

	@Override
	public List<SysMenuEntity> getUserMenuList(Long userId) {
		//系统管理员，拥有最高权限
		if(userId == Constant.SUPER_ADMIN){
			return getAllMenuList(null);
		}
	return null;
		//用户菜单列表
//		List<Long> menuIdList = sysUserService.queryAllMenuId(userId);
//		return getAllMenuList(menuIdList);
	}
	/**
	 * 获取所有菜单列表
	 */
	private List<SysMenuEntity> getAllMenuList(List<Long> menuIdList){
		//查询根菜单列表
		List<SysMenuEntity> menuList = queryListParentId(0L, menuIdList);
		//递归获取子菜单
		getMenuTreeList(menuList, menuIdList);

		return menuList;
	}

	/**
	 * 递归
	 */
	private List<SysMenuEntity> getMenuTreeList(List<SysMenuEntity> menuList, List<Long> menuIdList){
		List<SysMenuEntity> subMenuList = new ArrayList<SysMenuEntity>();

		for(SysMenuEntity entity : menuList){
			System.out.println(entity);
			if(entity.getType() == Constant.MenuType.CATALOG.getValue()){//目录
				entity.setList(getMenuTreeList(queryListParentId(entity.getMenuId(), menuIdList), menuIdList));
			}
			subMenuList.add(entity);
		}

		return subMenuList;
	}

	@Override
	public List<SysMenuEntity> queryListParentId(Long parentId, List<Long> menuIdList) {
		List<SysMenuEntity> menuList = queryListParentId(parentId);
		if(menuIdList == null){
			return menuList;
		}

		List<SysMenuEntity> userMenuList = new ArrayList<>();
		for(SysMenuEntity menu : menuList){
			if(menuIdList.contains(menu.getMenuId())){
				userMenuList.add(menu);
			}
		}
		return userMenuList;
	}

	@Override
	public List<SysMenuEntity> queryListParentId(Long parentId) {
		return sysMenuDao.queryListParentId(parentId);
	}


	@Override
	public List<SysMenuEntity> queryNotButtonList() {
		return sysMenuDao.queryNotButtonList();
	}
}
