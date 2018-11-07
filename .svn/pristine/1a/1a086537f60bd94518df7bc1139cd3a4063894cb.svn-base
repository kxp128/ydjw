package com.ehootu.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ehootu.sys.dao.RedPacketSendLogDao;
import com.ehootu.sys.entity.RedPacketSendLogEntity;
import com.ehootu.sys.service.RedPacketSendLogService;



@Service("redPacketSendLogService")
public class RedPacketSendLogServiceImpl implements RedPacketSendLogService {
	@Autowired
	private RedPacketSendLogDao redPacketSendLogDao;
	
	@Override
	public RedPacketSendLogEntity queryObject(Integer id){
		return redPacketSendLogDao.queryObject(id);
	}
	
	@Override
	public List<RedPacketSendLogEntity> queryList(Map<String, Object> map){
		return redPacketSendLogDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return redPacketSendLogDao.queryTotal(map);
	}
	
	@Override
	public void save(RedPacketSendLogEntity redPacketSendLog){
		redPacketSendLogDao.save(redPacketSendLog);
	}
	
	@Override
	public void update(RedPacketSendLogEntity redPacketSendLog){
		redPacketSendLogDao.update(redPacketSendLog);
	}
	
	@Override
	public void delete(Integer id){
		redPacketSendLogDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		redPacketSendLogDao.deleteBatch(ids);
	}
	
}
