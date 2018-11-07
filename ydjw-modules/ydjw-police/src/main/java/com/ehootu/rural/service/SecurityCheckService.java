package com.ehootu.rural.service;

import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.rural.model.SecurityCheckEntity;

import java.util.List;
import java.util.Map;

/**
 * 消防安全检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:17
 */
public interface SecurityCheckService {
	
	SecurityCheckEntity queryObject(String id);
	
	List<SecurityCheckEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);

	void save(SecurityCheckEntity securityCheck, PublicInformationEntity publicInformation, String pageName);

	void update(SecurityCheckEntity securityCheck);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
