package com.ehootu.task.service.impl;

import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.generic.GenericServiceImpl;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.StringUtils;
import com.ehootu.task.dao.TaskExecutionMapper;
import com.ehootu.task.dao.TaskMapper;
import com.ehootu.task.model.Task;
import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.model.TaskExecutionExample;
import com.ehootu.task.service.TaskService;
import com.ehootu.task.util.WSServer;
import com.ehootu.user.dao.PoliceMapper;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.PoliceExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author zhangyong
 * @create 2017-12-04 10:41
 **/

@Service
public class TaskServiceImpl extends GenericServiceImpl<Task, String> implements TaskService {
    private final static Logger log = LoggerFactory.getLogger(TaskServiceImpl.class);


    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private TaskExecutionMapper taskExecutionMapper;

    @Autowired
    private PoliceMapper policeMapper;

    @Override
    public GenericDao<Task, String> getDao() {
        return taskMapper;
    }

    @Override
    public List<Task> findList(Query query) {
        return taskMapper.findByExecutorId(query);
    }

    @Override
    public Task findById(String id) {
        return taskMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TaskExecution> findTaskExecution(String id) {
        TaskExecutionExample example = new TaskExecutionExample();
        example.createCriteria().andTaskIdEqualTo(id);
        List<TaskExecution> list = taskExecutionMapper.selectByExample(example);
        List<String> executorNames;
        for(TaskExecution taskExecution:list){
            executorNames = new ArrayList<>();
            String executorIds = taskExecution.getExecutorIds();
            if(StringUtils.isNotBlank(executorIds)){
                String[] strings;
                if(executorIds.contains(",")){
                    strings = executorIds.split(",");
                }else {
                    strings = new String[1];
                    strings[0]= executorIds;
                }
                for (int i=0;i<strings.length;i++){
                    log.info(strings[i]);
                    Police police = policeMapper.selectByPrimaryKey(strings[i]);
                    if(police!=null){
                        executorNames.add(police.getPoliceName());
                    }
                }
            }
            taskExecution.setExecutorNames(executorNames);
        }

        return list;
    }

    @Override
    public int createTaskExecution(TaskExecution taskExecution) {
        updateTimes(taskExecution.getTaskId());
        return taskExecutionMapper.insertSelective(taskExecution);
    }



    @Override
    public int createTask(Task task) {
        //获取执行人的ids
        String executorIds = task.getExecutorId();
        if (StringUtils.isNotBlank(executorIds)){
            String[] ids;
            if(executorIds.contains(",")){
                ids  = executorIds.split(",");
            }else{
                ids = new String[1];
                ids[0] =executorIds;
            }
            log.info("ids:"+ids);
            for(int i=0;i<ids.length;i++){
                log.info("ids:"+ids[i]);
                sendText(ids[i]);
            }
            task.setTaskStatus(1);//设置该任务为未完成任务
            return taskMapper.insert(task);
        }
        return 0;
    }

    private  static void sendText(String id){
        List<WSServer> list = WSServer.sessionList;
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            WSServer wsServer = (WSServer) iterator.next();
            if(wsServer.userId.equals(id)) {
                try {
                    log.info("id:"+id);
                    wsServer.session.getBasicRemote().sendText("1");
                }catch (IOException e){
                    log.debug(e.toString());
                }
            }
        }
    }

    @Override
    public List<Police> policeListInTaskId(String taskId) {
        Task task = taskMapper.selectByPrimaryKey(taskId);
        List<Police> list = null;
        if (task!=null){
            String executorId  = task.getExecutorId();
            List<String> integers = StringUtils.integerList(executorId);

            if (integers.size()==0){
                return null;
            }

            PoliceExample example = new PoliceExample();
            example.createCriteria().andIdIn(integers);
            list = policeMapper.selectByExample(example);
        }
        return list;
    }

    @Override
    public List<Police> policeListNotInTaskId(String taskId) {
        Task task = taskMapper.selectByPrimaryKey(taskId);
        List<Police> list = null;
        if (task!=null){
            String executorId  = task.getExecutorId();
            List<String> integers = StringUtils.integerList(executorId);
            Police police =null;
            if (integers.size()==0){
                return null;
            }else {
                police = policeMapper.selectByPrimaryKey(integers.get(0));
            }
            if (!StringUtils.isNoneBlank(police.getPoliceOffice())) {
                return null;
            }
            PoliceExample example = new PoliceExample();
            example.createCriteria().
                    andPoliceOfficeEqualTo(police.getPoliceOffice()).andIdNotIn(integers);
            list = policeMapper.selectByExample(example);
        }
        return list;
    }

    @Override
    public void updateTimes(String taskId) {
        Task task =taskMapper.selectByPrimaryKey(taskId);
        if(task!=null){
            task.setCompletionTimes(task.getCompletionTimes()+1);
            taskMapper.updateByPrimaryKey(task);
        }
    }

    @Override
    public Task queryObject(Integer id) {
        return null;
    }

    @Override
    public List<Task> queryList(Map<String, Object> map) {
        return taskMapper.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return taskMapper.queryTotal(map);
    }

    @Override
    public void save(Task task) {
        taskMapper.insertSelective(task);
    }


    @Override
    public void deleteBatch(String[] ids) {
        taskMapper.deleteBatch(ids);
    }
}
