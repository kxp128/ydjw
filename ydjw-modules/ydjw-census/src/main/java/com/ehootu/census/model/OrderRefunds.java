package com.ehootu.census.model;

import java.math.BigDecimal;

public class OrderRefunds {
    private Integer orderRefundId;

    private Integer orderId;

    private Integer refundTo;

    private String orderSn;

    private String refundTradeNo;

    private String refundRemark;

    private Integer refundTime;

    private BigDecimal backMoney;

    private Byte refundStatus;

    private String refundMsg;

    private String refundInfo;

    private Integer created;

    public Integer getOrderRefundId() {
        return orderRefundId;
    }

    public void setOrderRefundId(Integer orderRefundId) {
        this.orderRefundId = orderRefundId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRefundTo() {
        return refundTo;
    }

    public void setRefundTo(Integer refundTo) {
        this.refundTo = refundTo;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getRefundTradeNo() {
        return refundTradeNo;
    }

    public void setRefundTradeNo(String refundTradeNo) {
        this.refundTradeNo = refundTradeNo == null ? null : refundTradeNo.trim();
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark == null ? null : refundRemark.trim();
    }

    public Integer getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
    }

    public BigDecimal getBackMoney() {
        return backMoney;
    }

    public void setBackMoney(BigDecimal backMoney) {
        this.backMoney = backMoney;
    }

    public Byte getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Byte refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundMsg() {
        return refundMsg;
    }

    public void setRefundMsg(String refundMsg) {
        this.refundMsg = refundMsg == null ? null : refundMsg.trim();
    }

    public String getRefundInfo() {
        return refundInfo;
    }

    public void setRefundInfo(String refundInfo) {
        this.refundInfo = refundInfo == null ? null : refundInfo.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}