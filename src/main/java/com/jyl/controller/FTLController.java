package com.jyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Controller 是视图层使用的注解
 * @RestController 是返回json数据时使用的注解
 */
@Controller
public class FTLController {

    @RequestMapping("/ftl")
    public String index(Model model){
        model.addAttribute("now",new Date().toString());
        System.out.println("ftl");
        return "/freemarker/index";
    }
}
