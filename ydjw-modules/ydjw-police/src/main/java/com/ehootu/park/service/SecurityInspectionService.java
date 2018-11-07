package com.ehootu.park.service;

import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.SecurityInspectionEntity;

import java.util.List;
import java.util.Map;

/**
 * 园区消防安全检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:22
 */
public interface SecurityInspectionService {
	
	SecurityInspectionEntity queryObject(String id);
	
	List<SecurityInspectionEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SecurityInspectionEntity securityInspection);
	
	void update(SecurityInspectionEntity securityInspection);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
List<SecurityInspectionEntity> select(String id);
	
	List<SecurityInspectionEntity> selectOne(String dizhibianma);
	
	List<SecurityInspectionEntity> selectAddress(String enterprise_address);

    void save(SecurityInspectionEntity securityInspection, PublicInformationEntity publicInformation, String pageName);
}
