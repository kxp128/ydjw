package com.ehootu.park.service.impl;

import com.ehootu.core.util.Query;
import com.ehootu.core.util.StringUtils;
import com.ehootu.park.dao.ExplosiveInspectionDao;
import com.ehootu.park.model.ExplosiveInspectionEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.ExplosiveInspectionService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("explosiveInspectionService")
public class ExplosiveInspectionServiceImpl implements ExplosiveInspectionService {
	@Autowired
	private ExplosiveInspectionDao explosiveInspectionDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public ExplosiveInspectionEntity queryObject(String id){
		ExplosiveInspectionEntity entity = explosiveInspectionDao.queryObject(id);
		// 检查人员
		String policeName = userService.findPoliceNameById(entity.getInspectors());
		entity.setInspectorsName(policeName);
		return entity;
	}
	@Override
	public int queryTotal(Map<String, Object> map){
		return explosiveInspectionDao.queryTotal(map);
	}
	
	@Override
	public void save(ExplosiveInspectionEntity explosiveInspection){
		explosiveInspectionDao.save(explosiveInspection);
	}
	
	@Override
	public void update(ExplosiveInspectionEntity explosiveInspection){
		explosiveInspectionDao.update(explosiveInspection);
	}
	
	@Override
	public void delete(String id){
		explosiveInspectionDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		explosiveInspectionDao.deleteBatch(ids);
	}

	@Override
	public List<ExplosiveInspectionEntity> queryList(Query query) {
		return explosiveInspectionDao.queryList(query);
	}

	@Override
	public void save(ExplosiveInspectionEntity explosiveInspection, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加  爆炸物专项检查记录表信息
		explosiveInspection.setInspectionTime(new Date());
		explosiveInspection.setDate(new Date());
		explosiveInspection.setPublicId(publicId);
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(explosiveInspection.getInspectors());
		explosiveInspection.setInspectors(inspectors);
		explosiveInspectionDao.saveAndGetId(explosiveInspection);
		// 关联任务中间表
		if (explosiveInspection.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(explosiveInspection.getTaskId());
			taskExecution.setTableId(explosiveInspection.getId());
			taskExecution.setTableName("explosive_inspection");
			taskExecution.setSonTaskName("爆炸物专项检查记录");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(explosiveInspection.getInspectors());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public List<ExplosiveInspectionEntity> select(String id) {
		return explosiveInspectionDao.select(id);
	}

	@Override
	public List<ExplosiveInspectionEntity> selectOne(String dizhibianma) {
		return explosiveInspectionDao.selectOne(dizhibianma);
	}

	@Override
	public List<ExplosiveInspectionEntity> selectAddress(String enterprise_address) {
		return explosiveInspectionDao.selectAddress(enterprise_address);
	}
	
}
