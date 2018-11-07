package com.ehootu.flow.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonFlowExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNull() {
            addCriterion("police_id is null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNotNull() {
            addCriterion("police_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdEqualTo(Integer value) {
            addCriterion("police_id =", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotEqualTo(Integer value) {
            addCriterion("police_id <>", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThan(Integer value) {
            addCriterion("police_id >", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("police_id >=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThan(Integer value) {
            addCriterion("police_id <", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThanOrEqualTo(Integer value) {
            addCriterion("police_id <=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIn(List<Integer> values) {
            addCriterion("police_id in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotIn(List<Integer> values) {
            addCriterion("police_id not in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdBetween(Integer value1, Integer value2) {
            addCriterion("police_id between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("police_id not between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andFloatingNameIsNull() {
            addCriterion("floating_name is null");
            return (Criteria) this;
        }

        public Criteria andFloatingNameIsNotNull() {
            addCriterion("floating_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloatingNameEqualTo(String value) {
            addCriterion("floating_name =", value, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameNotEqualTo(String value) {
            addCriterion("floating_name <>", value, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameGreaterThan(String value) {
            addCriterion("floating_name >", value, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameGreaterThanOrEqualTo(String value) {
            addCriterion("floating_name >=", value, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameLessThan(String value) {
            addCriterion("floating_name <", value, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameLessThanOrEqualTo(String value) {
            addCriterion("floating_name <=", value, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameLike(String value) {
            addCriterion("floating_name like", value, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameNotLike(String value) {
            addCriterion("floating_name not like", value, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameIn(List<String> values) {
            addCriterion("floating_name in", values, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameNotIn(List<String> values) {
            addCriterion("floating_name not in", values, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameBetween(String value1, String value2) {
            addCriterion("floating_name between", value1, value2, "floatingName");
            return (Criteria) this;
        }

        public Criteria andFloatingNameNotBetween(String value1, String value2) {
            addCriterion("floating_name not between", value1, value2, "floatingName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(Integer value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(Integer value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(Integer value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(Integer value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(Integer value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<Integer> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<Integer> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(Integer value1, Integer value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andWorkStationIsNull() {
            addCriterion("work_station is null");
            return (Criteria) this;
        }

        public Criteria andWorkStationIsNotNull() {
            addCriterion("work_station is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStationEqualTo(String value) {
            addCriterion("work_station =", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationNotEqualTo(String value) {
            addCriterion("work_station <>", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationGreaterThan(String value) {
            addCriterion("work_station >", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationGreaterThanOrEqualTo(String value) {
            addCriterion("work_station >=", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationLessThan(String value) {
            addCriterion("work_station <", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationLessThanOrEqualTo(String value) {
            addCriterion("work_station <=", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationLike(String value) {
            addCriterion("work_station like", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationNotLike(String value) {
            addCriterion("work_station not like", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationIn(List<String> values) {
            addCriterion("work_station in", values, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationNotIn(List<String> values) {
            addCriterion("work_station not in", values, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationBetween(String value1, String value2) {
            addCriterion("work_station between", value1, value2, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationNotBetween(String value1, String value2) {
            addCriterion("work_station not between", value1, value2, "workStation");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsIsNull() {
            addCriterion("personal_effects is null");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsIsNotNull() {
            addCriterion("personal_effects is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsEqualTo(String value) {
            addCriterion("personal_effects =", value, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsNotEqualTo(String value) {
            addCriterion("personal_effects <>", value, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsGreaterThan(String value) {
            addCriterion("personal_effects >", value, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsGreaterThanOrEqualTo(String value) {
            addCriterion("personal_effects >=", value, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsLessThan(String value) {
            addCriterion("personal_effects <", value, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsLessThanOrEqualTo(String value) {
            addCriterion("personal_effects <=", value, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsLike(String value) {
            addCriterion("personal_effects like", value, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsNotLike(String value) {
            addCriterion("personal_effects not like", value, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsIn(List<String> values) {
            addCriterion("personal_effects in", values, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsNotIn(List<String> values) {
            addCriterion("personal_effects not in", values, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsBetween(String value1, String value2) {
            addCriterion("personal_effects between", value1, value2, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalEffectsNotBetween(String value1, String value2) {
            addCriterion("personal_effects not between", value1, value2, "personalEffects");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureIsNull() {
            addCriterion("personal_feature is null");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureIsNotNull() {
            addCriterion("personal_feature is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureEqualTo(String value) {
            addCriterion("personal_feature =", value, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureNotEqualTo(String value) {
            addCriterion("personal_feature <>", value, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureGreaterThan(String value) {
            addCriterion("personal_feature >", value, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("personal_feature >=", value, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureLessThan(String value) {
            addCriterion("personal_feature <", value, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureLessThanOrEqualTo(String value) {
            addCriterion("personal_feature <=", value, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureLike(String value) {
            addCriterion("personal_feature like", value, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureNotLike(String value) {
            addCriterion("personal_feature not like", value, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureIn(List<String> values) {
            addCriterion("personal_feature in", values, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureNotIn(List<String> values) {
            addCriterion("personal_feature not in", values, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureBetween(String value1, String value2) {
            addCriterion("personal_feature between", value1, value2, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andPersonalFeatureNotBetween(String value1, String value2) {
            addCriterion("personal_feature not between", value1, value2, "personalFeature");
            return (Criteria) this;
        }

        public Criteria andInflowTimeIsNull() {
            addCriterion("inflow_time is null");
            return (Criteria) this;
        }

        public Criteria andInflowTimeIsNotNull() {
            addCriterion("inflow_time is not null");
            return (Criteria) this;
        }

        public Criteria andInflowTimeEqualTo(Date value) {
            addCriterion("inflow_time =", value, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeNotEqualTo(Date value) {
            addCriterion("inflow_time <>", value, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeGreaterThan(Date value) {
            addCriterion("inflow_time >", value, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inflow_time >=", value, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeLessThan(Date value) {
            addCriterion("inflow_time <", value, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeLessThanOrEqualTo(Date value) {
            addCriterion("inflow_time <=", value, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeIn(List<Date> values) {
            addCriterion("inflow_time in", values, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeNotIn(List<Date> values) {
            addCriterion("inflow_time not in", values, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeBetween(Date value1, Date value2) {
            addCriterion("inflow_time between", value1, value2, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andInflowTimeNotBetween(Date value1, Date value2) {
            addCriterion("inflow_time not between", value1, value2, "inflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeIsNull() {
            addCriterion("outflow_time is null");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeIsNotNull() {
            addCriterion("outflow_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeEqualTo(Date value) {
            addCriterion("outflow_time =", value, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeNotEqualTo(Date value) {
            addCriterion("outflow_time <>", value, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeGreaterThan(Date value) {
            addCriterion("outflow_time >", value, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("outflow_time >=", value, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeLessThan(Date value) {
            addCriterion("outflow_time <", value, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeLessThanOrEqualTo(Date value) {
            addCriterion("outflow_time <=", value, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeIn(List<Date> values) {
            addCriterion("outflow_time in", values, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeNotIn(List<Date> values) {
            addCriterion("outflow_time not in", values, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeBetween(Date value1, Date value2) {
            addCriterion("outflow_time between", value1, value2, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andOutflowTimeNotBetween(Date value1, Date value2) {
            addCriterion("outflow_time not between", value1, value2, "outflowTime");
            return (Criteria) this;
        }

        public Criteria andFlowReasonIsNull() {
            addCriterion("flow_reason is null");
            return (Criteria) this;
        }

        public Criteria andFlowReasonIsNotNull() {
            addCriterion("flow_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFlowReasonEqualTo(String value) {
            addCriterion("flow_reason =", value, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonNotEqualTo(String value) {
            addCriterion("flow_reason <>", value, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonGreaterThan(String value) {
            addCriterion("flow_reason >", value, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonGreaterThanOrEqualTo(String value) {
            addCriterion("flow_reason >=", value, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonLessThan(String value) {
            addCriterion("flow_reason <", value, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonLessThanOrEqualTo(String value) {
            addCriterion("flow_reason <=", value, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonLike(String value) {
            addCriterion("flow_reason like", value, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonNotLike(String value) {
            addCriterion("flow_reason not like", value, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonIn(List<String> values) {
            addCriterion("flow_reason in", values, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonNotIn(List<String> values) {
            addCriterion("flow_reason not in", values, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonBetween(String value1, String value2) {
            addCriterion("flow_reason between", value1, value2, "flowReason");
            return (Criteria) this;
        }

        public Criteria andFlowReasonNotBetween(String value1, String value2) {
            addCriterion("flow_reason not between", value1, value2, "flowReason");
            return (Criteria) this;
        }

        public Criteria andOutflowToIsNull() {
            addCriterion("outflow_to is null");
            return (Criteria) this;
        }

        public Criteria andOutflowToIsNotNull() {
            addCriterion("outflow_to is not null");
            return (Criteria) this;
        }

        public Criteria andOutflowToEqualTo(String value) {
            addCriterion("outflow_to =", value, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToNotEqualTo(String value) {
            addCriterion("outflow_to <>", value, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToGreaterThan(String value) {
            addCriterion("outflow_to >", value, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToGreaterThanOrEqualTo(String value) {
            addCriterion("outflow_to >=", value, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToLessThan(String value) {
            addCriterion("outflow_to <", value, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToLessThanOrEqualTo(String value) {
            addCriterion("outflow_to <=", value, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToLike(String value) {
            addCriterion("outflow_to like", value, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToNotLike(String value) {
            addCriterion("outflow_to not like", value, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToIn(List<String> values) {
            addCriterion("outflow_to in", values, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToNotIn(List<String> values) {
            addCriterion("outflow_to not in", values, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToBetween(String value1, String value2) {
            addCriterion("outflow_to between", value1, value2, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andOutflowToNotBetween(String value1, String value2) {
            addCriterion("outflow_to not between", value1, value2, "outflowTo");
            return (Criteria) this;
        }

        public Criteria andPhotographsIsNull() {
            addCriterion("photographs is null");
            return (Criteria) this;
        }

        public Criteria andPhotographsIsNotNull() {
            addCriterion("photographs is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographsEqualTo(String value) {
            addCriterion("photographs =", value, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsNotEqualTo(String value) {
            addCriterion("photographs <>", value, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsGreaterThan(String value) {
            addCriterion("photographs >", value, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsGreaterThanOrEqualTo(String value) {
            addCriterion("photographs >=", value, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsLessThan(String value) {
            addCriterion("photographs <", value, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsLessThanOrEqualTo(String value) {
            addCriterion("photographs <=", value, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsLike(String value) {
            addCriterion("photographs like", value, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsNotLike(String value) {
            addCriterion("photographs not like", value, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsIn(List<String> values) {
            addCriterion("photographs in", values, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsNotIn(List<String> values) {
            addCriterion("photographs not in", values, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsBetween(String value1, String value2) {
            addCriterion("photographs between", value1, value2, "photographs");
            return (Criteria) this;
        }

        public Criteria andPhotographsNotBetween(String value1, String value2) {
            addCriterion("photographs not between", value1, value2, "photographs");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNull() {
            addCriterion("register_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNotNull() {
            addCriterion("register_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressEqualTo(String value) {
            addCriterion("register_address =", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotEqualTo(String value) {
            addCriterion("register_address <>", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThan(String value) {
            addCriterion("register_address >", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("register_address >=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThan(String value) {
            addCriterion("register_address <", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThanOrEqualTo(String value) {
            addCriterion("register_address <=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLike(String value) {
            addCriterion("register_address like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotLike(String value) {
            addCriterion("register_address not like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIn(List<String> values) {
            addCriterion("register_address in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotIn(List<String> values) {
            addCriterion("register_address not in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressBetween(String value1, String value2) {
            addCriterion("register_address between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotBetween(String value1, String value2) {
            addCriterion("register_address not between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordIsNull() {
            addCriterion("criminal_record is null");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordIsNotNull() {
            addCriterion("criminal_record is not null");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordEqualTo(String value) {
            addCriterion("criminal_record =", value, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordNotEqualTo(String value) {
            addCriterion("criminal_record <>", value, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordGreaterThan(String value) {
            addCriterion("criminal_record >", value, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordGreaterThanOrEqualTo(String value) {
            addCriterion("criminal_record >=", value, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordLessThan(String value) {
            addCriterion("criminal_record <", value, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordLessThanOrEqualTo(String value) {
            addCriterion("criminal_record <=", value, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordLike(String value) {
            addCriterion("criminal_record like", value, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordNotLike(String value) {
            addCriterion("criminal_record not like", value, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordIn(List<String> values) {
            addCriterion("criminal_record in", values, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordNotIn(List<String> values) {
            addCriterion("criminal_record not in", values, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordBetween(String value1, String value2) {
            addCriterion("criminal_record between", value1, value2, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andCriminalRecordNotBetween(String value1, String value2) {
            addCriterion("criminal_record not between", value1, value2, "criminalRecord");
            return (Criteria) this;
        }

        public Criteria andActionTrackIsNull() {
            addCriterion("action_track is null");
            return (Criteria) this;
        }

        public Criteria andActionTrackIsNotNull() {
            addCriterion("action_track is not null");
            return (Criteria) this;
        }

        public Criteria andActionTrackEqualTo(String value) {
            addCriterion("action_track =", value, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackNotEqualTo(String value) {
            addCriterion("action_track <>", value, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackGreaterThan(String value) {
            addCriterion("action_track >", value, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackGreaterThanOrEqualTo(String value) {
            addCriterion("action_track >=", value, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackLessThan(String value) {
            addCriterion("action_track <", value, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackLessThanOrEqualTo(String value) {
            addCriterion("action_track <=", value, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackLike(String value) {
            addCriterion("action_track like", value, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackNotLike(String value) {
            addCriterion("action_track not like", value, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackIn(List<String> values) {
            addCriterion("action_track in", values, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackNotIn(List<String> values) {
            addCriterion("action_track not in", values, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackBetween(String value1, String value2) {
            addCriterion("action_track between", value1, value2, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andActionTrackNotBetween(String value1, String value2) {
            addCriterion("action_track not between", value1, value2, "actionTrack");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyIsNull() {
            addCriterion("work_company is null");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyIsNotNull() {
            addCriterion("work_company is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyEqualTo(String value) {
            addCriterion("work_company =", value, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyNotEqualTo(String value) {
            addCriterion("work_company <>", value, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyGreaterThan(String value) {
            addCriterion("work_company >", value, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("work_company >=", value, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyLessThan(String value) {
            addCriterion("work_company <", value, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyLessThanOrEqualTo(String value) {
            addCriterion("work_company <=", value, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyLike(String value) {
            addCriterion("work_company like", value, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyNotLike(String value) {
            addCriterion("work_company not like", value, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyIn(List<String> values) {
            addCriterion("work_company in", values, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyNotIn(List<String> values) {
            addCriterion("work_company not in", values, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyBetween(String value1, String value2) {
            addCriterion("work_company between", value1, value2, "workCompany");
            return (Criteria) this;
        }

        public Criteria andWorkCompanyNotBetween(String value1, String value2) {
            addCriterion("work_company not between", value1, value2, "workCompany");
            return (Criteria) this;
        }

        public Criteria andIfInputIsNull() {
            addCriterion("if_input is null");
            return (Criteria) this;
        }

        public Criteria andIfInputIsNotNull() {
            addCriterion("if_input is not null");
            return (Criteria) this;
        }

        public Criteria andIfInputEqualTo(Integer value) {
            addCriterion("if_input =", value, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputNotEqualTo(Integer value) {
            addCriterion("if_input <>", value, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputGreaterThan(Integer value) {
            addCriterion("if_input >", value, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_input >=", value, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputLessThan(Integer value) {
            addCriterion("if_input <", value, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputLessThanOrEqualTo(Integer value) {
            addCriterion("if_input <=", value, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputIn(List<Integer> values) {
            addCriterion("if_input in", values, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputNotIn(List<Integer> values) {
            addCriterion("if_input not in", values, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputBetween(Integer value1, Integer value2) {
            addCriterion("if_input between", value1, value2, "ifInput");
            return (Criteria) this;
        }

        public Criteria andIfInputNotBetween(Integer value1, Integer value2) {
            addCriterion("if_input not between", value1, value2, "ifInput");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeIsNull() {
            addCriterion("floating_population_type is null");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeIsNotNull() {
            addCriterion("floating_population_type is not null");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeEqualTo(Integer value) {
            addCriterion("floating_population_type =", value, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeNotEqualTo(Integer value) {
            addCriterion("floating_population_type <>", value, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeGreaterThan(Integer value) {
            addCriterion("floating_population_type >", value, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("floating_population_type >=", value, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeLessThan(Integer value) {
            addCriterion("floating_population_type <", value, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("floating_population_type <=", value, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeIn(List<Integer> values) {
            addCriterion("floating_population_type in", values, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeNotIn(List<Integer> values) {
            addCriterion("floating_population_type not in", values, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeBetween(Integer value1, Integer value2) {
            addCriterion("floating_population_type between", value1, value2, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFloatingPopulationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("floating_population_type not between", value1, value2, "floatingPopulationType");
            return (Criteria) this;
        }

        public Criteria andFlowWayIsNull() {
            addCriterion("flow_way is null");
            return (Criteria) this;
        }

        public Criteria andFlowWayIsNotNull() {
            addCriterion("flow_way is not null");
            return (Criteria) this;
        }

        public Criteria andFlowWayEqualTo(Integer value) {
            addCriterion("flow_way =", value, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayNotEqualTo(Integer value) {
            addCriterion("flow_way <>", value, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayGreaterThan(Integer value) {
            addCriterion("flow_way >", value, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_way >=", value, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayLessThan(Integer value) {
            addCriterion("flow_way <", value, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayLessThanOrEqualTo(Integer value) {
            addCriterion("flow_way <=", value, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayIn(List<Integer> values) {
            addCriterion("flow_way in", values, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayNotIn(List<Integer> values) {
            addCriterion("flow_way not in", values, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayBetween(Integer value1, Integer value2) {
            addCriterion("flow_way between", value1, value2, "flowWay");
            return (Criteria) this;
        }

        public Criteria andFlowWayNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_way not between", value1, value2, "flowWay");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNull() {
            addCriterion("input_time is null");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNotNull() {
            addCriterion("input_time is not null");
            return (Criteria) this;
        }

        public Criteria andInputTimeEqualTo(Date value) {
            addCriterion("input_time =", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotEqualTo(Date value) {
            addCriterion("input_time <>", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThan(Date value) {
            addCriterion("input_time >", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("input_time >=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThan(Date value) {
            addCriterion("input_time <", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThanOrEqualTo(Date value) {
            addCriterion("input_time <=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeIn(List<Date> values) {
            addCriterion("input_time in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotIn(List<Date> values) {
            addCriterion("input_time not in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeBetween(Date value1, Date value2) {
            addCriterion("input_time between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotBetween(Date value1, Date value2) {
            addCriterion("input_time not between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Integer value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Integer value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Integer value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Integer value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Integer> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Integer> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Integer value1, Integer value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("operator not between", value1, value2, "operator");
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