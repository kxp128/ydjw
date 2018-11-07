package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.AidWorkRecordEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.AidWorkRecordService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 困难帮扶工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:49
 */
@RestController
@RequestMapping("/app/aidworkrecord")
public class AidWorkRecordController extends BaseController{
	@Autowired
	private AidWorkRecordService aidWorkRecordService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<AidWorkRecordEntity> aidWorkRecord = aidWorkRecordService.queryList(query);
		resultSuccess(aidWorkRecord);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		AidWorkRecordEntity aidWorkRecord = aidWorkRecordService.queryObject(id);
		resultSuccess(aidWorkRecord);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		AidWorkRecordEntity aidWorkRecord = input.getAidWorkRecord();
		String pageName = input.getPageName();
    	aidWorkRecordService.save(aidWorkRecord, pageName);
		resultSuccess();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("aidworkrecord:update")
	public R update(@RequestBody AidWorkRecordEntity aidWorkRecord){
		aidWorkRecordService.update(aidWorkRecord);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("aidworkrecord:delete")
	public R delete(@RequestBody Integer[] ids){
		aidWorkRecordService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
