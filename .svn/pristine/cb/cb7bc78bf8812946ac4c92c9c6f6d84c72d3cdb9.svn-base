package com.ehootu.flow.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.flow.model.SixPartyTalksEntity;
import com.ehootu.flow.service.SixPartyTalksService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 流动警务室六方会谈工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:33
 */
@RestController
@RequestMapping("/app/sixpartytalks")
public class SixPartyTalksController extends BaseController {
	@Autowired
	private SixPartyTalksService sixPartyTalksService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<SixPartyTalksEntity> aidWorkRecord = sixPartyTalksService.queryList(query);
		resultSuccess(aidWorkRecord);
	}


	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		SixPartyTalksEntity sixPartyTalks = sixPartyTalksService.queryObject(id);
		resultSuccess(sixPartyTalks);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(SixPartyTalksEntity sixPartyTalks, String pageName){
		sixPartyTalksService.save(sixPartyTalks, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sixpartytalks:update")
	public R update(@RequestBody SixPartyTalksEntity sixPartyTalks){
		sixPartyTalksService.update(sixPartyTalks);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sixpartytalks:delete")
	public R delete(@RequestBody Integer[] ids){
		sixPartyTalksService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
