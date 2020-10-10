package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbBillSummary;
import java.util.List;

public interface EbBillSummaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_bill_summary
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer settleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_bill_summary
     *
     * @mbg.generated
     */
    int insert(EbBillSummary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_bill_summary
     *
     * @mbg.generated
     */
    EbBillSummary selectByPrimaryKey(Integer settleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_bill_summary
     *
     * @mbg.generated
     */
    List<EbBillSummary> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_bill_summary
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbBillSummary record);
}