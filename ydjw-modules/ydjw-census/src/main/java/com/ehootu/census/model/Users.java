package com.ehootu.census.model;

import java.math.BigDecimal;

public class Users {
    private Integer userId;

    private String phone;

    private Byte sex;
    /**
     * 昵称
     */
    private String nickname;

    private String province;

    private String city;
    /**
     * 头像路径
     */
    private String avatar;

    private String password;
    /**
     * 1 启用 2 禁用
     */
    private Byte isEnable;

    private String phoneLocation;

    private Byte age;

    private String birthday;

    private Integer regDate;
    /**
     * 最后登录时间
     */
    private Integer lastLoginDate;
    /**
     * 微信openid
     */
    private String openid;
    /**
     * 用户可提现金额小程序openid
     */
    private String wxaOpenId;
    /**
     * 用户可提现金额
     */
    private BigDecimal withdrawalAmount;
    /**
     * 用户累计返利
     */
    private BigDecimal totalCouponAmount;
    /**
     * 微信unionId
     */
    private String unionId;
    /**
     * 支付宝用户ID
     */
    private Long alipayUserId;

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

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Byte isEnable) {
        this.isEnable = isEnable;
    }

    public String getPhoneLocation() {
        return phoneLocation;
    }

    public void setPhoneLocation(String phoneLocation) {
        this.phoneLocation = phoneLocation == null ? null : phoneLocation.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Integer getRegDate() {
        return regDate;
    }

    public void setRegDate(Integer regDate) {
        this.regDate = regDate;
    }

    public Integer getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Integer lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getWxaOpenId() {
        return wxaOpenId;
    }

    public void setWxaOpenId(String wxaOpenId) {
        this.wxaOpenId = wxaOpenId == null ? null : wxaOpenId.trim();
    }

    public BigDecimal getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(BigDecimal withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public BigDecimal getTotalCouponAmount() {
        return totalCouponAmount;
    }

    public void setTotalCouponAmount(BigDecimal totalCouponAmount) {
        this.totalCouponAmount = totalCouponAmount;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public Long getAlipayUserId() {
        return alipayUserId;
    }

    public void setAlipayUserId(Long alipayUserId) {
        this.alipayUserId = alipayUserId;
    }
}