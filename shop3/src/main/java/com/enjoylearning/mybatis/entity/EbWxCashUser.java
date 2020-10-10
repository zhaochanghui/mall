package com.enjoylearning.mybatis.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_wx_cash_user
 */
public class EbWxCashUser extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.wx_cash_user_id
     *
     * @mbg.generated
     */
    private Long wxCashUserId;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.member_id
     *
     * @mbg.generated
     */
    private Long memberId;

    /**
     * Database Column Remarks:
     *   绑定类型：0 绑定APP，1 绑定小程序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.unionid
     *
     * @mbg.generated
     */
    private String unionid;

    /**
     * Database Column Remarks:
     *   微信昵称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * Database Column Remarks:
     *   状态：0未绑定，1已绑定，2已解绑，3需要重新绑定
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.user_state
     *
     * @mbg.generated
     */
    private Integer userState;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_user.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.wx_cash_user_id
     *
     * @return the value of eb_wx_cash_user.wx_cash_user_id
     *
     * @mbg.generated
     */
    public Long getWxCashUserId() {
        return wxCashUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.wx_cash_user_id
     *
     * @param wxCashUserId the value for eb_wx_cash_user.wx_cash_user_id
     *
     * @mbg.generated
     */
    public void setWxCashUserId(Long wxCashUserId) {
        this.wxCashUserId = wxCashUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.member_id
     *
     * @return the value of eb_wx_cash_user.member_id
     *
     * @mbg.generated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.member_id
     *
     * @param memberId the value for eb_wx_cash_user.member_id
     *
     * @mbg.generated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.type
     *
     * @return the value of eb_wx_cash_user.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.type
     *
     * @param type the value for eb_wx_cash_user.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.openid
     *
     * @return the value of eb_wx_cash_user.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.openid
     *
     * @param openid the value for eb_wx_cash_user.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.unionid
     *
     * @return the value of eb_wx_cash_user.unionid
     *
     * @mbg.generated
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.unionid
     *
     * @param unionid the value for eb_wx_cash_user.unionid
     *
     * @mbg.generated
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.nickname
     *
     * @return the value of eb_wx_cash_user.nickname
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.nickname
     *
     * @param nickname the value for eb_wx_cash_user.nickname
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.user_state
     *
     * @return the value of eb_wx_cash_user.user_state
     *
     * @mbg.generated
     */
    public Integer getUserState() {
        return userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.user_state
     *
     * @param userState the value for eb_wx_cash_user.user_state
     *
     * @mbg.generated
     */
    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.create_time
     *
     * @return the value of eb_wx_cash_user.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.create_time
     *
     * @param createTime the value for eb_wx_cash_user.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_user.update_time
     *
     * @return the value of eb_wx_cash_user.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_user.update_time
     *
     * @param updateTime the value for eb_wx_cash_user.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}