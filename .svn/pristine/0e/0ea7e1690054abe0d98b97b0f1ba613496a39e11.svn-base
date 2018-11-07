package com.ehootu.park.service;

import com.ehootu.park.model.ParkEnterpriseArchivesEntity;
import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;
import java.util.Map;

/**
 * 园区企业档案
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:10
 */
public interface ParkEnterpriseArchivesService {
	
	ParkEnterpriseArchivesEntity queryObject(String id);
	
	List<ParkEnterpriseArchivesEntity> selectOne(String dizhibianma);
	
	List<ParkEnterpriseArchivesEntity> selectAddress(String enterprise_address);
	
	List<ParkEnterpriseArchivesEntity> queryList(Map<String, Object> map);
	
	List<ParkEnterpriseArchivesEntity> select(String id);
	
	int queryTotal(Map<String, Object> map);
	
	void save(ParkEnterpriseArchivesEntity parkEnterpriseArchives);
	
	void update(ParkEnterpriseArchivesEntity parkEnterpriseArchives);
	
	void delete(String id);

	void deleteBatch(Integer[] ids);

	/**
	 * 保存企业档案信息：内含操作：
	 * 	1、更新企业公共信息表
	 * 	2、判断更新企业档案
	 * 	3、保存企业档案
	 * 	4、判断添加任务信息
	 * @param parkEnterpriseArchives 企业档案信息
	 * @param publicInformation 企业公共信息
	 * @param pageName 前端页面跳转的详情页面名称
	 */
	void save(ParkEnterpriseArchivesEntity parkEnterpriseArchives, PublicInformationEntity publicInformation, String pageName);

	/**
	 * 根据地址编码查询已登记的企业档案信息
	 * @param diZhiBianMa 地址编码
	 * @return
	 */
    ParkEnterpriseArchivesEntity getDetailByDzbm(String diZhiBianMa);
}
