package com.ehootu.correct.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehootu.correct.dao.IncontrollableDrugControlDao;
import com.ehootu.correct.model.IncontrollableDrugControlEntity;
import com.ehootu.correct.service.IncontrollableDrugControlService;



@Service("incontrollableDrugControlService")
public class IncontrollableDrugControlServiceImpl implements IncontrollableDrugControlService {
	@Autowired
	private IncontrollableDrugControlDao incontrollableDrugControlDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public IncontrollableDrugControlEntity queryObject(String id){
		return incontrollableDrugControlDao.queryObject(id);
	}
	
	@Override
	public List<IncontrollableDrugControlEntity> queryList(Map<String, Object> map){
		return incontrollableDrugControlDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return incontrollableDrugControlDao.queryTotal(map);
	}
	
	@Override
	public void save(IncontrollableDrugControlEntity incontrollableDrugControl, String pageName){
		// 添加 失控吸毒类重点人员动态管控工作记录 incontrollable_drug_control
		incontrollableDrugControl.setCreateTime(new Date());
		incontrollableDrugControlDao.saveAndGetId(incontrollableDrugControl);
		// 关联任务中间表
		if (incontrollableDrugControl.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(incontrollableDrugControl.getTaskId());
			taskExecution.setTableId(incontrollableDrugControl.getId());
			taskExecution.setTableName("incontrollable_drug_control");
			taskExecution.setSonTaskName("失控吸毒类重点人员动态管控工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(incontrollableDrugControl.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}
	
	@Override
	public void update(IncontrollableDrugControlEntity incontrollableDrugControl){
		incontrollableDrugControlDao.update(incontrollableDrugControl);
	}
	
	@Override
	public void delete(String id){
		incontrollableDrugControlDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		incontrollableDrugControlDao.deleteBatch(ids);
	}
	
}
