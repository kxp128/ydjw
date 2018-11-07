package com.ehootu.flow.service;

import java.util.List;
import java.util.Map;

import com.ehootu.flow.model.DoubleOverGovernanceEntity;
import com.ehootu.park.model.PublicInformationEntity;

/**
 * 流动警务室建筑工地双超治理情况记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:28
 */
public interface DoubleOverGovernanceService {
	
	DoubleOverGovernanceEntity queryObject(String id);
	
	List<DoubleOverGovernanceEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(DoubleOverGovernanceEntity doubleOverGovernance, PublicInformationEntity publicEntity, String pageName);

	void update(DoubleOverGovernanceEntity doubleOverGovernance);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
