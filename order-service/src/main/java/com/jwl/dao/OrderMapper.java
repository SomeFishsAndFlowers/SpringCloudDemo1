package com.jwl.dao;

import com.jwl.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author jiwenlong
 */
@Mapper
public interface OrderMapper {
    /**
     * getOrderById
     * @param id id
     * @return order
     */
    @Select("select * from `order` where id = #{ id }")
    Order getOrderById(int id);

}
