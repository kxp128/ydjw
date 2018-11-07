package com.ehootu.dictionary.service.impl;

import com.ehootu.dictionary.dao.SysDictionaryDao;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("sysDictionaryService")
public class SysDictionaryServiceImpl implements SysDictionaryService {
	@Autowired
	private SysDictionaryDao sysDictionaryDao;

	@Override
	public SysDictionary queryObject(String id){
		return sysDictionaryDao.queryObject(id);
	}

	@Override
	public List<SysDictionary> queryList(Map<String, Object> map){
		return sysDictionaryDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map){
		return sysDictionaryDao.queryTotal(map);
	}

	@Override
	public void save(SysDictionary controlWork){
		sysDictionaryDao.save(controlWork);
	}

	@Override
	public void update(SysDictionary controlWork){
		sysDictionaryDao.update(controlWork);
	}

	@Override
	public void delete(String id){
		sysDictionaryDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		sysDictionaryDao.deleteBatch(ids);
	}

	@Override
	public SysDictionary getSysDictionary(String type, String value) {
		return sysDictionaryDao.getSysDictionary(type, value);
	}

	@Override
	public String getSysDictName(String type, String value) {
		SysDictionary sysDictionary = sysDictionaryDao.getSysDictionary(type, value);
		if(sysDictionary!=null){
			return  sysDictionary.getName();
		}else{
			return null;
		}
	}

	@Override
	public List<SysDictionary> selectListByType(String type) {
		return sysDictionaryDao.selectListByType(type);
	}

}
