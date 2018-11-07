package com.ehootu.park.service.impl;

import com.ehootu.core.util.StringUtils;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.dao.BusinessStabilityDao;
import com.ehootu.park.model.BusinessStabilityEntity;
import com.ehootu.park.service.BusinessStabilityService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("businessStabilityService")
public class BusinessStabilityServiceImpl implements BusinessStabilityService {
	@Autowired
	private BusinessStabilityDao businessStabilityDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private UserService userService;
	@Autowired
	private SysDictionaryService dictionaryService;
	@Autowired
	private TaskService taskService;

	@Override
	public BusinessStabilityEntity queryObject(String id){
		BusinessStabilityEntity entity = businessStabilityDao.queryObject(id);
		// 收集人员
		String policeName = userService.findPoliceNameById(entity.getCollector());
		entity.setCollectorName(policeName);
		// 生产经营状况
		String scjyzk = dictionaryService.getSysDictName(SysDictionary.YQQYWWXXSJ_SCJYZK, entity.getManagementStatus());
		entity.setManagementStatusName(scjyzk);
		return entity;
	}
	
	@Override
	public List<BusinessStabilityEntity> queryList(Map<String, Object> map){
		return businessStabilityDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return businessStabilityDao.queryTotal(map);
	}

	@Override
	public void save(BusinessStabilityEntity businessStability){
		businessStabilityDao.save(businessStability);
	}

	@Override
	public void save(BusinessStabilityEntity businessStability, String pageName) {
		// 添加 园区企业维稳信息记录
		businessStability.setCollectionTime(new Date());
		businessStability.setDate(new Date());
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(businessStability.getCollector());
		businessStability.setCollector(inspectors);
		businessStabilityDao.saveAndGetId(businessStability);
		// 关联任务中间表
		if (businessStability.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(businessStability.getTaskId());
			taskExecution.setTableId(businessStability.getId());
			taskExecution.setTableName("business_stability");
			taskExecution.setSonTaskName("园区企业维稳信息记录");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(businessStability.getCollector());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(BusinessStabilityEntity businessStability){
		businessStabilityDao.update(businessStability);
	}

	@Override
	public void delete(String id){
		businessStabilityDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		businessStabilityDao.deleteBatch(ids);
	}

	@Override
	public List<BusinessStabilityEntity> select(String id) {
		return businessStabilityDao.select(id);
	}

	@Override
	public List<BusinessStabilityEntity> selectOne(String dizhibianma) {
		return businessStabilityDao.selectOne(dizhibianma);
	}

	@Override
	public List<BusinessStabilityEntity> selectAddress(String enterprise_address) {
		return businessStabilityDao.selectAddress(enterprise_address);
	}
	
}
