package com.ehootu.correct.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.correct.model.IncontrollableControlWorkEntity;
import com.ehootu.correct.service.IncontrollableControlWorkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 失控重点人员动态管控工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:23
 */
@RestController
@RequestMapping("/app/incontrollablecontrolwork")
public class IncontrollableControlWorkController extends BaseController {
	@Autowired
	private IncontrollableControlWorkService incontrollableControlWorkService;

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
		List<IncontrollableControlWorkEntity> patrolRecordList = incontrollableControlWorkService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 可防性案件巡逻防控管理表主键id
	 */
	@GetMapping("/info")
	public void info(String id){
		IncontrollableControlWorkEntity incontrollableControlWork = incontrollableControlWorkService.queryObject(id);

		resultSuccess(incontrollableControlWork);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(IncontrollableControlWorkEntity incontrollableControlWork, String pageName){
		incontrollableControlWorkService.save(incontrollableControlWork, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("incontrollablecontrolwork:update")
	public R update(@RequestBody IncontrollableControlWorkEntity incontrollableControlWork){
		incontrollableControlWorkService.update(incontrollableControlWork);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("incontrollablecontrolwork:delete")
	public R delete(@RequestBody Integer[] ids){
		incontrollableControlWorkService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
