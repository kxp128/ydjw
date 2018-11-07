package com.ehootu.census.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CensusApprovalSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CensusApprovalSetExample() {
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

        public Criteria andApprovalSetContentIsNull() {
            addCriterion("approval_set_content is null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentIsNotNull() {
            addCriterion("approval_set_content is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentEqualTo(Integer value) {
            addCriterion("approval_set_content =", value, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentNotEqualTo(Integer value) {
            addCriterion("approval_set_content <>", value, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentGreaterThan(Integer value) {
            addCriterion("approval_set_content >", value, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_set_content >=", value, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentLessThan(Integer value) {
            addCriterion("approval_set_content <", value, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentLessThanOrEqualTo(Integer value) {
            addCriterion("approval_set_content <=", value, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentIn(List<Integer> values) {
            addCriterion("approval_set_content in", values, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentNotIn(List<Integer> values) {
            addCriterion("approval_set_content not in", values, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentBetween(Integer value1, Integer value2) {
            addCriterion("approval_set_content between", value1, value2, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetContentNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_set_content not between", value1, value2, "approvalSetContent");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierIsNull() {
            addCriterion("approval_set_tier is null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierIsNotNull() {
            addCriterion("approval_set_tier is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierEqualTo(Integer value) {
            addCriterion("approval_set_tier =", value, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierNotEqualTo(Integer value) {
            addCriterion("approval_set_tier <>", value, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierGreaterThan(Integer value) {
            addCriterion("approval_set_tier >", value, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_set_tier >=", value, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierLessThan(Integer value) {
            addCriterion("approval_set_tier <", value, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierLessThanOrEqualTo(Integer value) {
            addCriterion("approval_set_tier <=", value, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierIn(List<Integer> values) {
            addCriterion("approval_set_tier in", values, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierNotIn(List<Integer> values) {
            addCriterion("approval_set_tier not in", values, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierBetween(Integer value1, Integer value2) {
            addCriterion("approval_set_tier between", value1, value2, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetTierNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_set_tier not between", value1, value2, "approvalSetTier");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelIsNull() {
            addCriterion("approval_set_level is null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelIsNotNull() {
            addCriterion("approval_set_level is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelEqualTo(Integer value) {
            addCriterion("approval_set_level =", value, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelNotEqualTo(Integer value) {
            addCriterion("approval_set_level <>", value, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelGreaterThan(Integer value) {
            addCriterion("approval_set_level >", value, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_set_level >=", value, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelLessThan(Integer value) {
            addCriterion("approval_set_level <", value, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelLessThanOrEqualTo(Integer value) {
            addCriterion("approval_set_level <=", value, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelIn(List<Integer> values) {
            addCriterion("approval_set_level in", values, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelNotIn(List<Integer> values) {
            addCriterion("approval_set_level not in", values, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelBetween(Integer value1, Integer value2) {
            addCriterion("approval_set_level between", value1, value2, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_set_level not between", value1, value2, "approvalSetLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonIsNull() {
            addCriterion("approval_set_person is null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonIsNotNull() {
            addCriterion("approval_set_person is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonEqualTo(String value) {
            addCriterion("approval_set_person =", value, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonNotEqualTo(String value) {
            addCriterion("approval_set_person <>", value, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonGreaterThan(String value) {
            addCriterion("approval_set_person >", value, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonGreaterThanOrEqualTo(String value) {
            addCriterion("approval_set_person >=", value, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonLessThan(String value) {
            addCriterion("approval_set_person <", value, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonLessThanOrEqualTo(String value) {
            addCriterion("approval_set_person <=", value, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonLike(String value) {
            addCriterion("approval_set_person like", value, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonNotLike(String value) {
            addCriterion("approval_set_person not like", value, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonIn(List<String> values) {
            addCriterion("approval_set_person in", values, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonNotIn(List<String> values) {
            addCriterion("approval_set_person not in", values, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonBetween(String value1, String value2) {
            addCriterion("approval_set_person between", value1, value2, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetPersonNotBetween(String value1, String value2) {
            addCriterion("approval_set_person not between", value1, value2, "approvalSetPerson");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberIsNull() {
            addCriterion("approval_set_number is null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberIsNotNull() {
            addCriterion("approval_set_number is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberEqualTo(String value) {
            addCriterion("approval_set_number =", value, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberNotEqualTo(String value) {
            addCriterion("approval_set_number <>", value, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberGreaterThan(String value) {
            addCriterion("approval_set_number >", value, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberGreaterThanOrEqualTo(String value) {
            addCriterion("approval_set_number >=", value, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberLessThan(String value) {
            addCriterion("approval_set_number <", value, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberLessThanOrEqualTo(String value) {
            addCriterion("approval_set_number <=", value, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberLike(String value) {
            addCriterion("approval_set_number like", value, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberNotLike(String value) {
            addCriterion("approval_set_number not like", value, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberIn(List<String> values) {
            addCriterion("approval_set_number in", values, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberNotIn(List<String> values) {
            addCriterion("approval_set_number not in", values, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberBetween(String value1, String value2) {
            addCriterion("approval_set_number between", value1, value2, "approvalSetNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalSetNumberNotBetween(String value1, String value2) {
            addCriterion("approval_set_number not between", value1, value2, "approvalSetNumber");
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

        public Criteria andSpareField1IsNull() {
            addCriterion("spare_field1 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField1IsNotNull() {
            addCriterion("spare_field1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField1EqualTo(String value) {
            addCriterion("spare_field1 =", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotEqualTo(String value) {
            addCriterion("spare_field1 <>", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1GreaterThan(String value) {
            addCriterion("spare_field1 >", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field1 >=", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1LessThan(String value) {
            addCriterion("spare_field1 <", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1LessThanOrEqualTo(String value) {
            addCriterion("spare_field1 <=", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1Like(String value) {
            addCriterion("spare_field1 like", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotLike(String value) {
            addCriterion("spare_field1 not like", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1In(List<String> values) {
            addCriterion("spare_field1 in", values, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotIn(List<String> values) {
            addCriterion("spare_field1 not in", values, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1Between(String value1, String value2) {
            addCriterion("spare_field1 between", value1, value2, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotBetween(String value1, String value2) {
            addCriterion("spare_field1 not between", value1, value2, "spareField1");
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