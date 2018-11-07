package com.ehootu.sys.dao;

import com.ehootu.core.util.BaseDao;
import com.ehootu.sys.entity.SysMenuEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 菜单管理
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-18 18:47:39
 */
@Repository
public interface SysMenuDao extends BaseDao<SysMenuEntity> {
    /**
     * 根据父菜单，查询子菜单
     * @param parentId 父菜单ID
     */
    List<SysMenuEntity> queryListParentId(Long parentId);

    /**
     * 获取不包含按钮的菜单列表
     */
    List<SysMenuEntity> queryNotButtonList();

    /**
     * 查询用户的权限列表
     */
    List<SysMenuEntity> queryUserList(Long userId);
}
