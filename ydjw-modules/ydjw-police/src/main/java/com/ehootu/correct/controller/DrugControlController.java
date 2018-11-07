package com.ehootu.correct.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.correct.model.DrugControlEntity;
import com.ehootu.correct.service.DrugControlService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 吸毒类重点人员动态管控
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:32
 */
@RestController
@RequestMapping("/app/drugcontrol")
public class DrugControlController extends BaseController {
	@Autowired
	private DrugControlService drugControlService;

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
		List<DrugControlEntity> patrolRecordList = drugControlService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 可防性案件巡逻防控管理表主键id
	 */
	@GetMapping("/info")
	public void info(String id){
		DrugControlEntity drugControl = drugControlService.queryObject(id);

		resultSuccess(drugControl);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(DrugControlEntity drugControl, String pageName){
		drugControlService.save(drugControl, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("drugcontrol:update")
	public R update(@RequestBody DrugControlEntity drugControl){
		drugControlService.update(drugControl);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("drugcontrol:delete")
	public R delete(@RequestBody Integer[] ids){
		drugControlService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
