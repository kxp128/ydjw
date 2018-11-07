package com.ehootu.correct.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.correct.model.IncontrollableDrugControlEntity;
import com.ehootu.correct.service.IncontrollableDrugControlService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 失控吸毒类重点人员动态管控工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:32
 */
@RestController
@RequestMapping("/app/incontrollabledrugcontrol")
public class IncontrollableDrugControlController extends BaseController {
	@Autowired
	private IncontrollableDrugControlService incontrollableDrugControlService;

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
		List<IncontrollableDrugControlEntity> patrolRecordList = incontrollableDrugControlService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 可防性案件巡逻防控管理表主键id
	 */
	@GetMapping("/info")
	public void info(String id){
		IncontrollableDrugControlEntity incontrollableDrugControl = incontrollableDrugControlService.queryObject(id);

		resultSuccess(incontrollableDrugControl);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(IncontrollableDrugControlEntity incontrollableDrugControl, String pageName){
		incontrollableDrugControlService.save(incontrollableDrugControl, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("incontrollabledrugcontrol:update")
	public R update(@RequestBody IncontrollableDrugControlEntity incontrollableDrugControl){
		incontrollableDrugControlService.update(incontrollableDrugControl);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("incontrollabledrugcontrol:delete")
	public R delete(@RequestBody Integer[] ids){
		incontrollableDrugControlService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
