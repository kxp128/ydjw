package com.ehootu.flow.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.flow.model.WechatPlatformWorkEntity;
import com.ehootu.flow.service.WechatPlatformWorkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 建筑工地流口管理微信平台工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:08
 */
@RestController
@RequestMapping("/app/wechatplatformwork")
public class WechatPlatformWorkController extends BaseController {
	@Autowired
	private WechatPlatformWorkService wechatPlatformWorkService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<WechatPlatformWorkEntity> aidWorkRecord = wechatPlatformWorkService.queryList(query);
		resultSuccess(aidWorkRecord);
	}


	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		WechatPlatformWorkEntity wechatPlatformWork = wechatPlatformWorkService.queryObject(id);
		resultSuccess(wechatPlatformWork);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(WechatPlatformWorkEntity wechatPlatformWork, String pageName){
		wechatPlatformWorkService.save(wechatPlatformWork, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("wechatplatformwork:update")
	public R update(@RequestBody WechatPlatformWorkEntity wechatPlatformWork){
		wechatPlatformWorkService.update(wechatPlatformWork);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("wechatplatformwork:delete")
	public R delete(@RequestBody Integer[] ids){
		wechatPlatformWorkService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
