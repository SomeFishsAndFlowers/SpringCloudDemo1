package com.jwl.service;

import com.jwl.pojo.Order;

/**
 * @author jiwenlong
 */
public interface OrderService {

    /**
     * getOrderById
     * @param id id
     * @return order
     */
    Order getOrderById(int id);
}
