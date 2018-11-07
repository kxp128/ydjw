package com.ehootu.flow.service.impl;

import com.ehootu.flow.dao.WechatPlatformWorkDao;
import com.ehootu.flow.model.WechatPlatformWorkEntity;
import com.ehootu.flow.service.WechatPlatformWorkService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("wechatPlatformWorkService")
public class WechatPlatformWorkServiceImpl implements WechatPlatformWorkService {
	@Autowired
	private WechatPlatformWorkDao wechatPlatformWorkDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public WechatPlatformWorkEntity queryObject(String id){
		return wechatPlatformWorkDao.queryObject(id);
	}
	
	@Override
	public List<WechatPlatformWorkEntity> queryList(Map<String, Object> map){
		return wechatPlatformWorkDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return wechatPlatformWorkDao.queryTotal(map);
	}

	@Override
	public void save(WechatPlatformWorkEntity wechatPlatformWork, String pageName) {
		// 添加 建筑工地流口管理微信平台工作记录 wechat_platform_work
		wechatPlatformWork.setCreateTime(new Date());
		wechatPlatformWorkDao.saveAndGetId(wechatPlatformWork);
		// 关联任务中间表
		if (wechatPlatformWork.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(wechatPlatformWork.getTaskId());
			taskExecution.setTableId(wechatPlatformWork.getId());
			taskExecution.setTableName("wechat_platform_work");
			taskExecution.setSonTaskName("建筑工地流口管理微信平台工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(wechatPlatformWork.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(WechatPlatformWorkEntity wechatPlatformWork){
		wechatPlatformWorkDao.update(wechatPlatformWork);
	}
	
	@Override
	public void delete(String id){
		wechatPlatformWorkDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		wechatPlatformWorkDao.deleteBatch(ids);
	}
	
}
