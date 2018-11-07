package com.ehootu.notice.model;

import java.util.Date;

/**
 * @Author: zhangyong
 * @Date: 2017/10/12
 * @Description: 通知公告实体类
 */
public class Notice {
    /**
     *表ID
     */
    private String id;
    /**
     *标题
     */
    private String title;
    /**
     *创建人
     */
    private String creater;
    /**
     *推送时间
     */
    private Date publishTime;
    /**
     *创建时间
     */
    private Date createTime;

    /**
     *创建时间格式化
     */
    private String createDate;
    /**
     *修改时间
     */
    private Date updateTime;
    /**
     *部门ID
     */
    private String deptId;
    /**
     *删除标记
     */
    private Integer deleteFlag;
    /**
     *删除标记时间
     */
    private Date deleteFlagTime;
    /**
     *排序
     */
    private Integer num;
    /**
     *版本号
     */
    private Integer version;
    /**
     *通知内容
     */
    private String content;
    /**
     *通知公告关联警察
     */
    private NoticePolice noticePolice;

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public NoticePolice getNoticePolice() {
        return noticePolice;
    }

    public void setNoticePolice(NoticePolice noticePolice) {
        this.noticePolice = noticePolice;
    }

	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDeleteFlagTime() {
        return deleteFlagTime;
    }

    public void setDeleteFlagTime(Date deleteFlagTime) {
        this.deleteFlagTime = deleteFlagTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}