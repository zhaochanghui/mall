package com.enjoylearning.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_store_bargain_user_help
 */
public class EbStoreBargainUserHelp extends BaseEntity {
    /**
     * Database Column Remarks:
     *   砍价用户帮助表ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_bargain_user_help.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   帮助的用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_bargain_user_help.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     * Database Column Remarks:
     *   砍价产品ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_bargain_user_help.bargain_id
     *
     * @mbg.generated
     */
    private Integer bargainId;

    /**
     * Database Column Remarks:
     *   用户参与砍价表id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_bargain_user_help.bargain_user_id
     *
     * @mbg.generated
     */
    private Integer bargainUserId;

    /**
     * Database Column Remarks:
     *   帮助砍价多少金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_bargain_user_help.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_bargain_user_help.add_time
     *
     * @mbg.generated
     */
    private Integer addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_bargain_user_help.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_bargain_user_help.id
     *
     * @return the value of eb_store_bargain_user_help.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_bargain_user_help.id
     *
     * @param id the value for eb_store_bargain_user_help.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_bargain_user_help.uid
     *
     * @return the value of eb_store_bargain_user_help.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_bargain_user_help.uid
     *
     * @param uid the value for eb_store_bargain_user_help.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_bargain_user_help.bargain_id
     *
     * @return the value of eb_store_bargain_user_help.bargain_id
     *
     * @mbg.generated
     */
    public Integer getBargainId() {
        return bargainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_bargain_user_help.bargain_id
     *
     * @param bargainId the value for eb_store_bargain_user_help.bargain_id
     *
     * @mbg.generated
     */
    public void setBargainId(Integer bargainId) {
        this.bargainId = bargainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_bargain_user_help.bargain_user_id
     *
     * @return the value of eb_store_bargain_user_help.bargain_user_id
     *
     * @mbg.generated
     */
    public Integer getBargainUserId() {
        return bargainUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_bargain_user_help.bargain_user_id
     *
     * @param bargainUserId the value for eb_store_bargain_user_help.bargain_user_id
     *
     * @mbg.generated
     */
    public void setBargainUserId(Integer bargainUserId) {
        this.bargainUserId = bargainUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_bargain_user_help.price
     *
     * @return the value of eb_store_bargain_user_help.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_bargain_user_help.price
     *
     * @param price the value for eb_store_bargain_user_help.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_bargain_user_help.add_time
     *
     * @return the value of eb_store_bargain_user_help.add_time
     *
     * @mbg.generated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_bargain_user_help.add_time
     *
     * @param addTime the value for eb_store_bargain_user_help.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_bargain_user_help.ctime
     *
     * @return the value of eb_store_bargain_user_help.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_bargain_user_help.ctime
     *
     * @param ctime the value for eb_store_bargain_user_help.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}