package com.ehootu.census.model;

import java.math.BigDecimal;

public class Pois {
    private Integer poiId;

    private Integer scene;

    private String name;

    private Integer userId;

    private String tel;

    private String regionId;

    private String address;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String cover;

    private String voice;

    private Short voiceDuration;

    private Byte category;

    private String path;

    private Byte status;

    private BigDecimal score;

    private Integer businessId;

    private Integer categoryLevel1;

    private Integer categoryLevel2;

    private String customCategory;

    private String level;

    private Byte isEnable;

    private Integer views;

    private Short parkingCapacity;

    private Integer browseCount;

    private Integer updateUser;

    private BigDecimal recommendScore;

    private Integer customRecommendScore;

    private String customTags;

    private String commentKeywords;

    private String koubeiHeadline;

    private Integer created;

    public Integer getPoiId() {
        return poiId;
    }

    public void setPoiId(Integer poiId) {
        this.poiId = poiId;
    }

    public Integer getScene() {
        return scene;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice == null ? null : voice.trim();
    }

    public Short getVoiceDuration() {
        return voiceDuration;
    }

    public void setVoiceDuration(Short voiceDuration) {
        this.voiceDuration = voiceDuration;
    }

    public Byte getCategory() {
        return category;
    }

    public void setCategory(Byte category) {
        this.category = category;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Integer categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public Integer getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Integer categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getCustomCategory() {
        return customCategory;
    }

    public void setCustomCategory(String customCategory) {
        this.customCategory = customCategory == null ? null : customCategory.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Byte getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Byte isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Short getParkingCapacity() {
        return parkingCapacity;
    }

    public void setParkingCapacity(Short parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }

    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public BigDecimal getRecommendScore() {
        return recommendScore;
    }

    public void setRecommendScore(BigDecimal recommendScore) {
        this.recommendScore = recommendScore;
    }

    public Integer getCustomRecommendScore() {
        return customRecommendScore;
    }

    public void setCustomRecommendScore(Integer customRecommendScore) {
        this.customRecommendScore = customRecommendScore;
    }

    public String getCustomTags() {
        return customTags;
    }

    public void setCustomTags(String customTags) {
        this.customTags = customTags == null ? null : customTags.trim();
    }

    public String getCommentKeywords() {
        return commentKeywords;
    }

    public void setCommentKeywords(String commentKeywords) {
        this.commentKeywords = commentKeywords == null ? null : commentKeywords.trim();
    }

    public String getKoubeiHeadline() {
        return koubeiHeadline;
    }

    public void setKoubeiHeadline(String koubeiHeadline) {
        this.koubeiHeadline = koubeiHeadline == null ? null : koubeiHeadline.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}