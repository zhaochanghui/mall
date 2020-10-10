package com.enjoylearning.mybatis.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table eb_system_admin
 */
public class EbSystemAdmin extends BaseEntity {
    /**
     * Database Column Remarks:
     *   后台管理员表ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.id
     *
     * @mbg.generated
     */
    private Short id;

    /**
     * Database Column Remarks:
     *   后台管理员账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.account
     *
     * @mbg.generated
     */
    private String account;

    /**
     * Database Column Remarks:
     *   后台管理员密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.pwd
     *
     * @mbg.generated
     */
    private String pwd;

    /**
     * Database Column Remarks:
     *   后台管理员姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.real_name
     *
     * @mbg.generated
     */
    private String realName;

    /**
     * Database Column Remarks:
     *   后台管理员权限(menus_id)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.roles
     *
     * @mbg.generated
     */
    private String roles;

    /**
     * Database Column Remarks:
     *   后台管理员最后一次登录ip
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.last_ip
     *
     * @mbg.generated
     */
    private String lastIp;

    /**
     * Database Column Remarks:
     *   后台管理员最后一次登录时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.last_time
     *
     * @mbg.generated
     */
    private Integer lastTime;

    /**
     * Database Column Remarks:
     *   后台管理员添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.add_time
     *
     * @mbg.generated
     */
    private Integer addTime;

    /**
     * Database Column Remarks:
     *   登录次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.login_count
     *
     * @mbg.generated
     */
    private Integer loginCount;

    /**
     * Database Column Remarks:
     *   后台管理员级别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.level
     *
     * @mbg.generated
     */
    private Byte level;

    /**
     * Database Column Remarks:
     *   后台管理员状态 1有效0无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.is_del
     *
     * @mbg.generated
     */
    private Boolean isDel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_admin.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.id
     *
     * @return the value of eb_system_admin.id
     *
     * @mbg.generated
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.id
     *
     * @param id the value for eb_system_admin.id
     *
     * @mbg.generated
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.account
     *
     * @return the value of eb_system_admin.account
     *
     * @mbg.generated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.account
     *
     * @param account the value for eb_system_admin.account
     *
     * @mbg.generated
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.pwd
     *
     * @return the value of eb_system_admin.pwd
     *
     * @mbg.generated
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.pwd
     *
     * @param pwd the value for eb_system_admin.pwd
     *
     * @mbg.generated
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.real_name
     *
     * @return the value of eb_system_admin.real_name
     *
     * @mbg.generated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.real_name
     *
     * @param realName the value for eb_system_admin.real_name
     *
     * @mbg.generated
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.roles
     *
     * @return the value of eb_system_admin.roles
     *
     * @mbg.generated
     */
    public String getRoles() {
        return roles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.roles
     *
     * @param roles the value for eb_system_admin.roles
     *
     * @mbg.generated
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.last_ip
     *
     * @return the value of eb_system_admin.last_ip
     *
     * @mbg.generated
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.last_ip
     *
     * @param lastIp the value for eb_system_admin.last_ip
     *
     * @mbg.generated
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.last_time
     *
     * @return the value of eb_system_admin.last_time
     *
     * @mbg.generated
     */
    public Integer getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.last_time
     *
     * @param lastTime the value for eb_system_admin.last_time
     *
     * @mbg.generated
     */
    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.add_time
     *
     * @return the value of eb_system_admin.add_time
     *
     * @mbg.generated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.add_time
     *
     * @param addTime the value for eb_system_admin.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.login_count
     *
     * @return the value of eb_system_admin.login_count
     *
     * @mbg.generated
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.login_count
     *
     * @param loginCount the value for eb_system_admin.login_count
     *
     * @mbg.generated
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.level
     *
     * @return the value of eb_system_admin.level
     *
     * @mbg.generated
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.level
     *
     * @param level the value for eb_system_admin.level
     *
     * @mbg.generated
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.status
     *
     * @return the value of eb_system_admin.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.status
     *
     * @param status the value for eb_system_admin.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.is_del
     *
     * @return the value of eb_system_admin.is_del
     *
     * @mbg.generated
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.is_del
     *
     * @param isDel the value for eb_system_admin.is_del
     *
     * @mbg.generated
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_admin.ctime
     *
     * @return the value of eb_system_admin.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_admin.ctime
     *
     * @param ctime the value for eb_system_admin.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}