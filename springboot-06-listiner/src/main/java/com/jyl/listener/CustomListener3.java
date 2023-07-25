package com.jyl.listener;

import com.jyl.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component  // 第三种
public class CustomListener3 {

    @EventListener
    public void printApplicationEvent(CustomEvent customEvent) {
        System.out.println("CustomListener3监听到了 :"+ customEvent);
    }
}
