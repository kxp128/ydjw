package com.ehootu.park.service.impl;

import com.ehootu.park.dao.EnterprisePlatformWorkDao;
import com.ehootu.park.model.EnterprisePlatformWorkEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.EnterprisePlatformWorkService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("EnterprisePlatformWorkService")
public class EnterprisePlatformWorkServiceImpl implements EnterprisePlatformWorkService {
	@Autowired
	private EnterprisePlatformWorkDao EnterprisePlatformWorkDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public EnterprisePlatformWorkEntity queryObject(String id){
		return EnterprisePlatformWorkDao.queryObject(id);
	}
	
	@Override
	public List<EnterprisePlatformWorkEntity> queryList(Map<String, Object> map){
		return EnterprisePlatformWorkDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return EnterprisePlatformWorkDao.queryTotal(map);
	}
	
	@Override
	public void save(EnterprisePlatformWorkEntity EnterprisePlatformWork){
		EnterprisePlatformWorkDao.save(EnterprisePlatformWork);
	}
	
	@Override
	public void update(EnterprisePlatformWorkEntity EnterprisePlatformWork){
		EnterprisePlatformWorkDao.update(EnterprisePlatformWork);
	}
	
	@Override
	public void delete(String id){
		EnterprisePlatformWorkDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		EnterprisePlatformWorkDao.deleteBatch(ids);
	}

	@Override
	public List<EnterprisePlatformWorkEntity> select(String id) {
		return EnterprisePlatformWorkDao.select(id);
	}

	@Override
	public List<EnterprisePlatformWorkEntity> selectOne(String dizhibianma) {
		return EnterprisePlatformWorkDao.selectOne(dizhibianma);
	}

	@Override
	public List<EnterprisePlatformWorkEntity> selectAddress(String enterprise_address) {
		return EnterprisePlatformWorkDao.selectAddress(enterprise_address);
	}

	@Override
	public void save(EnterprisePlatformWorkEntity enterprisePlatformWork, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加 园区企业流口管理微信平台工作记录信息
		enterprisePlatformWork.setDate(new Date());
		enterprisePlatformWork.setPublicId(publicId);
		EnterprisePlatformWorkDao.saveAndGetId(enterprisePlatformWork);
		// 关联任务中间表
		if (enterprisePlatformWork.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(enterprisePlatformWork.getTaskId());
			taskExecution.setTableId(enterprisePlatformWork.getId());
			taskExecution.setTableName("wechat_platform_work");
			taskExecution.setSonTaskName("园区企业流口管理微信平台工作记录");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(enterprisePlatformWork.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

}
