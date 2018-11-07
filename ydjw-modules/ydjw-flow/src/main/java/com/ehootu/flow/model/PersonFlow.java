package com.ehootu.flow.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: KongXiaoPing
 * @Date: 2017/9/21  11:43
 * @Description:流动人口业务实体
 */
public class PersonFlow implements Serializable {
    private String id;
    /**
     * 性别（0 女 1 男）
     */
    private String gender;
    /**
     * 电话号码
     */
    private String phoneNumber;
    /**
     * qq
     */
    private String qq;
    /**
     * 微信
     */
    private String weixin;
    /**
     * 邮箱
     */
    private String email;

    /**
     * 所属派出所
     */
    private String policeStation;
    /**
     * 所属警务室
     */
    private String policeOffice;
    /**
     * 所属工作站
     */
    private String workStation;
    /**
     * 姓名
     */
    private String floatingName;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 随身物品
     */
    private String personalEffects;
    /**
     * 个体特征
     */
    private String personalFeature;
    /**
     * 流入时间
     */
    private Date inflowTime;
    /**
     * 流出时间
     */
    private Date outflowTime;
    /**
     * 流动原因
     */
    private String flowReason;
    /**
     * 流出去向
     */
    private String outflowTo;
    /**
     * 照片,多张照片逗号分割
     */
    private String photographs;

    /**
     * 户籍住址
     */
    private String registerAddress;
    /**
     * 前科记录
     */
    private String criminalRecord;
    /**
     * 活动轨迹
     */
    private String actionTrack;
    /**
     * 工作岗位或单位
     */
    private String workCompany;
    /**
     * 是否录入流口平台,0-否；1-是
     */
    private Integer ifInput;
    /**
     * 流动人口类型（1-出租、2-建筑工地人员，3-企业单位）
     */
    private Integer floatingPopulationType;
    /**
     * 流出或者流入类型（1-流入；2-流出）
     */
    private Integer flowWay;
    /**
     * 数据登记时间
     */
    private Date inputTime;
    /**
     * 数据登记人 1代表从微信端录入 2代表从警察直接录入
     */
    private String operator;
    /**
     * 登录用户id（操作人）
     */
    private String userId;
    /**
     * 警员id
     */
    private String policeId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 删除标记1表示删除 0 表示未删除
     */
    private Integer deleteFlag;
    /**
     * 编号
     */
    private String number;

    public PersonFlow() {
    }

    public PersonFlow(InputPersonFlow inputPersonFlow) {
        this.gender = inputPersonFlow.getGender();
        this.phoneNumber = inputPersonFlow.getPhoneNumber();
        this.qq = inputPersonFlow.getQq();
        this.weixin = inputPersonFlow.getWeixin();
        this.email = inputPersonFlow.getEmail();
//        this.policeStation = inputPersonFlow.getPoliceStation();
//        this.policeOffice = policeOffice;
        this.workStation = inputPersonFlow.getWorkStation();
        this.floatingName = inputPersonFlow.getFloatingName();
        this.idNumber = inputPersonFlow.getIdNumber();
        this.personalEffects = inputPersonFlow.getPersonalEffects();
        this.personalFeature = inputPersonFlow.getPersonalFeature();
//        this.inflowTime = inputPersonFlow.getInflowTime();
//        this.outflowTime = inputPersonFlow.getOutflowTime();
        this.flowReason = inputPersonFlow.getFlowReason();
        this.outflowTo = inputPersonFlow.getOutflowTo();
        this.photographs = inputPersonFlow.getPhotographs();
        this.registerAddress = inputPersonFlow.getRegisterAddress();
        this.criminalRecord = inputPersonFlow.getCriminalRecord();
        this.actionTrack = inputPersonFlow.getActionTrack();
        this.workCompany = inputPersonFlow.getWorkCompany();
        this.ifInput = inputPersonFlow.getIfInput();
        this.floatingPopulationType = inputPersonFlow.getFloatingPopulationType();
        this.flowWay = inputPersonFlow.getFlowWay();
//        this.inputTime = inputPersonFlow.getInputTime();
        this.operator = inputPersonFlow.getOperator();
        this.userId = inputPersonFlow.getUserId();
        this.policeId = inputPersonFlow.getPoliceId();


    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getPoliceOffice() {
        return policeOffice;
    }

    public void setPoliceOffice(String policeOffice) {
        this.policeOffice = policeOffice;
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getFloatingName() {
        return floatingName;
    }

    public void setFloatingName(String floatingName) {
        this.floatingName = floatingName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPersonalEffects() {
        return personalEffects;
    }

    public void setPersonalEffects(String personalEffects) {
        this.personalEffects = personalEffects;
    }

    public String getPersonalFeature() {
        return personalFeature;
    }

    public void setPersonalFeature(String personalFeature) {
        this.personalFeature = personalFeature;
    }

    public Date getInflowTime() {
        return inflowTime;
    }

    public void setInflowTime(Date inflowTime) {
        this.inflowTime = inflowTime;
    }

    public Date getOutflowTime() {
        return outflowTime;
    }

    public void setOutflowTime(Date outflowTime) {
        this.outflowTime = outflowTime;
    }

    public String getFlowReason() {
        return flowReason;
    }

    public void setFlowReason(String flowReason) {
        this.flowReason = flowReason;
    }

    public String getOutflowTo() {
        return outflowTo;
    }

    public void setOutflowTo(String outflowTo) {
        this.outflowTo = outflowTo;
    }

    public String getPhotographs() {
        return photographs;
    }

    public void setPhotographs(String photographs) {
        this.photographs = photographs;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(String criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public String getActionTrack() {
        return actionTrack;
    }

    public void setActionTrack(String actionTrack) {
        this.actionTrack = actionTrack;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }

    public Integer getIfInput() {
        return ifInput;
    }

    public void setIfInput(Integer ifInput) {
        this.ifInput = ifInput;
    }

    public Integer getFloatingPopulationType() {
        return floatingPopulationType;
    }

    public void setFloatingPopulationType(Integer floatingPopulationType) {
        this.floatingPopulationType = floatingPopulationType;
    }

    public Integer getFlowWay() {
        return flowWay;
    }

    public void setFlowWay(Integer flowWay) {
        this.flowWay = flowWay;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
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

    @Override
    public String toString() {
        return "PersonFlow{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", qq='" + qq + '\'' +
                ", weixin='" + weixin + '\'' +
                ", email='" + email + '\'' +
                ", policeStation='" + policeStation + '\'' +
                ", policeOffice='" + policeOffice + '\'' +
                ", workStation='" + workStation + '\'' +
                ", floatingName='" + floatingName + '\'' +
                ", idNumber=" + idNumber +
                ", personalEffects='" + personalEffects + '\'' +
                ", personalFeature='" + personalFeature + '\'' +
                ", inflowTime=" + inflowTime +
                ", outflowTime=" + outflowTime +
                ", flowReason='" + flowReason + '\'' +
                ", outflowTo='" + outflowTo + '\'' +
                ", photographs='" + photographs + '\'' +
                ", registerAddress='" + registerAddress + '\'' +
                ", criminalRecord='" + criminalRecord + '\'' +
                ", actionTrack='" + actionTrack + '\'' +
                ", workCompany='" + workCompany + '\'' +
                ", ifInput=" + ifInput +
                ", floatingPopulationType=" + floatingPopulationType +
                ", flowWay=" + flowWay +
                ", inputTime=" + inputTime +
                ", operator=" + operator +
                ", userId=" + userId +
                ", policeId=" + policeId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}