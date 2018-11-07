package com.ehootu.rural.service;

import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.rural.model.RealNameManagementEntity;

import java.util.List;
import java.util.Map;

/**
 * 旅店、网吧实名管理工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:36
 */
public interface RealNameManagementService {
	
	RealNameManagementEntity queryObject(String id);
	
	List<RealNameManagementEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);

	/**
	 * 新增旅店、网吧实名管理工作记录
     * @param realNameManagement 旅店、网吧实名管理工作记录 实体对象参数
     * @param publicEntity 公共地址实体对象参数
     * @param pageName
     */
	void save(RealNameManagementEntity realNameManagement, PublicInformationEntity publicEntity, String pageName);

	void update(RealNameManagementEntity realNameManagement);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
