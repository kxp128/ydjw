package com.ehootu.sys.dao;


import com.ehootu.core.util.BaseDao;
import com.ehootu.sys.entity.SysDeptEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 部门管理
 *
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-18 18:47:39
 */
@Repository
public interface SysDeptDao extends BaseDao<SysDeptEntity> {

    /**
     * 查询子部门ID列表
     * @param parentId  上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);
}
