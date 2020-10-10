package com.enjoylearning.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_store_coupon_user
 */
public class EbStoreCouponUser extends BaseEntity {
    /**
     * Database Column Remarks:
     *   优惠券发放记录id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   兑换的项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.cid
     *
     * @mbg.generated
     */
    private Integer cid;

    /**
     * Database Column Remarks:
     *   优惠券所属用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     * Database Column Remarks:
     *   优惠券名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.coupon_title
     *
     * @mbg.generated
     */
    private String couponTitle;

    /**
     * Database Column Remarks:
     *   优惠券的面值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.coupon_price
     *
     * @mbg.generated
     */
    private BigDecimal couponPrice;

    /**
     * Database Column Remarks:
     *   最低消费多少金额可用优惠券
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.use_min_price
     *
     * @mbg.generated
     */
    private BigDecimal useMinPrice;

    /**
     * Database Column Remarks:
     *   优惠券创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.add_time
     *
     * @mbg.generated
     */
    private Integer addTime;

    /**
     * Database Column Remarks:
     *   优惠券结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.end_time
     *
     * @mbg.generated
     */
    private Integer endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.etime
     *
     * @mbg.generated
     */
    private Date etime;

    /**
     * Database Column Remarks:
     *   使用时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.use_time
     *
     * @mbg.generated
     */
    private Integer useTime;

    /**
     * Database Column Remarks:
     *   获取方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * Database Column Remarks:
     *   状态（0：未使用，1：已使用, 2:已过期）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * Database Column Remarks:
     *   是否有效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.is_fail
     *
     * @mbg.generated
     */
    private Boolean isFail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_coupon_user.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.id
     *
     * @return the value of eb_store_coupon_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.id
     *
     * @param id the value for eb_store_coupon_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.cid
     *
     * @return the value of eb_store_coupon_user.cid
     *
     * @mbg.generated
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.cid
     *
     * @param cid the value for eb_store_coupon_user.cid
     *
     * @mbg.generated
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.uid
     *
     * @return the value of eb_store_coupon_user.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.uid
     *
     * @param uid the value for eb_store_coupon_user.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.coupon_title
     *
     * @return the value of eb_store_coupon_user.coupon_title
     *
     * @mbg.generated
     */
    public String getCouponTitle() {
        return couponTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.coupon_title
     *
     * @param couponTitle the value for eb_store_coupon_user.coupon_title
     *
     * @mbg.generated
     */
    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.coupon_price
     *
     * @return the value of eb_store_coupon_user.coupon_price
     *
     * @mbg.generated
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.coupon_price
     *
     * @param couponPrice the value for eb_store_coupon_user.coupon_price
     *
     * @mbg.generated
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.use_min_price
     *
     * @return the value of eb_store_coupon_user.use_min_price
     *
     * @mbg.generated
     */
    public BigDecimal getUseMinPrice() {
        return useMinPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.use_min_price
     *
     * @param useMinPrice the value for eb_store_coupon_user.use_min_price
     *
     * @mbg.generated
     */
    public void setUseMinPrice(BigDecimal useMinPrice) {
        this.useMinPrice = useMinPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.add_time
     *
     * @return the value of eb_store_coupon_user.add_time
     *
     * @mbg.generated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.add_time
     *
     * @param addTime the value for eb_store_coupon_user.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.end_time
     *
     * @return the value of eb_store_coupon_user.end_time
     *
     * @mbg.generated
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.end_time
     *
     * @param endTime the value for eb_store_coupon_user.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.etime
     *
     * @return the value of eb_store_coupon_user.etime
     *
     * @mbg.generated
     */
    public Date getEtime() {
        return etime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.etime
     *
     * @param etime the value for eb_store_coupon_user.etime
     *
     * @mbg.generated
     */
    public void setEtime(Date etime) {
        this.etime = etime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.use_time
     *
     * @return the value of eb_store_coupon_user.use_time
     *
     * @mbg.generated
     */
    public Integer getUseTime() {
        return useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.use_time
     *
     * @param useTime the value for eb_store_coupon_user.use_time
     *
     * @mbg.generated
     */
    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.type
     *
     * @return the value of eb_store_coupon_user.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.type
     *
     * @param type the value for eb_store_coupon_user.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.status
     *
     * @return the value of eb_store_coupon_user.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.status
     *
     * @param status the value for eb_store_coupon_user.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.is_fail
     *
     * @return the value of eb_store_coupon_user.is_fail
     *
     * @mbg.generated
     */
    public Boolean getIsFail() {
        return isFail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.is_fail
     *
     * @param isFail the value for eb_store_coupon_user.is_fail
     *
     * @mbg.generated
     */
    public void setIsFail(Boolean isFail) {
        this.isFail = isFail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_coupon_user.ctime
     *
     * @return the value of eb_store_coupon_user.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_coupon_user.ctime
     *
     * @param ctime the value for eb_store_coupon_user.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}