package com.itheima.dao;

import  com.itheima.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 用户操作类
 */
@Repository("userMapper")
public interface UserMapper {



    //根据id查询用户信息
    User findAll(Map<String,Object> map);

    void saveUser(User user);
}
