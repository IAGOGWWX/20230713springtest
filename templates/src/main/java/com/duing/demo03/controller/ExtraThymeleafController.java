package com.duing.demo03.controller;


import com.duing.demo03.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ExtraThymeleafController {


    @GetMapping
    public String stringText(Model model){
        User user = new User(100,"张三");
        model.addAttribute("user",user);

        return "/thymeleaf/welcome";

    }
}
