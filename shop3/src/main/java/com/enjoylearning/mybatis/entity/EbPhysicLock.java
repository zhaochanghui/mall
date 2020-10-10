package com.enjoylearning.mybatis.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_physic_lock
 */
public class EbPhysicLock extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_physic_lock.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   执行的方法
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_physic_lock.key
     *
     * @mbg.generated
     */
    private String key;

    /**
     * Database Column Remarks:
     *    ready 可以启动  running 已经运行中
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_physic_lock.value
     *
     * @mbg.generated
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_physic_lock.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_physic_lock.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_physic_lock.id
     *
     * @return the value of eb_physic_lock.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_physic_lock.id
     *
     * @param id the value for eb_physic_lock.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_physic_lock.key
     *
     * @return the value of eb_physic_lock.key
     *
     * @mbg.generated
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_physic_lock.key
     *
     * @param key the value for eb_physic_lock.key
     *
     * @mbg.generated
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_physic_lock.value
     *
     * @return the value of eb_physic_lock.value
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_physic_lock.value
     *
     * @param value the value for eb_physic_lock.value
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_physic_lock.start_time
     *
     * @return the value of eb_physic_lock.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_physic_lock.start_time
     *
     * @param startTime the value for eb_physic_lock.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_physic_lock.end_time
     *
     * @return the value of eb_physic_lock.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_physic_lock.end_time
     *
     * @param endTime the value for eb_physic_lock.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}