package com.jyl.listener;

import com.jyl.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

 // 第四种
public class CustomListener4 implements ApplicationListener<CustomEvent> {
     @Override
     public void onApplicationEvent(CustomEvent customEvent) {
         System.out.println("CustomListener4监听到了 :" + customEvent);
     }
 }
