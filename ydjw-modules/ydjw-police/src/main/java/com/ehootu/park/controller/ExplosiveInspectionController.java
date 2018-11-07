package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.ExplosiveInspectionEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.ExplosiveInspectionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 爆炸物专项检查记录表
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:46
 */
@RestController
@RequestMapping("/app/explosiveinspection")
public class ExplosiveInspectionController extends BaseController{
	@Autowired
	private ExplosiveInspectionService explosiveInspectionService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<ExplosiveInspectionEntity> explosiveInspectionList = explosiveInspectionService.queryList(query);
		resultSuccess(explosiveInspectionList);
	}
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		System.out.println(id);
		ExplosiveInspectionEntity explosiveInspection = explosiveInspectionService.queryObject(id);
		resultSuccess(explosiveInspection);
	}
	
	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
			Wrapper input = super.getJsonAjax(postData, Wrapper.class);
			System.out.println("爆炸:"+postData);
		    ExplosiveInspectionEntity explosiveInspection = input.getExplosiveInspection();
		    PublicInformationEntity publicInformation = input.getPublicInformation();
		    String pageName = input.getPageName();
	    	explosiveInspectionService.save(explosiveInspection, publicInformation, pageName);
			resultSuccess();
	}
	
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("explosiveinspection:update")
	public R update(@RequestBody ExplosiveInspectionEntity explosiveInspection){
		explosiveInspectionService.update(explosiveInspection);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("explosiveinspection:delete")
	public R delete(@RequestBody Integer[] ids){
		explosiveInspectionService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
