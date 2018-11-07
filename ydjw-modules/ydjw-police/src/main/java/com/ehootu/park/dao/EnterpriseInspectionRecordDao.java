package com.ehootu.park.dao;

import java.util.List;

import com.ehootu.core.util.BaseDao;
import com.ehootu.park.model.EnterpriseInspectionRecordEntity;
import org.springframework.stereotype.Repository;

/**
 * 企业内保工作检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:18
 */
@Repository
public interface EnterpriseInspectionRecordDao extends BaseDao<EnterpriseInspectionRecordEntity> {
	
	List<EnterpriseInspectionRecordEntity> select(String id);
	
	List<EnterpriseInspectionRecordEntity> selectOne(String dizhibianma);
	
	List<EnterpriseInspectionRecordEntity> selectAddress(String enterprise_address);
}
