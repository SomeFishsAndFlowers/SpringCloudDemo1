package com.jwl.service.impl;

import com.jwl.dao.UserMapper;
import com.jwl.pojo.User;
import com.jwl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiwenlong
 */
@Service
public class UserServiceImpl implements UserService {


    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
