package com.ehootu.task.model;

import java.util.Date;
import java.util.List;

/**
 * 任务执行实体类
 */
public class TaskExecution {
    //表ID
    private String id;
    //任务ID
    private String taskId;
    //表ID
    private String tableId;
    //表名
    private String tableName;
    //子任务名
    private String sonTaskName;
    //详情页面名称
    private String pageName;
    //执行人ids
    private String executorIds;
    //执行人名称
    List<String> executorNames;
    //标志
    private Integer flag;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //预留字段1
    private Integer spareField1;
    //预留字段2
    private Integer spareField2;
    //预留字段3
    private Integer spareField3;
    //预留字段4
    private String spareField4;
    //预留字段5
    private String spareField5;
    //预留字段6
    private String spareField6;
	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getSonTaskName() {
        return sonTaskName;
    }

    public void setSonTaskName(String sonTaskName) {
        this.sonTaskName = sonTaskName == null ? null : sonTaskName.trim();
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }

    public String getExecutorIds() {
        return executorIds;
    }

    public void setExecutorIds(String executorIds) {
        this.executorIds = executorIds == null ? null : executorIds.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSpareField1() {
        return spareField1;
    }

    public void setSpareField1(Integer spareField1) {
        this.spareField1 = spareField1;
    }

    public Integer getSpareField2() {
        return spareField2;
    }

    public void setSpareField2(Integer spareField2) {
        this.spareField2 = spareField2;
    }

    public Integer getSpareField3() {
        return spareField3;
    }

    public void setSpareField3(Integer spareField3) {
        this.spareField3 = spareField3;
    }

    public String getSpareField4() {
        return spareField4;
    }

    public void setSpareField4(String spareField4) {
        this.spareField4 = spareField4 == null ? null : spareField4.trim();
    }

    public String getSpareField5() {
        return spareField5;
    }

    public void setSpareField5(String spareField5) {
        this.spareField5 = spareField5 == null ? null : spareField5.trim();
    }

    public String getSpareField6() {
        return spareField6;
    }

    public void setSpareField6(String spareField6) {
        this.spareField6 = spareField6 == null ? null : spareField6.trim();
    }

    public List<String> getExecutorNames() {
        return executorNames;
    }

    public void setExecutorNames(List<String> executorNames) {
        this.executorNames = executorNames;
    }
}