package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbStoreCouponIssueUser;
import java.util.List;

public interface EbStoreCouponIssueUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_coupon_issue_user
     *
     * @mbg.generated
     */
    int insert(EbStoreCouponIssueUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_coupon_issue_user
     *
     * @mbg.generated
     */
    List<EbStoreCouponIssueUser> selectAll();
}