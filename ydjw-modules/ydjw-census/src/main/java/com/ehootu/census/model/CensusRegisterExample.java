package com.ehootu.census.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CensusRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CensusRegisterExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUsedNameIsNull() {
            addCriterion("used_name is null");
            return (Criteria) this;
        }

        public Criteria andUsedNameIsNotNull() {
            addCriterion("used_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsedNameEqualTo(String value) {
            addCriterion("used_name =", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameNotEqualTo(String value) {
            addCriterion("used_name <>", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameGreaterThan(String value) {
            addCriterion("used_name >", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameGreaterThanOrEqualTo(String value) {
            addCriterion("used_name >=", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameLessThan(String value) {
            addCriterion("used_name <", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameLessThanOrEqualTo(String value) {
            addCriterion("used_name <=", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameLike(String value) {
            addCriterion("used_name like", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameNotLike(String value) {
            addCriterion("used_name not like", value, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameIn(List<String> values) {
            addCriterion("used_name in", values, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameNotIn(List<String> values) {
            addCriterion("used_name not in", values, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameBetween(String value1, String value2) {
            addCriterion("used_name between", value1, value2, "usedName");
            return (Criteria) this;
        }

        public Criteria andUsedNameNotBetween(String value1, String value2) {
            addCriterion("used_name not between", value1, value2, "usedName");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth_date not between", value1, value2, "birthDate");
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

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceIsNull() {
            addCriterion("current_census_register_place is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceIsNotNull() {
            addCriterion("current_census_register_place is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceEqualTo(String value) {
            addCriterion("current_census_register_place =", value, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceNotEqualTo(String value) {
            addCriterion("current_census_register_place <>", value, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceGreaterThan(String value) {
            addCriterion("current_census_register_place >", value, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("current_census_register_place >=", value, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceLessThan(String value) {
            addCriterion("current_census_register_place <", value, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceLessThanOrEqualTo(String value) {
            addCriterion("current_census_register_place <=", value, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceLike(String value) {
            addCriterion("current_census_register_place like", value, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceNotLike(String value) {
            addCriterion("current_census_register_place not like", value, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceIn(List<String> values) {
            addCriterion("current_census_register_place in", values, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceNotIn(List<String> values) {
            addCriterion("current_census_register_place not in", values, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceBetween(String value1, String value2) {
            addCriterion("current_census_register_place between", value1, value2, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusRegisterPlaceNotBetween(String value1, String value2) {
            addCriterion("current_census_register_place not between", value1, value2, "currentCensusRegisterPlace");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
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

        public Criteria andSpouseNameIsNull() {
            addCriterion("spouse_name is null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNotNull() {
            addCriterion("spouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameEqualTo(String value) {
            addCriterion("spouse_name =", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotEqualTo(String value) {
            addCriterion("spouse_name <>", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThan(String value) {
            addCriterion("spouse_name >", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_name >=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThan(String value) {
            addCriterion("spouse_name <", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThanOrEqualTo(String value) {
            addCriterion("spouse_name <=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLike(String value) {
            addCriterion("spouse_name like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotLike(String value) {
            addCriterion("spouse_name not like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIn(List<String> values) {
            addCriterion("spouse_name in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotIn(List<String> values) {
            addCriterion("spouse_name not in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameBetween(String value1, String value2) {
            addCriterion("spouse_name between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotBetween(String value1, String value2) {
            addCriterion("spouse_name not between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeIsNull() {
            addCriterion("married_time is null");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeIsNotNull() {
            addCriterion("married_time is not null");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeEqualTo(Date value) {
            addCriterion("married_time =", value, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeNotEqualTo(Date value) {
            addCriterion("married_time <>", value, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeGreaterThan(Date value) {
            addCriterion("married_time >", value, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("married_time >=", value, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeLessThan(Date value) {
            addCriterion("married_time <", value, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeLessThanOrEqualTo(Date value) {
            addCriterion("married_time <=", value, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeIn(List<Date> values) {
            addCriterion("married_time in", values, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeNotIn(List<Date> values) {
            addCriterion("married_time not in", values, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeBetween(Date value1, Date value2) {
            addCriterion("married_time between", value1, value2, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andMarriedTimeNotBetween(Date value1, Date value2) {
            addCriterion("married_time not between", value1, value2, "marriedTime");
            return (Criteria) this;
        }

        public Criteria andNewbornNameIsNull() {
            addCriterion("newborn_name is null");
            return (Criteria) this;
        }

        public Criteria andNewbornNameIsNotNull() {
            addCriterion("newborn_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewbornNameEqualTo(String value) {
            addCriterion("newborn_name =", value, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameNotEqualTo(String value) {
            addCriterion("newborn_name <>", value, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameGreaterThan(String value) {
            addCriterion("newborn_name >", value, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameGreaterThanOrEqualTo(String value) {
            addCriterion("newborn_name >=", value, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameLessThan(String value) {
            addCriterion("newborn_name <", value, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameLessThanOrEqualTo(String value) {
            addCriterion("newborn_name <=", value, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameLike(String value) {
            addCriterion("newborn_name like", value, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameNotLike(String value) {
            addCriterion("newborn_name not like", value, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameIn(List<String> values) {
            addCriterion("newborn_name in", values, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameNotIn(List<String> values) {
            addCriterion("newborn_name not in", values, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameBetween(String value1, String value2) {
            addCriterion("newborn_name between", value1, value2, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornNameNotBetween(String value1, String value2) {
            addCriterion("newborn_name not between", value1, value2, "newbornName");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderIsNull() {
            addCriterion("newborn_gender is null");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderIsNotNull() {
            addCriterion("newborn_gender is not null");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderEqualTo(String value) {
            addCriterion("newborn_gender =", value, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderNotEqualTo(String value) {
            addCriterion("newborn_gender <>", value, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderGreaterThan(String value) {
            addCriterion("newborn_gender >", value, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderGreaterThanOrEqualTo(String value) {
            addCriterion("newborn_gender >=", value, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderLessThan(String value) {
            addCriterion("newborn_gender <", value, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderLessThanOrEqualTo(String value) {
            addCriterion("newborn_gender <=", value, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderLike(String value) {
            addCriterion("newborn_gender like", value, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderNotLike(String value) {
            addCriterion("newborn_gender not like", value, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderIn(List<String> values) {
            addCriterion("newborn_gender in", values, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderNotIn(List<String> values) {
            addCriterion("newborn_gender not in", values, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderBetween(String value1, String value2) {
            addCriterion("newborn_gender between", value1, value2, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornGenderNotBetween(String value1, String value2) {
            addCriterion("newborn_gender not between", value1, value2, "newbornGender");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateIsNull() {
            addCriterion("newborn_birth_date is null");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateIsNotNull() {
            addCriterion("newborn_birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("newborn_birth_date =", value, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("newborn_birth_date <>", value, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("newborn_birth_date >", value, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newborn_birth_date >=", value, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("newborn_birth_date <", value, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newborn_birth_date <=", value, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("newborn_birth_date in", values, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("newborn_birth_date not in", values, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newborn_birth_date between", value1, value2, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andNewbornBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newborn_birth_date not between", value1, value2, "newbornBirthDate");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameIsNull() {
            addCriterion("cancelled_person_name is null");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameIsNotNull() {
            addCriterion("cancelled_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameEqualTo(String value) {
            addCriterion("cancelled_person_name =", value, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameNotEqualTo(String value) {
            addCriterion("cancelled_person_name <>", value, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameGreaterThan(String value) {
            addCriterion("cancelled_person_name >", value, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("cancelled_person_name >=", value, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameLessThan(String value) {
            addCriterion("cancelled_person_name <", value, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameLessThanOrEqualTo(String value) {
            addCriterion("cancelled_person_name <=", value, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameLike(String value) {
            addCriterion("cancelled_person_name like", value, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameNotLike(String value) {
            addCriterion("cancelled_person_name not like", value, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameIn(List<String> values) {
            addCriterion("cancelled_person_name in", values, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameNotIn(List<String> values) {
            addCriterion("cancelled_person_name not in", values, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameBetween(String value1, String value2) {
            addCriterion("cancelled_person_name between", value1, value2, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonNameNotBetween(String value1, String value2) {
            addCriterion("cancelled_person_name not between", value1, value2, "cancelledPersonName");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateIsNull() {
            addCriterion("cancelled_person_birth_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateIsNotNull() {
            addCriterion("cancelled_person_birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("cancelled_person_birth_date =", value, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cancelled_person_birth_date <>", value, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("cancelled_person_birth_date >", value, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cancelled_person_birth_date >=", value, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("cancelled_person_birth_date <", value, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cancelled_person_birth_date <=", value, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("cancelled_person_birth_date in", values, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cancelled_person_birth_date not in", values, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cancelled_person_birth_date between", value1, value2, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cancelled_person_birth_date not between", value1, value2, "cancelledPersonBirthDate");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberIsNull() {
            addCriterion("cancelled_person_id_number is null");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberIsNotNull() {
            addCriterion("cancelled_person_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberEqualTo(String value) {
            addCriterion("cancelled_person_id_number =", value, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberNotEqualTo(String value) {
            addCriterion("cancelled_person_id_number <>", value, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberGreaterThan(String value) {
            addCriterion("cancelled_person_id_number >", value, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cancelled_person_id_number >=", value, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberLessThan(String value) {
            addCriterion("cancelled_person_id_number <", value, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberLessThanOrEqualTo(String value) {
            addCriterion("cancelled_person_id_number <=", value, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberLike(String value) {
            addCriterion("cancelled_person_id_number like", value, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberNotLike(String value) {
            addCriterion("cancelled_person_id_number not like", value, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberIn(List<String> values) {
            addCriterion("cancelled_person_id_number in", values, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberNotIn(List<String> values) {
            addCriterion("cancelled_person_id_number not in", values, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberBetween(String value1, String value2) {
            addCriterion("cancelled_person_id_number between", value1, value2, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonIdNumberNotBetween(String value1, String value2) {
            addCriterion("cancelled_person_id_number not between", value1, value2, "cancelledPersonIdNumber");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathIsNull() {
            addCriterion("cancelled_person_cause_death is null");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathIsNotNull() {
            addCriterion("cancelled_person_cause_death is not null");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathEqualTo(String value) {
            addCriterion("cancelled_person_cause_death =", value, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathNotEqualTo(String value) {
            addCriterion("cancelled_person_cause_death <>", value, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathGreaterThan(String value) {
            addCriterion("cancelled_person_cause_death >", value, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathGreaterThanOrEqualTo(String value) {
            addCriterion("cancelled_person_cause_death >=", value, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathLessThan(String value) {
            addCriterion("cancelled_person_cause_death <", value, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathLessThanOrEqualTo(String value) {
            addCriterion("cancelled_person_cause_death <=", value, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathLike(String value) {
            addCriterion("cancelled_person_cause_death like", value, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathNotLike(String value) {
            addCriterion("cancelled_person_cause_death not like", value, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathIn(List<String> values) {
            addCriterion("cancelled_person_cause_death in", values, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathNotIn(List<String> values) {
            addCriterion("cancelled_person_cause_death not in", values, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathBetween(String value1, String value2) {
            addCriterion("cancelled_person_cause_death between", value1, value2, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andCancelledPersonCauseDeathNotBetween(String value1, String value2) {
            addCriterion("cancelled_person_cause_death not between", value1, value2, "cancelledPersonCauseDeath");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeIsNull() {
            addCriterion("application_for_change is null");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeIsNotNull() {
            addCriterion("application_for_change is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeEqualTo(String value) {
            addCriterion("application_for_change =", value, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeNotEqualTo(String value) {
            addCriterion("application_for_change <>", value, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeGreaterThan(String value) {
            addCriterion("application_for_change >", value, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeGreaterThanOrEqualTo(String value) {
            addCriterion("application_for_change >=", value, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeLessThan(String value) {
            addCriterion("application_for_change <", value, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeLessThanOrEqualTo(String value) {
            addCriterion("application_for_change <=", value, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeLike(String value) {
            addCriterion("application_for_change like", value, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeNotLike(String value) {
            addCriterion("application_for_change not like", value, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeIn(List<String> values) {
            addCriterion("application_for_change in", values, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeNotIn(List<String> values) {
            addCriterion("application_for_change not in", values, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeBetween(String value1, String value2) {
            addCriterion("application_for_change between", value1, value2, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andApplicationForChangeNotBetween(String value1, String value2) {
            addCriterion("application_for_change not between", value1, value2, "applicationForChange");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNull() {
            addCriterion("attachment_id is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNotNull() {
            addCriterion("attachment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdEqualTo(String value) {
            addCriterion("attachment_id =", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotEqualTo(String value) {
            addCriterion("attachment_id <>", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThan(String value) {
            addCriterion("attachment_id >", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_id >=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThan(String value) {
            addCriterion("attachment_id <", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThanOrEqualTo(String value) {
            addCriterion("attachment_id <=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLike(String value) {
            addCriterion("attachment_id like", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotLike(String value) {
            addCriterion("attachment_id not like", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIn(List<String> values) {
            addCriterion("attachment_id in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotIn(List<String> values) {
            addCriterion("attachment_id not in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdBetween(String value1, String value2) {
            addCriterion("attachment_id between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotBetween(String value1, String value2) {
            addCriterion("attachment_id not between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeIsNull() {
            addCriterion("current_census_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeIsNotNull() {
            addCriterion("current_census_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeEqualTo(Integer value) {
            addCriterion("current_census_type =", value, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeNotEqualTo(Integer value) {
            addCriterion("current_census_type <>", value, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeGreaterThan(Integer value) {
            addCriterion("current_census_type >", value, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_census_type >=", value, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeLessThan(Integer value) {
            addCriterion("current_census_type <", value, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeLessThanOrEqualTo(Integer value) {
            addCriterion("current_census_type <=", value, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeIn(List<Integer> values) {
            addCriterion("current_census_type in", values, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeNotIn(List<Integer> values) {
            addCriterion("current_census_type not in", values, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeBetween(Integer value1, Integer value2) {
            addCriterion("current_census_type between", value1, value2, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("current_census_type not between", value1, value2, "currentCensusType");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusIsNull() {
            addCriterion("current_census_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusIsNotNull() {
            addCriterion("current_census_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusEqualTo(Integer value) {
            addCriterion("current_census_status =", value, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusNotEqualTo(Integer value) {
            addCriterion("current_census_status <>", value, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusGreaterThan(Integer value) {
            addCriterion("current_census_status >", value, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_census_status >=", value, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusLessThan(Integer value) {
            addCriterion("current_census_status <", value, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusLessThanOrEqualTo(Integer value) {
            addCriterion("current_census_status <=", value, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusIn(List<Integer> values) {
            addCriterion("current_census_status in", values, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusNotIn(List<Integer> values) {
            addCriterion("current_census_status not in", values, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusBetween(Integer value1, Integer value2) {
            addCriterion("current_census_status between", value1, value2, "currentCensusStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentCensusStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("current_census_status not between", value1, value2, "currentCensusStatus");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
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

        public Criteria andPoliceIdEqualTo(String value) {
            addCriterion("police_id =", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotEqualTo(String value) {
            addCriterion("police_id <>", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThan(String value) {
            addCriterion("police_id >", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThanOrEqualTo(String value) {
            addCriterion("police_id >=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThan(String value) {
            addCriterion("police_id <", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThanOrEqualTo(String value) {
            addCriterion("police_id <=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLike(String value) {
            addCriterion("police_id like", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotLike(String value) {
            addCriterion("police_id not like", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIn(List<String> values) {
            addCriterion("police_id in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotIn(List<String> values) {
            addCriterion("police_id not in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdBetween(String value1, String value2) {
            addCriterion("police_id between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotBetween(String value1, String value2) {
            addCriterion("police_id not between", value1, value2, "policeId");
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

        public Criteria andAdministrativeDivisionIsNull() {
            addCriterion("administrative_division is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionIsNotNull() {
            addCriterion("administrative_division is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionEqualTo(String value) {
            addCriterion("administrative_division =", value, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionNotEqualTo(String value) {
            addCriterion("administrative_division <>", value, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionGreaterThan(String value) {
            addCriterion("administrative_division >", value, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionGreaterThanOrEqualTo(String value) {
            addCriterion("administrative_division >=", value, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionLessThan(String value) {
            addCriterion("administrative_division <", value, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionLessThanOrEqualTo(String value) {
            addCriterion("administrative_division <=", value, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionLike(String value) {
            addCriterion("administrative_division like", value, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionNotLike(String value) {
            addCriterion("administrative_division not like", value, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionIn(List<String> values) {
            addCriterion("administrative_division in", values, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionNotIn(List<String> values) {
            addCriterion("administrative_division not in", values, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionBetween(String value1, String value2) {
            addCriterion("administrative_division between", value1, value2, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDivisionNotBetween(String value1, String value2) {
            addCriterion("administrative_division not between", value1, value2, "administrativeDivision");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
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

        public Criteria andIsSyncIsNull() {
            addCriterion("is_sync is null");
            return (Criteria) this;
        }

        public Criteria andIsSyncIsNotNull() {
            addCriterion("is_sync is not null");
            return (Criteria) this;
        }

        public Criteria andIsSyncEqualTo(Integer value) {
            addCriterion("is_sync =", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncNotEqualTo(Integer value) {
            addCriterion("is_sync <>", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncGreaterThan(Integer value) {
            addCriterion("is_sync >", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_sync >=", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncLessThan(Integer value) {
            addCriterion("is_sync <", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncLessThanOrEqualTo(Integer value) {
            addCriterion("is_sync <=", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncIn(List<Integer> values) {
            addCriterion("is_sync in", values, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncNotIn(List<Integer> values) {
            addCriterion("is_sync not in", values, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncBetween(Integer value1, Integer value2) {
            addCriterion("is_sync between", value1, value2, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncNotBetween(Integer value1, Integer value2) {
            addCriterion("is_sync not between", value1, value2, "isSync");
            return (Criteria) this;
        }

        public Criteria andSyncSignIsNull() {
            addCriterion("sync_sign is null");
            return (Criteria) this;
        }

        public Criteria andSyncSignIsNotNull() {
            addCriterion("sync_sign is not null");
            return (Criteria) this;
        }

        public Criteria andSyncSignEqualTo(Integer value) {
            addCriterion("sync_sign =", value, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignNotEqualTo(Integer value) {
            addCriterion("sync_sign <>", value, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignGreaterThan(Integer value) {
            addCriterion("sync_sign >", value, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("sync_sign >=", value, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignLessThan(Integer value) {
            addCriterion("sync_sign <", value, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignLessThanOrEqualTo(Integer value) {
            addCriterion("sync_sign <=", value, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignIn(List<Integer> values) {
            addCriterion("sync_sign in", values, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignNotIn(List<Integer> values) {
            addCriterion("sync_sign not in", values, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignBetween(Integer value1, Integer value2) {
            addCriterion("sync_sign between", value1, value2, "syncSign");
            return (Criteria) this;
        }

        public Criteria andSyncSignNotBetween(Integer value1, Integer value2) {
            addCriterion("sync_sign not between", value1, value2, "syncSign");
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