package com.ehootu.rural.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.rural.model.RealNameManagementEntity;
import com.ehootu.rural.service.RealNameManagementService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 旅店、网吧实名管理工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:36
 */
@RestController
@RequestMapping("app/realNameManagement")
public class RealNameManagementController extends BaseController {
	@Autowired
	private RealNameManagementService realNameManagementService;

	/**
	 * 列表
	 * @param params policeId 警察id
	 * @param params page 当前页码
	 * @param params pageSize 每页显示条数
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");

		List<RealNameManagementEntity> patrolRecordList = realNameManagementService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 旅店、网吧实名管理工作记录表主键id
	 */
	@RequestMapping("/info")
	@ResponseBody
	public void info(String id){
		RealNameManagementEntity realNameManagement = realNameManagementService.queryObject(id);

		resultSuccess(realNameManagement);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(RealNameManagementEntity realNameManagement, PublicInformationEntity publicEntity, String pageName){
		realNameManagementService.save(realNameManagement, publicEntity, pageName);
		resultSuccess();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("realnamemanagement:update")
	public R update(@RequestBody RealNameManagementEntity realNameManagement){
		realNameManagementService.update(realNameManagement);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("realnamemanagement:delete")
	public R delete(@RequestBody Integer[] ids){
		realNameManagementService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
