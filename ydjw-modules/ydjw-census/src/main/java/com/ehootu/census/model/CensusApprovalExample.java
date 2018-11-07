package com.ehootu.census.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CensusApprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CensusApprovalExample() {
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

        public Criteria andCensusRegisterIdIsNull() {
            addCriterion("census_register_id is null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdIsNotNull() {
            addCriterion("census_register_id is not null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdEqualTo(Integer value) {
            addCriterion("census_register_id =", value, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdNotEqualTo(Integer value) {
            addCriterion("census_register_id <>", value, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdGreaterThan(Integer value) {
            addCriterion("census_register_id >", value, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("census_register_id >=", value, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdLessThan(Integer value) {
            addCriterion("census_register_id <", value, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdLessThanOrEqualTo(Integer value) {
            addCriterion("census_register_id <=", value, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdIn(List<Integer> values) {
            addCriterion("census_register_id in", values, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdNotIn(List<Integer> values) {
            addCriterion("census_register_id not in", values, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdBetween(Integer value1, Integer value2) {
            addCriterion("census_register_id between", value1, value2, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("census_register_id not between", value1, value2, "censusRegisterId");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberIsNull() {
            addCriterion("accept_number is null");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberIsNotNull() {
            addCriterion("accept_number is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberEqualTo(String value) {
            addCriterion("accept_number =", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberNotEqualTo(String value) {
            addCriterion("accept_number <>", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberGreaterThan(String value) {
            addCriterion("accept_number >", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberGreaterThanOrEqualTo(String value) {
            addCriterion("accept_number >=", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberLessThan(String value) {
            addCriterion("accept_number <", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberLessThanOrEqualTo(String value) {
            addCriterion("accept_number <=", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberLike(String value) {
            addCriterion("accept_number like", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberNotLike(String value) {
            addCriterion("accept_number not like", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberIn(List<String> values) {
            addCriterion("accept_number in", values, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberNotIn(List<String> values) {
            addCriterion("accept_number not in", values, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberBetween(String value1, String value2) {
            addCriterion("accept_number between", value1, value2, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberNotBetween(String value1, String value2) {
            addCriterion("accept_number not between", value1, value2, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeIsNull() {
            addCriterion("approval_type is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeIsNotNull() {
            addCriterion("approval_type is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeEqualTo(String value) {
            addCriterion("approval_type =", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotEqualTo(String value) {
            addCriterion("approval_type <>", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeGreaterThan(String value) {
            addCriterion("approval_type >", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("approval_type >=", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLessThan(String value) {
            addCriterion("approval_type <", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLessThanOrEqualTo(String value) {
            addCriterion("approval_type <=", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLike(String value) {
            addCriterion("approval_type like", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotLike(String value) {
            addCriterion("approval_type not like", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeIn(List<String> values) {
            addCriterion("approval_type in", values, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotIn(List<String> values) {
            addCriterion("approval_type not in", values, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeBetween(String value1, String value2) {
            addCriterion("approval_type between", value1, value2, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotBetween(String value1, String value2) {
            addCriterion("approval_type not between", value1, value2, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceIsNull() {
            addCriterion("approval_place is null");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceIsNotNull() {
            addCriterion("approval_place is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceEqualTo(String value) {
            addCriterion("approval_place =", value, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceNotEqualTo(String value) {
            addCriterion("approval_place <>", value, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceGreaterThan(String value) {
            addCriterion("approval_place >", value, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("approval_place >=", value, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceLessThan(String value) {
            addCriterion("approval_place <", value, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceLessThanOrEqualTo(String value) {
            addCriterion("approval_place <=", value, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceLike(String value) {
            addCriterion("approval_place like", value, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceNotLike(String value) {
            addCriterion("approval_place not like", value, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceIn(List<String> values) {
            addCriterion("approval_place in", values, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceNotIn(List<String> values) {
            addCriterion("approval_place not in", values, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceBetween(String value1, String value2) {
            addCriterion("approval_place between", value1, value2, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalPlaceNotBetween(String value1, String value2) {
            addCriterion("approval_place not between", value1, value2, "approvalPlace");
            return (Criteria) this;
        }

        public Criteria andApprovalStageIsNull() {
            addCriterion("approval_stage is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStageIsNotNull() {
            addCriterion("approval_stage is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStageEqualTo(Integer value) {
            addCriterion("approval_stage =", value, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageNotEqualTo(Integer value) {
            addCriterion("approval_stage <>", value, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageGreaterThan(Integer value) {
            addCriterion("approval_stage >", value, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_stage >=", value, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageLessThan(Integer value) {
            addCriterion("approval_stage <", value, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageLessThanOrEqualTo(Integer value) {
            addCriterion("approval_stage <=", value, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageIn(List<Integer> values) {
            addCriterion("approval_stage in", values, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageNotIn(List<Integer> values) {
            addCriterion("approval_stage not in", values, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageBetween(Integer value1, Integer value2) {
            addCriterion("approval_stage between", value1, value2, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStageNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_stage not between", value1, value2, "approvalStage");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(Integer value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(Integer value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(Integer value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(Integer value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<Integer> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<Integer> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(Integer value1, Integer value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorIsNull() {
            addCriterion("if_submit_superior is null");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorIsNotNull() {
            addCriterion("if_submit_superior is not null");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorEqualTo(Integer value) {
            addCriterion("if_submit_superior =", value, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorNotEqualTo(Integer value) {
            addCriterion("if_submit_superior <>", value, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorGreaterThan(Integer value) {
            addCriterion("if_submit_superior >", value, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_submit_superior >=", value, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorLessThan(Integer value) {
            addCriterion("if_submit_superior <", value, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorLessThanOrEqualTo(Integer value) {
            addCriterion("if_submit_superior <=", value, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorIn(List<Integer> values) {
            addCriterion("if_submit_superior in", values, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorNotIn(List<Integer> values) {
            addCriterion("if_submit_superior not in", values, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorBetween(Integer value1, Integer value2) {
            addCriterion("if_submit_superior between", value1, value2, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andIfSubmitSuperiorNotBetween(Integer value1, Integer value2) {
            addCriterion("if_submit_superior not between", value1, value2, "ifSubmitSuperior");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionIsNull() {
            addCriterion("approval_suggestion is null");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionIsNotNull() {
            addCriterion("approval_suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionEqualTo(String value) {
            addCriterion("approval_suggestion =", value, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionNotEqualTo(String value) {
            addCriterion("approval_suggestion <>", value, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionGreaterThan(String value) {
            addCriterion("approval_suggestion >", value, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("approval_suggestion >=", value, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionLessThan(String value) {
            addCriterion("approval_suggestion <", value, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionLessThanOrEqualTo(String value) {
            addCriterion("approval_suggestion <=", value, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionLike(String value) {
            addCriterion("approval_suggestion like", value, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionNotLike(String value) {
            addCriterion("approval_suggestion not like", value, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionIn(List<String> values) {
            addCriterion("approval_suggestion in", values, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionNotIn(List<String> values) {
            addCriterion("approval_suggestion not in", values, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionBetween(String value1, String value2) {
            addCriterion("approval_suggestion between", value1, value2, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andApprovalSuggestionNotBetween(String value1, String value2) {
            addCriterion("approval_suggestion not between", value1, value2, "approvalSuggestion");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNull() {
            addCriterion("appointment_date is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNotNull() {
            addCriterion("appointment_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateEqualTo(Date value) {
            addCriterion("appointment_date =", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotEqualTo(Date value) {
            addCriterion("appointment_date <>", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThan(Date value) {
            addCriterion("appointment_date >", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("appointment_date >=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThan(Date value) {
            addCriterion("appointment_date <", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThanOrEqualTo(Date value) {
            addCriterion("appointment_date <=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIn(List<Date> values) {
            addCriterion("appointment_date in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotIn(List<Date> values) {
            addCriterion("appointment_date not in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateBetween(Date value1, Date value2) {
            addCriterion("appointment_date between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotBetween(Date value1, Date value2) {
            addCriterion("appointment_date not between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNull() {
            addCriterion("approval_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNotNull() {
            addCriterion("approval_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeEqualTo(Date value) {
            addCriterion("approval_time =", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotEqualTo(Date value) {
            addCriterion("approval_time <>", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThan(Date value) {
            addCriterion("approval_time >", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approval_time >=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThan(Date value) {
            addCriterion("approval_time <", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("approval_time <=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIn(List<Date> values) {
            addCriterion("approval_time in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotIn(List<Date> values) {
            addCriterion("approval_time not in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("approval_time between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("approval_time not between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdIsNull() {
            addCriterion("person_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdIsNotNull() {
            addCriterion("person_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdEqualTo(Integer value) {
            addCriterion("person_flow_id =", value, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdNotEqualTo(Integer value) {
            addCriterion("person_flow_id <>", value, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdGreaterThan(Integer value) {
            addCriterion("person_flow_id >", value, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_flow_id >=", value, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdLessThan(Integer value) {
            addCriterion("person_flow_id <", value, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_flow_id <=", value, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdIn(List<Integer> values) {
            addCriterion("person_flow_id in", values, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdNotIn(List<Integer> values) {
            addCriterion("person_flow_id not in", values, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdBetween(Integer value1, Integer value2) {
            addCriterion("person_flow_id between", value1, value2, "personFlowId");
            return (Criteria) this;
        }

        public Criteria andPersonFlowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_flow_id not between", value1, value2, "personFlowId");
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