package com.ehootu.park.service;

import com.ehootu.park.model.ChemicalsInspectionEntity;
import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;
import java.util.Map;

/**
 * 易制毒化学品检验表
 *  剧毒、易制毒化学品 专项检查
 * @author yinyujun
 * @email 
 * @date 2017-09-26 16:27:31
 */
public interface ChemicalsInspectionService{
	
	int queryTotal(Map<String, Object> map);
	
	void save(ChemicalsInspectionEntity chemicalsInspection);
	
	void update(ChemicalsInspectionEntity chemicalsInspection);
	
	void delete(String id);
	
	void deleteBatch(Integer[] ids);

	ChemicalsInspectionEntity queryObject(String id);
	
	List<ChemicalsInspectionEntity> queryList(Map<String, Object> map);
	
	List<ChemicalsInspectionEntity> select(String id);
	
	List<ChemicalsInspectionEntity> selectOne(String dizhibianma);
	
	List<ChemicalsInspectionEntity> selectAddress(String enterprise_address);

    void save(ChemicalsInspectionEntity chemicalsInspection, PublicInformationEntity publicInformation, String pageName);
}
