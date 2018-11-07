package com.ehootu.flow.service;

import java.util.List;
import java.util.Map;

import com.ehootu.flow.model.WechatPlatformWorkEntity;

/**
 * 建筑工地流口管理微信平台工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:08
 */
public interface WechatPlatformWorkService {
	
	WechatPlatformWorkEntity queryObject(String id);
	
	List<WechatPlatformWorkEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);

	void save(WechatPlatformWorkEntity wechatPlatformWork, String pageName);

	void update(WechatPlatformWorkEntity wechatPlatformWork);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
