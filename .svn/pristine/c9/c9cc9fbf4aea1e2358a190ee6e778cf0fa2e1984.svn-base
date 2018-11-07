package com.ehootu.park.service;

import com.ehootu.park.model.EnterpriseInspectionRecordEntity;
import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;
import java.util.Map;

/**
 * 企业内保工作检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:18
 */
public interface EnterpriseInspectionRecordService {
	
	EnterpriseInspectionRecordEntity queryObject(String id);
	
	List<EnterpriseInspectionRecordEntity> queryList(Map<String, Object> map);
	
	List<EnterpriseInspectionRecordEntity> select(String id);
	
	List<EnterpriseInspectionRecordEntity> selectOne(String dizhibianma);
	
	List<EnterpriseInspectionRecordEntity> selectAddress(String enterprise_address);
	
	int queryTotal(Map<String, Object> map);
	
	void save(EnterpriseInspectionRecordEntity enterpriseInspectionRecord);
	
	void update(EnterpriseInspectionRecordEntity enterpriseInspectionRecord);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);

    void save(EnterpriseInspectionRecordEntity enterpriseInspectionRecord, PublicInformationEntity publicInformation, String pageName);
}
