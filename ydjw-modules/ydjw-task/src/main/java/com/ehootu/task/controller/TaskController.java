package com.ehootu.task.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.task.model.Task;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.service.TaskService;
import com.ehootu.user.model.Police;
import com.ehootu.user.service.PoliceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * 通知公告控制器
 *
 * @author KongXiaoPing
 *
 *         2017年6月13日
 */
@Controller
@RequestMapping(value = "/task")
public class TaskController extends BaseController {
	
	private final static Logger log = LoggerFactory.getLogger(TaskController.class);

	@Autowired
	private TaskService taskService;

	@Autowired
	private PoliceService policeService;

	@RequestMapping(value = "/create")
	@ResponseBody
	public void create(Task task) {

		log.info(task.toString());

		int result = taskService.createTask(task);

		if (result ==0){
			resultError("1","添加失败");
		}else {
			resultSuccess();
		}
	}

	/**
	 * APP查询任务列表 分页
	 * @param id 警察id
	 *           "taskContent":"内容", //任务内容
				"page" 当前页 默认第一页
				"limit" 每页条数 默认10条
	 */
	@RequestMapping(value = "/finds/{id}")
	public void findList(@PathVariable("id") Integer id, @RequestParam Map<String ,Object> params){
		try {
			log.info("id--->"+id);
			log.info("params--->"+params);
			params.put("id",id);
			Query query = new Query(params);
			List<Task> list = taskService.findList(query);
			resultSuccess(list);
		} catch (Exception e) {
			e.printStackTrace();
			resultError("500","数据库异常");
		}
	}

	@RequestMapping(value = "find/{id}")
	public void findById(@PathVariable("id") String id ){

		Task list = taskService.findById(id);
		resultSuccess(list);
	}

	@RequestMapping(value = "findTaskExecution/{id}")
	public void findTaskExecution(@PathVariable("id") String id ){

		List<TaskExecution> list = taskService.findTaskExecution(id);
		resultSuccess(list);
	}

	/**
	 * 通id查询出
	 * @param taskId
	 */
	@RequestMapping(value = "/police/list/notin/{id}")
	public void policeListNotInTaskId(@PathVariable("id") String taskId){
		log.info("查询id:"+taskId);
		List<Police> policeList  = taskService.policeListNotInTaskId(taskId);
		resultSuccess(policeList);
	}
	/**
	 * 通id查询出
	 * @param taskId
	 */
	@RequestMapping(value = "/police/list/in/{id}")
	public void policeListInTaskId(@PathVariable("id") String taskId){
		log.info("查询id:"+taskId);
		List<Police> policeList  = taskService.policeListInTaskId(taskId);
		resultSuccess(policeList);
	}

	/**
	 * 成功添加了子任务后，点击提交修改该任务状态
	 * @param taskId
	 */
	@RequestMapping(value = "/update/status/{id}")
	public void taskUpdateStatus(@PathVariable("id") String taskId){
		try {
			Task task = taskService.findById(taskId);
			if(task!=null){
				task.setTaskStatus(2);
				taskService.update(task);
				resultSuccess();
			}else {
				resultError("提交出错");
			}
		}catch (Exception e){
			e.printStackTrace();
			resultError("提交出错");
		}
	}

}
