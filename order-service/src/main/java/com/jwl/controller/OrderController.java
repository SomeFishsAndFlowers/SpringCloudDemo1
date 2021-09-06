package com.jwl.controller;

import com.jwl.pojo.Order;
import com.jwl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiwenlong
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    OrderService orderService;


    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    Order getOrderById(@PathVariable("id") Integer id) {
        return orderService.getOrderById(id);
    }
}
