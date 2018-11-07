package com.ehootu.park.service.impl;

import com.ehootu.park.dao.AidWorkRecordDao;
import com.ehootu.park.model.AidWorkRecordEntity;
import com.ehootu.park.service.AidWorkRecordService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("aidWorkRecordService")
public class AidWorkRecordServiceImpl implements AidWorkRecordService {
	@Autowired
	private AidWorkRecordDao aidWorkRecordDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public AidWorkRecordEntity queryObject(String id){
		return aidWorkRecordDao.queryObject(id);
	}
	
	@Override
	public List<AidWorkRecordEntity> queryList(Map<String, Object> map){
		return aidWorkRecordDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return aidWorkRecordDao.queryTotal(map);
	}
	
	@Override
	public void save(AidWorkRecordEntity aidWorkRecord){
		// 添加 困难帮扶工作记录
		aidWorkRecordDao.saveAndGetId(aidWorkRecord);
	}

	@Override
	public void save(AidWorkRecordEntity aidWorkRecord, String pageName) {
		// 添加 困难帮扶工作记录
		aidWorkRecord.setHelpingTime(new Date());
		aidWorkRecord.setDate(new Date());
		aidWorkRecordDao.saveAndGetId(aidWorkRecord);
		// 关联任务中间表
		if (aidWorkRecord.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(aidWorkRecord.getTaskId());
			taskExecution.setTableId(aidWorkRecord.getId());
			taskExecution.setTableName("aid_work_record");
			taskExecution.setSonTaskName("困难帮扶工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(aidWorkRecord.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(AidWorkRecordEntity aidWorkRecord){
		aidWorkRecordDao.update(aidWorkRecord);
	}
	
	@Override
	public void delete(String id){
		aidWorkRecordDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		aidWorkRecordDao.deleteBatch(ids);
	}

	@Override
	public List<AidWorkRecordEntity> select(String id) {
		// TODO Auto-generated method stub
		return aidWorkRecordDao.select(id);
	}

	@Override
	public List<AidWorkRecordEntity> selectOne(String dizhibianma) {
		// TODO Auto-generated method stub
		return aidWorkRecordDao.selectOne(dizhibianma);
	}

	@Override
	public List<AidWorkRecordEntity> selectAddress(String enterprise_address) {
		// TODO Auto-generated method stub
		return aidWorkRecordDao.selectAddress(enterprise_address);
	}
	
}
