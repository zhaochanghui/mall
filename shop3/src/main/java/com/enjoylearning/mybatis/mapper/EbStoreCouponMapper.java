package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbStoreCoupon;
import java.util.List;

public interface EbStoreCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_coupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_coupon
     *
     * @mbg.generated
     */
    int insert(EbStoreCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_coupon
     *
     * @mbg.generated
     */
    EbStoreCoupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_coupon
     *
     * @mbg.generated
     */
    List<EbStoreCoupon> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbStoreCoupon record);
}