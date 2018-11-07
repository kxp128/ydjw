package com.ehootu.task.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ehootu.core.util.PageUtils;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.core.util.StringUtils;
import com.ehootu.task.model.Task;
import com.ehootu.task.service.TaskService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-26 14:24:14
 */
@RestController
@RequestMapping("/sys/task")
public class SysTaskController {
	@Autowired
	private TaskService taskService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Task> taskList = taskService.queryList(query);
		int total = taskService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(taskList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("sys:task:info")
	public R info(@PathVariable("id") String id){
		Task task = taskService.findById(id);
		if(StringUtils.isNotBlank(task.getExecutorId())){
			task.setExecutorIds(Arrays.asList(task.getExecutorId().split(",")));
		}
		return R.ok().put("task", task);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:task:save")
	public R save(@RequestBody Task task){
		StringBuffer stringBuffer = new StringBuffer();
		for(String str:task.getExecutorIds()){
			stringBuffer.append(str).append(",");
		}
		stringBuffer.deleteCharAt(stringBuffer.length()-1);
		task.setExecutorId(stringBuffer.toString());
		task.setCreateTime(new Date());
		task.setCompletionTimes(0);
		task.setExecutionTimes(task.getTaskType()==1?1:task.getExecutionTimes());
		task.setTaskStatus(1);
		taskService.save(task);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:task:update")
	public R update(@RequestBody Task task){
		StringBuffer stringBuffer = new StringBuffer();
		for(String str:task.getExecutorIds()){
			stringBuffer.append(str).append(",");
		}
		stringBuffer.deleteCharAt(stringBuffer.length()-1);
		task.setExecutorId(stringBuffer.toString());
		task.setUpdateTime(new Date());
		task.setExecutionTimes(task.getTaskType()==1?1:task.getExecutionTimes());
		taskService.update(task);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:task:delete")
	public R delete(@RequestBody String[] ids){
		taskService.deleteBatch(ids);
		return R.ok();
	}
	
}
