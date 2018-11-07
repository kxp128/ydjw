package com.ehootu.flow.service;

import java.util.List;
import java.util.Map;

import com.ehootu.flow.model.BlockingEventEntity;

/**
 * 工程项目阻工事件记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:45
 */
public interface BlockingEventService {
	
	BlockingEventEntity queryObject(String id);
	
	List<BlockingEventEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(BlockingEventEntity blockingEvent, String pageName);

	void update(BlockingEventEntity blockingEvent);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
