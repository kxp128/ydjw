package com.ehootu.flow.service;

import java.util.List;
import java.util.Map;

import com.ehootu.flow.model.RiskAssessmentEntity;

/**
 * 工程项目风险评估
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 15:10:26
 */
public interface RiskAssessmentService {
	
	RiskAssessmentEntity queryObject(String id);
	
	List<RiskAssessmentEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RiskAssessmentEntity riskAssessment, String pageName);

	void update(RiskAssessmentEntity riskAssessment);

	void delete(String id);

	void deleteBatch(Integer[] ids);
}
