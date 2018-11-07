package com.ehootu.rural.model;

import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.park.model.PublicInformationEntity;

import java.io.Serializable;
import java.util.Date;


/**
 * 城乡警务：村社消防安全检查记录
 * 
 * @author Liaoxb
 * @date 2017/11/30
 */
public class SecurityCheckEntity implements Serializable {


	private static final long serialVersionUID = 940765915226435565L;
	/**
	 * id
	 */
	private String id;
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
	private String policeLocations;
    /**
	 * 检查场所
	 */
	private String inspectionSite;
    /**
	 * 检查时间
	 */
	private Date inspectionTime;
    /**
	 * 检查地点
	 */
	private String inspectionPlace;
    /**
	 * 检查人员姓名
	 */
	private String inspectors;
    /**
	 * 检查情况
	 */
	private String inspectionStatus;
    /**
	 * 整改发放
	 */
	private String rectificationAndDistribution;
    /**
	 * 排除隐患
	 */
	private String eliminateHiddenDangers;
    /**
	 * 协助火灾事故调查
	 */
	private String assistInvestigatate;
    /**
	 * 消防宣传教育
	 */
	private String publicityEducation;
    /**
	 * 案件办理
	 */
	private String caseHandling;
    /**
	 * 是否录入消防系统
	 */
	private String whetherToEnter;
    /**
	 * 四巡平台(第三方链接)
	 */
	private String fourPatrolPlatform;
    /**
	 * 闪存平台(第三方链接)
	 */
	private String flashMemoryPlatform;
    /**
	 * 工作照片
	 */
	private String workingPicture;
    /**
	 * 登记人员（警察）id
	 */
	private String policeId;
    /**
	 * 添加时间
	 */
	private Date createTime;
    /**
	 * 检察人员（警员）id，多个用，拼接
	 */
	private String checkPoliceId;
    /**
	 * 企业地址公共表id
	 */
	private String publicId;
    /**
	 * 任务id
	 */
	private String taskId;

	/************ 页面展示字段 ****************/
	/**
	 * 检查场所
	 */
	private String inspectionSiteName;
	private SysDictionary sysDictionary;
	private PublicInformationEntity publicInformation;

	public String getInspectionSiteName() {
		return inspectionSiteName;
	}

	public void setInspectionSiteName(String inspectionSiteName) {
		this.inspectionSiteName = inspectionSiteName;
	}

	public SysDictionary getSysDictionary() {
		return sysDictionary;
	}

	public void setSysDictionary(SysDictionary sysDictionary) {
		this.sysDictionary = sysDictionary;
	}

	public PublicInformationEntity getPublicInformation() {
		return publicInformation;
	}

	public void setPublicInformation(PublicInformationEntity publicInformation) {
		this.publicInformation = publicInformation;
	}

