package com.ehootu.rural.service.impl;

import com.ehootu.rural.dao.PatrolRecordDao;
import com.ehootu.rural.model.PatrolRecordEntity;
import com.ehootu.rural.service.PatrolRecordService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("patrolRecordService")
public class PatrolRecordServiceImpl implements PatrolRecordService {
	@Autowired
	private PatrolRecordDao patrolRecordDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public PatrolRecordEntity queryObject(String id){
		return patrolRecordDao.queryObject(id);
	}
	
	@Override
	public List<PatrolRecordEntity> queryList(Map<String, Object> map){
		return patrolRecordDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return patrolRecordDao.queryTotal(map);
	}
	
	@Override
	public void save(PatrolRecordEntity patrolRecord, String pageName){
		// 添加 可防性案件巡逻防控管理 patrol_record
		patrolRecord.setCreateTime(new Date());
		patrolRecordDao.saveAndGetId(patrolRecord);
		// 关联任务中间表
		if (patrolRecord.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(patrolRecord.getTaskId());
			taskExecution.setTableId(patrolRecord.getId());
			taskExecution.setTableName("patrol_record");
			taskExecution.setSonTaskName("可防性案件巡逻防控管理");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(patrolRecord.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}
	
	@Override
	public void update(PatrolRecordEntity patrolRecord){
		patrolRecordDao.update(patrolRecord);
	}
	
	@Override
	public void delete(String id){
		patrolRecordDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		patrolRecordDao.deleteBatch(ids);
	}

}
