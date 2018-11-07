package com.ehootu.flow.service.impl;

import com.ehootu.flow.dao.RiskAssessmentDao;
import com.ehootu.flow.model.RiskAssessmentEntity;
import com.ehootu.flow.service.RiskAssessmentService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 工程项目风险评估
 */
@Service("riskAssessmentService")
public class RiskAssessmentServiceImpl implements RiskAssessmentService {
	@Autowired
	private RiskAssessmentDao riskAssessmentDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public RiskAssessmentEntity queryObject(String id){
		return riskAssessmentDao.queryObject(id);
	}
	
	@Override
	public List<RiskAssessmentEntity> queryList(Map<String, Object> map){
		return riskAssessmentDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return riskAssessmentDao.queryTotal(map);
	}

	@Override
	public void save(RiskAssessmentEntity riskAssessment, String pageName) {
		// 添加 工程项目风险评估 记录 risk_assessment
		riskAssessment.setCreateTime(new Date());
		riskAssessmentDao.saveAndGetId(riskAssessment);
		// 关联任务中间表
		if (riskAssessment.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(riskAssessment.getTaskId());
			taskExecution.setTableId(riskAssessment.getId());
			taskExecution.setTableName("risk_assessment");
			taskExecution.setSonTaskName("工程项目风险评估");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(riskAssessment.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(RiskAssessmentEntity riskAssessment){
		riskAssessmentDao.update(riskAssessment);
	}
	
	@Override
	public void delete(String id){
		riskAssessmentDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		riskAssessmentDao.deleteBatch(ids);
	}
	
}
