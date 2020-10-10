package com.enjoylearning.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_wx_cash_order_info
 */
public class EbWxCashOrderInfo extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.wx_cash_order_info_id
     *
     * @mbg.generated
     */
    private Long wxCashOrderInfoId;

    /**
     * Database Column Remarks:
     *   提现订单id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.wx_cash_order_id
     *
     * @mbg.generated
     */
    private Long wxCashOrderId;

    /**
     * Database Column Remarks:
     *   提现金额明细
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.amount_info
     *
     * @mbg.generated
     */
    private BigDecimal amountInfo;

    /**
     * Database Column Remarks:
     *   2佣金 11按地区排名的奖金 12按推广金额数额的奖金 13分享抽奖活动的中奖金额 14年终奖活动的中奖金额 16余额微信提现 17平台奖励金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.cash_type
     *
     * @mbg.generated
     */
    private Integer cashType;

    /**
     * Database Column Remarks:
     *   关联订单ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.id_value
     *
     * @mbg.generated
     */
    private Long idValue;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   member_money_log表的id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.money_log_id
     *
     * @mbg.generated
     */
    private Long moneyLogId;

    /**
     * Database Column Remarks:
     *   可重复的money_log_id，拆分订单后会重复，用于统计运营费用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_wx_cash_order_info.repeat_money_log_id
     *
     * @mbg.generated
     */
    private Long repeatMoneyLogId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.wx_cash_order_info_id
     *
     * @return the value of eb_wx_cash_order_info.wx_cash_order_info_id
     *
     * @mbg.generated
     */
    public Long getWxCashOrderInfoId() {
        return wxCashOrderInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.wx_cash_order_info_id
     *
     * @param wxCashOrderInfoId the value for eb_wx_cash_order_info.wx_cash_order_info_id
     *
     * @mbg.generated
     */
    public void setWxCashOrderInfoId(Long wxCashOrderInfoId) {
        this.wxCashOrderInfoId = wxCashOrderInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.wx_cash_order_id
     *
     * @return the value of eb_wx_cash_order_info.wx_cash_order_id
     *
     * @mbg.generated
     */
    public Long getWxCashOrderId() {
        return wxCashOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.wx_cash_order_id
     *
     * @param wxCashOrderId the value for eb_wx_cash_order_info.wx_cash_order_id
     *
     * @mbg.generated
     */
    public void setWxCashOrderId(Long wxCashOrderId) {
        this.wxCashOrderId = wxCashOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.amount_info
     *
     * @return the value of eb_wx_cash_order_info.amount_info
     *
     * @mbg.generated
     */
    public BigDecimal getAmountInfo() {
        return amountInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.amount_info
     *
     * @param amountInfo the value for eb_wx_cash_order_info.amount_info
     *
     * @mbg.generated
     */
    public void setAmountInfo(BigDecimal amountInfo) {
        this.amountInfo = amountInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.cash_type
     *
     * @return the value of eb_wx_cash_order_info.cash_type
     *
     * @mbg.generated
     */
    public Integer getCashType() {
        return cashType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.cash_type
     *
     * @param cashType the value for eb_wx_cash_order_info.cash_type
     *
     * @mbg.generated
     */
    public void setCashType(Integer cashType) {
        this.cashType = cashType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.id_value
     *
     * @return the value of eb_wx_cash_order_info.id_value
     *
     * @mbg.generated
     */
    public Long getIdValue() {
        return idValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.id_value
     *
     * @param idValue the value for eb_wx_cash_order_info.id_value
     *
     * @mbg.generated
     */
    public void setIdValue(Long idValue) {
        this.idValue = idValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.remark
     *
     * @return the value of eb_wx_cash_order_info.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.remark
     *
     * @param remark the value for eb_wx_cash_order_info.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.create_time
     *
     * @return the value of eb_wx_cash_order_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.create_time
     *
     * @param createTime the value for eb_wx_cash_order_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.money_log_id
     *
     * @return the value of eb_wx_cash_order_info.money_log_id
     *
     * @mbg.generated
     */
    public Long getMoneyLogId() {
        return moneyLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.money_log_id
     *
     * @param moneyLogId the value for eb_wx_cash_order_info.money_log_id
     *
     * @mbg.generated
     */
    public void setMoneyLogId(Long moneyLogId) {
        this.moneyLogId = moneyLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_wx_cash_order_info.repeat_money_log_id
     *
     * @return the value of eb_wx_cash_order_info.repeat_money_log_id
     *
     * @mbg.generated
     */
    public Long getRepeatMoneyLogId() {
        return repeatMoneyLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_wx_cash_order_info.repeat_money_log_id
     *
     * @param repeatMoneyLogId the value for eb_wx_cash_order_info.repeat_money_log_id
     *
     * @mbg.generated
     */
    public void setRepeatMoneyLogId(Long repeatMoneyLogId) {
        this.repeatMoneyLogId = repeatMoneyLogId;
    }
}