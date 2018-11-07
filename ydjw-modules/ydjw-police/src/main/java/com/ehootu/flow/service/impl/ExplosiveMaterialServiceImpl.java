package com.ehootu.flow.service.impl;

import com.ehootu.core.util.StringUtils;
import com.ehootu.flow.dao.ExplosiveMaterialDao;
import com.ehootu.flow.model.ExplosiveMaterialEntity;
import com.ehootu.flow.service.ExplosiveMaterialService;
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



@Service("explosiveMaterialService")
public class ExplosiveMaterialServiceImpl implements ExplosiveMaterialService {
	@Autowired
	private ExplosiveMaterialDao explosiveMaterialDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public ExplosiveMaterialEntity queryObject(String id){
		ExplosiveMaterialEntity entity = explosiveMaterialDao.queryObject(id);
		// 获取检查人
		String name = userService.findPoliceNameById(entity.getCheckPoliceId());
		entity.setInspectionName(name);
		return entity;
	}
	
	@Override
	public List<ExplosiveMaterialEntity> queryList(Map<String, Object> map){
		return explosiveMaterialDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return explosiveMaterialDao.queryTotal(map);
	}

	@Override
	public void save(ExplosiveMaterialEntity explosiveMaterial, PublicInformationEntity publicEntity, String pageName) {
		// 添加 企业基本信息
		String publicId = publicInformationService.saveUpdate(publicEntity);
		// 添加 流动警务室 爆炸物品专项检查记录 explosive_material
		explosiveMaterial.setCreateTime(new Date());
		explosiveMaterial.setInspectionTime(new Date());
		explosiveMaterial.setPublicId(publicId);
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(explosiveMaterial.getCheckPoliceId());
		explosiveMaterial.setCheckPoliceId(inspectors);
		explosiveMaterialDao.saveAndGetId(explosiveMaterial);
		// 关联 任务中间表
		if (explosiveMaterial.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(explosiveMaterial.getTaskId());
			taskExecution.setTableId(explosiveMaterial.getId());
			taskExecution.setTableName("explosive_material");
			taskExecution.setSonTaskName("流动警务室爆炸物品专项检查");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(explosiveMaterial.getCheckPoliceId());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(ExplosiveMaterialEntity explosiveMaterial){
		explosiveMaterialDao.update(explosiveMaterial);
	}
	
	@Override
	public void delete(String id){
		explosiveMaterialDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		explosiveMaterialDao.deleteBatch(ids);
	}
	
}
