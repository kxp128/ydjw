package com.ehootu.park.service.impl;

import com.ehootu.park.dao.ExplosiveStatisticsDao;
import com.ehootu.park.model.ExplosiveStatisticsEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.ExplosiveStatisticsService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("explosiveStatisticsService")
public class ExplosiveStatisticsServiceImpl implements ExplosiveStatisticsService {
	@Autowired
	private ExplosiveStatisticsDao explosiveStatisticsDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public ExplosiveStatisticsEntity queryObject(String id){
		return explosiveStatisticsDao.queryObject(id);
	}
	
	@Override
	public List<ExplosiveStatisticsEntity> queryList(Map<String, Object> map){
		return explosiveStatisticsDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return explosiveStatisticsDao.queryTotal(map);
	}
	
	@Override
	public void save(ExplosiveStatisticsEntity explosiveStatistics){
		explosiveStatisticsDao.save(explosiveStatistics);
	}
	
	@Override
	public void update(ExplosiveStatisticsEntity explosiveStatistics){
		explosiveStatisticsDao.update(explosiveStatistics);
	}
	
	@Override
	public void delete(String id){
		explosiveStatisticsDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		explosiveStatisticsDao.deleteBatch(ids);
	}

	@Override
	public List<ExplosiveStatisticsEntity> select(String id) {
		return explosiveStatisticsDao.select(id);
	}

	@Override
	public List<ExplosiveStatisticsEntity> selectOne(String dizhibianma) {
		return explosiveStatisticsDao.selectOne(dizhibianma);
	}

	@Override
	public List<ExplosiveStatisticsEntity> selectAddress(String enterprise_address) {
		return explosiveStatisticsDao.selectAddress(enterprise_address);
	}

	@Override
	public void save(ExplosiveStatisticsEntity explosiveStatistics, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加  爆炸物基本情况登记表信息
		explosiveStatistics.setDate(new Date());
		explosiveStatistics.setPublicId(publicId);
		explosiveStatisticsDao.saveAndGetId(explosiveStatistics);
		// 关联任务中间表
		if (explosiveStatistics.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(explosiveStatistics.getTaskId());
			taskExecution.setTableId(explosiveStatistics.getId());
			taskExecution.setTableName("explosive_statistics");
			taskExecution.setSonTaskName("爆炸物基本情况登记");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(explosiveStatistics.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}

	}

}
