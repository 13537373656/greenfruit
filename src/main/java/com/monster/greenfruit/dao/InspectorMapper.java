package com.monster.greenfruit.dao;

import com.monster.greenfruit.pojo.domain.Inspector;

import java.util.List;

public interface InspectorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspector
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long inspectorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspector
     *
     * @mbggenerated
     */
    int insert(Inspector record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspector
     *
     * @mbggenerated
     */
    Inspector selectByPrimaryKey(Long inspectorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspector
     *
     * @mbggenerated
     */
    List<Inspector> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspector
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Inspector record);
}