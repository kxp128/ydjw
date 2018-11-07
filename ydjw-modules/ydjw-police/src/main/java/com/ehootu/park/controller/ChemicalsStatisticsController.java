package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.ChemicalsStatisticsEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.ChemicalsStatisticsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 易制毒化学物品统计表
 *  剧毒、易制毒化学品基本情况表
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:31
 */
@RestController
@RequestMapping("/app/chemicalsstatistics")
public class ChemicalsStatisticsController extends BaseController {
	@Autowired
	private ChemicalsStatisticsService chemicalsStatisticsService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<ChemicalsStatisticsEntity> chemicalsStatistics = chemicalsStatisticsService.queryList(query);
		resultSuccess(chemicalsStatistics);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		ChemicalsStatisticsEntity chemicalsStatistics = chemicalsStatisticsService.queryObject(id);
		resultSuccess(chemicalsStatistics);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		ChemicalsStatisticsEntity chemicalsStatistics = input.getChemicalsStatistics();
	    PublicInformationEntity publicInformation = input.getPublicInformation();
	    String pageName = input.getPageName();
    	chemicalsStatisticsService.save(chemicalsStatistics, publicInformation, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("chemicalsstatistics:update")
	public R update(@RequestBody ChemicalsStatisticsEntity chemicalsStatistics){
		chemicalsStatisticsService.update(chemicalsStatistics);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("chemicalsstatistics:delete")
	public R delete(@RequestBody Integer[] ids){
		chemicalsStatisticsService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
