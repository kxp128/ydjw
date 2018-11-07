package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.EducationalWorkEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.EducationalWorkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 法制宣传教育工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:55
 */
@RestController
@RequestMapping("/app/educationalwork")
public class EducationalWorkController extends BaseController{
	@Autowired
	private EducationalWorkService educationalWorkService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<EducationalWorkEntity> educationalWork =educationalWorkService.queryList(query);
		resultSuccess(educationalWork);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		EducationalWorkEntity educationalWork =educationalWorkService.queryObject(id);
		resultSuccess(educationalWork);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		EducationalWorkEntity educationalWork = input.getEducationalWork();
		String pageName = input.getPageName();
    	educationalWorkService.save(educationalWork, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("educationalwork:update")
	public R update(@RequestBody EducationalWorkEntity educationalWork){
		educationalWorkService.update(educationalWork);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("educationalwork:delete")
	public R delete(@RequestBody Integer[] ids){
		educationalWorkService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
