package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.ChemicalsInspectionEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.ChemicalsInspectionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 易制毒化学品检验表
 * 剧毒、易制毒化学品专项检查
 * @author yinyujun
 * @email 
 * @date 2017-09-26 16:27:31
 */
@RestController
@RequestMapping("/app/chemicalsinspection")
public class ChemicalsInspectionController extends BaseController{
	@Autowired
	private ChemicalsInspectionService chemicalsInspectionService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<ChemicalsInspectionEntity> chemicalsInspectionList = chemicalsInspectionService.queryList(query);
		resultSuccess(chemicalsInspectionList);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		ChemicalsInspectionEntity chemicalsInspection = chemicalsInspectionService.queryObject(id);
		resultSuccess(chemicalsInspection);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		ChemicalsInspectionEntity chemicalsInspection = input.getChemicalsInspection();
	    PublicInformationEntity publicInformation = input.getPublicInformation();
	    String pageName = input.getPageName();
    	chemicalsInspectionService.save(chemicalsInspection, publicInformation, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("chemicalsinspection:update")
	public R update(@RequestBody ChemicalsInspectionEntity chemicalsInspection){
		chemicalsInspectionService.update(chemicalsInspection);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("chemicalsinspection:delete")
	public R delete(@RequestBody Integer[] ids){
		chemicalsInspectionService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
