package com.duing.demo03.controller;

import com.duing.demo03.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m){
// m.addAttribute("name", "thymeleaf");
//        m.addAttribute("name", "<span style='color:red'>thymeleaf</span>");
//        System.out.println("hello");
        return "/thymeleaf/hello";
    }



    @RequestMapping("/getUser")
    public String getUser(Model m){
        User user = new User();
        user.setUid(888);
        user.setUname("张三");
        m.addAttribute("user",user);
        return "/thymeleaf/hello";
    }



}
