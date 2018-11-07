package com.ehootu.park.service;

import com.ehootu.park.model.AidWorkRecordEntity;

import java.util.List;
import java.util.Map;

/**
 * 困难帮扶工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:49
 */
public interface AidWorkRecordService {
	
	int queryTotal(Map<String, Object> map);

	void save(AidWorkRecordEntity aidWorkRecord);

	void save(AidWorkRecordEntity aidWorkRecord, String pageName);

	void update(AidWorkRecordEntity aidWorkRecord);

	void delete(String id);
	void deleteBatch(Integer[] ids);

	AidWorkRecordEntity queryObject(String id);

	List<AidWorkRecordEntity> queryList(Map<String, Object> map);

	List<AidWorkRecordEntity> select(String id);

	List<AidWorkRecordEntity> selectOne(String dizhibianma);

	List<AidWorkRecordEntity> selectAddress(String enterprise_address);
}
