package com.jyl.controller;


import com.jyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;
//    //返回页面的路径
//    private String path = "";
    @GetMapping
    public String list(Model model){
        System.out.println("hello");
        model.addAttribute("list",userService.list());
        return "list";
    }


}
