package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbSystemFile;
import java.util.List;

public interface EbSystemFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_file
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_file
     *
     * @mbg.generated
     */
    int insert(EbSystemFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_file
     *
     * @mbg.generated
     */
    EbSystemFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_file
     *
     * @mbg.generated
     */
    List<EbSystemFile> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbSystemFile record);
}