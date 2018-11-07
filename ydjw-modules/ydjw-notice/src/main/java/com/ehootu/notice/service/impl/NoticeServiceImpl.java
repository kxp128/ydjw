package com.ehootu.notice.service.impl;

import com.ehootu.notice.service.NoticePoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ehootu.notice.dao.NoticeDao;
import com.ehootu.notice.entity.NoticeEntity;
import com.ehootu.notice.service.NoticeService;
import org.springframework.transaction.annotation.Transactional;


@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeDao noticeDao;
	@Autowired
	private NoticePoliceService noticePoliceService;
	
	@Override
	public NoticeEntity queryObject(String id){
		return noticeDao.queryObject(id);
	}
	
	@Override
	public List<NoticeEntity> queryList(Map<String, Object> map){
		return noticeDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return noticeDao.queryTotal(map);
	}
	
	@Override
	@Transactional
	public void save(NoticeEntity notice){
		noticeDao.save(notice);

		noticePoliceService.saveOrUpdate(notice.getId(),notice.getPoliceIdList());
	}
	
	@Override
	@Transactional
	public void update(NoticeEntity notice){
		noticeDao.update(notice);

		noticePoliceService.saveOrUpdate(notice.getId(),notice.getPoliceIdList());
	}
	
	@Override
	public void delete(String id){
		noticeDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		noticeDao.deleteBatch(ids);

		noticePoliceService.deleteBatch(ids);
	}

	@Override
	public List<NoticeEntity> queryListByPolice(String policeId) {
		return noticeDao.queryListByPolice(policeId);
	}
}
