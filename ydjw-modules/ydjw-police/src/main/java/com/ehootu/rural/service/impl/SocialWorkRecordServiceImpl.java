package com.ehootu.rural.service.impl;

import com.ehootu.rural.dao.SocialWorkRecordDao;
import com.ehootu.rural.model.SocialWorkRecordEntity;
import com.ehootu.rural.service.SocialWorkRecordService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("socialWorkRecordService")
public class SocialWorkRecordServiceImpl implements SocialWorkRecordService {
	@Autowired
	private SocialWorkRecordDao socialWorkRecordDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public SocialWorkRecordEntity queryObject(String id){
		SocialWorkRecordEntity entity = socialWorkRecordDao.queryObject(id);
		return entity;
	}
	
	@Override
	public List<SocialWorkRecordEntity> queryList(Map<String, Object> map){
		return socialWorkRecordDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return socialWorkRecordDao.queryTotal(map);
	}
	
	@Override
	public void save(SocialWorkRecordEntity socialWorkRecord, String pageName){
		// 社情民意工作记录 social_work_record
		socialWorkRecord.setCreateTime(new Date());
		socialWorkRecordDao.saveAndGetId(socialWorkRecord);
		// 关联任务中间表
		if (socialWorkRecord.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(socialWorkRecord.getTaskId());
			taskExecution.setTableId(socialWorkRecord.getId());
			taskExecution.setTableName("social_work_record");
			taskExecution.setSonTaskName("社情民意工作记录");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(socialWorkRecord.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}
	
	@Override
	public void update(SocialWorkRecordEntity socialWorkRecord){
		socialWorkRecordDao.update(socialWorkRecord);
	}
	
	@Override
	public void delete(String id){
		socialWorkRecordDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		socialWorkRecordDao.deleteBatch(ids);
	}

}
