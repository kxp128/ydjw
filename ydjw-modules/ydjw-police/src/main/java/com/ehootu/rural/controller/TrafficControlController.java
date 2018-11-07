package com.ehootu.rural.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.rural.model.TrafficControlEntity;
import com.ehootu.rural.service.TrafficControlService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 农村道路交通管理工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:11
 */
@RestController
@RequestMapping("/app/trafficcontrol")
public class TrafficControlController extends BaseController {
	@Autowired
	private TrafficControlService trafficControlService;
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
		List<TrafficControlEntity> patrolRecordList = trafficControlService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 农村道路交通管理工作记录表主键id
	 */
	@RequestMapping("/info")
	@ResponseBody
	public void info(String id){
		TrafficControlEntity trafficControl = trafficControlService.queryObject(id);

		resultSuccess(trafficControl);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(TrafficControlEntity trafficControl, String pageName){
		trafficControlService.save(trafficControl, pageName);
		resultSuccess();
	}

	/**
	 * 农村道路交通管理工作记录：查询 管理项目 类型列表
	 */
	@RequestMapping("/glxm")
	@ResponseBody
	public void getTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.NCDLJTGL_GLXM);
		resultSuccess(list);
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("trafficcontrol:update")
	public R update(@RequestBody TrafficControlEntity trafficControl){
		trafficControlService.update(trafficControl);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("trafficcontrol:delete")
	public R delete(@RequestBody Integer[] ids){
		trafficControlService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
