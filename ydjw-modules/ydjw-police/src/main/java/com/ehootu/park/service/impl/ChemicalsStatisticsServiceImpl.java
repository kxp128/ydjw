package com.ehootu.park.service.impl;

import com.ehootu.park.dao.ChemicalsStatisticsDao;
import com.ehootu.park.model.ChemicalsStatisticsEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.ChemicalsStatisticsService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("chemicalsStatisticsService")
public class ChemicalsStatisticsServiceImpl implements ChemicalsStatisticsService {
	@Autowired
	private ChemicalsStatisticsDao chemicalsStatisticsDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private TaskService taskService;

	
	@Override
	public int queryTotal(Map<String, Object> map){
		return chemicalsStatisticsDao.queryTotal(map);
	}
	
	@Override
	public void save(ChemicalsStatisticsEntity chemicalsStatistics){
		chemicalsStatisticsDao.save(chemicalsStatistics);
	}
	
	@Override
	public void update(ChemicalsStatisticsEntity chemicalsStatistics){
		chemicalsStatisticsDao.update(chemicalsStatistics);
	}
	
	@Override
	public void delete(String id){
		chemicalsStatisticsDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		chemicalsStatisticsDao.deleteBatch(ids);
	}

	@Override
	public ChemicalsStatisticsEntity queryObject(String id) {
		return chemicalsStatisticsDao.queryObject(id);
	}

	@Override
	public List<ChemicalsStatisticsEntity> select(String id) {
		return chemicalsStatisticsDao.select(id);
	}

	@Override
	public List<ChemicalsStatisticsEntity> selectOne(String dizhibianma) {
		return chemicalsStatisticsDao.selectOne(dizhibianma);
	}

	@Override
	public List<ChemicalsStatisticsEntity> selectAddress(String enterprise_address) {
		return chemicalsStatisticsDao.selectAddress(enterprise_address);
	}

	@Override
	public void save(ChemicalsStatisticsEntity chemicalsStatistics, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加 剧毒、易制毒化学品基本情况表信息
		chemicalsStatistics.setDate(new Date());
		chemicalsStatistics.setPublicId(publicId);
		chemicalsStatisticsDao.saveAndGetId(chemicalsStatistics);
		// 关联任务中间表
		if (chemicalsStatistics.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(chemicalsStatistics.getTaskId());
			taskExecution.setTableId(chemicalsStatistics.getId());
			taskExecution.setTableName("chemicals_statistics");
			taskExecution.setSonTaskName("剧毒、易制毒化学品基本情况");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(chemicalsStatistics.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public List<ChemicalsStatisticsEntity> queryList(Map<String, Object> map) {
		return chemicalsStatisticsDao.queryList(map);
	}
	
}
