package com.ehootu.park.dao;

import java.util.List;

import com.ehootu.core.util.BaseDao;
import com.ehootu.park.model.EnterprisePlatformWorkEntity;
import org.springframework.stereotype.Repository;

/**
 * 园区企业周边环境整治
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:37
 */
@Repository
public interface EnterprisePlatformWorkDao extends BaseDao<EnterprisePlatformWorkEntity> {
List<EnterprisePlatformWorkEntity> select(String id);
	
	List<EnterprisePlatformWorkEntity> selectOne(String dizhibianma);
	
	List<EnterprisePlatformWorkEntity> selectAddress(String enterprise_address);
}
