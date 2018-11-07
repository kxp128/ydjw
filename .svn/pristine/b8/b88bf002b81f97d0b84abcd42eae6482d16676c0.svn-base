package com.ehootu.sys.dao;



import com.ehootu.core.util.BaseDao;
import com.ehootu.sys.entity.SysRoleMenuEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色与菜单对应关系
 *
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-18 18:47:39
 */
@Repository
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
}
