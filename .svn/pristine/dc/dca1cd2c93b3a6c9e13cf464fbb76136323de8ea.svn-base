package com.ehootu.correct.service;

import java.util.List;
import java.util.Map;

import com.ehootu.correct.model.ControlWorkEntity;

/**
 * 重点人员动态管控工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:16
 */
public interface ControlWorkService {
	
	ControlWorkEntity queryObject(String id);
	
	List<ControlWorkEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(ControlWorkEntity controlWork, String pageName);
	
	void update(ControlWorkEntity controlWork);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
}
