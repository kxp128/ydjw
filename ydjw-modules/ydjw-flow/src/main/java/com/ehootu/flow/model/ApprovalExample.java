package com.ehootu.flow.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalExample() {
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

        public Criteria andAppointmentDateEqualTo(String value) {
            addCriterion("appointment_date =", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotEqualTo(String value) {
            addCriterion("appointment_date <>", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThan(String value) {
            addCriterion("appointment_date >", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_date >=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThan(String value) {
            addCriterion("appointment_date <", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThanOrEqualTo(String value) {
            addCriterion("appointment_date <=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLike(String value) {
            addCriterion("appointment_date like", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotLike(String value) {
            addCriterion("appointment_date not like", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIn(List<String> values) {
            addCriterion("appointment_date in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotIn(List<String> values) {
            addCriterion("appointment_date not in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateBetween(String value1, String value2) {
            addCriterion("appointment_date between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotBetween(String value1, String value2) {
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

        public Criteria andIfSendRedPacketIsNull() {
            addCriterion("if_send_red_packet is null");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketIsNotNull() {
            addCriterion("if_send_red_packet is not null");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketEqualTo(Integer value) {
            addCriterion("if_send_red_packet =", value, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketNotEqualTo(Integer value) {
            addCriterion("if_send_red_packet <>", value, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketGreaterThan(Integer value) {
            addCriterion("if_send_red_packet >", value, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_send_red_packet >=", value, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketLessThan(Integer value) {
            addCriterion("if_send_red_packet <", value, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketLessThanOrEqualTo(Integer value) {
            addCriterion("if_send_red_packet <=", value, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketIn(List<Integer> values) {
            addCriterion("if_send_red_packet in", values, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketNotIn(List<Integer> values) {
            addCriterion("if_send_red_packet not in", values, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketBetween(Integer value1, Integer value2) {
            addCriterion("if_send_red_packet between", value1, value2, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andIfSendRedPacketNotBetween(Integer value1, Integer value2) {
            addCriterion("if_send_red_packet not between", value1, value2, "ifSendRedPacket");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageIsNull() {
            addCriterion("leave_message is null");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageIsNotNull() {
            addCriterion("leave_message is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageEqualTo(String value) {
            addCriterion("leave_message =", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageNotEqualTo(String value) {
            addCriterion("leave_message <>", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageGreaterThan(String value) {
            addCriterion("leave_message >", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageGreaterThanOrEqualTo(String value) {
            addCriterion("leave_message >=", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageLessThan(String value) {
            addCriterion("leave_message <", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageLessThanOrEqualTo(String value) {
            addCriterion("leave_message <=", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageLike(String value) {
            addCriterion("leave_message like", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageNotLike(String value) {
            addCriterion("leave_message not like", value, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageIn(List<String> values) {
            addCriterion("leave_message in", values, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageNotIn(List<String> values) {
            addCriterion("leave_message not in", values, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageBetween(String value1, String value2) {
            addCriterion("leave_message between", value1, value2, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andLeaveMessageNotBetween(String value1, String value2) {
            addCriterion("leave_message not between", value1, value2, "leaveMessage");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyIsNull() {
            addCriterion("red_packet_money is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyIsNotNull() {
            addCriterion("red_packet_money is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyEqualTo(String value) {
            addCriterion("red_packet_money =", value, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyNotEqualTo(String value) {
            addCriterion("red_packet_money <>", value, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyGreaterThan(String value) {
            addCriterion("red_packet_money >", value, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("red_packet_money >=", value, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyLessThan(String value) {
            addCriterion("red_packet_money <", value, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyLessThanOrEqualTo(String value) {
            addCriterion("red_packet_money <=", value, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyLike(String value) {
            addCriterion("red_packet_money like", value, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyNotLike(String value) {
            addCriterion("red_packet_money not like", value, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyIn(List<String> values) {
            addCriterion("red_packet_money in", values, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyNotIn(List<String> values) {
            addCriterion("red_packet_money not in", values, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyBetween(String value1, String value2) {
            addCriterion("red_packet_money between", value1, value2, "redPacketMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketMoneyNotBetween(String value1, String value2) {
            addCriterion("red_packet_money not between", value1, value2, "redPacketMoney");
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