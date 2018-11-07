package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.EnterprisePlatformWorkEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.EnterprisePlatformWorkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 园区企业流口管理微信平台工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:18
 */
@RestController
@RequestMapping("/app/enterpriseplatformwork")
public class EnterprisePlatformWorkController extends BaseController {
	@Autowired
	private EnterprisePlatformWorkService enterpriseplatformworkService;

	
	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<EnterprisePlatformWorkEntity> EnterprisePlatformWorkList = enterpriseplatformworkService.queryList(query);
		resultSuccess(EnterprisePlatformWorkList);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		EnterprisePlatformWorkEntity EnterprisePlatformWork = enterpriseplatformworkService.queryObject(id);
		resultSuccess(EnterprisePlatformWork);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		EnterprisePlatformWorkEntity enterprisePlatformWork = input.getEnterprisePlatformWork();
	    PublicInformationEntity publicInformation = input.getPublicInformation();
	    String pageName = input.getPageName();
    	enterpriseplatformworkService.save(enterprisePlatformWork, publicInformation, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	public void update(EnterprisePlatformWorkEntity EnterprisePlatformWork){
		enterpriseplatformworkService.update(EnterprisePlatformWork);
		resultSuccess();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("EnterprisePlatformWork:delete")
	public R delete(@RequestBody Integer[] ids){
		enterpriseplatformworkService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
