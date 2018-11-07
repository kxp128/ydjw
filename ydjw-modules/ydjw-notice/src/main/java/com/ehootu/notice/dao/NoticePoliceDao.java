package com.ehootu.notice.dao;

import com.ehootu.core.util.BaseDao;
import com.ehootu.notice.entity.NoticePoliceEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 消息与人员的关联表
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-29 10:17:49
 */
@Repository
public interface NoticePoliceDao extends BaseDao<NoticePoliceEntity> {

    List<String> queryPoliceIdList(String noticeId);

    NoticePoliceEntity queryNoticePolice(Map<String, Object> map);
	
}
