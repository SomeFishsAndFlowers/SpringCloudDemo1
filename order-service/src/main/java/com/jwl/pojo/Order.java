package com.jwl.pojo;

import com.jwl.feign.pojo.User;

/**
 * @author jiwenlong
 */
public class Order {

    private int id;
    private String location;
    private String goodName;
    private int userId;
    private User user;

    public Order() {
    }

    public Order(int id, String location, String goodName, int userId, User user) {
        this.id = id;
        this.location = location;
        this.goodName = goodName;
        this.userId = userId;
        this.user = user;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
