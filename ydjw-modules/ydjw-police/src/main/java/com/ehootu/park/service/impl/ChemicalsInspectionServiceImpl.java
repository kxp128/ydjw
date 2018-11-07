package com.ehootu.park.service.impl;

import com.ehootu.core.util.StringUtils;
import com.ehootu.park.dao.ChemicalsInspectionDao;
import com.ehootu.park.model.ChemicalsInspectionEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.ChemicalsInspectionService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 易制毒化学品检验表
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-26 16:27:31
 */
@Service("chemicalsInspectionService")
public class ChemicalsInspectionServiceImpl implements ChemicalsInspectionService {
	@Autowired
	private ChemicalsInspectionDao chemicalsInspectionDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public ChemicalsInspectionEntity queryObject(String id){
		ChemicalsInspectionEntity entity = chemicalsInspectionDao.queryObject(id);
		// 检查人员
		String policeName = userService.findPoliceNameById(entity.getInspectors());
		entity.setInspectorsName(policeName);
		return entity;
	}
	
	@Override
	public List<ChemicalsInspectionEntity> queryList(Map<String, Object> map){
		return chemicalsInspectionDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return chemicalsInspectionDao.queryTotal(map);
	}
	
	@Override
	public void save(ChemicalsInspectionEntity chemicalsInspection){
		chemicalsInspectionDao.save(chemicalsInspection);
	}
	
	@Override
	public void update(ChemicalsInspectionEntity chemicalsInspection){
		chemicalsInspectionDao.update(chemicalsInspection);
	}
	
	@Override
	public void delete(String id){
		chemicalsInspectionDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		chemicalsInspectionDao.deleteBatch(ids);
	}

	@Override
	public List<ChemicalsInspectionEntity> select(String id) {
		return chemicalsInspectionDao.select(id);
	}

	@Override
	public List<ChemicalsInspectionEntity> selectOne(String dizhibianma) {
		return chemicalsInspectionDao.selectOne(dizhibianma);
	}
	@Override
	public List<ChemicalsInspectionEntity> selectAddress(String enterprise_address) {
		return chemicalsInspectionDao.selectAddress(enterprise_address);
	}

	@Override
	public void save(ChemicalsInspectionEntity chemicalsInspection, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加 剧毒、易制毒化学品专项检查信息
		chemicalsInspection.setInspectionTime(new Date());
		chemicalsInspection.setDate(new Date());
		chemicalsInspection.setPublicId(publicId);
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(chemicalsInspection.getInspectors());
		chemicalsInspection.setInspectors(inspectors);
		chemicalsInspectionDao.saveAndGetId(chemicalsInspection);
		// 关联任务中间表
		if (chemicalsInspection.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(chemicalsInspection.getTaskId());
			taskExecution.setTableId(chemicalsInspection.getId());
			taskExecution.setTableName("chemicals_inspection");
			taskExecution.setSonTaskName("剧毒、易制毒化学品专项检查");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(chemicalsInspection.getInspectors());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}

	}

}
