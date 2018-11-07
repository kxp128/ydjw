package com.ehootu.flow.service.impl;

import com.ehootu.flow.dao.SixPartyTalksDao;
import com.ehootu.flow.model.SixPartyTalksEntity;
import com.ehootu.flow.service.SixPartyTalksService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("sixPartyTalksService")
public class SixPartyTalksServiceImpl implements SixPartyTalksService {
	@Autowired
	private SixPartyTalksDao sixPartyTalksDao;
	@Autowired
	private TaskService taskService;
	
	@Override
	public SixPartyTalksEntity queryObject(String id){
		return sixPartyTalksDao.queryObject(id);
	}
	
	@Override
	public List<SixPartyTalksEntity> queryList(Map<String, Object> map){
		return sixPartyTalksDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return sixPartyTalksDao.queryTotal(map);
	}

	@Override
	public void save(SixPartyTalksEntity sixPartyTalks, String pageName) {
		// 添加 流动警务室六方会谈工作记录 six_party_talks
		sixPartyTalks.setCreateTime(new Date());
		sixPartyTalksDao.saveAndGetId(sixPartyTalks);
		// 关联任务中间表
		if (sixPartyTalks.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(sixPartyTalks.getTaskId());
			taskExecution.setTableId(sixPartyTalks.getId());
			taskExecution.setTableName("six_party_talks");
			taskExecution.setSonTaskName("流动警务室六方会谈工作记录");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(sixPartyTalks.getPoliceId().toString());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(SixPartyTalksEntity sixPartyTalks){
		sixPartyTalksDao.update(sixPartyTalks);
	}
	
	@Override
	public void delete(String id){
		sixPartyTalksDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		sixPartyTalksDao.deleteBatch(ids);
	}
	
}
