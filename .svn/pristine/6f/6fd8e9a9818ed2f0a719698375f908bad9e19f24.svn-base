package com.ehootu.flow.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.flow.model.AccountabilityWorkEntity;
import com.ehootu.flow.service.AccountabilityWorkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 村组干部维稳问责工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:38
 */
@RestController
@RequestMapping("/app/accountabilitywork")
public class AccountabilityWorkController extends BaseController {
	@Autowired
	private AccountabilityWorkService accountabilityWorkService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<AccountabilityWorkEntity> aidWorkRecord = accountabilityWorkService.queryList(query);
		resultSuccess(aidWorkRecord);
	}


	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		AccountabilityWorkEntity accountabilityWork = accountabilityWorkService.queryObject(id);
		resultSuccess(accountabilityWork);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(AccountabilityWorkEntity accountabilityWork, String pageName){
		accountabilityWorkService.save(accountabilityWork, pageName);
		resultSuccess();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("accountabilitywork:update")
	public R update(@RequestBody AccountabilityWorkEntity accountabilityWork){
		accountabilityWorkService.update(accountabilityWork);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("accountabilitywork:delete")
	public R delete(@RequestBody Integer[] ids){
		accountabilityWorkService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
