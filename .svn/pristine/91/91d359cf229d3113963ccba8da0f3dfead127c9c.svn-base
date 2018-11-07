package com.ehootu.correct.service;

import java.util.List;
import java.util.Map;

import com.ehootu.correct.model.PersuasionWorkEntity;

/**
 * 心连心”心理疏导工作站工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:45
 */
public interface PersuasionWorkService {
	
	PersuasionWorkEntity queryObject(String id);
	
	List<PersuasionWorkEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PersuasionWorkEntity persuasionWork, String pageName);
	
	void update(PersuasionWorkEntity persuasionWork);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
}
