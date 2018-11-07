package com.ehootu.user.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoliceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliceExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordIsNull() {
            addCriterion("police_password is null");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordIsNotNull() {
            addCriterion("police_password is not null");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordEqualTo(String value) {
            addCriterion("police_password =", value, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordNotEqualTo(String value) {
            addCriterion("police_password <>", value, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordGreaterThan(String value) {
            addCriterion("police_password >", value, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("police_password >=", value, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordLessThan(String value) {
            addCriterion("police_password <", value, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordLessThanOrEqualTo(String value) {
            addCriterion("police_password <=", value, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordLike(String value) {
            addCriterion("police_password like", value, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordNotLike(String value) {
            addCriterion("police_password not like", value, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordIn(List<String> values) {
            addCriterion("police_password in", values, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordNotIn(List<String> values) {
            addCriterion("police_password not in", values, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordBetween(String value1, String value2) {
            addCriterion("police_password between", value1, value2, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPolicePasswordNotBetween(String value1, String value2) {
            addCriterion("police_password not between", value1, value2, "policePassword");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIsNull() {
            addCriterion("police_name is null");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIsNotNull() {
            addCriterion("police_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceNameEqualTo(String value) {
            addCriterion("police_name =", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotEqualTo(String value) {
            addCriterion("police_name <>", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameGreaterThan(String value) {
            addCriterion("police_name >", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameGreaterThanOrEqualTo(String value) {
            addCriterion("police_name >=", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLessThan(String value) {
            addCriterion("police_name <", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLessThanOrEqualTo(String value) {
            addCriterion("police_name <=", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLike(String value) {
            addCriterion("police_name like", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotLike(String value) {
            addCriterion("police_name not like", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIn(List<String> values) {
            addCriterion("police_name in", values, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotIn(List<String> values) {
            addCriterion("police_name not in", values, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameBetween(String value1, String value2) {
            addCriterion("police_name between", value1, value2, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotBetween(String value1, String value2) {
            addCriterion("police_name not between", value1, value2, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberIsNull() {
            addCriterion("police_number is null");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberIsNotNull() {
            addCriterion("police_number is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberEqualTo(String value) {
            addCriterion("police_number =", value, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberNotEqualTo(String value) {
            addCriterion("police_number <>", value, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberGreaterThan(String value) {
            addCriterion("police_number >", value, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("police_number >=", value, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberLessThan(String value) {
            addCriterion("police_number <", value, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberLessThanOrEqualTo(String value) {
            addCriterion("police_number <=", value, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberLike(String value) {
            addCriterion("police_number like", value, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberNotLike(String value) {
            addCriterion("police_number not like", value, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberIn(List<String> values) {
            addCriterion("police_number in", values, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberNotIn(List<String> values) {
            addCriterion("police_number not in", values, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberBetween(String value1, String value2) {
            addCriterion("police_number between", value1, value2, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceNumberNotBetween(String value1, String value2) {
            addCriterion("police_number not between", value1, value2, "policeNumber");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIsNull() {
            addCriterion("police_station is null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIsNotNull() {
            addCriterion("police_station is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationEqualTo(String value) {
            addCriterion("police_station =", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotEqualTo(String value) {
            addCriterion("police_station <>", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationGreaterThan(String value) {
            addCriterion("police_station >", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationGreaterThanOrEqualTo(String value) {
            addCriterion("police_station >=", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLessThan(String value) {
            addCriterion("police_station <", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLessThanOrEqualTo(String value) {
            addCriterion("police_station <=", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLike(String value) {
            addCriterion("police_station like", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotLike(String value) {
            addCriterion("police_station not like", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIn(List<String> values) {
            addCriterion("police_station in", values, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotIn(List<String> values) {
            addCriterion("police_station not in", values, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationBetween(String value1, String value2) {
            addCriterion("police_station between", value1, value2, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotBetween(String value1, String value2) {
            addCriterion("police_station not between", value1, value2, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeIsNull() {
            addCriterion("police_office is null");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeIsNotNull() {
            addCriterion("police_office is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeEqualTo(String value) {
            addCriterion("police_office =", value, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeNotEqualTo(String value) {
            addCriterion("police_office <>", value, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeGreaterThan(String value) {
            addCriterion("police_office >", value, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("police_office >=", value, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeLessThan(String value) {
            addCriterion("police_office <", value, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeLessThanOrEqualTo(String value) {
            addCriterion("police_office <=", value, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeLike(String value) {
            addCriterion("police_office like", value, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeNotLike(String value) {
            addCriterion("police_office not like", value, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeIn(List<String> values) {
            addCriterion("police_office in", values, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeNotIn(List<String> values) {
            addCriterion("police_office not in", values, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeBetween(String value1, String value2) {
            addCriterion("police_office between", value1, value2, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andPoliceOfficeNotBetween(String value1, String value2) {
            addCriterion("police_office not between", value1, value2, "policeOffice");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andParentNumberIsNull() {
            addCriterion("parent_number is null");
            return (Criteria) this;
        }

        public Criteria andParentNumberIsNotNull() {
            addCriterion("parent_number is not null");
            return (Criteria) this;
        }

        public Criteria andParentNumberEqualTo(String value) {
            addCriterion("parent_number =", value, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberNotEqualTo(String value) {
            addCriterion("parent_number <>", value, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberGreaterThan(String value) {
            addCriterion("parent_number >", value, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("parent_number >=", value, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberLessThan(String value) {
            addCriterion("parent_number <", value, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberLessThanOrEqualTo(String value) {
            addCriterion("parent_number <=", value, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberLike(String value) {
            addCriterion("parent_number like", value, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberNotLike(String value) {
            addCriterion("parent_number not like", value, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberIn(List<String> values) {
            addCriterion("parent_number in", values, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberNotIn(List<String> values) {
            addCriterion("parent_number not in", values, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberBetween(String value1, String value2) {
            addCriterion("parent_number between", value1, value2, "parentNumber");
            return (Criteria) this;
        }

        public Criteria andParentNumberNotBetween(String value1, String value2) {
            addCriterion("parent_number not between", value1, value2, "parentNumber");
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

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
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