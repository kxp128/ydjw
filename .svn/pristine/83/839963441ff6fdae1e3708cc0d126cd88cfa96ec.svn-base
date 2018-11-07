package com.ehootu.flow.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.flow.model.BlockingEventEntity;
import com.ehootu.flow.service.BlockingEventService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 工程项目阻工事件记录 （舍弃，已取消该模块）
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:50:45
 */
@RestController
@RequestMapping("/app/blockingevent")
public class BlockingEventController extends BaseController {
	@Autowired
	private BlockingEventService blockingEventService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<BlockingEventEntity> aidWorkRecord = blockingEventService.queryList(query);
		resultSuccess(aidWorkRecord);
	}


	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		BlockingEventEntity blockingEvent = blockingEventService.queryObject(id);
		resultSuccess(blockingEvent);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(BlockingEventEntity blockingEvent, String pageName){
		blockingEventService.save(blockingEvent, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("blockingevent:update")
	public R update(@RequestBody BlockingEventEntity blockingEvent){
		blockingEventService.update(blockingEvent);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("blockingevent:delete")
	public R delete(@RequestBody Integer[] ids){
		blockingEventService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
