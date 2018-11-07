package com.ehootu.flow.service.impl;

import com.ehootu.flow.dao.AccountabilityWorkDao;
import com.ehootu.flow.model.AccountabilityWorkEntity;
import com.ehootu.flow.service.AccountabilityWorkService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("accountabilityWorkService")
public class AccountabilityWorkServiceImpl implements AccountabilityWorkService {
	@Autowired
	private AccountabilityWorkDao accountabilityWorkDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public AccountabilityWorkEntity queryObject(String id){
		return accountabilityWorkDao.queryObject(id);
	}
	
	@Override
	public List<AccountabilityWorkEntity> queryList(Map<String, Object> map){
		return accountabilityWorkDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return accountabilityWorkDao.queryTotal(map);
	}
	
	@Override
	public void save(AccountabilityWorkEntity accountabilityWork, String pageName) {
		// 添加 村组干部维稳问责工作记录 accountability_work
		accountabilityWork.setCreateTime(new Date());
		accountabilityWorkDao.saveAndGetId(accountabilityWork);
		// 关联 任务中间表
		if (accountabilityWork.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(accountabilityWork.getTaskId());
			taskExecution.setTableId(accountabilityWork.getId());
			taskExecution.setTableName("accountability_work");
			taskExecution.setSonTaskName("村组干部维稳问责工作记录");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(accountabilityWork.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(AccountabilityWorkEntity accountabilityWork){
		accountabilityWorkDao.update(accountabilityWork);
	}
	
	@Override
	public void delete(String id){
		accountabilityWorkDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		accountabilityWorkDao.deleteBatch(ids);
	}
	
}
