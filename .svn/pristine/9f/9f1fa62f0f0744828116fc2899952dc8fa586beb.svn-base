package com.ehootu.task.service;

import com.ehootu.core.generic.GenericService;
import com.ehootu.core.util.Query;
import com.ehootu.task.model.Task;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.user.model.Police;

import java.util.List;
import java.util.Map;

/**
 * @author zhangyong
 * @create 2017-12-04 10:39
 * 任务服务
 **/
public interface TaskService extends GenericService<Task, String> {

    int createTask(Task task);


    List<Task> findList(Query query);

    Task findById(String id);

    List<TaskExecution> findTaskExecution(String id);

    int createTaskExecution(TaskExecution taskExecution);

    //通过任务ID查询在此任务下的警务人员
    List<Police> policeListInTaskId(String taskId);

    //通过任务ID查询在此任务下的同警务室的警务人员
    List<Police> policeListNotInTaskId(String taskId);

    void updateTimes(String taskId);


    Task queryObject(Integer id);

    List<Task> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(Task task);

    void deleteBatch(String[] ids);

}
