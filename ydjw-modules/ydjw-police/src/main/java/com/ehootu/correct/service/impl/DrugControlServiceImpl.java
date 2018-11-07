package com.ehootu.correct.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehootu.correct.dao.DrugControlDao;
import com.ehootu.correct.model.DrugControlEntity;
import com.ehootu.correct.service.DrugControlService;



@Service("drugControlService")
public class DrugControlServiceImpl implements DrugControlService {
	@Autowired
	private DrugControlDao drugControlDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public DrugControlEntity queryObject(String id){
		return drugControlDao.queryObject(id);
	}
	
	@Override
	public List<DrugControlEntity> queryList(Map<String, Object> map){
		return drugControlDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return drugControlDao.queryTotal(map);
	}
	
	@Override
	public void save(DrugControlEntity drugControl, String pageName){
		// 添加 吸毒类重点人员动态管控 drug_control
		drugControl.setCreateTime(new Date());
		drugControlDao.saveAndGetId(drugControl);
		// 关联任务中间表
		if (drugControl.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(drugControl.getTaskId());
			taskExecution.setTableId(drugControl.getId());
			taskExecution.setTableName("drug_control");
			taskExecution.setSonTaskName("吸毒类重点人员动态管控");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(drugControl.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}
	
	@Override
	public void update(DrugControlEntity drugControl){
		drugControlDao.update(drugControl);
	}
	
	@Override
	public void delete(String id){
		drugControlDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		drugControlDao.deleteBatch(ids);
	}
	
}
