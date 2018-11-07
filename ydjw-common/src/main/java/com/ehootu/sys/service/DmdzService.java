package com.ehootu.sys.service;

import com.ehootu.sys.entity.DmdzEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-25 17:07:18
 */
public interface DmdzService {
	
	DmdzEntity queryObject(Integer dmdzId);
	
	List<DmdzEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(DmdzEntity dmdz);
	
	void update(DmdzEntity dmdz);
	
	void delete(Integer dmdzId);
	
	void deleteBatch(Integer[] dmdzIds);
}
