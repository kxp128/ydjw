package com.ehootu.rural.service;

import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.rural.model.PeaceWorkEntity;

import java.util.List;
import java.util.Map;

/**
 * 治安重点工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:02
 */
public interface PeaceWorkService {
	
	PeaceWorkEntity queryObject(String id);
	
	List<PeaceWorkEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);

	void save(PeaceWorkEntity peaceWork, PublicInformationEntity publicInformation, String pageName);

	void update(PeaceWorkEntity peaceWork);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
