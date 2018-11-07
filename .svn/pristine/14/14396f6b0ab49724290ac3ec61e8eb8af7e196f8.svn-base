package com.ehootu.park.service.impl;

import com.ehootu.park.dao.EducationalWorkDao;
import com.ehootu.park.model.EducationalWorkEntity;
import com.ehootu.park.service.EducationalWorkService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("educationalWorkService")
public class EducationalWorkServiceImpl implements EducationalWorkService {
	@Autowired
	private EducationalWorkDao educationalWorkDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public EducationalWorkEntity queryObject(String id){
		return educationalWorkDao.queryObject(id);
	}
	
	@Override
	public List<EducationalWorkEntity> queryList(Map<String, Object> map){
		return educationalWorkDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return educationalWorkDao.queryTotal(map);
	}
	
	@Override
	public void save(EducationalWorkEntity educationalWork){
		// 添加 法制宣传教育工作记录
		educationalWorkDao.saveAndGetId(educationalWork);
	}

	@Override
	public void save(EducationalWorkEntity educationalWork, String pageName) {
		// 添加 法制宣传教育工作记录
		educationalWork.setPublicityTime(new Date());
		educationalWork.setDate(new Date());
		educationalWorkDao.saveAndGetId(educationalWork);
		// 关联任务中间表
		if (educationalWork.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(educationalWork.getTaskId());
			taskExecution.setTableId(educationalWork.getId());
			taskExecution.setTableName("educational_work");
			taskExecution.setSonTaskName("法制宣传教育工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(educationalWork.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(EducationalWorkEntity educationalWork){
		educationalWorkDao.update(educationalWork);
	}
	
	@Override
	public void delete(String id){
		educationalWorkDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		educationalWorkDao.deleteBatch(ids);
	}

	@Override
	public List<EducationalWorkEntity> select(String id) {
		// TODO Auto-generated method stub
		return educationalWorkDao.select(id);
	}

	@Override
	public List<EducationalWorkEntity> selectOne(String dizhibianma) {
		// TODO Auto-generated method stub
		return educationalWorkDao.selectOne(dizhibianma);
	}

	@Override
	public List<EducationalWorkEntity> selectAddress(String enterprise_address) {
		// TODO Auto-generated method stub
		return educationalWorkDao.selectAddress(enterprise_address);
	}
	
}
