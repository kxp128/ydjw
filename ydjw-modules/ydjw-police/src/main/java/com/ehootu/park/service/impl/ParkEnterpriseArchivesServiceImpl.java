package com.ehootu.park.service.impl;

import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.dao.ParkEnterpriseArchivesDao;
import com.ehootu.park.model.ParkEnterpriseArchivesEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.ParkEnterpriseArchivesService;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("parkEnterpriseArchivesService")
public class ParkEnterpriseArchivesServiceImpl implements ParkEnterpriseArchivesService {
	@Autowired
	private ParkEnterpriseArchivesDao parkEnterpriseArchivesDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private SysDictionaryService dictionaryService;
	@Autowired
	private TaskService taskService;

	@Override
	public ParkEnterpriseArchivesEntity queryObject(String id){
		ParkEnterpriseArchivesEntity entity = parkEnterpriseArchivesDao.queryObject(id);
		// 经营状态
		String name = dictionaryService.getSysDictName(SysDictionary.YQQYDA_JYZK,entity.getBusinessStatus());
		entity.setBusinessStatusName(name);
		return entity;
	}
	
	@Override
	public List<ParkEnterpriseArchivesEntity> queryList(Map<String, Object> map){
		return parkEnterpriseArchivesDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return parkEnterpriseArchivesDao.queryTotal(map);
	}
	
	@Override
	public void save(ParkEnterpriseArchivesEntity parkEnterpriseArchives){
		parkEnterpriseArchivesDao.save(parkEnterpriseArchives);
	}
	
	@Override
	public void update(ParkEnterpriseArchivesEntity parkEnterpriseArchives){
		parkEnterpriseArchivesDao.update(parkEnterpriseArchives);
	}
	
	@Override
	public void delete(String id){
		parkEnterpriseArchivesDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		parkEnterpriseArchivesDao.deleteBatch(ids);
	}

	@Override
	public void save(ParkEnterpriseArchivesEntity parkEnterpriseArchives, PublicInformationEntity publicInformation,String pageName) {
		// 更新添加企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 如果该地址编码已登记过企业，则将之前登记的改为弃用
		parkEnterpriseArchivesDao.updateByDzbm(publicInformation.getDiZhiBianMa(), 1);
		// 添加企业档案信息
		parkEnterpriseArchives.setDate(new Date());
		parkEnterpriseArchives.setPublicId(publicId);
		parkEnterpriseArchivesDao.saveAndGetId(parkEnterpriseArchives);
		// 关联任务中间表
		if (parkEnterpriseArchives.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(parkEnterpriseArchives.getTaskId());
			taskExecution.setTableId(parkEnterpriseArchives.getId());
			taskExecution.setTableName("park_enterprise_archives");
			taskExecution.setSonTaskName("园区企业档案");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(parkEnterpriseArchives.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}

	}

	@Override
	public ParkEnterpriseArchivesEntity getDetailByDzbm(String diZhiBianMa) {
		return parkEnterpriseArchivesDao.selectDetailByDzbm(diZhiBianMa);
	}

	@Override
	public List<ParkEnterpriseArchivesEntity> select(String id) {
		return parkEnterpriseArchivesDao.select(id);
	}

	@Override
	public List<ParkEnterpriseArchivesEntity> selectOne(String dizhibianma) {
		return parkEnterpriseArchivesDao.selectOne(dizhibianma);
	}

	@Override
	public List<ParkEnterpriseArchivesEntity> selectAddress(String enterprise_address) {
		return parkEnterpriseArchivesDao.selectAddress(enterprise_address);
	}
	
}
