package com.ehootu.park.dao;

import java.util.List;

import com.ehootu.core.util.BaseDao;
import com.ehootu.park.model.StarRatingEntity;
import org.springframework.stereotype.Repository;

/**
 * 园区企业星级评定
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:59
 */
@Repository
public interface StarRatingDao extends BaseDao<StarRatingEntity> {
List<StarRatingEntity> select(String id);
	
	List<StarRatingEntity> selectOne(String dizhibianma);
	
	List<StarRatingEntity> selectAddress(String enterprise_address);
}
