package com.ehootu.park.service.impl;

import com.ehootu.park.dao.DisputeMediationDao;
import com.ehootu.park.model.DisputeMediationEntity;
import com.ehootu.park.service.DisputeMediationService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("disputeMediationService")
public class DisputeMediationServiceImpl implements DisputeMediationService {
	@Autowired
	private DisputeMediationDao disputeMediationDao;
	@Autowired
	private TaskService taskService;

	@Override
	public DisputeMediationEntity queryObject(String id){
		return disputeMediationDao.queryObject(id);
	}

	@Override
	public List<DisputeMediationEntity> queryList(Map<String, Object> map){
		return disputeMediationDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map){
		return disputeMediationDao.queryTotal(map);
	}

	@Override
	public void save(DisputeMediationEntity disputeMediation){
		// 添加 园区企业矛盾纠纷调处工作记录
		disputeMediation.setDate(new Date());
		disputeMediation.setMediationTime(new Date());
		disputeMediationDao.saveAndGetId(disputeMediation);
	}

	@Override
	public void save(DisputeMediationEntity disputeMediation, String pageName) {
		// 添加 园区企业矛盾纠纷调处工作记录
		disputeMediation.setDate(new Date());
		disputeMediation.setMediationTime(new Date());
		disputeMediationDao.saveAndGetId(disputeMediation);
		// 关联任务中间表
		if (disputeMediation.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(disputeMediation.getTaskId());
			taskExecution.setTableId(disputeMediation.getId());
			taskExecution.setTableName("dispute_mediation");
			taskExecution.setSonTaskName("园区企业矛盾纠纷调处工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(disputeMediation.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(DisputeMediationEntity disputeMediation){
		disputeMediationDao.update(disputeMediation);
	}

	@Override
	public void delete(String id){
		disputeMediationDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		disputeMediationDao.deleteBatch(ids);
	}

	@Override
	public List<DisputeMediationEntity> select(String id) {
		// TODO Auto-generated method stub
		return disputeMediationDao.select(id);
	}

	@Override
	public List<DisputeMediationEntity> selectOne(String dizhibianma) {
		// TODO Auto-generated method stub
		return disputeMediationDao.selectOne(dizhibianma);
	}

	@Override
	public List<DisputeMediationEntity> selectAddress(String enterprise_address) {
		// TODO Auto-generated method stub
		return disputeMediationDao.selectAddress(enterprise_address);
	}

}
