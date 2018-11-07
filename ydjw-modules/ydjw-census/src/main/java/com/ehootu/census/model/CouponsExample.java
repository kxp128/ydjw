package com.ehootu.census.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CouponsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponsExample() {
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

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Byte value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Byte value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Byte value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Byte value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Byte value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Byte> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Byte> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Byte value1, Byte value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andAmountTotalIsNull() {
            addCriterion("amount_total is null");
            return (Criteria) this;
        }

        public Criteria andAmountTotalIsNotNull() {
            addCriterion("amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andAmountTotalEqualTo(BigDecimal value) {
            addCriterion("amount_total =", value, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("amount_total <>", value, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("amount_total >", value, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_total >=", value, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalLessThan(BigDecimal value) {
            addCriterion("amount_total <", value, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_total <=", value, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalIn(List<BigDecimal> values) {
            addCriterion("amount_total in", values, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("amount_total not in", values, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_total between", value1, value2, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_total not between", value1, value2, "amountTotal");
            return (Criteria) this;
        }

        public Criteria andAmountCouponIsNull() {
            addCriterion("amount_coupon is null");
            return (Criteria) this;
        }

        public Criteria andAmountCouponIsNotNull() {
            addCriterion("amount_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andAmountCouponEqualTo(BigDecimal value) {
            addCriterion("amount_coupon =", value, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponNotEqualTo(BigDecimal value) {
            addCriterion("amount_coupon <>", value, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponGreaterThan(BigDecimal value) {
            addCriterion("amount_coupon >", value, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_coupon >=", value, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponLessThan(BigDecimal value) {
            addCriterion("amount_coupon <", value, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_coupon <=", value, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponIn(List<BigDecimal> values) {
            addCriterion("amount_coupon in", values, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponNotIn(List<BigDecimal> values) {
            addCriterion("amount_coupon not in", values, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_coupon between", value1, value2, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andAmountCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_coupon not between", value1, value2, "amountCoupon");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNull() {
            addCriterion("sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(BigDecimal value) {
            addCriterion("sale_amount =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("sale_amount <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("sale_amount >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amount >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(BigDecimal value) {
            addCriterion("sale_amount <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amount <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<BigDecimal> values) {
            addCriterion("sale_amount in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("sale_amount not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amount between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amount not between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(BigDecimal value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionIsNull() {
            addCriterion("recommend_commission is null");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionIsNotNull() {
            addCriterion("recommend_commission is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionEqualTo(BigDecimal value) {
            addCriterion("recommend_commission =", value, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionNotEqualTo(BigDecimal value) {
            addCriterion("recommend_commission <>", value, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionGreaterThan(BigDecimal value) {
            addCriterion("recommend_commission >", value, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recommend_commission >=", value, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionLessThan(BigDecimal value) {
            addCriterion("recommend_commission <", value, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recommend_commission <=", value, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionIn(List<BigDecimal> values) {
            addCriterion("recommend_commission in", values, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionNotIn(List<BigDecimal> values) {
            addCriterion("recommend_commission not in", values, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recommend_commission between", value1, value2, "recommendCommission");
            return (Criteria) this;
        }

        public Criteria andRecommendCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recommend_commission not between", value1, value2, "recommendCommission");
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

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(Integer value) {
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(Integer value) {
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(Integer value) {
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(Integer value) {
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(Integer value) {
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<Integer> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<Integer> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(Integer value1, Integer value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(Integer value1, Integer value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andLimitCountIsNull() {
            addCriterion("limit_count is null");
            return (Criteria) this;
        }

        public Criteria andLimitCountIsNotNull() {
            addCriterion("limit_count is not null");
            return (Criteria) this;
        }

        public Criteria andLimitCountEqualTo(Integer value) {
            addCriterion("limit_count =", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountNotEqualTo(Integer value) {
            addCriterion("limit_count <>", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountGreaterThan(Integer value) {
            addCriterion("limit_count >", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_count >=", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountLessThan(Integer value) {
            addCriterion("limit_count <", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountLessThanOrEqualTo(Integer value) {
            addCriterion("limit_count <=", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountIn(List<Integer> values) {
            addCriterion("limit_count in", values, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountNotIn(List<Integer> values) {
            addCriterion("limit_count not in", values, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountBetween(Integer value1, Integer value2) {
            addCriterion("limit_count between", value1, value2, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_count not between", value1, value2, "limitCount");
            return (Criteria) this;
        }

        public Criteria andGetTotalIsNull() {
            addCriterion("get_total is null");
            return (Criteria) this;
        }

        public Criteria andGetTotalIsNotNull() {
            addCriterion("get_total is not null");
            return (Criteria) this;
        }

        public Criteria andGetTotalEqualTo(Short value) {
            addCriterion("get_total =", value, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalNotEqualTo(Short value) {
            addCriterion("get_total <>", value, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalGreaterThan(Short value) {
            addCriterion("get_total >", value, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalGreaterThanOrEqualTo(Short value) {
            addCriterion("get_total >=", value, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalLessThan(Short value) {
            addCriterion("get_total <", value, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalLessThanOrEqualTo(Short value) {
            addCriterion("get_total <=", value, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalIn(List<Short> values) {
            addCriterion("get_total in", values, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalNotIn(List<Short> values) {
            addCriterion("get_total not in", values, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalBetween(Short value1, Short value2) {
            addCriterion("get_total between", value1, value2, "getTotal");
            return (Criteria) this;
        }

        public Criteria andGetTotalNotBetween(Short value1, Short value2) {
            addCriterion("get_total not between", value1, value2, "getTotal");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Byte value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Byte value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Byte value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Byte value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Byte value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Byte> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Byte> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Byte value1, Byte value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andValidDayIsNull() {
            addCriterion("valid_day is null");
            return (Criteria) this;
        }

        public Criteria andValidDayIsNotNull() {
            addCriterion("valid_day is not null");
            return (Criteria) this;
        }

        public Criteria andValidDayEqualTo(Integer value) {
            addCriterion("valid_day =", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayNotEqualTo(Integer value) {
            addCriterion("valid_day <>", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayGreaterThan(Integer value) {
            addCriterion("valid_day >", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_day >=", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayLessThan(Integer value) {
            addCriterion("valid_day <", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayLessThanOrEqualTo(Integer value) {
            addCriterion("valid_day <=", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayIn(List<Integer> values) {
            addCriterion("valid_day in", values, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayNotIn(List<Integer> values) {
            addCriterion("valid_day not in", values, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayBetween(Integer value1, Integer value2) {
            addCriterion("valid_day between", value1, value2, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_day not between", value1, value2, "validDay");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andActivityDesIsNull() {
            addCriterion("activity_des is null");
            return (Criteria) this;
        }

        public Criteria andActivityDesIsNotNull() {
            addCriterion("activity_des is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDesEqualTo(String value) {
            addCriterion("activity_des =", value, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesNotEqualTo(String value) {
            addCriterion("activity_des <>", value, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesGreaterThan(String value) {
            addCriterion("activity_des >", value, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesGreaterThanOrEqualTo(String value) {
            addCriterion("activity_des >=", value, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesLessThan(String value) {
            addCriterion("activity_des <", value, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesLessThanOrEqualTo(String value) {
            addCriterion("activity_des <=", value, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesLike(String value) {
            addCriterion("activity_des like", value, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesNotLike(String value) {
            addCriterion("activity_des not like", value, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesIn(List<String> values) {
            addCriterion("activity_des in", values, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesNotIn(List<String> values) {
            addCriterion("activity_des not in", values, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesBetween(String value1, String value2) {
            addCriterion("activity_des between", value1, value2, "activityDes");
            return (Criteria) this;
        }

        public Criteria andActivityDesNotBetween(String value1, String value2) {
            addCriterion("activity_des not between", value1, value2, "activityDes");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoIsNull() {
            addCriterion("verify_info is null");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoIsNotNull() {
            addCriterion("verify_info is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoEqualTo(String value) {
            addCriterion("verify_info =", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoNotEqualTo(String value) {
            addCriterion("verify_info <>", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoGreaterThan(String value) {
            addCriterion("verify_info >", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("verify_info >=", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoLessThan(String value) {
            addCriterion("verify_info <", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoLessThanOrEqualTo(String value) {
            addCriterion("verify_info <=", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoLike(String value) {
            addCriterion("verify_info like", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoNotLike(String value) {
            addCriterion("verify_info not like", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoIn(List<String> values) {
            addCriterion("verify_info in", values, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoNotIn(List<String> values) {
            addCriterion("verify_info not in", values, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoBetween(String value1, String value2) {
            addCriterion("verify_info between", value1, value2, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoNotBetween(String value1, String value2) {
            addCriterion("verify_info not between", value1, value2, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Byte value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Byte value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Byte value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Byte value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Byte> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Byte> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Integer value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Integer value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Integer value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Integer value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Integer value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Integer> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Integer> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Integer value1, Integer value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("modified not between", value1, value2, "modified");
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