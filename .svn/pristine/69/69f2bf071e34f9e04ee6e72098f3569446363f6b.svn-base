package com.ehootu.park.service;

import com.ehootu.park.model.EducationalWorkEntity;

import java.util.List;
import java.util.Map;

/**
 * 法制宣传教育工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:55
 */
public interface EducationalWorkService {
	
	EducationalWorkEntity queryObject(String id);
	
	List<EducationalWorkEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);

	void save(EducationalWorkEntity educationalWork);

	void save(EducationalWorkEntity educationalWork, String pageName);

	void update(EducationalWorkEntity educationalWork);

	void delete(String id);
	void deleteBatch(Integer[] ids);

List<EducationalWorkEntity> select(String id);

	List<EducationalWorkEntity> selectOne(String dizhibianma);

	List<EducationalWorkEntity> selectAddress(String enterprise_address);
}
