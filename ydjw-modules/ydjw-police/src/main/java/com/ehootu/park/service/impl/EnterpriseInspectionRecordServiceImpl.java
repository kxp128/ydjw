package com.ehootu.park.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ehootu.core.util.StringUtils;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.dao.EnterpriseInspectionRecordDao;
import com.ehootu.park.model.EnterpriseInspectionRecordEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.EnterpriseInspectionRecordService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service("enterpriseInspectionRecordService")
public class EnterpriseInspectionRecordServiceImpl implements EnterpriseInspectionRecordService {
	@Autowired
	private EnterpriseInspectionRecordDao enterpriseInspectionRecordDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private SysDictionaryService dictionaryService;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;

	
	@Override
	public EnterpriseInspectionRecordEntity queryObject(String id){
		EnterpriseInspectionRecordEntity entity = enterpriseInspectionRecordDao.queryObject(id);
		// 检查类别
		String name = dictionaryService.getSysDictName(SysDictionary.QYNB_JCLB, entity.getInspectionType());
		entity.setInspectionTypeName(name);
		// 检查人员
		String policeName = userService.findPoliceNameById(entity.getInspectors());
		entity.setInspectorsName(policeName);
		return entity;

	}
	
	@Override
	public List<EnterpriseInspectionRecordEntity> queryList(Map<String, Object> map){
		return enterpriseInspectionRecordDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return enterpriseInspectionRecordDao.queryTotal(map);
	}
	
	@Override
	public void save(EnterpriseInspectionRecordEntity enterpriseInspectionRecord){
		enterpriseInspectionRecordDao.save(enterpriseInspectionRecord);
	}
	
	@Override
	public void update(EnterpriseInspectionRecordEntity enterpriseInspectionRecord){
		enterpriseInspectionRecordDao.update(enterpriseInspectionRecord);
	}
	
	@Override
	public void delete(String id){
		enterpriseInspectionRecordDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		enterpriseInspectionRecordDao.deleteBatch(ids);
	}

	@Override
	public void save(EnterpriseInspectionRecordEntity enterpriseInspectionRecord, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加 企业内保信息
		enterpriseInspectionRecord.setInspectionTime(new Date());
		enterpriseInspectionRecord.setDate(new Date());
		enterpriseInspectionRecord.setPublicId(publicId);
		enterpriseInspectionRecord.setPhoneNumber(enterpriseInspectionRecord.getPhoneNumber().trim());
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(enterpriseInspectionRecord.getInspectors());
		enterpriseInspectionRecord.setInspectors(inspectors);
		enterpriseInspectionRecordDao.saveAndGetId(enterpriseInspectionRecord);
		// 关联任务中间表
		if (enterpriseInspectionRecord.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(enterpriseInspectionRecord.getTaskId());
			taskExecution.setTableId(enterpriseInspectionRecord.getId());
			taskExecution.setTableName("enterprise_inspection_record");
			taskExecution.setSonTaskName("企业内保");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(enterpriseInspectionRecord.getInspectors());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}

	}

	@Override
	public List<EnterpriseInspectionRecordEntity> select(String id) {
		return enterpriseInspectionRecordDao.select(id);
	}

	@Override
	public List<EnterpriseInspectionRecordEntity> selectOne(String dizhibianma) {
		return enterpriseInspectionRecordDao.selectOne(dizhibianma);
	}

	@Override
	public List<EnterpriseInspectionRecordEntity> selectAddress(String enterprise_address) {
		return enterpriseInspectionRecordDao.selectAddress(enterprise_address);
	}
	
}
