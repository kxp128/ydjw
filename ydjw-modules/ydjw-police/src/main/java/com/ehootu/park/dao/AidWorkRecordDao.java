package com.ehootu.park.dao;

import com.ehootu.core.util.BaseDao;
import com.ehootu.park.model.AidWorkRecordEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 困难帮扶工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:49
 */
@Repository
public interface AidWorkRecordDao extends BaseDao<AidWorkRecordEntity> {
List<AidWorkRecordEntity> select(String id);
	
	List<AidWorkRecordEntity> selectOne(String dizhibianma);
	
	List<AidWorkRecordEntity> selectAddress(String enterprise_address);
}
