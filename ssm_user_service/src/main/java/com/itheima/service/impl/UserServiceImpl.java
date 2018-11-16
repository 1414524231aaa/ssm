package com.itheima.service.impl;

import com.itheima.dao.UserMapper;
import com.itheima.service.IUserService;

import  com.itheima.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 商品信息的业务类
 */
@Service("userService")
public  class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
//登陆
    @Override
    public User findAll(Map<String, Object> map) {
        return userMapper.findAll(map);
    }
//注册
    @Override
    public void saveUser(User user) {
        user.setState(1);
       userMapper.saveUser(user);
    }
}
