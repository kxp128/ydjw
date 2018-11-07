package com.ehootu.rural.service;

import com.ehootu.rural.model.SocialWorkRecordEntity;

import java.util.List;
import java.util.Map;

/**
 * 社情民意工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:31
 */
public interface SocialWorkRecordService {
	
	SocialWorkRecordEntity queryObject(String id);
	
	List<SocialWorkRecordEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SocialWorkRecordEntity socialWorkRecord, String pageName);
	
	void update(SocialWorkRecordEntity socialWorkRecord);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
}
