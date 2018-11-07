package com.ehootu.flow.service;

import java.util.List;
import java.util.Map;

import com.ehootu.flow.model.SixPartyTalksEntity;

/**
 * 流动警务室六方会谈工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:33
 */
public interface SixPartyTalksService {
	
	SixPartyTalksEntity queryObject(String id);
	
	List<SixPartyTalksEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SixPartyTalksEntity sixPartyTalks, String pageName);

	void update(SixPartyTalksEntity sixPartyTalks);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
