package com.ehootu.census.model;

import java.util.ArrayList;
import java.util.List;

public class BusinessBankAccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessBankAccountsExample() {
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

        public Criteria andBusinessBankIdIsNull() {
            addCriterion("business_bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdIsNotNull() {
            addCriterion("business_bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdEqualTo(Integer value) {
            addCriterion("business_bank_id =", value, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdNotEqualTo(Integer value) {
            addCriterion("business_bank_id <>", value, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdGreaterThan(Integer value) {
            addCriterion("business_bank_id >", value, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_bank_id >=", value, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdLessThan(Integer value) {
            addCriterion("business_bank_id <", value, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_bank_id <=", value, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdIn(List<Integer> values) {
            addCriterion("business_bank_id in", values, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdNotIn(List<Integer> values) {
            addCriterion("business_bank_id not in", values, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdBetween(Integer value1, Integer value2) {
            addCriterion("business_bank_id between", value1, value2, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_bank_id not between", value1, value2, "businessBankId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBankUserIsNull() {
            addCriterion("bank_user is null");
            return (Criteria) this;
        }

        public Criteria andBankUserIsNotNull() {
            addCriterion("bank_user is not null");
            return (Criteria) this;
        }

        public Criteria andBankUserEqualTo(String value) {
            addCriterion("bank_user =", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserNotEqualTo(String value) {
            addCriterion("bank_user <>", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserGreaterThan(String value) {
            addCriterion("bank_user >", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserGreaterThanOrEqualTo(String value) {
            addCriterion("bank_user >=", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserLessThan(String value) {
            addCriterion("bank_user <", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserLessThanOrEqualTo(String value) {
            addCriterion("bank_user <=", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserLike(String value) {
            addCriterion("bank_user like", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserNotLike(String value) {
            addCriterion("bank_user not like", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIn(List<String> values) {
            addCriterion("bank_user in", values, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserNotIn(List<String> values) {
            addCriterion("bank_user not in", values, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserBetween(String value1, String value2) {
            addCriterion("bank_user between", value1, value2, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserNotBetween(String value1, String value2) {
            addCriterion("bank_user not between", value1, value2, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaIsNull() {
            addCriterion("open_account_area is null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaIsNotNull() {
            addCriterion("open_account_area is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaEqualTo(String value) {
            addCriterion("open_account_area =", value, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaNotEqualTo(String value) {
            addCriterion("open_account_area <>", value, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaGreaterThan(String value) {
            addCriterion("open_account_area >", value, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaGreaterThanOrEqualTo(String value) {
            addCriterion("open_account_area >=", value, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaLessThan(String value) {
            addCriterion("open_account_area <", value, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaLessThanOrEqualTo(String value) {
            addCriterion("open_account_area <=", value, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaLike(String value) {
            addCriterion("open_account_area like", value, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaNotLike(String value) {
            addCriterion("open_account_area not like", value, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaIn(List<String> values) {
            addCriterion("open_account_area in", values, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaNotIn(List<String> values) {
            addCriterion("open_account_area not in", values, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaBetween(String value1, String value2) {
            addCriterion("open_account_area between", value1, value2, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andOpenAccountAreaNotBetween(String value1, String value2) {
            addCriterion("open_account_area not between", value1, value2, "openAccountArea");
            return (Criteria) this;
        }

        public Criteria andBankBranchIsNull() {
            addCriterion("bank_branch is null");
            return (Criteria) this;
        }

        public Criteria andBankBranchIsNotNull() {
            addCriterion("bank_branch is not null");
            return (Criteria) this;
        }

        public Criteria andBankBranchEqualTo(String value) {
            addCriterion("bank_branch =", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotEqualTo(String value) {
            addCriterion("bank_branch <>", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchGreaterThan(String value) {
            addCriterion("bank_branch >", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchGreaterThanOrEqualTo(String value) {
            addCriterion("bank_branch >=", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLessThan(String value) {
            addCriterion("bank_branch <", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLessThanOrEqualTo(String value) {
            addCriterion("bank_branch <=", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLike(String value) {
            addCriterion("bank_branch like", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotLike(String value) {
            addCriterion("bank_branch not like", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchIn(List<String> values) {
            addCriterion("bank_branch in", values, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotIn(List<String> values) {
            addCriterion("bank_branch not in", values, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchBetween(String value1, String value2) {
            addCriterion("bank_branch between", value1, value2, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotBetween(String value1, String value2) {
            addCriterion("bank_branch not between", value1, value2, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNull() {
            addCriterion("bank_number is null");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNotNull() {
            addCriterion("bank_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankNumberEqualTo(String value) {
            addCriterion("bank_number =", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotEqualTo(String value) {
            addCriterion("bank_number <>", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThan(String value) {
            addCriterion("bank_number >", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_number >=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThan(String value) {
            addCriterion("bank_number <", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_number <=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLike(String value) {
            addCriterion("bank_number like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotLike(String value) {
            addCriterion("bank_number not like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberIn(List<String> values) {
            addCriterion("bank_number in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotIn(List<String> values) {
            addCriterion("bank_number not in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberBetween(String value1, String value2) {
            addCriterion("bank_number between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotBetween(String value1, String value2) {
            addCriterion("bank_number not between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Integer value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Integer value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Integer value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Integer value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Integer> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Integer> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Integer value1, Integer value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("created not between", value1, value2, "created");
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