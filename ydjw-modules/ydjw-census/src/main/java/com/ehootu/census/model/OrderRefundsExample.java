package com.ehootu.census.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderRefundsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderRefundsExample() {
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

        public Criteria andOrderRefundIdIsNull() {
            addCriterion("order_refund_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdIsNotNull() {
            addCriterion("order_refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdEqualTo(Integer value) {
            addCriterion("order_refund_id =", value, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdNotEqualTo(Integer value) {
            addCriterion("order_refund_id <>", value, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdGreaterThan(Integer value) {
            addCriterion("order_refund_id >", value, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_refund_id >=", value, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdLessThan(Integer value) {
            addCriterion("order_refund_id <", value, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_refund_id <=", value, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdIn(List<Integer> values) {
            addCriterion("order_refund_id in", values, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdNotIn(List<Integer> values) {
            addCriterion("order_refund_id not in", values, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdBetween(Integer value1, Integer value2) {
            addCriterion("order_refund_id between", value1, value2, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_refund_id not between", value1, value2, "orderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andRefundToIsNull() {
            addCriterion("refund_to is null");
            return (Criteria) this;
        }

        public Criteria andRefundToIsNotNull() {
            addCriterion("refund_to is not null");
            return (Criteria) this;
        }

        public Criteria andRefundToEqualTo(Integer value) {
            addCriterion("refund_to =", value, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToNotEqualTo(Integer value) {
            addCriterion("refund_to <>", value, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToGreaterThan(Integer value) {
            addCriterion("refund_to >", value, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_to >=", value, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToLessThan(Integer value) {
            addCriterion("refund_to <", value, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToLessThanOrEqualTo(Integer value) {
            addCriterion("refund_to <=", value, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToIn(List<Integer> values) {
            addCriterion("refund_to in", values, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToNotIn(List<Integer> values) {
            addCriterion("refund_to not in", values, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToBetween(Integer value1, Integer value2) {
            addCriterion("refund_to between", value1, value2, "refundTo");
            return (Criteria) this;
        }

        public Criteria andRefundToNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_to not between", value1, value2, "refundTo");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoIsNull() {
            addCriterion("refund_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoIsNotNull() {
            addCriterion("refund_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoEqualTo(String value) {
            addCriterion("refund_trade_no =", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotEqualTo(String value) {
            addCriterion("refund_trade_no <>", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoGreaterThan(String value) {
            addCriterion("refund_trade_no >", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_trade_no >=", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoLessThan(String value) {
            addCriterion("refund_trade_no <", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoLessThanOrEqualTo(String value) {
            addCriterion("refund_trade_no <=", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoLike(String value) {
            addCriterion("refund_trade_no like", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotLike(String value) {
            addCriterion("refund_trade_no not like", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoIn(List<String> values) {
            addCriterion("refund_trade_no in", values, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotIn(List<String> values) {
            addCriterion("refund_trade_no not in", values, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoBetween(String value1, String value2) {
            addCriterion("refund_trade_no between", value1, value2, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotBetween(String value1, String value2) {
            addCriterion("refund_trade_no not between", value1, value2, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkIsNull() {
            addCriterion("refund_remark is null");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkIsNotNull() {
            addCriterion("refund_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkEqualTo(String value) {
            addCriterion("refund_remark =", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkNotEqualTo(String value) {
            addCriterion("refund_remark <>", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkGreaterThan(String value) {
            addCriterion("refund_remark >", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("refund_remark >=", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkLessThan(String value) {
            addCriterion("refund_remark <", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkLessThanOrEqualTo(String value) {
            addCriterion("refund_remark <=", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkLike(String value) {
            addCriterion("refund_remark like", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkNotLike(String value) {
            addCriterion("refund_remark not like", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkIn(List<String> values) {
            addCriterion("refund_remark in", values, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkNotIn(List<String> values) {
            addCriterion("refund_remark not in", values, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkBetween(String value1, String value2) {
            addCriterion("refund_remark between", value1, value2, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkNotBetween(String value1, String value2) {
            addCriterion("refund_remark not between", value1, value2, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Integer value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Integer value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Integer value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Integer value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Integer value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Integer> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Integer> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Integer value1, Integer value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIsNull() {
            addCriterion("back_money is null");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIsNotNull() {
            addCriterion("back_money is not null");
            return (Criteria) this;
        }

        public Criteria andBackMoneyEqualTo(BigDecimal value) {
            addCriterion("back_money =", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotEqualTo(BigDecimal value) {
            addCriterion("back_money <>", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyGreaterThan(BigDecimal value) {
            addCriterion("back_money >", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("back_money >=", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyLessThan(BigDecimal value) {
            addCriterion("back_money <", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("back_money <=", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIn(List<BigDecimal> values) {
            addCriterion("back_money in", values, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotIn(List<BigDecimal> values) {
            addCriterion("back_money not in", values, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("back_money between", value1, value2, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("back_money not between", value1, value2, "backMoney");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Byte value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Byte value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Byte value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Byte value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Byte value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Byte> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Byte> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Byte value1, Byte value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundMsgIsNull() {
            addCriterion("refund_msg is null");
            return (Criteria) this;
        }

        public Criteria andRefundMsgIsNotNull() {
            addCriterion("refund_msg is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMsgEqualTo(String value) {
            addCriterion("refund_msg =", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgNotEqualTo(String value) {
            addCriterion("refund_msg <>", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgGreaterThan(String value) {
            addCriterion("refund_msg >", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgGreaterThanOrEqualTo(String value) {
            addCriterion("refund_msg >=", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgLessThan(String value) {
            addCriterion("refund_msg <", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgLessThanOrEqualTo(String value) {
            addCriterion("refund_msg <=", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgLike(String value) {
            addCriterion("refund_msg like", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgNotLike(String value) {
            addCriterion("refund_msg not like", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgIn(List<String> values) {
            addCriterion("refund_msg in", values, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgNotIn(List<String> values) {
            addCriterion("refund_msg not in", values, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgBetween(String value1, String value2) {
            addCriterion("refund_msg between", value1, value2, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgNotBetween(String value1, String value2) {
            addCriterion("refund_msg not between", value1, value2, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundInfoIsNull() {
            addCriterion("refund_info is null");
            return (Criteria) this;
        }

        public Criteria andRefundInfoIsNotNull() {
            addCriterion("refund_info is not null");
            return (Criteria) this;
        }

        public Criteria andRefundInfoEqualTo(String value) {
            addCriterion("refund_info =", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoNotEqualTo(String value) {
            addCriterion("refund_info <>", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoGreaterThan(String value) {
            addCriterion("refund_info >", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_info >=", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoLessThan(String value) {
            addCriterion("refund_info <", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoLessThanOrEqualTo(String value) {
            addCriterion("refund_info <=", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoLike(String value) {
            addCriterion("refund_info like", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoNotLike(String value) {
            addCriterion("refund_info not like", value, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoIn(List<String> values) {
            addCriterion("refund_info in", values, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoNotIn(List<String> values) {
            addCriterion("refund_info not in", values, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoBetween(String value1, String value2) {
            addCriterion("refund_info between", value1, value2, "refundInfo");
            return (Criteria) this;
        }

        public Criteria andRefundInfoNotBetween(String value1, String value2) {
            addCriterion("refund_info not between", value1, value2, "refundInfo");
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