package com.ehootu.notice.service.impl;

import com.ehootu.notice.model.NoticePolice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.ehootu.notice.dao.NoticePoliceDao;
import com.ehootu.notice.entity.NoticePoliceEntity;
import com.ehootu.notice.service.NoticePoliceService;



@Service("noticePoliceService")
public class NoticePoliceServiceImpl implements NoticePoliceService {
	@Autowired
	private NoticePoliceDao noticePoliceDao;

	@Override
	public NoticePoliceEntity queryObject(String id){
		return noticePoliceDao.queryObject(id);
	}
	
	@Override
	public List<NoticePoliceEntity> queryList(Map<String, Object> map){
		return noticePoliceDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return noticePoliceDao.queryTotal(map);
	}
	
	@Override
	public void save(NoticePoliceEntity noticePolice){
		noticePoliceDao.save(noticePolice);
	}
	
	@Override
	public void update(NoticePoliceEntity noticePolice){
		noticePoliceDao.update(noticePolice);
	}
	
	@Override
	public void delete(String id){
		noticePoliceDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		noticePoliceDao.deleteBatch(ids);
	}

	@Override
	public void saveOrUpdate(String noticeId, List<String> policeIdList) {
		//先删除通知和警察关系
		noticePoliceDao.delete(noticeId);

		if(policeIdList.size() == 0){
			return ;
		}
		//保存通知和警察关系
		Map<String, Object> map = new HashMap<>();
		List<Map<String, Object>> list = new ArrayList<>();
		for(String string:policeIdList){
			Map<String,Object> police = new HashMap();
			police.put("id", UUID.randomUUID().toString());
			police.put("policeId",string);
			list.add(police);
		}
		map.put("noticeId", noticeId);
		map.put("policeIdList", list);
		noticePoliceDao.save(map);
	}

	@Override
	public List<String> queryPoliceIdList(String noticeId) {
		return noticePoliceDao.queryPoliceIdList(noticeId);
	}

	@Override
	public NoticePoliceEntity queryNoticePolice(Map<String, Object> map) {
		return noticePoliceDao.queryNoticePolice(map);
	}
}
