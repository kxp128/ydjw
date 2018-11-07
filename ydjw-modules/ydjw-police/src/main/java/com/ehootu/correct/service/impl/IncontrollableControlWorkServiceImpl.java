package com.ehootu.correct.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehootu.correct.dao.IncontrollableControlWorkDao;
import com.ehootu.correct.model.IncontrollableControlWorkEntity;
import com.ehootu.correct.service.IncontrollableControlWorkService;



@Service("incontrollableControlWorkService")
public class IncontrollableControlWorkServiceImpl implements IncontrollableControlWorkService {
	@Autowired
	private IncontrollableControlWorkDao incontrollableControlWorkDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public IncontrollableControlWorkEntity queryObject(String id){
		return incontrollableControlWorkDao.queryObject(id);
	}
	
	@Override
	public List<IncontrollableControlWorkEntity> queryList(Map<String, Object> map){
		return incontrollableControlWorkDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return incontrollableControlWorkDao.queryTotal(map);
	}
	
	@Override
	public void save(IncontrollableControlWorkEntity incontrollableControlWork, String pageName){
		// 添加 失控重点人员动态管控工作记录 incontrollable_control_work
		incontrollableControlWork.setCreateTime(new Date());
		incontrollableControlWorkDao.saveAndGetId(incontrollableControlWork);
		// 关联任务中间表
		if (incontrollableControlWork.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(incontrollableControlWork.getTaskId());
			taskExecution.setTableId(incontrollableControlWork.getId());
			taskExecution.setTableName("incontrollable_control_work");
			taskExecution.setSonTaskName("失控重点人员动态管控工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(incontrollableControlWork.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}
	
	@Override
	public void update(IncontrollableControlWorkEntity incontrollableControlWork){
		incontrollableControlWorkDao.update(incontrollableControlWork);
	}
	
	@Override
	public void delete(String id){
		incontrollableControlWorkDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		incontrollableControlWorkDao.deleteBatch(ids);
	}
	
}
