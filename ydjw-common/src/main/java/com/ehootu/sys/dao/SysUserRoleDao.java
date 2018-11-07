package com.ehootu.sys.dao;


import com.ehootu.core.util.BaseDao;
import com.ehootu.sys.entity.SysUserRoleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户与角色对应关系
 *
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-18 18:47:39
 */
@Repository
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
	//添加
	void save2(SysUserRoleEntity t);
}
