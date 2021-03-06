package com.ehootu.census.model;

import java.util.Date;

/**
 * @Title:OutCensus
 * @Author: KongXiaoPing
 * @Date: 2018-01-05 15:10
 * @Description: 返回实体对象
 */
public class OutCensus {


    /**
     * 警察姓名
     */
    private String policeName;
    /**
     * 警号
     */
    private String policeNumber;


    /***户籍登记***/

    private String id;
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
     * 户籍类型 4 夫妻投靠 5 新生儿 6 户籍注销
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
     * 提交时间---返回给前端的 提交时间
     */
    private String inputTime;
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


    /**户籍附件表***/
    /**
     * 监护人书面申请,多张照片，用逗号隔开
     */
    private String guardianWrittenApplication;
    //返回给前端
    private String[] guardianWrittenApplicationArray;
    /**
     * 医学证明,多张照片，用逗号隔开
     */
    private String medicalProof;
    //返回给前端
    private String[] medicalProofArray;
    /**
     * 生育服务证明,多张照片，用逗号隔开
     */
    private String birthCertificate;
    //返回给前端
    private String[] birthCertificateArray;

    /**
     * 婴儿血型单,多张照片，用逗号隔开
     */
    private String babyBloodType;
    //返回给前端
    private String[] babyBloodTypeArray;
    /**
     * 父母双方的户口本,多张照片，用逗号隔开
     */
    private String parentsAccount;
    //返回给前端
    private String[] parentsAccountArray;
    /**
     * 父母双方结婚证,多张照片，用逗号隔开
     */
    private String parentsMarriageCertificate;
    //返回给前端
    private String[] parentsMarriageCertificateArray;
    /**
     * 被投靠人书面申请,多张照片，用逗号隔开
     */
    private String patronWrittenApplication;
    //返回给前端
    private String[] patronWrittenApplicationArray;
    /**
     * 结婚证,多张照片，用逗号隔开
     */
    private String marriedCertificate;
    //返回给前端
    private String[] marriedCertificateArray;
    /**
     * 双方（投靠人，被投靠人）户口原件或户籍证明,多张照片，用逗号隔开
     */
    private String borthCensusRegister;
    //返回给前端
    private String[] borthCensusRegisterArray;
    /**
     * 双方（投靠人，被投靠人）身份证复印件,多张照片，用逗号隔开
     */
    private String borthCard;
    //返回给前端
    private String[] borthCardArray;
    /**
     * 死亡证明,多张照片，用逗号隔开
     */
    private String deathCertificate;
    //返回给前端
    private String[] deathCertificateArray;
    /**
     * 户口本原件,多张照片，用逗号隔开
     */
    private String censusRegister;
    //返回给前端
    private String[] censusRegisterArray;

    /**
     * 本人书面申请
     */
    private String writtenApplication;
    //返回给前端
    private String[] writtenApplicationArray;
    /**
     * 房产证或购房合同
     */
    private String propertyOwnershipCertificateOrHousePurchasingContract;
    //返回给前端
    private String[] propertyOwnershipCertificateOrHousePurchasingContractArray;
    /**
     * 收入证明
     */
    private String proofOfIncome;
    //返回给前端
    private String[] proofOfIncomeArray;
    /**
     * 身份证复印件
     */
    private String identityCard;
    //返回给前端
    private String[] identityCardArray;
    /**
     * 居住证明
     */
    private String proofOfResidence;
    //返回给前端
    private String[] proofOfResidenceArray;
    /**
     * 备用字段2 户籍信息变更小于14岁的社区派出所证明附件
     */
    private String spareField2;
    //返回给前端
    private String[] spareField2Array;

    /****户籍审核表****/

