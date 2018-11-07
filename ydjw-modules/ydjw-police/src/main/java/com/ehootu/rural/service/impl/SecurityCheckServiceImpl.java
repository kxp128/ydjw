package com.ehootu.rural.service.impl;

import com.ehootu.core.util.StringUtils;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.PublicInformationService;
import com.ehootu.rural.dao.SecurityCheckDao;
import com.ehootu.rural.model.SecurityCheckEntity;
import com.ehootu.rural.service.SecurityCheckService;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;



@Service("securityCheckService")
public class SecurityCheckServiceImpl implements SecurityCheckService {
	@Autowired
	private SecurityCheckDao securityCheckDao;
	@Autowired
	private PublicInformationService publicInformationService;
	@Autowired
	private UserService userService;
	@Autowired
	private SysDictionaryService dictionaryService;
	@Autowired
	private TaskService taskService;

	@Override
	public SecurityCheckEntity queryObject(String id){
		SecurityCheckEntity entity = securityCheckDao.queryObject(id);
		// 获取 检查人员
		String name = userService.findPoliceNameById(entity.getCheckPoliceId());
		entity.setInspectors(name);
		// 获取 检查场所
		String typeName = dictionaryService.getSysDictName(SysDictionary.CSXFAQJCJL_JCCS, entity.getInspectionSite());
		entity.setInspectionSiteName(typeName);
		return entity;
	}
	
	@Override
	public List<SecurityCheckEntity> queryList(Map<String, Object> map){
		return securityCheckDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return securityCheckDao.queryTotal(map);
	}

	@Override
	public void save(SecurityCheckEntity securityCheck, PublicInformationEntity publicInformation, String pageName) {
		//  添加 企业基本信息
		String publicId = publicInformationService.saveUpdate(publicInformation);
		// 添加 村社消防安全检查记录 security_check
		securityCheck.setInspectionTime(new Date());
		securityCheck.setCreateTime(new Date());
		securityCheck.setPublicId(publicId);
		// 将数组类型参数（检查人）转换为字符串
		String inspectors = StringUtils.customConcat(securityCheck.getCheckPoliceId());
		securityCheck.setCheckPoliceId(inspectors);
		securityCheckDao.saveAndGetId(securityCheck);
		// 关联任务中间表
		if (securityCheck.getTaskId()!=null) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setTaskId(securityCheck.getTaskId());
			taskExecution.setTableId(securityCheck.getId());
			taskExecution.setTableName("security_check");
			taskExecution.setSonTaskName("村社消防安全检查");
			taskExecution.setPageName(pageName);
			taskExecution.setExecutorIds(securityCheck.getCheckPoliceId());
			taskExecution.setCreateTime(new Date());

			taskService.createTaskExecution(taskExecution);
		}
	}

	@Override
	public void update(SecurityCheckEntity securityCheck){
		securityCheckDao.update(securityCheck);
	}

	@Override
	public void delete(String id){
		securityCheckDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		securityCheckDao.deleteBatch(ids);
	}

}
