package com.ehootu.rural.service;

import com.ehootu.rural.model.PatrolRecordEntity;

import java.util.List;
import java.util.Map;

/**
 * 巡逻记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:25
 */
public interface PatrolRecordService {
	
	PatrolRecordEntity queryObject(String id);
	
	List<PatrolRecordEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PatrolRecordEntity patrolRecord, String pageName);
	
	void update(PatrolRecordEntity patrolRecord);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
}
