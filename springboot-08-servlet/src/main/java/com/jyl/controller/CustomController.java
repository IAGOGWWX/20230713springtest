package com.jyl.controller;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ServletComponentScan
public class CustomController {


    @RequestMapping("/servlet")
    public String servlet(){
        System.out.println("ServletController servlet........");

        return "Hello Servlet";
    }


}
