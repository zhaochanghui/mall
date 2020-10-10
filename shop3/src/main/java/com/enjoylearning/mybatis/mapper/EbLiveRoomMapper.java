package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbLiveRoom;
import java.util.List;

public interface EbLiveRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_live_room
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_live_room
     *
     * @mbg.generated
     */
    int insert(EbLiveRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_live_room
     *
     * @mbg.generated
     */
    EbLiveRoom selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_live_room
     *
     * @mbg.generated
     */
    List<EbLiveRoom> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_live_room
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbLiveRoom record);
}