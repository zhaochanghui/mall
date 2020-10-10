package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbSystemAttachmentCategory;
import java.util.List;

public interface EbSystemAttachmentCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_attachment_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_attachment_category
     *
     * @mbg.generated
     */
    int insert(EbSystemAttachmentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_attachment_category
     *
     * @mbg.generated
     */
    EbSystemAttachmentCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_attachment_category
     *
     * @mbg.generated
     */
    List<EbSystemAttachmentCategory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_attachment_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbSystemAttachmentCategory record);
}