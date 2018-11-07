package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.ExplosiveStatisticsEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.ExplosiveStatisticsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 爆炸物基本情况登记表
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:39
 */
@RestController
@RequestMapping("/app/explosivestatistics")
public class ExplosiveStatisticsController extends BaseController{
	@Autowired
	private ExplosiveStatisticsService explosiveStatisticsService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<ExplosiveStatisticsEntity> explosiveStatistics = explosiveStatisticsService.queryList(query);
		resultSuccess(explosiveStatistics);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		ExplosiveStatisticsEntity explosiveStatistics = explosiveStatisticsService.queryObject(id);
		resultSuccess(explosiveStatistics);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		ExplosiveStatisticsEntity explosiveStatistics = input.getExplosiveStatistics();
	    PublicInformationEntity publicInformation = input.getPublicInformation();
	    String pageName = input.getPageName();
    	explosiveStatisticsService.save(explosiveStatistics, publicInformation, pageName);
		resultSuccess();
	}
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("explosivestatistics:update")
	public R update(@RequestBody ExplosiveStatisticsEntity explosiveStatistics){
		explosiveStatisticsService.update(explosiveStatistics);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("explosivestatistics:delete")
	public R delete(@RequestBody Integer[] ids){
		explosiveStatisticsService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
