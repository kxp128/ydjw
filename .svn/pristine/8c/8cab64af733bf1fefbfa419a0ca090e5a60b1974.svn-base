package com.ehootu.park.service;

import com.ehootu.park.model.EnvironmentalRenovationEntity;
import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;
import java.util.Map;

/**
 * 园区企业周边环境整治
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:37
 */
public interface EnvironmentalRenovationService {
	
	EnvironmentalRenovationEntity queryObject(String id);
	
	List<EnvironmentalRenovationEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(EnvironmentalRenovationEntity environmentalRenovation);
	
	void update(EnvironmentalRenovationEntity environmentalRenovation);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
List<EnvironmentalRenovationEntity> select(String id);
	
	List<EnvironmentalRenovationEntity> selectOne(String dizhibianma);
	
	List<EnvironmentalRenovationEntity> selectAddress(String enterprise_address);

    void save(EnvironmentalRenovationEntity environmentalRenovation, PublicInformationEntity publicInformation, String pageName);
}
