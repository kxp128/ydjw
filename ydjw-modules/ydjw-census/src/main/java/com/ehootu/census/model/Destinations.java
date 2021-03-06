package com.ehootu.census.model;

import java.math.BigDecimal;

public class Destinations {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.destination_id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private Integer destinationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.name
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.parent_id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.level
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private Byte level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.is_domestic
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private Byte isDomestic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.is_canton
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private Byte isCanton;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.is_hot
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private Byte isHot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.status
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.longitude
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private BigDecimal longitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.latitude
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private BigDecimal latitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.pinyin
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private String pinyin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.initials
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private String initials;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.is_show_filter
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private Byte isShowFilter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations.path
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column destinations._id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    private String id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.destination_id
     *
     * @return the value of destinations.destination_id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public Integer getDestinationId() {
        return destinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.destination_id
     *
     * @param destinationId the value for destinations.destination_id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.name
     *
     * @return the value of destinations.name
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.name
     *
     * @param name the value for destinations.name
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.parent_id
     *
     * @return the value of destinations.parent_id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.parent_id
     *
     * @param parentId the value for destinations.parent_id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.level
     *
     * @return the value of destinations.level
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.level
     *
     * @param level the value for destinations.level
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.is_domestic
     *
     * @return the value of destinations.is_domestic
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public Byte getIsDomestic() {
        return isDomestic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.is_domestic
     *
     * @param isDomestic the value for destinations.is_domestic
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setIsDomestic(Byte isDomestic) {
        this.isDomestic = isDomestic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.is_canton
     *
     * @return the value of destinations.is_canton
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public Byte getIsCanton() {
        return isCanton;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.is_canton
     *
     * @param isCanton the value for destinations.is_canton
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setIsCanton(Byte isCanton) {
        this.isCanton = isCanton;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.is_hot
     *
     * @return the value of destinations.is_hot
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public Byte getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.is_hot
     *
     * @param isHot the value for destinations.is_hot
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.status
     *
     * @return the value of destinations.status
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.status
     *
     * @param status the value for destinations.status
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.longitude
     *
     * @return the value of destinations.longitude
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.longitude
     *
     * @param longitude the value for destinations.longitude
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.latitude
     *
     * @return the value of destinations.latitude
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.latitude
     *
     * @param latitude the value for destinations.latitude
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.pinyin
     *
     * @return the value of destinations.pinyin
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.pinyin
     *
     * @param pinyin the value for destinations.pinyin
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.initials
     *
     * @return the value of destinations.initials
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public String getInitials() {
        return initials;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.initials
     *
     * @param initials the value for destinations.initials
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setInitials(String initials) {
        this.initials = initials == null ? null : initials.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.is_show_filter
     *
     * @return the value of destinations.is_show_filter
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public Byte getIsShowFilter() {
        return isShowFilter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.is_show_filter
     *
     * @param isShowFilter the value for destinations.is_show_filter
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setIsShowFilter(Byte isShowFilter) {
        this.isShowFilter = isShowFilter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations.path
     *
     * @return the value of destinations.path
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations.path
     *
     * @param path the value for destinations.path
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column destinations._id
     *
     * @return the value of destinations._id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column destinations._id
     *
     * @param id the value for destinations._id
     *
     * @mbg.generated Wed Jul 25 17:12:30 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}