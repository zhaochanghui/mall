package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbSystemUserTask;
import java.util.List;

public interface EbSystemUserTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_user_task
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_user_task
     *
     * @mbg.generated
     */
    int insert(EbSystemUserTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_user_task
     *
     * @mbg.generated
     */
    EbSystemUserTask selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_user_task
     *
     * @mbg.generated
     */
    List<EbSystemUserTask> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_user_task
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbSystemUserTask record);
}