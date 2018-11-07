package com.ehootu.sys.dao;


import com.ehootu.core.util.BaseDao;
import com.ehootu.sys.entity.SysRoleDeptEntity;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 角色与部门对应关系
 *
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-18 18:47:39
 */

@Repository
public interface SysRoleDeptDao extends BaseDao<SysRoleDeptEntity> {
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long roleId);
}
