package com.ehootu.flow.model;

import java.util.Arrays;
import java.util.Date;

/**
 * @Title:OutPersonFlowApproval
 * @Author: KongXiaoPing
 * @Date: 2017-10-12 11:43
 * @Description: 流动人口审核输出对象
 */
public class OutPersonFlowApproval  {

    /**
     * 警察姓名
     */
    private String policeName;
    /**
     * 警号
     */
    private String policeNumber;



    /*****流动人口表******/
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
    private String[] photos;
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
     * 数据登记时间--对应数据库时间
     */
    private Date dateInputTime;
    /**
     * 返回给前端 的 数据登记时间
     */
    private String inputTime;
    /**
     * 数据登记人
     */
    private String operator;
    /**
     * 编号
     */
    private String number;


    /*****审核表******/
    /**
     * 受理编号
     */
    private String acceptNumber;
    /**
     * 审核状态(0未审核，1驳回,2审核通过)
     */
    private Integer approvalStatus;
    /**
     * 是否提交上级，0-否；1-是
     */
    private Integer ifSubmitSuperior;
    /**
     * 审核意见
     */
    private String approvalSuggestion;
    /**
     * 审核时间--对应数据库时间
     */
    private Date dateApprovalTime;
    /**
     * 返回给前端的 审核时间
     */
    private String approvalTime;


    /**
     * 警员id（操作人）
     */
    private String policeId;
    /**
     * 登录用户id（操作人）
     */
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public String getPoliceNumber() {
        return policeNumber;
    }

    public void setPoliceNumber(String policeNumber) {
        this.policeNumber = policeNumber;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
    }

    public String[] getPhotos() {
        return photos;
    }

    public void setPhotos(String[] photos) {
        this.photos = photos;
    }

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

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



    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAcceptNumber() {
        return acceptNumber;
    }

    public void setAcceptNumber(String acceptNumber) {
        this.acceptNumber = acceptNumber;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getIfSubmitSuperior() {
        return ifSubmitSuperior;
    }

    public void setIfSubmitSuperior(Integer ifSubmitSuperior) {
        this.ifSubmitSuperior = ifSubmitSuperior;
    }

    public String getApprovalSuggestion() {
        return approvalSuggestion;
    }

    public void setApprovalSuggestion(String approvalSuggestion) {
        this.approvalSuggestion = approvalSuggestion;
    }

    public Date getDateInputTime() {
        return dateInputTime;
    }

    public void setDateInputTime(Date dateInputTime) {
        this.dateInputTime = dateInputTime;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public Date getDateApprovalTime() {
        return dateApprovalTime;
    }

    public void setDateApprovalTime(Date dateApprovalTime) {
        this.dateApprovalTime = dateApprovalTime;
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    @Override
    public String toString() {
        return "OutPersonFlowApproval{" +
                "policeName='" + policeName + '\'' +
                ", policeNumber='" + policeNumber + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", qq='" + qq + '\'' +
                ", weixin='" + weixin + '\'' +
                ", email='" + email + '\'' +
                ", policeStation='" + policeStation + '\'' +
                ", policeOffice='" + policeOffice + '\'' +
                ", workStation='" + workStation + '\'' +
                ", floatingName='" + floatingName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", personalEffects='" + personalEffects + '\'' +
                ", personalFeature='" + personalFeature + '\'' +
                ", inflowTime=" + inflowTime +
                ", outflowTime=" + outflowTime +
                ", flowReason='" + flowReason + '\'' +
                ", outflowTo='" + outflowTo + '\'' +
                ", photographs='" + photographs + '\'' +
                ", photos=" + Arrays.toString(photos) +
                ", registerAddress='" + registerAddress + '\'' +
                ", criminalRecord='" + criminalRecord + '\'' +
                ", actionTrack='" + actionTrack + '\'' +
                ", workCompany='" + workCompany + '\'' +
                ", ifInput=" + ifInput +
                ", floatingPopulationType=" + floatingPopulationType +
                ", flowWay=" + flowWay +
                ", dateInputTime=" + dateInputTime +
                ", inputTime='" + inputTime + '\'' +
                ", operator='" + operator + '\'' +
                ", number='" + number + '\'' +
                ", acceptNumber='" + acceptNumber + '\'' +
                ", approvalStatus=" + approvalStatus +
                ", ifSubmitSuperior=" + ifSubmitSuperior +
                ", approvalSuggestion='" + approvalSuggestion + '\'' +
                ", dateApprovalTime=" + dateApprovalTime +
                ", approvalTime='" + approvalTime + '\'' +
                ", policeId=" + policeId +
                ", userId=" + userId +
                '}';
    }


    //    @Override
//    public int compareTo(OutPersonFlowApproval o) {
//
//        //如果是未审批。则按登记时间倒序排列
//        if (o.approvalStatus == 0){
//            System.out.println("o.dateInputTime--->" + o.dateInputTime);
//            return this.dateInputTime.compareTo(o.dateInputTime);
//
//            //已审批，按审批时间倒序排列
//        }else {
//            System.out.println("o.dateApprovalTime--->" + o.dateApprovalTime);
//            return this.dateApprovalTime.compareTo(o.dateApprovalTime);
//        }
//
//    }
}