    /**
     * 户籍登记表id
     */
    private String censusRegisterId;
    /**
     * 受理编号
     */
    private String acceptNumber;
    /**
     * 办理类型
     */
    private String approvalType;
    /**
     * 办理地点
     */
    private String approvalPlace;
    /**
     * 审核阶段(0户政大厅，1治安大队,2领导)
     */
    private Integer approvalStage;
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
     * 预约日期（保留字段，目前不用）
     */
    private Date appointmentDate;
    /**
     * 审核时间
     */
    private Date dateApprovalTime;
    /**
     * 审核时间---返回给前端的审核时间
     */
    private String approvalTime;
    /**
     * 流动人口表id
     */
    private String personFlowId;

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.idNumber = idNumber;
    }

    public String getCurrentCensusRegisterPlace() {
        return currentCensusRegisterPlace;
    }

    public void setCurrentCensusRegisterPlace(String currentCensusRegisterPlace) {
        this.currentCensusRegisterPlace = currentCensusRegisterPlace;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
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
        this.newbornName = newbornName;
    }

    public String getNewbornGender() {
        return newbornGender;
    }

    public void setNewbornGender(String newbornGender) {
        this.newbornGender = newbornGender;
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
        this.relation = relation;
    }

    public String getCancelledPersonName() {
        return cancelledPersonName;
    }

    public void setCancelledPersonName(String cancelledPersonName) {
        this.cancelledPersonName = cancelledPersonName;
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
        this.cancelledPersonIdNumber = cancelledPersonIdNumber;
    }

    public String getCancelledPersonCauseDeath() {
        return cancelledPersonCauseDeath;
    }

    public void setCancelledPersonCauseDeath(String cancelledPersonCauseDeath) {
        this.cancelledPersonCauseDeath = cancelledPersonCauseDeath;
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
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
        this.userId = userId;
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
        this.policeId = policeId;
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

    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(String administrativeDivision) {
        this.administrativeDivision = administrativeDivision;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getCensusRegisterId() {
        return censusRegisterId;
    }

    public void setCensusRegisterId(String censusRegisterId) {
        this.censusRegisterId = censusRegisterId;
    }

    public String getAcceptNumber() {
        return acceptNumber;
    }

    public void setAcceptNumber(String acceptNumber) {
        this.acceptNumber = acceptNumber;
    }

    public String getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType;
    }

    public String getApprovalPlace() {
        return approvalPlace;
    }

    public void setApprovalPlace(String approvalPlace) {
        this.approvalPlace = approvalPlace;
    }

    public Integer getApprovalStage() {
        return approvalStage;
    }

    public void setApprovalStage(Integer approvalStage) {
        this.approvalStage = approvalStage;
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

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }



    public String getPersonFlowId() {
        return personFlowId;
    }

    public void setPersonFlowId(String personFlowId) {
        this.personFlowId = personFlowId;
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

    public String getGuardianWrittenApplication() {
        return guardianWrittenApplication;
    }

    public void setGuardianWrittenApplication(String guardianWrittenApplication) {
        this.guardianWrittenApplication = guardianWrittenApplication;
    }

    public String getMedicalProof() {
        return medicalProof;
    }

    public void setMedicalProof(String medicalProof) {
        this.medicalProof = medicalProof;
    }

    public String getBirthCertificate() {
        return birthCertificate;
    }

    public void setBirthCertificate(String birthCertificate) {
        this.birthCertificate = birthCertificate;
    }

    public String getBabyBloodType() {
        return babyBloodType;
    }

    public void setBabyBloodType(String babyBloodType) {
        this.babyBloodType = babyBloodType;
    }

    public String getParentsAccount() {
        return parentsAccount;
    }

    public void setParentsAccount(String parentsAccount) {
        this.parentsAccount = parentsAccount;
    }

    public String getParentsMarriageCertificate() {
        return parentsMarriageCertificate;
    }

    public void setParentsMarriageCertificate(String parentsMarriageCertificate) {
        this.parentsMarriageCertificate = parentsMarriageCertificate;
    }

    public String getPatronWrittenApplication() {
        return patronWrittenApplication;
    }

    public void setPatronWrittenApplication(String patronWrittenApplication) {
        this.patronWrittenApplication = patronWrittenApplication;
    }

    public String getMarriedCertificate() {
        return marriedCertificate;
    }

    public void setMarriedCertificate(String marriedCertificate) {
        this.marriedCertificate = marriedCertificate;
    }

    public String getBorthCensusRegister() {
        return borthCensusRegister;
    }

    public void setBorthCensusRegister(String borthCensusRegister) {
        this.borthCensusRegister = borthCensusRegister;
    }

    public String getBorthCard() {
        return borthCard;
    }

    public void setBorthCard(String borthCard) {
        this.borthCard = borthCard;
    }

    public String getDeathCertificate() {
        return deathCertificate;
    }

    public void setDeathCertificate(String deathCertificate) {
        this.deathCertificate = deathCertificate;
    }

    public String getCensusRegister() {
        return censusRegister;
    }

    public String[] getGuardianWrittenApplicationArray() {
        return guardianWrittenApplicationArray;
    }

    public void setGuardianWrittenApplicationArray(String[] guardianWrittenApplicationArray) {
        this.guardianWrittenApplicationArray = guardianWrittenApplicationArray;
    }

    public String[] getMedicalProofArray() {
        return medicalProofArray;
    }

    public void setMedicalProofArray(String[] medicalProofArray) {
        this.medicalProofArray = medicalProofArray;
    }

    public String[] getBirthCertificateArray() {
        return birthCertificateArray;
    }

    public void setBirthCertificateArray(String[] birthCertificateArray) {
        this.birthCertificateArray = birthCertificateArray;
    }

    public String[] getBabyBloodTypeArray() {
        return babyBloodTypeArray;
    }

    public void setBabyBloodTypeArray(String[] babyBloodTypeArray) {
        this.babyBloodTypeArray = babyBloodTypeArray;
    }

    public String[] getParentsAccountArray() {
        return parentsAccountArray;
    }

    public void setParentsAccountArray(String[] parentsAccountArray) {
        this.parentsAccountArray = parentsAccountArray;
    }

    public String[] getParentsMarriageCertificateArray() {
        return parentsMarriageCertificateArray;
    }

    public void setParentsMarriageCertificateArray(String[] parentsMarriageCertificateArray) {
        this.parentsMarriageCertificateArray = parentsMarriageCertificateArray;
    }

    public String[] getPatronWrittenApplicationArray() {
        return patronWrittenApplicationArray;
    }

    public void setPatronWrittenApplicationArray(String[] patronWrittenApplicationArray) {
        this.patronWrittenApplicationArray = patronWrittenApplicationArray;
    }

    public String[] getMarriedCertificateArray() {
        return marriedCertificateArray;
    }

    public void setMarriedCertificateArray(String[] marriedCertificateArray) {
        this.marriedCertificateArray = marriedCertificateArray;
    }

    public String[] getBorthCensusRegisterArray() {
        return borthCensusRegisterArray;
    }

    public void setBorthCensusRegisterArray(String[] borthCensusRegisterArray) {
        this.borthCensusRegisterArray = borthCensusRegisterArray;
    }

    public String[] getBorthCardArray() {
        return borthCardArray;
    }

    public void setBorthCardArray(String[] borthCardArray) {
        this.borthCardArray = borthCardArray;
    }

    public String[] getDeathCertificateArray() {
        return deathCertificateArray;
    }

    public void setDeathCertificateArray(String[] deathCertificateArray) {
        this.deathCertificateArray = deathCertificateArray;
    }

    public String[] getCensusRegisterArray() {
        return censusRegisterArray;
    }

    public void setCensusRegisterArray(String[] censusRegisterArray) {
        this.censusRegisterArray = censusRegisterArray;
    }

    public void setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister;


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


    public String getUsedName() {
        return usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getApplicationForChange() {
        return applicationForChange;
    }

    public void setApplicationForChange(String applicationForChange) {
        this.applicationForChange = applicationForChange;
    }

    public String getWrittenApplication() {
        return writtenApplication;
    }

    public void setWrittenApplication(String writtenApplication) {
        this.writtenApplication = writtenApplication;
    }

    public String getPropertyOwnershipCertificateOrHousePurchasingContract() {
        return propertyOwnershipCertificateOrHousePurchasingContract;
    }

    public void setPropertyOwnershipCertificateOrHousePurchasingContract(String propertyOwnershipCertificateOrHousePurchasingContract) {
        this.propertyOwnershipCertificateOrHousePurchasingContract = propertyOwnershipCertificateOrHousePurchasingContract;
    }

    public String getProofOfIncome() {
        return proofOfIncome;
    }

    public void setProofOfIncome(String proofOfIncome) {
        this.proofOfIncome = proofOfIncome;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getProofOfResidence() {
        return proofOfResidence;
    }

    public void setProofOfResidence(String proofOfResidence) {
        this.proofOfResidence = proofOfResidence;
    }

    public String getSpareField2() {
        return spareField2;
    }

    public void setSpareField2(String spareField2) {
        this.spareField2 = spareField2;
    }

    public String[] getWrittenApplicationArray() {
        return writtenApplicationArray;
    }

    public void setWrittenApplicationArray(String[] writtenApplicationArray) {
        this.writtenApplicationArray = writtenApplicationArray;
    }

    public String[] getPropertyOwnershipCertificateOrHousePurchasingContractArray() {
        return propertyOwnershipCertificateOrHousePurchasingContractArray;
    }

    public void setPropertyOwnershipCertificateOrHousePurchasingContractArray(String[] propertyOwnershipCertificateOrHousePurchasingContractArray) {
        this.propertyOwnershipCertificateOrHousePurchasingContractArray = propertyOwnershipCertificateOrHousePurchasingContractArray;
    }

    public String[] getProofOfIncomeArray() {
        return proofOfIncomeArray;
    }

    public void setProofOfIncomeArray(String[] proofOfIncomeArray) {
        this.proofOfIncomeArray = proofOfIncomeArray;
    }

    public String[] getIdentityCardArray() {
        return identityCardArray;
    }

    public void setIdentityCardArray(String[] identityCardArray) {
        this.identityCardArray = identityCardArray;
    }

    public String[] getProofOfResidenceArray() {
        return proofOfResidenceArray;
    }

    public void setProofOfResidenceArray(String[] proofOfResidenceArray) {
        this.proofOfResidenceArray = proofOfResidenceArray;
    }

    public String[] getSpareField2Array() {
        return spareField2Array;
    }

    public void setSpareField2Array(String[] spareField2Array) {
        this.spareField2Array = spareField2Array;
    }
}