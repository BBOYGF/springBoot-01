package com.learn.controller;

import com.learn.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    User user;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(user.toString());
        return user.toString();
    }
}
