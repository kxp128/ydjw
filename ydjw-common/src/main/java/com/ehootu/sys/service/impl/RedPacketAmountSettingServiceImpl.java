package com.ehootu.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ehootu.sys.dao.RedPacketAmountSettingDao;
import com.ehootu.sys.entity.RedPacketAmountSettingEntity;
import com.ehootu.sys.service.RedPacketAmountSettingService;



@Service("redPacketAmountSettingService")
public class RedPacketAmountSettingServiceImpl implements RedPacketAmountSettingService {
	@Autowired
	private RedPacketAmountSettingDao redPacketAmountSettingDao;
	
	@Override
	public RedPacketAmountSettingEntity queryObject(Integer id){
		return redPacketAmountSettingDao.queryObject(id);
	}
	
	@Override
	public List<RedPacketAmountSettingEntity> queryList(Map<String, Object> map){
		return redPacketAmountSettingDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return redPacketAmountSettingDao.queryTotal(map);
	}
	
	@Override
	public void save(RedPacketAmountSettingEntity redPacketAmountSetting){
		redPacketAmountSettingDao.save(redPacketAmountSetting);
	}
	
	@Override
	public void update(RedPacketAmountSettingEntity redPacketAmountSetting){
		redPacketAmountSettingDao.update(redPacketAmountSetting);
	}
	
	@Override
	public void delete(Integer id){
		redPacketAmountSettingDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		redPacketAmountSettingDao.deleteBatch(ids);
	}
	
}
