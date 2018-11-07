package com.ehootu.core.util;

import java.util.List;
import java.util.Map;

/**
 * 基础Dao(还需在XML文件里，有对应的SQL语句)
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:31:36
 */
public interface BaseDao<T> {
	//添加
	void save(T t);
	
	void save(Map<String, Object> map);

	int saveAndGetId(T t);
	
	void saveBatch(List<T> list);
	
	//修改
	int update(T t);
	
	int update(Map<String, Object> map);
	//删除
	int delete(Object id);
	
	int delete(Map<String, Object> map);
	
	int deleteBatch(Object[] id);
	
	List<T> getAll();

	T queryObject(Object id);
	//获取列表数据
	List<T> queryList(Map<String, Object> map);
	//获取查询数据
	List<T> queryNummber();
	//根据id获取数据
	List<T> queryList(Object id);
	//分页
	int queryTotal(Map<String, Object> map);

	int queryTotal();
}
