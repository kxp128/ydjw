package com.ehootu.park.service;

import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.StarRatingEntity;

import java.util.List;
import java.util.Map;

/**
 * 园区企业星级评定
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:59
 */
public interface StarRatingService {
	
	StarRatingEntity queryObject(String id);
	
	List<StarRatingEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(StarRatingEntity starRating);

	void save(StarRatingEntity starRating, PublicInformationEntity publicInformation, String pageName);

	void update(StarRatingEntity starRating);

	void delete(String id);
	void deleteBatch(Integer[] ids);

	List<StarRatingEntity> select(String id);

	List<StarRatingEntity> selectOne(String dizhibianma);

	List<StarRatingEntity> selectAddress(String enterprise_address);
}
