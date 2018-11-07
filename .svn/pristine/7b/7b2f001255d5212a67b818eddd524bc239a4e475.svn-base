package com.ehootu.task.dao;

import com.ehootu.task.model.TaskExecution;
import com.ehootu.task.model.TaskExecutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskExecutionMapper {
    long countByExample(TaskExecutionExample example);

    int deleteByExample(TaskExecutionExample example);

    int deleteByPrimaryKey(String id);

    int insert(TaskExecution record);

    int insertSelective(TaskExecution record);

    List<TaskExecution> selectByExample(TaskExecutionExample example);

    TaskExecution selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TaskExecution record, @Param("example") TaskExecutionExample example);

    int updateByExample(@Param("record") TaskExecution record, @Param("example") TaskExecutionExample example);

    int updateByPrimaryKeySelective(TaskExecution record);

    int updateByPrimaryKey(TaskExecution record);
}