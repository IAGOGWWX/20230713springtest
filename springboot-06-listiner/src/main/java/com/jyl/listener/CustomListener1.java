package com.jyl.listener;

import com.jyl.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("CustomListener1监听到了 :"+ customEvent);
    }
}
