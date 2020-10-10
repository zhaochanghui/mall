package com.enjoylearning.mybatis.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_wechat_news_category
 */
public class EbWechatNewsCategory extends BaseEntity {
    /**
     * Database Column Remarks:
     *   图文消息管理ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wechat_news_category.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   图文名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wechat_news_category.cate_name
     *
     * @mbg.generated
     */
    private String cateName;

    /**
     * Database Column Remarks:
     *   排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wechat_news_category.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     *   状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wechat_news_category.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * Database Column Remarks:
     *   文章id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wechat_news_category.new_id
     *
     * @mbg.generated
     */
    private String newId;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wechat_news_category.add_time
     *
     * @mbg.generated
     */
    private String addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wechat_news_category.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wechat_news_category.id
     *
     * @return the value of eb_wechat_news_category.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wechat_news_category.id
     *
     * @param id the value for eb_wechat_news_category.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wechat_news_category.cate_name
     *
     * @return the value of eb_wechat_news_category.cate_name
     *
     * @mbg.generated
     */
    public String getCateName() {
        return cateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wechat_news_category.cate_name
     *
     * @param cateName the value for eb_wechat_news_category.cate_name
     *
     * @mbg.generated
     */
    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wechat_news_category.sort
     *
     * @return the value of eb_wechat_news_category.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wechat_news_category.sort
     *
     * @param sort the value for eb_wechat_news_category.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wechat_news_category.status
     *
     * @return the value of eb_wechat_news_category.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wechat_news_category.status
     *
     * @param status the value for eb_wechat_news_category.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wechat_news_category.new_id
     *
     * @return the value of eb_wechat_news_category.new_id
     *
     * @mbg.generated
     */
    public String getNewId() {
        return newId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wechat_news_category.new_id
     *
     * @param newId the value for eb_wechat_news_category.new_id
     *
     * @mbg.generated
     */
    public void setNewId(String newId) {
        this.newId = newId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wechat_news_category.add_time
     *
     * @return the value of eb_wechat_news_category.add_time
     *
     * @mbg.generated
     */
    public String getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wechat_news_category.add_time
     *
     * @param addTime the value for eb_wechat_news_category.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wechat_news_category.ctime
     *
     * @return the value of eb_wechat_news_category.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wechat_news_category.ctime
     *
     * @param ctime the value for eb_wechat_news_category.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}