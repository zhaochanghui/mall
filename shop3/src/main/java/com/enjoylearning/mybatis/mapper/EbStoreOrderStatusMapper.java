package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbStoreOrderStatus;
import java.util.List;

public interface EbStoreOrderStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_order_status
     *
     * @mbg.generated
     */
    int insert(EbStoreOrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_order_status
     *
     * @mbg.generated
     */
    List<EbStoreOrderStatus> selectAll();
}