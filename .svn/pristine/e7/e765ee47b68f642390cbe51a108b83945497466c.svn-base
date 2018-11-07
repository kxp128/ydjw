package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.DisputeMediationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.DisputeMediationService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 园区企业矛盾纠纷调处工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:44
 */
@RestController
@RequestMapping("/app/disputemediation")
public class DisputeMediationController extends BaseController{
	@Autowired
	private DisputeMediationService disputeMediationService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<DisputeMediationEntity> disputeMediation = disputeMediationService.queryList(query);
		resultSuccess(disputeMediation);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		DisputeMediationEntity disputeMediation =disputeMediationService.queryObject(id);
		resultSuccess(disputeMediation);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		DisputeMediationEntity disputeMediation = input.getDisputeMediation();
		String pageName = input.getPageName();
    	disputeMediationService.save(disputeMediation, pageName);
		resultSuccess();
	}
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("disputemediation:update")
	public R update(@RequestBody DisputeMediationEntity disputeMediation){
		disputeMediationService.update(disputeMediation);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("disputemediation:delete")
	public R delete(@RequestBody Integer[] ids){
		disputeMediationService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
