package com.ehootu.dictionary.service;


import com.ehootu.dictionary.model.SysDictionary;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Liaoxb
 * @date 2017/12/1
 */
public interface SysDictionaryService {

	SysDictionary queryObject(String id);

	List<SysDictionary> queryList(Map<String, Object> map);

	int queryTotal(Map<String, Object> map);

	void save(SysDictionary controlWork);

	void update(SysDictionary controlWork);

	void delete(String id);

	void deleteBatch(Integer[] ids);
	/**
	 * 根据类型和值，获取 SysDictionary 实体
	 * @param type 类型
	 * @param value 值
	 * @return
	 */
    SysDictionary getSysDictionary(String type, String value);
	/**
	 * 根据类型和值，获取 name
	 * @param type 类型
	 * @param value 值
	 * @return
	 */
    String getSysDictName(String type, String value);
	/**
	 * 根据 type 查询类型list
	 * @param type 类型
	 * @return
	 */
	List<SysDictionary> selectListByType(String type);
}
