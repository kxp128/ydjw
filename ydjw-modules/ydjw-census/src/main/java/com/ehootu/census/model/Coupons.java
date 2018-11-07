package com.ehootu.census.model;

import java.math.BigDecimal;

public class Coupons {
    private Integer couponId;

    private String title;

    private Byte couponType;

    private BigDecimal amountTotal;

    private BigDecimal amountCoupon;

    private BigDecimal saleAmount;

    private BigDecimal originalPrice;

    private BigDecimal recommendCommission;

    private Integer businessId;

    private Integer scene;

    private Integer limitCount;

    private Short getTotal;

    private Byte isEnable;

    private Integer validDay;

    private String description;

    private String activityDes;

    private String images;

    private String verifyInfo;

    private Byte deleted;

    private Integer created;

    private Integer modified;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getCouponType() {
        return couponType;
    }

    public void setCouponType(Byte couponType) {
        this.couponType = couponType;
    }

    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }

    public BigDecimal getAmountCoupon() {
        return amountCoupon;
    }

    public void setAmountCoupon(BigDecimal amountCoupon) {
        this.amountCoupon = amountCoupon;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getRecommendCommission() {
        return recommendCommission;
    }

    public void setRecommendCommission(BigDecimal recommendCommission) {
        this.recommendCommission = recommendCommission;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getScene() {
        return scene;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Short getGetTotal() {
        return getTotal;
    }

    public void setGetTotal(Short getTotal) {
        this.getTotal = getTotal;
    }

    public Byte getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Byte isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getValidDay() {
        return validDay;
    }

    public void setValidDay(Integer validDay) {
        this.validDay = validDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getActivityDes() {
        return activityDes;
    }

    public void setActivityDes(String activityDes) {
        this.activityDes = activityDes == null ? null : activityDes.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getVerifyInfo() {
        return verifyInfo;
    }

    public void setVerifyInfo(String verifyInfo) {
        this.verifyInfo = verifyInfo == null ? null : verifyInfo.trim();
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getModified() {
        return modified;
    }

    public void setModified(Integer modified) {
        this.modified = modified;
    }
}