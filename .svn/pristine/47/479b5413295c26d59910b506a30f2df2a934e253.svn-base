package com.ehootu.park.service;

import com.ehootu.park.model.BusinessStabilityEntity;

import java.util.List;
import java.util.Map;

/**
 * 园区企业维稳信息记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:30
 */
public interface BusinessStabilityService {
	
	BusinessStabilityEntity queryObject(String id);
	
	List<BusinessStabilityEntity> queryList(Map<String, Object> map);
	
	List<BusinessStabilityEntity> select(String id);
	
	List<BusinessStabilityEntity> selectOne(String dizhibianma);
	
	List<BusinessStabilityEntity> selectAddress(String enterprise_address);

	int queryTotal(Map<String, Object> map);

	void save(BusinessStabilityEntity businessStability);

	void save(BusinessStabilityEntity businessStability, String pageName);

	void update(BusinessStabilityEntity businessStability);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
