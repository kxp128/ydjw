package com.ehootu.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExecutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExecutionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(String value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(String value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(String value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(String value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(String value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<String> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<String> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(String value1, String value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(String value1, String value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameIsNull() {
            addCriterion("son_task_name is null");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameIsNotNull() {
            addCriterion("son_task_name is not null");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameEqualTo(String value) {
            addCriterion("son_task_name =", value, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameNotEqualTo(String value) {
            addCriterion("son_task_name <>", value, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameGreaterThan(String value) {
            addCriterion("son_task_name >", value, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("son_task_name >=", value, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameLessThan(String value) {
            addCriterion("son_task_name <", value, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameLessThanOrEqualTo(String value) {
            addCriterion("son_task_name <=", value, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameLike(String value) {
            addCriterion("son_task_name like", value, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameNotLike(String value) {
            addCriterion("son_task_name not like", value, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameIn(List<String> values) {
            addCriterion("son_task_name in", values, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameNotIn(List<String> values) {
            addCriterion("son_task_name not in", values, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameBetween(String value1, String value2) {
            addCriterion("son_task_name between", value1, value2, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andSonTaskNameNotBetween(String value1, String value2) {
            addCriterion("son_task_name not between", value1, value2, "sonTaskName");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNull() {
            addCriterion("page_name is null");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNotNull() {
            addCriterion("page_name is not null");
            return (Criteria) this;
        }

        public Criteria andPageNameEqualTo(String value) {
            addCriterion("page_name =", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotEqualTo(String value) {
            addCriterion("page_name <>", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThan(String value) {
            addCriterion("page_name >", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("page_name >=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThan(String value) {
            addCriterion("page_name <", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThanOrEqualTo(String value) {
            addCriterion("page_name <=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLike(String value) {
            addCriterion("page_name like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotLike(String value) {
            addCriterion("page_name not like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameIn(List<String> values) {
            addCriterion("page_name in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotIn(List<String> values) {
            addCriterion("page_name not in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameBetween(String value1, String value2) {
            addCriterion("page_name between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotBetween(String value1, String value2) {
            addCriterion("page_name not between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsIsNull() {
            addCriterion("executor_ids is null");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsIsNotNull() {
            addCriterion("executor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsEqualTo(String value) {
            addCriterion("executor_ids =", value, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsNotEqualTo(String value) {
            addCriterion("executor_ids <>", value, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsGreaterThan(String value) {
            addCriterion("executor_ids >", value, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("executor_ids >=", value, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsLessThan(String value) {
            addCriterion("executor_ids <", value, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsLessThanOrEqualTo(String value) {
            addCriterion("executor_ids <=", value, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsLike(String value) {
            addCriterion("executor_ids like", value, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsNotLike(String value) {
            addCriterion("executor_ids not like", value, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsIn(List<String> values) {
            addCriterion("executor_ids in", values, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsNotIn(List<String> values) {
            addCriterion("executor_ids not in", values, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsBetween(String value1, String value2) {
            addCriterion("executor_ids between", value1, value2, "executorIds");
            return (Criteria) this;
        }

        public Criteria andExecutorIdsNotBetween(String value1, String value2) {
            addCriterion("executor_ids not between", value1, value2, "executorIds");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSpareField1IsNull() {
            addCriterion("spare_field1 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField1IsNotNull() {
            addCriterion("spare_field1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField1EqualTo(Integer value) {
            addCriterion("spare_field1 =", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotEqualTo(Integer value) {
            addCriterion("spare_field1 <>", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1GreaterThan(Integer value) {
            addCriterion("spare_field1 >", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1GreaterThanOrEqualTo(Integer value) {
            addCriterion("spare_field1 >=", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1LessThan(Integer value) {
            addCriterion("spare_field1 <", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1LessThanOrEqualTo(Integer value) {
            addCriterion("spare_field1 <=", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1In(List<Integer> values) {
            addCriterion("spare_field1 in", values, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotIn(List<Integer> values) {
            addCriterion("spare_field1 not in", values, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1Between(Integer value1, Integer value2) {
            addCriterion("spare_field1 between", value1, value2, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotBetween(Integer value1, Integer value2) {
            addCriterion("spare_field1 not between", value1, value2, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField2IsNull() {
            addCriterion("spare_field2 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField2IsNotNull() {
            addCriterion("spare_field2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField2EqualTo(Integer value) {
            addCriterion("spare_field2 =", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotEqualTo(Integer value) {
            addCriterion("spare_field2 <>", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2GreaterThan(Integer value) {
            addCriterion("spare_field2 >", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2GreaterThanOrEqualTo(Integer value) {
            addCriterion("spare_field2 >=", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2LessThan(Integer value) {
            addCriterion("spare_field2 <", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2LessThanOrEqualTo(Integer value) {
            addCriterion("spare_field2 <=", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2In(List<Integer> values) {
            addCriterion("spare_field2 in", values, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotIn(List<Integer> values) {
            addCriterion("spare_field2 not in", values, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2Between(Integer value1, Integer value2) {
            addCriterion("spare_field2 between", value1, value2, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotBetween(Integer value1, Integer value2) {
            addCriterion("spare_field2 not between", value1, value2, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField3IsNull() {
            addCriterion("spare_field3 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField3IsNotNull() {
            addCriterion("spare_field3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField3EqualTo(Integer value) {
            addCriterion("spare_field3 =", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotEqualTo(Integer value) {
            addCriterion("spare_field3 <>", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3GreaterThan(Integer value) {
            addCriterion("spare_field3 >", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3GreaterThanOrEqualTo(Integer value) {
            addCriterion("spare_field3 >=", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3LessThan(Integer value) {
            addCriterion("spare_field3 <", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3LessThanOrEqualTo(Integer value) {
            addCriterion("spare_field3 <=", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3In(List<Integer> values) {
            addCriterion("spare_field3 in", values, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotIn(List<Integer> values) {
            addCriterion("spare_field3 not in", values, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3Between(Integer value1, Integer value2) {
            addCriterion("spare_field3 between", value1, value2, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotBetween(Integer value1, Integer value2) {
            addCriterion("spare_field3 not between", value1, value2, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField4IsNull() {
            addCriterion("spare_field4 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField4IsNotNull() {
            addCriterion("spare_field4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField4EqualTo(String value) {
            addCriterion("spare_field4 =", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotEqualTo(String value) {
            addCriterion("spare_field4 <>", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4GreaterThan(String value) {
            addCriterion("spare_field4 >", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field4 >=", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4LessThan(String value) {
            addCriterion("spare_field4 <", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4LessThanOrEqualTo(String value) {
            addCriterion("spare_field4 <=", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4Like(String value) {
            addCriterion("spare_field4 like", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotLike(String value) {
            addCriterion("spare_field4 not like", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4In(List<String> values) {
            addCriterion("spare_field4 in", values, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotIn(List<String> values) {
            addCriterion("spare_field4 not in", values, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4Between(String value1, String value2) {
            addCriterion("spare_field4 between", value1, value2, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotBetween(String value1, String value2) {
            addCriterion("spare_field4 not between", value1, value2, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField5IsNull() {
            addCriterion("spare_field5 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField5IsNotNull() {
            addCriterion("spare_field5 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField5EqualTo(String value) {
            addCriterion("spare_field5 =", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotEqualTo(String value) {
            addCriterion("spare_field5 <>", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5GreaterThan(String value) {
            addCriterion("spare_field5 >", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field5 >=", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5LessThan(String value) {
            addCriterion("spare_field5 <", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5LessThanOrEqualTo(String value) {
            addCriterion("spare_field5 <=", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5Like(String value) {
            addCriterion("spare_field5 like", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotLike(String value) {
            addCriterion("spare_field5 not like", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5In(List<String> values) {
            addCriterion("spare_field5 in", values, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotIn(List<String> values) {
            addCriterion("spare_field5 not in", values, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5Between(String value1, String value2) {
            addCriterion("spare_field5 between", value1, value2, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotBetween(String value1, String value2) {
            addCriterion("spare_field5 not between", value1, value2, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField6IsNull() {
            addCriterion("spare_field6 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField6IsNotNull() {
            addCriterion("spare_field6 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField6EqualTo(String value) {
            addCriterion("spare_field6 =", value, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6NotEqualTo(String value) {
            addCriterion("spare_field6 <>", value, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6GreaterThan(String value) {
            addCriterion("spare_field6 >", value, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field6 >=", value, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6LessThan(String value) {
            addCriterion("spare_field6 <", value, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6LessThanOrEqualTo(String value) {
            addCriterion("spare_field6 <=", value, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6Like(String value) {
            addCriterion("spare_field6 like", value, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6NotLike(String value) {
            addCriterion("spare_field6 not like", value, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6In(List<String> values) {
            addCriterion("spare_field6 in", values, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6NotIn(List<String> values) {
            addCriterion("spare_field6 not in", values, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6Between(String value1, String value2) {
            addCriterion("spare_field6 between", value1, value2, "spareField6");
            return (Criteria) this;
        }

        public Criteria andSpareField6NotBetween(String value1, String value2) {
            addCriterion("spare_field6 not between", value1, value2, "spareField6");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}