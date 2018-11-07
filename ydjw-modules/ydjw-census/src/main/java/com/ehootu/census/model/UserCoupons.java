package com.ehootu.census.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserCoupons {
    private Long userCouponId;

    private Integer couponId;

    private Long orderSn;

    private BigDecimal saleAmount;

    private Byte status;

    private String payInfo;

    private Date payDate;

    private Integer businessId;

    private Integer scene;

    private Integer fromBusinessId;

    private Integer hkUserId;

    private Integer userId;

    private String phone;

    private Integer messageId;

    private Byte isUse;

    private Integer useTime;

    private Integer fromPoiTopicId;

    private Integer expireTime;

    private Integer created;

    private Byte isDelete;

    public Long getUserCouponId() {
        return userCouponId;
    }

    public void setUserCouponId(Long userCouponId) {
        this.userCouponId = userCouponId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo == null ? null : payInfo.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
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

    public Integer getFromBusinessId() {
        return fromBusinessId;
    }

    public void setFromBusinessId(Integer fromBusinessId) {
        this.fromBusinessId = fromBusinessId;
    }

    public Integer getHkUserId() {
        return hkUserId;
    }

    public void setHkUserId(Integer hkUserId) {
        this.hkUserId = hkUserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Byte getIsUse() {
        return isUse;
    }

    public void setIsUse(Byte isUse) {
        this.isUse = isUse;
    }

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    public Integer getFromPoiTopicId() {
        return fromPoiTopicId;
    }

    public void setFromPoiTopicId(Integer fromPoiTopicId) {
        this.fromPoiTopicId = fromPoiTopicId;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}