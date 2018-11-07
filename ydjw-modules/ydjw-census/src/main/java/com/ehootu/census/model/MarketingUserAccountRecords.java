package com.ehootu.census.model;

import java.math.BigDecimal;

public class MarketingUserAccountRecords {
    private Integer recordId;

    private BigDecimal amount;

    private Integer mkUserId;

    private Integer businessId;

    private Integer userId;

    private String wxaOpenid;

    private Byte type;

    private Byte category;

    private Integer payTime;

    private Integer created;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getMkUserId() {
        return mkUserId;
    }

    public void setMkUserId(Integer mkUserId) {
        this.mkUserId = mkUserId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWxaOpenid() {
        return wxaOpenid;
    }

    public void setWxaOpenid(String wxaOpenid) {
        this.wxaOpenid = wxaOpenid == null ? null : wxaOpenid.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getCategory() {
        return category;
    }

    public void setCategory(Byte category) {
        this.category = category;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}