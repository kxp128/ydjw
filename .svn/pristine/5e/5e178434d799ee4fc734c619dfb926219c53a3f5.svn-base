package com.ehootu.park.dao;

import java.util.List;

import com.ehootu.core.util.BaseDao;
import com.ehootu.park.model.ParkEnterpriseArchivesEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 园区企业档案
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:10
 */
@Repository
public interface ParkEnterpriseArchivesDao extends BaseDao<ParkEnterpriseArchivesEntity> {
	
	List<ParkEnterpriseArchivesEntity> select(String id);
	
	List<ParkEnterpriseArchivesEntity> selectOne(String dizhibianma);
	
	List<ParkEnterpriseArchivesEntity> selectAddress(String enterprise_address);

	/**
	 * 根据地址编码修改已登记的企业信息
	 * @param diZhiBianMa 地址编码
	 * @param i 删除（弃用）
	 */
    void updateByDzbm(@Param("diZhiBianMa") String diZhiBianMa, @Param("deleteFlag") int i);

	/**
	 * 根据地址编码查询企业档案详情
	 * @param diZhiBianMa 地址编码
	 */
	ParkEnterpriseArchivesEntity selectDetailByDzbm(@Param("diZhiBianMa") String diZhiBianMa);
}
