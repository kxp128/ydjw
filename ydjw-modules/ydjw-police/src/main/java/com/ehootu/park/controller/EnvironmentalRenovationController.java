package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.model.EnvironmentalRenovationEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.EnvironmentalRenovationService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 园区企业周边环境整治
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:37
 */
@RestController
@RequestMapping("/app/environmentalrenovation")
public class EnvironmentalRenovationController extends BaseController {
	@Autowired
	private EnvironmentalRenovationService environmentalRenovationService;
	@Autowired
	private SysDictionaryService dictionaryService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<EnvironmentalRenovationEntity> environmentalRenovation = environmentalRenovationService.queryList(query);
		resultSuccess(environmentalRenovation);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		EnvironmentalRenovationEntity EnvironmentalRenovation = environmentalRenovationService.queryObject(id);
		resultSuccess(EnvironmentalRenovation);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		EnvironmentalRenovationEntity environmentalRenovation = input.getEnvironmentalRenovation();
	    PublicInformationEntity publicInformation = input.getPublicInformation();
	    String pageName = input.getPageName();
    	environmentalRenovationService.save(environmentalRenovation, publicInformation, pageName);
		resultSuccess();
	}

	/**
	 * 园区企业周边环境整治：查询 整治类别 类型列表
	 */
	@RequestMapping("/zzlb")
	@ResponseBody
	public void getTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.YQQYZBHJZZ_ZZLB);
		resultSuccess(list);
	}


	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("environmentalrenovation:update")
	public R update(@RequestBody EnvironmentalRenovationEntity environmentalRenovation){
		environmentalRenovationService.update(environmentalRenovation);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("environmentalrenovation:delete")
	public R delete(@RequestBody Integer[] ids){
		environmentalRenovationService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
