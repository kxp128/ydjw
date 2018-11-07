package com.ehootu.park.service.impl;

import com.ehootu.core.util.StringUtils;
import com.ehootu.park.dao.SecurityInspectionDao;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.SecurityInspectionEntity;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.park.service.SecurityInspectionService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("securityInspectionService")
public class SecurityInspectionServiceImpl implements SecurityInspectionService {
	@Autowired
	private SecurityInspectionDao securityInspectionDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public SecurityInspectionEntity queryObject(String id){
		SecurityInspectionEntity entity = securityInspectionDao.queryObject(id);
		// 检查人员
		String policeName = userService.findPoliceNameById(entity.getInspectors());
		entity.setInspectorsName(policeName);
		return entity;
	}
	
	@Override
	public List<SecurityInspectionEntity> queryList(Map<String, Object> map){
		return securityInspectionDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return securityInspectionDao.queryTotal(map);
	}
	
	@Override
	public void save(SecurityInspectionEntity securityInspection){
		securityInspectionDao.save(securityInspection);
	}
	
	@Override
	public void update(SecurityInspectionEntity securityInspection){
		securityInspectionDao.update(securityInspection);
	}
	
	@Override
	public void delete(String id){
		securityInspectionDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		securityInspectionDao.deleteBatch(ids);
	}

	@Override
	public List<SecurityInspectionEntity> select(String id) {
		return securityInspectionDao.select(id);
	}

	@Override
	public List<SecurityInspectionEntity> selectOne(String dizhibianma) {
		return securityInspectionDao.selectOne(dizhibianma);
	}

	@Override
	public List<SecurityInspectionEntity> selectAddress(String enterprise_address) {
		return securityInspectionDao.selectAddress(enterprise_address);
	}

	@Override
	public void save(SecurityInspectionEntity securityInspection, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加 园区消防安全检查记录信息
		securityInspection.setDate(new Date());
		securityInspection.setPublicId(publicId);
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(securityInspection.getInspectors());
		securityInspection.setInspectors(inspectors);
		securityInspectionDao.saveAndGetId(securityInspection);
		// 关联任务中间表
		if (securityInspection.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(securityInspection.getTaskId());
			taskExecution.setTableId(securityInspection.getId());
			taskExecution.setTableName("security_inspection");
			taskExecution.setSonTaskName("园区消防安全检查");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(securityInspection.getInspectors());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

}
