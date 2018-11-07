package com.ehootu.flow.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehootu.flow.dao.BlockingEventDao;
import com.ehootu.flow.model.BlockingEventEntity;
import com.ehootu.flow.service.BlockingEventService;



@Service("blockingEventService")
public class BlockingEventServiceImpl implements BlockingEventService {
	@Autowired
	private BlockingEventDao blockingEventDao;
	
	@Override
	public BlockingEventEntity queryObject(String id){
		return blockingEventDao.queryObject(id);
	}
	
	@Override
	public List<BlockingEventEntity> queryList(Map<String, Object> map){
		return blockingEventDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return blockingEventDao.queryTotal(map);
	}
	
	@Override
	public void save(BlockingEventEntity blockingEvent, String pageName) {
		blockingEventDao.saveAndGetId(blockingEvent);
	}

	@Override
	public void update(BlockingEventEntity blockingEvent){
		blockingEventDao.update(blockingEvent);
	}
	
	@Override
	public void delete(String id){
		blockingEventDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		blockingEventDao.deleteBatch(ids);
	}
	
}
