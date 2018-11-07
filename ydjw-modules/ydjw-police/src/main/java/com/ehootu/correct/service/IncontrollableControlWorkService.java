package com.ehootu.correct.service;

import java.util.List;
import java.util.Map;

import com.ehootu.correct.model.IncontrollableControlWorkEntity;

/**
 * 失控重点人员动态管控工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:23
 */
public interface IncontrollableControlWorkService {
	
	IncontrollableControlWorkEntity queryObject(String id);
	
	List<IncontrollableControlWorkEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(IncontrollableControlWorkEntity incontrollableControlWork, String pageName);
	
	void update(IncontrollableControlWorkEntity incontrollableControlWork);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
}
