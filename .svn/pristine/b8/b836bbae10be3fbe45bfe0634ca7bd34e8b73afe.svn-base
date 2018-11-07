package com.ehootu.correct.service;

import java.util.List;
import java.util.Map;

import com.ehootu.correct.model.IncontrollableDrugControlEntity;

/**
 * 失控吸毒类重点人员动态管控工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:32
 */
public interface IncontrollableDrugControlService {
	
	IncontrollableDrugControlEntity queryObject(String id);
	
	List<IncontrollableDrugControlEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(IncontrollableDrugControlEntity incontrollableDrugControl, String pageName);
	
	void update(IncontrollableDrugControlEntity incontrollableDrugControl);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
}
