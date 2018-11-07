package com.ehootu.park.service;

import com.ehootu.core.util.Query;
import com.ehootu.park.model.ExplosiveInspectionEntity;
import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;
import java.util.Map;

/**
 * 爆炸物专项检查记录表
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:46
 */
public interface ExplosiveInspectionService {
	
	ExplosiveInspectionEntity queryObject(String id);
	
	List<ExplosiveInspectionEntity> select(String id);
	
	List<ExplosiveInspectionEntity> selectOne(String dizhibianma);
	
	List<ExplosiveInspectionEntity> selectAddress(String enterprise_address);
	
	int queryTotal(Map<String, Object> map);
	
	void save(ExplosiveInspectionEntity explosiveInspection);
	
	void update(ExplosiveInspectionEntity explosiveInspection);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);

	List<ExplosiveInspectionEntity> queryList(Query query);

	void save(ExplosiveInspectionEntity explosiveInspection, PublicInformationEntity publicInformation, String pageName);
}
