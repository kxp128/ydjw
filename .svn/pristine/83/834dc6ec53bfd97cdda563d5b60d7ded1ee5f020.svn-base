package com.ehootu.user.model;

import java.util.Date;
/**
 * @Author: KongXiaoPing
 * @Date: 2017/9/21  14:28
 * @Description: 登录人对象
 */
public class User {
    private String id;

    /**
     * 微信号id
     */
    private String weixinId;


    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    //原来的密码
    private String oldPassWord;
    //验证码
    private String code;
    /**
     * 联系电话
     */
    private String phoneNumber;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 删除标记 1表示删除 0 表示未删除
     */
    private Integer deleteFlag;
    /**
     * 免登录标记,就是用户ID
     */
    private String loginSign;

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getWeixinId() {
        return weixinId;
    }

    public void setWeixinId(String weixinId) {
        this.weixinId = weixinId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getOldPassWord() {
        return oldPassWord;
    }

    public void setOldPassWord(String oldPassWord) {
        this.oldPassWord = oldPassWord;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLoginSign() {
        return loginSign;
    }

    public void setLoginSign(String loginSign) {
        this.loginSign = loginSign;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", weixinId=" + weixinId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", oldPassWord='" + oldPassWord + '\'' +
                ", code='" + code + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleteFlag=" + deleteFlag +
                ", loginSign=" + loginSign +
                '}';
    }

}