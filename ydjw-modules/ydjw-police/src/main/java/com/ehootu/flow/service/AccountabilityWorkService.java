package com.ehootu.flow.service;

import java.util.List;
import java.util.Map;

import com.ehootu.flow.model.AccountabilityWorkEntity;

/**
 * 村组干部维稳问责工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:38
 */
public interface AccountabilityWorkService {
	
	AccountabilityWorkEntity queryObject(String id);
	
	List<AccountabilityWorkEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(AccountabilityWorkEntity accountabilityWork, String pageName);

	void update(AccountabilityWorkEntity accountabilityWork);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
