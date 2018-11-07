package com.ehootu.park.service;

import com.ehootu.park.model.ExplosiveStatisticsEntity;
import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;
import java.util.Map;

/**
 * 爆炸物品情况统计表
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:39
 */
public interface ExplosiveStatisticsService {
	
	ExplosiveStatisticsEntity queryObject(String id);
	
	List<ExplosiveStatisticsEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(ExplosiveStatisticsEntity explosiveStatistics);
	
	void update(ExplosiveStatisticsEntity explosiveStatistics);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);

	List<ExplosiveStatisticsEntity> select(String id);
	
	List<ExplosiveStatisticsEntity> selectOne(String dizhibianma);
	
	List<ExplosiveStatisticsEntity> selectAddress(String enterprise_address);

    void save(ExplosiveStatisticsEntity explosiveStatistics, PublicInformationEntity publicInformation, String pageName);
}
