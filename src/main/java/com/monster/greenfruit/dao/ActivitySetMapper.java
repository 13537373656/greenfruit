package com.monster.greenfruit.dao;

import com.monster.greenfruit.pojo.domain.ActivitySet;

import java.util.List;

public interface ActivitySetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_set
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_set
     *
     * @mbggenerated
     */
    int insert(ActivitySet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_set
     *
     * @mbggenerated
     */
    ActivitySet selectByPrimaryKey(Long adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_set
     *
     * @mbggenerated
     */
    List<ActivitySet> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_set
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivitySet record);


    int countActivitySet();
}