package com.ehootu.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ehootu.sys.dao.ErrorDistanceSettingDao;
import com.ehootu.sys.entity.ErrorDistanceSettingEntity;
import com.ehootu.sys.service.ErrorDistanceSettingService;



@Service("errorDistanceSettingService")
public class ErrorDistanceSettingServiceImpl implements ErrorDistanceSettingService {
	@Autowired
	private ErrorDistanceSettingDao errorDistanceSettingDao;
	
	@Override
	public ErrorDistanceSettingEntity queryObject(Integer id){
		return errorDistanceSettingDao.queryObject(id);
	}
	
	@Override
	public List<ErrorDistanceSettingEntity> queryList(Map<String, Object> map){
		return errorDistanceSettingDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return errorDistanceSettingDao.queryTotal(map);
	}
	
	@Override
	public void save(ErrorDistanceSettingEntity errorDistanceSetting){
		errorDistanceSettingDao.save(errorDistanceSetting);
	}
	
	@Override
	public void update(ErrorDistanceSettingEntity errorDistanceSetting){
		errorDistanceSettingDao.update(errorDistanceSetting);
	}
	
	@Override
	public void delete(Integer id){
		errorDistanceSettingDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		errorDistanceSettingDao.deleteBatch(ids);
	}
	
}
