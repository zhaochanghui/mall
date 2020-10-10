package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbStoreVisit;
import java.util.List;

public interface EbStoreVisitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_visit
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_visit
     *
     * @mbg.generated
     */
    int insert(EbStoreVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_visit
     *
     * @mbg.generated
     */
    EbStoreVisit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_visit
     *
     * @mbg.generated
     */
    List<EbStoreVisit> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_store_visit
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbStoreVisit record);
}