package com.ehootu.rural.service;

import com.ehootu.rural.model.TrafficControlEntity;

import java.util.List;
import java.util.Map;

/**
 * 农村道路交通管理工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:11
 */
public interface TrafficControlService {
	
	TrafficControlEntity queryObject(String id);
	
	List<TrafficControlEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(TrafficControlEntity trafficControl, String pageName);
	
	void update(TrafficControlEntity trafficControl);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
}
