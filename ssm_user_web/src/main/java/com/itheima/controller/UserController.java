package com.itheima.controller;

import com.itheima.service.IUserService;
import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    //注入UserService
    @Autowired
    private IUserService userService;

    @RequestMapping("/doLogin")
    public ModelAndView doLogin(String username, String password) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("password", password);

        User user = userService.findAll(map);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/doRegister")
    public String doRegister(User user) {
        userService.saveUser(user);
        return "register";//失败,回到添加页面
    }
}
