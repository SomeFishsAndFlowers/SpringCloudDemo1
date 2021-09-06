package com.jwl.dao;

import com.jwl.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author jiwenlong
 */
@Mapper
public interface UserMapper {

    /***
     * getUserById
     * @param id id
     * @return user
     */
    @Select("select * from user where id = #{ id }")
    User getUserById(int id);

}
