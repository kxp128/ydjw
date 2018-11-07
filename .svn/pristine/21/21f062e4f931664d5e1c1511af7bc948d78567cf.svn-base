package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.SecurityInspectionEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.SecurityInspectionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 园区消防安全检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:22
 */
@RestController
@RequestMapping("/app/securityinspection")
public class SecurityInspectionController extends BaseController {
	@Autowired
	private SecurityInspectionService securityInspectionService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<SecurityInspectionEntity> securityInspection = securityInspectionService.queryList(query);
		resultSuccess(securityInspection);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		SecurityInspectionEntity securityInspection = securityInspectionService.queryObject(id);
		resultSuccess(securityInspection);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		SecurityInspectionEntity securityInspection = input.getSecurityInspection();
	    PublicInformationEntity publicInformation = input.getPublicInformation();
	    String pageName = input.getPageName();
    	securityInspectionService.save(securityInspection, publicInformation, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("securityinspection:update")
	public R update(@RequestBody SecurityInspectionEntity securityInspection){
		securityInspectionService.update(securityInspection);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("securityinspection:delete")
	public R delete(@RequestBody Integer[] ids){
		securityInspectionService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
