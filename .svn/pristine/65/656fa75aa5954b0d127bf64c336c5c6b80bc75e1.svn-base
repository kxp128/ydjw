package com.ehootu.park.service.impl;

import com.ehootu.park.dao.StarRatingDao;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.StarRatingEntity;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.park.service.StarRatingService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("starRatingService")
public class StarRatingServiceImpl implements StarRatingService {
	@Autowired
	private StarRatingDao starRatingDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private TaskService taskService;

	@Override
	public StarRatingEntity queryObject(String id){
		return starRatingDao.queryObject(id);
	}
	
	@Override
	public List<StarRatingEntity> queryList(Map<String, Object> map){
		return starRatingDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return starRatingDao.queryTotal(map);
	}
	
	@Override
	public void save(StarRatingEntity starRating){
		starRatingDao.save(starRating);
	}

	@Override
	public void save(StarRatingEntity starRating, PublicInformationEntity publicInformation, String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加 园区企业星级评定信息
		starRating.setDate(new Date());
		starRating.setPublicId(publicId);
		starRatingDao.saveAndGetId(starRating);
		// 关联任务中间表
		if (starRating.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(starRating.getTaskId());
			taskExecution.setTableId(starRating.getId());
			taskExecution.setTableName("star_rating");
			taskExecution.setSonTaskName("园区企业星级评定");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(starRating.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(StarRatingEntity starRating){
		starRatingDao.update(starRating);
	}

	@Override
	public void delete(String id){
		starRatingDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		starRatingDao.deleteBatch(ids);
	}

	@Override
	public List<StarRatingEntity> select(String id) {
		return starRatingDao.select(id);
	}

	@Override
	public List<StarRatingEntity> selectOne(String dizhibianma) {
		return starRatingDao.selectOne(dizhibianma);
	}

	@Override
	public List<StarRatingEntity> selectAddress(String enterprise_address) {
		return starRatingDao.selectAddress(enterprise_address);
	}

}
