package com.jyl.controller;


import com.jyl.bean.User;
import com.jyl.configuration.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {
    @Autowired
    private UserConfig userConfig;

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;
    @RequestMapping(value = "/getUser01" , method = RequestMethod.GET)
    @ResponseBody
    public User getUser(){
        User user = new User();
        user.setUid(userConfig.getUid());
        user.setUname(userConfig.getUname());

        return user;
    }

    @RequestMapping("/jasypt")
    @ResponseBody
    public String jasypt(){

        System.out.println("username="+username);
        System.out.println("password="+password);
        return ""+username+"--"+password;//root--123456
    }
}
