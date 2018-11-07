package com.ehootu.correct.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.correct.model.ControlWorkEntity;
import com.ehootu.correct.service.ControlWorkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;



/**
 * 重点人员动态管控工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:16
 */
@RestController
@RequestMapping("/app/controlwork")
public class ControlWorkController extends BaseController {
	@Autowired
	private ControlWorkService controlWorkService;

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
		List<ControlWorkEntity> patrolRecordList = controlWorkService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 可防性案件巡逻防控管理表主键id
	 */
	@GetMapping("/info")
	public void info(String id){
		ControlWorkEntity controlWork = controlWorkService.queryObject(id);

		resultSuccess(controlWork);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(ControlWorkEntity controlWork, String pageName){
		controlWorkService.save(controlWork, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("controlwork:update")
	public R update(@RequestBody ControlWorkEntity controlWork){
		controlWorkService.update(controlWork);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("controlwork:delete")
	public R delete(@RequestBody Integer[] ids){
		controlWorkService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
