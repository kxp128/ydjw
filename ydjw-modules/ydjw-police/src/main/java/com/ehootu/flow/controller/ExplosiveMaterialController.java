package com.ehootu.flow.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.flow.model.ExplosiveMaterialEntity;
import com.ehootu.flow.service.ExplosiveMaterialService;
import com.ehootu.park.model.PublicInformationEntity;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 流动警务室 爆炸物品专项检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:20
 */
@RestController
@RequestMapping("/app/explosivematerial")
public class ExplosiveMaterialController extends BaseController {
	@Autowired
	private ExplosiveMaterialService explosiveMaterialService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<ExplosiveMaterialEntity> aidWorkRecord = explosiveMaterialService.queryList(query);
		resultSuccess(aidWorkRecord);
	}


	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		ExplosiveMaterialEntity explosiveMaterial = explosiveMaterialService.queryObject(id);
		resultSuccess(explosiveMaterial);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(ExplosiveMaterialEntity explosiveMaterial,PublicInformationEntity publicEntity, String pageName){
		explosiveMaterialService.save(explosiveMaterial, publicEntity, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("explosivematerial:update")
	public R update(@RequestBody ExplosiveMaterialEntity explosiveMaterial){
		explosiveMaterialService.update(explosiveMaterial);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("explosivematerial:delete")
	public R delete(@RequestBody Integer[] ids){
		explosiveMaterialService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
