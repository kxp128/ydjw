package com.ehootu.notice.service;

import com.ehootu.notice.entity.NoticeEntity;

import java.util.List;
import java.util.Map;

/**
 * 通知消息
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-29 10:17:49
 */
public interface NoticeService {
	
	NoticeEntity queryObject(String id);
	
	List<NoticeEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NoticeEntity notice);
	
	void update(NoticeEntity notice);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

	List<NoticeEntity> queryListByPolice(String policeId);
}
