package com.ehootu.task.dao;

import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.util.Query;
import com.ehootu.task.model.Task;
import com.ehootu.task.model.TaskExample;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TaskMapper extends GenericDao<Task, String> {
    long countByExample(TaskExample example);

    int deleteByExample(TaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(Task record);

    int insertSelective(Task record);

    List<Task> selectByExampleWithBLOBs(TaskExample example);

    List<Task> selectByExample(TaskExample example);

    Task selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByExampleWithBLOBs(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKeyWithBLOBs(Task record);

    int updateByPrimaryKey(Task record);

    List<Task> findByExecutorId(Query query);

    //获取列表数据
    List<Task> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int deleteBatch(String[] id);
}