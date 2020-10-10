package com.enjoylearning.mybatis.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_store_product_relation
 */
public class EbStoreProductRelation extends BaseEntity {
    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_product_relation.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     * Database Column Remarks:
     *   商品ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_product_relation.product_id
     *
     * @mbg.generated
     */
    private Integer productId;

    /**
     * Database Column Remarks:
     *   类型(收藏(collect）、点赞(like))
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_product_relation.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * Database Column Remarks:
     *   某种类型的商品(普通商品、秒杀商品)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_product_relation.category
     *
     * @mbg.generated
     */
    private String category;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_product_relation.add_time
     *
     * @mbg.generated
     */
    private Integer addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_store_product_relation.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_product_relation.uid
     *
     * @return the value of eb_store_product_relation.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_product_relation.uid
     *
     * @param uid the value for eb_store_product_relation.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_product_relation.product_id
     *
     * @return the value of eb_store_product_relation.product_id
     *
     * @mbg.generated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_product_relation.product_id
     *
     * @param productId the value for eb_store_product_relation.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_product_relation.type
     *
     * @return the value of eb_store_product_relation.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_product_relation.type
     *
     * @param type the value for eb_store_product_relation.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_product_relation.category
     *
     * @return the value of eb_store_product_relation.category
     *
     * @mbg.generated
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_product_relation.category
     *
     * @param category the value for eb_store_product_relation.category
     *
     * @mbg.generated
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_product_relation.add_time
     *
     * @return the value of eb_store_product_relation.add_time
     *
     * @mbg.generated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_product_relation.add_time
     *
     * @param addTime the value for eb_store_product_relation.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_store_product_relation.ctime
     *
     * @return the value of eb_store_product_relation.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_store_product_relation.ctime
     *
     * @param ctime the value for eb_store_product_relation.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}