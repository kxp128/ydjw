package com.ehootu.user.model;

import com.ehootu.core.util.ExcelTitle;

import java.util.Date;

/**
* @Author: KongXiaoPing
* @Date: 2017/10/12  14:36
* @Description: 警察基本信息
*/
public class Police {
    private String id;
    /**
     * 登录名
     */
    @ExcelTitle("username")
    private String loginName;
    /**
     * 登录密码
     */
    @ExcelTitle("password")
    private String policePassword;

    /**
     * 验证码
     */
    private String code;
    /**
     * 警察姓名
     */
    @ExcelTitle("mjname")
    private String policeName;
    /**
     * 警号
     */
    @ExcelTitle("jh")
    private String policeNumber;
    /**
     * 所属派出所
     */
    @ExcelTitle("pcs")
    private String policeStation;
    /**
     * 所属警务室
     */
    @ExcelTitle("ssxq")
    private String policeOffice;
    /**
     * 职位
     */
    @ExcelTitle("zw")
    private String position;

    /**
     * 签章
     */
    private String signature;
    /**
     * 上级领导警号
     */
    private String parentNumber;
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

    private String parentId;

    private String parentName;

    private String name;
    public Police() {
    }
    public Police(String policeNumber,String policePassword) {
        this.policePassword = policePassword;
        this.policeNumber = policeNumber;
    }

    public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPolicePassword() {
        return policePassword;
    }

    public void setPolicePassword(String policePassword) {
        this.policePassword = policePassword == null ? null : policePassword.trim();
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName == null ? null : policeName.trim();
    }

    public String getPoliceNumber() {
        return policeNumber;
    }

    public void setPoliceNumber(String policeNumber) {
        this.policeNumber = policeNumber == null ? null : policeNumber.trim();
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation == null ? null : policeStation.trim();
    }

    public String getPoliceOffice() {
        return policeOffice;
    }

    public void setPoliceOffice(String policeOffice) {
        this.policeOffice = policeOffice == null ? null : policeOffice.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber == null ? null : parentNumber.trim();
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Police{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", policePassword='" + policePassword + '\'' +
                ", code='" + code + '\'' +
                ", policeName='" + policeName + '\'' +
                ", policeNumber='" + policeNumber + '\'' +
                ", policeStation='" + policeStation + '\'' +
                ", policeOffice='" + policeOffice + '\'' +
                ", signature='" + signature + '\'' +
                ", parentNumber='" + parentNumber + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}