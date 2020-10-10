package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbStoreProductReply;
import java.util.List;

public interface EbStoreProductReplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_product_reply
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_product_reply
     *
     * @mbg.generated
     */
    int insert(EbStoreProductReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_product_reply
     *
     * @mbg.generated
     */
    EbStoreProductReply selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_product_reply
     *
     * @mbg.generated
     */
    List<EbStoreProductReply> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_product_reply
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbStoreProductReply record);
}