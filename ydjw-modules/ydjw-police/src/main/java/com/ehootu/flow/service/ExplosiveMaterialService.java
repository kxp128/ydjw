package com.ehootu.flow.service;

import java.util.List;
import java.util.Map;

import com.ehootu.flow.model.ExplosiveMaterialEntity;
import com.ehootu.park.model.PublicInformationEntity;

/**
 * 流动警务室爆炸物品专项检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:20
 */
public interface ExplosiveMaterialService {
	
	ExplosiveMaterialEntity queryObject(String id);
	
	List<ExplosiveMaterialEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(ExplosiveMaterialEntity explosiveMaterial, PublicInformationEntity publicEntity, String pageName);

	void update(ExplosiveMaterialEntity explosiveMaterial);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
