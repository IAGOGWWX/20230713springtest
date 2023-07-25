package com.jyl.controller;


import com.jyl.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;


@RestController
public class TestController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User test0(Model model){
        User user = new User();
        user.setUid(8888);
        user.setUname("JIANG");
        model.addAttribute("user",user);
        return user;
    }
}
