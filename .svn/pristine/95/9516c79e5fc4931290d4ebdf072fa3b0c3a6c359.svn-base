package com.ehootu.correct.controller;

import java.util.List;
import java.util.Map;

import com.ehootu.core.generic.BaseController;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ehootu.core.util.PageUtils;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.correct.model.PersuasionWorkEntity;
import com.ehootu.correct.service.PersuasionWorkService;


/**
 * 心连心”心理疏导工作站工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:42:45
 */
@RestController
@RequestMapping("/app/persuasionwork")
public class PersuasionWorkController extends BaseController {
	@Autowired
	private PersuasionWorkService persuasionWorkService;
	@Autowired
	private SysDictionaryService dictionaryService;

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
		List<PersuasionWorkEntity> patrolRecordList = persuasionWorkService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 可防性案件巡逻防控管理表主键id
	 */
	@GetMapping("/info")
	public void info(String id){
		PersuasionWorkEntity persuasionWork = persuasionWorkService.queryObject(id);

		resultSuccess(persuasionWork);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(PersuasionWorkEntity persuasionWork, String pageName){
		persuasionWorkService.save(persuasionWork, pageName);
		resultSuccess();
	}

	/**
	 * 心连心”心理疏导工作站工作记录：查询 分级管理 类型列表
	 */
	@RequestMapping("/fjgl")
	@ResponseBody
	public void getTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.XLXXLSD_FJGL);
		resultSuccess(list);
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("persuasionwork:update")
	public R update(@RequestBody PersuasionWorkEntity persuasionWork){
		persuasionWorkService.update(persuasionWork);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("persuasionwork:delete")
	public R delete(@RequestBody Integer[] ids){
		persuasionWorkService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
