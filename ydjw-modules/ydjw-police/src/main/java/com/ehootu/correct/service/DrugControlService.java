package com.ehootu.correct.service;

import java.util.List;
import java.util.Map;

import com.ehootu.correct.model.DrugControlEntity;

/**
 * 吸毒类重点人员动态管控
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:32
 */
public interface DrugControlService {
	
	DrugControlEntity queryObject(String id);
	
	List<DrugControlEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(DrugControlEntity drugControl, String pageName);
	
	void update(DrugControlEntity drugControl);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
}
