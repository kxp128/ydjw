package com.ehootu.park.service;

import com.ehootu.park.model.EnterprisePlatformWorkEntity;
import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;
import java.util.Map;

/**
 *
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:37
 */
public interface EnterprisePlatformWorkService {
	
	EnterprisePlatformWorkEntity queryObject(String id);
	
	List<EnterprisePlatformWorkEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(EnterprisePlatformWorkEntity EnterprisePlatformWork);
	
	void update(EnterprisePlatformWorkEntity EnterprisePlatformWork);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
List<EnterprisePlatformWorkEntity> select(String id);
	
	List<EnterprisePlatformWorkEntity> selectOne(String dizhibianma);
	
	List<EnterprisePlatformWorkEntity> selectAddress(String enterprise_address);

    void save(EnterprisePlatformWorkEntity enterprisePlatformWork, PublicInformationEntity publicInformation, String pageName);
}
