package com.monster.greenfruit.dao;

import com.monster.greenfruit.pojo.domain.OrderInspector;
import java.util.List;

public interface OrderInspectorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_inspector
     *
     * @mbggenerated
     */
    int insert(OrderInspector record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_inspector
     *
     * @mbggenerated
     */
    List<OrderInspector> selectAll();
}