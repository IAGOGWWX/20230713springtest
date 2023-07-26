package com.duing.demo03.controller;


import com.duing.demo03.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class ExtraThymeleafController {


    @GetMapping
    public String stringText(Model model){
        List<User> list = new ArrayList<>();
        User user = new User(100,"张三");
        User user1 = new User(200,"李四");
        User user2 = new User(300,"王五");
        User user3 = new User(400,"赵六");
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("user",user);
        model.addAttribute("date",new Date());

        model.addAttribute("list",list);
        model.addAttribute("msg","no");
        model.addAttribute("num","*");
        model.addAttribute("info","中国梦");

        return "/thymeleaf/welcome";

    }
}
