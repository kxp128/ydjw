package com.ehootu.park.service;

import com.ehootu.park.model.ChemicalsStatisticsEntity;
import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;
import java.util.Map;

/**
 * 易制毒化学物品统计表
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:31
 */
public interface ChemicalsStatisticsService {
	
	int queryTotal(Map<String, Object> map);
	
	void save(ChemicalsStatisticsEntity chemicalsStatistics);
	
	void update(ChemicalsStatisticsEntity chemicalsStatistics);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);
	
	ChemicalsStatisticsEntity queryObject(String id);
	
	List<ChemicalsStatisticsEntity> queryList(Map<String, Object> map);
	
	List<ChemicalsStatisticsEntity> select(String id);
	
	List<ChemicalsStatisticsEntity> selectOne(String dizhibianma);
	
	List<ChemicalsStatisticsEntity> selectAddress(String enterprise_address);

    void save(ChemicalsStatisticsEntity chemicalsStatistics, PublicInformationEntity publicInformation, String pageName);
}
