package com.jwl.feign.client;


import com.jwl.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jiwenlong
 */
@FeignClient("userService")
public interface UserServiceHttpClient {

    /**
     * getUserById
     * @param id id
     * @return user
     */
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") Integer id);

}
