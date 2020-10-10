package com.enjoylearning.mybatis.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_article_content
 */
public class EbArticleContent extends BaseEntity {
    /**
     * Database Column Remarks:
     *   文章id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_article_content.nid
     *
     * @mbg.generated
     */
    private Integer nid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_article_content.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * Database Column Remarks:
     *   文章内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_article_content.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_article_content.nid
     *
     * @return the value of eb_article_content.nid
     *
     * @mbg.generated
     */
    public Integer getNid() {
        return nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_article_content.nid
     *
     * @param nid the value for eb_article_content.nid
     *
     * @mbg.generated
     */
    public void setNid(Integer nid) {
        this.nid = nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_article_content.ctime
     *
     * @return the value of eb_article_content.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_article_content.ctime
     *
     * @param ctime the value for eb_article_content.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_article_content.content
     *
     * @return the value of eb_article_content.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_article_content.content
     *
     * @param content the value for eb_article_content.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }
}