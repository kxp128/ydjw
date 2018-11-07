package com.ehootu.rural.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.rural.model.PatrolRecordEntity;
import com.ehootu.rural.service.PatrolRecordService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 巡逻记录
 * 可防性案件巡逻防控管理
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:25
 */
@RestController
@RequestMapping("/app/patrolrecord")
public class PatrolRecordController extends BaseController {
	@Autowired
	private PatrolRecordService patrolRecordService;
	
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
		List<PatrolRecordEntity> patrolRecordList = patrolRecordService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 可防性案件巡逻防控管理表主键id
	 */
	@GetMapping("/info")
	public void info(String id){
		PatrolRecordEntity patrolRecordEntity = patrolRecordService.queryObject(id);

		resultSuccess(patrolRecordEntity);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(PatrolRecordEntity patrolRecordEntity, String pageName){
		patrolRecordService.save(patrolRecordEntity, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("patrolrecord:update")
	public R update(@RequestBody PatrolRecordEntity patrolRecord){
		patrolRecordService.update(patrolRecord);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("patrolrecord:delete")
	public R delete(@RequestBody Integer[] ids){
		patrolRecordService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
