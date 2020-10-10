package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbSystemNotice;
import java.util.List;

public interface EbSystemNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_notice
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_notice
     *
     * @mbg.generated
     */
    int insert(EbSystemNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_notice
     *
     * @mbg.generated
     */
    EbSystemNotice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_notice
     *
     * @mbg.generated
     */
    List<EbSystemNotice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_notice
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbSystemNotice record);
}