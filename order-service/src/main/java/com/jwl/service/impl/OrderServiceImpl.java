package com.jwl.service.impl;

import com.jwl.dao.OrderMapper;
import com.jwl.feign.client.UserServiceHttpClient;
import com.jwl.feign.pojo.User;
import com.jwl.pojo.Order;
import com.jwl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiwenlong
 */
@Service
public class OrderServiceImpl implements OrderService {

    OrderMapper orderMapper;

//    RestTemplate restTemplate;

    UserServiceHttpClient userServiceHttpClient;

    @Autowired
    public void setUserServiceHttpClient(UserServiceHttpClient userServiceHttpClient) {
        this.userServiceHttpClient = userServiceHttpClient;
    }

//    @Autowired
//    public void setRestTemplate(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }


    @Autowired
    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

//    @Override
//    public Order getOrderById(int id) {
//        Order order = orderMapper.getOrderById(id);
//        String url = "http://userService/user/" + order.getUserId();
//        User user = restTemplate.getForObject(url, User.class);
//        order.setUser(user);
//        return order;
//    }

    @Override
    public Order getOrderById(int id) {
        Order order = orderMapper.getOrderById(id);
        User user = userServiceHttpClient.getUserById(order.getUserId());
        order.setUser(user);
        return order;
    }
}
