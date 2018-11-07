package com.ehootu.sys.service.impl;

import com.ehootu.sys.dao.SysRoleDao;
import com.ehootu.sys.entity.SysRoleEntity;
import com.ehootu.sys.service.SysRoleDeptService;
import com.ehootu.sys.service.SysRoleMenuService;
import com.ehootu.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
	@Autowired
	private SysRoleDao sysRoleDao;
	@Autowired
	private SysRoleMenuService sysRoleMenuService;
	@Autowired
	private SysRoleDeptService sysRoleDeptService;
	
	@Override
	public SysRoleEntity queryObject(Long roleId){
		return sysRoleDao.queryObject(roleId);
	}
	
	@Override
	public List<SysRoleEntity> queryList(Map<String, Object> map){
		return sysRoleDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return sysRoleDao.queryTotal(map);
	}
	
	@Override
	@Transactional
	public void save(SysRoleEntity sysRole){
		sysRole.setCreateTime(new Date());
		sysRoleDao.save(sysRole);

		//保存角色与菜单关系
		sysRoleMenuService.saveOrUpdate(sysRole.getRoleId(), sysRole.getMenuIdList());

		//保存角色与部门关系
		sysRoleDeptService.saveOrUpdate(sysRole.getRoleId(), sysRole.getDeptIdList());
	}

	@Override
	@Transactional
	public void update(SysRoleEntity role) {
		sysRoleDao.update(role);

		//更新角色与菜单关系
		sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());

		//保存角色与部门关系
		sysRoleDeptService.saveOrUpdate(role.getRoleId(), role.getDeptIdList());
	}

	@Override
	@Transactional
	public void deleteBatch(Long[] roleIds) {
		sysRoleDao.deleteBatch(roleIds);
	}
	
	@Override
	public void delete(Long roleId){
		sysRoleDao.delete(roleId);
	}
	

	
}
