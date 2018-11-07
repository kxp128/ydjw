package com.ehootu.park.service.impl;

import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.dao.EnvironmentalRenovationDao;
import com.ehootu.park.model.EnvironmentalRenovationEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.EnvironmentalRenovationService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("environmentalRenovationService")
public class EnvironmentalRenovationServiceImpl implements EnvironmentalRenovationService {
	@Autowired
	private EnvironmentalRenovationDao environmentalRenovationDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private SysDictionaryService dictionaryService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public EnvironmentalRenovationEntity queryObject(String id){
		EnvironmentalRenovationEntity entity = environmentalRenovationDao.queryObject(id);
		// 整治类别
		String typeName = dictionaryService.getSysDictName(SysDictionary.YQQYZBHJZZ_ZZLB, entity.getRenovationCategory());
		entity.setRenovationCategoryName(typeName);
		return entity;
	}
	
	@Override
	public List<EnvironmentalRenovationEntity> queryList(Map<String, Object> map){
		return environmentalRenovationDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return environmentalRenovationDao.queryTotal(map);
	}
	
	@Override
	public void save(EnvironmentalRenovationEntity environmentalRenovation){
		environmentalRenovationDao.save(environmentalRenovation);
	}
	
	@Override
	public void update(EnvironmentalRenovationEntity environmentalRenovation){
		environmentalRenovationDao.update(environmentalRenovation);
	}
	
	@Override
	public void delete(String id){
		environmentalRenovationDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		environmentalRenovationDao.deleteBatch(ids);
	}

	@Override
	public List<EnvironmentalRenovationEntity> select(String id) {
		return environmentalRenovationDao.select(id);
	}

	@Override
	public List<EnvironmentalRenovationEntity> selectOne(String dizhibianma) {
		return environmentalRenovationDao.selectOne(dizhibianma);
	}

	@Override
	public List<EnvironmentalRenovationEntity> selectAddress(String enterprise_address) {
		return environmentalRenovationDao.selectAddress(enterprise_address);
	}

	@Override
	public void save(EnvironmentalRenovationEntity environmentalRenovation, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加 园区企业周边环境整治信息
		environmentalRenovation.setRenovationTime(new Date());
		environmentalRenovation.setDate(new Date());
		environmentalRenovation.setPublicId(publicId);
		environmentalRenovationDao.saveAndGetId(environmentalRenovation);
		// 关联任务中间表
		if (environmentalRenovation.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(environmentalRenovation.getTaskId());
			taskExecution.setTableId(environmentalRenovation.getId());
			taskExecution.setTableName("environmental_renovation");
			taskExecution.setSonTaskName("园区企业周边环境整治");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(environmentalRenovation.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

}
