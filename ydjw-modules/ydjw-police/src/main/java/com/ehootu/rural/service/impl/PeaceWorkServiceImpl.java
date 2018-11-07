package com.ehootu.rural.service.impl;

import com.ehootu.core.util.StringUtils;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.rural.dao.PeaceWorkDao;
import com.ehootu.rural.model.PeaceWorkEntity;
import com.ehootu.rural.service.PeaceWorkService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("peaceWorkService")
public class PeaceWorkServiceImpl implements PeaceWorkService {
	@Autowired
	private PeaceWorkDao peaceWorkDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private SysDictionaryService dictionaryService;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;
	
	@Override
	public PeaceWorkEntity queryObject(String id){
		PeaceWorkEntity peaceWork = peaceWorkDao.queryObject(id);
		// 得到管理项目
		String managerProjectName = dictionaryService.getSysDictName("zazdgzjl_glxm", peaceWork.getManagementProject());
		peaceWork.setManagementProjectName(managerProjectName);
		// 得到检查方式
		String checkModeName = dictionaryService.getSysDictName("zazdgzjl_jcfs", peaceWork.getCheckMode());
		peaceWork.setCheckModeName(checkModeName);
		// 获取检查人员
		String name = userService.findPoliceNameById(peaceWork.getCheckPoliceId());
		peaceWork.setExaminer(name);
		return peaceWork;
	}
	
	@Override
	public List<PeaceWorkEntity> queryList(Map<String, Object> map){
		return peaceWorkDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return peaceWorkDao.queryTotal(map);
	}

	@Override
	public void save(PeaceWorkEntity peaceWork, PublicInformationEntity publicInformation, String pageName) {
		// 添加 企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);

		// 添加 治安重点工作记录 peace_work
		peaceWork.setCreateTime(new Date());
		peaceWork.setPublicId(publicId);
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(peaceWork.getCheckPoliceId());
		peaceWork.setCheckPoliceId(inspectors);
		peaceWorkDao.saveAndGetId(peaceWork);
		// 关联任务中间表
		if (peaceWork.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(peaceWork.getTaskId());
			taskExecution.setTableId(peaceWork.getId());
			taskExecution.setTableName("peace_work");
			taskExecution.setSonTaskName("治安重点工作");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(peaceWork.getCheckPoliceId());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(PeaceWorkEntity peaceWork){
		peaceWorkDao.update(peaceWork);
	}

	@Override
	public void delete(String id){
		peaceWorkDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		peaceWorkDao.deleteBatch(ids);
	}

}
