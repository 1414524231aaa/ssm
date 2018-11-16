package com.itheima.service;

import  com.itheima.domain.User;

import java.util.Map;


public interface IUserService {

    User findAll(Map<String,Object> map);

    void saveUser(User user);
}
