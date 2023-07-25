package com.jyl.listener;

import com.jyl.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component  // 第二种
public class CustomListener2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("CustomListener2监听到了 :"+ customEvent);
    }
}
