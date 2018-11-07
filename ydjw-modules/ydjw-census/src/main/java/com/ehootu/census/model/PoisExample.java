package com.ehootu.census.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PoisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoisExample() {
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

        public Criteria andPoiIdIsNull() {
            addCriterion("poi_id is null");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNotNull() {
            addCriterion("poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoiIdEqualTo(Integer value) {
            addCriterion("poi_id =", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotEqualTo(Integer value) {
            addCriterion("poi_id <>", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThan(Integer value) {
            addCriterion("poi_id >", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("poi_id >=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThan(Integer value) {
            addCriterion("poi_id <", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThanOrEqualTo(Integer value) {
            addCriterion("poi_id <=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIn(List<Integer> values) {
            addCriterion("poi_id in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotIn(List<Integer> values) {
            addCriterion("poi_id not in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdBetween(Integer value1, Integer value2) {
            addCriterion("poi_id between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("poi_id not between", value1, value2, "poiId");
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

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(String value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(String value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(String value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(String value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(String value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(String value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLike(String value) {
            addCriterion("region_id like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotLike(String value) {
            addCriterion("region_id not like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<String> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<String> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(String value1, String value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(String value1, String value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNull() {
            addCriterion("voice is null");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNotNull() {
            addCriterion("voice is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceEqualTo(String value) {
            addCriterion("voice =", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotEqualTo(String value) {
            addCriterion("voice <>", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThan(String value) {
            addCriterion("voice >", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThanOrEqualTo(String value) {
            addCriterion("voice >=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThan(String value) {
            addCriterion("voice <", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThanOrEqualTo(String value) {
            addCriterion("voice <=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLike(String value) {
            addCriterion("voice like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotLike(String value) {
            addCriterion("voice not like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceIn(List<String> values) {
            addCriterion("voice in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotIn(List<String> values) {
            addCriterion("voice not in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceBetween(String value1, String value2) {
            addCriterion("voice between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotBetween(String value1, String value2) {
            addCriterion("voice not between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationIsNull() {
            addCriterion("voice_duration is null");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationIsNotNull() {
            addCriterion("voice_duration is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationEqualTo(Short value) {
            addCriterion("voice_duration =", value, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationNotEqualTo(Short value) {
            addCriterion("voice_duration <>", value, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationGreaterThan(Short value) {
            addCriterion("voice_duration >", value, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationGreaterThanOrEqualTo(Short value) {
            addCriterion("voice_duration >=", value, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationLessThan(Short value) {
            addCriterion("voice_duration <", value, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationLessThanOrEqualTo(Short value) {
            addCriterion("voice_duration <=", value, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationIn(List<Short> values) {
            addCriterion("voice_duration in", values, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationNotIn(List<Short> values) {
            addCriterion("voice_duration not in", values, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationBetween(Short value1, Short value2) {
            addCriterion("voice_duration between", value1, value2, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andVoiceDurationNotBetween(Short value1, Short value2) {
            addCriterion("voice_duration not between", value1, value2, "voiceDuration");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Byte value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Byte value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Byte value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Byte value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Byte value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Byte value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Byte> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Byte> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Byte value1, Byte value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Byte value1, Byte value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andCategoryLevel1IsNull() {
            addCriterion("category_level1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1IsNotNull() {
            addCriterion("category_level1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1EqualTo(Integer value) {
            addCriterion("category_level1 =", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1NotEqualTo(Integer value) {
            addCriterion("category_level1 <>", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1GreaterThan(Integer value) {
            addCriterion("category_level1 >", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_level1 >=", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1LessThan(Integer value) {
            addCriterion("category_level1 <", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1LessThanOrEqualTo(Integer value) {
            addCriterion("category_level1 <=", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1In(List<Integer> values) {
            addCriterion("category_level1 in", values, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1NotIn(List<Integer> values) {
            addCriterion("category_level1 not in", values, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1Between(Integer value1, Integer value2) {
            addCriterion("category_level1 between", value1, value2, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1NotBetween(Integer value1, Integer value2) {
            addCriterion("category_level1 not between", value1, value2, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2IsNull() {
            addCriterion("category_level2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2IsNotNull() {
            addCriterion("category_level2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2EqualTo(Integer value) {
            addCriterion("category_level2 =", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2NotEqualTo(Integer value) {
            addCriterion("category_level2 <>", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2GreaterThan(Integer value) {
            addCriterion("category_level2 >", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_level2 >=", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2LessThan(Integer value) {
            addCriterion("category_level2 <", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2LessThanOrEqualTo(Integer value) {
            addCriterion("category_level2 <=", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2In(List<Integer> values) {
            addCriterion("category_level2 in", values, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2NotIn(List<Integer> values) {
            addCriterion("category_level2 not in", values, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2Between(Integer value1, Integer value2) {
            addCriterion("category_level2 between", value1, value2, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2NotBetween(Integer value1, Integer value2) {
            addCriterion("category_level2 not between", value1, value2, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIsNull() {
            addCriterion("custom_category is null");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIsNotNull() {
            addCriterion("custom_category is not null");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryEqualTo(String value) {
            addCriterion("custom_category =", value, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryNotEqualTo(String value) {
            addCriterion("custom_category <>", value, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryGreaterThan(String value) {
            addCriterion("custom_category >", value, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("custom_category >=", value, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryLessThan(String value) {
            addCriterion("custom_category <", value, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryLessThanOrEqualTo(String value) {
            addCriterion("custom_category <=", value, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryLike(String value) {
            addCriterion("custom_category like", value, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryNotLike(String value) {
            addCriterion("custom_category not like", value, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIn(List<String> values) {
            addCriterion("custom_category in", values, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryNotIn(List<String> values) {
            addCriterion("custom_category not in", values, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryBetween(String value1, String value2) {
            addCriterion("custom_category between", value1, value2, "customCategory");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryNotBetween(String value1, String value2) {
            addCriterion("custom_category not between", value1, value2, "customCategory");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityIsNull() {
            addCriterion("parking_capacity is null");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityIsNotNull() {
            addCriterion("parking_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityEqualTo(Short value) {
            addCriterion("parking_capacity =", value, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityNotEqualTo(Short value) {
            addCriterion("parking_capacity <>", value, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityGreaterThan(Short value) {
            addCriterion("parking_capacity >", value, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityGreaterThanOrEqualTo(Short value) {
            addCriterion("parking_capacity >=", value, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityLessThan(Short value) {
            addCriterion("parking_capacity <", value, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityLessThanOrEqualTo(Short value) {
            addCriterion("parking_capacity <=", value, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityIn(List<Short> values) {
            addCriterion("parking_capacity in", values, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityNotIn(List<Short> values) {
            addCriterion("parking_capacity not in", values, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityBetween(Short value1, Short value2) {
            addCriterion("parking_capacity between", value1, value2, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andParkingCapacityNotBetween(Short value1, Short value2) {
            addCriterion("parking_capacity not between", value1, value2, "parkingCapacity");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIsNull() {
            addCriterion("browse_count is null");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIsNotNull() {
            addCriterion("browse_count is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseCountEqualTo(Integer value) {
            addCriterion("browse_count =", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotEqualTo(Integer value) {
            addCriterion("browse_count <>", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountGreaterThan(Integer value) {
            addCriterion("browse_count >", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_count >=", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountLessThan(Integer value) {
            addCriterion("browse_count <", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountLessThanOrEqualTo(Integer value) {
            addCriterion("browse_count <=", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIn(List<Integer> values) {
            addCriterion("browse_count in", values, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotIn(List<Integer> values) {
            addCriterion("browse_count not in", values, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountBetween(Integer value1, Integer value2) {
            addCriterion("browse_count between", value1, value2, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_count not between", value1, value2, "browseCount");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Integer value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Integer value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Integer value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Integer value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Integer value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Integer> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Integer> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Integer value1, Integer value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreIsNull() {
            addCriterion("recommend_score is null");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreIsNotNull() {
            addCriterion("recommend_score is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreEqualTo(BigDecimal value) {
            addCriterion("recommend_score =", value, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreNotEqualTo(BigDecimal value) {
            addCriterion("recommend_score <>", value, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreGreaterThan(BigDecimal value) {
            addCriterion("recommend_score >", value, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recommend_score >=", value, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreLessThan(BigDecimal value) {
            addCriterion("recommend_score <", value, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recommend_score <=", value, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreIn(List<BigDecimal> values) {
            addCriterion("recommend_score in", values, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreNotIn(List<BigDecimal> values) {
            addCriterion("recommend_score not in", values, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recommend_score between", value1, value2, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andRecommendScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recommend_score not between", value1, value2, "recommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreIsNull() {
            addCriterion("custom_recommend_score is null");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreIsNotNull() {
            addCriterion("custom_recommend_score is not null");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreEqualTo(Integer value) {
            addCriterion("custom_recommend_score =", value, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreNotEqualTo(Integer value) {
            addCriterion("custom_recommend_score <>", value, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreGreaterThan(Integer value) {
            addCriterion("custom_recommend_score >", value, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_recommend_score >=", value, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreLessThan(Integer value) {
            addCriterion("custom_recommend_score <", value, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreLessThanOrEqualTo(Integer value) {
            addCriterion("custom_recommend_score <=", value, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreIn(List<Integer> values) {
            addCriterion("custom_recommend_score in", values, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreNotIn(List<Integer> values) {
            addCriterion("custom_recommend_score not in", values, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreBetween(Integer value1, Integer value2) {
            addCriterion("custom_recommend_score between", value1, value2, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomRecommendScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_recommend_score not between", value1, value2, "customRecommendScore");
            return (Criteria) this;
        }

        public Criteria andCustomTagsIsNull() {
            addCriterion("custom_tags is null");
            return (Criteria) this;
        }

        public Criteria andCustomTagsIsNotNull() {
            addCriterion("custom_tags is not null");
            return (Criteria) this;
        }

        public Criteria andCustomTagsEqualTo(String value) {
            addCriterion("custom_tags =", value, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsNotEqualTo(String value) {
            addCriterion("custom_tags <>", value, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsGreaterThan(String value) {
            addCriterion("custom_tags >", value, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsGreaterThanOrEqualTo(String value) {
            addCriterion("custom_tags >=", value, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsLessThan(String value) {
            addCriterion("custom_tags <", value, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsLessThanOrEqualTo(String value) {
            addCriterion("custom_tags <=", value, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsLike(String value) {
            addCriterion("custom_tags like", value, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsNotLike(String value) {
            addCriterion("custom_tags not like", value, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsIn(List<String> values) {
            addCriterion("custom_tags in", values, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsNotIn(List<String> values) {
            addCriterion("custom_tags not in", values, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsBetween(String value1, String value2) {
            addCriterion("custom_tags between", value1, value2, "customTags");
            return (Criteria) this;
        }

        public Criteria andCustomTagsNotBetween(String value1, String value2) {
            addCriterion("custom_tags not between", value1, value2, "customTags");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsIsNull() {
            addCriterion("comment_keywords is null");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsIsNotNull() {
            addCriterion("comment_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsEqualTo(String value) {
            addCriterion("comment_keywords =", value, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsNotEqualTo(String value) {
            addCriterion("comment_keywords <>", value, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsGreaterThan(String value) {
            addCriterion("comment_keywords >", value, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("comment_keywords >=", value, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsLessThan(String value) {
            addCriterion("comment_keywords <", value, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsLessThanOrEqualTo(String value) {
            addCriterion("comment_keywords <=", value, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsLike(String value) {
            addCriterion("comment_keywords like", value, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsNotLike(String value) {
            addCriterion("comment_keywords not like", value, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsIn(List<String> values) {
            addCriterion("comment_keywords in", values, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsNotIn(List<String> values) {
            addCriterion("comment_keywords not in", values, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsBetween(String value1, String value2) {
            addCriterion("comment_keywords between", value1, value2, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andCommentKeywordsNotBetween(String value1, String value2) {
            addCriterion("comment_keywords not between", value1, value2, "commentKeywords");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineIsNull() {
            addCriterion("koubei_headline is null");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineIsNotNull() {
            addCriterion("koubei_headline is not null");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineEqualTo(String value) {
            addCriterion("koubei_headline =", value, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineNotEqualTo(String value) {
            addCriterion("koubei_headline <>", value, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineGreaterThan(String value) {
            addCriterion("koubei_headline >", value, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("koubei_headline >=", value, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineLessThan(String value) {
            addCriterion("koubei_headline <", value, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineLessThanOrEqualTo(String value) {
            addCriterion("koubei_headline <=", value, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineLike(String value) {
            addCriterion("koubei_headline like", value, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineNotLike(String value) {
            addCriterion("koubei_headline not like", value, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineIn(List<String> values) {
            addCriterion("koubei_headline in", values, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineNotIn(List<String> values) {
            addCriterion("koubei_headline not in", values, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineBetween(String value1, String value2) {
            addCriterion("koubei_headline between", value1, value2, "koubeiHeadline");
            return (Criteria) this;
        }

        public Criteria andKoubeiHeadlineNotBetween(String value1, String value2) {
            addCriterion("koubei_headline not between", value1, value2, "koubeiHeadline");
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