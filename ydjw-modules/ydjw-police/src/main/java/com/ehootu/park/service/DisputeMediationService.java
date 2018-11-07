package com.ehootu.park.service;

import com.ehootu.park.model.DisputeMediationEntity;

import java.util.List;
import java.util.Map;

/**
 * 园区企业矛盾纠纷调处工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:44
 */
public interface DisputeMediationService {
	
	DisputeMediationEntity queryObject(String id);
	
	List<DisputeMediationEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);

	void save(DisputeMediationEntity disputeMediation);

	void save(DisputeMediationEntity disputeMediation, String pageName);

	void update(DisputeMediationEntity disputeMediation);

	void delete(String id);
	void deleteBatch(Integer[] ids);

	List<DisputeMediationEntity> select(String id);

	List<DisputeMediationEntity> selectOne(String dizhibianma);

	List<DisputeMediationEntity> selectAddress(String enterprise_address);
}
