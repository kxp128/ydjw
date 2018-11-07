package com.ehootu.rural.service.impl;

import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.rural.dao.TrafficControlDao;
import com.ehootu.rural.model.TrafficControlEntity;
import com.ehootu.rural.service.TrafficControlService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("trafficControlService")
public class TrafficControlServiceImpl implements TrafficControlService {
	@Autowired
	private TrafficControlDao trafficControlDao;
	@Autowired
	private SysDictionaryService dictionaryService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public TrafficControlEntity queryObject(String id){
		TrafficControlEntity entity = trafficControlDao.queryObject(id);
		return entity;
	}
	
	@Override
	public List<TrafficControlEntity> queryList(Map<String, Object> map){
		return trafficControlDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return trafficControlDao.queryTotal(map);
	}
	
	@Override
	public void save(TrafficControlEntity trafficControl, String pageName){
		// 农村道路交通管理工作记录 traffic_control
		trafficControl.setCreateTime(new Date());
		trafficControlDao.saveAndGetId(trafficControl);
		// 关联任务中间表
		if (trafficControl.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(trafficControl.getTaskId());
			taskExecution.setTableId(trafficControl.getId());
			taskExecution.setTableName("traffic_control");
			taskExecution.setSonTaskName("农村道路交通管理工作记录");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(trafficControl.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}
	
	@Override
	public void update(TrafficControlEntity trafficControl){
		trafficControlDao.update(trafficControl);
	}
	
	@Override
	public void delete(String id){
		trafficControlDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		trafficControlDao.deleteBatch(ids);
	}
	
}
