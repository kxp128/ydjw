package com.ehootu.census.model;

import java.util.Date;
/**
 * @Author: KongXiaoPing
 * @Date: 2017/12/28 10:27
 * @Description: 户籍登记表
 */
public class CensusRegister {
    private String id;

    /**
     * 曾用名
     */
    private String usedName;


    /**
     * 家庭住址
     */
    private String homeAddress;
    /**
     * 民族
     */
    private String nationality;

    /**
     * 教育程度
     */
    private String education;

    /**
     * 申请变更内容
     */
    private String applicationForChange;


    /**
     * 同步标记：0 未同步，1 已同步
     */
    private Integer isSync;
    /**
     * 微信外网同步标记：0 未同步，1 已同步
     */
    private Integer syncSign;


    /**
     * 姓名
     */
    private String name;
    /**
     * 出生日期
     */
    private Date birthDate;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 现在户口所在地
     */
    private String currentCensusRegisterPlace;
    /**
     * 性别（0 女 1男）
     */
    private String gender;
    /**
     * 配偶姓名
     */
    private String spouseName;
    /**
     * 结婚时间
     */
    private Date marriedTime;
    /**
     * 新生儿姓名
     */
    private String newbornName;
    /**
     * 新生儿性别（0 女 1男）
     */
    private String newbornGender;
    /**
     * 新生儿出生时间
     */
    private Date newbornBirthDate;
    /**
     * 与死亡人员关系
     */
    private String relation;
    /**
     * 注销人姓名
     */
    private String cancelledPersonName;
    /**
     * 注销人出生时间
     */
    private Date cancelledPersonBirthDate;
    /**
     * 注销人身份证号
     */
    private String cancelledPersonIdNumber;
    /**
     * 注销人死亡原因
     */
    private String cancelledPersonCauseDeath;
    /**
     * 附件表关联id
     */
    private String attachmentId;
    /**
     * 户籍类型 4 夫妻投靠 5 新生儿 6 户籍注销 7 购房迁户 8 户籍信息变更
     */
    private Integer currentCensusType;
    /**
     * 状态：0-迁入入户;1-迁出2-迁移3-注销
     */
    private Integer currentCensusStatus;
    /**
     * 登录用户（操作人）
     */
    private String userId;
    /**
     * 提交时间
     */
    private Date submitTime;
    /**
     * 警员id
     */
    private String policeId;
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
     * 所属行政区划
     */
    private String administrativeDivision;
    /**
     * 操作来源（1 微信端 2 户政大厅 保留字段，目前不用）
     */
    private String operationType;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 删除标志：0、未删除，1、已删除
     */
    private Integer deleteFlag;

    public CensusRegister() {
    }

