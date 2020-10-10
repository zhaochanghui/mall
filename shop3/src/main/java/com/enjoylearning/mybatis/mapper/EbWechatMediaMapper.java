package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.EbWechatMedia;
import java.util.List;

public interface EbWechatMediaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_wechat_media
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_wechat_media
     *
     * @mbg.generated
     */
    int insert(EbWechatMedia record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_wechat_media
     *
     * @mbg.generated
     */
    EbWechatMedia selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_wechat_media
     *
     * @mbg.generated
     */
    List<EbWechatMedia> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_wechat_media
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbWechatMedia record);
}