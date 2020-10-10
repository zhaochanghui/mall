package com.enjoylearning.mybatis.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_system_notice_admin
 */
public class EbSystemNoticeAdmin extends BaseEntity {
    /**
     * Database Column Remarks:
     *   通知记录ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   通知类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.notice_type
     *
     * @mbg.generated
     */
    private String noticeType;

    /**
     * Database Column Remarks:
     *   通知的管理员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.admin_id
     *
     * @mbg.generated
     */
    private Short adminId;

    /**
     * Database Column Remarks:
     *   关联ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.link_id
     *
     * @mbg.generated
     */
    private Integer linkId;

    /**
     * Database Column Remarks:
     *   点击次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.is_click
     *
     * @mbg.generated
     */
    private Byte isClick;

    /**
     * Database Column Remarks:
     *   访问次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.is_visit
     *
     * @mbg.generated
     */
    private Byte isVisit;

    /**
     * Database Column Remarks:
     *   访问时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.visit_time
     *
     * @mbg.generated
     */
    private Integer visitTime;

    /**
     * Database Column Remarks:
     *   通知时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.add_time
     *
     * @mbg.generated
     */
    private Integer addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * Database Column Remarks:
     *   通知的数据
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_notice_admin.table_data
     *
     * @mbg.generated
     */
    private String tableData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.id
     *
     * @return the value of eb_system_notice_admin.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.id
     *
     * @param id the value for eb_system_notice_admin.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.notice_type
     *
     * @return the value of eb_system_notice_admin.notice_type
     *
     * @mbg.generated
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.notice_type
     *
     * @param noticeType the value for eb_system_notice_admin.notice_type
     *
     * @mbg.generated
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.admin_id
     *
     * @return the value of eb_system_notice_admin.admin_id
     *
     * @mbg.generated
     */
    public Short getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.admin_id
     *
     * @param adminId the value for eb_system_notice_admin.admin_id
     *
     * @mbg.generated
     */
    public void setAdminId(Short adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.link_id
     *
     * @return the value of eb_system_notice_admin.link_id
     *
     * @mbg.generated
     */
    public Integer getLinkId() {
        return linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.link_id
     *
     * @param linkId the value for eb_system_notice_admin.link_id
     *
     * @mbg.generated
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.is_click
     *
     * @return the value of eb_system_notice_admin.is_click
     *
     * @mbg.generated
     */
    public Byte getIsClick() {
        return isClick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.is_click
     *
     * @param isClick the value for eb_system_notice_admin.is_click
     *
     * @mbg.generated
     */
    public void setIsClick(Byte isClick) {
        this.isClick = isClick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.is_visit
     *
     * @return the value of eb_system_notice_admin.is_visit
     *
     * @mbg.generated
     */
    public Byte getIsVisit() {
        return isVisit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.is_visit
     *
     * @param isVisit the value for eb_system_notice_admin.is_visit
     *
     * @mbg.generated
     */
    public void setIsVisit(Byte isVisit) {
        this.isVisit = isVisit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.visit_time
     *
     * @return the value of eb_system_notice_admin.visit_time
     *
     * @mbg.generated
     */
    public Integer getVisitTime() {
        return visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.visit_time
     *
     * @param visitTime the value for eb_system_notice_admin.visit_time
     *
     * @mbg.generated
     */
    public void setVisitTime(Integer visitTime) {
        this.visitTime = visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.add_time
     *
     * @return the value of eb_system_notice_admin.add_time
     *
     * @mbg.generated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.add_time
     *
     * @param addTime the value for eb_system_notice_admin.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.ctime
     *
     * @return the value of eb_system_notice_admin.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.ctime
     *
     * @param ctime the value for eb_system_notice_admin.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_notice_admin.table_data
     *
     * @return the value of eb_system_notice_admin.table_data
     *
     * @mbg.generated
     */
    public String getTableData() {
        return tableData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_notice_admin.table_data
     *
     * @param tableData the value for eb_system_notice_admin.table_data
     *
     * @mbg.generated
     */
    public void setTableData(String tableData) {
        this.tableData = tableData;
    }
}