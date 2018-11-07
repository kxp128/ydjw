package com.ehootu.correct.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehootu.correct.dao.ControlWorkDao;
import com.ehootu.correct.model.ControlWorkEntity;
import com.ehootu.correct.service.ControlWorkService;



@Service("controlWorkService")
public class ControlWorkServiceImpl implements ControlWorkService {
	@Autowired
	private ControlWorkDao controlWorkDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public ControlWorkEntity queryObject(String id){
		return controlWorkDao.queryObject(id);
	}
	
	@Override
	public List<ControlWorkEntity> queryList(Map<String, Object> map){
		return controlWorkDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return controlWorkDao.queryTotal(map);
	}
	
	@Override
	public void save(ControlWorkEntity controlWork, String pageName){
		// 添加 重点人员动态管控工作记录 control_work
		controlWork.setCreateTime(new Date());
		controlWorkDao.saveAndGetId(controlWork);
		// 关联任务中间表
		if (controlWork.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(controlWork.getTaskId());
			taskExecution.setTableId(controlWork.getId());
			taskExecution.setTableName("control_work");
			taskExecution.setSonTaskName("重点人员动态管控工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(controlWork.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}
	
	@Override
	public void update(ControlWorkEntity controlWork){
		controlWorkDao.update(controlWork);
	}
	
	@Override
	public void delete(String id){
		controlWorkDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		controlWorkDao.deleteBatch(ids);
	}
	
}
