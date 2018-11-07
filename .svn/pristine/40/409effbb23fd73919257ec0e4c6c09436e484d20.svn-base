package com.ehootu.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ehootu.sys.dao.DmdzDao;
import com.ehootu.sys.entity.DmdzEntity;
import com.ehootu.sys.service.DmdzService;



@Service("dmdzService")
public class DmdzServiceImpl implements DmdzService {
	@Autowired
	private DmdzDao dmdzDao;
	
	@Override
	public DmdzEntity queryObject(Integer dmdzId){
		return dmdzDao.queryObject(dmdzId);
	}
	
	@Override
	public List<DmdzEntity> queryList(Map<String, Object> map){
		return dmdzDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return dmdzDao.queryTotal(map);
	}
	
	@Override
	public void save(DmdzEntity dmdz){
		dmdzDao.save(dmdz);
	}
	
	@Override
	public void update(DmdzEntity dmdz){
		dmdzDao.update(dmdz);
	}
	
	@Override
	public void delete(Integer dmdzId){
		dmdzDao.delete(dmdzId);
	}
	
	@Override
	public void deleteBatch(Integer[] dmdzIds){
		dmdzDao.deleteBatch(dmdzIds);
	}
	
}
