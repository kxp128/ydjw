package com.ehootu.flow.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.flow.model.DoubleOverGovernanceEntity;
import com.ehootu.flow.service.DoubleOverGovernanceService;
import com.ehootu.park.model.PublicInformationEntity;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 流动警务室建筑工地双超治理情况记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:28
 */
@RestController
@RequestMapping("/app/doubleovergovernance")
public class DoubleOverGovernanceController extends BaseController {
	@Autowired
	private DoubleOverGovernanceService doubleOverGovernanceService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<DoubleOverGovernanceEntity> aidWorkRecord = doubleOverGovernanceService.queryList(query);
		resultSuccess(aidWorkRecord);
	}


	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		DoubleOverGovernanceEntity doubleOverGovernance = doubleOverGovernanceService.queryObject(id);
		resultSuccess(doubleOverGovernance);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(DoubleOverGovernanceEntity doubleOverGovernance,PublicInformationEntity publicEntity, String pageName){
		doubleOverGovernanceService.save(doubleOverGovernance, publicEntity, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("doubleovergovernance:update")
	public R update(@RequestBody DoubleOverGovernanceEntity doubleOverGovernance){
		doubleOverGovernanceService.update(doubleOverGovernance);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("doubleovergovernance:delete")
	public R delete(@RequestBody Integer[] ids){
		doubleOverGovernanceService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
