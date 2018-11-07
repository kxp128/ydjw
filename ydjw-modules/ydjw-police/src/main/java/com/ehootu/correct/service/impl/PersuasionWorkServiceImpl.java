package com.ehootu.correct.service.impl;

import com.ehootu.correct.dao.PersuasionWorkDao;
import com.ehootu.correct.model.PersuasionWorkEntity;
import com.ehootu.correct.service.PersuasionWorkService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("persuasionWorkService")
public class PersuasionWorkServiceImpl implements PersuasionWorkService {
	@Autowired
	private PersuasionWorkDao persuasionWorkDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public PersuasionWorkEntity queryObject(String id){
		return persuasionWorkDao.queryObject(id);
	}
	
	@Override
	public List<PersuasionWorkEntity> queryList(Map<String, Object> map){
		return persuasionWorkDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return persuasionWorkDao.queryTotal(map);
	}
	
	@Override
	public void save(PersuasionWorkEntity persuasionWork, String pageName){
		// 添加 “心连心”心理疏导工作站工作记录 persuasion_work
		persuasionWork.setCreateTime(new Date());
		persuasionWorkDao.saveAndGetId(persuasionWork);
		// 关联任务中间表
		if (persuasionWork.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(persuasionWork.getTaskId());
			taskExecution.setTableId(persuasionWork.getId());
			taskExecution.setTableName("persuasion_work");
			taskExecution.setSonTaskName("“心连心”心理疏导工作站工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(persuasionWork.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}
	
	@Override
	public void update(PersuasionWorkEntity persuasionWork){
		persuasionWorkDao.update(persuasionWork);
	}
	
	@Override
	public void delete(String id){
		persuasionWorkDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		persuasionWorkDao.deleteBatch(ids);
	}
	
}
