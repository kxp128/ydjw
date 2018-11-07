package com.ehootu.park.dao;

import java.util.List;

import com.ehootu.core.util.BaseDao;
import com.ehootu.park.model.SecurityInspectionEntity;
import org.springframework.stereotype.Repository;

/**
 * 园区消防安全检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:22
 */
@Repository
public interface SecurityInspectionDao extends BaseDao<SecurityInspectionEntity> {
	List<SecurityInspectionEntity> select(String id);
	
	List<SecurityInspectionEntity> selectOne(String dizhibianma);
	
	List<SecurityInspectionEntity> selectAddress(String enterprise_address);
}
