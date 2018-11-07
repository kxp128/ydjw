package com.ehootu.notice.service;

import com.ehootu.notice.entity.NoticePoliceEntity;
import com.ehootu.notice.model.NoticePolice;

import java.util.List;
import java.util.Map;

/**
 * 消息与人员的关联表
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-29 10:17:49
 */
public interface NoticePoliceService {
	
	NoticePoliceEntity queryObject(String id);
	
	List<NoticePoliceEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NoticePoliceEntity noticePolice);
	
	void update(NoticePoliceEntity noticePolice);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

	void saveOrUpdate(String noticeId, List<String> policeIdList);

	List<String> queryPoliceIdList(String noticeId);

	NoticePoliceEntity queryNoticePolice(Map<String, Object> map);

}
