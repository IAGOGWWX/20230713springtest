package com.jyl.controller;

import com.jyl.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
    @Autowired
    private ApplicationEventPublisher publisher ;
    @RequestMapping("/event")
    public String event(){
       publisher.publishEvent(new CustomEvent(this));
        return "Success";
    }
}
