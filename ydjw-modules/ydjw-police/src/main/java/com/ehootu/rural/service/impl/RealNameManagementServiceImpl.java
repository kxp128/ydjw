package com.ehootu.rural.service.impl;

import com.ehootu.core.util.StringUtils;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.rural.dao.RealNameManagementDao;
import com.ehootu.rural.model.RealNameManagementEntity;
import com.ehootu.rural.service.RealNameManagementService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("realNameManagementService")
public class RealNameManagementServiceImpl implements RealNameManagementService {
	@Autowired
	private RealNameManagementDao realNameManagementDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;

	@Override
	public RealNameManagementEntity queryObject(String id){
		RealNameManagementEntity entity = realNameManagementDao.queryObject(id);
		// 获取检查人员
		String name = userService.findPoliceNameById(entity.getCheckPoliceId());
		entity.setExaminer(name);
		return entity;
	}
	
	@Override
	public List<RealNameManagementEntity> queryList(Map<String, Object> map){
		return realNameManagementDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return realNameManagementDao.queryTotal(map);
	}

	@Override
	public void save(RealNameManagementEntity realNameManagement, PublicInformationEntity publicEntity, String pageName) {
		// 添加 企业基本信息
		String publicId = publicInformationService.saveUpdate(publicEntity);
		// 添加 旅店、网吧实名管理工作记录 real_name_management
		realNameManagement.setInspectionTime(new Date());
		realNameManagement.setCreateTime(new Date());
		realNameManagement.setPublicId(publicId);
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(realNameManagement.getCheckPoliceId());
		realNameManagement.setCheckPoliceId(inspectors);
		realNameManagementDao.saveAndGetId(realNameManagement);
		// 关联任务中间表
		if (realNameManagement.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(realNameManagement.getTaskId());
			taskExecution.setTableId(realNameManagement.getId());
			taskExecution.setTableName("real_name_management");
			taskExecution.setSonTaskName("旅店、网吧实名管理工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(realNameManagement.getCheckPoliceId());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(RealNameManagementEntity realNameManagement){
		realNameManagementDao.update(realNameManagement);
	}

	@Override
	public void delete(String id){
		realNameManagementDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		realNameManagementDao.deleteBatch(ids);
	}

}
