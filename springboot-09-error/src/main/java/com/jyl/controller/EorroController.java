package com.jyl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EorroController {



    @RequestMapping("/error404")
    public String error1(){
        return "error404";
    }

    @RequestMapping("/register404")
    public String error2(){
        return "register404";
    }

    @RequestMapping("/testError")
    public String error() throws Exception{
        throw new Exception("测试异常");
    }
}
