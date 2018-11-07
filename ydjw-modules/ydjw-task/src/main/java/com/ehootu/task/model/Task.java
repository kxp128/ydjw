package com.ehootu.task.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * 任务下发实体类
 */
public class Task {
    //表ID
    private String id;
    //任务类型  1：普通任务==>执行次数只有1次；2：常规任务 可以有多次
    private Integer taskType;
    //任务状态  1：未完成  2：已完成
    private Integer taskStatus;
    //任务内容
    private String taskContent;
    //执行人的ID 多个 用“；”隔开
    private String executorId;

    private List<String> executorIds;
    //执行次数
    private Integer executionTimes;
    //完成次数
    private Integer completionTimes;
    //创建人名字
    private String createPersonName;
    //创建人ID
    private Integer createPersonId;
    //创建时间
    @JSONField(format = "yyyy-MM-dd")
    private Date createTime;
    //修改时间
    @JSONField(format = "yyyy-MM-dd")
    private Date updateTime;
    //任务开始时间
    @JSONField(format = "yyyy-MM-dd")
    private Date beginTime;
    //任务结束时间
    @JSONField(format = "yyyy-MM-dd")
    private Date endTime;
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
    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getExecutionTimes() {
        return executionTimes;
    }

    public void setExecutionTimes(Integer executionTimes) {
        this.executionTimes = executionTimes;
    }

    public Integer getCompletionTimes() {
        return completionTimes;
    }

    public void setCompletionTimes(Integer completionTimes) {
        this.completionTimes = completionTimes;
    }

    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId == null ? null : executorId.trim();
    }

    public String getCreatePersonName() {
        return createPersonName;
    }

    public void setCreatePersonName(String createPersonName) {
        this.createPersonName = createPersonName == null ? null : createPersonName.trim();
    }

    public Integer getCreatePersonId() {
        return createPersonId;
    }

    public void setCreatePersonId(Integer createPersonId) {
        this.createPersonId = createPersonId;
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

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
    }

    public List<String> getExecutorIds() {
        return executorIds;
    }

    public void setExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", taskType=" + taskType +
                ", taskStatus=" + taskStatus +
                ", taskContent='" + taskContent + '\'' +
                ", executorId='" + executorId + '\'' +
                ", executionTimes=" + executionTimes +
                ", completionTimes=" + completionTimes +
                ", createPersonName='" + createPersonName + '\'' +
                ", createPersonId=" + createPersonId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", spareField1=" + spareField1 +
                ", spareField2=" + spareField2 +
                ", spareField3=" + spareField3 +
                ", spareField4='" + spareField4 + '\'' +
                ", spareField5='" + spareField5 + '\'' +
                ", spareField6='" + spareField6 + '\'' +
                '}';
    }
}