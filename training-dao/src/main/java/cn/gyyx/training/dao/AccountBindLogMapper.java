package cn.gyyx.training.dao;

import cn.gyyx.training.beans.AccountBindLog;

public interface AccountBindLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bind_log
     *
     * @mbggenerated Wed Jul 27 21:34:29 CST 2016
     */
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bind_log
     *
     * @mbggenerated Wed Jul 27 21:34:29 CST 2016
     */
    int insert(AccountBindLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bind_log
     *
     * @mbggenerated Wed Jul 27 21:34:29 CST 2016
     */
    int insertSelective(AccountBindLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bind_log
     *
     * @mbggenerated Wed Jul 27 21:34:29 CST 2016
     */
    AccountBindLog selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bind_log
     *
     * @mbggenerated Wed Jul 27 21:34:29 CST 2016
     */
    int updateByPrimaryKeySelective(AccountBindLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bind_log
     *
     * @mbggenerated Wed Jul 27 21:34:29 CST 2016
     */
    int updateByPrimaryKey(AccountBindLog record);
}