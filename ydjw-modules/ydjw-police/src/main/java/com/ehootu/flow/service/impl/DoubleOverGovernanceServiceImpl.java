package com.ehootu.flow.service.impl;

import com.ehootu.core.util.StringUtils;
import com.ehootu.flow.dao.DoubleOverGovernanceDao;
import com.ehootu.flow.model.DoubleOverGovernanceEntity;
import com.ehootu.flow.service.DoubleOverGovernanceService;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("doubleOverGovernanceService")
public class DoubleOverGovernanceServiceImpl implements DoubleOverGovernanceService {
	@Autowired
	private DoubleOverGovernanceDao doubleOverGovernanceDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public DoubleOverGovernanceEntity queryObject(String id){
		DoubleOverGovernanceEntity entity = doubleOverGovernanceDao.queryObject(id);
		// 获取检查人
		String name = userService.findPoliceNameById(entity.getCheckPoliceId());
		entity.setInspectionName(name);
		return entity;
	}
	
	@Override
	public List<DoubleOverGovernanceEntity> queryList(Map<String, Object> map){
		return doubleOverGovernanceDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return doubleOverGovernanceDao.queryTotal(map);
	}
	
	@Override
	public void save(DoubleOverGovernanceEntity doubleOverGovernance, PublicInformationEntity publicEntity, String pageName) {
		// 添加 企业基本信息
		String publicId = publicInformationService.saveUpdate(publicEntity);
		// 添加 流动警务室建筑工地双超治理情况记录 double_over_governance
		doubleOverGovernance.setCreateTime(new Date());
		doubleOverGovernance.setInspectionTime(new Date());
		doubleOverGovernance.setPublicId(publicId);
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(doubleOverGovernance.getCheckPoliceId());
		doubleOverGovernance.setCheckPoliceId(inspectors);
		doubleOverGovernanceDao.saveAndGetId(doubleOverGovernance);
		// 关联 任务中间表
		if (doubleOverGovernance.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(doubleOverGovernance.getTaskId());
			taskExecution.setTableId(doubleOverGovernance.getId());
			taskExecution.setTableName("double_over_governance");
			taskExecution.setSonTaskName("流动警务室建筑工地双超治理情况");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(doubleOverGovernance.getCheckPoliceId());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(DoubleOverGovernanceEntity doubleOverGovernance){
		doubleOverGovernanceDao.update(doubleOverGovernance);
	}
	
	@Override
	public void delete(String id){
		doubleOverGovernanceDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		doubleOverGovernanceDao.deleteBatch(ids);
	}
	
}