    public CensusRegister(InputCensus inputCensus) {
        this.name = inputCensus.getName();
        this.birthDate = inputCensus.getBirthDate();
        this.idNumber = inputCensus.getIdNumber();
        this.currentCensusRegisterPlace = inputCensus.getCurrentCensusRegisterPlace();
        this.gender = inputCensus.getGender();
        this.spouseName = inputCensus.getSpouseName();
        this.marriedTime = inputCensus.getMarriedTime();
        this.newbornName = inputCensus.getNewbornName();
        this.newbornGender = inputCensus.getNewbornGender();
        this.relation = inputCensus.getRelation();
        this.cancelledPersonName = inputCensus.getCancelledPersonName();
        this.cancelledPersonBirthDate = inputCensus.getCancelledPersonBirthDate();
        this.cancelledPersonIdNumber = inputCensus.getCancelledPersonIdNumber();
        this.cancelledPersonCauseDeath = inputCensus.getCancelledPersonCauseDeath();



        this.newbornBirthDate = inputCensus.getNewbornBirthDate();
        this.attachmentId = inputCensus.getAttachmentId();
        this.currentCensusType = inputCensus.getCurrentCensusType();
        this.currentCensusStatus = inputCensus.getCurrentCensusStatus();
        this.userId = inputCensus.getUserId();
        this.submitTime = inputCensus.getSubmitTime();
        this.policeId = inputCensus.getPoliceId();
        this.policeStation = inputCensus.getPoliceStation();
        this.policeOffice = inputCensus.getPoliceOffice();
        this.workStation = inputCensus.getWorkStation();
        this.administrativeDivision = inputCensus.getAdministrativeDivision();
        this.operationType = inputCensus.getOperationType();



        this.usedName = inputCensus.getUsedName();
        this.homeAddress = inputCensus.getHomeAddress();
        this.nationality = inputCensus.getNationality();
        this.education = inputCensus.getEducation();
        this.applicationForChange = inputCensus.getApplicationForChange();


    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsedName() {
        return usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName == null ? null : usedName.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getCurrentCensusRegisterPlace() {
        return currentCensusRegisterPlace;
    }

    public void setCurrentCensusRegisterPlace(String currentCensusRegisterPlace) {
        this.currentCensusRegisterPlace = currentCensusRegisterPlace == null ? null : currentCensusRegisterPlace.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Date getMarriedTime() {
        return marriedTime;
    }

    public void setMarriedTime(Date marriedTime) {
        this.marriedTime = marriedTime;
    }

    public String getNewbornName() {
        return newbornName;
    }

    public void setNewbornName(String newbornName) {
        this.newbornName = newbornName == null ? null : newbornName.trim();
    }

    public String getNewbornGender() {
        return newbornGender;
    }

    public void setNewbornGender(String newbornGender) {
        this.newbornGender = newbornGender == null ? null : newbornGender.trim();
    }

    public Date getNewbornBirthDate() {
        return newbornBirthDate;
    }

    public void setNewbornBirthDate(Date newbornBirthDate) {
        this.newbornBirthDate = newbornBirthDate;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getCancelledPersonName() {
        return cancelledPersonName;
    }

    public void setCancelledPersonName(String cancelledPersonName) {
        this.cancelledPersonName = cancelledPersonName == null ? null : cancelledPersonName.trim();
    }

    public Date getCancelledPersonBirthDate() {
        return cancelledPersonBirthDate;
    }

    public void setCancelledPersonBirthDate(Date cancelledPersonBirthDate) {
        this.cancelledPersonBirthDate = cancelledPersonBirthDate;
    }

    public String getCancelledPersonIdNumber() {
        return cancelledPersonIdNumber;
    }

    public void setCancelledPersonIdNumber(String cancelledPersonIdNumber) {
        this.cancelledPersonIdNumber = cancelledPersonIdNumber == null ? null : cancelledPersonIdNumber.trim();
    }

    public String getCancelledPersonCauseDeath() {
        return cancelledPersonCauseDeath;
    }

    public void setCancelledPersonCauseDeath(String cancelledPersonCauseDeath) {
        this.cancelledPersonCauseDeath = cancelledPersonCauseDeath == null ? null : cancelledPersonCauseDeath.trim();
    }

    public String getApplicationForChange() {
        return applicationForChange;
    }

    public void setApplicationForChange(String applicationForChange) {
        this.applicationForChange = applicationForChange == null ? null : applicationForChange.trim();
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId == null ? null : attachmentId.trim();
    }

    public Integer getCurrentCensusType() {
        return currentCensusType;
    }

    public void setCurrentCensusType(Integer currentCensusType) {
        this.currentCensusType = currentCensusType;
    }

    public Integer getCurrentCensusStatus() {
        return currentCensusStatus;
    }

    public void setCurrentCensusStatus(Integer currentCensusStatus) {
        this.currentCensusStatus = currentCensusStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId == null ? null : policeId.trim();
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

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation == null ? null : workStation.trim();
    }

    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(String administrativeDivision) {
        this.administrativeDivision = administrativeDivision == null ? null : administrativeDivision.trim();
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
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

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public Integer getSyncSign() {
        return syncSign;
    }

    public void setSyncSign(Integer syncSign) {
        this.syncSign = syncSign;
    }
}