	/**
	 * 设置：id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：所属派出所
	 */
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	/**
	 * 获取：所属派出所
	 */
	public String getPoliceStation() {
		return policeStation;
	}
	/**
	 * 设置：所属警务室
	 */
	public void setPoliceOffice(String policeOffice) {
		this.policeOffice = policeOffice;
	}
	/**
	 * 获取：所属警务室
	 */
	public String getPoliceOffice() {
		return policeOffice;
	}
	/**
	 * 设置：所属工作站
	 */
	public void setPoliceLocations(String policeLocations) {
		this.policeLocations = policeLocations;
	}
	/**
	 * 获取：所属工作站
	 */
	public String getPoliceLocations() {
		return policeLocations;
	}
	/**
	 * 设置：检查场所
	 */
	public void setInspectionSite(String inspectionSite) {
		this.inspectionSite = inspectionSite;
	}
	/**
	 * 获取：检查场所
	 */
	public String getInspectionSite() {
		return inspectionSite;
	}
	/**
	 * 设置：检查时间
	 */
	public void setInspectionTime(Date inspectionTime) {
		this.inspectionTime = inspectionTime;
	}
	/**
	 * 获取：检查时间
	 */
	public Date getInspectionTime() {
		return inspectionTime;
	}
	/**
	 * 设置：检查地点
	 */
	public void setInspectionPlace(String inspectionPlace) {
		this.inspectionPlace = inspectionPlace;
	}
	/**
	 * 获取：检查地点
	 */
	public String getInspectionPlace() {
		return inspectionPlace;
	}
	/**
	 * 设置：检查人员
	 */
	public void setInspectors(String inspectors) {
		this.inspectors = inspectors;
	}
	/**
	 * 获取：检查人员
	 */
	public String getInspectors() {
		return inspectors;
	}
	/**
	 * 设置：检查情况
	 */
	public void setInspectionStatus(String inspectionStatus) {
		this.inspectionStatus = inspectionStatus;
	}
	/**
	 * 获取：检查情况
	 */
	public String getInspectionStatus() {
		return inspectionStatus;
	}
	/**
	 * 设置：整改发放
	 */
	public void setRectificationAndDistribution(String rectificationAndDistribution) {
		this.rectificationAndDistribution = rectificationAndDistribution;
	}
	/**
	 * 获取：整改发放
	 */
	public String getRectificationAndDistribution() {
		return rectificationAndDistribution;
	}
	/**
	 * 设置：排除隐患
	 */
	public void setEliminateHiddenDangers(String eliminateHiddenDangers) {
		this.eliminateHiddenDangers = eliminateHiddenDangers;
	}
	/**
	 * 获取：排除隐患
	 */
	public String getEliminateHiddenDangers() {
		return eliminateHiddenDangers;
	}
	/**
	 * 设置：协助火灾事故调查
	 */
	public void setAssistInvestigatate(String assistInvestigatate) {
		this.assistInvestigatate = assistInvestigatate;
	}
	/**
	 * 获取：协助火灾事故调查
	 */
	public String getAssistInvestigatate() {
		return assistInvestigatate;
	}
	/**
	 * 设置：消防宣传教育
	 */
	public void setPublicityEducation(String publicityEducation) {
		this.publicityEducation = publicityEducation;
	}
	/**
	 * 获取：消防宣传教育
	 */
	public String getPublicityEducation() {
		return publicityEducation;
	}
	/**
	 * 设置：案件办理
	 */
	public void setCaseHandling(String caseHandling) {
		this.caseHandling = caseHandling;
	}
	/**
	 * 获取：案件办理
	 */
	public String getCaseHandling() {
		return caseHandling;
	}
	/**
	 * 设置：是否录入消防系统
	 */
	public void setWhetherToEnter(String whetherToEnter) {
		this.whetherToEnter = whetherToEnter;
	}
	/**
	 * 获取：是否录入消防系统
	 */
	public String getWhetherToEnter() {
		return whetherToEnter;
	}
	/**
	 * 设置：四巡平台(第三方链接)
	 */
	public void setFourPatrolPlatform(String fourPatrolPlatform) {
		this.fourPatrolPlatform = fourPatrolPlatform;
	}
	/**
	 * 获取：四巡平台(第三方链接)
	 */
	public String getFourPatrolPlatform() {
		return fourPatrolPlatform;
	}
	/**
	 * 设置：闪存平台(第三方链接)
	 */
	public void setFlashMemoryPlatform(String flashMemoryPlatform) {
		this.flashMemoryPlatform = flashMemoryPlatform;
	}
	/**
	 * 获取：闪存平台(第三方链接)
	 */
	public String getFlashMemoryPlatform() {
		return flashMemoryPlatform;
	}
	/**
	 * 设置：工作照片
	 */
	public void setWorkingPicture(String workingPicture) {
		this.workingPicture = workingPicture;
	}
	/**
	 * 获取：工作照片
	 */
	public String getWorkingPicture() {
		return workingPicture;
	}
	/**
	 * 设置：登记人员（警察）id
	 */
	public void setPoliceId(String policeId) {
		this.policeId = policeId;
	}
	/**
	 * 获取：登记人员（警察）id
	 */
	public String getPoliceId() {
		return policeId;
	}
	/**
	 * 设置：添加时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：添加时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：检察人员（警员）id，多个用，拼接
	 */
	public void setCheckPoliceId(String checkPoliceId) {
		this.checkPoliceId = checkPoliceId;
	}
	/**
	 * 获取：检察人员（警员）id，多个用，拼接
	 */
	public String getCheckPoliceId() {
		return checkPoliceId;
	}
	/**
	 * 设置：企业地址公共表id
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	/**
	 * 获取：企业地址公共表id
	 */
	public String getPublicId() {
		return publicId;
	}
	/**
	 * 设置：任务id
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	/**
	 * 获取：任务id
	 */
	public String getTaskId() {
		return taskId;
	}
}
